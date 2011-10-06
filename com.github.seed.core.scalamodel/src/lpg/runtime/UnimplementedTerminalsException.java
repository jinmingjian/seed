package lpg.runtime;
import java.util.ArrayList;

public class UnimplementedTerminalsException extends Exception
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    ArrayList<Integer> symbols;

    public UnimplementedTerminalsException(ArrayList<Integer> symbols)
    {
        this.symbols = symbols;
    }

    public ArrayList<Integer> getSymbols() { return symbols; }
}
