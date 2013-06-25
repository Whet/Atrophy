// $ANTLR 3.4 C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g 2013-06-25 10:34:48

	package atrophy.combat.level;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AtrophyScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDTAG", "ADD_TAG_PREFIX", "AIINIT", "BLOCK", "BOOL", "CHANGEAINODE", "COMMAND", "COMMAND_CALL", "COMMAND_CALL_PREFIX", "COMMENT", "CONTAINSFACTION", "CONVERSE", "COVER", "DIRECTORBIAS", "DOORNAMES", "EMPTY", "HASITEM", "HASWEAPON", "IDENT", "INIT", "INT", "ISALIVE", "ISFACTION", "ISINVESTIGATED", "ISNAME", "KILLUNIT", "LINE", "LOADMAP", "LOCKDOOR", "MAPSIZE", "MAPSPAWNS", "MULTILINE_COMMENT", "NEGATION", "OPENINGLINE", "PORTAL", "REMOVESAFEROOM", "REMOVETAG", "REMOVEUNIT", "REMOVE_TAG_PREFIX", "SAFEROOM", "SPAWNUNIT", "STAGELIST", "STASH", "TALK", "TALKMAP", "TALKPARENT", "TALKSTAGE", "TELEDEST", "TELEPORT", "TERRITORY", "TEXTURE", "TEXTUREBLOCK", "TRIGGER", "TRIGGERCOND", "TRIGGEREFFECT", "TRIGGERTYPE", "UNLOCKDOOR", "UPDATETALK", "UPDATE_TREE_PREFIX", "VAR", "WS", "XLIST", "YLIST", "ZONE", "'!='", "'\"'", "'#'", "'('", "')'", "'+'", "','", "'-'", "'::'", "'<'", "'<='", "'=='", "'>'", "'>='", "'BLOCK'", "'COMMAND'", "'COVER'", "'INIT'", "'MAPSIZE'", "'MAPSPAWNS'", "'PORTAL'", "'STASH'", "'TALK'", "'TEXTUREBLOCK'", "'TRIGGER'", "'a:'", "'addTag:'", "'aiInit:'", "'block'", "'callCommand:'", "'changeAiNode:'", "'command'", "'containsFaction:'", "'converse'", "'cover'", "'destination'", "'directorBias:'", "'hasItem:'", "'hasWeapon:'", "'init'", "'isAlive?'", "'isFaction:'", "'isInvestigated?'", "'isName:'", "'killUnit'", "'l:'", "'line:'", "'loadMap:'", "'lockDoor'", "'mapsize'", "'mapspawns'", "'name:'", "'o:'", "'opening:'", "'openingLine:'", "'p:'", "'parent:'", "'portal'", "'removeSaferoom'", "'removeTag:'", "'removeUnit'", "'s:'", "'saferoom'", "'spawnUnit'", "'stage:'", "'stages:'", "'stash'", "'talk'", "'tc:'", "'te'", "'teleport'", "'territory:'", "'textureBlock'", "'textureblock'", "'trigger'", "'triggerCond:'", "'triggerEffect'", "'unlockDoor'", "'updateTalk:'", "'x:'", "'y:'", "'zone:'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__136=136;
    public static final int T__137=137;
    public static final int T__138=138;
    public static final int T__139=139;
    public static final int T__140=140;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__147=147;
    public static final int T__148=148;
    public static final int T__149=149;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int ADDTAG=4;
    public static final int ADD_TAG_PREFIX=5;
    public static final int AIINIT=6;
    public static final int BLOCK=7;
    public static final int BOOL=8;
    public static final int CHANGEAINODE=9;
    public static final int COMMAND=10;
    public static final int COMMAND_CALL=11;
    public static final int COMMAND_CALL_PREFIX=12;
    public static final int COMMENT=13;
    public static final int CONTAINSFACTION=14;
    public static final int CONVERSE=15;
    public static final int COVER=16;
    public static final int DIRECTORBIAS=17;
    public static final int DOORNAMES=18;
    public static final int EMPTY=19;
    public static final int HASITEM=20;
    public static final int HASWEAPON=21;
    public static final int IDENT=22;
    public static final int INIT=23;
    public static final int INT=24;
    public static final int ISALIVE=25;
    public static final int ISFACTION=26;
    public static final int ISINVESTIGATED=27;
    public static final int ISNAME=28;
    public static final int KILLUNIT=29;
    public static final int LINE=30;
    public static final int LOADMAP=31;
    public static final int LOCKDOOR=32;
    public static final int MAPSIZE=33;
    public static final int MAPSPAWNS=34;
    public static final int MULTILINE_COMMENT=35;
    public static final int NEGATION=36;
    public static final int OPENINGLINE=37;
    public static final int PORTAL=38;
    public static final int REMOVESAFEROOM=39;
    public static final int REMOVETAG=40;
    public static final int REMOVEUNIT=41;
    public static final int REMOVE_TAG_PREFIX=42;
    public static final int SAFEROOM=43;
    public static final int SPAWNUNIT=44;
    public static final int STAGELIST=45;
    public static final int STASH=46;
    public static final int TALK=47;
    public static final int TALKMAP=48;
    public static final int TALKPARENT=49;
    public static final int TALKSTAGE=50;
    public static final int TELEDEST=51;
    public static final int TELEPORT=52;
    public static final int TERRITORY=53;
    public static final int TEXTURE=54;
    public static final int TEXTUREBLOCK=55;
    public static final int TRIGGER=56;
    public static final int TRIGGERCOND=57;
    public static final int TRIGGEREFFECT=58;
    public static final int TRIGGERTYPE=59;
    public static final int UNLOCKDOOR=60;
    public static final int UPDATETALK=61;
    public static final int UPDATE_TREE_PREFIX=62;
    public static final int VAR=63;
    public static final int WS=64;
    public static final int XLIST=65;
    public static final int YLIST=66;
    public static final int ZONE=67;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AtrophyScriptParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AtrophyScriptParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AtrophyScriptParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:75:1: prog : ( command )* ( beginStatement )? EOF ;
    public final AtrophyScriptParser.prog_return prog() throws RecognitionException {
        AtrophyScriptParser.prog_return retval = new AtrophyScriptParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        AtrophyScriptParser.command_return command1 =null;

        AtrophyScriptParser.beginStatement_return beginStatement2 =null;


        CommonTree EOF3_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:75:5: ( ( command )* ( beginStatement )? EOF )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:76:5: ( command )* ( beginStatement )? EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:76:5: ( command )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 82 && LA1_0 <= 84)||(LA1_0 >= 86 && LA1_0 <= 92)||LA1_0==96||LA1_0==99||LA1_0==102||(LA1_0 >= 117 && LA1_0 <= 118)||LA1_0==125||(LA1_0 >= 134 && LA1_0 <= 135)||(LA1_0 >= 140 && LA1_0 <= 142)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:76:5: command
            	    {
            	    pushFollow(FOLLOW_command_in_prog285);
            	    command1=command();

            	    state._fsp--;

            	    adaptor.addChild(root_0, command1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:77:5: ( beginStatement )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==85||LA2_0==107) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:77:5: beginStatement
                    {
                    pushFollow(FOLLOW_beginStatement_in_prog292);
                    beginStatement2=beginStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, beginStatement2.getTree());

                    }
                    break;

            }


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog299); 
            EOF3_tree = 
            (CommonTree)adaptor.create(EOF3)
            ;
            adaptor.addChild(root_0, EOF3_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "command"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:81:1: command : ( mapSize | mapSpawns | blockDecl | portalDecl | coverDecl | stashDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl );
    public final AtrophyScriptParser.command_return command() throws RecognitionException {
        AtrophyScriptParser.command_return retval = new AtrophyScriptParser.command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.mapSize_return mapSize4 =null;

        AtrophyScriptParser.mapSpawns_return mapSpawns5 =null;

        AtrophyScriptParser.blockDecl_return blockDecl6 =null;

        AtrophyScriptParser.portalDecl_return portalDecl7 =null;

        AtrophyScriptParser.coverDecl_return coverDecl8 =null;

        AtrophyScriptParser.stashDecl_return stashDecl9 =null;

        AtrophyScriptParser.textureBlockDecl_return textureBlockDecl10 =null;

        AtrophyScriptParser.triggerDecl_return triggerDecl11 =null;

        AtrophyScriptParser.commandDecl_return commandDecl12 =null;

        AtrophyScriptParser.talkDecl_return talkDecl13 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:81:8: ( mapSize | mapSpawns | blockDecl | portalDecl | coverDecl | stashDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 86:
            case 117:
                {
                alt3=1;
                }
                break;
            case 87:
            case 118:
                {
                alt3=2;
                }
                break;
            case 82:
            case 96:
                {
                alt3=3;
                }
                break;
            case 88:
            case 125:
                {
                alt3=4;
                }
                break;
            case 84:
            case 102:
                {
                alt3=5;
                }
                break;
            case 89:
            case 134:
                {
                alt3=6;
                }
                break;
            case 91:
            case 140:
            case 141:
                {
                alt3=7;
                }
                break;
            case 92:
            case 142:
                {
                alt3=8;
                }
                break;
            case 83:
            case 99:
                {
                alt3=9;
                }
                break;
            case 90:
            case 135:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:82:4: mapSize
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSize_in_command315);
                    mapSize4=mapSize();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSize4.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:83:6: mapSpawns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSpawns_in_command322);
                    mapSpawns5=mapSpawns();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSpawns5.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:84:6: blockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_blockDecl_in_command329);
                    blockDecl6=blockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, blockDecl6.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:85:6: portalDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_portalDecl_in_command336);
                    portalDecl7=portalDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, portalDecl7.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:86:6: coverDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_coverDecl_in_command343);
                    coverDecl8=coverDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, coverDecl8.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:87:6: stashDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stashDecl_in_command350);
                    stashDecl9=stashDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, stashDecl9.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:88:6: textureBlockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_textureBlockDecl_in_command357);
                    textureBlockDecl10=textureBlockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, textureBlockDecl10.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:89:6: triggerDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_triggerDecl_in_command364);
                    triggerDecl11=triggerDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, triggerDecl11.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:90:6: commandDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandDecl_in_command371);
                    commandDecl12=commandDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, commandDecl12.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:91:6: talkDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_talkDecl_in_command378);
                    talkDecl13=talkDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, talkDecl13.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "command"


    public static class requiredAssignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "requiredAssignment"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:94:1: requiredAssignment : '::' stringLiteral -> ^( VAR stringLiteral ) ;
    public final AtrophyScriptParser.requiredAssignment_return requiredAssignment() throws RecognitionException {
        AtrophyScriptParser.requiredAssignment_return retval = new AtrophyScriptParser.requiredAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal14=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral15 =null;


        CommonTree string_literal14_tree=null;
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:94:19: ( '::' stringLiteral -> ^( VAR stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:95:4: '::' stringLiteral
            {
            string_literal14=(Token)match(input,76,FOLLOW_76_in_requiredAssignment391);  
            stream_76.add(string_literal14);


            pushFollow(FOLLOW_stringLiteral_in_requiredAssignment393);
            stringLiteral15=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral15.getTree());

            // AST REWRITE
            // elements: stringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 95:23: -> ^( VAR stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:95:26: ^( VAR stringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VAR, "VAR")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "requiredAssignment"


    public static class varAssignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varAssignment"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:98:1: varAssignment : ( requiredAssignment | -> ^( EMPTY ) );
    public final AtrophyScriptParser.varAssignment_return varAssignment() throws RecognitionException {
        AtrophyScriptParser.varAssignment_return retval = new AtrophyScriptParser.varAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.requiredAssignment_return requiredAssignment16 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:98:14: ( requiredAssignment | -> ^( EMPTY ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==76) ) {
                alt4=1;
            }
            else if ( (LA4_0==150) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:99:4: requiredAssignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_requiredAssignment_in_varAssignment417);
                    requiredAssignment16=requiredAssignment();

                    state._fsp--;

                    adaptor.addChild(root_0, requiredAssignment16.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:100:6: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 100:6: -> ^( EMPTY )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:100:9: ^( EMPTY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EMPTY, "EMPTY")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varAssignment"


    public static class mapSize_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mapSize"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:103:1: mapSize : ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) ;
    public final AtrophyScriptParser.mapSize_return mapSize() throws RecognitionException {
        AtrophyScriptParser.mapSize_return retval = new AtrophyScriptParser.mapSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal17=null;
        Token string_literal18=null;
        Token char_literal19=null;
        Token INT20=null;
        Token char_literal21=null;
        Token INT22=null;
        Token char_literal23=null;
        Token INT24=null;
        Token char_literal25=null;
        Token INT26=null;
        Token char_literal27=null;

        CommonTree string_literal17_tree=null;
        CommonTree string_literal18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree INT20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree INT22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree INT24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree INT26_tree=null;
        CommonTree char_literal27_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:103:8: ( ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:104:4: ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:104:4: ( 'MAPSIZE' | 'mapsize' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==86) ) {
                alt5=1;
            }
            else if ( (LA5_0==117) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:104:5: 'MAPSIZE'
                    {
                    string_literal17=(Token)match(input,86,FOLLOW_86_in_mapSize444);  
                    stream_86.add(string_literal17);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:104:17: 'mapsize'
                    {
                    string_literal18=(Token)match(input,117,FOLLOW_117_in_mapSize448);  
                    stream_117.add(string_literal18);


                    }
                    break;

            }


            char_literal19=(Token)match(input,150,FOLLOW_150_in_mapSize451);  
            stream_150.add(char_literal19);


            INT20=(Token)match(input,INT,FOLLOW_INT_in_mapSize453);  
            stream_INT.add(INT20);


            char_literal21=(Token)match(input,74,FOLLOW_74_in_mapSize455);  
            stream_74.add(char_literal21);


            INT22=(Token)match(input,INT,FOLLOW_INT_in_mapSize457);  
            stream_INT.add(INT22);


            char_literal23=(Token)match(input,74,FOLLOW_74_in_mapSize459);  
            stream_74.add(char_literal23);


            INT24=(Token)match(input,INT,FOLLOW_INT_in_mapSize461);  
            stream_INT.add(INT24);


            char_literal25=(Token)match(input,74,FOLLOW_74_in_mapSize463);  
            stream_74.add(char_literal25);


            INT26=(Token)match(input,INT,FOLLOW_INT_in_mapSize465);  
            stream_INT.add(INT26);


            char_literal27=(Token)match(input,151,FOLLOW_151_in_mapSize467);  
            stream_151.add(char_literal27);


            // AST REWRITE
            // elements: INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 104:64: -> ^( MAPSIZE ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:104:67: ^( MAPSIZE ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSIZE, "MAPSIZE")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:104:77: ( INT )*
                while ( stream_INT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_INT.nextNode()
                    );

                }
                stream_INT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mapSize"


    public static class mapSpawns_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mapSpawns"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:107:1: mapSpawns : ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) ;
    public final AtrophyScriptParser.mapSpawns_return mapSpawns() throws RecognitionException {
        AtrophyScriptParser.mapSpawns_return retval = new AtrophyScriptParser.mapSpawns_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal28=null;
        Token string_literal29=null;
        Token char_literal30=null;
        Token char_literal32=null;
        AtrophyScriptParser.stringList_return stringList31 =null;


        CommonTree string_literal28_tree=null;
        CommonTree string_literal29_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:107:10: ( ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:4: ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:4: ( 'MAPSPAWNS' | 'mapspawns' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==87) ) {
                alt6=1;
            }
            else if ( (LA6_0==118) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:5: 'MAPSPAWNS'
                    {
                    string_literal28=(Token)match(input,87,FOLLOW_87_in_mapSpawns492);  
                    stream_87.add(string_literal28);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:19: 'mapspawns'
                    {
                    string_literal29=(Token)match(input,118,FOLLOW_118_in_mapSpawns496);  
                    stream_118.add(string_literal29);


                    }
                    break;

            }


            char_literal30=(Token)match(input,150,FOLLOW_150_in_mapSpawns499);  
            stream_150.add(char_literal30);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:36: ( stringList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==69) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:36: stringList
                    {
                    pushFollow(FOLLOW_stringList_in_mapSpawns501);
                    stringList31=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList31.getTree());

                    }
                    break;

            }


            char_literal32=(Token)match(input,151,FOLLOW_151_in_mapSpawns504);  
            stream_151.add(char_literal32);


            // AST REWRITE
            // elements: stringList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 108:52: -> ^( MAPSPAWNS ( stringList )? )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:55: ^( MAPSPAWNS ( stringList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSPAWNS, "MAPSPAWNS")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:67: ( stringList )?
                if ( stream_stringList.hasNext() ) {
                    adaptor.addChild(root_1, stream_stringList.nextTree());

                }
                stream_stringList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mapSpawns"


    public static class blockDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockDecl"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:111:1: blockDecl : ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) ;
    public final AtrophyScriptParser.blockDecl_return blockDecl() throws RecognitionException {
        AtrophyScriptParser.blockDecl_return retval = new AtrophyScriptParser.blockDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal33=null;
        Token string_literal34=null;
        Token char_literal36=null;
        Token char_literal38=null;
        AtrophyScriptParser.varAssignment_return varAssignment35 =null;

        AtrophyScriptParser.properties_return properties37 =null;


        CommonTree string_literal33_tree=null;
        CommonTree string_literal34_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree char_literal38_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:111:10: ( ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:112:4: ( 'BLOCK' | 'block' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:112:4: ( 'BLOCK' | 'block' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==82) ) {
                alt8=1;
            }
            else if ( (LA8_0==96) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:112:5: 'BLOCK'
                    {
                    string_literal33=(Token)match(input,82,FOLLOW_82_in_blockDecl529);  
                    stream_82.add(string_literal33);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:112:15: 'block'
                    {
                    string_literal34=(Token)match(input,96,FOLLOW_96_in_blockDecl533);  
                    stream_96.add(string_literal34);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_blockDecl536);
            varAssignment35=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment35.getTree());

            char_literal36=(Token)match(input,150,FOLLOW_150_in_blockDecl538);  
            stream_150.add(char_literal36);


            pushFollow(FOLLOW_properties_in_blockDecl540);
            properties37=properties();

            state._fsp--;

            stream_properties.add(properties37.getTree());

            char_literal38=(Token)match(input,151,FOLLOW_151_in_blockDecl542);  
            stream_151.add(char_literal38);


            // AST REWRITE
            // elements: varAssignment, properties
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 112:57: -> ^( BLOCK varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:112:60: ^( BLOCK varAssignment properties )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                adaptor.addChild(root_1, stream_varAssignment.nextTree());

                adaptor.addChild(root_1, stream_properties.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blockDecl"


    public static class portalDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "portalDecl"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:115:1: portalDecl : ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) ;
    public final AtrophyScriptParser.portalDecl_return portalDecl() throws RecognitionException {
        AtrophyScriptParser.portalDecl_return retval = new AtrophyScriptParser.portalDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal39=null;
        Token string_literal40=null;
        Token char_literal42=null;
        Token char_literal44=null;
        AtrophyScriptParser.varAssignment_return varAssignment41 =null;

        AtrophyScriptParser.properties_return properties43 =null;


        CommonTree string_literal39_tree=null;
        CommonTree string_literal40_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree char_literal44_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:115:11: ( ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:116:4: ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:116:4: ( 'PORTAL' | 'portal' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==88) ) {
                alt9=1;
            }
            else if ( (LA9_0==125) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:116:5: 'PORTAL'
                    {
                    string_literal39=(Token)match(input,88,FOLLOW_88_in_portalDecl568);  
                    stream_88.add(string_literal39);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:116:16: 'portal'
                    {
                    string_literal40=(Token)match(input,125,FOLLOW_125_in_portalDecl572);  
                    stream_125.add(string_literal40);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_portalDecl575);
            varAssignment41=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment41.getTree());

            char_literal42=(Token)match(input,150,FOLLOW_150_in_portalDecl577);  
            stream_150.add(char_literal42);


            pushFollow(FOLLOW_properties_in_portalDecl579);
            properties43=properties();

            state._fsp--;

            stream_properties.add(properties43.getTree());

            char_literal44=(Token)match(input,151,FOLLOW_151_in_portalDecl581);  
            stream_151.add(char_literal44);


            // AST REWRITE
            // elements: properties, varAssignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 116:59: -> ^( PORTAL varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:116:62: ^( PORTAL varAssignment properties )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PORTAL, "PORTAL")
                , root_1);

                adaptor.addChild(root_1, stream_varAssignment.nextTree());

                adaptor.addChild(root_1, stream_properties.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "portalDecl"


    public static class coverDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "coverDecl"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:119:1: coverDecl : ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) ;
    public final AtrophyScriptParser.coverDecl_return coverDecl() throws RecognitionException {
        AtrophyScriptParser.coverDecl_return retval = new AtrophyScriptParser.coverDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal45=null;
        Token string_literal46=null;
        Token char_literal48=null;
        Token char_literal50=null;
        AtrophyScriptParser.varAssignment_return varAssignment47 =null;

        AtrophyScriptParser.properties_return properties49 =null;


        CommonTree string_literal45_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree char_literal48_tree=null;
        CommonTree char_literal50_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:119:10: ( ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:4: ( 'COVER' | 'cover' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:4: ( 'COVER' | 'cover' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==84) ) {
                alt10=1;
            }
            else if ( (LA10_0==102) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:5: 'COVER'
                    {
                    string_literal45=(Token)match(input,84,FOLLOW_84_in_coverDecl607);  
                    stream_84.add(string_literal45);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:15: 'cover'
                    {
                    string_literal46=(Token)match(input,102,FOLLOW_102_in_coverDecl611);  
                    stream_102.add(string_literal46);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_coverDecl614);
            varAssignment47=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment47.getTree());

            char_literal48=(Token)match(input,150,FOLLOW_150_in_coverDecl616);  
            stream_150.add(char_literal48);


            pushFollow(FOLLOW_properties_in_coverDecl618);
            properties49=properties();

            state._fsp--;

            stream_properties.add(properties49.getTree());

            char_literal50=(Token)match(input,151,FOLLOW_151_in_coverDecl620);  
            stream_151.add(char_literal50);


            // AST REWRITE
            // elements: varAssignment, properties
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 120:57: -> ^( COVER varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:60: ^( COVER varAssignment properties )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COVER, "COVER")
                , root_1);

                adaptor.addChild(root_1, stream_varAssignment.nextTree());

                adaptor.addChild(root_1, stream_properties.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "coverDecl"


    public static class stashDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stashDecl"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:1: stashDecl : ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) ;
    public final AtrophyScriptParser.stashDecl_return stashDecl() throws RecognitionException {
        AtrophyScriptParser.stashDecl_return retval = new AtrophyScriptParser.stashDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal51=null;
        Token string_literal52=null;
        Token char_literal54=null;
        Token char_literal56=null;
        AtrophyScriptParser.varAssignment_return varAssignment53 =null;

        AtrophyScriptParser.properties_return properties55 =null;


        CommonTree string_literal51_tree=null;
        CommonTree string_literal52_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree char_literal56_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:10: ( ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:4: ( 'STASH' | 'stash' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:4: ( 'STASH' | 'stash' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==89) ) {
                alt11=1;
            }
            else if ( (LA11_0==134) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:5: 'STASH'
                    {
                    string_literal51=(Token)match(input,89,FOLLOW_89_in_stashDecl646);  
                    stream_89.add(string_literal51);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:15: 'stash'
                    {
                    string_literal52=(Token)match(input,134,FOLLOW_134_in_stashDecl650);  
                    stream_134.add(string_literal52);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_stashDecl653);
            varAssignment53=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment53.getTree());

            char_literal54=(Token)match(input,150,FOLLOW_150_in_stashDecl655);  
            stream_150.add(char_literal54);


            pushFollow(FOLLOW_properties_in_stashDecl657);
            properties55=properties();

            state._fsp--;

            stream_properties.add(properties55.getTree());

            char_literal56=(Token)match(input,151,FOLLOW_151_in_stashDecl659);  
            stream_151.add(char_literal56);


            // AST REWRITE
            // elements: properties, varAssignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 124:57: -> ^( STASH varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:60: ^( STASH varAssignment properties )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STASH, "STASH")
                , root_1);

                adaptor.addChild(root_1, stream_varAssignment.nextTree());

                adaptor.addChild(root_1, stream_properties.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stashDecl"


    public static class textureBlockDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "textureBlockDecl"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:1: textureBlockDecl : ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) ;
    public final AtrophyScriptParser.textureBlockDecl_return textureBlockDecl() throws RecognitionException {
        AtrophyScriptParser.textureBlockDecl_return retval = new AtrophyScriptParser.textureBlockDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal57=null;
        Token string_literal58=null;
        Token string_literal59=null;
        Token char_literal60=null;
        Token char_literal62=null;
        AtrophyScriptParser.properties_return properties61 =null;


        CommonTree string_literal57_tree=null;
        CommonTree string_literal58_tree=null;
        CommonTree string_literal59_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree char_literal62_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:17: ( ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt12=1;
                }
                break;
            case 141:
                {
                alt12=2;
                }
                break;
            case 140:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:5: 'TEXTUREBLOCK'
                    {
                    string_literal57=(Token)match(input,91,FOLLOW_91_in_textureBlockDecl685);  
                    stream_91.add(string_literal57);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:22: 'textureblock'
                    {
                    string_literal58=(Token)match(input,141,FOLLOW_141_in_textureBlockDecl689);  
                    stream_141.add(string_literal58);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:39: 'textureBlock'
                    {
                    string_literal59=(Token)match(input,140,FOLLOW_140_in_textureBlockDecl693);  
                    stream_140.add(string_literal59);


                    }
                    break;

            }


            char_literal60=(Token)match(input,150,FOLLOW_150_in_textureBlockDecl696);  
            stream_150.add(char_literal60);


            pushFollow(FOLLOW_properties_in_textureBlockDecl698);
            properties61=properties();

            state._fsp--;

            stream_properties.add(properties61.getTree());

            char_literal62=(Token)match(input,151,FOLLOW_151_in_textureBlockDecl700);  
            stream_151.add(char_literal62);


            // AST REWRITE
            // elements: properties
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 128:74: -> ^( TEXTUREBLOCK properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:77: ^( TEXTUREBLOCK properties )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TEXTUREBLOCK, "TEXTUREBLOCK")
                , root_1);

                adaptor.addChild(root_1, stream_properties.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "textureBlockDecl"


    public static class triggerDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerDecl"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:1: triggerDecl : ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) ;
    public final AtrophyScriptParser.triggerDecl_return triggerDecl() throws RecognitionException {
        AtrophyScriptParser.triggerDecl_return retval = new AtrophyScriptParser.triggerDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal63=null;
        Token string_literal64=null;
        Token char_literal66=null;
        Token char_literal68=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment65 =null;

        AtrophyScriptParser.properties_return properties67 =null;


        CommonTree string_literal63_tree=null;
        CommonTree string_literal64_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal68_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:12: ( ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:4: ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:4: ( 'TRIGGER' | 'trigger' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==92) ) {
                alt13=1;
            }
            else if ( (LA13_0==142) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:5: 'TRIGGER'
                    {
                    string_literal63=(Token)match(input,92,FOLLOW_92_in_triggerDecl724);  
                    stream_92.add(string_literal63);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:17: 'trigger'
                    {
                    string_literal64=(Token)match(input,142,FOLLOW_142_in_triggerDecl728);  
                    stream_142.add(string_literal64);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_triggerDecl731);
            requiredAssignment65=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment65.getTree());

            char_literal66=(Token)match(input,150,FOLLOW_150_in_triggerDecl733);  
            stream_150.add(char_literal66);


            pushFollow(FOLLOW_properties_in_triggerDecl735);
            properties67=properties();

            state._fsp--;

            stream_properties.add(properties67.getTree());

            char_literal68=(Token)match(input,151,FOLLOW_151_in_triggerDecl737);  
            stream_151.add(char_literal68);


            // AST REWRITE
            // elements: properties, requiredAssignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 132:66: -> ^( TRIGGER requiredAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:69: ^( TRIGGER requiredAssignment properties )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TRIGGER, "TRIGGER")
                , root_1);

                adaptor.addChild(root_1, stream_requiredAssignment.nextTree());

                adaptor.addChild(root_1, stream_properties.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triggerDecl"


    public static class commandDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commandDecl"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:135:1: commandDecl : ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) ;
    public final AtrophyScriptParser.commandDecl_return commandDecl() throws RecognitionException {
        AtrophyScriptParser.commandDecl_return retval = new AtrophyScriptParser.commandDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal69=null;
        Token string_literal70=null;
        Token char_literal72=null;
        Token char_literal74=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment71 =null;

        AtrophyScriptParser.triggerEffectList_return triggerEffectList73 =null;


        CommonTree string_literal69_tree=null;
        CommonTree string_literal70_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree char_literal74_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:135:12: ( ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:4: ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:4: ( 'COMMAND' | 'command' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==83) ) {
                alt14=1;
            }
            else if ( (LA14_0==99) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:5: 'COMMAND'
                    {
                    string_literal69=(Token)match(input,83,FOLLOW_83_in_commandDecl763);  
                    stream_83.add(string_literal69);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:17: 'command'
                    {
                    string_literal70=(Token)match(input,99,FOLLOW_99_in_commandDecl767);  
                    stream_99.add(string_literal70);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_commandDecl770);
            requiredAssignment71=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment71.getTree());

            char_literal72=(Token)match(input,150,FOLLOW_150_in_commandDecl772);  
            stream_150.add(char_literal72);


            pushFollow(FOLLOW_triggerEffectList_in_commandDecl774);
            triggerEffectList73=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList73.getTree());

            char_literal74=(Token)match(input,151,FOLLOW_151_in_commandDecl776);  
            stream_151.add(char_literal74);


            // AST REWRITE
            // elements: triggerEffectList, requiredAssignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 136:73: -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:76: ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COMMAND, "COMMAND")
                , root_1);

                adaptor.addChild(root_1, stream_requiredAssignment.nextTree());

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:105: ^( TRIGGEREFFECT triggerEffectList )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TRIGGEREFFECT, "TRIGGEREFFECT")
                , root_2);

                adaptor.addChild(root_2, stream_triggerEffectList.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "commandDecl"


    public static class talkDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "talkDecl"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:139:1: talkDecl : ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) ;
    public final AtrophyScriptParser.talkDecl_return talkDecl() throws RecognitionException {
        AtrophyScriptParser.talkDecl_return retval = new AtrophyScriptParser.talkDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal75=null;
        Token string_literal76=null;
        Token char_literal77=null;
        Token char_literal79=null;
        AtrophyScriptParser.properties_return properties78 =null;


        CommonTree string_literal75_tree=null;
        CommonTree string_literal76_tree=null;
        CommonTree char_literal77_tree=null;
        CommonTree char_literal79_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:139:9: ( ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:4: ( 'TALK' | 'talk' ) '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:4: ( 'TALK' | 'talk' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==90) ) {
                alt15=1;
            }
            else if ( (LA15_0==135) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:5: 'TALK'
                    {
                    string_literal75=(Token)match(input,90,FOLLOW_90_in_talkDecl806);  
                    stream_90.add(string_literal75);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:14: 'talk'
                    {
                    string_literal76=(Token)match(input,135,FOLLOW_135_in_talkDecl810);  
                    stream_135.add(string_literal76);


                    }
                    break;

            }


            char_literal77=(Token)match(input,150,FOLLOW_150_in_talkDecl813);  
            stream_150.add(char_literal77);


            pushFollow(FOLLOW_properties_in_talkDecl815);
            properties78=properties();

            state._fsp--;

            stream_properties.add(properties78.getTree());

            char_literal79=(Token)match(input,151,FOLLOW_151_in_talkDecl817);  
            stream_151.add(char_literal79);


            // AST REWRITE
            // elements: properties
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 140:41: -> ^( TALK properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:44: ^( TALK properties )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TALK, "TALK")
                , root_1);

                adaptor.addChild(root_1, stream_properties.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "talkDecl"


    public static class properties_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "properties"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:1: properties : ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | lineProperty | triggerCondProperty | triggerEffectProperty )* ;
    public final AtrophyScriptParser.properties_return properties() throws RecognitionException {
        AtrophyScriptParser.properties_return retval = new AtrophyScriptParser.properties_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.xListProperty_return xListProperty80 =null;

        AtrophyScriptParser.yListProperty_return yListProperty81 =null;

        AtrophyScriptParser.factionTerritoryProperty_return factionTerritoryProperty82 =null;

        AtrophyScriptParser.factionZoneProperty_return factionZoneProperty83 =null;

        AtrophyScriptParser.saferoomProperty_return saferoomProperty84 =null;

        AtrophyScriptParser.stageProperty_return stageProperty85 =null;

        AtrophyScriptParser.stageDeclProperty_return stageDeclProperty86 =null;

        AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty87 =null;

        AtrophyScriptParser.aiInitProperty_return aiInitProperty88 =null;

        AtrophyScriptParser.openingLineProperty_return openingLineProperty89 =null;

        AtrophyScriptParser.lineProperty_return lineProperty90 =null;

        AtrophyScriptParser.triggerCondProperty_return triggerCondProperty91 =null;

        AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty92 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:11: ( ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | lineProperty | triggerCondProperty | triggerEffectProperty )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | lineProperty | triggerCondProperty | triggerEffectProperty )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | lineProperty | triggerCondProperty | triggerEffectProperty )*
            loop16:
            do {
                int alt16=14;
                switch ( input.LA(1) ) {
                case 147:
                    {
                    alt16=1;
                    }
                    break;
                case 148:
                    {
                    alt16=2;
                    }
                    break;
                case 139:
                    {
                    alt16=3;
                    }
                    break;
                case 149:
                    {
                    alt16=4;
                    }
                    break;
                case 130:
                    {
                    alt16=5;
                    }
                    break;
                case 129:
                case 132:
                    {
                    alt16=6;
                    }
                    break;
                case 133:
                    {
                    alt16=7;
                    }
                    break;
                case 123:
                case 124:
                    {
                    alt16=8;
                    }
                    break;
                case 93:
                case 95:
                    {
                    alt16=9;
                    }
                    break;
                case 120:
                case 121:
                case 122:
                    {
                    alt16=10;
                    }
                    break;
                case 113:
                case 114:
                    {
                    alt16=11;
                    }
                    break;
                case 136:
                case 143:
                    {
                    alt16=12;
                    }
                    break;
                case 137:
                case 144:
                    {
                    alt16=13;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:5: xListProperty
            	    {
            	    pushFollow(FOLLOW_xListProperty_in_properties841);
            	    xListProperty80=xListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xListProperty80.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:6: yListProperty
            	    {
            	    pushFollow(FOLLOW_yListProperty_in_properties848);
            	    yListProperty81=yListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, yListProperty81.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:146:6: factionTerritoryProperty
            	    {
            	    pushFollow(FOLLOW_factionTerritoryProperty_in_properties855);
            	    factionTerritoryProperty82=factionTerritoryProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionTerritoryProperty82.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:6: factionZoneProperty
            	    {
            	    pushFollow(FOLLOW_factionZoneProperty_in_properties862);
            	    factionZoneProperty83=factionZoneProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionZoneProperty83.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:148:6: saferoomProperty
            	    {
            	    pushFollow(FOLLOW_saferoomProperty_in_properties869);
            	    saferoomProperty84=saferoomProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, saferoomProperty84.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:149:6: stageProperty
            	    {
            	    pushFollow(FOLLOW_stageProperty_in_properties876);
            	    stageProperty85=stageProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageProperty85.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:6: stageDeclProperty
            	    {
            	    pushFollow(FOLLOW_stageDeclProperty_in_properties883);
            	    stageDeclProperty86=stageDeclProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageDeclProperty86.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:6: talkMapParentProperty
            	    {
            	    pushFollow(FOLLOW_talkMapParentProperty_in_properties890);
            	    talkMapParentProperty87=talkMapParentProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, talkMapParentProperty87.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:152:6: aiInitProperty
            	    {
            	    pushFollow(FOLLOW_aiInitProperty_in_properties897);
            	    aiInitProperty88=aiInitProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiInitProperty88.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:153:6: openingLineProperty
            	    {
            	    pushFollow(FOLLOW_openingLineProperty_in_properties904);
            	    openingLineProperty89=openingLineProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, openingLineProperty89.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:6: lineProperty
            	    {
            	    pushFollow(FOLLOW_lineProperty_in_properties911);
            	    lineProperty90=lineProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lineProperty90.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:6: triggerCondProperty
            	    {
            	    pushFollow(FOLLOW_triggerCondProperty_in_properties918);
            	    triggerCondProperty91=triggerCondProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerCondProperty91.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:156:6: triggerEffectProperty
            	    {
            	    pushFollow(FOLLOW_triggerEffectProperty_in_properties925);
            	    triggerEffectProperty92=triggerEffectProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffectProperty92.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "properties"


    public static class xListProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xListProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:1: xListProperty : 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) ;
    public final AtrophyScriptParser.xListProperty_return xListProperty() throws RecognitionException {
        AtrophyScriptParser.xListProperty_return retval = new AtrophyScriptParser.xListProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal93=null;
        Token INT94=null;
        Token char_literal95=null;
        Token INT96=null;

        CommonTree string_literal93_tree=null;
        CommonTree INT94_tree=null;
        CommonTree char_literal95_tree=null;
        CommonTree INT96_tree=null;
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:14: ( 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:160:4: 'x:' INT ( ',' INT )*
            {
            string_literal93=(Token)match(input,147,FOLLOW_147_in_xListProperty942);  
            stream_147.add(string_literal93);


            INT94=(Token)match(input,INT,FOLLOW_INT_in_xListProperty944);  
            stream_INT.add(INT94);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:160:13: ( ',' INT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==74) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:160:14: ',' INT
            	    {
            	    char_literal95=(Token)match(input,74,FOLLOW_74_in_xListProperty947);  
            	    stream_74.add(char_literal95);


            	    INT96=(Token)match(input,INT,FOLLOW_INT_in_xListProperty948);  
            	    stream_INT.add(INT96);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // AST REWRITE
            // elements: INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 160:23: -> ^( XLIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:160:26: ^( XLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(XLIST, "XLIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:160:34: ( INT )*
                while ( stream_INT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_INT.nextNode()
                    );

                }
                stream_INT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "xListProperty"


    public static class yListProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "yListProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:1: yListProperty : 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) ;
    public final AtrophyScriptParser.yListProperty_return yListProperty() throws RecognitionException {
        AtrophyScriptParser.yListProperty_return retval = new AtrophyScriptParser.yListProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal97=null;
        Token INT98=null;
        Token char_literal99=null;
        Token INT100=null;

        CommonTree string_literal97_tree=null;
        CommonTree INT98_tree=null;
        CommonTree char_literal99_tree=null;
        CommonTree INT100_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:14: ( 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:164:4: 'y:' INT ( ',' INT )*
            {
            string_literal97=(Token)match(input,148,FOLLOW_148_in_yListProperty972);  
            stream_148.add(string_literal97);


            INT98=(Token)match(input,INT,FOLLOW_INT_in_yListProperty974);  
            stream_INT.add(INT98);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:164:13: ( ',' INT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==74) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:164:14: ',' INT
            	    {
            	    char_literal99=(Token)match(input,74,FOLLOW_74_in_yListProperty977);  
            	    stream_74.add(char_literal99);


            	    INT100=(Token)match(input,INT,FOLLOW_INT_in_yListProperty978);  
            	    stream_INT.add(INT100);


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // AST REWRITE
            // elements: INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 164:23: -> ^( YLIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:164:26: ^( YLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(YLIST, "YLIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:164:34: ( INT )*
                while ( stream_INT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_INT.nextNode()
                    );

                }
                stream_INT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "yListProperty"


    public static class factionTerritoryProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factionTerritoryProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:1: factionTerritoryProperty : 'territory:' stringLiteral INT -> ^( TERRITORY stringLiteral INT ) ;
    public final AtrophyScriptParser.factionTerritoryProperty_return factionTerritoryProperty() throws RecognitionException {
        AtrophyScriptParser.factionTerritoryProperty_return retval = new AtrophyScriptParser.factionTerritoryProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal101=null;
        Token INT103=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral102 =null;


        CommonTree string_literal101_tree=null;
        CommonTree INT103_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:25: ( 'territory:' stringLiteral INT -> ^( TERRITORY stringLiteral INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:168:4: 'territory:' stringLiteral INT
            {
            string_literal101=(Token)match(input,139,FOLLOW_139_in_factionTerritoryProperty1004);  
            stream_139.add(string_literal101);


            pushFollow(FOLLOW_stringLiteral_in_factionTerritoryProperty1006);
            stringLiteral102=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral102.getTree());

            INT103=(Token)match(input,INT,FOLLOW_INT_in_factionTerritoryProperty1008);  
            stream_INT.add(INT103);


            // AST REWRITE
            // elements: INT, stringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 168:35: -> ^( TERRITORY stringLiteral INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:168:38: ^( TERRITORY stringLiteral INT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TERRITORY, "TERRITORY")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factionTerritoryProperty"


    public static class factionZoneProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factionZoneProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:1: factionZoneProperty : 'zone:' stringList -> ^( ZONE stringList ) ;
    public final AtrophyScriptParser.factionZoneProperty_return factionZoneProperty() throws RecognitionException {
        AtrophyScriptParser.factionZoneProperty_return retval = new AtrophyScriptParser.factionZoneProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal104=null;
        AtrophyScriptParser.stringList_return stringList105 =null;


        CommonTree string_literal104_tree=null;
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:20: ( 'zone:' stringList -> ^( ZONE stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:172:4: 'zone:' stringList
            {
            string_literal104=(Token)match(input,149,FOLLOW_149_in_factionZoneProperty1033);  
            stream_149.add(string_literal104);


            pushFollow(FOLLOW_stringList_in_factionZoneProperty1035);
            stringList105=stringList();

            state._fsp--;

            stream_stringList.add(stringList105.getTree());

            // AST REWRITE
            // elements: stringList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 172:23: -> ^( ZONE stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:172:26: ^( ZONE stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ZONE, "ZONE")
                , root_1);

                adaptor.addChild(root_1, stream_stringList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factionZoneProperty"


    public static class saferoomProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "saferoomProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:1: saferoomProperty : 'saferoom' -> ^( SAFEROOM ) ;
    public final AtrophyScriptParser.saferoomProperty_return saferoomProperty() throws RecognitionException {
        AtrophyScriptParser.saferoomProperty_return retval = new AtrophyScriptParser.saferoomProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal106=null;

        CommonTree string_literal106_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:17: ( 'saferoom' -> ^( SAFEROOM ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:176:4: 'saferoom'
            {
            string_literal106=(Token)match(input,130,FOLLOW_130_in_saferoomProperty1058);  
            stream_130.add(string_literal106);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 176:15: -> ^( SAFEROOM )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:176:18: ^( SAFEROOM )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SAFEROOM, "SAFEROOM")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "saferoomProperty"


    public static class stageDeclProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stageDeclProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:1: stageDeclProperty : 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) ;
    public final AtrophyScriptParser.stageDeclProperty_return stageDeclProperty() throws RecognitionException {
        AtrophyScriptParser.stageDeclProperty_return retval = new AtrophyScriptParser.stageDeclProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal107=null;
        Token INT108=null;
        Token char_literal109=null;
        Token INT110=null;

        CommonTree string_literal107_tree=null;
        CommonTree INT108_tree=null;
        CommonTree char_literal109_tree=null;
        CommonTree INT110_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:18: ( 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:180:4: 'stages:' INT ( ',' INT )*
            {
            string_literal107=(Token)match(input,133,FOLLOW_133_in_stageDeclProperty1079);  
            stream_133.add(string_literal107);


            INT108=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1081);  
            stream_INT.add(INT108);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:180:18: ( ',' INT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==74) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:180:19: ',' INT
            	    {
            	    char_literal109=(Token)match(input,74,FOLLOW_74_in_stageDeclProperty1084);  
            	    stream_74.add(char_literal109);


            	    INT110=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1086);  
            	    stream_INT.add(INT110);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // AST REWRITE
            // elements: INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 180:29: -> ^( STAGELIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:180:32: ^( STAGELIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STAGELIST, "STAGELIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:180:44: ( INT )*
                while ( stream_INT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_INT.nextNode()
                    );

                }
                stream_INT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stageDeclProperty"


    public static class talkMapParentProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "talkMapParentProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:1: talkMapParentProperty : ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) ;
    public final AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty() throws RecognitionException {
        AtrophyScriptParser.talkMapParentProperty_return retval = new AtrophyScriptParser.talkMapParentProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal111=null;
        Token string_literal112=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral113 =null;


        CommonTree string_literal111_tree=null;
        CommonTree string_literal112_tree=null;
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:22: ( ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:184:4: ( 'parent:' | 'p:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:184:4: ( 'parent:' | 'p:' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==124) ) {
                alt20=1;
            }
            else if ( (LA20_0==123) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:184:5: 'parent:'
                    {
                    string_literal111=(Token)match(input,124,FOLLOW_124_in_talkMapParentProperty1113);  
                    stream_124.add(string_literal111);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:184:17: 'p:'
                    {
                    string_literal112=(Token)match(input,123,FOLLOW_123_in_talkMapParentProperty1117);  
                    stream_123.add(string_literal112);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_talkMapParentProperty1120);
            stringLiteral113=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral113.getTree());

            // AST REWRITE
            // elements: stringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 184:37: -> ^( TALKPARENT stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:184:40: ^( TALKPARENT stringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TALKPARENT, "TALKPARENT")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "talkMapParentProperty"


    public static class stageProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stageProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:1: stageProperty : ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) ;
    public final AtrophyScriptParser.stageProperty_return stageProperty() throws RecognitionException {
        AtrophyScriptParser.stageProperty_return retval = new AtrophyScriptParser.stageProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal114=null;
        Token string_literal115=null;
        Token INT116=null;

        CommonTree string_literal114_tree=null;
        CommonTree string_literal115_tree=null;
        CommonTree INT116_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:14: ( ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:188:4: ( 'stage:' | 's:' ) INT
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:188:4: ( 'stage:' | 's:' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==132) ) {
                alt21=1;
            }
            else if ( (LA21_0==129) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:188:5: 'stage:'
                    {
                    string_literal114=(Token)match(input,132,FOLLOW_132_in_stageProperty1144);  
                    stream_132.add(string_literal114);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:188:16: 's:'
                    {
                    string_literal115=(Token)match(input,129,FOLLOW_129_in_stageProperty1148);  
                    stream_129.add(string_literal115);


                    }
                    break;

            }


            INT116=(Token)match(input,INT,FOLLOW_INT_in_stageProperty1151);  
            stream_INT.add(INT116);


            // AST REWRITE
            // elements: INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 188:26: -> ^( TALKSTAGE INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:188:29: ^( TALKSTAGE INT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TALKSTAGE, "TALKSTAGE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stageProperty"


    public static class aiInitProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aiInitProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:1: aiInitProperty : ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) ;
    public final AtrophyScriptParser.aiInitProperty_return aiInitProperty() throws RecognitionException {
        AtrophyScriptParser.aiInitProperty_return retval = new AtrophyScriptParser.aiInitProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal117=null;
        Token string_literal118=null;
        Token BOOL119=null;

        CommonTree string_literal117_tree=null;
        CommonTree string_literal118_tree=null;
        CommonTree BOOL119_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:15: ( ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:192:4: ( 'aiInit:' | 'a:' ) BOOL
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:192:4: ( 'aiInit:' | 'a:' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==95) ) {
                alt22=1;
            }
            else if ( (LA22_0==93) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:192:5: 'aiInit:'
                    {
                    string_literal117=(Token)match(input,95,FOLLOW_95_in_aiInitProperty1175);  
                    stream_95.add(string_literal117);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:192:17: 'a:'
                    {
                    string_literal118=(Token)match(input,93,FOLLOW_93_in_aiInitProperty1179);  
                    stream_93.add(string_literal118);


                    }
                    break;

            }


            BOOL119=(Token)match(input,BOOL,FOLLOW_BOOL_in_aiInitProperty1182);  
            stream_BOOL.add(BOOL119);


            // AST REWRITE
            // elements: BOOL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 192:28: -> ^( AIINIT BOOL )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:192:31: ^( AIINIT BOOL )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(AIINIT, "AIINIT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_BOOL.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "aiInitProperty"


    public static class openingLineProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "openingLineProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:1: openingLineProperty : ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) ;
    public final AtrophyScriptParser.openingLineProperty_return openingLineProperty() throws RecognitionException {
        AtrophyScriptParser.openingLineProperty_return retval = new AtrophyScriptParser.openingLineProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal120=null;
        Token string_literal121=null;
        Token string_literal122=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral123 =null;


        CommonTree string_literal120_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree string_literal122_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:20: ( ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:4: ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:4: ( 'o:' | 'opening:' | 'openingLine:' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt23=1;
                }
                break;
            case 121:
                {
                alt23=2;
                }
                break;
            case 122:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:5: 'o:'
                    {
                    string_literal120=(Token)match(input,120,FOLLOW_120_in_openingLineProperty1206);  
                    stream_120.add(string_literal120);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:12: 'opening:'
                    {
                    string_literal121=(Token)match(input,121,FOLLOW_121_in_openingLineProperty1210);  
                    stream_121.add(string_literal121);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:25: 'openingLine:'
                    {
                    string_literal122=(Token)match(input,122,FOLLOW_122_in_openingLineProperty1214);  
                    stream_122.add(string_literal122);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_openingLineProperty1217);
            stringLiteral123=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral123.getTree());

            // AST REWRITE
            // elements: stringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 196:55: -> ^( OPENINGLINE stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:58: ^( OPENINGLINE stringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(OPENINGLINE, "OPENINGLINE")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "openingLineProperty"


    public static class lineProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lineProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:1: lineProperty : ( 'l:' | 'line:' ) stringLiteral -> ^( LINE stringLiteral ) ;
    public final AtrophyScriptParser.lineProperty_return lineProperty() throws RecognitionException {
        AtrophyScriptParser.lineProperty_return retval = new AtrophyScriptParser.lineProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal124=null;
        Token string_literal125=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral126 =null;


        CommonTree string_literal124_tree=null;
        CommonTree string_literal125_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:13: ( ( 'l:' | 'line:' ) stringLiteral -> ^( LINE stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:200:4: ( 'l:' | 'line:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:200:4: ( 'l:' | 'line:' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==113) ) {
                alt24=1;
            }
            else if ( (LA24_0==114) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:200:5: 'l:'
                    {
                    string_literal124=(Token)match(input,113,FOLLOW_113_in_lineProperty1239);  
                    stream_113.add(string_literal124);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:200:12: 'line:'
                    {
                    string_literal125=(Token)match(input,114,FOLLOW_114_in_lineProperty1243);  
                    stream_114.add(string_literal125);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_lineProperty1246);
            stringLiteral126=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral126.getTree());

            // AST REWRITE
            // elements: stringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 200:35: -> ^( LINE stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:200:38: ^( LINE stringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LINE, "LINE")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lineProperty"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:203:1: term : ( '(' condExpression ')' | BOOL | booleanQuery );
    public final AtrophyScriptParser.term_return term() throws RecognitionException {
        AtrophyScriptParser.term_return retval = new AtrophyScriptParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal127=null;
        Token char_literal129=null;
        Token BOOL130=null;
        AtrophyScriptParser.condExpression_return condExpression128 =null;

        AtrophyScriptParser.booleanQuery_return booleanQuery131 =null;


        CommonTree char_literal127_tree=null;
        CommonTree char_literal129_tree=null;
        CommonTree BOOL130_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:203:5: ( '(' condExpression ')' | BOOL | booleanQuery )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt25=1;
                }
                break;
            case BOOL:
                {
                alt25=2;
                }
                break;
            case 68:
            case 72:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 93:
            case 95:
            case 113:
            case 114:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 129:
            case 130:
            case 132:
            case 133:
            case 136:
            case 137:
            case 139:
            case 143:
            case 144:
            case 147:
            case 148:
            case 149:
            case 151:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:204:4: '(' condExpression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal127=(Token)match(input,71,FOLLOW_71_in_term1269); 
                    char_literal127_tree = 
                    (CommonTree)adaptor.create(char_literal127)
                    ;
                    adaptor.addChild(root_0, char_literal127_tree);


                    pushFollow(FOLLOW_condExpression_in_term1271);
                    condExpression128=condExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, condExpression128.getTree());

                    char_literal129=(Token)match(input,72,FOLLOW_72_in_term1273); 
                    char_literal129_tree = 
                    (CommonTree)adaptor.create(char_literal129)
                    ;
                    adaptor.addChild(root_0, char_literal129_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:8: BOOL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BOOL130=(Token)match(input,BOOL,FOLLOW_BOOL_in_term1282); 
                    BOOL130_tree = 
                    (CommonTree)adaptor.create(BOOL130)
                    ;
                    adaptor.addChild(root_0, BOOL130_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:8: booleanQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_booleanQuery_in_term1291);
                    booleanQuery131=booleanQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanQuery131.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class booleanQuery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanQuery"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:1: booleanQuery :;
    public final AtrophyScriptParser.booleanQuery_return booleanQuery() throws RecognitionException {
        AtrophyScriptParser.booleanQuery_return retval = new AtrophyScriptParser.booleanQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:13: ()
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:3: 
            {
            root_0 = (CommonTree)adaptor.nil();


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "booleanQuery"


    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:212:1: unary : ( '+' !| negation ^)* term ;
    public final AtrophyScriptParser.unary_return unary() throws RecognitionException {
        AtrophyScriptParser.unary_return retval = new AtrophyScriptParser.unary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal132=null;
        AtrophyScriptParser.negation_return negation133 =null;

        AtrophyScriptParser.term_return term134 =null;


        CommonTree char_literal132_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:212:6: ( ( '+' !| negation ^)* term )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:4: ( '+' !| negation ^)* term
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:4: ( '+' !| negation ^)*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==73) ) {
                    alt26=1;
                }
                else if ( (LA26_0==75) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:5: '+' !
            	    {
            	    char_literal132=(Token)match(input,73,FOLLOW_73_in_unary1328); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:12: negation ^
            	    {
            	    pushFollow(FOLLOW_negation_in_unary1333);
            	    negation133=negation();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(negation133.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary1338);
            term134=term();

            state._fsp--;

            adaptor.addChild(root_0, term134.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary"


    public static class negation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "negation"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:216:1: negation : '-' -> NEGATION ;
    public final AtrophyScriptParser.negation_return negation() throws RecognitionException {
        AtrophyScriptParser.negation_return retval = new AtrophyScriptParser.negation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal135=null;

        CommonTree char_literal135_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:216:9: ( '-' -> NEGATION )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:5: '-'
            {
            char_literal135=(Token)match(input,75,FOLLOW_75_in_negation1360);  
            stream_75.add(char_literal135);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 217:9: -> NEGATION
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(NEGATION, "NEGATION")
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "negation"


    public static class condExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condExpression"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:220:1: condExpression : unary ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary )* ;
    public final AtrophyScriptParser.condExpression_return condExpression() throws RecognitionException {
        AtrophyScriptParser.condExpression_return retval = new AtrophyScriptParser.condExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set137=null;
        AtrophyScriptParser.unary_return unary136 =null;

        AtrophyScriptParser.unary_return unary138 =null;


        CommonTree set137_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:220:15: ( unary ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:5: unary ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_condExpression1386);
            unary136=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary136.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:11: ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==68||(LA27_0 >= 77 && LA27_0 <= 81)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:12: ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary
            	    {
            	    set137=(Token)input.LT(1);

            	    if ( input.LA(1)==68||(input.LA(1) >= 77 && input.LA(1) <= 81) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set137)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_condExpression1412);
            	    unary138=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary138.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condExpression"


    public static class triggerCondProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerCondProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:224:1: triggerCondProperty : ( 'tc:' | 'triggerCond:' ) condExpression -> ^( TRIGGERCOND condExpression ) ;
    public final AtrophyScriptParser.triggerCondProperty_return triggerCondProperty() throws RecognitionException {
        AtrophyScriptParser.triggerCondProperty_return retval = new AtrophyScriptParser.triggerCondProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal139=null;
        Token string_literal140=null;
        AtrophyScriptParser.condExpression_return condExpression141 =null;


        CommonTree string_literal139_tree=null;
        CommonTree string_literal140_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleSubtreeStream stream_condExpression=new RewriteRuleSubtreeStream(adaptor,"rule condExpression");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:224:20: ( ( 'tc:' | 'triggerCond:' ) condExpression -> ^( TRIGGERCOND condExpression ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:4: ( 'tc:' | 'triggerCond:' ) condExpression
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:4: ( 'tc:' | 'triggerCond:' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==136) ) {
                alt28=1;
            }
            else if ( (LA28_0==143) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:5: 'tc:'
                    {
                    string_literal139=(Token)match(input,136,FOLLOW_136_in_triggerCondProperty1430);  
                    stream_136.add(string_literal139);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:13: 'triggerCond:'
                    {
                    string_literal140=(Token)match(input,143,FOLLOW_143_in_triggerCondProperty1434);  
                    stream_143.add(string_literal140);


                    }
                    break;

            }


            pushFollow(FOLLOW_condExpression_in_triggerCondProperty1437);
            condExpression141=condExpression();

            state._fsp--;

            stream_condExpression.add(condExpression141.getTree());

            // AST REWRITE
            // elements: condExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 225:44: -> ^( TRIGGERCOND condExpression )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:47: ^( TRIGGERCOND condExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TRIGGERCOND, "TRIGGERCOND")
                , root_1);

                adaptor.addChild(root_1, stream_condExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triggerCondProperty"


    public static class triggerEffectProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerEffectProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:228:1: triggerEffectProperty : ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) ;
    public final AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty() throws RecognitionException {
        AtrophyScriptParser.triggerEffectProperty_return retval = new AtrophyScriptParser.triggerEffectProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal142=null;
        Token string_literal143=null;
        Token char_literal144=null;
        Token char_literal146=null;
        AtrophyScriptParser.triggerEffectList_return triggerEffectList145 =null;


        CommonTree string_literal142_tree=null;
        CommonTree string_literal143_tree=null;
        CommonTree char_literal144_tree=null;
        CommonTree char_literal146_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:228:22: ( ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:4: ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:4: ( 'te' | 'triggerEffect' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==137) ) {
                alt29=1;
            }
            else if ( (LA29_0==144) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:5: 'te'
                    {
                    string_literal142=(Token)match(input,137,FOLLOW_137_in_triggerEffectProperty1459);  
                    stream_137.add(string_literal142);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:12: 'triggerEffect'
                    {
                    string_literal143=(Token)match(input,144,FOLLOW_144_in_triggerEffectProperty1463);  
                    stream_144.add(string_literal143);


                    }
                    break;

            }


            char_literal144=(Token)match(input,150,FOLLOW_150_in_triggerEffectProperty1466);  
            stream_150.add(char_literal144);


            pushFollow(FOLLOW_triggerEffectList_in_triggerEffectProperty1468);
            triggerEffectList145=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList145.getTree());

            char_literal146=(Token)match(input,151,FOLLOW_151_in_triggerEffectProperty1470);  
            stream_151.add(char_literal146);


            // AST REWRITE
            // elements: triggerEffectList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 229:55: -> ^( TRIGGEREFFECT triggerEffectList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:58: ^( TRIGGEREFFECT triggerEffectList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TRIGGEREFFECT, "TRIGGEREFFECT")
                , root_1);

                adaptor.addChild(root_1, stream_triggerEffectList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triggerEffectProperty"


    public static class triggerEffectList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerEffectList"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:232:1: triggerEffectList : triggerEffect ( ',' ! triggerEffect )* ;
    public final AtrophyScriptParser.triggerEffectList_return triggerEffectList() throws RecognitionException {
        AtrophyScriptParser.triggerEffectList_return retval = new AtrophyScriptParser.triggerEffectList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal148=null;
        AtrophyScriptParser.triggerEffect_return triggerEffect147 =null;

        AtrophyScriptParser.triggerEffect_return triggerEffect149 =null;


        CommonTree char_literal148_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:232:18: ( triggerEffect ( ',' ! triggerEffect )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:4: triggerEffect ( ',' ! triggerEffect )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1491);
            triggerEffect147=triggerEffect();

            state._fsp--;

            adaptor.addChild(root_0, triggerEffect147.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:18: ( ',' ! triggerEffect )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==74) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:19: ',' ! triggerEffect
            	    {
            	    char_literal148=(Token)match(input,74,FOLLOW_74_in_triggerEffectList1494); 

            	    pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1497);
            	    triggerEffect149=triggerEffect();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffect149.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triggerEffectList"


    public static class triggerEffect_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerEffect"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:236:1: triggerEffect : ( updateTalkTree | spawnUnit | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | commandCallList );
    public final AtrophyScriptParser.triggerEffect_return triggerEffect() throws RecognitionException {
        AtrophyScriptParser.triggerEffect_return retval = new AtrophyScriptParser.triggerEffect_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.updateTalkTree_return updateTalkTree150 =null;

        AtrophyScriptParser.spawnUnit_return spawnUnit151 =null;

        AtrophyScriptParser.removeUnit_return removeUnit152 =null;

        AtrophyScriptParser.killUnit_return killUnit153 =null;

        AtrophyScriptParser.teleportUnit_return teleportUnit154 =null;

        AtrophyScriptParser.converseUnit_return converseUnit155 =null;

        AtrophyScriptParser.createSaferoom_return createSaferoom156 =null;

        AtrophyScriptParser.removeSaferoom_return removeSaferoom157 =null;

        AtrophyScriptParser.loadMap_return loadMap158 =null;

        AtrophyScriptParser.lockDoor_return lockDoor159 =null;

        AtrophyScriptParser.unlockDoor_return unlockDoor160 =null;

        AtrophyScriptParser.addTag_return addTag161 =null;

        AtrophyScriptParser.removeTag_return removeTag162 =null;

        AtrophyScriptParser.directorBias_return directorBias163 =null;

        AtrophyScriptParser.changeAiNode_return changeAiNode164 =null;

        AtrophyScriptParser.commandCallList_return commandCallList165 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:236:14: ( updateTalkTree | spawnUnit | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | commandCallList )
            int alt31=16;
            switch ( input.LA(1) ) {
            case UPDATE_TREE_PREFIX:
            case 146:
                {
                alt31=1;
                }
                break;
            case 131:
                {
                alt31=2;
                }
                break;
            case 128:
                {
                alt31=3;
                }
                break;
            case 112:
                {
                alt31=4;
                }
                break;
            case 138:
                {
                alt31=5;
                }
                break;
            case 101:
                {
                alt31=6;
                }
                break;
            case 130:
                {
                alt31=7;
                }
                break;
            case 126:
                {
                alt31=8;
                }
                break;
            case 115:
                {
                alt31=9;
                }
                break;
            case 116:
                {
                alt31=10;
                }
                break;
            case 145:
                {
                alt31=11;
                }
                break;
            case ADD_TAG_PREFIX:
            case 94:
                {
                alt31=12;
                }
                break;
            case REMOVE_TAG_PREFIX:
            case 127:
                {
                alt31=13;
                }
                break;
            case 104:
                {
                alt31=14;
                }
                break;
            case 98:
                {
                alt31=15;
                }
                break;
            case COMMAND_CALL_PREFIX:
            case 97:
                {
                alt31=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:4: updateTalkTree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_updateTalkTree_in_triggerEffect1512);
                    updateTalkTree150=updateTalkTree();

                    state._fsp--;

                    adaptor.addChild(root_0, updateTalkTree150.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:6: spawnUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnUnit_in_triggerEffect1519);
                    spawnUnit151=spawnUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnUnit151.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:239:6: removeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeUnit_in_triggerEffect1526);
                    removeUnit152=removeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, removeUnit152.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:240:6: killUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_killUnit_in_triggerEffect1533);
                    killUnit153=killUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, killUnit153.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:6: teleportUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_teleportUnit_in_triggerEffect1540);
                    teleportUnit154=teleportUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, teleportUnit154.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:6: converseUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_converseUnit_in_triggerEffect1547);
                    converseUnit155=converseUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, converseUnit155.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:243:6: createSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_createSaferoom_in_triggerEffect1554);
                    createSaferoom156=createSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, createSaferoom156.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:244:6: removeSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeSaferoom_in_triggerEffect1561);
                    removeSaferoom157=removeSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, removeSaferoom157.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:6: loadMap
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_loadMap_in_triggerEffect1568);
                    loadMap158=loadMap();

                    state._fsp--;

                    adaptor.addChild(root_0, loadMap158.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:6: lockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lockDoor_in_triggerEffect1575);
                    lockDoor159=lockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, lockDoor159.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:247:6: unlockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unlockDoor_in_triggerEffect1582);
                    unlockDoor160=unlockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, unlockDoor160.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:248:6: addTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_addTag_in_triggerEffect1589);
                    addTag161=addTag();

                    state._fsp--;

                    adaptor.addChild(root_0, addTag161.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:6: removeTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeTag_in_triggerEffect1596);
                    removeTag162=removeTag();

                    state._fsp--;

                    adaptor.addChild(root_0, removeTag162.getTree());

                    }
                    break;
                case 14 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:6: directorBias
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_directorBias_in_triggerEffect1603);
                    directorBias163=directorBias();

                    state._fsp--;

                    adaptor.addChild(root_0, directorBias163.getTree());

                    }
                    break;
                case 15 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:251:6: changeAiNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_changeAiNode_in_triggerEffect1610);
                    changeAiNode164=changeAiNode();

                    state._fsp--;

                    adaptor.addChild(root_0, changeAiNode164.getTree());

                    }
                    break;
                case 16 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:252:6: commandCallList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandCallList_in_triggerEffect1617);
                    commandCallList165=commandCallList();

                    state._fsp--;

                    adaptor.addChild(root_0, commandCallList165.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triggerEffect"


    public static class updateTalkTree_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "updateTalkTree"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:255:1: updateTalkTree : ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) );
    public final AtrophyScriptParser.updateTalkTree_return updateTalkTree() throws RecognitionException {
        AtrophyScriptParser.updateTalkTree_return retval = new AtrophyScriptParser.updateTalkTree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal166=null;
        Token INT168=null;
        Token UPDATE_TREE_PREFIX169=null;
        Token char_literal171=null;
        Token INT172=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral167 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral170 =null;


        CommonTree string_literal166_tree=null;
        CommonTree INT168_tree=null;
        CommonTree UPDATE_TREE_PREFIX169_tree=null;
        CommonTree char_literal171_tree=null;
        CommonTree INT172_tree=null;
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_UPDATE_TREE_PREFIX=new RewriteRuleTokenStream(adaptor,"token UPDATE_TREE_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:255:15: ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==146) ) {
                alt32=1;
            }
            else if ( (LA32_0==UPDATE_TREE_PREFIX) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:256:4: 'updateTalk:' stringLiteral INT
                    {
                    string_literal166=(Token)match(input,146,FOLLOW_146_in_updateTalkTree1632);  
                    stream_146.add(string_literal166);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree1634);
                    stringLiteral167=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral167.getTree());

                    INT168=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree1636);  
                    stream_INT.add(INT168);


                    // AST REWRITE
                    // elements: stringLiteral, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 256:36: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:256:39: ^( UPDATETALK stringLiteral INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(UPDATETALK, "UPDATETALK")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:6: UPDATE_TREE_PREFIX stringLiteral '#' INT
                    {
                    UPDATE_TREE_PREFIX169=(Token)match(input,UPDATE_TREE_PREFIX,FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree1653);  
                    stream_UPDATE_TREE_PREFIX.add(UPDATE_TREE_PREFIX169);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree1655);
                    stringLiteral170=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral170.getTree());

                    char_literal171=(Token)match(input,70,FOLLOW_70_in_updateTalkTree1657);  
                    stream_70.add(char_literal171);


                    INT172=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree1659);  
                    stream_INT.add(INT172);


                    // AST REWRITE
                    // elements: stringLiteral, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 257:47: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:50: ^( UPDATETALK stringLiteral INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(UPDATETALK, "UPDATETALK")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "updateTalkTree"


    public static class isName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isName"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:260:1: isName : 'isName:' stringList -> ^( ISNAME stringList ) ;
    public final AtrophyScriptParser.isName_return isName() throws RecognitionException {
        AtrophyScriptParser.isName_return retval = new AtrophyScriptParser.isName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal173=null;
        AtrophyScriptParser.stringList_return stringList174 =null;


        CommonTree string_literal173_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:260:7: ( 'isName:' stringList -> ^( ISNAME stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:4: 'isName:' stringList
            {
            string_literal173=(Token)match(input,111,FOLLOW_111_in_isName1684);  
            stream_111.add(string_literal173);


            pushFollow(FOLLOW_stringList_in_isName1686);
            stringList174=stringList();

            state._fsp--;

            stream_stringList.add(stringList174.getTree());

            // AST REWRITE
            // elements: stringList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 261:25: -> ^( ISNAME stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:28: ^( ISNAME stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ISNAME, "ISNAME")
                , root_1);

                adaptor.addChild(root_1, stream_stringList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "isName"


    public static class isFaction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isFaction"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:264:1: isFaction : 'isFaction:' stringList -> ^( ISFACTION stringList ) ;
    public final AtrophyScriptParser.isFaction_return isFaction() throws RecognitionException {
        AtrophyScriptParser.isFaction_return retval = new AtrophyScriptParser.isFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal175=null;
        AtrophyScriptParser.stringList_return stringList176 =null;


        CommonTree string_literal175_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:264:10: ( 'isFaction:' stringList -> ^( ISFACTION stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:4: 'isFaction:' stringList
            {
            string_literal175=(Token)match(input,109,FOLLOW_109_in_isFaction1709);  
            stream_109.add(string_literal175);


            pushFollow(FOLLOW_stringList_in_isFaction1711);
            stringList176=stringList();

            state._fsp--;

            stream_stringList.add(stringList176.getTree());

            // AST REWRITE
            // elements: stringList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 265:28: -> ^( ISFACTION stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:31: ^( ISFACTION stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ISFACTION, "ISFACTION")
                , root_1);

                adaptor.addChild(root_1, stream_stringList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "isFaction"


    public static class hasItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hasItem"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:268:1: hasItem : 'hasItem:' stringList -> ^( HASITEM stringList ) ;
    public final AtrophyScriptParser.hasItem_return hasItem() throws RecognitionException {
        AtrophyScriptParser.hasItem_return retval = new AtrophyScriptParser.hasItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal177=null;
        AtrophyScriptParser.stringList_return stringList178 =null;


        CommonTree string_literal177_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:268:8: ( 'hasItem:' stringList -> ^( HASITEM stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:269:4: 'hasItem:' stringList
            {
            string_literal177=(Token)match(input,105,FOLLOW_105_in_hasItem1734);  
            stream_105.add(string_literal177);


            pushFollow(FOLLOW_stringList_in_hasItem1736);
            stringList178=stringList();

            state._fsp--;

            stream_stringList.add(stringList178.getTree());

            // AST REWRITE
            // elements: stringList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 269:26: -> ^( HASITEM stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:269:29: ^( HASITEM stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(HASITEM, "HASITEM")
                , root_1);

                adaptor.addChild(root_1, stream_stringList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hasItem"


    public static class hasWeapon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hasWeapon"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:1: hasWeapon : 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) ;
    public final AtrophyScriptParser.hasWeapon_return hasWeapon() throws RecognitionException {
        AtrophyScriptParser.hasWeapon_return retval = new AtrophyScriptParser.hasWeapon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal179=null;
        AtrophyScriptParser.stringList_return stringList180 =null;


        CommonTree string_literal179_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:10: ( 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:273:4: 'hasWeapon:' stringList
            {
            string_literal179=(Token)match(input,106,FOLLOW_106_in_hasWeapon1759);  
            stream_106.add(string_literal179);


            pushFollow(FOLLOW_stringList_in_hasWeapon1761);
            stringList180=stringList();

            state._fsp--;

            stream_stringList.add(stringList180.getTree());

            // AST REWRITE
            // elements: stringList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 273:28: -> ^( HASWEAPON stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:273:31: ^( HASWEAPON stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(HASWEAPON, "HASWEAPON")
                , root_1);

                adaptor.addChild(root_1, stream_stringList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hasWeapon"


    public static class stringList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringList"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:276:1: stringList : stringLiteral ( ',' ! stringLiteral )* ;
    public final AtrophyScriptParser.stringList_return stringList() throws RecognitionException {
        AtrophyScriptParser.stringList_return retval = new AtrophyScriptParser.stringList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal182=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral181 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral183 =null;


        CommonTree char_literal182_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:276:11: ( stringLiteral ( ',' ! stringLiteral )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:4: stringLiteral ( ',' ! stringLiteral )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_stringLiteral_in_stringList1784);
            stringLiteral181=stringLiteral();

            state._fsp--;

            adaptor.addChild(root_0, stringLiteral181.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:18: ( ',' ! stringLiteral )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==74) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:19: ',' ! stringLiteral
            	    {
            	    char_literal182=(Token)match(input,74,FOLLOW_74_in_stringList1787); 

            	    pushFollow(FOLLOW_stringLiteral_in_stringList1790);
            	    stringLiteral183=stringLiteral();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stringLiteral183.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stringList"


    public static class isAlive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isAlive"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:1: isAlive : 'isAlive?' -> ^( ISALIVE ) ;
    public final AtrophyScriptParser.isAlive_return isAlive() throws RecognitionException {
        AtrophyScriptParser.isAlive_return retval = new AtrophyScriptParser.isAlive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal184=null;

        CommonTree string_literal184_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:8: ( 'isAlive?' -> ^( ISALIVE ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:281:4: 'isAlive?'
            {
            string_literal184=(Token)match(input,108,FOLLOW_108_in_isAlive1805);  
            stream_108.add(string_literal184);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 281:15: -> ^( ISALIVE )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:281:18: ^( ISALIVE )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ISALIVE, "ISALIVE")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "isAlive"


    public static class isInvestigated_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isInvestigated"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:284:1: isInvestigated : 'isInvestigated?' -> ^( ISINVESTIGATED ) ;
    public final AtrophyScriptParser.isInvestigated_return isInvestigated() throws RecognitionException {
        AtrophyScriptParser.isInvestigated_return retval = new AtrophyScriptParser.isInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal185=null;

        CommonTree string_literal185_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:284:15: ( 'isInvestigated?' -> ^( ISINVESTIGATED ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:4: 'isInvestigated?'
            {
            string_literal185=(Token)match(input,110,FOLLOW_110_in_isInvestigated1826);  
            stream_110.add(string_literal185);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 285:22: -> ^( ISINVESTIGATED )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:25: ^( ISINVESTIGATED )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ISINVESTIGATED, "ISINVESTIGATED")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "isInvestigated"


    public static class teleDestination_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "teleDestination"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:288:1: teleDestination : 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) ;
    public final AtrophyScriptParser.teleDestination_return teleDestination() throws RecognitionException {
        AtrophyScriptParser.teleDestination_return retval = new AtrophyScriptParser.teleDestination_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal186=null;
        Token char_literal187=null;
        Token char_literal190=null;
        AtrophyScriptParser.xListProperty_return xListProperty188 =null;

        AtrophyScriptParser.yListProperty_return yListProperty189 =null;


        CommonTree string_literal186_tree=null;
        CommonTree char_literal187_tree=null;
        CommonTree char_literal190_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_yListProperty=new RewriteRuleSubtreeStream(adaptor,"rule yListProperty");
        RewriteRuleSubtreeStream stream_xListProperty=new RewriteRuleSubtreeStream(adaptor,"rule xListProperty");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:288:16: ( 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:289:4: 'destination' '{' xListProperty yListProperty '}'
            {
            string_literal186=(Token)match(input,103,FOLLOW_103_in_teleDestination1847);  
            stream_103.add(string_literal186);


            char_literal187=(Token)match(input,150,FOLLOW_150_in_teleDestination1849);  
            stream_150.add(char_literal187);


            pushFollow(FOLLOW_xListProperty_in_teleDestination1851);
            xListProperty188=xListProperty();

            state._fsp--;

            stream_xListProperty.add(xListProperty188.getTree());

            pushFollow(FOLLOW_yListProperty_in_teleDestination1853);
            yListProperty189=yListProperty();

            state._fsp--;

            stream_yListProperty.add(yListProperty189.getTree());

            char_literal190=(Token)match(input,151,FOLLOW_151_in_teleDestination1855);  
            stream_151.add(char_literal190);


            // AST REWRITE
            // elements: yListProperty, xListProperty
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 289:54: -> ^( TELEDEST xListProperty yListProperty )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:289:57: ^( TELEDEST xListProperty yListProperty )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TELEDEST, "TELEDEST")
                , root_1);

                adaptor.addChild(root_1, stream_xListProperty.nextTree());

                adaptor.addChild(root_1, stream_yListProperty.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "teleDestination"


    public static class unitInfo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unitInfo"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:292:1: unitInfo : ( isName | isFaction | hasItem | hasWeapon | isAlive | isInvestigated | teleDestination )* ;
    public final AtrophyScriptParser.unitInfo_return unitInfo() throws RecognitionException {
        AtrophyScriptParser.unitInfo_return retval = new AtrophyScriptParser.unitInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName191 =null;

        AtrophyScriptParser.isFaction_return isFaction192 =null;

        AtrophyScriptParser.hasItem_return hasItem193 =null;

        AtrophyScriptParser.hasWeapon_return hasWeapon194 =null;

        AtrophyScriptParser.isAlive_return isAlive195 =null;

        AtrophyScriptParser.isInvestigated_return isInvestigated196 =null;

        AtrophyScriptParser.teleDestination_return teleDestination197 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:292:9: ( ( isName | isFaction | hasItem | hasWeapon | isAlive | isInvestigated | teleDestination )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:293:4: ( isName | isFaction | hasItem | hasWeapon | isAlive | isInvestigated | teleDestination )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:293:4: ( isName | isFaction | hasItem | hasWeapon | isAlive | isInvestigated | teleDestination )*
            loop34:
            do {
                int alt34=8;
                switch ( input.LA(1) ) {
                case 111:
                    {
                    alt34=1;
                    }
                    break;
                case 109:
                    {
                    alt34=2;
                    }
                    break;
                case 105:
                    {
                    alt34=3;
                    }
                    break;
                case 106:
                    {
                    alt34=4;
                    }
                    break;
                case 108:
                    {
                    alt34=5;
                    }
                    break;
                case 110:
                    {
                    alt34=6;
                    }
                    break;
                case 103:
                    {
                    alt34=7;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:293:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_unitInfo1881);
            	    isName191=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName191.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:294:6: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_unitInfo1888);
            	    isFaction192=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction192.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:295:6: hasItem
            	    {
            	    pushFollow(FOLLOW_hasItem_in_unitInfo1895);
            	    hasItem193=hasItem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasItem193.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:296:6: hasWeapon
            	    {
            	    pushFollow(FOLLOW_hasWeapon_in_unitInfo1902);
            	    hasWeapon194=hasWeapon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasWeapon194.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:297:6: isAlive
            	    {
            	    pushFollow(FOLLOW_isAlive_in_unitInfo1909);
            	    isAlive195=isAlive();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isAlive195.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:298:6: isInvestigated
            	    {
            	    pushFollow(FOLLOW_isInvestigated_in_unitInfo1916);
            	    isInvestigated196=isInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isInvestigated196.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:6: teleDestination
            	    {
            	    pushFollow(FOLLOW_teleDestination_in_unitInfo1923);
            	    teleDestination197=teleDestination();

            	    state._fsp--;

            	    adaptor.addChild(root_0, teleDestination197.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unitInfo"


    public static class spawnUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spawnUnit"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:302:1: spawnUnit : 'spawnUnit' '{' unitInfo '}' -> ^( SPAWNUNIT unitInfo ) ;
    public final AtrophyScriptParser.spawnUnit_return spawnUnit() throws RecognitionException {
        AtrophyScriptParser.spawnUnit_return retval = new AtrophyScriptParser.spawnUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal198=null;
        Token char_literal199=null;
        Token char_literal201=null;
        AtrophyScriptParser.unitInfo_return unitInfo200 =null;


        CommonTree string_literal198_tree=null;
        CommonTree char_literal199_tree=null;
        CommonTree char_literal201_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:302:10: ( 'spawnUnit' '{' unitInfo '}' -> ^( SPAWNUNIT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:303:4: 'spawnUnit' '{' unitInfo '}'
            {
            string_literal198=(Token)match(input,131,FOLLOW_131_in_spawnUnit1942);  
            stream_131.add(string_literal198);


            char_literal199=(Token)match(input,150,FOLLOW_150_in_spawnUnit1944);  
            stream_150.add(char_literal199);


            pushFollow(FOLLOW_unitInfo_in_spawnUnit1946);
            unitInfo200=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo200.getTree());

            char_literal201=(Token)match(input,151,FOLLOW_151_in_spawnUnit1948);  
            stream_151.add(char_literal201);


            // AST REWRITE
            // elements: unitInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 303:33: -> ^( SPAWNUNIT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:303:36: ^( SPAWNUNIT unitInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SPAWNUNIT, "SPAWNUNIT")
                , root_1);

                adaptor.addChild(root_1, stream_unitInfo.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "spawnUnit"


    public static class removeUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "removeUnit"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:306:1: removeUnit : 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) ;
    public final AtrophyScriptParser.removeUnit_return removeUnit() throws RecognitionException {
        AtrophyScriptParser.removeUnit_return retval = new AtrophyScriptParser.removeUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal202=null;
        Token char_literal203=null;
        Token char_literal205=null;
        AtrophyScriptParser.unitInfo_return unitInfo204 =null;


        CommonTree string_literal202_tree=null;
        CommonTree char_literal203_tree=null;
        CommonTree char_literal205_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:306:11: ( 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:307:4: 'removeUnit' '{' unitInfo '}'
            {
            string_literal202=(Token)match(input,128,FOLLOW_128_in_removeUnit1971);  
            stream_128.add(string_literal202);


            char_literal203=(Token)match(input,150,FOLLOW_150_in_removeUnit1973);  
            stream_150.add(char_literal203);


            pushFollow(FOLLOW_unitInfo_in_removeUnit1975);
            unitInfo204=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo204.getTree());

            char_literal205=(Token)match(input,151,FOLLOW_151_in_removeUnit1977);  
            stream_151.add(char_literal205);


            // AST REWRITE
            // elements: unitInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 307:34: -> ^( REMOVEUNIT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:307:37: ^( REMOVEUNIT unitInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(REMOVEUNIT, "REMOVEUNIT")
                , root_1);

                adaptor.addChild(root_1, stream_unitInfo.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "removeUnit"


    public static class killUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "killUnit"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:310:1: killUnit : 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) ;
    public final AtrophyScriptParser.killUnit_return killUnit() throws RecognitionException {
        AtrophyScriptParser.killUnit_return retval = new AtrophyScriptParser.killUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal206=null;
        Token char_literal207=null;
        Token char_literal209=null;
        AtrophyScriptParser.unitInfo_return unitInfo208 =null;


        CommonTree string_literal206_tree=null;
        CommonTree char_literal207_tree=null;
        CommonTree char_literal209_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:310:9: ( 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:311:4: 'killUnit' '{' unitInfo '}'
            {
            string_literal206=(Token)match(input,112,FOLLOW_112_in_killUnit2000);  
            stream_112.add(string_literal206);


            char_literal207=(Token)match(input,150,FOLLOW_150_in_killUnit2002);  
            stream_150.add(char_literal207);


            pushFollow(FOLLOW_unitInfo_in_killUnit2004);
            unitInfo208=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo208.getTree());

            char_literal209=(Token)match(input,151,FOLLOW_151_in_killUnit2006);  
            stream_151.add(char_literal209);


            // AST REWRITE
            // elements: unitInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 311:32: -> ^( KILLUNIT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:311:35: ^( KILLUNIT unitInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KILLUNIT, "KILLUNIT")
                , root_1);

                adaptor.addChild(root_1, stream_unitInfo.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "killUnit"


    public static class teleportUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "teleportUnit"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:314:1: teleportUnit : 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) ;
    public final AtrophyScriptParser.teleportUnit_return teleportUnit() throws RecognitionException {
        AtrophyScriptParser.teleportUnit_return retval = new AtrophyScriptParser.teleportUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal210=null;
        Token char_literal211=null;
        Token char_literal213=null;
        AtrophyScriptParser.unitInfo_return unitInfo212 =null;


        CommonTree string_literal210_tree=null;
        CommonTree char_literal211_tree=null;
        CommonTree char_literal213_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:314:13: ( 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:315:4: 'teleport' '{' unitInfo '}'
            {
            string_literal210=(Token)match(input,138,FOLLOW_138_in_teleportUnit2029);  
            stream_138.add(string_literal210);


            char_literal211=(Token)match(input,150,FOLLOW_150_in_teleportUnit2031);  
            stream_150.add(char_literal211);


            pushFollow(FOLLOW_unitInfo_in_teleportUnit2033);
            unitInfo212=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo212.getTree());

            char_literal213=(Token)match(input,151,FOLLOW_151_in_teleportUnit2035);  
            stream_151.add(char_literal213);


            // AST REWRITE
            // elements: unitInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 315:32: -> ^( TELEPORT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:315:35: ^( TELEPORT unitInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TELEPORT, "TELEPORT")
                , root_1);

                adaptor.addChild(root_1, stream_unitInfo.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "teleportUnit"


    public static class converseUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "converseUnit"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:318:1: converseUnit : 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) ;
    public final AtrophyScriptParser.converseUnit_return converseUnit() throws RecognitionException {
        AtrophyScriptParser.converseUnit_return retval = new AtrophyScriptParser.converseUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal214=null;
        Token char_literal215=null;
        Token char_literal217=null;
        AtrophyScriptParser.unitInfo_return unitInfo216 =null;


        CommonTree string_literal214_tree=null;
        CommonTree char_literal215_tree=null;
        CommonTree char_literal217_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:318:13: ( 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:319:4: 'converse' '{' unitInfo '}'
            {
            string_literal214=(Token)match(input,101,FOLLOW_101_in_converseUnit2058);  
            stream_101.add(string_literal214);


            char_literal215=(Token)match(input,150,FOLLOW_150_in_converseUnit2060);  
            stream_150.add(char_literal215);


            pushFollow(FOLLOW_unitInfo_in_converseUnit2062);
            unitInfo216=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo216.getTree());

            char_literal217=(Token)match(input,151,FOLLOW_151_in_converseUnit2064);  
            stream_151.add(char_literal217);


            // AST REWRITE
            // elements: unitInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 319:32: -> ^( CONVERSE unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:319:35: ^( CONVERSE unitInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONVERSE, "CONVERSE")
                , root_1);

                adaptor.addChild(root_1, stream_unitInfo.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "converseUnit"


    public static class createSaferoom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createSaferoom"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:322:1: createSaferoom : 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.createSaferoom_return createSaferoom() throws RecognitionException {
        AtrophyScriptParser.createSaferoom_return retval = new AtrophyScriptParser.createSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal218=null;
        Token char_literal219=null;
        Token char_literal221=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo220 =null;


        CommonTree string_literal218_tree=null;
        CommonTree char_literal219_tree=null;
        CommonTree char_literal221_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:322:15: ( 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:323:4: 'saferoom' '{' saferoomInfo '}'
            {
            string_literal218=(Token)match(input,130,FOLLOW_130_in_createSaferoom2087);  
            stream_130.add(string_literal218);


            char_literal219=(Token)match(input,150,FOLLOW_150_in_createSaferoom2089);  
            stream_150.add(char_literal219);


            pushFollow(FOLLOW_saferoomInfo_in_createSaferoom2091);
            saferoomInfo220=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo220.getTree());

            char_literal221=(Token)match(input,151,FOLLOW_151_in_createSaferoom2093);  
            stream_151.add(char_literal221);


            // AST REWRITE
            // elements: saferoomInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 323:36: -> ^( SAFEROOM saferoomInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:323:39: ^( SAFEROOM saferoomInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SAFEROOM, "SAFEROOM")
                , root_1);

                adaptor.addChild(root_1, stream_saferoomInfo.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "createSaferoom"


    public static class removeSaferoom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "removeSaferoom"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:326:1: removeSaferoom : 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.removeSaferoom_return removeSaferoom() throws RecognitionException {
        AtrophyScriptParser.removeSaferoom_return retval = new AtrophyScriptParser.removeSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal222=null;
        Token char_literal223=null;
        Token char_literal225=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo224 =null;


        CommonTree string_literal222_tree=null;
        CommonTree char_literal223_tree=null;
        CommonTree char_literal225_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:326:15: ( 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:4: 'removeSaferoom' '{' saferoomInfo '}'
            {
            string_literal222=(Token)match(input,126,FOLLOW_126_in_removeSaferoom2116);  
            stream_126.add(string_literal222);


            char_literal223=(Token)match(input,150,FOLLOW_150_in_removeSaferoom2118);  
            stream_150.add(char_literal223);


            pushFollow(FOLLOW_saferoomInfo_in_removeSaferoom2120);
            saferoomInfo224=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo224.getTree());

            char_literal225=(Token)match(input,151,FOLLOW_151_in_removeSaferoom2122);  
            stream_151.add(char_literal225);


            // AST REWRITE
            // elements: saferoomInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 327:42: -> ^( REMOVESAFEROOM saferoomInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:45: ^( REMOVESAFEROOM saferoomInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(REMOVESAFEROOM, "REMOVESAFEROOM")
                , root_1);

                adaptor.addChild(root_1, stream_saferoomInfo.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "removeSaferoom"


    public static class containsFaction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "containsFaction"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:330:1: containsFaction : 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) ;
    public final AtrophyScriptParser.containsFaction_return containsFaction() throws RecognitionException {
        AtrophyScriptParser.containsFaction_return retval = new AtrophyScriptParser.containsFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal226=null;
        AtrophyScriptParser.stringList_return stringList227 =null;


        CommonTree string_literal226_tree=null;
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:330:16: ( 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:4: 'containsFaction:' stringList
            {
            string_literal226=(Token)match(input,100,FOLLOW_100_in_containsFaction2145);  
            stream_100.add(string_literal226);


            pushFollow(FOLLOW_stringList_in_containsFaction2147);
            stringList227=stringList();

            state._fsp--;

            stream_stringList.add(stringList227.getTree());

            // AST REWRITE
            // elements: stringList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 331:34: -> ^( CONTAINSFACTION stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:37: ^( CONTAINSFACTION stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONTAINSFACTION, "CONTAINSFACTION")
                , root_1);

                adaptor.addChild(root_1, stream_stringList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "containsFaction"


    public static class saferoomInfo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "saferoomInfo"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:334:1: saferoomInfo : ( containsFaction | isName )* ;
    public final AtrophyScriptParser.saferoomInfo_return saferoomInfo() throws RecognitionException {
        AtrophyScriptParser.saferoomInfo_return retval = new AtrophyScriptParser.saferoomInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.containsFaction_return containsFaction228 =null;

        AtrophyScriptParser.isName_return isName229 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:334:13: ( ( containsFaction | isName )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:4: ( containsFaction | isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:4: ( containsFaction | isName )*
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==100) ) {
                    alt35=1;
                }
                else if ( (LA35_0==111) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:5: containsFaction
            	    {
            	    pushFollow(FOLLOW_containsFaction_in_saferoomInfo2171);
            	    containsFaction228=containsFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, containsFaction228.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:6: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_saferoomInfo2178);
            	    isName229=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName229.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "saferoomInfo"


    public static class loadMap_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "loadMap"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:339:1: loadMap : 'loadMap:' stringLiteral -> ^( LOADMAP stringLiteral ) ;
    public final AtrophyScriptParser.loadMap_return loadMap() throws RecognitionException {
        AtrophyScriptParser.loadMap_return retval = new AtrophyScriptParser.loadMap_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal230=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral231 =null;


        CommonTree string_literal230_tree=null;
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:339:8: ( 'loadMap:' stringLiteral -> ^( LOADMAP stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:4: 'loadMap:' stringLiteral
            {
            string_literal230=(Token)match(input,115,FOLLOW_115_in_loadMap2195);  
            stream_115.add(string_literal230);


            pushFollow(FOLLOW_stringLiteral_in_loadMap2197);
            stringLiteral231=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral231.getTree());

            // AST REWRITE
            // elements: stringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 340:29: -> ^( LOADMAP stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:32: ^( LOADMAP stringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LOADMAP, "LOADMAP")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "loadMap"


    public static class lockDoor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lockDoor"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:343:1: lockDoor : 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.lockDoor_return lockDoor() throws RecognitionException {
        AtrophyScriptParser.lockDoor_return retval = new AtrophyScriptParser.lockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal232=null;
        Token char_literal233=null;
        Token char_literal235=null;
        AtrophyScriptParser.doorInfo_return doorInfo234 =null;


        CommonTree string_literal232_tree=null;
        CommonTree char_literal233_tree=null;
        CommonTree char_literal235_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:343:9: ( 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:344:4: 'lockDoor' '{' doorInfo '}'
            {
            string_literal232=(Token)match(input,116,FOLLOW_116_in_lockDoor2220);  
            stream_116.add(string_literal232);


            char_literal233=(Token)match(input,150,FOLLOW_150_in_lockDoor2222);  
            stream_150.add(char_literal233);


            pushFollow(FOLLOW_doorInfo_in_lockDoor2224);
            doorInfo234=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo234.getTree());

            char_literal235=(Token)match(input,151,FOLLOW_151_in_lockDoor2226);  
            stream_151.add(char_literal235);


            // AST REWRITE
            // elements: doorInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 344:32: -> ^( LOCKDOOR doorInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:344:35: ^( LOCKDOOR doorInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LOCKDOOR, "LOCKDOOR")
                , root_1);

                adaptor.addChild(root_1, stream_doorInfo.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lockDoor"


    public static class unlockDoor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unlockDoor"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:347:1: unlockDoor : 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.unlockDoor_return unlockDoor() throws RecognitionException {
        AtrophyScriptParser.unlockDoor_return retval = new AtrophyScriptParser.unlockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal236=null;
        Token char_literal237=null;
        Token char_literal239=null;
        AtrophyScriptParser.doorInfo_return doorInfo238 =null;


        CommonTree string_literal236_tree=null;
        CommonTree char_literal237_tree=null;
        CommonTree char_literal239_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:347:11: ( 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:348:4: 'unlockDoor' '{' doorInfo '}'
            {
            string_literal236=(Token)match(input,145,FOLLOW_145_in_unlockDoor2249);  
            stream_145.add(string_literal236);


            char_literal237=(Token)match(input,150,FOLLOW_150_in_unlockDoor2251);  
            stream_150.add(char_literal237);


            pushFollow(FOLLOW_doorInfo_in_unlockDoor2253);
            doorInfo238=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo238.getTree());

            char_literal239=(Token)match(input,151,FOLLOW_151_in_unlockDoor2255);  
            stream_151.add(char_literal239);


            // AST REWRITE
            // elements: doorInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 348:34: -> ^( UNLOCKDOOR doorInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:348:37: ^( UNLOCKDOOR doorInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UNLOCKDOOR, "UNLOCKDOOR")
                , root_1);

                adaptor.addChild(root_1, stream_doorInfo.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unlockDoor"


    public static class doorInfo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doorInfo"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:1: doorInfo : 'name:' stringList -> ^( DOORNAMES stringList ) ;
    public final AtrophyScriptParser.doorInfo_return doorInfo() throws RecognitionException {
        AtrophyScriptParser.doorInfo_return retval = new AtrophyScriptParser.doorInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal240=null;
        AtrophyScriptParser.stringList_return stringList241 =null;


        CommonTree string_literal240_tree=null;
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:9: ( 'name:' stringList -> ^( DOORNAMES stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:4: 'name:' stringList
            {
            string_literal240=(Token)match(input,119,FOLLOW_119_in_doorInfo2278);  
            stream_119.add(string_literal240);


            pushFollow(FOLLOW_stringList_in_doorInfo2280);
            stringList241=stringList();

            state._fsp--;

            stream_stringList.add(stringList241.getTree());

            // AST REWRITE
            // elements: stringList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 352:23: -> ^( DOORNAMES stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:26: ^( DOORNAMES stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DOORNAMES, "DOORNAMES")
                , root_1);

                adaptor.addChild(root_1, stream_stringList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "doorInfo"


    public static class addTag_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addTag"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:1: addTag : ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) );
    public final AtrophyScriptParser.addTag_return addTag() throws RecognitionException {
        AtrophyScriptParser.addTag_return retval = new AtrophyScriptParser.addTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal242=null;
        Token ADD_TAG_PREFIX244=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral243 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral245 =null;


        CommonTree string_literal242_tree=null;
        CommonTree ADD_TAG_PREFIX244_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_ADD_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token ADD_TAG_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:7: ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==94) ) {
                alt36=1;
            }
            else if ( (LA36_0==ADD_TAG_PREFIX) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:4: 'addTag:' stringLiteral
                    {
                    string_literal242=(Token)match(input,94,FOLLOW_94_in_addTag2303);  
                    stream_94.add(string_literal242);


                    pushFollow(FOLLOW_stringLiteral_in_addTag2305);
                    stringLiteral243=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral243.getTree());

                    // AST REWRITE
                    // elements: stringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 356:28: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:31: ^( ADDTAG stringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ADDTAG, "ADDTAG")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:357:6: ADD_TAG_PREFIX stringLiteral
                    {
                    ADD_TAG_PREFIX244=(Token)match(input,ADD_TAG_PREFIX,FOLLOW_ADD_TAG_PREFIX_in_addTag2320);  
                    stream_ADD_TAG_PREFIX.add(ADD_TAG_PREFIX244);


                    pushFollow(FOLLOW_stringLiteral_in_addTag2322);
                    stringLiteral245=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral245.getTree());

                    // AST REWRITE
                    // elements: stringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 357:35: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:357:38: ^( ADDTAG stringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ADDTAG, "ADDTAG")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "addTag"


    public static class removeTag_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "removeTag"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:1: removeTag : ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) );
    public final AtrophyScriptParser.removeTag_return removeTag() throws RecognitionException {
        AtrophyScriptParser.removeTag_return retval = new AtrophyScriptParser.removeTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal246=null;
        Token REMOVE_TAG_PREFIX248=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral247 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral249 =null;


        CommonTree string_literal246_tree=null;
        CommonTree REMOVE_TAG_PREFIX248_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_REMOVE_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token REMOVE_TAG_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:10: ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==127) ) {
                alt37=1;
            }
            else if ( (LA37_0==REMOVE_TAG_PREFIX) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:361:4: 'removeTag:' stringLiteral
                    {
                    string_literal246=(Token)match(input,127,FOLLOW_127_in_removeTag2345);  
                    stream_127.add(string_literal246);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag2347);
                    stringLiteral247=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral247.getTree());

                    // AST REWRITE
                    // elements: stringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 361:31: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:361:34: ^( REMOVETAG stringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(REMOVETAG, "REMOVETAG")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:362:6: REMOVE_TAG_PREFIX stringLiteral
                    {
                    REMOVE_TAG_PREFIX248=(Token)match(input,REMOVE_TAG_PREFIX,FOLLOW_REMOVE_TAG_PREFIX_in_removeTag2362);  
                    stream_REMOVE_TAG_PREFIX.add(REMOVE_TAG_PREFIX248);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag2364);
                    stringLiteral249=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral249.getTree());

                    // AST REWRITE
                    // elements: stringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 362:38: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:362:41: ^( REMOVETAG stringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(REMOVETAG, "REMOVETAG")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "removeTag"


    public static class directorBias_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "directorBias"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:365:1: directorBias : 'directorBias:' -> ^( DIRECTORBIAS ) ;
    public final AtrophyScriptParser.directorBias_return directorBias() throws RecognitionException {
        AtrophyScriptParser.directorBias_return retval = new AtrophyScriptParser.directorBias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal250=null;

        CommonTree string_literal250_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:365:13: ( 'directorBias:' -> ^( DIRECTORBIAS ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:366:4: 'directorBias:'
            {
            string_literal250=(Token)match(input,104,FOLLOW_104_in_directorBias2387);  
            stream_104.add(string_literal250);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 366:20: -> ^( DIRECTORBIAS )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:366:23: ^( DIRECTORBIAS )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DIRECTORBIAS, "DIRECTORBIAS")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "directorBias"


    public static class changeAiNode_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "changeAiNode"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:369:1: changeAiNode : 'changeAiNode:' -> ^( CHANGEAINODE ) ;
    public final AtrophyScriptParser.changeAiNode_return changeAiNode() throws RecognitionException {
        AtrophyScriptParser.changeAiNode_return retval = new AtrophyScriptParser.changeAiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal251=null;

        CommonTree string_literal251_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:369:13: ( 'changeAiNode:' -> ^( CHANGEAINODE ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:370:4: 'changeAiNode:'
            {
            string_literal251=(Token)match(input,98,FOLLOW_98_in_changeAiNode2408);  
            stream_98.add(string_literal251);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 370:21: -> ^( CHANGEAINODE )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:370:24: ^( CHANGEAINODE )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CHANGEAINODE, "CHANGEAINODE")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "changeAiNode"


    public static class beginStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "beginStatement"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:373:1: beginStatement : ( 'INIT' | 'init' ) '{' commandCallList '}' -> ^( INIT commandCallList ) ;
    public final AtrophyScriptParser.beginStatement_return beginStatement() throws RecognitionException {
        AtrophyScriptParser.beginStatement_return retval = new AtrophyScriptParser.beginStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal252=null;
        Token string_literal253=null;
        Token char_literal254=null;
        Token char_literal256=null;
        AtrophyScriptParser.commandCallList_return commandCallList255 =null;


        CommonTree string_literal252_tree=null;
        CommonTree string_literal253_tree=null;
        CommonTree char_literal254_tree=null;
        CommonTree char_literal256_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_commandCallList=new RewriteRuleSubtreeStream(adaptor,"rule commandCallList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:373:15: ( ( 'INIT' | 'init' ) '{' commandCallList '}' -> ^( INIT commandCallList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:374:4: ( 'INIT' | 'init' ) '{' commandCallList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:374:4: ( 'INIT' | 'init' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==85) ) {
                alt38=1;
            }
            else if ( (LA38_0==107) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:374:5: 'INIT'
                    {
                    string_literal252=(Token)match(input,85,FOLLOW_85_in_beginStatement2431);  
                    stream_85.add(string_literal252);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:374:14: 'init'
                    {
                    string_literal253=(Token)match(input,107,FOLLOW_107_in_beginStatement2435);  
                    stream_107.add(string_literal253);


                    }
                    break;

            }


            char_literal254=(Token)match(input,150,FOLLOW_150_in_beginStatement2438);  
            stream_150.add(char_literal254);


            pushFollow(FOLLOW_commandCallList_in_beginStatement2443);
            commandCallList255=commandCallList();

            state._fsp--;

            stream_commandCallList.add(commandCallList255.getTree());

            char_literal256=(Token)match(input,151,FOLLOW_151_in_beginStatement2448);  
            stream_151.add(char_literal256);


            // AST REWRITE
            // elements: commandCallList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 377:4: -> ^( INIT commandCallList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:378:4: ^( INIT commandCallList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INIT, "INIT")
                , root_1);

                adaptor.addChild(root_1, stream_commandCallList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "beginStatement"


    public static class commandCallList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commandCallList"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:381:1: commandCallList : commandCall ( ',' ! commandCall )* ;
    public final AtrophyScriptParser.commandCallList_return commandCallList() throws RecognitionException {
        AtrophyScriptParser.commandCallList_return retval = new AtrophyScriptParser.commandCallList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal258=null;
        AtrophyScriptParser.commandCall_return commandCall257 =null;

        AtrophyScriptParser.commandCall_return commandCall259 =null;


        CommonTree char_literal258_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:381:16: ( commandCall ( ',' ! commandCall )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:382:4: commandCall ( ',' ! commandCall )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_commandCall_in_commandCallList2475);
            commandCall257=commandCall();

            state._fsp--;

            adaptor.addChild(root_0, commandCall257.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:382:16: ( ',' ! commandCall )*
            loop39:
            do {
                int alt39=2;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:382:17: ',' ! commandCall
            	    {
            	    char_literal258=(Token)match(input,74,FOLLOW_74_in_commandCallList2478); 

            	    pushFollow(FOLLOW_commandCall_in_commandCallList2481);
            	    commandCall259=commandCall();

            	    state._fsp--;

            	    adaptor.addChild(root_0, commandCall259.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "commandCallList"


    public static class commandCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commandCall"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:385:1: commandCall : ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) );
    public final AtrophyScriptParser.commandCall_return commandCall() throws RecognitionException {
        AtrophyScriptParser.commandCall_return retval = new AtrophyScriptParser.commandCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal260=null;
        Token COMMAND_CALL_PREFIX262=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral261 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral263 =null;


        CommonTree string_literal260_tree=null;
        CommonTree COMMAND_CALL_PREFIX262_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_COMMAND_CALL_PREFIX=new RewriteRuleTokenStream(adaptor,"token COMMAND_CALL_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:385:12: ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==97) ) {
                alt40=1;
            }
            else if ( (LA40_0==COMMAND_CALL_PREFIX) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:386:4: 'callCommand:' stringLiteral
                    {
                    string_literal260=(Token)match(input,97,FOLLOW_97_in_commandCall2498);  
                    stream_97.add(string_literal260);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall2500);
                    stringLiteral261=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral261.getTree());

                    // AST REWRITE
                    // elements: stringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 386:33: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:386:36: ^( COMMAND_CALL stringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(COMMAND_CALL, "COMMAND_CALL")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:387:6: COMMAND_CALL_PREFIX stringLiteral
                    {
                    COMMAND_CALL_PREFIX262=(Token)match(input,COMMAND_CALL_PREFIX,FOLLOW_COMMAND_CALL_PREFIX_in_commandCall2515);  
                    stream_COMMAND_CALL_PREFIX.add(COMMAND_CALL_PREFIX262);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall2517);
                    stringLiteral263=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral263.getTree());

                    // AST REWRITE
                    // elements: stringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 387:40: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:387:43: ^( COMMAND_CALL stringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(COMMAND_CALL, "COMMAND_CALL")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "commandCall"


    public static class stringLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringLiteral"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:390:1: stringLiteral : '\"' ! ( . )* '\"' !;
    public final AtrophyScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        AtrophyScriptParser.stringLiteral_return retval = new AtrophyScriptParser.stringLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal264=null;
        Token wildcard265=null;
        Token char_literal266=null;

        CommonTree char_literal264_tree=null;
        CommonTree wildcard265_tree=null;
        CommonTree char_literal266_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:390:14: ( '\"' ! ( . )* '\"' !)
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:391:4: '\"' ! ( . )* '\"' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal264=(Token)match(input,69,FOLLOW_69_in_stringLiteral2540); 

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:391:9: ( . )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==69) ) {
                    alt41=2;
                }
                else if ( ((LA41_0 >= ADDTAG && LA41_0 <= 68)||(LA41_0 >= 70 && LA41_0 <= 151)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:391:10: .
            	    {
            	    wildcard265=(Token)input.LT(1);

            	    matchAny(input); 
            	    wildcard265_tree = (CommonTree)adaptor.create(wildcard265);
            	    adaptor.addChild(root_0, wildcard265_tree);


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            char_literal266=(Token)match(input,69,FOLLOW_69_in_stringLiteral2548); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stringLiteral"

    // Delegated rules


    protected DFA39 dfa39 = new DFA39(this);
    static final String DFA39_eotS =
        "\13\uffff";
    static final String DFA39_eofS =
        "\13\uffff";
    static final String DFA39_minS =
        "\1\112\1\5\1\uffff\2\105\2\4\1\uffff\1\4\1\uffff\1\4";
    static final String DFA39_maxS =
        "\1\u0097\1\u0092\1\uffff\2\105\2\u0097\1\uffff\1\u0097\1\uffff\1"+
        "\u0097";
    static final String DFA39_acceptS =
        "\2\uffff\1\2\4\uffff\1\1\1\uffff\1\1\1\uffff";
    static final String DFA39_specialS =
        "\13\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1\114\uffff\1\2",
            "\1\2\6\uffff\1\4\35\uffff\1\2\23\uffff\1\2\37\uffff\1\2\2\uffff"+
            "\1\3\1\2\2\uffff\1\2\2\uffff\1\2\7\uffff\1\2\2\uffff\2\2\11"+
            "\uffff\3\2\1\uffff\2\2\6\uffff\1\2\6\uffff\2\2",
            "",
            "\1\5",
            "\1\6",
            "\101\10\1\7\122\10",
            "\101\12\1\11\122\12",
            "",
            "\101\10\1\7\122\10",
            "",
            "\101\12\1\11\122\12"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "()* loopback of 382:16: ( ',' ! commandCall )*";
        }
    }
 

    public static final BitSet FOLLOW_command_in_prog285 = new BitSet(new long[]{0x0000000000000000L,0x206008491FFC0000L,0x00000000000070C0L});
    public static final BitSet FOLLOW_beginStatement_in_prog292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSize_in_command315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSpawns_in_command322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockDecl_in_command329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portalDecl_in_command336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coverDecl_in_command343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stashDecl_in_command350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textureBlockDecl_in_command357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerDecl_in_command364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandDecl_in_command371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_talkDecl_in_command378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_requiredAssignment391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_requiredAssignment393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requiredAssignment_in_varAssignment417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_mapSize444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_117_in_mapSize448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_mapSize451 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mapSize453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_mapSize455 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mapSize457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_mapSize459 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mapSize461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_mapSize463 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mapSize465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_mapSize467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_mapSpawns492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_118_in_mapSpawns496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_mapSpawns499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringList_in_mapSpawns501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_mapSpawns504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_blockDecl529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000400000L});
    public static final BitSet FOLLOW_96_in_blockDecl533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000400000L});
    public static final BitSet FOLLOW_varAssignment_in_blockDecl536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_blockDecl538 = new BitSet(new long[]{0x0000000000000000L,0x1F060000A0000000L,0x0000000000B98B36L});
    public static final BitSet FOLLOW_properties_in_blockDecl540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_blockDecl542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_portalDecl568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000400000L});
    public static final BitSet FOLLOW_125_in_portalDecl572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000400000L});
    public static final BitSet FOLLOW_varAssignment_in_portalDecl575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_portalDecl577 = new BitSet(new long[]{0x0000000000000000L,0x1F060000A0000000L,0x0000000000B98B36L});
    public static final BitSet FOLLOW_properties_in_portalDecl579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_portalDecl581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_coverDecl607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000400000L});
    public static final BitSet FOLLOW_102_in_coverDecl611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000400000L});
    public static final BitSet FOLLOW_varAssignment_in_coverDecl614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_coverDecl616 = new BitSet(new long[]{0x0000000000000000L,0x1F060000A0000000L,0x0000000000B98B36L});
    public static final BitSet FOLLOW_properties_in_coverDecl618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_coverDecl620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_stashDecl646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000400000L});
    public static final BitSet FOLLOW_134_in_stashDecl650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000400000L});
    public static final BitSet FOLLOW_varAssignment_in_stashDecl653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_stashDecl655 = new BitSet(new long[]{0x0000000000000000L,0x1F060000A0000000L,0x0000000000B98B36L});
    public static final BitSet FOLLOW_properties_in_stashDecl657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_stashDecl659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_textureBlockDecl685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_141_in_textureBlockDecl689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_140_in_textureBlockDecl693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_textureBlockDecl696 = new BitSet(new long[]{0x0000000000000000L,0x1F060000A0000000L,0x0000000000B98B36L});
    public static final BitSet FOLLOW_properties_in_textureBlockDecl698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_textureBlockDecl700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_triggerDecl724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_142_in_triggerDecl728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_requiredAssignment_in_triggerDecl731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_triggerDecl733 = new BitSet(new long[]{0x0000000000000000L,0x1F060000A0000000L,0x0000000000B98B36L});
    public static final BitSet FOLLOW_properties_in_triggerDecl735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_triggerDecl737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_commandDecl763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_99_in_commandDecl767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_requiredAssignment_in_commandDecl770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_commandDecl772 = new BitSet(new long[]{0x4000040000001020L,0xC019012640000000L,0x000000000006040DL});
    public static final BitSet FOLLOW_triggerEffectList_in_commandDecl774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_commandDecl776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_talkDecl806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_135_in_talkDecl810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_talkDecl813 = new BitSet(new long[]{0x0000000000000000L,0x1F060000A0000000L,0x0000000000B98B36L});
    public static final BitSet FOLLOW_properties_in_talkDecl815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_talkDecl817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xListProperty_in_properties841 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_yListProperty_in_properties848 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_factionTerritoryProperty_in_properties855 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_factionZoneProperty_in_properties862 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_saferoomProperty_in_properties869 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_stageProperty_in_properties876 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_stageDeclProperty_in_properties883 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_talkMapParentProperty_in_properties890 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_aiInitProperty_in_properties897 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_openingLineProperty_in_properties904 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_lineProperty_in_properties911 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_triggerCondProperty_in_properties918 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_triggerEffectProperty_in_properties925 = new BitSet(new long[]{0x0000000000000002L,0x1F060000A0000000L,0x0000000000398B36L});
    public static final BitSet FOLLOW_147_in_xListProperty942 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty944 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_xListProperty947 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty948 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_148_in_yListProperty972 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty974 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_yListProperty977 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty978 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_139_in_factionTerritoryProperty1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_factionTerritoryProperty1006 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_factionTerritoryProperty1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_factionZoneProperty1033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_factionZoneProperty1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_saferoomProperty1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_stageDeclProperty1079 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1081 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_stageDeclProperty1084 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1086 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_124_in_talkMapParentProperty1113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_123_in_talkMapParentProperty1117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_talkMapParentProperty1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_stageProperty1144 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_129_in_stageProperty1148 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_stageProperty1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_aiInitProperty1175 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_93_in_aiInitProperty1179 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BOOL_in_aiInitProperty1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_openingLineProperty1206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_121_in_openingLineProperty1210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_122_in_openingLineProperty1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_openingLineProperty1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_lineProperty1239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_114_in_lineProperty1243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_lineProperty1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_term1269 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000A80L});
    public static final BitSet FOLLOW_condExpression_in_term1271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_term1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_term1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanQuery_in_term1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_unary1328 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000A80L});
    public static final BitSet FOLLOW_negation_in_unary1333 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000A80L});
    public static final BitSet FOLLOW_term_in_unary1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_negation1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_condExpression1386 = new BitSet(new long[]{0x0000000000000002L,0x000000000003E010L});
    public static final BitSet FOLLOW_set_in_condExpression1389 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000A80L});
    public static final BitSet FOLLOW_unary_in_condExpression1412 = new BitSet(new long[]{0x0000000000000002L,0x000000000003E010L});
    public static final BitSet FOLLOW_136_in_triggerCondProperty1430 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000A80L});
    public static final BitSet FOLLOW_143_in_triggerCondProperty1434 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000A80L});
    public static final BitSet FOLLOW_condExpression_in_triggerCondProperty1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_triggerEffectProperty1459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_144_in_triggerEffectProperty1463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_triggerEffectProperty1466 = new BitSet(new long[]{0x4000040000001020L,0xC019012640000000L,0x000000000006040DL});
    public static final BitSet FOLLOW_triggerEffectList_in_triggerEffectProperty1468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_triggerEffectProperty1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_triggerEffectList1494 = new BitSet(new long[]{0x4000040000001020L,0xC019012640000000L,0x000000000006040DL});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1497 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_updateTalkTree_in_triggerEffect1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnUnit_in_triggerEffect1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeUnit_in_triggerEffect1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_killUnit_in_triggerEffect1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_teleportUnit_in_triggerEffect1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_converseUnit_in_triggerEffect1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createSaferoom_in_triggerEffect1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeSaferoom_in_triggerEffect1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loadMap_in_triggerEffect1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lockDoor_in_triggerEffect1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlockDoor_in_triggerEffect1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addTag_in_triggerEffect1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeTag_in_triggerEffect1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directorBias_in_triggerEffect1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeAiNode_in_triggerEffect1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCallList_in_triggerEffect1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_updateTalkTree1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree1634 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_updateTalkTree1657 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_isName1684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_isName1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_isFaction1709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_isFaction1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_hasItem1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_hasItem1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_hasWeapon1759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_hasWeapon1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList1784 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_stringList1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList1790 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_108_in_isAlive1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_isInvestigated1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_teleDestination1847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_teleDestination1849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_xListProperty_in_teleDestination1851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_yListProperty_in_teleDestination1853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_teleDestination1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_unitInfo1881 = new BitSet(new long[]{0x0000000000000002L,0x0000F68000000000L});
    public static final BitSet FOLLOW_isFaction_in_unitInfo1888 = new BitSet(new long[]{0x0000000000000002L,0x0000F68000000000L});
    public static final BitSet FOLLOW_hasItem_in_unitInfo1895 = new BitSet(new long[]{0x0000000000000002L,0x0000F68000000000L});
    public static final BitSet FOLLOW_hasWeapon_in_unitInfo1902 = new BitSet(new long[]{0x0000000000000002L,0x0000F68000000000L});
    public static final BitSet FOLLOW_isAlive_in_unitInfo1909 = new BitSet(new long[]{0x0000000000000002L,0x0000F68000000000L});
    public static final BitSet FOLLOW_isInvestigated_in_unitInfo1916 = new BitSet(new long[]{0x0000000000000002L,0x0000F68000000000L});
    public static final BitSet FOLLOW_teleDestination_in_unitInfo1923 = new BitSet(new long[]{0x0000000000000002L,0x0000F68000000000L});
    public static final BitSet FOLLOW_131_in_spawnUnit1942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_spawnUnit1944 = new BitSet(new long[]{0x0000000000000000L,0x0000F68000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnUnit1946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_spawnUnit1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_removeUnit1971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_removeUnit1973 = new BitSet(new long[]{0x0000000000000000L,0x0000F68000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_unitInfo_in_removeUnit1975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_removeUnit1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_killUnit2000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_killUnit2002 = new BitSet(new long[]{0x0000000000000000L,0x0000F68000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_unitInfo_in_killUnit2004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_killUnit2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_teleportUnit2029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_teleportUnit2031 = new BitSet(new long[]{0x0000000000000000L,0x0000F68000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_unitInfo_in_teleportUnit2033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_teleportUnit2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_converseUnit2058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_converseUnit2060 = new BitSet(new long[]{0x0000000000000000L,0x0000F68000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_unitInfo_in_converseUnit2062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_converseUnit2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_createSaferoom2087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_createSaferoom2089 = new BitSet(new long[]{0x0000000000000000L,0x0000801000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_saferoomInfo_in_createSaferoom2091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_createSaferoom2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_removeSaferoom2116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_removeSaferoom2118 = new BitSet(new long[]{0x0000000000000000L,0x0000801000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_saferoomInfo_in_removeSaferoom2120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_removeSaferoom2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_containsFaction2145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_containsFaction2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsFaction_in_saferoomInfo2171 = new BitSet(new long[]{0x0000000000000002L,0x0000801000000000L});
    public static final BitSet FOLLOW_isName_in_saferoomInfo2178 = new BitSet(new long[]{0x0000000000000002L,0x0000801000000000L});
    public static final BitSet FOLLOW_115_in_loadMap2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_loadMap2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_lockDoor2220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_lockDoor2222 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_doorInfo_in_lockDoor2224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_lockDoor2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_unlockDoor2249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_unlockDoor2251 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_doorInfo_in_unlockDoor2253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_unlockDoor2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_doorInfo2278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_doorInfo2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_addTag2303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_TAG_PREFIX_in_addTag2320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_removeTag2345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_TAG_PREFIX_in_removeTag2362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_directorBias2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_changeAiNode2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_beginStatement2431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_107_in_beginStatement2435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_beginStatement2438 = new BitSet(new long[]{0x0000000000001000L,0x0000000200000000L});
    public static final BitSet FOLLOW_commandCallList_in_beginStatement2443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_beginStatement2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList2475 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_commandCallList2478 = new BitSet(new long[]{0x0000000000001000L,0x0000000200000000L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList2481 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_97_in_commandCall2498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_CALL_PREFIX_in_commandCall2515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_stringLiteral2540 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000FFFFFFL});
    public static final BitSet FOLLOW_69_in_stringLiteral2548 = new BitSet(new long[]{0x0000000000000002L});

}