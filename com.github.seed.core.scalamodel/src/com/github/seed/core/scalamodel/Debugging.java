package com.github.seed.core.scalamodel;
import static org.parboiled.common.Preconditions.checkArgNotNull;
import static org.parboiled.errors.ErrorUtils.printParseErrors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.parboiled.Parboiled;
import org.parboiled.Rule;
import org.parboiled.parserunners.ReportingParseRunner;
import org.parboiled.parserunners.TracingParseRunner;
import org.parboiled.support.ParsingResult;

/**
 * 
 */

/**
 * @author jin
 *
 */
public class Debugging implements BundleActivator {

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		String[] args = new String[]{"/opt/dev/ws/seed/com.github.seed.core.scalamodel/test_artifacts/NestPackagesTest2.scala"};//NestPackagesTest.scala
   run(args);
    }

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}
	
	
    protected static void run(String[] args) {
        System.out.println("Seed Scala Model Parser Standalone Test");
        System.out.println("---------------------------------------");

        System.out.print("Creating parser... :");
        long start = System.currentTimeMillis();
        ScalaModelScanner parser = Parboiled.createParser(ScalaModelScanner.class);
        time(start);

        start = System.currentTimeMillis();
        File baseDir = args.length == 1 ? new File(args[0]) : null;
        if (baseDir == null || !baseDir.exists()) baseDir = new File(".");
        System.out.printf("Retrieving file list from '%s'", baseDir);
        List<File> sources = recursiveGetAllJavaSources(baseDir, new ArrayList<File>());
        time(start);
        System.out.printf("Parsing all %s given Scala sources", sources.size());
        
        
        Rule rootRule = parser.CompilationUnit();
        
        long lines = 0, characters = 0, totalTimeCost =0;
        
        for (File sourceFile : sources) {
            long dontCountStart = System.currentTimeMillis();
            String sourceText = readAllText(sourceFile);

            ParsingResult<?> result = null;
            try {
            	start = System.currentTimeMillis();
                result = run(rootRule, sourceText);
                totalTimeCost += time(start);
            } catch (Exception e) {
                System.out.printf("\nException while parsing file '%s':\n%s", sourceFile, e);
                System.exit(1);
            }
            //print the generated tree
//        	ParseTreeUtils.printNodeTree(result);
            System.out.println("Parse Tree Root:"+result.parseTreeRoot);
            System.out.println("Result Value:");
            System.out.println(result.resultValue);
            if (!result.matched) {
                System.out.printf("\nParse error(s) in file '%s':\n%s", sourceFile, printParseErrors(result));
                System.exit(1);
            }
            lines += result.inputBuffer.getLineCount();
            characters += sourceText.length();
        }
        

        System.out.println("Parsing performance:");
        System.out.printf("    %6d Files -> %6.2f Files/sec\n", sources.size(), sources.size() * 1000.0 / totalTimeCost);
        System.out.printf("    %6d Lines -> %6d Lines/sec\n", lines, lines * 1000 / totalTimeCost);
        System.out.printf("    %6d Chars -> %6d Chars/sec\n", characters, characters * 1000 / totalTimeCost);
        
        
        
    }

    protected static ParsingResult<?> run(Rule rootRule, String sourceText) {
//    	return new RecoveringParseRunner(rootRule).run(sourceText);
//        return new ReportingParseRunner(rootRule).run(sourceText);
    	return new TracingParseRunner(rootRule).run(sourceText);
//    	return new BasicParseRunner(rootRule).run(sourceText);
    }

    private static long time(long start) {
        long end = System.currentTimeMillis();
        System.out.printf(" %s ms\n", end - start);
        return end - start;
    }

    private static final FileFilter fileFilter = new FileFilter() {
        public boolean accept(File file) {
            return file.isDirectory() || file.getName().endsWith(".java");
        }
    };

    private static List<File> recursiveGetAllJavaSources(File file, ArrayList<File> list) {
        if (file.isDirectory()) {
            for (File f : file.listFiles(fileFilter)) {
                recursiveGetAllJavaSources(f, list);
            }
        } else {
            list.add(file);
        }
        return list;
    }

    public static String readAllText(File file) {
        checkArgNotNull(file, "file");
        return readAllText(file, Charset.forName("UTF8"));
    }

    public static String readAllText(File file, Charset charset) {
        checkArgNotNull(file, "file");
        checkArgNotNull(charset, "charset");
        try {
            return readAllText(new FileInputStream(file), charset);
        }
        catch (FileNotFoundException e) {
            return null;
        }
    }

    public static String readAllText(InputStream stream, Charset charset) {
        checkArgNotNull(charset, "charset");
        if (stream == null) return null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset));
        StringWriter writer = new StringWriter();
        copyAll(reader, writer);
        return writer.toString();
    }

    public static void copyAll(Reader reader, Writer writer) {
        checkArgNotNull(reader, "reader");
        checkArgNotNull(writer, "writer");
        try {
            char[] data = new char[4096]; // copy in chunks of 4K
            int count;
            while ((count = reader.read(data)) >= 0) writer.write(data, 0, count);

            reader.close();
            writer.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
