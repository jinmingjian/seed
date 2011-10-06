--
-- The Scala Model Lexer
--
%options package=com.github.seed.core.scalamodel
%options template=LexerTemplateF.gi
%options filter=ScalaModelKWLexer.gi
%options la=3

%Globals
%End

%Define
    $kw_lexer_class /.$ScalaModelKWLexer./
%End

%Include
    LexerBasicMapF.gi
%End

%Export

    SlComment
    MlComment
    DocComment

    IDENTIFIER
    IntegerLiteral
    FloatingPointLiteral
    DoubleLiteral
    CharacterLiteral
    StringLiteral
    SymbolLiteral
    LPAREN
    RPAREN
    LBRACE
    RBRACE
    LBRACKET
    RBRACKET
    SEMICOLON
    COLON
    COMMA
    DOT

%End

%Terminals
    CtlCharNotWS

    LF   CR   HT   FF

    a    b    c    d    e    f    g    h    i    j    k    l    m
    n    o    p    q    r    s    t    u    v    w    x    y    z
    _

    A    B    C    D    E    F    G    H    I    J    K    L    M
    N    O    P    Q    R    S    T    U    V    W    X    Y    Z

    0    1    2    3    4    5    6    7    8    9

    AfterASCII   ::= '\u0080..\ufffe'
    Space        ::= ' '
    LF           ::= NewLine
    CR           ::= Return
    HT           ::= HorizontalTab
    FF           ::= FormFeed
    DoubleQuote  ::= '"'
    SingleQuote  ::= "'"
    Percent      ::= '%'
    VerticalBar  ::= '|'
    Exclamation  ::= '!'
    AtSign       ::= '@'
    BackQuote    ::= '`'
    Tilde        ::= '~'
    Sharp        ::= '#'
    DollarSign   ::= '$'
    Ampersand    ::= '&'
    Caret        ::= '^'
    Colon        ::= ':'
    SemiColon    ::= ';'
    BackSlash    ::= '\'
    LeftBrace    ::= '{'
    RightBrace   ::= '}'
    LeftBracket  ::= '['
    RightBracket ::= ']'
    QuestionMark ::= '?'
    Comma        ::= ','
    Dot          ::= '.'
    LessThan     ::= '<'
    GreaterThan  ::= '>'
    Plus         ::= '+'
    Minus        ::= '-'
    Slash        ::= '/'
    Star         ::= '*'
    LeftParen    ::= '('
    RightParen   ::= ')'
    Equal        ::= '='

%End

%Start
    Token
%End

