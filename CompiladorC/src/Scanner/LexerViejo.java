/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner;
import TokenType.*;
/**
 *
 * @author amtme
 */
class LexerViejo {
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
    "\11\0\1\1\1\22\2\0\1\1\22\0\1\1\1\57\1\23\1\0"+
    "\1\21\1\57\1\61\1\26\1\53\1\53\1\62\1\15\1\1\1\7"+
    "\1\16\1\63\1\5\3\6\4\6\2\3\1\53\1\53\1\56\1\54"+
    "\1\55\1\53\1\0\3\11\1\20\1\14\1\20\5\2\1\12\13\2"+
    "\1\10\2\2\1\53\1\0\1\53\1\57\1\2\1\0\1\30\1\36"+
    "\1\40\1\17\1\13\1\25\1\45\1\42\1\31\1\2\1\37\1\43"+
    "\1\27\1\32\1\35\1\51\1\2\1\24\1\41\1\34\1\33\1\52"+
    "\1\47\1\44\1\50\1\46\1\53\1\60\1\53\1\53\162\0\1\4"+
    "\uff0e\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\4\1\5\1\3\2\5"+
    "\2\3\1\6\1\1\2\3\1\1\14\3\7\5\2\1"+
    "\1\4\1\1\1\4\1\0\1\4\1\1\1\0\4\3"+
    "\1\7\1\0\3\3\1\0\2\3\1\7\15\3\1\0"+
    "\1\2\1\4\2\0\3\4\1\0\31\3\1\0\15\3"+
    "\1\10\11\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[129];
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
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\64\0\u0270\0\u02a4\0\u02d8"+
    "\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478"+
    "\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u057c\0\64\0\u05b0\0\u05e4"+
    "\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c\0\u071c\0\u0750"+
    "\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0"+
    "\0\u0924\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u0a28\0\u0a5c\0\u0a90"+
    "\0\u0ac4\0\234\0\u0af8\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc"+
    "\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0d68\0\u0d9c"+
    "\0\u0dd0\0\u0e04\0\u0e38\0\u0e6c\0\64\0\u0ea0\0\u0ed4\0\u0f08"+
    "\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\u100c\0\u1040\0\u1074\0\u10a8"+
    "\0\u10dc\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u1214\0\u1248"+
    "\0\u127c\0\u12b0\0\u12e4\0\u1318\0\u134c\0\u1380\0\u13b4\0\u13e8"+
    "\0\u141c\0\u1450\0\u1484\0\u14b8\0\u14ec\0\u1520\0\u1554\0\u1588"+
    "\0\u15bc\0\u15f0\0\u1624\0\u1658\0\u168c\0\u16c0\0\u16f4\0\64"+
    "\0\u1728\0\u175c\0\u1790\0\u17c4\0\u17f8\0\u182c\0\u1860\0\u1894"+
    "\0\u18c8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[129];
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
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\5\1\7"+
    "\3\4\1\10\1\4\1\11\1\12\1\13\1\4\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\4\1\25\1\26\1\4\1\27\1\4\1\30\1\31"+
    "\1\4\1\32\1\4\1\33\1\4\1\34\2\4\1\35"+
    "\1\36\1\37\1\40\1\41\1\37\1\42\1\43\1\37"+
    "\1\44\65\0\1\3\64\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\2\4\1\0\24\4"+
    "\13\0\1\46\1\5\1\0\2\5\1\0\2\46\1\47"+
    "\2\50\1\0\1\51\2\47\1\46\2\0\1\46\1\47"+
    "\1\0\14\46\1\47\7\46\13\0\1\46\1\52\1\0"+
    "\2\53\1\0\1\54\1\46\1\47\2\50\1\0\1\51"+
    "\2\47\1\46\2\0\1\46\1\47\1\0\14\46\1\47"+
    "\1\54\6\46\16\0\1\55\1\0\1\36\44\0\2\36"+
    "\10\0\2\4\1\45\2\4\1\0\5\4\2\0\2\4"+
    "\1\14\2\0\2\4\1\0\3\4\1\56\10\4\1\57"+
    "\1\60\6\4\26\0\1\36\36\0\1\36\12\0\1\51"+
    "\1\0\2\51\57\0\2\4\1\45\2\4\1\0\3\4"+
    "\1\61\1\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\6\4\1\62\15\4\13\0\2\14\1\0\2\14\1\0"+
    "\5\14\2\0\3\14\2\0\2\14\1\0\24\14\11\0"+
    "\22\63\1\0\41\63\2\0\2\4\1\45\2\4\1\0"+
    "\3\4\1\64\1\4\2\0\2\4\1\14\2\0\2\4"+
    "\1\0\24\4\13\0\2\4\1\45\2\4\1\0\5\4"+
    "\2\0\2\4\1\14\2\0\2\4\1\0\6\4\1\65"+
    "\5\4\1\66\7\4\11\0\22\67\1\0\41\67\2\0"+
    "\2\4\1\45\2\4\1\0\5\4\2\0\2\4\1\14"+
    "\2\0\2\4\1\0\1\4\1\70\22\4\13\0\2\4"+
    "\1\45\2\4\1\0\5\4\2\0\2\4\1\14\2\0"+
    "\2\4\1\0\4\4\1\71\17\4\13\0\2\4\1\45"+
    "\2\4\1\0\5\4\2\0\2\4\1\14\2\0\1\4"+
    "\1\72\1\0\3\4\1\73\20\4\13\0\2\4\1\45"+
    "\2\4\1\0\5\4\2\0\2\4\1\14\2\0\2\4"+
    "\1\0\3\4\1\74\20\4\13\0\2\4\1\45\2\4"+
    "\1\0\5\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\21\4\1\75\2\4\13\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\1\76\1\4\1\0"+
    "\24\4\13\0\2\4\1\45\2\4\1\0\5\4\2\0"+
    "\2\4\1\14\2\0\2\4\1\0\1\4\1\57\4\4"+
    "\1\77\4\4\1\100\10\4\13\0\2\4\1\45\2\4"+
    "\1\0\5\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\2\4\1\101\2\4\1\102\5\4\1\103\4\4\1\104"+
    "\3\4\13\0\2\4\1\45\2\4\1\0\5\4\2\0"+
    "\2\4\1\14\2\0\2\4\1\0\6\4\1\105\15\4"+
    "\13\0\2\4\1\45\2\4\1\0\5\4\2\0\2\4"+
    "\1\14\2\0\2\4\1\0\6\4\1\71\15\4\13\0"+
    "\2\4\1\45\2\4\1\0\5\4\2\0\2\4\1\14"+
    "\2\0\2\4\1\0\13\4\1\106\10\4\13\0\2\4"+
    "\1\45\2\4\1\0\5\4\2\0\2\4\1\14\2\0"+
    "\2\4\1\0\6\4\1\107\15\4\65\0\1\36\63\0"+
    "\1\36\1\37\62\0\1\36\1\0\1\37\61\0\1\36"+
    "\3\0\1\36\57\0\1\36\4\0\1\36\56\0\1\36"+
    "\5\0\1\110\1\111\2\0\2\45\1\0\2\45\1\0"+
    "\5\45\2\0\2\45\3\0\2\45\1\0\24\45\13\0"+
    "\1\46\5\0\5\46\2\0\3\46\2\0\2\46\1\0"+
    "\24\46\13\0\1\46\1\112\1\0\2\112\1\113\5\46"+
    "\1\113\1\0\3\46\2\0\2\46\1\0\24\46\14\0"+
    "\1\51\1\0\2\51\4\0\2\114\2\0\2\115\4\0"+
    "\1\115\40\0\1\46\1\52\1\0\2\52\1\0\3\46"+
    "\2\50\1\0\1\51\2\47\1\46\2\0\1\46\1\47"+
    "\1\0\24\46\13\0\1\46\1\52\1\0\2\53\1\0"+
    "\2\46\1\47\2\50\1\0\1\51\2\47\1\46\2\0"+
    "\1\46\1\47\1\0\14\46\1\47\7\46\13\0\1\46"+
    "\1\116\1\0\2\116\1\0\1\46\1\117\2\46\1\117"+
    "\2\0\1\46\1\117\1\46\2\0\2\46\1\0\24\46"+
    "\21\0\1\120\33\0\1\120\21\0\2\4\1\45\2\4"+
    "\1\0\5\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\4\4\1\121\17\4\13\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\2\4\1\0\12\4"+
    "\1\122\11\4\13\0\2\4\1\45\2\4\1\0\5\4"+
    "\2\0\2\4\1\14\2\0\2\4\1\0\5\4\1\123"+
    "\16\4\13\0\2\4\1\45\2\4\1\0\5\4\2\0"+
    "\2\4\1\14\2\0\1\4\1\124\1\0\24\4\13\0"+
    "\2\4\1\45\2\4\1\0\5\4\2\0\2\4\1\14"+
    "\2\0\2\4\1\0\4\4\1\125\17\4\11\0\23\63"+
    "\1\115\40\63\2\0\2\4\1\45\2\4\1\0\5\4"+
    "\2\0\2\4\1\14\2\0\2\4\1\0\5\4\1\126"+
    "\10\4\1\127\5\4\13\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\1\72\1\4\1\0"+
    "\24\4\13\0\2\4\1\45\2\4\1\0\5\4\2\0"+
    "\2\4\1\14\2\0\2\4\1\0\6\4\1\130\15\4"+
    "\11\0\26\67\1\115\35\67\2\0\2\4\1\45\2\4"+
    "\1\0\5\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\2\4\1\131\21\4\13\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\2\4\1\0\5\4"+
    "\1\132\16\4\13\0\2\4\1\45\2\4\1\0\5\4"+
    "\2\0\2\4\1\14\2\0\2\4\1\0\5\4\1\72"+
    "\16\4\13\0\2\4\1\45\2\4\1\0\5\4\2\0"+
    "\2\4\1\14\2\0\2\4\1\0\2\4\1\133\7\4"+
    "\1\134\11\4\13\0\2\4\1\45\2\4\1\0\5\4"+
    "\2\0\2\4\1\14\2\0\2\4\1\0\22\4\1\135"+
    "\1\4\13\0\2\4\1\45\2\4\1\0\3\4\1\136"+
    "\1\4\2\0\2\4\1\14\2\0\2\4\1\0\24\4"+
    "\13\0\2\4\1\45\2\4\1\0\5\4\2\0\2\4"+
    "\1\14\2\0\2\4\1\0\3\4\1\137\20\4\13\0"+
    "\2\4\1\45\2\4\1\0\5\4\2\0\2\4\1\14"+
    "\2\0\2\4\1\0\1\4\1\65\22\4\13\0\2\4"+
    "\1\45\2\4\1\0\5\4\2\0\2\4\1\14\2\0"+
    "\2\4\1\0\16\4\1\140\1\141\4\4\13\0\2\4"+
    "\1\45\2\4\1\0\5\4\2\0\2\4\1\14\2\0"+
    "\1\142\1\4\1\0\1\4\1\143\22\4\13\0\2\4"+
    "\1\45\2\4\1\0\5\4\2\0\2\4\1\14\2\0"+
    "\2\4\1\0\6\4\1\144\15\4\13\0\2\4\1\45"+
    "\2\4\1\0\5\4\2\0\2\4\1\14\2\0\2\4"+
    "\1\0\2\4\1\145\21\4\13\0\2\4\1\45\2\4"+
    "\1\0\5\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\3\4\1\146\20\4\13\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\2\4\1\0\2\4"+
    "\1\147\21\4\13\0\2\4\1\45\2\4\1\0\5\4"+
    "\2\0\2\4\1\14\2\0\2\4\1\0\2\4\1\150"+
    "\11\4\1\151\7\4\11\0\62\110\1\152\1\110\22\111"+
    "\1\0\41\111\3\0\1\112\1\0\2\112\10\0\2\115"+
    "\4\0\1\115\41\0\1\112\1\0\2\112\60\0\1\112"+
    "\1\0\2\112\1\113\5\0\1\113\51\0\1\116\1\0"+
    "\2\116\2\0\1\116\1\115\1\0\1\116\3\0\1\116"+
    "\22\0\1\115\22\0\1\46\1\116\1\0\2\116\1\0"+
    "\1\46\1\117\1\47\1\46\1\117\2\0\1\46\1\117"+
    "\1\46\2\0\2\46\1\0\14\46\1\47\7\46\14\0"+
    "\1\116\1\0\2\116\2\0\1\116\2\0\1\116\3\0"+
    "\1\116\45\0\2\4\1\45\2\4\1\0\5\4\2\0"+
    "\2\4\1\14\2\0\2\4\1\0\1\72\23\4\13\0"+
    "\2\4\1\45\2\4\1\0\3\4\1\72\1\4\2\0"+
    "\2\4\1\14\2\0\2\4\1\0\24\4\13\0\2\4"+
    "\1\45\2\4\1\0\3\4\1\153\1\4\2\0\2\4"+
    "\1\14\2\0\2\4\1\0\24\4\13\0\2\4\1\45"+
    "\2\4\1\0\5\4\2\0\2\4\1\14\2\0\2\4"+
    "\1\0\1\4\1\154\22\4\13\0\2\4\1\45\2\4"+
    "\1\0\5\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\7\4\1\147\14\4\13\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\2\4\1\0\4\4"+
    "\1\153\17\4\13\0\2\4\1\45\2\4\1\0\5\4"+
    "\2\0\2\4\1\14\2\0\2\4\1\0\2\4\1\155"+
    "\21\4\13\0\2\4\1\45\2\4\1\0\5\4\2\0"+
    "\2\4\1\14\2\0\2\4\1\0\1\4\1\73\22\4"+
    "\13\0\2\4\1\45\2\4\1\0\5\4\2\0\2\4"+
    "\1\14\2\0\2\4\1\0\3\4\1\72\20\4\13\0"+
    "\2\4\1\45\2\4\1\0\5\4\2\0\2\4\1\14"+
    "\2\0\2\4\1\0\6\4\1\72\15\4\13\0\2\4"+
    "\1\45\2\4\1\0\5\4\2\0\2\4\1\14\2\0"+
    "\2\4\1\0\6\4\1\131\15\4\13\0\2\4\1\45"+
    "\2\4\1\0\5\4\2\0\2\4\1\14\2\0\2\4"+
    "\1\0\2\4\1\156\21\4\13\0\2\4\1\45\2\4"+
    "\1\0\3\4\1\157\1\4\2\0\2\4\1\14\2\0"+
    "\2\4\1\0\24\4\13\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\2\4\1\0\1\4"+
    "\1\160\22\4\13\0\2\4\1\45\2\4\1\0\5\4"+
    "\2\0\2\4\1\14\2\0\2\4\1\0\5\4\1\161"+
    "\4\4\1\73\11\4\13\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\2\4\1\0\3\4"+
    "\1\162\20\4\13\0\2\4\1\45\2\4\1\0\3\4"+
    "\1\163\1\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\24\4\13\0\2\4\1\45\2\4\1\0\5\4\2\0"+
    "\2\4\1\14\2\0\2\4\1\0\4\4\1\164\17\4"+
    "\13\0\2\4\1\45\2\4\1\0\5\4\2\0\2\4"+
    "\1\14\2\0\2\4\1\0\5\4\1\165\16\4\13\0"+
    "\2\4\1\45\2\4\1\0\5\4\2\0\2\4\1\14"+
    "\2\0\1\73\1\4\1\0\24\4\13\0\2\4\1\45"+
    "\2\4\1\0\5\4\2\0\2\4\1\14\2\0\2\4"+
    "\1\0\5\4\1\166\16\4\13\0\2\4\1\45\2\4"+
    "\1\0\5\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\16\4\1\72\5\4\13\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\2\4\1\0\14\4"+
    "\1\122\7\4\13\0\2\4\1\45\2\4\1\0\5\4"+
    "\2\0\1\72\1\4\1\14\2\0\2\4\1\0\24\4"+
    "\13\0\2\4\1\45\2\4\1\0\5\4\2\0\2\4"+
    "\1\14\2\0\2\4\1\0\1\4\1\167\22\4\11\0"+
    "\62\110\1\152\1\170\2\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\1\131\1\4\1\0"+
    "\24\4\13\0\2\4\1\45\2\4\1\0\5\4\2\0"+
    "\2\4\1\14\2\0\2\4\1\0\4\4\1\171\17\4"+
    "\13\0\2\4\1\45\2\4\1\0\5\4\2\0\2\4"+
    "\1\14\2\0\2\4\1\0\12\4\1\172\11\4\13\0"+
    "\2\4\1\45\2\4\1\0\5\4\2\0\2\4\1\14"+
    "\2\0\2\4\1\0\16\4\1\140\5\4\13\0\2\4"+
    "\1\45\2\4\1\0\5\4\2\0\1\173\1\4\1\14"+
    "\2\0\2\4\1\0\24\4\13\0\2\4\1\45\2\4"+
    "\1\0\5\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\10\4\1\72\13\4\13\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\2\4\1\0\2\4"+
    "\1\174\21\4\13\0\2\4\1\45\2\4\1\0\3\4"+
    "\1\150\1\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\24\4\13\0\2\4\1\45\2\4\1\0\5\4\2\0"+
    "\2\4\1\14\2\0\2\4\1\0\6\4\1\175\15\4"+
    "\13\0\2\4\1\45\2\4\1\0\5\4\2\0\2\4"+
    "\1\14\2\0\2\4\1\0\11\4\1\73\12\4\13\0"+
    "\2\4\1\45\2\4\1\0\5\4\2\0\2\4\1\14"+
    "\2\0\2\4\1\0\2\4\1\176\21\4\13\0\2\4"+
    "\1\45\2\4\1\0\5\4\2\0\2\4\1\14\2\0"+
    "\2\4\1\0\11\4\1\177\12\4\13\0\2\4\1\45"+
    "\2\4\1\0\5\4\2\0\2\4\1\14\2\0\2\4"+
    "\1\0\5\4\1\106\16\4\13\0\2\4\1\45\2\4"+
    "\1\0\5\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\14\4\1\73\7\4\13\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\2\4\1\0\5\4"+
    "\1\200\16\4\13\0\2\4\1\45\2\4\1\0\3\4"+
    "\1\175\1\4\2\0\2\4\1\14\2\0\2\4\1\0"+
    "\24\4\13\0\2\4\1\45\2\4\1\0\5\4\2\0"+
    "\2\4\1\14\2\0\2\4\1\0\3\4\1\201\20\4"+
    "\13\0\2\4\1\45\2\4\1\0\5\4\2\0\2\4"+
    "\1\14\2\0\1\4\1\72\1\0\24\4\13\0\2\4"+
    "\1\45\2\4\1\0\5\4\2\0\2\4\1\14\2\0"+
    "\2\4\1\0\11\4\1\72\12\4\13\0\2\4\1\45"+
    "\2\4\1\0\5\4\2\0\2\4\1\14\2\0\2\4"+
    "\1\0\13\4\1\72\10\4\13\0\2\4\1\45\2\4"+
    "\1\0\3\4\1\65\1\4\2\0\2\4\1\14\2\0"+
    "\2\4\1\0\24\4\13\0\2\4\1\45\2\4\1\0"+
    "\5\4\2\0\2\4\1\14\2\0\2\4\1\0\4\4"+
    "\1\122\17\4\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6396];
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
    "\1\0\1\11\12\1\1\11\20\1\1\11\13\1\1\0"+
    "\2\1\1\0\5\1\1\0\3\1\1\0\20\1\1\0"+
    "\2\1\2\0\1\11\2\1\1\0\31\1\1\0\15\1"+
    "\1\11\11\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[129];
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
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerViejo(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerViejo(java.io.InputStream in) {
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
    while (i < 162) {
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
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
        case 2: 
          { /*Ignore*/
          }
        case 9: break;
        case 3: 
          { return new Identificador(yyline,yytext());
          }
        case 10: break;
        case 8: 
          { System.out.println("Bloque de comentarios");
          }
        case 11: break;
        case 5: 
          { return new Operador(yyline,yytext());
          }
        case 12: break;
        case 1: 
          { return new ErrorLexico(yyline,yytext());
          }
        case 13: break;
        case 4: 
          { return new Literal(yyline,yytext());
          }
        case 14: break;
        case 7: 
          { return new PalabraReservada(yyline,yytext());
          }
        case 15: break;
        case 6: 
          { yyline++;
          }
        case 16: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }
}
