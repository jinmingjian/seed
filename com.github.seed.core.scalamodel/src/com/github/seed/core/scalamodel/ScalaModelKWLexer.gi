--
-- The Scala Model KeyWord Lexer
-- The Goal for the Lexer is a single Keyword
--
%options package=com.github.seed.core.scalamodel
%options template=KeywordTemplateF.gi

%Include
    KWLexerLowerCaseMapS.gi
%End

%Export
  IF
  FOR
  ELSE
  THIS
  NULL
  NEW
  WITH
  SUPER
  CASE
  VAL
  ABSTRACT
  FINAL
  PRIVATE
  PROTECTED
  OVERRIDE
  IMPLICIT
  VAR
  DEF
  TYPE
  EXTENDS
  TRUE
  FALSE
  OBJECT
  CLASS
  IMPORT
  PACKAGE
  YIELD
  DO
  TRAIT
  SEALED
  THROW
  TRY
  CATCH
  FINALLY
  WHILE
  RETURN
  MATCH
  FORSOME
  LAZY
  RW_UNDERSCORE
  RW_COLON
  RW_ASSIGNMENT
  RW_ROCKET
  RW_IN
  RW_UPPERBOUND
  RW_VIEWBOUND
  RW_LOWERBOUND
  RW_POUND
  RW_AT 
%End

%Start
    KeyWord
%End

%Rules
    KeyWord ::= i f                      /.$setResult($_IF);./
              | f o r                    /.$setResult($_FOR);./
              | e l s e                  /.$setResult($_ELSE);./
              | t h i s                  /.$setResult($_THIS);./
              | n u l l                  /.$setResult($_NULL);./
              | n e w                    /.$setResult($_NEW);./
              | w i t h                  /.$setResult($_WITH);./
              | s u p e r                /.$setResult($_SUPER);./
              | c a s e                  /.$setResult($_CASE);./
              | v a l                    /.$setResult($_VAL);./
              | a b s t r a c t          /.$setResult($_ABSTRACT);./
              | f i n a l                /.$setResult($_FINAL);./
              | p r i v a t e            /.$setResult($_PRIVATE);./
              | p r o t e c t e d        /.$setResult($_PROTECTED);./
              | o v e r r i d e          /.$setResult($_OVERRIDE);./
              | i m p l i c i t          /.$setResult($_IMPLICIT);./
              | v a r                    /.$setResult($_VAR);./
              | d e f                    /.$setResult($_DEF);./
              | t y p e                  /.$setResult($_TYPE);./
              | e x t e n d s            /.$setResult($_EXTENDS);./
              | t r u e                  /.$setResult($_TRUE);./
              | f a l s e                /.$setResult($_FALSE);./
              | o b j e c t              /.$setResult($_OBJECT);./
              | c l a s s                /.$setResult($_CLASS);./
              | i m p o r t              /.$setResult($_IMPORT);./
              | p a c k a g e            /.$setResult($_PACKAGE);./
              | y i e l d                /.$setResult($_YIELD);./
              | d o                      /.$setResult($_DO);./
              | t r a i t                /.$setResult($_TRAIT);./
              | s e a l e d              /.$setResult($_SEALED);./
              | t h r o w                /.$setResult($_THROW);./
              | t r y                    /.$setResult($_TRY);./
              | c a t c h                /.$setResult($_CATCH);./
              | f i n a l l y            /.$setResult($_FINALLY);./
              | w h i l e                /.$setResult($_WHILE);./
              | r e t u r n              /.$setResult($_RETURN);./
              | m a t c h                /.$setResult($_MATCH);./
              | f o r s o m e            /.$setResult($_FORSOME);./
              | l a z y                  /.$setResult($_LAZY);./
              | '_'                      /.$setResult($_RW_UNDERSCORE);./
              | ':'                      /.$setResult($_RW_COLON);./
              | '='                      /.$setResult($_RW_ASSIGNMENT);./
              | '=' '>'                  /.$setResult($_RW_ROCKET);./
              | '<' '-'                  /.$setResult($_RW_IN);./
              | '<' ':'                  /.$setResult($_RW_UPPERBOUND);./
              | '<' '%'                  /.$setResult($_RW_VIEWBOUND);./
              | '>' ':'                  /.$setResult($_RW_LOWERBOUND);./
              | '#'                      /.$setResult($_RW_POUND);./
              | '@'                      /.$setResult($_RW_AT);./
%End