%Rules

    Token ::= Identifier
        /.
                    checkForKeyWord();
        ./
    Token ::= StringLiteral
        /.
                    makeToken($_StringLiteral);
        ./
    Token ::= SymbolLiteral
        /.
                    makeToken($_SymbolLiteral);
        ./
    Token ::= "'" NotSQ "'"
        /.
                    makeToken($_CharacterLiteral);
        ./
    Token ::= IntegerLiteral
        /.
                    makeToken($_IntegerLiteral);
        ./
    Token ::= FloatingPointLiteral
        /.
                    makeToken($_FloatingPointLiteral);
        ./
    Token ::= DoubleLiteral
        /.
                    makeToken($_DoubleLiteral);
        ./
    Token ::= '/' '*' Inside Stars '/'
        /.
                    if (getILexStream().getKind(getRhsFirstTokenIndex(3)) == $sym_type.Char_Star)
                         makeComment($_DocComment);
                    else makeComment($_MlComment);
        ./
    Token ::= SLC
        /.
                    makeComment($_SlComment);
        ./
    Token ::= WS -- White Space is scanned but not added to output vector
        /.
                    skipToken();
        ./

    Token ::= '('
        /.
                    makeToken($_LPAREN);
        ./

    Token ::= ')'
        /.
                    makeToken($_RPAREN);
        ./

    Token ::= ':'
        /.
                    makeToken($_COLON);
        ./
        
    Token ::= ','
        /.
                    makeToken($_COMMA);
        ./

    Token ::= ';'
        /.
                    makeToken($_SEMICOLON);
        ./

    Token ::= '.'
        /.
                    makeToken($_DOT);
        ./

    Token ::= '['
        /.
                    makeToken($_LBRACKET);
        ./

    Token ::= ']'
        /.
                    makeToken($_RBRACKET);
        ./

    Token ::= '{'
        /.
                    makeToken($_LBRACE);
        ./

    Token ::= '}'
        /.
                    makeToken($_RBRACE);
        ./


    IntegerLiteral -> Integer
                    | Integer LetterLl
                    | '0' LetterXx HexDigits
                    | '0' LetterXx HexDigits LetterLl

    DoubleLiteral -> Decimal
                   | Decimal LetterForD
                   | Decimal Exponent
                   | Decimal Exponent LetterForD
                   | Integer Exponent
                   | Integer Exponent LetterForD
                   | Integer LetterForD

    FloatingPointLiteral -> Decimal LetterForF
                          | Decimal Exponent LetterForF
                          | Integer Exponent LetterForF
                          | Integer LetterForF

    Inside ::= Inside Stars NotSlashOrStar
             | Inside '/'
             | Inside NotSlashOrStar
             | %Empty

    Stars -> '*'
           | Stars '*'

    SLC ::= '/' '/'
          | SLC NotEol

    SLBody ::= %Empty
             | SLBody NotDQ
             
    MultiLineSLBody ::= %Empty
                      | MultiLineSLBody NotDQButLF
                      
    StringLiteral ::= '"' SLBody '"'
                    | '"' '"' '"' MultiLineSLBody '"' '"' '"'

    Integer -> Digit
             | Integer Digit

    HexDigits -> HexDigit
               | HexDigits HexDigit

    Decimal ::= '.' Integer
              | Integer '.'
              | Integer '.' Integer

    Exponent ::= LetterEe Integer
               | LetterEe '-' Integer
               | LetterEe '+' Integer

    WSChar -> Space
            | LF
            | CR
            | HT
            | FF

    Letter -> LowerCaseLetter
            | UpperCaseLetter
            | _
            | '$'
            | '\u0080..\ufffe'

    LowerCaseLetter -> a | b | c | d | e | f | g | h | i | j | k | l | m |
                       n | o | p | q | r | s | t | u | v | w | x | y | z

    UpperCaseLetter -> A | B | C | D | E | F | G | H | I | J | K | L | M |
                       N | O | P | Q | R | S | T | U | V | W | X | Y | Z

    Digit -> 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9

    OctalDigit -> 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7

    a..f -> a | b | c | d | e | f | A | B | C | D | E | F

    HexDigit -> Digit
              | a..f

    OctalDigits3 -> OctalDigit
                  | OctalDigit OctalDigit
                  | OctalDigit OctalDigit OctalDigit

    LetterForD -> 'D'
                | 'd'

    LetterForF -> 'F'
                | 'f'

    LetterLl -> 'L'
              | 'l'

    LetterEe -> 'E'
              | 'e'

    LetterXx -> 'X'
              | 'x'


    WS -> WSChar
        | WS WSChar
                
    Identifier -> PlainId 
                | BackQuote IdBody BackQuote
            
    IdBody ::= %Empty
             | IdBody NotBQ
    
    PlainId ::= PlainIdBase
              | OP  
              | PlainIdBase '_' OP
    PlainIdBase ::= Letter
                  | PlainIdBase Letter
                  | PlainIdBase Digit 
              
    Opchar  ::= '+' | '-' | '!' | '@' | '~' | '='
              | '%' | '&' | '^' | '|' | '?' | '<' | '>'  
    OP      ::= Opchar 
              | '/' 
              | '\'
              | '*'
              | OP Opchar
              | OP Opchar '/'
              | OP Opchar '\'
              | OP Opchar '*'
              
    SymbolLiteral ::= SingleQuote PlainId

    SpecialNotStar -> '+' | '-' | '/' | '(' | ')' | '"' | '!' | '@' | '`' | '~' |
                      '%' | '&' | '^' | ':' | ';' | "'" | '\' | '|' | '{' | '}' |
                      '[' | ']' | '?' | ',' | '.' | '<' | '>' | '=' | '#'

    SpecialNotSlash -> '+' | '-' | -- exclude the star as well
                       '(' | ')' | '"' | '!' | '@' | '`' | '~' |
                       '%' | '&' | '^' | ':' | ';' | "'" | '\' | '|' | '{' | '}' |
                       '[' | ']' | '?' | ',' | '.' | '<' | '>' | '=' | '#'

    SpecialNotDQ -> '+' | '-' | '/' | '(' | ')' | '*' | '!' | '@' | '`' | '~' |
                    '%' | '&' | '^' | ':' | ';' | "'" | '|' | '{' | '}' |
                    '[' | ']' | '?' | ',' | '.' | '<' | '>' | '=' | '#'

    SpecialNotSQ -> '+' | '-' | '*' | '(' | ')' | '"' | '!' | '@' | '`' | '~' |
                    '%' | '&' | '^' | ':' | ';' | '/' | '|' | '{' | '}' |
                    '[' | ']' | '?' | ',' | '.' | '<' | '>' | '=' | '#'
                    
    SpecialNotBQ -> '+' | '-' | '/' | '(' | ')' | '*' | '!' | '@' | '"' | '~' |
                    '%' | '&' | '^' | ':' | ';' | "'" | '|' | '{' | '}' |
                    '[' | ']' | '?' | ',' | '.' | '<' | '>' | '=' | '#'
    NotBQ -> Letter
           | Digit
           | SpecialNotBQ
           | Space
           | HT
           | FF
           | EscapeSequence
           | '\' u HexDigit HexDigit HexDigit HexDigit
           | '\' OctalDigit
   
    NotDQButLF -> Letter
           | Digit
           | SpecialNotDQ
           | Space
           | HT
           | FF
           | LF
           | EscapeSequence
           | '\' u HexDigit HexDigit HexDigit HexDigit
           | '\' OctalDigit
    
    NotSlashOrStar -> Letter
                    | Digit
                    | SpecialNotSlash
                    | WSChar

    NotEol -> Letter
            | Digit
            | Space
            | '*'
            | SpecialNotStar
            | HT
            | FF
            | CtlCharNotWS

    NotDQ -> Letter
           | Digit
           | SpecialNotDQ
           | Space
           | HT
           | FF
           | EscapeSequence
           | '\' u HexDigit HexDigit HexDigit HexDigit
           | '\' OctalDigit

    NotSQ -> Letter
           | Digit
           | SpecialNotSQ
           | Space
           | HT
           | FF
           | EscapeSequence
           | '\' u HexDigit HexDigit HexDigit HexDigit
           | '\' OctalDigits3

    EscapeSequence ::= '\' b
                     | '\' t
                     | '\' n
                     | '\' f
                     | '\' r
                     | '\' '"'
                     | '\' "'"
                     | '\' '\'
%End