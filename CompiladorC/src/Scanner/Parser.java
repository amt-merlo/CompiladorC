/* The following code was generated by JFlex 1.4.3 on 1/11/22 19:10 */

package Scanner;
import java_cup.runtime.Symbol;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 1/11/22 19:10 from the specification file
 * <tt>C:/Users/amtme/Documents/GitHub/CompiladorC/CompiladorC/src/Scanner/LexerCup.flex</tt>
 */
public class Parser implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\0\1\1\1\1\22\0\1\1\1\30\1\14"+
    "\1\0\1\3\1\31\1\33\1\13\1\20\1\21\1\17\1\25\1\61"+
    "\1\7\1\0\1\16\1\4\3\6\4\6\2\5\1\34\1\60\1\27"+
    "\1\26\1\27\2\0\6\11\5\3\1\12\13\3\1\10\2\3\1\62"+
    "\1\0\1\63\1\0\1\3\1\0\1\37\1\45\1\47\1\40\1\36"+
    "\1\15\1\55\1\51\1\42\1\3\1\46\1\54\1\57\1\44\1\52"+
    "\2\3\1\35\1\50\1\43\1\53\1\56\1\41\1\10\2\3\1\22"+
    "\1\32\1\23\1\24\162\0\1\0\uff0e\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\4\1\5\2\1\1\3"+
    "\2\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\2\1\1\20\13\3\1\21\1\22\1\23"+
    "\1\24\1\0\1\4\1\25\1\4\2\0\2\4\3\0"+
    "\1\3\1\2\2\0\1\16\1\26\1\27\3\3\1\30"+
    "\2\3\1\31\12\3\2\0\2\25\1\0\1\4\1\32"+
    "\1\33\1\34\4\0\6\3\1\35\11\3\1\0\1\25"+
    "\1\4\1\36\2\0\1\25\1\0\1\37\1\3\1\40"+
    "\4\3\1\41\1\42\4\3\1\43\1\44\1\45\1\25"+
    "\1\0\2\3\1\46\1\47\1\50\1\3\1\51\1\3"+
    "\1\52\1\0\1\53\2\3\1\54\1\55\1\3\1\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[146];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\64\0\u023c\0\64\0\64\0\64"+
    "\0\64\0\u0270\0\u02a4\0\u02a4\0\u02a4\0\u02d8\0\u030c\0\64"+
    "\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478\0\u04ac"+
    "\0\u04e0\0\u0514\0\u0548\0\64\0\64\0\64\0\64\0\u057c"+
    "\0\u05b0\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c"+
    "\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\64\0\64"+
    "\0\64\0\u0888\0\u08bc\0\u08f0\0\234\0\u0924\0\u0958\0\234"+
    "\0\u098c\0\u09c0\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8"+
    "\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\u06b4\0\u0c30\0\u0c64"+
    "\0\64\0\64\0\234\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0d68"+
    "\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38\0\u0e6c\0\234\0\u0ea0\0\u0ed4"+
    "\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\u100c\0\u1040\0\u1074"+
    "\0\u10a8\0\u10dc\0\64\0\u1110\0\u1144\0\64\0\u1178\0\234"+
    "\0\u11ac\0\234\0\u11e0\0\u1214\0\u1248\0\u127c\0\234\0\234"+
    "\0\u12b0\0\u12e4\0\u1318\0\u134c\0\234\0\234\0\234\0\u1380"+
    "\0\u13b4\0\u13e8\0\u141c\0\234\0\234\0\234\0\u1450\0\234"+
    "\0\u1484\0\234\0\u14b8\0\234\0\u14ec\0\u1520\0\234\0\234"+
    "\0\u1554\0\234";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[146];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\2\6\1\7\3\4\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\14\1\26\1\27"+
    "\1\30\1\31\1\32\1\4\1\33\1\34\1\35\2\4"+
    "\1\36\1\4\1\37\1\40\3\4\1\41\1\4\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\65\0\2\3\64\0"+
    "\4\4\1\50\3\4\2\0\1\4\17\0\23\4\10\0"+
    "\1\51\1\52\1\53\1\54\1\55\1\0\1\56\41\0"+
    "\1\56\13\0\1\57\2\6\1\54\2\0\1\56\41\0"+
    "\1\56\13\0\1\60\2\0\1\21\54\0\2\61\1\0"+
    "\61\61\2\62\1\0\61\62\3\0\4\4\1\50\3\4"+
    "\2\0\1\4\17\0\15\4\1\63\5\4\22\0\1\64"+
    "\1\65\53\0\1\66\101\0\1\21\64\0\1\67\67\0"+
    "\1\70\64\0\1\71\33\0\4\4\1\50\3\4\2\0"+
    "\1\4\17\0\1\4\1\72\21\4\7\0\4\4\1\50"+
    "\3\4\2\0\1\4\17\0\17\4\1\73\3\4\7\0"+
    "\4\4\1\50\3\4\2\0\1\4\17\0\1\4\1\74"+
    "\13\4\1\75\5\4\7\0\4\4\1\50\3\4\2\0"+
    "\1\4\17\0\1\76\13\4\1\77\6\4\7\0\4\4"+
    "\1\50\3\4\2\0\1\100\17\0\7\4\1\101\13\4"+
    "\7\0\4\4\1\50\3\4\2\0\1\4\17\0\1\102"+
    "\22\4\7\0\4\4\1\50\3\4\2\0\1\4\17\0"+
    "\2\4\1\103\11\4\1\104\1\105\5\4\7\0\4\4"+
    "\1\50\3\4\2\0\1\4\17\0\4\4\1\106\7\4"+
    "\1\107\6\4\7\0\4\4\1\50\3\4\2\0\1\4"+
    "\17\0\15\4\1\110\5\4\7\0\4\4\1\50\3\4"+
    "\2\0\1\4\17\0\15\4\1\111\5\4\7\0\4\4"+
    "\1\50\3\4\2\0\1\4\17\0\2\4\1\112\20\4"+
    "\10\0\1\113\63\0\1\51\1\52\1\53\1\54\1\114"+
    "\1\0\1\56\41\0\1\56\13\0\1\115\2\52\1\54"+
    "\2\0\1\116\41\0\1\116\13\0\1\51\1\52\1\53"+
    "\1\54\2\0\1\56\41\0\1\56\13\0\1\117\63\0"+
    "\3\120\2\0\1\120\56\0\1\115\2\52\1\54\60\0"+
    "\1\57\2\6\1\54\1\114\1\0\1\56\41\0\1\56"+
    "\17\0\1\55\53\0\13\61\1\121\50\61\14\62\1\122"+
    "\47\62\3\0\4\4\1\50\3\4\2\0\1\4\17\0"+
    "\1\123\22\4\4\0\2\64\1\0\61\64\17\65\1\124"+
    "\44\65\4\0\1\125\2\126\1\127\57\0\4\4\1\50"+
    "\3\4\2\0\1\4\17\0\2\4\1\130\3\4\1\131"+
    "\14\4\7\0\4\4\1\50\3\4\2\0\1\4\17\0"+
    "\13\4\1\132\7\4\7\0\4\4\1\50\3\4\2\0"+
    "\1\133\17\0\23\4\7\0\4\4\1\50\3\4\2\0"+
    "\1\4\17\0\5\4\1\134\15\4\7\0\4\4\1\50"+
    "\3\4\2\0\1\4\17\0\5\4\1\135\15\4\7\0"+
    "\4\4\1\50\3\4\2\0\1\4\17\0\6\4\1\136"+
    "\14\4\7\0\4\4\1\50\3\4\2\0\1\4\17\0"+
    "\1\4\1\137\21\4\7\0\4\4\1\50\3\4\2\0"+
    "\1\4\17\0\13\4\1\140\7\4\7\0\4\4\1\50"+
    "\3\4\2\0\1\4\17\0\2\4\1\141\20\4\7\0"+
    "\4\4\1\50\3\4\2\0\1\4\17\0\7\4\1\142"+
    "\13\4\7\0\4\4\1\50\3\4\2\0\1\4\17\0"+
    "\5\4\1\143\15\4\7\0\4\4\1\50\3\4\2\0"+
    "\1\4\17\0\15\4\1\144\5\4\7\0\4\4\1\50"+
    "\3\4\2\0\1\4\17\0\7\4\1\145\13\4\7\0"+
    "\4\4\1\50\3\4\2\0\1\4\17\0\5\4\1\146"+
    "\15\4\7\0\4\4\1\50\3\4\2\0\1\4\17\0"+
    "\5\4\1\147\15\4\14\0\1\150\57\0\3\151\2\0"+
    "\1\151\56\0\1\115\2\52\1\54\1\114\1\0\1\116"+
    "\41\0\1\116\17\0\1\114\57\0\1\152\2\120\1\54"+
    "\1\0\1\120\1\56\41\0\1\56\7\0\16\65\1\153"+
    "\1\124\44\65\4\0\1\125\2\126\1\127\1\154\1\0"+
    "\1\155\6\0\1\156\32\0\1\155\13\0\1\125\2\126"+
    "\1\127\2\0\1\155\6\0\1\156\32\0\1\155\13\0"+
    "\1\157\62\0\4\4\1\50\3\4\2\0\1\4\17\0"+
    "\3\4\1\160\17\4\7\0\4\4\1\50\3\4\2\0"+
    "\1\4\17\0\16\4\1\161\4\4\7\0\4\4\1\50"+
    "\3\4\2\0\1\4\17\0\1\4\1\162\21\4\7\0"+
    "\4\4\1\50\3\4\2\0\1\4\17\0\2\4\1\163"+
    "\20\4\7\0\4\4\1\50\3\4\2\0\1\4\17\0"+
    "\6\4\1\164\14\4\7\0\4\4\1\50\3\4\2\0"+
    "\1\4\17\0\17\4\1\165\3\4\7\0\4\4\1\50"+
    "\3\4\2\0\1\4\17\0\2\4\1\166\20\4\7\0"+
    "\4\4\1\50\3\4\2\0\1\4\17\0\1\4\1\167"+
    "\21\4\7\0\4\4\1\50\3\4\2\0\1\4\17\0"+
    "\1\170\22\4\7\0\4\4\1\50\3\4\2\0\1\4"+
    "\17\0\6\4\1\171\4\4\1\172\7\4\7\0\4\4"+
    "\1\50\3\4\2\0\1\4\17\0\6\4\1\173\14\4"+
    "\7\0\4\4\1\50\3\4\2\0\1\4\17\0\1\174"+
    "\22\4\7\0\4\4\1\50\3\4\2\0\1\4\17\0"+
    "\20\4\1\175\2\4\7\0\4\4\1\50\3\4\2\0"+
    "\1\4\17\0\3\4\1\176\17\4\7\0\4\4\1\50"+
    "\3\4\2\0\1\4\17\0\7\4\1\177\13\4\10\0"+
    "\3\4\2\0\1\4\56\0\1\200\2\151\1\54\1\0"+
    "\1\151\1\116\41\0\1\116\13\0\1\152\2\120\1\54"+
    "\1\114\1\120\1\56\41\0\1\56\13\0\3\201\2\0"+
    "\1\201\56\0\1\125\2\126\1\127\11\0\1\156\52\0"+
    "\1\154\56\0\4\4\1\50\3\4\2\0\1\4\17\0"+
    "\1\202\22\4\7\0\4\4\1\50\3\4\2\0\1\4"+
    "\17\0\16\4\1\203\4\4\7\0\4\4\1\50\3\4"+
    "\2\0\1\4\17\0\1\4\1\204\21\4\7\0\4\4"+
    "\1\50\3\4\2\0\1\4\17\0\1\4\1\205\21\4"+
    "\7\0\4\4\1\50\3\4\2\0\1\4\17\0\11\4"+
    "\1\206\11\4\7\0\4\4\1\50\3\4\2\0\1\4"+
    "\17\0\5\4\1\207\15\4\7\0\4\4\1\50\3\4"+
    "\2\0\1\4\17\0\6\4\1\210\14\4\7\0\4\4"+
    "\1\50\3\4\2\0\1\4\17\0\12\4\1\211\10\4"+
    "\7\0\4\4\1\50\3\4\2\0\1\4\17\0\6\4"+
    "\1\212\14\4\10\0\1\200\2\151\1\54\1\114\1\151"+
    "\1\116\41\0\1\116\13\0\1\213\2\201\1\127\1\0"+
    "\1\201\1\155\6\0\1\156\32\0\1\155\12\0\4\4"+
    "\1\50\3\4\2\0\1\4\17\0\7\4\1\214\13\4"+
    "\7\0\4\4\1\50\3\4\2\0\1\4\17\0\17\4"+
    "\1\215\3\4\7\0\4\4\1\50\3\4\2\0\1\4"+
    "\17\0\7\4\1\216\13\4\7\0\4\4\1\50\3\4"+
    "\2\0\1\4\17\0\14\4\1\217\6\4\10\0\1\213"+
    "\2\201\1\127\1\154\1\201\1\155\6\0\1\156\32\0"+
    "\1\155\12\0\4\4\1\50\3\4\2\0\1\4\17\0"+
    "\6\4\1\220\14\4\7\0\4\4\1\50\3\4\2\0"+
    "\1\4\17\0\16\4\1\221\4\4\7\0\4\4\1\50"+
    "\3\4\2\0\1\4\17\0\1\4\1\222\21\4\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5512];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\11\1\1\11\1\1\4\11\6\1\1\11"+
    "\13\1\4\11\1\0\3\1\2\0\2\1\3\0\2\1"+
    "\2\0\3\11\21\1\2\0\2\1\1\0\1\1\2\11"+
    "\1\1\4\0\20\1\1\0\2\1\1\11\2\0\1\11"+
    "\1\0\21\1\1\0\11\1\1\0\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[146];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Parser(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Parser(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 152) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 43: 
          { return new Symbol(sym.Return,yycolumn,yyline ,yytext());
          }
        case 47: break;
        case 6: 
          { return new Symbol(sym.Timesslash,yycolumn,yyline ,yytext());
          }
        case 48: break;
        case 20: 
          { return new Symbol(sym.Corchete_c,yycolumn,yyline ,yytext());
          }
        case 49: break;
        case 25: 
          { return new Symbol(sym.If,yycolumn,yyline ,yytext());
          }
        case 50: break;
        case 38: 
          { return new Symbol(sym.Write,yycolumn,yyline ,yytext());
          }
        case 51: break;
        case 33: 
          { return new Symbol(sym.Case,yycolumn,yyline ,yytext());
          }
        case 52: break;
        case 23: 
          { return new Symbol(sym.And,yycolumn,yyline ,yytext());
          }
        case 53: break;
        case 16: 
          { return new Symbol(sym.Dos_puntos,yycolumn,yyline ,yytext());
          }
        case 54: break;
        case 37: 
          { return new Symbol(sym.Main,yycolumn,yyline ,yytext());
          }
        case 55: break;
        case 8: 
          { return new Symbol(sym.Parentesis_c,yycolumn,yyline ,yytext());
          }
        case 56: break;
        case 14: 
          { return new Symbol(sym.Relacionales,yycolumn,yyline ,yytext());
          }
        case 57: break;
        case 18: 
          { System.out.println("coma"); return new Symbol(sym.Coma,yycolumn,yyline ,yytext());
          }
        case 58: break;
        case 27: 
          { System.out.println("String"); return new Symbol(sym.Literal,yycolumn,yyline ,yytext());
          }
        case 59: break;
        case 35: 
          { return new Symbol(sym.Long,yycolumn,yyline ,yytext());
          }
        case 60: break;
        case 13: 
          { return new Symbol(sym.Asignacion,yycolumn,yyline ,yytext());
          }
        case 61: break;
        case 22: 
          { return new Symbol(sym.Or,yycolumn,yyline ,yytext());
          }
        case 62: break;
        case 17: 
          { return new Symbol(sym.Scolon,yycolumn,yyline ,yytext());
          }
        case 63: break;
        case 39: 
          { return new Symbol(sym.While,yycolumn,yyline ,yytext());
          }
        case 64: break;
        case 4: 
          { return new Symbol(sym.Literal,yycolumn,yyline ,yytext());
          }
        case 65: break;
        case 3: 
          { return new Symbol(sym.Identificador,yycolumn,yyline ,yytext());
          }
        case 66: break;
        case 21: 
          { return new Symbol(sym.Numero,yycolumn,yyline ,yytext());
          }
        case 67: break;
        case 36: 
          { return new Symbol(sym.Void,yycolumn,yyline ,yytext());
          }
        case 68: break;
        case 29: 
          { return new Symbol(sym.Int,yycolumn,yyline ,yytext());
          }
        case 69: break;
        case 9: 
          { return new Symbol(sym.Llave_a,yycolumn,yyline ,yytext());
          }
        case 70: break;
        case 40: 
          { return new Symbol(sym.Break,yycolumn,yyline ,yytext());
          }
        case 71: break;
        case 31: 
          { return new Symbol(sym.Read,yycolumn,yyline ,yytext());
          }
        case 72: break;
        case 32: 
          { return new Symbol(sym.Else,yycolumn,yyline ,yytext());
          }
        case 73: break;
        case 44: 
          { return new Symbol(sym.Switch,yycolumn,yyline ,yytext());
          }
        case 74: break;
        case 11: 
          { return new Symbol(sym.Unarios,yycolumn,yyline ,yytext());
          }
        case 75: break;
        case 19: 
          { return new Symbol(sym.Corchete_a,yycolumn,yyline ,yytext());
          }
        case 76: break;
        case 5: 
          { return new Symbol(sym.Menos,yycolumn,yyline ,yytext());
          }
        case 77: break;
        case 24: 
          { return new Symbol(sym.Do,yycolumn,yyline ,yytext());
          }
        case 78: break;
        case 42: 
          { return new Symbol(sym.Short,yycolumn,yyline ,yytext());
          }
        case 79: break;
        case 34: 
          { return new Symbol(sym.Char,yycolumn,yyline ,yytext());
          }
        case 80: break;
        case 41: 
          { return new Symbol(sym.Const,yycolumn,yyline ,yytext());
          }
        case 81: break;
        case 7: 
          { return new Symbol(sym.Parentesis_a,yycolumn,yyline ,yytext());
          }
        case 82: break;
        case 46: 
          { return new Symbol(sym.Continue,yycolumn,yyline ,yytext());
          }
        case 83: break;
        case 28: 
          { return new Symbol(sym.For,yycolumn,yyline ,yytext());
          }
        case 84: break;
        case 12: 
          { return new Symbol(sym.Mas,yycolumn,yyline ,yytext());
          }
        case 85: break;
        case 1: 
          { return new Symbol(sym.LEX_ERROR,yycolumn,yyline ,yytext());
          }
        case 86: break;
        case 15: 
          { return new Symbol(sym.Not,yycolumn,yyline ,yytext());
          }
        case 87: break;
        case 45: 
          { return new Symbol(sym.Default,yycolumn,yyline ,yytext());
          }
        case 88: break;
        case 2: 
          { /*Ignore*/
          }
        case 89: break;
        case 10: 
          { return new Symbol(sym.Llave_c,yycolumn,yyline ,yytext());
          }
        case 90: break;
        case 30: 
          { System.out.println("Bloque de comentarios");
          }
        case 91: break;
        case 26: 
          { System.out.println("char"); return new Symbol(sym.Literal,yycolumn,yyline ,yytext());
          }
        case 92: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
