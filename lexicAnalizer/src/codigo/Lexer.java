/* The following code was generated by JFlex 1.4.3 on 21/03/23, 9:32 p. m. */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 21/03/23, 9:32 p. m. from the specification file
 * <tt>src/codigo/Lexer.flex</tt>
 */
public class Lexer {

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
    "\11\0\1\3\1\33\2\0\1\3\22\0\1\3\7\0\1\40\1\41"+
    "\1\37\1\35\1\3\1\36\1\0\1\32\12\2\3\0\1\34\3\0"+
    "\32\1\4\0\1\1\1\0\1\14\1\6\1\11\1\22\1\16\1\25"+
    "\1\24\1\26\1\10\1\1\1\31\1\7\1\20\1\23\1\21\1\4"+
    "\1\1\1\12\1\17\1\15\1\5\1\13\1\30\1\1\1\27\1\1"+
    "\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\14\2\1\5\1\6"+
    "\1\7\1\10\1\11\1\1\7\2\1\12\15\2\1\4"+
    "\1\13\1\0\20\2\1\0\7\2\1\3\5\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[77];
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
    "\0\0\0\42\0\104\0\146\0\210\0\252\0\314\0\356"+
    "\0\u0110\0\u0132\0\u0154\0\u0176\0\u0198\0\u01ba\0\u01dc\0\u01fe"+
    "\0\u0220\0\u0242\0\42\0\42\0\42\0\u0264\0\u0286\0\u02a8"+
    "\0\u02ca\0\u02ec\0\u030e\0\u0330\0\u0352\0\u0374\0\104\0\u0396"+
    "\0\u03b8\0\u03da\0\u03fc\0\u041e\0\u0440\0\u0462\0\u0484\0\u04a6"+
    "\0\u04c8\0\u04ea\0\u050c\0\u052e\0\u0550\0\42\0\u0572\0\u0594"+
    "\0\u05b6\0\u05d8\0\u05fa\0\u061c\0\u063e\0\u0660\0\u0682\0\u06a4"+
    "\0\u06c6\0\u06e8\0\u070a\0\u072c\0\u074e\0\u0770\0\u0792\0\u07b4"+
    "\0\u07d6\0\u07f8\0\u081a\0\u083c\0\u085e\0\u0880\0\u08a2\0\42"+
    "\0\u08c4\0\u08e6\0\u0908\0\u092a\0\u094c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[77];
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
    "\1\2\1\3\1\4\1\5\1\6\1\3\1\7\1\10"+
    "\1\11\1\12\1\3\1\13\1\3\1\14\1\15\1\16"+
    "\2\3\1\17\2\3\1\20\2\3\1\21\1\3\1\22"+
    "\1\5\1\23\1\24\1\25\1\26\1\27\1\2\43\0"+
    "\2\3\1\0\26\3\12\0\1\4\42\0\1\5\27\0"+
    "\1\5\7\0\2\3\1\0\1\3\1\30\4\3\1\31"+
    "\17\3\11\0\2\3\1\0\6\3\1\32\6\3\1\33"+
    "\10\3\11\0\2\3\1\0\15\3\1\34\10\3\11\0"+
    "\2\3\1\0\14\3\1\35\2\3\1\36\1\3\1\37"+
    "\4\3\11\0\2\3\1\0\10\3\1\40\4\3\1\41"+
    "\4\3\1\42\3\3\11\0\2\3\1\0\15\3\1\43"+
    "\10\3\11\0\2\3\1\0\6\3\1\44\17\3\11\0"+
    "\2\3\1\0\3\3\1\45\22\3\11\0\2\3\1\0"+
    "\11\3\1\46\12\3\1\47\1\3\11\0\2\3\1\0"+
    "\10\3\1\50\4\3\1\51\10\3\11\0\2\3\1\0"+
    "\3\3\1\52\11\3\1\53\10\3\11\0\2\3\1\0"+
    "\22\3\1\54\3\3\42\0\1\55\46\0\1\56\40\0"+
    "\1\57\4\0\2\3\1\0\2\3\1\60\23\3\11\0"+
    "\2\3\1\0\4\3\1\61\21\3\11\0\2\3\1\0"+
    "\12\3\1\62\13\3\11\0\2\3\1\0\15\3\1\63"+
    "\10\3\11\0\2\3\1\0\17\3\1\64\6\3\11\0"+
    "\2\3\1\0\1\65\25\3\11\0\2\3\1\0\11\3"+
    "\1\37\14\3\11\0\2\3\1\0\11\3\1\66\1\3"+
    "\1\67\12\3\11\0\2\3\1\0\17\3\1\70\6\3"+
    "\11\0\2\3\1\0\10\3\1\53\15\3\11\0\2\3"+
    "\1\0\4\3\1\71\21\3\11\0\2\3\1\0\23\3"+
    "\1\37\2\3\11\0\2\3\1\0\13\3\1\67\12\3"+
    "\11\0\2\3\1\0\6\3\1\72\1\3\1\73\15\3"+
    "\11\0\2\3\1\0\4\3\1\74\21\3\11\0\2\3"+
    "\1\0\11\3\1\67\14\3\11\0\2\3\1\0\1\3"+
    "\1\75\24\3\11\0\2\3\1\0\15\3\1\76\10\3"+
    "\11\0\2\3\1\0\6\3\1\37\17\3\11\0\2\3"+
    "\1\0\4\3\1\77\21\3\10\0\33\55\1\0\6\55"+
    "\2\0\1\100\40\0\2\3\1\0\3\3\1\101\22\3"+
    "\11\0\2\3\1\0\7\3\1\102\16\3\11\0\2\3"+
    "\1\0\10\3\1\103\15\3\11\0\2\3\1\0\3\3"+
    "\1\104\22\3\11\0\2\3\1\0\20\3\1\37\5\3"+
    "\11\0\2\3\1\0\15\3\1\105\10\3\11\0\2\3"+
    "\1\0\5\3\1\106\20\3\11\0\2\3\1\0\12\3"+
    "\1\37\13\3\11\0\2\3\1\0\11\3\1\107\14\3"+
    "\11\0\2\3\1\0\16\3\1\37\7\3\11\0\2\3"+
    "\1\0\4\3\1\34\21\3\11\0\2\3\1\0\11\3"+
    "\1\101\14\3\11\0\2\3\1\0\11\3\1\66\14\3"+
    "\11\0\2\3\1\0\2\3\1\77\23\3\11\0\2\3"+
    "\1\0\10\3\1\36\15\3\11\0\2\3\1\0\3\3"+
    "\1\67\22\3\12\0\1\100\36\0\1\110\1\0\2\3"+
    "\1\0\4\3\1\111\21\3\11\0\2\3\1\0\10\3"+
    "\1\50\15\3\11\0\2\3\1\0\25\3\1\37\11\0"+
    "\2\3\1\0\12\3\1\112\13\3\11\0\2\3\1\0"+
    "\6\3\1\36\17\3\11\0\2\3\1\0\22\3\1\37"+
    "\3\3\11\0\2\3\1\0\4\3\1\113\21\3\11\0"+
    "\2\3\1\0\5\3\1\37\20\3\11\0\2\3\1\0"+
    "\10\3\1\114\15\3\11\0\2\3\1\0\17\3\1\115"+
    "\6\3\11\0\2\3\1\0\17\3\1\37\6\3\11\0"+
    "\2\3\1\0\1\3\1\67\24\3\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2414];
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
    "\1\0\1\11\20\1\3\11\30\1\1\11\1\0\20\1"+
    "\1\0\7\1\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[77];
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
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
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
    while (i < 102) {
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
  public Tokens yylex() throws java.io.IOException {
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
        case 1: 
          { return ERROR;
          }
        case 12: break;
        case 5: 
          { return Division;
          }
        case 13: break;
        case 11: 
          { return Potencia;
          }
        case 14: break;
        case 7: 
          { return Suma;
          }
        case 15: break;
        case 6: 
          { return Igual;
          }
        case 16: break;
        case 10: 
          { lexeme=yytext(); return Reservadas;
          }
        case 17: break;
        case 9: 
          { return Multiplicacion;
          }
        case 18: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 19: break;
        case 8: 
          { return Resta;
          }
        case 20: break;
        case 4: 
          { /*Ignore*/
          }
        case 21: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 22: break;
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
