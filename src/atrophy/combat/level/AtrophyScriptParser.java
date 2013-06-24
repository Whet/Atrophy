// $ANTLR 3.4 C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g 2013-06-24 20:26:43

	package atrophy.combat.level;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AtrophyScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDTAG", "ADD_TAG_PREFIX", "AIINIT", "BLOCK", "BOOL", "CHANGEAINODE", "COMMAND", "COMMAND_CALL", "COMMAND_CALL_PREFIX", "COMMENT", "CONTAINSFACTION", "CONVERSE", "COVER", "DIRECTORBIAS", "DOORNAMES", "EMPTY", "HASITEM", "HASWEAPON", "IDENT", "INIT", "INT", "ISALIVE", "ISFACTION", "ISINVESTIGATED", "ISNAME", "KILLUNIT", "LINE", "LOADMAP", "LOCKDOOR", "MAPSIZE", "MAPSPAWNS", "MULTILINE_COMMENT", "NEGATION", "OPENINGLINE", "PORTAL", "REMOVESAFEROOM", "REMOVETAG", "REMOVEUNIT", "REMOVE_TAG_PREFIX", "SAFEROOM", "SPAWNUNIT", "STAGELIST", "STASH", "TALK", "TALKPARENT", "TALKSTAGE", "TALKTREE", "TELEDEST", "TELEPORT", "TERRITORY", "TEXTURE", "TEXTUREBLOCK", "TRIGGER", "TRIGGERCOND", "TRIGGEREFFECT", "TRIGGERTYPE", "UNLOCKDOOR", "UPDATETALK", "UPDATE_TREE_PREFIX", "VAR", "WS", "XLIST", "YLIST", "ZONE", "'!='", "'\"'", "'#'", "'('", "')'", "'+'", "','", "'-'", "'::'", "'<'", "'<='", "'=='", "'>'", "'>='", "'BLOCK'", "'COMMAND'", "'COVER'", "'INIT'", "'MAPSIZE'", "'MAPSPAWNS'", "'PORTAL'", "'STASH'", "'TALK'", "'TALKMAP'", "'TEXTUREBLOCK'", "'TRIGGER'", "'a:'", "'addTag:'", "'aiInit:'", "'block'", "'callCommand:'", "'changeAiNode:'", "'command'", "'containsFaction:'", "'converse'", "'cover'", "'destination'", "'directorBias:'", "'hasItem:'", "'hasWeapon:'", "'init'", "'isAlive?'", "'isFaction:'", "'isInvestigated?'", "'isName:'", "'killUnit'", "'l:'", "'line:'", "'loadMap:'", "'lockDoor'", "'mapsize'", "'mapspawns'", "'name:'", "'o:'", "'opening:'", "'openingLine:'", "'p:'", "'parent:'", "'portal'", "'removeSaferoom'", "'removeTag:'", "'removeUnit'", "'s:'", "'saferoom'", "'spawnUnit'", "'stage:'", "'stages:'", "'stash'", "'talk'", "'talkMap'", "'talkmap'", "'tc:'", "'te'", "'teleport'", "'territory:'", "'textureBlock'", "'textureblock'", "'trigger'", "'triggerCond:'", "'triggerEffect'", "'unlockDoor'", "'updateTalk:'", "'x:'", "'y:'", "'zone:'", "'{'", "'}'"
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
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__154=154;
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
    public static final int TALKPARENT=48;
    public static final int TALKSTAGE=49;
    public static final int TALKTREE=50;
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

                if ( ((LA1_0 >= 82 && LA1_0 <= 84)||(LA1_0 >= 86 && LA1_0 <= 93)||LA1_0==97||LA1_0==100||LA1_0==103||(LA1_0 >= 118 && LA1_0 <= 119)||LA1_0==126||(LA1_0 >= 135 && LA1_0 <= 138)||(LA1_0 >= 143 && LA1_0 <= 145)) ) {
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

            if ( (LA2_0==85||LA2_0==108) ) {
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:81:1: command : ( mapSize | mapSpawns | blockDecl | portalDecl | coverDecl | stashDecl | textureBlockDecl | triggerDecl | commandDecl | talkTreeDecl | talkDecl );
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

        AtrophyScriptParser.talkTreeDecl_return talkTreeDecl13 =null;

        AtrophyScriptParser.talkDecl_return talkDecl14 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:81:8: ( mapSize | mapSpawns | blockDecl | portalDecl | coverDecl | stashDecl | textureBlockDecl | triggerDecl | commandDecl | talkTreeDecl | talkDecl )
            int alt3=11;
            switch ( input.LA(1) ) {
            case 86:
            case 118:
                {
                alt3=1;
                }
                break;
            case 87:
            case 119:
                {
                alt3=2;
                }
                break;
            case 82:
            case 97:
                {
                alt3=3;
                }
                break;
            case 88:
            case 126:
                {
                alt3=4;
                }
                break;
            case 84:
            case 103:
                {
                alt3=5;
                }
                break;
            case 89:
            case 135:
                {
                alt3=6;
                }
                break;
            case 92:
            case 143:
            case 144:
                {
                alt3=7;
                }
                break;
            case 93:
            case 145:
                {
                alt3=8;
                }
                break;
            case 83:
            case 100:
                {
                alt3=9;
                }
                break;
            case 91:
            case 137:
            case 138:
                {
                alt3=10;
                }
                break;
            case 90:
            case 136:
                {
                alt3=11;
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:91:6: talkTreeDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_talkTreeDecl_in_command378);
                    talkTreeDecl13=talkTreeDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, talkTreeDecl13.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:92:6: talkDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_talkDecl_in_command385);
                    talkDecl14=talkDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, talkDecl14.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:95:1: requiredAssignment : '::' stringLiteral -> ^( VAR stringLiteral ) ;
    public final AtrophyScriptParser.requiredAssignment_return requiredAssignment() throws RecognitionException {
        AtrophyScriptParser.requiredAssignment_return retval = new AtrophyScriptParser.requiredAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal15=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral16 =null;


        CommonTree string_literal15_tree=null;
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:95:19: ( '::' stringLiteral -> ^( VAR stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:96:4: '::' stringLiteral
            {
            string_literal15=(Token)match(input,76,FOLLOW_76_in_requiredAssignment398);  
            stream_76.add(string_literal15);


            pushFollow(FOLLOW_stringLiteral_in_requiredAssignment400);
            stringLiteral16=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral16.getTree());

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
            // 96:23: -> ^( VAR stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:96:26: ^( VAR stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:99:1: varAssignment : ( requiredAssignment | -> ^( EMPTY ) );
    public final AtrophyScriptParser.varAssignment_return varAssignment() throws RecognitionException {
        AtrophyScriptParser.varAssignment_return retval = new AtrophyScriptParser.varAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.requiredAssignment_return requiredAssignment17 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:99:14: ( requiredAssignment | -> ^( EMPTY ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==76) ) {
                alt4=1;
            }
            else if ( (LA4_0==153) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:100:4: requiredAssignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_requiredAssignment_in_varAssignment424);
                    requiredAssignment17=requiredAssignment();

                    state._fsp--;

                    adaptor.addChild(root_0, requiredAssignment17.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:101:6: 
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
                    // 101:6: -> ^( EMPTY )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:101:9: ^( EMPTY )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:104:1: mapSize : ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) ;
    public final AtrophyScriptParser.mapSize_return mapSize() throws RecognitionException {
        AtrophyScriptParser.mapSize_return retval = new AtrophyScriptParser.mapSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal18=null;
        Token string_literal19=null;
        Token char_literal20=null;
        Token INT21=null;
        Token char_literal22=null;
        Token INT23=null;
        Token char_literal24=null;
        Token INT25=null;
        Token char_literal26=null;
        Token INT27=null;
        Token char_literal28=null;

        CommonTree string_literal18_tree=null;
        CommonTree string_literal19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree INT21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree INT23_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree INT25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree INT27_tree=null;
        CommonTree char_literal28_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:104:8: ( ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:105:4: ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:105:4: ( 'MAPSIZE' | 'mapsize' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==86) ) {
                alt5=1;
            }
            else if ( (LA5_0==118) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:105:5: 'MAPSIZE'
                    {
                    string_literal18=(Token)match(input,86,FOLLOW_86_in_mapSize451);  
                    stream_86.add(string_literal18);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:105:17: 'mapsize'
                    {
                    string_literal19=(Token)match(input,118,FOLLOW_118_in_mapSize455);  
                    stream_118.add(string_literal19);


                    }
                    break;

            }


            char_literal20=(Token)match(input,153,FOLLOW_153_in_mapSize458);  
            stream_153.add(char_literal20);


            INT21=(Token)match(input,INT,FOLLOW_INT_in_mapSize460);  
            stream_INT.add(INT21);


            char_literal22=(Token)match(input,74,FOLLOW_74_in_mapSize462);  
            stream_74.add(char_literal22);


            INT23=(Token)match(input,INT,FOLLOW_INT_in_mapSize464);  
            stream_INT.add(INT23);


            char_literal24=(Token)match(input,74,FOLLOW_74_in_mapSize466);  
            stream_74.add(char_literal24);


            INT25=(Token)match(input,INT,FOLLOW_INT_in_mapSize468);  
            stream_INT.add(INT25);


            char_literal26=(Token)match(input,74,FOLLOW_74_in_mapSize470);  
            stream_74.add(char_literal26);


            INT27=(Token)match(input,INT,FOLLOW_INT_in_mapSize472);  
            stream_INT.add(INT27);


            char_literal28=(Token)match(input,154,FOLLOW_154_in_mapSize474);  
            stream_154.add(char_literal28);


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
            // 105:64: -> ^( MAPSIZE ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:105:67: ^( MAPSIZE ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSIZE, "MAPSIZE")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:105:77: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:1: mapSpawns : ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) ;
    public final AtrophyScriptParser.mapSpawns_return mapSpawns() throws RecognitionException {
        AtrophyScriptParser.mapSpawns_return retval = new AtrophyScriptParser.mapSpawns_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal29=null;
        Token string_literal30=null;
        Token char_literal31=null;
        Token char_literal33=null;
        AtrophyScriptParser.stringList_return stringList32 =null;


        CommonTree string_literal29_tree=null;
        CommonTree string_literal30_tree=null;
        CommonTree char_literal31_tree=null;
        CommonTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:10: ( ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:4: ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:4: ( 'MAPSPAWNS' | 'mapspawns' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==87) ) {
                alt6=1;
            }
            else if ( (LA6_0==119) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:5: 'MAPSPAWNS'
                    {
                    string_literal29=(Token)match(input,87,FOLLOW_87_in_mapSpawns499);  
                    stream_87.add(string_literal29);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:19: 'mapspawns'
                    {
                    string_literal30=(Token)match(input,119,FOLLOW_119_in_mapSpawns503);  
                    stream_119.add(string_literal30);


                    }
                    break;

            }


            char_literal31=(Token)match(input,153,FOLLOW_153_in_mapSpawns506);  
            stream_153.add(char_literal31);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:36: ( stringList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==69) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:36: stringList
                    {
                    pushFollow(FOLLOW_stringList_in_mapSpawns508);
                    stringList32=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList32.getTree());

                    }
                    break;

            }


            char_literal33=(Token)match(input,154,FOLLOW_154_in_mapSpawns511);  
            stream_154.add(char_literal33);


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
            // 109:52: -> ^( MAPSPAWNS ( stringList )? )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:55: ^( MAPSPAWNS ( stringList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSPAWNS, "MAPSPAWNS")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:67: ( stringList )?
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:112:1: blockDecl : ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) ;
    public final AtrophyScriptParser.blockDecl_return blockDecl() throws RecognitionException {
        AtrophyScriptParser.blockDecl_return retval = new AtrophyScriptParser.blockDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal34=null;
        Token string_literal35=null;
        Token char_literal37=null;
        Token char_literal39=null;
        AtrophyScriptParser.varAssignment_return varAssignment36 =null;

        AtrophyScriptParser.properties_return properties38 =null;


        CommonTree string_literal34_tree=null;
        CommonTree string_literal35_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree char_literal39_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:112:10: ( ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:4: ( 'BLOCK' | 'block' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:4: ( 'BLOCK' | 'block' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==82) ) {
                alt8=1;
            }
            else if ( (LA8_0==97) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:5: 'BLOCK'
                    {
                    string_literal34=(Token)match(input,82,FOLLOW_82_in_blockDecl536);  
                    stream_82.add(string_literal34);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:15: 'block'
                    {
                    string_literal35=(Token)match(input,97,FOLLOW_97_in_blockDecl540);  
                    stream_97.add(string_literal35);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_blockDecl543);
            varAssignment36=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment36.getTree());

            char_literal37=(Token)match(input,153,FOLLOW_153_in_blockDecl545);  
            stream_153.add(char_literal37);


            pushFollow(FOLLOW_properties_in_blockDecl547);
            properties38=properties();

            state._fsp--;

            stream_properties.add(properties38.getTree());

            char_literal39=(Token)match(input,154,FOLLOW_154_in_blockDecl549);  
            stream_154.add(char_literal39);


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
            // 113:57: -> ^( BLOCK varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:60: ^( BLOCK varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:116:1: portalDecl : ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) ;
    public final AtrophyScriptParser.portalDecl_return portalDecl() throws RecognitionException {
        AtrophyScriptParser.portalDecl_return retval = new AtrophyScriptParser.portalDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal40=null;
        Token string_literal41=null;
        Token char_literal43=null;
        Token char_literal45=null;
        AtrophyScriptParser.varAssignment_return varAssignment42 =null;

        AtrophyScriptParser.properties_return properties44 =null;


        CommonTree string_literal40_tree=null;
        CommonTree string_literal41_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:116:11: ( ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:4: ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:4: ( 'PORTAL' | 'portal' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==88) ) {
                alt9=1;
            }
            else if ( (LA9_0==126) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:5: 'PORTAL'
                    {
                    string_literal40=(Token)match(input,88,FOLLOW_88_in_portalDecl575);  
                    stream_88.add(string_literal40);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:16: 'portal'
                    {
                    string_literal41=(Token)match(input,126,FOLLOW_126_in_portalDecl579);  
                    stream_126.add(string_literal41);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_portalDecl582);
            varAssignment42=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment42.getTree());

            char_literal43=(Token)match(input,153,FOLLOW_153_in_portalDecl584);  
            stream_153.add(char_literal43);


            pushFollow(FOLLOW_properties_in_portalDecl586);
            properties44=properties();

            state._fsp--;

            stream_properties.add(properties44.getTree());

            char_literal45=(Token)match(input,154,FOLLOW_154_in_portalDecl588);  
            stream_154.add(char_literal45);


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
            // 117:59: -> ^( PORTAL varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:62: ^( PORTAL varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:1: coverDecl : ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) ;
    public final AtrophyScriptParser.coverDecl_return coverDecl() throws RecognitionException {
        AtrophyScriptParser.coverDecl_return retval = new AtrophyScriptParser.coverDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal46=null;
        Token string_literal47=null;
        Token char_literal49=null;
        Token char_literal51=null;
        AtrophyScriptParser.varAssignment_return varAssignment48 =null;

        AtrophyScriptParser.properties_return properties50 =null;


        CommonTree string_literal46_tree=null;
        CommonTree string_literal47_tree=null;
        CommonTree char_literal49_tree=null;
        CommonTree char_literal51_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:10: ( ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:4: ( 'COVER' | 'cover' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:4: ( 'COVER' | 'cover' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==84) ) {
                alt10=1;
            }
            else if ( (LA10_0==103) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:5: 'COVER'
                    {
                    string_literal46=(Token)match(input,84,FOLLOW_84_in_coverDecl614);  
                    stream_84.add(string_literal46);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:15: 'cover'
                    {
                    string_literal47=(Token)match(input,103,FOLLOW_103_in_coverDecl618);  
                    stream_103.add(string_literal47);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_coverDecl621);
            varAssignment48=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment48.getTree());

            char_literal49=(Token)match(input,153,FOLLOW_153_in_coverDecl623);  
            stream_153.add(char_literal49);


            pushFollow(FOLLOW_properties_in_coverDecl625);
            properties50=properties();

            state._fsp--;

            stream_properties.add(properties50.getTree());

            char_literal51=(Token)match(input,154,FOLLOW_154_in_coverDecl627);  
            stream_154.add(char_literal51);


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
            // 121:57: -> ^( COVER varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:60: ^( COVER varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:1: stashDecl : ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) ;
    public final AtrophyScriptParser.stashDecl_return stashDecl() throws RecognitionException {
        AtrophyScriptParser.stashDecl_return retval = new AtrophyScriptParser.stashDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal52=null;
        Token string_literal53=null;
        Token char_literal55=null;
        Token char_literal57=null;
        AtrophyScriptParser.varAssignment_return varAssignment54 =null;

        AtrophyScriptParser.properties_return properties56 =null;


        CommonTree string_literal52_tree=null;
        CommonTree string_literal53_tree=null;
        CommonTree char_literal55_tree=null;
        CommonTree char_literal57_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:10: ( ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:4: ( 'STASH' | 'stash' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:4: ( 'STASH' | 'stash' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==89) ) {
                alt11=1;
            }
            else if ( (LA11_0==135) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:5: 'STASH'
                    {
                    string_literal52=(Token)match(input,89,FOLLOW_89_in_stashDecl653);  
                    stream_89.add(string_literal52);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:15: 'stash'
                    {
                    string_literal53=(Token)match(input,135,FOLLOW_135_in_stashDecl657);  
                    stream_135.add(string_literal53);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_stashDecl660);
            varAssignment54=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment54.getTree());

            char_literal55=(Token)match(input,153,FOLLOW_153_in_stashDecl662);  
            stream_153.add(char_literal55);


            pushFollow(FOLLOW_properties_in_stashDecl664);
            properties56=properties();

            state._fsp--;

            stream_properties.add(properties56.getTree());

            char_literal57=(Token)match(input,154,FOLLOW_154_in_stashDecl666);  
            stream_154.add(char_literal57);


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
            // 125:57: -> ^( STASH varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:60: ^( STASH varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:1: textureBlockDecl : ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) ;
    public final AtrophyScriptParser.textureBlockDecl_return textureBlockDecl() throws RecognitionException {
        AtrophyScriptParser.textureBlockDecl_return retval = new AtrophyScriptParser.textureBlockDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal58=null;
        Token string_literal59=null;
        Token string_literal60=null;
        Token char_literal61=null;
        Token char_literal63=null;
        AtrophyScriptParser.properties_return properties62 =null;


        CommonTree string_literal58_tree=null;
        CommonTree string_literal59_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:17: ( ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt12=1;
                }
                break;
            case 144:
                {
                alt12=2;
                }
                break;
            case 143:
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:5: 'TEXTUREBLOCK'
                    {
                    string_literal58=(Token)match(input,92,FOLLOW_92_in_textureBlockDecl692);  
                    stream_92.add(string_literal58);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:22: 'textureblock'
                    {
                    string_literal59=(Token)match(input,144,FOLLOW_144_in_textureBlockDecl696);  
                    stream_144.add(string_literal59);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:39: 'textureBlock'
                    {
                    string_literal60=(Token)match(input,143,FOLLOW_143_in_textureBlockDecl700);  
                    stream_143.add(string_literal60);


                    }
                    break;

            }


            char_literal61=(Token)match(input,153,FOLLOW_153_in_textureBlockDecl703);  
            stream_153.add(char_literal61);


            pushFollow(FOLLOW_properties_in_textureBlockDecl705);
            properties62=properties();

            state._fsp--;

            stream_properties.add(properties62.getTree());

            char_literal63=(Token)match(input,154,FOLLOW_154_in_textureBlockDecl707);  
            stream_154.add(char_literal63);


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
            // 129:74: -> ^( TEXTUREBLOCK properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:77: ^( TEXTUREBLOCK properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:1: triggerDecl : ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) ;
    public final AtrophyScriptParser.triggerDecl_return triggerDecl() throws RecognitionException {
        AtrophyScriptParser.triggerDecl_return retval = new AtrophyScriptParser.triggerDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal64=null;
        Token string_literal65=null;
        Token char_literal67=null;
        Token char_literal69=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment66 =null;

        AtrophyScriptParser.properties_return properties68 =null;


        CommonTree string_literal64_tree=null;
        CommonTree string_literal65_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree char_literal69_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:12: ( ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:4: ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:4: ( 'TRIGGER' | 'trigger' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==93) ) {
                alt13=1;
            }
            else if ( (LA13_0==145) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:5: 'TRIGGER'
                    {
                    string_literal64=(Token)match(input,93,FOLLOW_93_in_triggerDecl731);  
                    stream_93.add(string_literal64);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:17: 'trigger'
                    {
                    string_literal65=(Token)match(input,145,FOLLOW_145_in_triggerDecl735);  
                    stream_145.add(string_literal65);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_triggerDecl738);
            requiredAssignment66=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment66.getTree());

            char_literal67=(Token)match(input,153,FOLLOW_153_in_triggerDecl740);  
            stream_153.add(char_literal67);


            pushFollow(FOLLOW_properties_in_triggerDecl742);
            properties68=properties();

            state._fsp--;

            stream_properties.add(properties68.getTree());

            char_literal69=(Token)match(input,154,FOLLOW_154_in_triggerDecl744);  
            stream_154.add(char_literal69);


            // AST REWRITE
            // elements: requiredAssignment, properties
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 133:66: -> ^( TRIGGER requiredAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:69: ^( TRIGGER requiredAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:1: commandDecl : ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) ;
    public final AtrophyScriptParser.commandDecl_return commandDecl() throws RecognitionException {
        AtrophyScriptParser.commandDecl_return retval = new AtrophyScriptParser.commandDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal70=null;
        Token string_literal71=null;
        Token char_literal73=null;
        Token char_literal75=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment72 =null;

        AtrophyScriptParser.triggerEffectList_return triggerEffectList74 =null;


        CommonTree string_literal70_tree=null;
        CommonTree string_literal71_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal75_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:12: ( ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:4: ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:4: ( 'COMMAND' | 'command' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==83) ) {
                alt14=1;
            }
            else if ( (LA14_0==100) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:5: 'COMMAND'
                    {
                    string_literal70=(Token)match(input,83,FOLLOW_83_in_commandDecl770);  
                    stream_83.add(string_literal70);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:17: 'command'
                    {
                    string_literal71=(Token)match(input,100,FOLLOW_100_in_commandDecl774);  
                    stream_100.add(string_literal71);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_commandDecl777);
            requiredAssignment72=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment72.getTree());

            char_literal73=(Token)match(input,153,FOLLOW_153_in_commandDecl779);  
            stream_153.add(char_literal73);


            pushFollow(FOLLOW_triggerEffectList_in_commandDecl781);
            triggerEffectList74=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList74.getTree());

            char_literal75=(Token)match(input,154,FOLLOW_154_in_commandDecl783);  
            stream_154.add(char_literal75);


            // AST REWRITE
            // elements: requiredAssignment, triggerEffectList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 137:73: -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:76: ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COMMAND, "COMMAND")
                , root_1);

                adaptor.addChild(root_1, stream_requiredAssignment.nextTree());

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:105: ^( TRIGGEREFFECT triggerEffectList )
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


    public static class talkTreeDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "talkTreeDecl"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:1: talkTreeDecl : ( 'TALKMAP' | 'talkmap' | 'talkMap' ) requiredAssignment '{' properties '}' -> ^( TALKTREE requiredAssignment properties ) ;
    public final AtrophyScriptParser.talkTreeDecl_return talkTreeDecl() throws RecognitionException {
        AtrophyScriptParser.talkTreeDecl_return retval = new AtrophyScriptParser.talkTreeDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal76=null;
        Token string_literal77=null;
        Token string_literal78=null;
        Token char_literal80=null;
        Token char_literal82=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment79 =null;

        AtrophyScriptParser.properties_return properties81 =null;


        CommonTree string_literal76_tree=null;
        CommonTree string_literal77_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree char_literal80_tree=null;
        CommonTree char_literal82_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:13: ( ( 'TALKMAP' | 'talkmap' | 'talkMap' ) requiredAssignment '{' properties '}' -> ^( TALKTREE requiredAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:4: ( 'TALKMAP' | 'talkmap' | 'talkMap' ) requiredAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:4: ( 'TALKMAP' | 'talkmap' | 'talkMap' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt15=1;
                }
                break;
            case 138:
                {
                alt15=2;
                }
                break;
            case 137:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:5: 'TALKMAP'
                    {
                    string_literal76=(Token)match(input,91,FOLLOW_91_in_talkTreeDecl813);  
                    stream_91.add(string_literal76);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:17: 'talkmap'
                    {
                    string_literal77=(Token)match(input,138,FOLLOW_138_in_talkTreeDecl817);  
                    stream_138.add(string_literal77);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:29: 'talkMap'
                    {
                    string_literal78=(Token)match(input,137,FOLLOW_137_in_talkTreeDecl821);  
                    stream_137.add(string_literal78);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_talkTreeDecl824);
            requiredAssignment79=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment79.getTree());

            char_literal80=(Token)match(input,153,FOLLOW_153_in_talkTreeDecl826);  
            stream_153.add(char_literal80);


            pushFollow(FOLLOW_properties_in_talkTreeDecl827);
            properties81=properties();

            state._fsp--;

            stream_properties.add(properties81.getTree());

            char_literal82=(Token)match(input,154,FOLLOW_154_in_talkTreeDecl829);  
            stream_154.add(char_literal82);


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
            // 141:77: -> ^( TALKTREE requiredAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:80: ^( TALKTREE requiredAssignment properties )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TALKTREE, "TALKTREE")
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
    // $ANTLR end "talkTreeDecl"


    public static class talkDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "talkDecl"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:1: talkDecl : ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) ;
    public final AtrophyScriptParser.talkDecl_return talkDecl() throws RecognitionException {
        AtrophyScriptParser.talkDecl_return retval = new AtrophyScriptParser.talkDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal83=null;
        Token string_literal84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        AtrophyScriptParser.properties_return properties86 =null;


        CommonTree string_literal83_tree=null;
        CommonTree string_literal84_tree=null;
        CommonTree char_literal85_tree=null;
        CommonTree char_literal87_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:9: ( ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:4: ( 'TALK' | 'talk' ) '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:4: ( 'TALK' | 'talk' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==90) ) {
                alt16=1;
            }
            else if ( (LA16_0==136) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:5: 'TALK'
                    {
                    string_literal83=(Token)match(input,90,FOLLOW_90_in_talkDecl855);  
                    stream_90.add(string_literal83);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:14: 'talk'
                    {
                    string_literal84=(Token)match(input,136,FOLLOW_136_in_talkDecl859);  
                    stream_136.add(string_literal84);


                    }
                    break;

            }


            char_literal85=(Token)match(input,153,FOLLOW_153_in_talkDecl862);  
            stream_153.add(char_literal85);


            pushFollow(FOLLOW_properties_in_talkDecl864);
            properties86=properties();

            state._fsp--;

            stream_properties.add(properties86.getTree());

            char_literal87=(Token)match(input,154,FOLLOW_154_in_talkDecl866);  
            stream_154.add(char_literal87);


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
            // 145:41: -> ^( TALK properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:44: ^( TALK properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:148:1: properties : ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | lineProperty | triggerCondProperty | triggerEffectProperty )* ;
    public final AtrophyScriptParser.properties_return properties() throws RecognitionException {
        AtrophyScriptParser.properties_return retval = new AtrophyScriptParser.properties_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.xListProperty_return xListProperty88 =null;

        AtrophyScriptParser.yListProperty_return yListProperty89 =null;

        AtrophyScriptParser.factionTerritoryProperty_return factionTerritoryProperty90 =null;

        AtrophyScriptParser.factionZoneProperty_return factionZoneProperty91 =null;

        AtrophyScriptParser.saferoomProperty_return saferoomProperty92 =null;

        AtrophyScriptParser.stageProperty_return stageProperty93 =null;

        AtrophyScriptParser.stageDeclProperty_return stageDeclProperty94 =null;

        AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty95 =null;

        AtrophyScriptParser.aiInitProperty_return aiInitProperty96 =null;

        AtrophyScriptParser.openingLineProperty_return openingLineProperty97 =null;

        AtrophyScriptParser.lineProperty_return lineProperty98 =null;

        AtrophyScriptParser.triggerCondProperty_return triggerCondProperty99 =null;

        AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty100 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:148:11: ( ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | lineProperty | triggerCondProperty | triggerEffectProperty )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:149:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | lineProperty | triggerCondProperty | triggerEffectProperty )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:149:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | lineProperty | triggerCondProperty | triggerEffectProperty )*
            loop17:
            do {
                int alt17=14;
                switch ( input.LA(1) ) {
                case 150:
                    {
                    alt17=1;
                    }
                    break;
                case 151:
                    {
                    alt17=2;
                    }
                    break;
                case 142:
                    {
                    alt17=3;
                    }
                    break;
                case 152:
                    {
                    alt17=4;
                    }
                    break;
                case 131:
                    {
                    alt17=5;
                    }
                    break;
                case 130:
                case 133:
                    {
                    alt17=6;
                    }
                    break;
                case 134:
                    {
                    alt17=7;
                    }
                    break;
                case 124:
                case 125:
                    {
                    alt17=8;
                    }
                    break;
                case 94:
                case 96:
                    {
                    alt17=9;
                    }
                    break;
                case 121:
                case 122:
                case 123:
                    {
                    alt17=10;
                    }
                    break;
                case 114:
                case 115:
                    {
                    alt17=11;
                    }
                    break;
                case 139:
                case 146:
                    {
                    alt17=12;
                    }
                    break;
                case 140:
                case 147:
                    {
                    alt17=13;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:149:5: xListProperty
            	    {
            	    pushFollow(FOLLOW_xListProperty_in_properties890);
            	    xListProperty88=xListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xListProperty88.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:6: yListProperty
            	    {
            	    pushFollow(FOLLOW_yListProperty_in_properties897);
            	    yListProperty89=yListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, yListProperty89.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:6: factionTerritoryProperty
            	    {
            	    pushFollow(FOLLOW_factionTerritoryProperty_in_properties904);
            	    factionTerritoryProperty90=factionTerritoryProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionTerritoryProperty90.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:152:6: factionZoneProperty
            	    {
            	    pushFollow(FOLLOW_factionZoneProperty_in_properties911);
            	    factionZoneProperty91=factionZoneProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionZoneProperty91.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:153:6: saferoomProperty
            	    {
            	    pushFollow(FOLLOW_saferoomProperty_in_properties918);
            	    saferoomProperty92=saferoomProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, saferoomProperty92.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:6: stageProperty
            	    {
            	    pushFollow(FOLLOW_stageProperty_in_properties925);
            	    stageProperty93=stageProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageProperty93.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:6: stageDeclProperty
            	    {
            	    pushFollow(FOLLOW_stageDeclProperty_in_properties932);
            	    stageDeclProperty94=stageDeclProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageDeclProperty94.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:156:6: talkMapParentProperty
            	    {
            	    pushFollow(FOLLOW_talkMapParentProperty_in_properties939);
            	    talkMapParentProperty95=talkMapParentProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, talkMapParentProperty95.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:157:6: aiInitProperty
            	    {
            	    pushFollow(FOLLOW_aiInitProperty_in_properties946);
            	    aiInitProperty96=aiInitProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiInitProperty96.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:6: openingLineProperty
            	    {
            	    pushFollow(FOLLOW_openingLineProperty_in_properties953);
            	    openingLineProperty97=openingLineProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, openingLineProperty97.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:6: lineProperty
            	    {
            	    pushFollow(FOLLOW_lineProperty_in_properties960);
            	    lineProperty98=lineProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lineProperty98.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:160:6: triggerCondProperty
            	    {
            	    pushFollow(FOLLOW_triggerCondProperty_in_properties967);
            	    triggerCondProperty99=triggerCondProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerCondProperty99.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:161:6: triggerEffectProperty
            	    {
            	    pushFollow(FOLLOW_triggerEffectProperty_in_properties974);
            	    triggerEffectProperty100=triggerEffectProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffectProperty100.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:164:1: xListProperty : 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) ;
    public final AtrophyScriptParser.xListProperty_return xListProperty() throws RecognitionException {
        AtrophyScriptParser.xListProperty_return retval = new AtrophyScriptParser.xListProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal101=null;
        Token INT102=null;
        Token char_literal103=null;
        Token INT104=null;

        CommonTree string_literal101_tree=null;
        CommonTree INT102_tree=null;
        CommonTree char_literal103_tree=null;
        CommonTree INT104_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:164:14: ( 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:165:4: 'x:' INT ( ',' INT )*
            {
            string_literal101=(Token)match(input,150,FOLLOW_150_in_xListProperty991);  
            stream_150.add(string_literal101);


            INT102=(Token)match(input,INT,FOLLOW_INT_in_xListProperty993);  
            stream_INT.add(INT102);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:165:13: ( ',' INT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==74) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:165:14: ',' INT
            	    {
            	    char_literal103=(Token)match(input,74,FOLLOW_74_in_xListProperty996);  
            	    stream_74.add(char_literal103);


            	    INT104=(Token)match(input,INT,FOLLOW_INT_in_xListProperty997);  
            	    stream_INT.add(INT104);


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
            // 165:23: -> ^( XLIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:165:26: ^( XLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(XLIST, "XLIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:165:34: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:168:1: yListProperty : 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) ;
    public final AtrophyScriptParser.yListProperty_return yListProperty() throws RecognitionException {
        AtrophyScriptParser.yListProperty_return retval = new AtrophyScriptParser.yListProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal105=null;
        Token INT106=null;
        Token char_literal107=null;
        Token INT108=null;

        CommonTree string_literal105_tree=null;
        CommonTree INT106_tree=null;
        CommonTree char_literal107_tree=null;
        CommonTree INT108_tree=null;
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:168:14: ( 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:169:4: 'y:' INT ( ',' INT )*
            {
            string_literal105=(Token)match(input,151,FOLLOW_151_in_yListProperty1021);  
            stream_151.add(string_literal105);


            INT106=(Token)match(input,INT,FOLLOW_INT_in_yListProperty1023);  
            stream_INT.add(INT106);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:169:13: ( ',' INT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==74) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:169:14: ',' INT
            	    {
            	    char_literal107=(Token)match(input,74,FOLLOW_74_in_yListProperty1026);  
            	    stream_74.add(char_literal107);


            	    INT108=(Token)match(input,INT,FOLLOW_INT_in_yListProperty1027);  
            	    stream_INT.add(INT108);


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
            // 169:23: -> ^( YLIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:169:26: ^( YLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(YLIST, "YLIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:169:34: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:172:1: factionTerritoryProperty : 'territory:' stringList -> ^( TERRITORY stringList ) ;
    public final AtrophyScriptParser.factionTerritoryProperty_return factionTerritoryProperty() throws RecognitionException {
        AtrophyScriptParser.factionTerritoryProperty_return retval = new AtrophyScriptParser.factionTerritoryProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal109=null;
        AtrophyScriptParser.stringList_return stringList110 =null;


        CommonTree string_literal109_tree=null;
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:172:25: ( 'territory:' stringList -> ^( TERRITORY stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:173:4: 'territory:' stringList
            {
            string_literal109=(Token)match(input,142,FOLLOW_142_in_factionTerritoryProperty1053);  
            stream_142.add(string_literal109);


            pushFollow(FOLLOW_stringList_in_factionTerritoryProperty1055);
            stringList110=stringList();

            state._fsp--;

            stream_stringList.add(stringList110.getTree());

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
            // 173:28: -> ^( TERRITORY stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:173:31: ^( TERRITORY stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TERRITORY, "TERRITORY")
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
    // $ANTLR end "factionTerritoryProperty"


    public static class factionZoneProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factionZoneProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:176:1: factionZoneProperty : 'zone:' stringList -> ^( ZONE stringList ) ;
    public final AtrophyScriptParser.factionZoneProperty_return factionZoneProperty() throws RecognitionException {
        AtrophyScriptParser.factionZoneProperty_return retval = new AtrophyScriptParser.factionZoneProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal111=null;
        AtrophyScriptParser.stringList_return stringList112 =null;


        CommonTree string_literal111_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:176:20: ( 'zone:' stringList -> ^( ZONE stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:177:4: 'zone:' stringList
            {
            string_literal111=(Token)match(input,152,FOLLOW_152_in_factionZoneProperty1078);  
            stream_152.add(string_literal111);


            pushFollow(FOLLOW_stringList_in_factionZoneProperty1080);
            stringList112=stringList();

            state._fsp--;

            stream_stringList.add(stringList112.getTree());

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
            // 177:23: -> ^( ZONE stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:177:26: ^( ZONE stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:180:1: saferoomProperty : 'saferoom' -> ^( SAFEROOM ) ;
    public final AtrophyScriptParser.saferoomProperty_return saferoomProperty() throws RecognitionException {
        AtrophyScriptParser.saferoomProperty_return retval = new AtrophyScriptParser.saferoomProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal113=null;

        CommonTree string_literal113_tree=null;
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:180:17: ( 'saferoom' -> ^( SAFEROOM ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:181:4: 'saferoom'
            {
            string_literal113=(Token)match(input,131,FOLLOW_131_in_saferoomProperty1103);  
            stream_131.add(string_literal113);


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
            // 181:15: -> ^( SAFEROOM )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:181:18: ^( SAFEROOM )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:184:1: stageDeclProperty : 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) ;
    public final AtrophyScriptParser.stageDeclProperty_return stageDeclProperty() throws RecognitionException {
        AtrophyScriptParser.stageDeclProperty_return retval = new AtrophyScriptParser.stageDeclProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal114=null;
        Token INT115=null;
        Token char_literal116=null;
        Token INT117=null;

        CommonTree string_literal114_tree=null;
        CommonTree INT115_tree=null;
        CommonTree char_literal116_tree=null;
        CommonTree INT117_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:184:18: ( 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:185:4: 'stages:' INT ( ',' INT )*
            {
            string_literal114=(Token)match(input,134,FOLLOW_134_in_stageDeclProperty1124);  
            stream_134.add(string_literal114);


            INT115=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1126);  
            stream_INT.add(INT115);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:185:18: ( ',' INT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==74) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:185:19: ',' INT
            	    {
            	    char_literal116=(Token)match(input,74,FOLLOW_74_in_stageDeclProperty1129);  
            	    stream_74.add(char_literal116);


            	    INT117=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1131);  
            	    stream_INT.add(INT117);


            	    }
            	    break;

            	default :
            	    break loop20;
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
            // 185:29: -> ^( STAGELIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:185:32: ^( STAGELIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STAGELIST, "STAGELIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:185:44: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:188:1: talkMapParentProperty : ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) ;
    public final AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty() throws RecognitionException {
        AtrophyScriptParser.talkMapParentProperty_return retval = new AtrophyScriptParser.talkMapParentProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal118=null;
        Token string_literal119=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral120 =null;


        CommonTree string_literal118_tree=null;
        CommonTree string_literal119_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:188:22: ( ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:4: ( 'parent:' | 'p:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:4: ( 'parent:' | 'p:' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==125) ) {
                alt21=1;
            }
            else if ( (LA21_0==124) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:5: 'parent:'
                    {
                    string_literal118=(Token)match(input,125,FOLLOW_125_in_talkMapParentProperty1158);  
                    stream_125.add(string_literal118);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:17: 'p:'
                    {
                    string_literal119=(Token)match(input,124,FOLLOW_124_in_talkMapParentProperty1162);  
                    stream_124.add(string_literal119);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_talkMapParentProperty1165);
            stringLiteral120=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral120.getTree());

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
            // 189:37: -> ^( TALKPARENT stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:40: ^( TALKPARENT stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:192:1: stageProperty : ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) ;
    public final AtrophyScriptParser.stageProperty_return stageProperty() throws RecognitionException {
        AtrophyScriptParser.stageProperty_return retval = new AtrophyScriptParser.stageProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal121=null;
        Token string_literal122=null;
        Token INT123=null;

        CommonTree string_literal121_tree=null;
        CommonTree string_literal122_tree=null;
        CommonTree INT123_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:192:14: ( ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:4: ( 'stage:' | 's:' ) INT
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:4: ( 'stage:' | 's:' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==133) ) {
                alt22=1;
            }
            else if ( (LA22_0==130) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:5: 'stage:'
                    {
                    string_literal121=(Token)match(input,133,FOLLOW_133_in_stageProperty1189);  
                    stream_133.add(string_literal121);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:16: 's:'
                    {
                    string_literal122=(Token)match(input,130,FOLLOW_130_in_stageProperty1193);  
                    stream_130.add(string_literal122);


                    }
                    break;

            }


            INT123=(Token)match(input,INT,FOLLOW_INT_in_stageProperty1196);  
            stream_INT.add(INT123);


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
            // 193:26: -> ^( TALKSTAGE INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:29: ^( TALKSTAGE INT )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:1: aiInitProperty : ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) ;
    public final AtrophyScriptParser.aiInitProperty_return aiInitProperty() throws RecognitionException {
        AtrophyScriptParser.aiInitProperty_return retval = new AtrophyScriptParser.aiInitProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal124=null;
        Token string_literal125=null;
        Token BOOL126=null;

        CommonTree string_literal124_tree=null;
        CommonTree string_literal125_tree=null;
        CommonTree BOOL126_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:15: ( ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:4: ( 'aiInit:' | 'a:' ) BOOL
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:4: ( 'aiInit:' | 'a:' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==96) ) {
                alt23=1;
            }
            else if ( (LA23_0==94) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:5: 'aiInit:'
                    {
                    string_literal124=(Token)match(input,96,FOLLOW_96_in_aiInitProperty1220);  
                    stream_96.add(string_literal124);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:17: 'a:'
                    {
                    string_literal125=(Token)match(input,94,FOLLOW_94_in_aiInitProperty1224);  
                    stream_94.add(string_literal125);


                    }
                    break;

            }


            BOOL126=(Token)match(input,BOOL,FOLLOW_BOOL_in_aiInitProperty1227);  
            stream_BOOL.add(BOOL126);


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
            // 197:28: -> ^( AIINIT BOOL )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:31: ^( AIINIT BOOL )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:200:1: openingLineProperty : ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) ;
    public final AtrophyScriptParser.openingLineProperty_return openingLineProperty() throws RecognitionException {
        AtrophyScriptParser.openingLineProperty_return retval = new AtrophyScriptParser.openingLineProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal127=null;
        Token string_literal128=null;
        Token string_literal129=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral130 =null;


        CommonTree string_literal127_tree=null;
        CommonTree string_literal128_tree=null;
        CommonTree string_literal129_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:200:20: ( ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:4: ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:4: ( 'o:' | 'opening:' | 'openingLine:' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt24=1;
                }
                break;
            case 122:
                {
                alt24=2;
                }
                break;
            case 123:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:5: 'o:'
                    {
                    string_literal127=(Token)match(input,121,FOLLOW_121_in_openingLineProperty1251);  
                    stream_121.add(string_literal127);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:12: 'opening:'
                    {
                    string_literal128=(Token)match(input,122,FOLLOW_122_in_openingLineProperty1255);  
                    stream_122.add(string_literal128);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:25: 'openingLine:'
                    {
                    string_literal129=(Token)match(input,123,FOLLOW_123_in_openingLineProperty1259);  
                    stream_123.add(string_literal129);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_openingLineProperty1262);
            stringLiteral130=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral130.getTree());

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
            // 201:55: -> ^( OPENINGLINE stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:58: ^( OPENINGLINE stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:204:1: lineProperty : ( 'l:' | 'line:' ) stringLiteral -> ^( LINE stringLiteral ) ;
    public final AtrophyScriptParser.lineProperty_return lineProperty() throws RecognitionException {
        AtrophyScriptParser.lineProperty_return retval = new AtrophyScriptParser.lineProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal131=null;
        Token string_literal132=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral133 =null;


        CommonTree string_literal131_tree=null;
        CommonTree string_literal132_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:204:13: ( ( 'l:' | 'line:' ) stringLiteral -> ^( LINE stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:4: ( 'l:' | 'line:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:4: ( 'l:' | 'line:' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==114) ) {
                alt25=1;
            }
            else if ( (LA25_0==115) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:5: 'l:'
                    {
                    string_literal131=(Token)match(input,114,FOLLOW_114_in_lineProperty1284);  
                    stream_114.add(string_literal131);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:12: 'line:'
                    {
                    string_literal132=(Token)match(input,115,FOLLOW_115_in_lineProperty1288);  
                    stream_115.add(string_literal132);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_lineProperty1291);
            stringLiteral133=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral133.getTree());

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
            // 205:35: -> ^( LINE stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:38: ^( LINE stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:208:1: term : ( '(' condExpression ')' | BOOL | booleanQuery );
    public final AtrophyScriptParser.term_return term() throws RecognitionException {
        AtrophyScriptParser.term_return retval = new AtrophyScriptParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal134=null;
        Token char_literal136=null;
        Token BOOL137=null;
        AtrophyScriptParser.condExpression_return condExpression135 =null;

        AtrophyScriptParser.booleanQuery_return booleanQuery138 =null;


        CommonTree char_literal134_tree=null;
        CommonTree char_literal136_tree=null;
        CommonTree BOOL137_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:208:5: ( '(' condExpression ')' | BOOL | booleanQuery )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt26=1;
                }
                break;
            case BOOL:
                {
                alt26=2;
                }
                break;
            case 68:
            case 72:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 94:
            case 96:
            case 114:
            case 115:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 130:
            case 131:
            case 133:
            case 134:
            case 139:
            case 140:
            case 142:
            case 146:
            case 147:
            case 150:
            case 151:
            case 152:
            case 154:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:4: '(' condExpression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal134=(Token)match(input,71,FOLLOW_71_in_term1314); 
                    char_literal134_tree = 
                    (CommonTree)adaptor.create(char_literal134)
                    ;
                    adaptor.addChild(root_0, char_literal134_tree);


                    pushFollow(FOLLOW_condExpression_in_term1316);
                    condExpression135=condExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, condExpression135.getTree());

                    char_literal136=(Token)match(input,72,FOLLOW_72_in_term1318); 
                    char_literal136_tree = 
                    (CommonTree)adaptor.create(char_literal136)
                    ;
                    adaptor.addChild(root_0, char_literal136_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:8: BOOL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BOOL137=(Token)match(input,BOOL,FOLLOW_BOOL_in_term1327); 
                    BOOL137_tree = 
                    (CommonTree)adaptor.create(BOOL137)
                    ;
                    adaptor.addChild(root_0, BOOL137_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:211:8: booleanQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_booleanQuery_in_term1336);
                    booleanQuery138=booleanQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanQuery138.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:1: booleanQuery :;
    public final AtrophyScriptParser.booleanQuery_return booleanQuery() throws RecognitionException {
        AtrophyScriptParser.booleanQuery_return retval = new AtrophyScriptParser.booleanQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:13: ()
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:215:3: 
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:1: unary : ( '+' !| negation ^)* term ;
    public final AtrophyScriptParser.unary_return unary() throws RecognitionException {
        AtrophyScriptParser.unary_return retval = new AtrophyScriptParser.unary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal139=null;
        AtrophyScriptParser.negation_return negation140 =null;

        AtrophyScriptParser.term_return term141 =null;


        CommonTree char_literal139_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:6: ( ( '+' !| negation ^)* term )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:4: ( '+' !| negation ^)* term
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:4: ( '+' !| negation ^)*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==73) ) {
                    alt27=1;
                }
                else if ( (LA27_0==75) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:5: '+' !
            	    {
            	    char_literal139=(Token)match(input,73,FOLLOW_73_in_unary1373); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:12: negation ^
            	    {
            	    pushFollow(FOLLOW_negation_in_unary1378);
            	    negation140=negation();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(negation140.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary1383);
            term141=term();

            state._fsp--;

            adaptor.addChild(root_0, term141.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:1: negation : '-' -> NEGATION ;
    public final AtrophyScriptParser.negation_return negation() throws RecognitionException {
        AtrophyScriptParser.negation_return retval = new AtrophyScriptParser.negation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal142=null;

        CommonTree char_literal142_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:9: ( '-' -> NEGATION )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:5: '-'
            {
            char_literal142=(Token)match(input,75,FOLLOW_75_in_negation1405);  
            stream_75.add(char_literal142);


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
            // 222:9: -> NEGATION
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:1: condExpression : unary ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary )* ;
    public final AtrophyScriptParser.condExpression_return condExpression() throws RecognitionException {
        AtrophyScriptParser.condExpression_return retval = new AtrophyScriptParser.condExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set144=null;
        AtrophyScriptParser.unary_return unary143 =null;

        AtrophyScriptParser.unary_return unary145 =null;


        CommonTree set144_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:15: ( unary ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:5: unary ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_condExpression1431);
            unary143=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary143.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:11: ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==68||(LA28_0 >= 77 && LA28_0 <= 81)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:12: ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary
            	    {
            	    set144=(Token)input.LT(1);

            	    if ( input.LA(1)==68||(input.LA(1) >= 77 && input.LA(1) <= 81) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set144)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_condExpression1457);
            	    unary145=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary145.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:1: triggerCondProperty : ( 'tc:' | 'triggerCond:' ) condExpression -> ^( TRIGGERCOND condExpression ) ;
    public final AtrophyScriptParser.triggerCondProperty_return triggerCondProperty() throws RecognitionException {
        AtrophyScriptParser.triggerCondProperty_return retval = new AtrophyScriptParser.triggerCondProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal146=null;
        Token string_literal147=null;
        AtrophyScriptParser.condExpression_return condExpression148 =null;


        CommonTree string_literal146_tree=null;
        CommonTree string_literal147_tree=null;
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleSubtreeStream stream_condExpression=new RewriteRuleSubtreeStream(adaptor,"rule condExpression");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:20: ( ( 'tc:' | 'triggerCond:' ) condExpression -> ^( TRIGGERCOND condExpression ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:4: ( 'tc:' | 'triggerCond:' ) condExpression
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:4: ( 'tc:' | 'triggerCond:' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==139) ) {
                alt29=1;
            }
            else if ( (LA29_0==146) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:5: 'tc:'
                    {
                    string_literal146=(Token)match(input,139,FOLLOW_139_in_triggerCondProperty1475);  
                    stream_139.add(string_literal146);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:13: 'triggerCond:'
                    {
                    string_literal147=(Token)match(input,146,FOLLOW_146_in_triggerCondProperty1479);  
                    stream_146.add(string_literal147);


                    }
                    break;

            }


            pushFollow(FOLLOW_condExpression_in_triggerCondProperty1482);
            condExpression148=condExpression();

            state._fsp--;

            stream_condExpression.add(condExpression148.getTree());

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
            // 230:44: -> ^( TRIGGERCOND condExpression )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:47: ^( TRIGGERCOND condExpression )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:1: triggerEffectProperty : ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) ;
    public final AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty() throws RecognitionException {
        AtrophyScriptParser.triggerEffectProperty_return retval = new AtrophyScriptParser.triggerEffectProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal149=null;
        Token string_literal150=null;
        Token char_literal151=null;
        Token char_literal153=null;
        AtrophyScriptParser.triggerEffectList_return triggerEffectList152 =null;


        CommonTree string_literal149_tree=null;
        CommonTree string_literal150_tree=null;
        CommonTree char_literal151_tree=null;
        CommonTree char_literal153_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:22: ( ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:4: ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:4: ( 'te' | 'triggerEffect' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==140) ) {
                alt30=1;
            }
            else if ( (LA30_0==147) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:5: 'te'
                    {
                    string_literal149=(Token)match(input,140,FOLLOW_140_in_triggerEffectProperty1504);  
                    stream_140.add(string_literal149);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:12: 'triggerEffect'
                    {
                    string_literal150=(Token)match(input,147,FOLLOW_147_in_triggerEffectProperty1508);  
                    stream_147.add(string_literal150);


                    }
                    break;

            }


            char_literal151=(Token)match(input,153,FOLLOW_153_in_triggerEffectProperty1511);  
            stream_153.add(char_literal151);


            pushFollow(FOLLOW_triggerEffectList_in_triggerEffectProperty1513);
            triggerEffectList152=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList152.getTree());

            char_literal153=(Token)match(input,154,FOLLOW_154_in_triggerEffectProperty1515);  
            stream_154.add(char_literal153);


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
            // 234:55: -> ^( TRIGGEREFFECT triggerEffectList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:58: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:1: triggerEffectList : triggerEffect ( ',' ! triggerEffect )* ;
    public final AtrophyScriptParser.triggerEffectList_return triggerEffectList() throws RecognitionException {
        AtrophyScriptParser.triggerEffectList_return retval = new AtrophyScriptParser.triggerEffectList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal155=null;
        AtrophyScriptParser.triggerEffect_return triggerEffect154 =null;

        AtrophyScriptParser.triggerEffect_return triggerEffect156 =null;


        CommonTree char_literal155_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:18: ( triggerEffect ( ',' ! triggerEffect )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:4: triggerEffect ( ',' ! triggerEffect )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1536);
            triggerEffect154=triggerEffect();

            state._fsp--;

            adaptor.addChild(root_0, triggerEffect154.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:18: ( ',' ! triggerEffect )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==74) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:19: ',' ! triggerEffect
            	    {
            	    char_literal155=(Token)match(input,74,FOLLOW_74_in_triggerEffectList1539); 

            	    pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1542);
            	    triggerEffect156=triggerEffect();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffect156.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:1: triggerEffect : ( updateTalkTree | spawnUnit | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | commandCallList );
    public final AtrophyScriptParser.triggerEffect_return triggerEffect() throws RecognitionException {
        AtrophyScriptParser.triggerEffect_return retval = new AtrophyScriptParser.triggerEffect_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.updateTalkTree_return updateTalkTree157 =null;

        AtrophyScriptParser.spawnUnit_return spawnUnit158 =null;

        AtrophyScriptParser.removeUnit_return removeUnit159 =null;

        AtrophyScriptParser.killUnit_return killUnit160 =null;

        AtrophyScriptParser.teleportUnit_return teleportUnit161 =null;

        AtrophyScriptParser.converseUnit_return converseUnit162 =null;

        AtrophyScriptParser.createSaferoom_return createSaferoom163 =null;

        AtrophyScriptParser.removeSaferoom_return removeSaferoom164 =null;

        AtrophyScriptParser.loadMap_return loadMap165 =null;

        AtrophyScriptParser.lockDoor_return lockDoor166 =null;

        AtrophyScriptParser.unlockDoor_return unlockDoor167 =null;

        AtrophyScriptParser.addTag_return addTag168 =null;

        AtrophyScriptParser.removeTag_return removeTag169 =null;

        AtrophyScriptParser.directorBias_return directorBias170 =null;

        AtrophyScriptParser.changeAiNode_return changeAiNode171 =null;

        AtrophyScriptParser.commandCallList_return commandCallList172 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:14: ( updateTalkTree | spawnUnit | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | commandCallList )
            int alt32=16;
            switch ( input.LA(1) ) {
            case UPDATE_TREE_PREFIX:
            case 149:
                {
                alt32=1;
                }
                break;
            case 132:
                {
                alt32=2;
                }
                break;
            case 129:
                {
                alt32=3;
                }
                break;
            case 113:
                {
                alt32=4;
                }
                break;
            case 141:
                {
                alt32=5;
                }
                break;
            case 102:
                {
                alt32=6;
                }
                break;
            case 131:
                {
                alt32=7;
                }
                break;
            case 127:
                {
                alt32=8;
                }
                break;
            case 116:
                {
                alt32=9;
                }
                break;
            case 117:
                {
                alt32=10;
                }
                break;
            case 148:
                {
                alt32=11;
                }
                break;
            case ADD_TAG_PREFIX:
            case 95:
                {
                alt32=12;
                }
                break;
            case REMOVE_TAG_PREFIX:
            case 128:
                {
                alt32=13;
                }
                break;
            case 105:
                {
                alt32=14;
                }
                break;
            case 99:
                {
                alt32=15;
                }
                break;
            case COMMAND_CALL_PREFIX:
            case 98:
                {
                alt32=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:4: updateTalkTree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_updateTalkTree_in_triggerEffect1557);
                    updateTalkTree157=updateTalkTree();

                    state._fsp--;

                    adaptor.addChild(root_0, updateTalkTree157.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:243:6: spawnUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnUnit_in_triggerEffect1564);
                    spawnUnit158=spawnUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnUnit158.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:244:6: removeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeUnit_in_triggerEffect1571);
                    removeUnit159=removeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, removeUnit159.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:6: killUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_killUnit_in_triggerEffect1578);
                    killUnit160=killUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, killUnit160.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:6: teleportUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_teleportUnit_in_triggerEffect1585);
                    teleportUnit161=teleportUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, teleportUnit161.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:247:6: converseUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_converseUnit_in_triggerEffect1592);
                    converseUnit162=converseUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, converseUnit162.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:248:6: createSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_createSaferoom_in_triggerEffect1599);
                    createSaferoom163=createSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, createSaferoom163.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:6: removeSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeSaferoom_in_triggerEffect1606);
                    removeSaferoom164=removeSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, removeSaferoom164.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:6: loadMap
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_loadMap_in_triggerEffect1613);
                    loadMap165=loadMap();

                    state._fsp--;

                    adaptor.addChild(root_0, loadMap165.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:251:6: lockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lockDoor_in_triggerEffect1620);
                    lockDoor166=lockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, lockDoor166.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:252:6: unlockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unlockDoor_in_triggerEffect1627);
                    unlockDoor167=unlockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, unlockDoor167.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:253:6: addTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_addTag_in_triggerEffect1634);
                    addTag168=addTag();

                    state._fsp--;

                    adaptor.addChild(root_0, addTag168.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:6: removeTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeTag_in_triggerEffect1641);
                    removeTag169=removeTag();

                    state._fsp--;

                    adaptor.addChild(root_0, removeTag169.getTree());

                    }
                    break;
                case 14 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:255:6: directorBias
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_directorBias_in_triggerEffect1648);
                    directorBias170=directorBias();

                    state._fsp--;

                    adaptor.addChild(root_0, directorBias170.getTree());

                    }
                    break;
                case 15 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:256:6: changeAiNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_changeAiNode_in_triggerEffect1655);
                    changeAiNode171=changeAiNode();

                    state._fsp--;

                    adaptor.addChild(root_0, changeAiNode171.getTree());

                    }
                    break;
                case 16 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:6: commandCallList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandCallList_in_triggerEffect1662);
                    commandCallList172=commandCallList();

                    state._fsp--;

                    adaptor.addChild(root_0, commandCallList172.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:260:1: updateTalkTree : ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) );
    public final AtrophyScriptParser.updateTalkTree_return updateTalkTree() throws RecognitionException {
        AtrophyScriptParser.updateTalkTree_return retval = new AtrophyScriptParser.updateTalkTree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal173=null;
        Token INT175=null;
        Token UPDATE_TREE_PREFIX176=null;
        Token char_literal178=null;
        Token INT179=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral174 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral177 =null;


        CommonTree string_literal173_tree=null;
        CommonTree INT175_tree=null;
        CommonTree UPDATE_TREE_PREFIX176_tree=null;
        CommonTree char_literal178_tree=null;
        CommonTree INT179_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_UPDATE_TREE_PREFIX=new RewriteRuleTokenStream(adaptor,"token UPDATE_TREE_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:260:15: ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==149) ) {
                alt33=1;
            }
            else if ( (LA33_0==UPDATE_TREE_PREFIX) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:4: 'updateTalk:' stringLiteral INT
                    {
                    string_literal173=(Token)match(input,149,FOLLOW_149_in_updateTalkTree1677);  
                    stream_149.add(string_literal173);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree1679);
                    stringLiteral174=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral174.getTree());

                    INT175=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree1681);  
                    stream_INT.add(INT175);


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
                    // 261:36: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:39: ^( UPDATETALK stringLiteral INT )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:6: UPDATE_TREE_PREFIX stringLiteral '#' INT
                    {
                    UPDATE_TREE_PREFIX176=(Token)match(input,UPDATE_TREE_PREFIX,FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree1698);  
                    stream_UPDATE_TREE_PREFIX.add(UPDATE_TREE_PREFIX176);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree1700);
                    stringLiteral177=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral177.getTree());

                    char_literal178=(Token)match(input,70,FOLLOW_70_in_updateTalkTree1702);  
                    stream_70.add(char_literal178);


                    INT179=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree1704);  
                    stream_INT.add(INT179);


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
                    // 262:47: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:50: ^( UPDATETALK stringLiteral INT )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:1: isName : 'isName:' stringList -> ^( ISNAME stringList ) ;
    public final AtrophyScriptParser.isName_return isName() throws RecognitionException {
        AtrophyScriptParser.isName_return retval = new AtrophyScriptParser.isName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal180=null;
        AtrophyScriptParser.stringList_return stringList181 =null;


        CommonTree string_literal180_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:7: ( 'isName:' stringList -> ^( ISNAME stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:4: 'isName:' stringList
            {
            string_literal180=(Token)match(input,112,FOLLOW_112_in_isName1729);  
            stream_112.add(string_literal180);


            pushFollow(FOLLOW_stringList_in_isName1731);
            stringList181=stringList();

            state._fsp--;

            stream_stringList.add(stringList181.getTree());

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
            // 266:25: -> ^( ISNAME stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:28: ^( ISNAME stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:269:1: isFaction : 'isFaction:' stringList -> ^( ISFACTION stringList ) ;
    public final AtrophyScriptParser.isFaction_return isFaction() throws RecognitionException {
        AtrophyScriptParser.isFaction_return retval = new AtrophyScriptParser.isFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal182=null;
        AtrophyScriptParser.stringList_return stringList183 =null;


        CommonTree string_literal182_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:269:10: ( 'isFaction:' stringList -> ^( ISFACTION stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:4: 'isFaction:' stringList
            {
            string_literal182=(Token)match(input,110,FOLLOW_110_in_isFaction1754);  
            stream_110.add(string_literal182);


            pushFollow(FOLLOW_stringList_in_isFaction1756);
            stringList183=stringList();

            state._fsp--;

            stream_stringList.add(stringList183.getTree());

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
            // 270:28: -> ^( ISFACTION stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:31: ^( ISFACTION stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:273:1: hasItem : 'hasItem:' stringList -> ^( HASITEM stringList ) ;
    public final AtrophyScriptParser.hasItem_return hasItem() throws RecognitionException {
        AtrophyScriptParser.hasItem_return retval = new AtrophyScriptParser.hasItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal184=null;
        AtrophyScriptParser.stringList_return stringList185 =null;


        CommonTree string_literal184_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:273:8: ( 'hasItem:' stringList -> ^( HASITEM stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:274:4: 'hasItem:' stringList
            {
            string_literal184=(Token)match(input,106,FOLLOW_106_in_hasItem1779);  
            stream_106.add(string_literal184);


            pushFollow(FOLLOW_stringList_in_hasItem1781);
            stringList185=stringList();

            state._fsp--;

            stream_stringList.add(stringList185.getTree());

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
            // 274:26: -> ^( HASITEM stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:274:29: ^( HASITEM stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:1: hasWeapon : 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) ;
    public final AtrophyScriptParser.hasWeapon_return hasWeapon() throws RecognitionException {
        AtrophyScriptParser.hasWeapon_return retval = new AtrophyScriptParser.hasWeapon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal186=null;
        AtrophyScriptParser.stringList_return stringList187 =null;


        CommonTree string_literal186_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:10: ( 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:278:4: 'hasWeapon:' stringList
            {
            string_literal186=(Token)match(input,107,FOLLOW_107_in_hasWeapon1804);  
            stream_107.add(string_literal186);


            pushFollow(FOLLOW_stringList_in_hasWeapon1806);
            stringList187=stringList();

            state._fsp--;

            stream_stringList.add(stringList187.getTree());

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
            // 278:28: -> ^( HASWEAPON stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:278:31: ^( HASWEAPON stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:281:1: stringList : stringLiteral ( ',' ! stringLiteral )* ;
    public final AtrophyScriptParser.stringList_return stringList() throws RecognitionException {
        AtrophyScriptParser.stringList_return retval = new AtrophyScriptParser.stringList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal189=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral188 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral190 =null;


        CommonTree char_literal189_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:281:11: ( stringLiteral ( ',' ! stringLiteral )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:282:4: stringLiteral ( ',' ! stringLiteral )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_stringLiteral_in_stringList1829);
            stringLiteral188=stringLiteral();

            state._fsp--;

            adaptor.addChild(root_0, stringLiteral188.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:282:18: ( ',' ! stringLiteral )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==74) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:282:19: ',' ! stringLiteral
            	    {
            	    char_literal189=(Token)match(input,74,FOLLOW_74_in_stringList1832); 

            	    pushFollow(FOLLOW_stringLiteral_in_stringList1835);
            	    stringLiteral190=stringLiteral();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stringLiteral190.getTree());

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
    // $ANTLR end "stringList"


    public static class isAlive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isAlive"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:1: isAlive : 'isAlive?' -> ^( ISALIVE ) ;
    public final AtrophyScriptParser.isAlive_return isAlive() throws RecognitionException {
        AtrophyScriptParser.isAlive_return retval = new AtrophyScriptParser.isAlive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal191=null;

        CommonTree string_literal191_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:8: ( 'isAlive?' -> ^( ISALIVE ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:286:4: 'isAlive?'
            {
            string_literal191=(Token)match(input,109,FOLLOW_109_in_isAlive1850);  
            stream_109.add(string_literal191);


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
            // 286:15: -> ^( ISALIVE )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:286:18: ^( ISALIVE )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:289:1: isInvestigated : 'isInvestigated?' -> ^( ISINVESTIGATED ) ;
    public final AtrophyScriptParser.isInvestigated_return isInvestigated() throws RecognitionException {
        AtrophyScriptParser.isInvestigated_return retval = new AtrophyScriptParser.isInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal192=null;

        CommonTree string_literal192_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:289:15: ( 'isInvestigated?' -> ^( ISINVESTIGATED ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:290:4: 'isInvestigated?'
            {
            string_literal192=(Token)match(input,111,FOLLOW_111_in_isInvestigated1871);  
            stream_111.add(string_literal192);


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
            // 290:22: -> ^( ISINVESTIGATED )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:290:25: ^( ISINVESTIGATED )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:293:1: teleDestination : 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) ;
    public final AtrophyScriptParser.teleDestination_return teleDestination() throws RecognitionException {
        AtrophyScriptParser.teleDestination_return retval = new AtrophyScriptParser.teleDestination_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal193=null;
        Token char_literal194=null;
        Token char_literal197=null;
        AtrophyScriptParser.xListProperty_return xListProperty195 =null;

        AtrophyScriptParser.yListProperty_return yListProperty196 =null;


        CommonTree string_literal193_tree=null;
        CommonTree char_literal194_tree=null;
        CommonTree char_literal197_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_yListProperty=new RewriteRuleSubtreeStream(adaptor,"rule yListProperty");
        RewriteRuleSubtreeStream stream_xListProperty=new RewriteRuleSubtreeStream(adaptor,"rule xListProperty");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:293:16: ( 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:294:4: 'destination' '{' xListProperty yListProperty '}'
            {
            string_literal193=(Token)match(input,104,FOLLOW_104_in_teleDestination1892);  
            stream_104.add(string_literal193);


            char_literal194=(Token)match(input,153,FOLLOW_153_in_teleDestination1894);  
            stream_153.add(char_literal194);


            pushFollow(FOLLOW_xListProperty_in_teleDestination1896);
            xListProperty195=xListProperty();

            state._fsp--;

            stream_xListProperty.add(xListProperty195.getTree());

            pushFollow(FOLLOW_yListProperty_in_teleDestination1898);
            yListProperty196=yListProperty();

            state._fsp--;

            stream_yListProperty.add(yListProperty196.getTree());

            char_literal197=(Token)match(input,154,FOLLOW_154_in_teleDestination1900);  
            stream_154.add(char_literal197);


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
            // 294:54: -> ^( TELEDEST xListProperty yListProperty )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:294:57: ^( TELEDEST xListProperty yListProperty )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:297:1: unitInfo : ( isName | isFaction | hasItem | hasWeapon | isAlive | isInvestigated | teleDestination )* ;
    public final AtrophyScriptParser.unitInfo_return unitInfo() throws RecognitionException {
        AtrophyScriptParser.unitInfo_return retval = new AtrophyScriptParser.unitInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName198 =null;

        AtrophyScriptParser.isFaction_return isFaction199 =null;

        AtrophyScriptParser.hasItem_return hasItem200 =null;

        AtrophyScriptParser.hasWeapon_return hasWeapon201 =null;

        AtrophyScriptParser.isAlive_return isAlive202 =null;

        AtrophyScriptParser.isInvestigated_return isInvestigated203 =null;

        AtrophyScriptParser.teleDestination_return teleDestination204 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:297:9: ( ( isName | isFaction | hasItem | hasWeapon | isAlive | isInvestigated | teleDestination )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:298:4: ( isName | isFaction | hasItem | hasWeapon | isAlive | isInvestigated | teleDestination )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:298:4: ( isName | isFaction | hasItem | hasWeapon | isAlive | isInvestigated | teleDestination )*
            loop35:
            do {
                int alt35=8;
                switch ( input.LA(1) ) {
                case 112:
                    {
                    alt35=1;
                    }
                    break;
                case 110:
                    {
                    alt35=2;
                    }
                    break;
                case 106:
                    {
                    alt35=3;
                    }
                    break;
                case 107:
                    {
                    alt35=4;
                    }
                    break;
                case 109:
                    {
                    alt35=5;
                    }
                    break;
                case 111:
                    {
                    alt35=6;
                    }
                    break;
                case 104:
                    {
                    alt35=7;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:298:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_unitInfo1926);
            	    isName198=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName198.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:6: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_unitInfo1933);
            	    isFaction199=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction199.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:300:6: hasItem
            	    {
            	    pushFollow(FOLLOW_hasItem_in_unitInfo1940);
            	    hasItem200=hasItem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasItem200.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:301:6: hasWeapon
            	    {
            	    pushFollow(FOLLOW_hasWeapon_in_unitInfo1947);
            	    hasWeapon201=hasWeapon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasWeapon201.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:302:6: isAlive
            	    {
            	    pushFollow(FOLLOW_isAlive_in_unitInfo1954);
            	    isAlive202=isAlive();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isAlive202.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:303:6: isInvestigated
            	    {
            	    pushFollow(FOLLOW_isInvestigated_in_unitInfo1961);
            	    isInvestigated203=isInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isInvestigated203.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:6: teleDestination
            	    {
            	    pushFollow(FOLLOW_teleDestination_in_unitInfo1968);
            	    teleDestination204=teleDestination();

            	    state._fsp--;

            	    adaptor.addChild(root_0, teleDestination204.getTree());

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
    // $ANTLR end "unitInfo"


    public static class spawnUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spawnUnit"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:307:1: spawnUnit : 'spawnUnit' '{' unitInfo '}' -> ^( SPAWNUNIT unitInfo ) ;
    public final AtrophyScriptParser.spawnUnit_return spawnUnit() throws RecognitionException {
        AtrophyScriptParser.spawnUnit_return retval = new AtrophyScriptParser.spawnUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal205=null;
        Token char_literal206=null;
        Token char_literal208=null;
        AtrophyScriptParser.unitInfo_return unitInfo207 =null;


        CommonTree string_literal205_tree=null;
        CommonTree char_literal206_tree=null;
        CommonTree char_literal208_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:307:10: ( 'spawnUnit' '{' unitInfo '}' -> ^( SPAWNUNIT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:4: 'spawnUnit' '{' unitInfo '}'
            {
            string_literal205=(Token)match(input,132,FOLLOW_132_in_spawnUnit1987);  
            stream_132.add(string_literal205);


            char_literal206=(Token)match(input,153,FOLLOW_153_in_spawnUnit1989);  
            stream_153.add(char_literal206);


            pushFollow(FOLLOW_unitInfo_in_spawnUnit1991);
            unitInfo207=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo207.getTree());

            char_literal208=(Token)match(input,154,FOLLOW_154_in_spawnUnit1993);  
            stream_154.add(char_literal208);


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
            // 308:33: -> ^( SPAWNUNIT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:36: ^( SPAWNUNIT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:311:1: removeUnit : 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) ;
    public final AtrophyScriptParser.removeUnit_return removeUnit() throws RecognitionException {
        AtrophyScriptParser.removeUnit_return retval = new AtrophyScriptParser.removeUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal209=null;
        Token char_literal210=null;
        Token char_literal212=null;
        AtrophyScriptParser.unitInfo_return unitInfo211 =null;


        CommonTree string_literal209_tree=null;
        CommonTree char_literal210_tree=null;
        CommonTree char_literal212_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:311:11: ( 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:312:4: 'removeUnit' '{' unitInfo '}'
            {
            string_literal209=(Token)match(input,129,FOLLOW_129_in_removeUnit2016);  
            stream_129.add(string_literal209);


            char_literal210=(Token)match(input,153,FOLLOW_153_in_removeUnit2018);  
            stream_153.add(char_literal210);


            pushFollow(FOLLOW_unitInfo_in_removeUnit2020);
            unitInfo211=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo211.getTree());

            char_literal212=(Token)match(input,154,FOLLOW_154_in_removeUnit2022);  
            stream_154.add(char_literal212);


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
            // 312:34: -> ^( REMOVEUNIT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:312:37: ^( REMOVEUNIT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:315:1: killUnit : 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) ;
    public final AtrophyScriptParser.killUnit_return killUnit() throws RecognitionException {
        AtrophyScriptParser.killUnit_return retval = new AtrophyScriptParser.killUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal213=null;
        Token char_literal214=null;
        Token char_literal216=null;
        AtrophyScriptParser.unitInfo_return unitInfo215 =null;


        CommonTree string_literal213_tree=null;
        CommonTree char_literal214_tree=null;
        CommonTree char_literal216_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:315:9: ( 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:316:4: 'killUnit' '{' unitInfo '}'
            {
            string_literal213=(Token)match(input,113,FOLLOW_113_in_killUnit2045);  
            stream_113.add(string_literal213);


            char_literal214=(Token)match(input,153,FOLLOW_153_in_killUnit2047);  
            stream_153.add(char_literal214);


            pushFollow(FOLLOW_unitInfo_in_killUnit2049);
            unitInfo215=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo215.getTree());

            char_literal216=(Token)match(input,154,FOLLOW_154_in_killUnit2051);  
            stream_154.add(char_literal216);


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
            // 316:32: -> ^( KILLUNIT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:316:35: ^( KILLUNIT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:319:1: teleportUnit : 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) ;
    public final AtrophyScriptParser.teleportUnit_return teleportUnit() throws RecognitionException {
        AtrophyScriptParser.teleportUnit_return retval = new AtrophyScriptParser.teleportUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal217=null;
        Token char_literal218=null;
        Token char_literal220=null;
        AtrophyScriptParser.unitInfo_return unitInfo219 =null;


        CommonTree string_literal217_tree=null;
        CommonTree char_literal218_tree=null;
        CommonTree char_literal220_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:319:13: ( 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:320:4: 'teleport' '{' unitInfo '}'
            {
            string_literal217=(Token)match(input,141,FOLLOW_141_in_teleportUnit2074);  
            stream_141.add(string_literal217);


            char_literal218=(Token)match(input,153,FOLLOW_153_in_teleportUnit2076);  
            stream_153.add(char_literal218);


            pushFollow(FOLLOW_unitInfo_in_teleportUnit2078);
            unitInfo219=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo219.getTree());

            char_literal220=(Token)match(input,154,FOLLOW_154_in_teleportUnit2080);  
            stream_154.add(char_literal220);


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
            // 320:32: -> ^( TELEPORT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:320:35: ^( TELEPORT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:323:1: converseUnit : 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) ;
    public final AtrophyScriptParser.converseUnit_return converseUnit() throws RecognitionException {
        AtrophyScriptParser.converseUnit_return retval = new AtrophyScriptParser.converseUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal221=null;
        Token char_literal222=null;
        Token char_literal224=null;
        AtrophyScriptParser.unitInfo_return unitInfo223 =null;


        CommonTree string_literal221_tree=null;
        CommonTree char_literal222_tree=null;
        CommonTree char_literal224_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:323:13: ( 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:324:4: 'converse' '{' unitInfo '}'
            {
            string_literal221=(Token)match(input,102,FOLLOW_102_in_converseUnit2103);  
            stream_102.add(string_literal221);


            char_literal222=(Token)match(input,153,FOLLOW_153_in_converseUnit2105);  
            stream_153.add(char_literal222);


            pushFollow(FOLLOW_unitInfo_in_converseUnit2107);
            unitInfo223=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo223.getTree());

            char_literal224=(Token)match(input,154,FOLLOW_154_in_converseUnit2109);  
            stream_154.add(char_literal224);


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
            // 324:32: -> ^( CONVERSE unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:324:35: ^( CONVERSE unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:1: createSaferoom : 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.createSaferoom_return createSaferoom() throws RecognitionException {
        AtrophyScriptParser.createSaferoom_return retval = new AtrophyScriptParser.createSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal225=null;
        Token char_literal226=null;
        Token char_literal228=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo227 =null;


        CommonTree string_literal225_tree=null;
        CommonTree char_literal226_tree=null;
        CommonTree char_literal228_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:15: ( 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:328:4: 'saferoom' '{' saferoomInfo '}'
            {
            string_literal225=(Token)match(input,131,FOLLOW_131_in_createSaferoom2132);  
            stream_131.add(string_literal225);


            char_literal226=(Token)match(input,153,FOLLOW_153_in_createSaferoom2134);  
            stream_153.add(char_literal226);


            pushFollow(FOLLOW_saferoomInfo_in_createSaferoom2136);
            saferoomInfo227=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo227.getTree());

            char_literal228=(Token)match(input,154,FOLLOW_154_in_createSaferoom2138);  
            stream_154.add(char_literal228);


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
            // 328:36: -> ^( SAFEROOM saferoomInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:328:39: ^( SAFEROOM saferoomInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:1: removeSaferoom : 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.removeSaferoom_return removeSaferoom() throws RecognitionException {
        AtrophyScriptParser.removeSaferoom_return retval = new AtrophyScriptParser.removeSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal229=null;
        Token char_literal230=null;
        Token char_literal232=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo231 =null;


        CommonTree string_literal229_tree=null;
        CommonTree char_literal230_tree=null;
        CommonTree char_literal232_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:15: ( 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:332:4: 'removeSaferoom' '{' saferoomInfo '}'
            {
            string_literal229=(Token)match(input,127,FOLLOW_127_in_removeSaferoom2161);  
            stream_127.add(string_literal229);


            char_literal230=(Token)match(input,153,FOLLOW_153_in_removeSaferoom2163);  
            stream_153.add(char_literal230);


            pushFollow(FOLLOW_saferoomInfo_in_removeSaferoom2165);
            saferoomInfo231=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo231.getTree());

            char_literal232=(Token)match(input,154,FOLLOW_154_in_removeSaferoom2167);  
            stream_154.add(char_literal232);


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
            // 332:42: -> ^( REMOVESAFEROOM saferoomInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:332:45: ^( REMOVESAFEROOM saferoomInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:1: containsFaction : 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) ;
    public final AtrophyScriptParser.containsFaction_return containsFaction() throws RecognitionException {
        AtrophyScriptParser.containsFaction_return retval = new AtrophyScriptParser.containsFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal233=null;
        AtrophyScriptParser.stringList_return stringList234 =null;


        CommonTree string_literal233_tree=null;
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:16: ( 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:4: 'containsFaction:' stringList
            {
            string_literal233=(Token)match(input,101,FOLLOW_101_in_containsFaction2190);  
            stream_101.add(string_literal233);


            pushFollow(FOLLOW_stringList_in_containsFaction2192);
            stringList234=stringList();

            state._fsp--;

            stream_stringList.add(stringList234.getTree());

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
            // 336:34: -> ^( CONTAINSFACTION stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:37: ^( CONTAINSFACTION stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:339:1: saferoomInfo : ( containsFaction | isName )* ;
    public final AtrophyScriptParser.saferoomInfo_return saferoomInfo() throws RecognitionException {
        AtrophyScriptParser.saferoomInfo_return retval = new AtrophyScriptParser.saferoomInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.containsFaction_return containsFaction235 =null;

        AtrophyScriptParser.isName_return isName236 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:339:13: ( ( containsFaction | isName )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:4: ( containsFaction | isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:4: ( containsFaction | isName )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==101) ) {
                    alt36=1;
                }
                else if ( (LA36_0==112) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:5: containsFaction
            	    {
            	    pushFollow(FOLLOW_containsFaction_in_saferoomInfo2216);
            	    containsFaction235=containsFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, containsFaction235.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:341:6: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_saferoomInfo2223);
            	    isName236=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName236.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:344:1: loadMap : 'loadMap:' stringLiteral -> ^( LOADMAP stringLiteral ) ;
    public final AtrophyScriptParser.loadMap_return loadMap() throws RecognitionException {
        AtrophyScriptParser.loadMap_return retval = new AtrophyScriptParser.loadMap_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal237=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral238 =null;


        CommonTree string_literal237_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:344:8: ( 'loadMap:' stringLiteral -> ^( LOADMAP stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:345:4: 'loadMap:' stringLiteral
            {
            string_literal237=(Token)match(input,116,FOLLOW_116_in_loadMap2240);  
            stream_116.add(string_literal237);


            pushFollow(FOLLOW_stringLiteral_in_loadMap2242);
            stringLiteral238=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral238.getTree());

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
            // 345:29: -> ^( LOADMAP stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:345:32: ^( LOADMAP stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:348:1: lockDoor : 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.lockDoor_return lockDoor() throws RecognitionException {
        AtrophyScriptParser.lockDoor_return retval = new AtrophyScriptParser.lockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal239=null;
        Token char_literal240=null;
        Token char_literal242=null;
        AtrophyScriptParser.doorInfo_return doorInfo241 =null;


        CommonTree string_literal239_tree=null;
        CommonTree char_literal240_tree=null;
        CommonTree char_literal242_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:348:9: ( 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:349:4: 'lockDoor' '{' doorInfo '}'
            {
            string_literal239=(Token)match(input,117,FOLLOW_117_in_lockDoor2265);  
            stream_117.add(string_literal239);


            char_literal240=(Token)match(input,153,FOLLOW_153_in_lockDoor2267);  
            stream_153.add(char_literal240);


            pushFollow(FOLLOW_doorInfo_in_lockDoor2269);
            doorInfo241=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo241.getTree());

            char_literal242=(Token)match(input,154,FOLLOW_154_in_lockDoor2271);  
            stream_154.add(char_literal242);


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
            // 349:32: -> ^( LOCKDOOR doorInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:349:35: ^( LOCKDOOR doorInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:1: unlockDoor : 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.unlockDoor_return unlockDoor() throws RecognitionException {
        AtrophyScriptParser.unlockDoor_return retval = new AtrophyScriptParser.unlockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal243=null;
        Token char_literal244=null;
        Token char_literal246=null;
        AtrophyScriptParser.doorInfo_return doorInfo245 =null;


        CommonTree string_literal243_tree=null;
        CommonTree char_literal244_tree=null;
        CommonTree char_literal246_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:11: ( 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:353:4: 'unlockDoor' '{' doorInfo '}'
            {
            string_literal243=(Token)match(input,148,FOLLOW_148_in_unlockDoor2294);  
            stream_148.add(string_literal243);


            char_literal244=(Token)match(input,153,FOLLOW_153_in_unlockDoor2296);  
            stream_153.add(char_literal244);


            pushFollow(FOLLOW_doorInfo_in_unlockDoor2298);
            doorInfo245=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo245.getTree());

            char_literal246=(Token)match(input,154,FOLLOW_154_in_unlockDoor2300);  
            stream_154.add(char_literal246);


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
            // 353:34: -> ^( UNLOCKDOOR doorInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:353:37: ^( UNLOCKDOOR doorInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:1: doorInfo : 'name:' stringList -> ^( DOORNAMES stringList ) ;
    public final AtrophyScriptParser.doorInfo_return doorInfo() throws RecognitionException {
        AtrophyScriptParser.doorInfo_return retval = new AtrophyScriptParser.doorInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal247=null;
        AtrophyScriptParser.stringList_return stringList248 =null;


        CommonTree string_literal247_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:9: ( 'name:' stringList -> ^( DOORNAMES stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:357:4: 'name:' stringList
            {
            string_literal247=(Token)match(input,120,FOLLOW_120_in_doorInfo2323);  
            stream_120.add(string_literal247);


            pushFollow(FOLLOW_stringList_in_doorInfo2325);
            stringList248=stringList();

            state._fsp--;

            stream_stringList.add(stringList248.getTree());

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
            // 357:23: -> ^( DOORNAMES stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:357:26: ^( DOORNAMES stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:1: addTag : ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) );
    public final AtrophyScriptParser.addTag_return addTag() throws RecognitionException {
        AtrophyScriptParser.addTag_return retval = new AtrophyScriptParser.addTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal249=null;
        Token ADD_TAG_PREFIX251=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral250 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral252 =null;


        CommonTree string_literal249_tree=null;
        CommonTree ADD_TAG_PREFIX251_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_ADD_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token ADD_TAG_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:7: ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==95) ) {
                alt37=1;
            }
            else if ( (LA37_0==ADD_TAG_PREFIX) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:361:4: 'addTag:' stringLiteral
                    {
                    string_literal249=(Token)match(input,95,FOLLOW_95_in_addTag2348);  
                    stream_95.add(string_literal249);


                    pushFollow(FOLLOW_stringLiteral_in_addTag2350);
                    stringLiteral250=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral250.getTree());

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
                    // 361:28: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:361:31: ^( ADDTAG stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:362:6: ADD_TAG_PREFIX stringLiteral
                    {
                    ADD_TAG_PREFIX251=(Token)match(input,ADD_TAG_PREFIX,FOLLOW_ADD_TAG_PREFIX_in_addTag2365);  
                    stream_ADD_TAG_PREFIX.add(ADD_TAG_PREFIX251);


                    pushFollow(FOLLOW_stringLiteral_in_addTag2367);
                    stringLiteral252=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral252.getTree());

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
                    // 362:35: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:362:38: ^( ADDTAG stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:365:1: removeTag : ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) );
    public final AtrophyScriptParser.removeTag_return removeTag() throws RecognitionException {
        AtrophyScriptParser.removeTag_return retval = new AtrophyScriptParser.removeTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal253=null;
        Token REMOVE_TAG_PREFIX255=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral254 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral256 =null;


        CommonTree string_literal253_tree=null;
        CommonTree REMOVE_TAG_PREFIX255_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_REMOVE_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token REMOVE_TAG_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:365:10: ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==128) ) {
                alt38=1;
            }
            else if ( (LA38_0==REMOVE_TAG_PREFIX) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:366:4: 'removeTag:' stringLiteral
                    {
                    string_literal253=(Token)match(input,128,FOLLOW_128_in_removeTag2390);  
                    stream_128.add(string_literal253);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag2392);
                    stringLiteral254=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral254.getTree());

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
                    // 366:31: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:366:34: ^( REMOVETAG stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:6: REMOVE_TAG_PREFIX stringLiteral
                    {
                    REMOVE_TAG_PREFIX255=(Token)match(input,REMOVE_TAG_PREFIX,FOLLOW_REMOVE_TAG_PREFIX_in_removeTag2407);  
                    stream_REMOVE_TAG_PREFIX.add(REMOVE_TAG_PREFIX255);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag2409);
                    stringLiteral256=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral256.getTree());

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
                    // 367:38: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:41: ^( REMOVETAG stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:370:1: directorBias : 'directorBias:' -> ^( DIRECTORBIAS ) ;
    public final AtrophyScriptParser.directorBias_return directorBias() throws RecognitionException {
        AtrophyScriptParser.directorBias_return retval = new AtrophyScriptParser.directorBias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal257=null;

        CommonTree string_literal257_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:370:13: ( 'directorBias:' -> ^( DIRECTORBIAS ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:371:4: 'directorBias:'
            {
            string_literal257=(Token)match(input,105,FOLLOW_105_in_directorBias2432);  
            stream_105.add(string_literal257);


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
            // 371:20: -> ^( DIRECTORBIAS )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:371:23: ^( DIRECTORBIAS )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:374:1: changeAiNode : 'changeAiNode:' -> ^( CHANGEAINODE ) ;
    public final AtrophyScriptParser.changeAiNode_return changeAiNode() throws RecognitionException {
        AtrophyScriptParser.changeAiNode_return retval = new AtrophyScriptParser.changeAiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal258=null;

        CommonTree string_literal258_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:374:13: ( 'changeAiNode:' -> ^( CHANGEAINODE ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:375:4: 'changeAiNode:'
            {
            string_literal258=(Token)match(input,99,FOLLOW_99_in_changeAiNode2453);  
            stream_99.add(string_literal258);


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
            // 375:21: -> ^( CHANGEAINODE )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:375:24: ^( CHANGEAINODE )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:378:1: beginStatement : ( 'INIT' | 'init' ) '{' commandCallList '}' -> ^( INIT commandCallList ) ;
    public final AtrophyScriptParser.beginStatement_return beginStatement() throws RecognitionException {
        AtrophyScriptParser.beginStatement_return retval = new AtrophyScriptParser.beginStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal259=null;
        Token string_literal260=null;
        Token char_literal261=null;
        Token char_literal263=null;
        AtrophyScriptParser.commandCallList_return commandCallList262 =null;


        CommonTree string_literal259_tree=null;
        CommonTree string_literal260_tree=null;
        CommonTree char_literal261_tree=null;
        CommonTree char_literal263_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_commandCallList=new RewriteRuleSubtreeStream(adaptor,"rule commandCallList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:378:15: ( ( 'INIT' | 'init' ) '{' commandCallList '}' -> ^( INIT commandCallList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:4: ( 'INIT' | 'init' ) '{' commandCallList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:4: ( 'INIT' | 'init' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==85) ) {
                alt39=1;
            }
            else if ( (LA39_0==108) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:5: 'INIT'
                    {
                    string_literal259=(Token)match(input,85,FOLLOW_85_in_beginStatement2476);  
                    stream_85.add(string_literal259);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:14: 'init'
                    {
                    string_literal260=(Token)match(input,108,FOLLOW_108_in_beginStatement2480);  
                    stream_108.add(string_literal260);


                    }
                    break;

            }


            char_literal261=(Token)match(input,153,FOLLOW_153_in_beginStatement2483);  
            stream_153.add(char_literal261);


            pushFollow(FOLLOW_commandCallList_in_beginStatement2488);
            commandCallList262=commandCallList();

            state._fsp--;

            stream_commandCallList.add(commandCallList262.getTree());

            char_literal263=(Token)match(input,154,FOLLOW_154_in_beginStatement2493);  
            stream_154.add(char_literal263);


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
            // 382:4: -> ^( INIT commandCallList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:383:4: ^( INIT commandCallList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:386:1: commandCallList : commandCall ( ',' ! commandCall )* ;
    public final AtrophyScriptParser.commandCallList_return commandCallList() throws RecognitionException {
        AtrophyScriptParser.commandCallList_return retval = new AtrophyScriptParser.commandCallList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal265=null;
        AtrophyScriptParser.commandCall_return commandCall264 =null;

        AtrophyScriptParser.commandCall_return commandCall266 =null;


        CommonTree char_literal265_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:386:16: ( commandCall ( ',' ! commandCall )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:387:4: commandCall ( ',' ! commandCall )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_commandCall_in_commandCallList2520);
            commandCall264=commandCall();

            state._fsp--;

            adaptor.addChild(root_0, commandCall264.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:387:16: ( ',' ! commandCall )*
            loop40:
            do {
                int alt40=2;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:387:17: ',' ! commandCall
            	    {
            	    char_literal265=(Token)match(input,74,FOLLOW_74_in_commandCallList2523); 

            	    pushFollow(FOLLOW_commandCall_in_commandCallList2526);
            	    commandCall266=commandCall();

            	    state._fsp--;

            	    adaptor.addChild(root_0, commandCall266.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:390:1: commandCall : ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) );
    public final AtrophyScriptParser.commandCall_return commandCall() throws RecognitionException {
        AtrophyScriptParser.commandCall_return retval = new AtrophyScriptParser.commandCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal267=null;
        Token COMMAND_CALL_PREFIX269=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral268 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral270 =null;


        CommonTree string_literal267_tree=null;
        CommonTree COMMAND_CALL_PREFIX269_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_COMMAND_CALL_PREFIX=new RewriteRuleTokenStream(adaptor,"token COMMAND_CALL_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:390:12: ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==98) ) {
                alt41=1;
            }
            else if ( (LA41_0==COMMAND_CALL_PREFIX) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:391:4: 'callCommand:' stringLiteral
                    {
                    string_literal267=(Token)match(input,98,FOLLOW_98_in_commandCall2543);  
                    stream_98.add(string_literal267);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall2545);
                    stringLiteral268=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral268.getTree());

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
                    // 391:33: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:391:36: ^( COMMAND_CALL stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:392:6: COMMAND_CALL_PREFIX stringLiteral
                    {
                    COMMAND_CALL_PREFIX269=(Token)match(input,COMMAND_CALL_PREFIX,FOLLOW_COMMAND_CALL_PREFIX_in_commandCall2560);  
                    stream_COMMAND_CALL_PREFIX.add(COMMAND_CALL_PREFIX269);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall2562);
                    stringLiteral270=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral270.getTree());

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
                    // 392:40: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:392:43: ^( COMMAND_CALL stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:395:1: stringLiteral : '\"' ! ( . )* '\"' !;
    public final AtrophyScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        AtrophyScriptParser.stringLiteral_return retval = new AtrophyScriptParser.stringLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal271=null;
        Token wildcard272=null;
        Token char_literal273=null;

        CommonTree char_literal271_tree=null;
        CommonTree wildcard272_tree=null;
        CommonTree char_literal273_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:395:14: ( '\"' ! ( . )* '\"' !)
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:396:4: '\"' ! ( . )* '\"' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal271=(Token)match(input,69,FOLLOW_69_in_stringLiteral2585); 

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:396:9: ( . )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==69) ) {
                    alt42=2;
                }
                else if ( ((LA42_0 >= ADDTAG && LA42_0 <= 68)||(LA42_0 >= 70 && LA42_0 <= 154)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:396:10: .
            	    {
            	    wildcard272=(Token)input.LT(1);

            	    matchAny(input); 
            	    wildcard272_tree = (CommonTree)adaptor.create(wildcard272);
            	    adaptor.addChild(root_0, wildcard272_tree);


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            char_literal273=(Token)match(input,69,FOLLOW_69_in_stringLiteral2593); 

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


    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA40_eotS =
        "\13\uffff";
    static final String DFA40_eofS =
        "\13\uffff";
    static final String DFA40_minS =
        "\1\112\1\5\1\uffff\2\105\2\4\1\uffff\1\4\1\uffff\1\4";
    static final String DFA40_maxS =
        "\1\u009a\1\u0095\1\uffff\2\105\2\u009a\1\uffff\1\u009a\1\uffff\1"+
        "\u009a";
    static final String DFA40_acceptS =
        "\2\uffff\1\2\4\uffff\1\1\1\uffff\1\1\1\uffff";
    static final String DFA40_specialS =
        "\13\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\117\uffff\1\2",
            "\1\2\6\uffff\1\4\35\uffff\1\2\23\uffff\1\2\40\uffff\1\2\2\uffff"+
            "\1\3\1\2\2\uffff\1\2\2\uffff\1\2\7\uffff\1\2\2\uffff\2\2\11"+
            "\uffff\3\2\1\uffff\2\2\10\uffff\1\2\6\uffff\2\2",
            "",
            "\1\5",
            "\1\6",
            "\101\10\1\7\125\10",
            "\101\12\1\11\125\12",
            "",
            "\101\10\1\7\125\10",
            "",
            "\101\12\1\11\125\12"
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "()* loopback of 387:16: ( ',' ! commandCall )*";
        }
    }
 

    public static final BitSet FOLLOW_command_in_prog285 = new BitSet(new long[]{0x0000000000000000L,0x40C010923FFC0000L,0x0000000000038780L});
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
    public static final BitSet FOLLOW_talkTreeDecl_in_command378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_talkDecl_in_command385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_requiredAssignment398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_requiredAssignment400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requiredAssignment_in_varAssignment424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_mapSize451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_118_in_mapSize455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_mapSize458 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mapSize460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_mapSize462 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mapSize464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_mapSize466 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mapSize468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_mapSize470 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mapSize472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_mapSize474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_mapSpawns499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_119_in_mapSpawns503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_mapSpawns506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000000004000000L});
    public static final BitSet FOLLOW_stringList_in_mapSpawns508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_mapSpawns511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_blockDecl536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000002000000L});
    public static final BitSet FOLLOW_97_in_blockDecl540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000002000000L});
    public static final BitSet FOLLOW_varAssignment_in_blockDecl543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_blockDecl545 = new BitSet(new long[]{0x0000000000000000L,0x3E0C000140000000L,0x0000000005CC586CL});
    public static final BitSet FOLLOW_properties_in_blockDecl547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_blockDecl549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_portalDecl575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000002000000L});
    public static final BitSet FOLLOW_126_in_portalDecl579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000002000000L});
    public static final BitSet FOLLOW_varAssignment_in_portalDecl582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_portalDecl584 = new BitSet(new long[]{0x0000000000000000L,0x3E0C000140000000L,0x0000000005CC586CL});
    public static final BitSet FOLLOW_properties_in_portalDecl586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_portalDecl588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_coverDecl614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000002000000L});
    public static final BitSet FOLLOW_103_in_coverDecl618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000002000000L});
    public static final BitSet FOLLOW_varAssignment_in_coverDecl621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_coverDecl623 = new BitSet(new long[]{0x0000000000000000L,0x3E0C000140000000L,0x0000000005CC586CL});
    public static final BitSet FOLLOW_properties_in_coverDecl625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_coverDecl627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_stashDecl653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000002000000L});
    public static final BitSet FOLLOW_135_in_stashDecl657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000002000000L});
    public static final BitSet FOLLOW_varAssignment_in_stashDecl660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_stashDecl662 = new BitSet(new long[]{0x0000000000000000L,0x3E0C000140000000L,0x0000000005CC586CL});
    public static final BitSet FOLLOW_properties_in_stashDecl664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stashDecl666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_textureBlockDecl692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_144_in_textureBlockDecl696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_143_in_textureBlockDecl700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_textureBlockDecl703 = new BitSet(new long[]{0x0000000000000000L,0x3E0C000140000000L,0x0000000005CC586CL});
    public static final BitSet FOLLOW_properties_in_textureBlockDecl705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_textureBlockDecl707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_triggerDecl731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_145_in_triggerDecl735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_requiredAssignment_in_triggerDecl738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_triggerDecl740 = new BitSet(new long[]{0x0000000000000000L,0x3E0C000140000000L,0x0000000005CC586CL});
    public static final BitSet FOLLOW_properties_in_triggerDecl742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_triggerDecl744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_commandDecl770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_100_in_commandDecl774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_requiredAssignment_in_commandDecl777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_commandDecl779 = new BitSet(new long[]{0x4000040000001020L,0x8032024C80000000L,0x000000000030201BL});
    public static final BitSet FOLLOW_triggerEffectList_in_commandDecl781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_commandDecl783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_talkTreeDecl813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_138_in_talkTreeDecl817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_137_in_talkTreeDecl821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_requiredAssignment_in_talkTreeDecl824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_talkTreeDecl826 = new BitSet(new long[]{0x0000000000000000L,0x3E0C000140000000L,0x0000000005CC586CL});
    public static final BitSet FOLLOW_properties_in_talkTreeDecl827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_talkTreeDecl829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_talkDecl855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_136_in_talkDecl859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_talkDecl862 = new BitSet(new long[]{0x0000000000000000L,0x3E0C000140000000L,0x0000000005CC586CL});
    public static final BitSet FOLLOW_properties_in_talkDecl864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_talkDecl866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xListProperty_in_properties890 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_yListProperty_in_properties897 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_factionTerritoryProperty_in_properties904 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_factionZoneProperty_in_properties911 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_saferoomProperty_in_properties918 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_stageProperty_in_properties925 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_stageDeclProperty_in_properties932 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_talkMapParentProperty_in_properties939 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_aiInitProperty_in_properties946 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_openingLineProperty_in_properties953 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_lineProperty_in_properties960 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_triggerCondProperty_in_properties967 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_triggerEffectProperty_in_properties974 = new BitSet(new long[]{0x0000000000000002L,0x3E0C000140000000L,0x0000000001CC586CL});
    public static final BitSet FOLLOW_150_in_xListProperty991 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_xListProperty996 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty997 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_151_in_yListProperty1021 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty1023 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_yListProperty1026 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty1027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_142_in_factionTerritoryProperty1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_factionTerritoryProperty1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_factionZoneProperty1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_factionZoneProperty1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_saferoomProperty1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_stageDeclProperty1124 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1126 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_stageDeclProperty1129 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_125_in_talkMapParentProperty1158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_124_in_talkMapParentProperty1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_talkMapParentProperty1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_stageProperty1189 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_130_in_stageProperty1193 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_stageProperty1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_aiInitProperty1220 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_94_in_aiInitProperty1224 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BOOL_in_aiInitProperty1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_openingLineProperty1251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_122_in_openingLineProperty1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_123_in_openingLineProperty1259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_openingLineProperty1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_lineProperty1284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_115_in_lineProperty1288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_lineProperty1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_term1314 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000A80L});
    public static final BitSet FOLLOW_condExpression_in_term1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_term1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_term1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanQuery_in_term1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_unary1373 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000A80L});
    public static final BitSet FOLLOW_negation_in_unary1378 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000A80L});
    public static final BitSet FOLLOW_term_in_unary1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_negation1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_condExpression1431 = new BitSet(new long[]{0x0000000000000002L,0x000000000003E010L});
    public static final BitSet FOLLOW_set_in_condExpression1434 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000A80L});
    public static final BitSet FOLLOW_unary_in_condExpression1457 = new BitSet(new long[]{0x0000000000000002L,0x000000000003E010L});
    public static final BitSet FOLLOW_139_in_triggerCondProperty1475 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000A80L});
    public static final BitSet FOLLOW_146_in_triggerCondProperty1479 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000A80L});
    public static final BitSet FOLLOW_condExpression_in_triggerCondProperty1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_triggerEffectProperty1504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_147_in_triggerEffectProperty1508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_triggerEffectProperty1511 = new BitSet(new long[]{0x4000040000001020L,0x8032024C80000000L,0x000000000030201BL});
    public static final BitSet FOLLOW_triggerEffectList_in_triggerEffectProperty1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_triggerEffectProperty1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1536 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_triggerEffectList1539 = new BitSet(new long[]{0x4000040000001020L,0x8032024C80000000L,0x000000000030201BL});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1542 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_updateTalkTree_in_triggerEffect1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnUnit_in_triggerEffect1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeUnit_in_triggerEffect1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_killUnit_in_triggerEffect1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_teleportUnit_in_triggerEffect1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_converseUnit_in_triggerEffect1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createSaferoom_in_triggerEffect1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeSaferoom_in_triggerEffect1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loadMap_in_triggerEffect1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lockDoor_in_triggerEffect1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlockDoor_in_triggerEffect1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addTag_in_triggerEffect1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeTag_in_triggerEffect1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directorBias_in_triggerEffect1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeAiNode_in_triggerEffect1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCallList_in_triggerEffect1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_updateTalkTree1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree1679 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree1698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree1700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_updateTalkTree1702 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_isName1729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_isName1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_isFaction1754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_isFaction1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_hasItem1779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_hasItem1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_hasWeapon1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_hasWeapon1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList1829 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_stringList1832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList1835 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_109_in_isAlive1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_isInvestigated1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_teleDestination1892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_teleDestination1894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_xListProperty_in_teleDestination1896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_yListProperty_in_teleDestination1898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_teleDestination1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_unitInfo1926 = new BitSet(new long[]{0x0000000000000002L,0x0001ED0000000000L});
    public static final BitSet FOLLOW_isFaction_in_unitInfo1933 = new BitSet(new long[]{0x0000000000000002L,0x0001ED0000000000L});
    public static final BitSet FOLLOW_hasItem_in_unitInfo1940 = new BitSet(new long[]{0x0000000000000002L,0x0001ED0000000000L});
    public static final BitSet FOLLOW_hasWeapon_in_unitInfo1947 = new BitSet(new long[]{0x0000000000000002L,0x0001ED0000000000L});
    public static final BitSet FOLLOW_isAlive_in_unitInfo1954 = new BitSet(new long[]{0x0000000000000002L,0x0001ED0000000000L});
    public static final BitSet FOLLOW_isInvestigated_in_unitInfo1961 = new BitSet(new long[]{0x0000000000000002L,0x0001ED0000000000L});
    public static final BitSet FOLLOW_teleDestination_in_unitInfo1968 = new BitSet(new long[]{0x0000000000000002L,0x0001ED0000000000L});
    public static final BitSet FOLLOW_132_in_spawnUnit1987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_spawnUnit1989 = new BitSet(new long[]{0x0000000000000000L,0x0001ED0000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnUnit1991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_spawnUnit1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_removeUnit2016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_removeUnit2018 = new BitSet(new long[]{0x0000000000000000L,0x0001ED0000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_unitInfo_in_removeUnit2020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_removeUnit2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_killUnit2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_killUnit2047 = new BitSet(new long[]{0x0000000000000000L,0x0001ED0000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_unitInfo_in_killUnit2049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_killUnit2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_teleportUnit2074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_teleportUnit2076 = new BitSet(new long[]{0x0000000000000000L,0x0001ED0000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_unitInfo_in_teleportUnit2078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_teleportUnit2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_converseUnit2103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_converseUnit2105 = new BitSet(new long[]{0x0000000000000000L,0x0001ED0000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_unitInfo_in_converseUnit2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_converseUnit2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_createSaferoom2132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_createSaferoom2134 = new BitSet(new long[]{0x0000000000000000L,0x0001002000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_createSaferoom2136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_createSaferoom2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_removeSaferoom2161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_removeSaferoom2163 = new BitSet(new long[]{0x0000000000000000L,0x0001002000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_removeSaferoom2165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_removeSaferoom2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_containsFaction2190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_containsFaction2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsFaction_in_saferoomInfo2216 = new BitSet(new long[]{0x0000000000000002L,0x0001002000000000L});
    public static final BitSet FOLLOW_isName_in_saferoomInfo2223 = new BitSet(new long[]{0x0000000000000002L,0x0001002000000000L});
    public static final BitSet FOLLOW_116_in_loadMap2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_loadMap2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_lockDoor2265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_lockDoor2267 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_doorInfo_in_lockDoor2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_lockDoor2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_unlockDoor2294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_unlockDoor2296 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_doorInfo_in_unlockDoor2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_unlockDoor2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_doorInfo2323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringList_in_doorInfo2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_addTag2348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_TAG_PREFIX_in_addTag2365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_removeTag2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_TAG_PREFIX_in_removeTag2407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_directorBias2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_changeAiNode2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_beginStatement2476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_108_in_beginStatement2480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_beginStatement2483 = new BitSet(new long[]{0x0000000000001000L,0x0000000400000000L});
    public static final BitSet FOLLOW_commandCallList_in_beginStatement2488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_beginStatement2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList2520 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_commandCallList2523 = new BitSet(new long[]{0x0000000000001000L,0x0000000400000000L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList2526 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_98_in_commandCall2543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_CALL_PREFIX_in_commandCall2560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_stringLiteral2585 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_69_in_stringLiteral2593 = new BitSet(new long[]{0x0000000000000002L});

}