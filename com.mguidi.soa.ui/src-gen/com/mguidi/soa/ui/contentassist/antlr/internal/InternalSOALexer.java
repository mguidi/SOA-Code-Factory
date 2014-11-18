package com.mguidi.soa.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSOALexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_COMMENTS=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalSOALexer() {;} 
    public InternalSOALexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSOALexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:11:7: ( '@String' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:11:9: '@String'
            {
            match("@String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:12:7: ( '@Short' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:12:9: '@Short'
            {
            match("@Short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:13:7: ( '@Integer' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:13:9: '@Integer'
            {
            match("@Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:14:7: ( '@Long' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:14:9: '@Long'
            {
            match("@Long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:15:7: ( '@Float' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:15:9: '@Float'
            {
            match("@Float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:16:7: ( '@Double' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:16:9: '@Double'
            {
            match("@Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:17:7: ( '@Boolean' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:17:9: '@Boolean'
            {
            match("@Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:18:7: ( '@Byte' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:18:9: '@Byte'
            {
            match("@Byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:19:7: ( '@Date' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:19:9: '@Date'
            {
            match("@Date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:20:7: ( '@Datetime' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:20:9: '@Datetime'
            {
            match("@Datetime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:21:7: ( '@Timestamp' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:21:9: '@Timestamp'
            {
            match("@Timestamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:22:7: ( '@Decimal' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:22:9: '@Decimal'
            {
            match("@Decimal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:23:7: ( '@applicationId' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:23:9: '@applicationId'
            {
            match("@applicationId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:24:7: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:25:7: ( '@moduleName' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:25:9: '@moduleName'
            {
            match("@moduleName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:26:7: ( '@version' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:26:9: '@version'
            {
            match("@version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:27:7: ( '.' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:27:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:28:7: ( '-' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:28:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:29:7: ( '@import' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:29:9: '@import'
            {
            match("@import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:30:7: ( '@model' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:30:9: '@model'
            {
            match("@model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:31:7: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:31:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:32:7: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:32:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:33:7: ( '@enum' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:33:9: '@enum'
            {
            match("@enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:34:7: ( '@entity' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:34:9: '@entity'
            {
            match("@entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:35:7: ( '@List' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:35:9: '@List'
            {
            match("@List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:36:7: ( '<' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:36:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:37:7: ( '>' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:37:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:38:7: ( '@service' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:38:9: '@service'
            {
            match("@service"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:39:7: ( '@exception' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:39:9: '@exception'
            {
            match("@exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:40:7: ( '@msg' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:40:9: '@msg'
            {
            match("@msg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:41:7: ( '@operation' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:41:9: '@operation'
            {
            match("@operation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:42:7: ( '@input' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:42:9: '@input'
            {
            match("@input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:43:7: ( '@output' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:43:9: '@output'
            {
            match("@output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:44:7: ( ',' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:44:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:45:7: ( '@event' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:45:9: '@event'
            {
            match("@event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_COMMENTS"
    public final void mRULE_COMMENTS() throws RecognitionException {
        try {
            int _type = RULE_COMMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4148:15: ( '#' ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | ' ' )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4148:17: '#' ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | ' ' )*
            {
            match('#'); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4148:21: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4148:21: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)==' '||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4148:54: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | ' ' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' '||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:
            	    {
            	    if ( input.LA(1)==' '||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENTS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4150:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4150:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4150:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4150:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4150:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4152:10: ( ( '0' .. '9' )+ )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4152:12: ( '0' .. '9' )+
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4152:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4152:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4154:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4154:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4154:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4154:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4154:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4154:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4154:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4154:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4154:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4154:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4154:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4156:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4156:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4156:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4156:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4158:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4158:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4158:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4158:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4158:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4158:41: ( '\\r' )? '\\n'
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4158:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4158:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4160:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4162:16: ( . )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4162:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_COMMENTS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=43;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:220: RULE_COMMENTS
                {
                mRULE_COMMENTS(); 

                }
                break;
            case 37 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:234: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:242: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:251: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:263: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:279: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:295: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1:303: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\22\10\uffff\2\22\2\uffff\3\22\65\uffff\1\112\4\uffff";
    static final String DFA14_eofS =
        "\113\uffff";
    static final String DFA14_minS =
        "\1\0\1\102\10\uffff\1\40\1\101\2\uffff\2\0\1\52\2\uffff\1\150\1\uffff\1\151\1\uffff\1\141\1\157\2\uffff\1\157\1\uffff\1\155\1\156\1\uffff\1\160\24\uffff\1\164\3\uffff\1\144\3\uffff\1\164\4\uffff\2\145\2\uffff\1\164\4\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\166\10\uffff\2\172\2\uffff\2\uffff\1\57\2\uffff\1\164\1\uffff\1\157\1\uffff\1\157\1\171\2\uffff\1\163\1\uffff\1\156\1\170\1\uffff\1\165\24\uffff\1\164\3\uffff\1\144\3\uffff\1\165\4\uffff\1\145\1\165\2\uffff\1\164\4\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\16\1\21\1\22\1\25\1\26\1\32\1\33\1\42\2\uffff\1\45\1\46\3\uffff\1\52\1\53\1\uffff\1\3\1\uffff\1\5\2\uffff\1\13\1\15\1\uffff\1\20\2\uffff\1\34\1\uffff\1\16\1\21\1\22\1\25\1\26\1\32\1\33\1\42\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\1\1\2\1\4\1\31\1\6\1\uffff\1\14\1\7\1\10\1\uffff\1\36\1\23\1\40\1\uffff\1\35\1\43\1\37\1\41\2\uffff\1\27\1\30\1\uffff\1\17\1\24\1\12\1\11";
    static final String DFA14_specialS =
        "\1\1\15\uffff\1\0\1\2\73\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\16\1\12\3\22\1\17\4\22\1\11\1\4\1\3\1\20\12\15\1\2\1\22\1\7\1\22\1\10\1\22\1\1\32\14\3\22\1\13\1\14\1\22\32\14\1\5\1\22\1\6\uff82\22",
            "\1\30\1\uffff\1\27\1\uffff\1\26\2\uffff\1\24\2\uffff\1\25\6\uffff\1\23\1\31\14\uffff\1\32\3\uffff\1\36\3\uffff\1\35\3\uffff\1\33\1\uffff\1\40\3\uffff\1\37\2\uffff\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51\40\uffff\32\51\3\uffff\2\51\1\uffff\32\51",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\0\54",
            "\0\54",
            "\1\55\4\uffff\1\56",
            "",
            "",
            "\1\61\13\uffff\1\60",
            "",
            "\1\63\5\uffff\1\62",
            "",
            "\1\65\3\uffff\1\66\11\uffff\1\64",
            "\1\67\11\uffff\1\70",
            "",
            "",
            "\1\71\3\uffff\1\72",
            "",
            "\1\73\1\74",
            "\1\75\7\uffff\1\77\1\uffff\1\76",
            "",
            "\1\100\4\uffff\1\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "",
            "",
            "",
            "\1\103",
            "",
            "",
            "",
            "\1\105\1\104",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\110\17\uffff\1\107",
            "",
            "",
            "\1\111",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_COMMENTS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_14 = input.LA(1);

                        s = -1;
                        if ( ((LA14_14>='\u0000' && LA14_14<='\uFFFF')) ) {s = 44;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='@') ) {s = 1;}

                        else if ( (LA14_0==':') ) {s = 2;}

                        else if ( (LA14_0=='.') ) {s = 3;}

                        else if ( (LA14_0=='-') ) {s = 4;}

                        else if ( (LA14_0=='{') ) {s = 5;}

                        else if ( (LA14_0=='}') ) {s = 6;}

                        else if ( (LA14_0=='<') ) {s = 7;}

                        else if ( (LA14_0=='>') ) {s = 8;}

                        else if ( (LA14_0==',') ) {s = 9;}

                        else if ( (LA14_0=='#') ) {s = 10;}

                        else if ( (LA14_0=='^') ) {s = 11;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {s = 12;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 13;}

                        else if ( (LA14_0=='\"') ) {s = 14;}

                        else if ( (LA14_0=='\'') ) {s = 15;}

                        else if ( (LA14_0=='/') ) {s = 16;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 17;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||LA14_0==';'||LA14_0=='='||LA14_0=='?'||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_15 = input.LA(1);

                        s = -1;
                        if ( ((LA14_15>='\u0000' && LA14_15<='\uFFFF')) ) {s = 44;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}