// $ANTLR 3.4 C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g 2013-06-25 19:17:27

	package atrophy.combat.level;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AtrophyScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDTAG", "ADD_TAG_PREFIX", "AIINIT", "BLOCK", "BOOL", "CHANGEAINODE", "COMMAND", "COMMAND_CALL", "COMMAND_CALL_PREFIX", "COMMENT", "CONTAINSFACTION", "CONVERSE", "COVER", "DIRECTORBIAS", "DOORNAMES", "EMPTY", "HASITEM", "HASWEAPON", "IDENT", "INIT", "INT", "ISALIVE", "ISDAEMON", "ISDEAD", "ISFACTION", "ISINVESTIGATED", "ISNAME", "ISNOTDAEMON", "ISNOTINVESTIGATED", "KILLUNIT", "LINE", "LOADMAP", "LOCKDOOR", "MAPSIZE", "MAPSPAWNS", "MAXTEAMSIZE", "MINTEAMSIZE", "MULTILINE_COMMENT", "NEGATION", "OPENINGLINE", "PORTAL", "REMOVESAFEROOM", "REMOVETAG", "REMOVEUNIT", "REMOVE_TAG_PREFIX", "SAFEROOM", "SPAWNCHARACTER", "SPAWNTEAM", "STAGELIST", "STASH", "TALK", "TALKMAP", "TALKPARENT", "TALKSTAGE", "TELEDEST", "TELEPORT", "TERRITORY", "TEXTURE", "TEXTUREBLOCK", "TRIGGER", "TRIGGERCOND", "TRIGGEREFFECT", "TRIGGERTYPE", "UNLOCKDOOR", "UPDATETALK", "UPDATE_TREE_PREFIX", "VAR", "WS", "XLIST", "YLIST", "ZONE", "'!='", "'\"'", "'#'", "'('", "')'", "'+'", "','", "'-'", "'::'", "'<'", "'<='", "'=='", "'>'", "'>='", "'BLOCK'", "'COMMAND'", "'COVER'", "'INIT'", "'MAPSIZE'", "'MAPSPAWNS'", "'PORTAL'", "'STASH'", "'TALK'", "'TEXTUREBLOCK'", "'TRIGGER'", "'a:'", "'addTag:'", "'aiInit:'", "'block'", "'callCommand:'", "'changeAiNode:'", "'command'", "'containsFaction:'", "'converse'", "'cover'", "'destination'", "'directorBias:'", "'hasItem:'", "'hasWeapon:'", "'init'", "'isAlive'", "'isDaemon'", "'isDead'", "'isFaction:'", "'isInvestigated'", "'isName:'", "'isNotDaemon'", "'isNotInvestigated'", "'killUnit'", "'l:'", "'line:'", "'loadMap:'", "'lockDoor'", "'mapsize'", "'mapspawns'", "'maxTeamSize:'", "'minTeamSize:'", "'name:'", "'o:'", "'opening:'", "'openingLine:'", "'p:'", "'parent:'", "'portal'", "'removeSaferoom'", "'removeTag:'", "'removeUnit'", "'s:'", "'saferoom'", "'spawnCharacter'", "'spawnTeam'", "'stage:'", "'stages:'", "'stash'", "'talk'", "'tc:'", "'te'", "'teleport'", "'territory:'", "'textureBlock'", "'textureblock'", "'trigger'", "'triggerCond:'", "'triggerEffect'", "'unlockDoor'", "'updateTalk:'", "'x:'", "'y:'", "'zone:'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__158=158;
    public static final int T__159=159;
    public static final int T__160=160;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__165=165;
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
    public static final int ISDAEMON=26;
    public static final int ISDEAD=27;
    public static final int ISFACTION=28;
    public static final int ISINVESTIGATED=29;
    public static final int ISNAME=30;
    public static final int ISNOTDAEMON=31;
    public static final int ISNOTINVESTIGATED=32;
    public static final int KILLUNIT=33;
    public static final int LINE=34;
    public static final int LOADMAP=35;
    public static final int LOCKDOOR=36;
    public static final int MAPSIZE=37;
    public static final int MAPSPAWNS=38;
    public static final int MAXTEAMSIZE=39;
    public static final int MINTEAMSIZE=40;
    public static final int MULTILINE_COMMENT=41;
    public static final int NEGATION=42;
    public static final int OPENINGLINE=43;
    public static final int PORTAL=44;
    public static final int REMOVESAFEROOM=45;
    public static final int REMOVETAG=46;
    public static final int REMOVEUNIT=47;
    public static final int REMOVE_TAG_PREFIX=48;
    public static final int SAFEROOM=49;
    public static final int SPAWNCHARACTER=50;
    public static final int SPAWNTEAM=51;
    public static final int STAGELIST=52;
    public static final int STASH=53;
    public static final int TALK=54;
    public static final int TALKMAP=55;
    public static final int TALKPARENT=56;
    public static final int TALKSTAGE=57;
    public static final int TELEDEST=58;
    public static final int TELEPORT=59;
    public static final int TERRITORY=60;
    public static final int TEXTURE=61;
    public static final int TEXTUREBLOCK=62;
    public static final int TRIGGER=63;
    public static final int TRIGGERCOND=64;
    public static final int TRIGGEREFFECT=65;
    public static final int TRIGGERTYPE=66;
    public static final int UNLOCKDOOR=67;
    public static final int UPDATETALK=68;
    public static final int UPDATE_TREE_PREFIX=69;
    public static final int VAR=70;
    public static final int WS=71;
    public static final int XLIST=72;
    public static final int YLIST=73;
    public static final int ZONE=74;

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:82:1: prog : ( command )* ( beginStatement )? EOF ;
    public final AtrophyScriptParser.prog_return prog() throws RecognitionException {
        AtrophyScriptParser.prog_return retval = new AtrophyScriptParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        AtrophyScriptParser.command_return command1 =null;

        AtrophyScriptParser.beginStatement_return beginStatement2 =null;


        CommonTree EOF3_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:82:5: ( ( command )* ( beginStatement )? EOF )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:83:5: ( command )* ( beginStatement )? EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:83:5: ( command )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 89 && LA1_0 <= 90)||(LA1_0 >= 93 && LA1_0 <= 95)||(LA1_0 >= 97 && LA1_0 <= 99)||LA1_0==103||LA1_0==106||(LA1_0 >= 128 && LA1_0 <= 129)||LA1_0==138||LA1_0==149||(LA1_0 >= 154 && LA1_0 <= 156)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:83:5: command
            	    {
            	    pushFollow(FOLLOW_command_in_prog313);
            	    command1=command();

            	    state._fsp--;

            	    adaptor.addChild(root_0, command1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:84:5: ( beginStatement )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==92||LA2_0==114) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:84:5: beginStatement
                    {
                    pushFollow(FOLLOW_beginStatement_in_prog320);
                    beginStatement2=beginStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, beginStatement2.getTree());

                    }
                    break;

            }


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog327); 
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:88:1: command : ( mapSize | mapSpawns | blockDecl | portalDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl );
    public final AtrophyScriptParser.command_return command() throws RecognitionException {
        AtrophyScriptParser.command_return retval = new AtrophyScriptParser.command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.mapSize_return mapSize4 =null;

        AtrophyScriptParser.mapSpawns_return mapSpawns5 =null;

        AtrophyScriptParser.blockDecl_return blockDecl6 =null;

        AtrophyScriptParser.portalDecl_return portalDecl7 =null;

        AtrophyScriptParser.textureBlockDecl_return textureBlockDecl8 =null;

        AtrophyScriptParser.triggerDecl_return triggerDecl9 =null;

        AtrophyScriptParser.commandDecl_return commandDecl10 =null;

        AtrophyScriptParser.talkDecl_return talkDecl11 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:88:8: ( mapSize | mapSpawns | blockDecl | portalDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 93:
            case 128:
                {
                alt3=1;
                }
                break;
            case 94:
            case 129:
                {
                alt3=2;
                }
                break;
            case 89:
            case 103:
                {
                alt3=3;
                }
                break;
            case 95:
            case 138:
                {
                alt3=4;
                }
                break;
            case 98:
            case 154:
            case 155:
                {
                alt3=5;
                }
                break;
            case 99:
            case 156:
                {
                alt3=6;
                }
                break;
            case 90:
            case 106:
                {
                alt3=7;
                }
                break;
            case 97:
            case 149:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:89:4: mapSize
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSize_in_command343);
                    mapSize4=mapSize();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSize4.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:90:6: mapSpawns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSpawns_in_command350);
                    mapSpawns5=mapSpawns();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSpawns5.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:91:6: blockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_blockDecl_in_command357);
                    blockDecl6=blockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, blockDecl6.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:92:6: portalDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_portalDecl_in_command364);
                    portalDecl7=portalDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, portalDecl7.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:93:6: textureBlockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_textureBlockDecl_in_command371);
                    textureBlockDecl8=textureBlockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, textureBlockDecl8.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:94:6: triggerDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_triggerDecl_in_command378);
                    triggerDecl9=triggerDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, triggerDecl9.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:95:6: commandDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandDecl_in_command385);
                    commandDecl10=commandDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, commandDecl10.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:96:6: talkDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_talkDecl_in_command392);
                    talkDecl11=talkDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, talkDecl11.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:99:1: requiredAssignment : '::' stringLiteral -> ^( VAR stringLiteral ) ;
    public final AtrophyScriptParser.requiredAssignment_return requiredAssignment() throws RecognitionException {
        AtrophyScriptParser.requiredAssignment_return retval = new AtrophyScriptParser.requiredAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal12=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral13 =null;


        CommonTree string_literal12_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:99:19: ( '::' stringLiteral -> ^( VAR stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:100:4: '::' stringLiteral
            {
            string_literal12=(Token)match(input,83,FOLLOW_83_in_requiredAssignment405);  
            stream_83.add(string_literal12);


            pushFollow(FOLLOW_stringLiteral_in_requiredAssignment407);
            stringLiteral13=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral13.getTree());

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
            // 100:23: -> ^( VAR stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:100:26: ^( VAR stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:103:1: varAssignment : ( requiredAssignment | -> ^( EMPTY ) );
    public final AtrophyScriptParser.varAssignment_return varAssignment() throws RecognitionException {
        AtrophyScriptParser.varAssignment_return retval = new AtrophyScriptParser.varAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.requiredAssignment_return requiredAssignment14 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:103:14: ( requiredAssignment | -> ^( EMPTY ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==83) ) {
                alt4=1;
            }
            else if ( (LA4_0==164) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:104:4: requiredAssignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_requiredAssignment_in_varAssignment431);
                    requiredAssignment14=requiredAssignment();

                    state._fsp--;

                    adaptor.addChild(root_0, requiredAssignment14.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:105:6: 
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
                    // 105:6: -> ^( EMPTY )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:105:9: ^( EMPTY )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:1: mapSize : ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) ;
    public final AtrophyScriptParser.mapSize_return mapSize() throws RecognitionException {
        AtrophyScriptParser.mapSize_return retval = new AtrophyScriptParser.mapSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal15=null;
        Token string_literal16=null;
        Token char_literal17=null;
        Token INT18=null;
        Token char_literal19=null;
        Token INT20=null;
        Token char_literal21=null;
        Token INT22=null;
        Token char_literal23=null;
        Token INT24=null;
        Token char_literal25=null;

        CommonTree string_literal15_tree=null;
        CommonTree string_literal16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree INT18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree INT20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree INT22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree INT24_tree=null;
        CommonTree char_literal25_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:8: ( ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:4: ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:4: ( 'MAPSIZE' | 'mapsize' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==93) ) {
                alt5=1;
            }
            else if ( (LA5_0==128) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:5: 'MAPSIZE'
                    {
                    string_literal15=(Token)match(input,93,FOLLOW_93_in_mapSize458);  
                    stream_93.add(string_literal15);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:17: 'mapsize'
                    {
                    string_literal16=(Token)match(input,128,FOLLOW_128_in_mapSize462);  
                    stream_128.add(string_literal16);


                    }
                    break;

            }


            char_literal17=(Token)match(input,164,FOLLOW_164_in_mapSize465);  
            stream_164.add(char_literal17);


            INT18=(Token)match(input,INT,FOLLOW_INT_in_mapSize467);  
            stream_INT.add(INT18);


            char_literal19=(Token)match(input,81,FOLLOW_81_in_mapSize469);  
            stream_81.add(char_literal19);


            INT20=(Token)match(input,INT,FOLLOW_INT_in_mapSize471);  
            stream_INT.add(INT20);


            char_literal21=(Token)match(input,81,FOLLOW_81_in_mapSize473);  
            stream_81.add(char_literal21);


            INT22=(Token)match(input,INT,FOLLOW_INT_in_mapSize475);  
            stream_INT.add(INT22);


            char_literal23=(Token)match(input,81,FOLLOW_81_in_mapSize477);  
            stream_81.add(char_literal23);


            INT24=(Token)match(input,INT,FOLLOW_INT_in_mapSize479);  
            stream_INT.add(INT24);


            char_literal25=(Token)match(input,165,FOLLOW_165_in_mapSize481);  
            stream_165.add(char_literal25);


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
            // 109:64: -> ^( MAPSIZE ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:67: ^( MAPSIZE ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSIZE, "MAPSIZE")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:77: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:112:1: mapSpawns : ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) ;
    public final AtrophyScriptParser.mapSpawns_return mapSpawns() throws RecognitionException {
        AtrophyScriptParser.mapSpawns_return retval = new AtrophyScriptParser.mapSpawns_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal26=null;
        Token string_literal27=null;
        Token char_literal28=null;
        Token char_literal30=null;
        AtrophyScriptParser.stringList_return stringList29 =null;


        CommonTree string_literal26_tree=null;
        CommonTree string_literal27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal30_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:112:10: ( ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:4: ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:4: ( 'MAPSPAWNS' | 'mapspawns' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==94) ) {
                alt6=1;
            }
            else if ( (LA6_0==129) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:5: 'MAPSPAWNS'
                    {
                    string_literal26=(Token)match(input,94,FOLLOW_94_in_mapSpawns506);  
                    stream_94.add(string_literal26);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:19: 'mapspawns'
                    {
                    string_literal27=(Token)match(input,129,FOLLOW_129_in_mapSpawns510);  
                    stream_129.add(string_literal27);


                    }
                    break;

            }


            char_literal28=(Token)match(input,164,FOLLOW_164_in_mapSpawns513);  
            stream_164.add(char_literal28);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:36: ( stringList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==76) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:36: stringList
                    {
                    pushFollow(FOLLOW_stringList_in_mapSpawns515);
                    stringList29=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList29.getTree());

                    }
                    break;

            }


            char_literal30=(Token)match(input,165,FOLLOW_165_in_mapSpawns518);  
            stream_165.add(char_literal30);


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
            // 113:52: -> ^( MAPSPAWNS ( stringList )? )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:55: ^( MAPSPAWNS ( stringList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSPAWNS, "MAPSPAWNS")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:67: ( stringList )?
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:116:1: blockDecl : ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) ;
    public final AtrophyScriptParser.blockDecl_return blockDecl() throws RecognitionException {
        AtrophyScriptParser.blockDecl_return retval = new AtrophyScriptParser.blockDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal31=null;
        Token string_literal32=null;
        Token char_literal34=null;
        Token char_literal36=null;
        AtrophyScriptParser.varAssignment_return varAssignment33 =null;

        AtrophyScriptParser.properties_return properties35 =null;


        CommonTree string_literal31_tree=null;
        CommonTree string_literal32_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal36_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:116:10: ( ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:4: ( 'BLOCK' | 'block' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:4: ( 'BLOCK' | 'block' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==89) ) {
                alt8=1;
            }
            else if ( (LA8_0==103) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:5: 'BLOCK'
                    {
                    string_literal31=(Token)match(input,89,FOLLOW_89_in_blockDecl543);  
                    stream_89.add(string_literal31);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:15: 'block'
                    {
                    string_literal32=(Token)match(input,103,FOLLOW_103_in_blockDecl547);  
                    stream_103.add(string_literal32);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_blockDecl550);
            varAssignment33=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment33.getTree());

            char_literal34=(Token)match(input,164,FOLLOW_164_in_blockDecl552);  
            stream_164.add(char_literal34);


            pushFollow(FOLLOW_properties_in_blockDecl554);
            properties35=properties();

            state._fsp--;

            stream_properties.add(properties35.getTree());

            char_literal36=(Token)match(input,165,FOLLOW_165_in_blockDecl556);  
            stream_165.add(char_literal36);


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
            // 117:57: -> ^( BLOCK varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:60: ^( BLOCK varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:1: portalDecl : ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) ;
    public final AtrophyScriptParser.portalDecl_return portalDecl() throws RecognitionException {
        AtrophyScriptParser.portalDecl_return retval = new AtrophyScriptParser.portalDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal37=null;
        Token string_literal38=null;
        Token char_literal40=null;
        Token char_literal42=null;
        AtrophyScriptParser.varAssignment_return varAssignment39 =null;

        AtrophyScriptParser.properties_return properties41 =null;


        CommonTree string_literal37_tree=null;
        CommonTree string_literal38_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree char_literal42_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:11: ( ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:4: ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:4: ( 'PORTAL' | 'portal' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==95) ) {
                alt9=1;
            }
            else if ( (LA9_0==138) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:5: 'PORTAL'
                    {
                    string_literal37=(Token)match(input,95,FOLLOW_95_in_portalDecl582);  
                    stream_95.add(string_literal37);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:16: 'portal'
                    {
                    string_literal38=(Token)match(input,138,FOLLOW_138_in_portalDecl586);  
                    stream_138.add(string_literal38);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_portalDecl589);
            varAssignment39=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment39.getTree());

            char_literal40=(Token)match(input,164,FOLLOW_164_in_portalDecl591);  
            stream_164.add(char_literal40);


            pushFollow(FOLLOW_properties_in_portalDecl593);
            properties41=properties();

            state._fsp--;

            stream_properties.add(properties41.getTree());

            char_literal42=(Token)match(input,165,FOLLOW_165_in_portalDecl595);  
            stream_165.add(char_literal42);


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
            // 121:59: -> ^( PORTAL varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:62: ^( PORTAL varAssignment properties )
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


    public static class textureBlockDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "textureBlockDecl"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:1: textureBlockDecl : ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) ;
    public final AtrophyScriptParser.textureBlockDecl_return textureBlockDecl() throws RecognitionException {
        AtrophyScriptParser.textureBlockDecl_return retval = new AtrophyScriptParser.textureBlockDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal43=null;
        Token string_literal44=null;
        Token string_literal45=null;
        Token char_literal46=null;
        Token char_literal48=null;
        AtrophyScriptParser.properties_return properties47 =null;


        CommonTree string_literal43_tree=null;
        CommonTree string_literal44_tree=null;
        CommonTree string_literal45_tree=null;
        CommonTree char_literal46_tree=null;
        CommonTree char_literal48_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:17: ( ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt10=1;
                }
                break;
            case 155:
                {
                alt10=2;
                }
                break;
            case 154:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:5: 'TEXTUREBLOCK'
                    {
                    string_literal43=(Token)match(input,98,FOLLOW_98_in_textureBlockDecl621);  
                    stream_98.add(string_literal43);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:22: 'textureblock'
                    {
                    string_literal44=(Token)match(input,155,FOLLOW_155_in_textureBlockDecl625);  
                    stream_155.add(string_literal44);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:39: 'textureBlock'
                    {
                    string_literal45=(Token)match(input,154,FOLLOW_154_in_textureBlockDecl629);  
                    stream_154.add(string_literal45);


                    }
                    break;

            }


            char_literal46=(Token)match(input,164,FOLLOW_164_in_textureBlockDecl632);  
            stream_164.add(char_literal46);


            pushFollow(FOLLOW_properties_in_textureBlockDecl634);
            properties47=properties();

            state._fsp--;

            stream_properties.add(properties47.getTree());

            char_literal48=(Token)match(input,165,FOLLOW_165_in_textureBlockDecl636);  
            stream_165.add(char_literal48);


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
            // 125:74: -> ^( TEXTUREBLOCK properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:77: ^( TEXTUREBLOCK properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:1: triggerDecl : ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) ;
    public final AtrophyScriptParser.triggerDecl_return triggerDecl() throws RecognitionException {
        AtrophyScriptParser.triggerDecl_return retval = new AtrophyScriptParser.triggerDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal49=null;
        Token string_literal50=null;
        Token char_literal52=null;
        Token char_literal54=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment51 =null;

        AtrophyScriptParser.properties_return properties53 =null;


        CommonTree string_literal49_tree=null;
        CommonTree string_literal50_tree=null;
        CommonTree char_literal52_tree=null;
        CommonTree char_literal54_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:12: ( ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:4: ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:4: ( 'TRIGGER' | 'trigger' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==99) ) {
                alt11=1;
            }
            else if ( (LA11_0==156) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:5: 'TRIGGER'
                    {
                    string_literal49=(Token)match(input,99,FOLLOW_99_in_triggerDecl660);  
                    stream_99.add(string_literal49);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:17: 'trigger'
                    {
                    string_literal50=(Token)match(input,156,FOLLOW_156_in_triggerDecl664);  
                    stream_156.add(string_literal50);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_triggerDecl667);
            requiredAssignment51=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment51.getTree());

            char_literal52=(Token)match(input,164,FOLLOW_164_in_triggerDecl669);  
            stream_164.add(char_literal52);


            pushFollow(FOLLOW_properties_in_triggerDecl671);
            properties53=properties();

            state._fsp--;

            stream_properties.add(properties53.getTree());

            char_literal54=(Token)match(input,165,FOLLOW_165_in_triggerDecl673);  
            stream_165.add(char_literal54);


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
            // 129:66: -> ^( TRIGGER requiredAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:69: ^( TRIGGER requiredAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:1: commandDecl : ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) ;
    public final AtrophyScriptParser.commandDecl_return commandDecl() throws RecognitionException {
        AtrophyScriptParser.commandDecl_return retval = new AtrophyScriptParser.commandDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal55=null;
        Token string_literal56=null;
        Token char_literal58=null;
        Token char_literal60=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment57 =null;

        AtrophyScriptParser.triggerEffectList_return triggerEffectList59 =null;


        CommonTree string_literal55_tree=null;
        CommonTree string_literal56_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree char_literal60_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:12: ( ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:4: ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:4: ( 'COMMAND' | 'command' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==90) ) {
                alt12=1;
            }
            else if ( (LA12_0==106) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:5: 'COMMAND'
                    {
                    string_literal55=(Token)match(input,90,FOLLOW_90_in_commandDecl699);  
                    stream_90.add(string_literal55);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:17: 'command'
                    {
                    string_literal56=(Token)match(input,106,FOLLOW_106_in_commandDecl703);  
                    stream_106.add(string_literal56);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_commandDecl706);
            requiredAssignment57=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment57.getTree());

            char_literal58=(Token)match(input,164,FOLLOW_164_in_commandDecl708);  
            stream_164.add(char_literal58);


            pushFollow(FOLLOW_triggerEffectList_in_commandDecl710);
            triggerEffectList59=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList59.getTree());

            char_literal60=(Token)match(input,165,FOLLOW_165_in_commandDecl712);  
            stream_165.add(char_literal60);


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
            // 133:73: -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:76: ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COMMAND, "COMMAND")
                , root_1);

                adaptor.addChild(root_1, stream_requiredAssignment.nextTree());

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:105: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:1: talkDecl : ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) ;
    public final AtrophyScriptParser.talkDecl_return talkDecl() throws RecognitionException {
        AtrophyScriptParser.talkDecl_return retval = new AtrophyScriptParser.talkDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal61=null;
        Token string_literal62=null;
        Token char_literal63=null;
        Token char_literal65=null;
        AtrophyScriptParser.properties_return properties64 =null;


        CommonTree string_literal61_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree char_literal65_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:9: ( ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:4: ( 'TALK' | 'talk' ) '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:4: ( 'TALK' | 'talk' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==97) ) {
                alt13=1;
            }
            else if ( (LA13_0==149) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:5: 'TALK'
                    {
                    string_literal61=(Token)match(input,97,FOLLOW_97_in_talkDecl742);  
                    stream_97.add(string_literal61);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:14: 'talk'
                    {
                    string_literal62=(Token)match(input,149,FOLLOW_149_in_talkDecl746);  
                    stream_149.add(string_literal62);


                    }
                    break;

            }


            char_literal63=(Token)match(input,164,FOLLOW_164_in_talkDecl749);  
            stream_164.add(char_literal63);


            pushFollow(FOLLOW_properties_in_talkDecl751);
            properties64=properties();

            state._fsp--;

            stream_properties.add(properties64.getTree());

            char_literal65=(Token)match(input,165,FOLLOW_165_in_talkDecl753);  
            stream_165.add(char_literal65);


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
            // 137:41: -> ^( TALK properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:44: ^( TALK properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:1: properties : ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | lineProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )* ;
    public final AtrophyScriptParser.properties_return properties() throws RecognitionException {
        AtrophyScriptParser.properties_return retval = new AtrophyScriptParser.properties_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.xListProperty_return xListProperty66 =null;

        AtrophyScriptParser.yListProperty_return yListProperty67 =null;

        AtrophyScriptParser.factionTerritoryProperty_return factionTerritoryProperty68 =null;

        AtrophyScriptParser.factionZoneProperty_return factionZoneProperty69 =null;

        AtrophyScriptParser.saferoomProperty_return saferoomProperty70 =null;

        AtrophyScriptParser.stageProperty_return stageProperty71 =null;

        AtrophyScriptParser.stageDeclProperty_return stageDeclProperty72 =null;

        AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty73 =null;

        AtrophyScriptParser.aiInitProperty_return aiInitProperty74 =null;

        AtrophyScriptParser.openingLineProperty_return openingLineProperty75 =null;

        AtrophyScriptParser.lineProperty_return lineProperty76 =null;

        AtrophyScriptParser.triggerCondProperty_return triggerCondProperty77 =null;

        AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty78 =null;

        AtrophyScriptParser.coverDecl_return coverDecl79 =null;

        AtrophyScriptParser.stashDecl_return stashDecl80 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:11: ( ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | lineProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | lineProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | lineProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )*
            loop14:
            do {
                int alt14=16;
                switch ( input.LA(1) ) {
                case 161:
                    {
                    alt14=1;
                    }
                    break;
                case 162:
                    {
                    alt14=2;
                    }
                    break;
                case 153:
                    {
                    alt14=3;
                    }
                    break;
                case 163:
                    {
                    alt14=4;
                    }
                    break;
                case 143:
                    {
                    alt14=5;
                    }
                    break;
                case 142:
                case 146:
                    {
                    alt14=6;
                    }
                    break;
                case 147:
                    {
                    alt14=7;
                    }
                    break;
                case 136:
                case 137:
                    {
                    alt14=8;
                    }
                    break;
                case 100:
                case 102:
                    {
                    alt14=9;
                    }
                    break;
                case 133:
                case 134:
                case 135:
                    {
                    alt14=10;
                    }
                    break;
                case 124:
                case 125:
                    {
                    alt14=11;
                    }
                    break;
                case 150:
                case 157:
                    {
                    alt14=12;
                    }
                    break;
                case 151:
                case 158:
                    {
                    alt14=13;
                    }
                    break;
                case 91:
                case 109:
                    {
                    alt14=14;
                    }
                    break;
                case 96:
                case 148:
                    {
                    alt14=15;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:5: xListProperty
            	    {
            	    pushFollow(FOLLOW_xListProperty_in_properties777);
            	    xListProperty66=xListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xListProperty66.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:6: yListProperty
            	    {
            	    pushFollow(FOLLOW_yListProperty_in_properties784);
            	    yListProperty67=yListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, yListProperty67.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:6: factionTerritoryProperty
            	    {
            	    pushFollow(FOLLOW_factionTerritoryProperty_in_properties791);
            	    factionTerritoryProperty68=factionTerritoryProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionTerritoryProperty68.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:6: factionZoneProperty
            	    {
            	    pushFollow(FOLLOW_factionZoneProperty_in_properties798);
            	    factionZoneProperty69=factionZoneProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionZoneProperty69.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:6: saferoomProperty
            	    {
            	    pushFollow(FOLLOW_saferoomProperty_in_properties805);
            	    saferoomProperty70=saferoomProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, saferoomProperty70.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:146:6: stageProperty
            	    {
            	    pushFollow(FOLLOW_stageProperty_in_properties812);
            	    stageProperty71=stageProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageProperty71.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:6: stageDeclProperty
            	    {
            	    pushFollow(FOLLOW_stageDeclProperty_in_properties819);
            	    stageDeclProperty72=stageDeclProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageDeclProperty72.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:148:6: talkMapParentProperty
            	    {
            	    pushFollow(FOLLOW_talkMapParentProperty_in_properties826);
            	    talkMapParentProperty73=talkMapParentProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, talkMapParentProperty73.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:149:6: aiInitProperty
            	    {
            	    pushFollow(FOLLOW_aiInitProperty_in_properties833);
            	    aiInitProperty74=aiInitProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiInitProperty74.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:6: openingLineProperty
            	    {
            	    pushFollow(FOLLOW_openingLineProperty_in_properties840);
            	    openingLineProperty75=openingLineProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, openingLineProperty75.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:6: lineProperty
            	    {
            	    pushFollow(FOLLOW_lineProperty_in_properties847);
            	    lineProperty76=lineProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lineProperty76.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:152:6: triggerCondProperty
            	    {
            	    pushFollow(FOLLOW_triggerCondProperty_in_properties854);
            	    triggerCondProperty77=triggerCondProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerCondProperty77.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:153:6: triggerEffectProperty
            	    {
            	    pushFollow(FOLLOW_triggerEffectProperty_in_properties861);
            	    triggerEffectProperty78=triggerEffectProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffectProperty78.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:6: coverDecl
            	    {
            	    pushFollow(FOLLOW_coverDecl_in_properties868);
            	    coverDecl79=coverDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, coverDecl79.getTree());

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:6: stashDecl
            	    {
            	    pushFollow(FOLLOW_stashDecl_in_properties875);
            	    stashDecl80=stashDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stashDecl80.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:1: xListProperty : 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) ;
    public final AtrophyScriptParser.xListProperty_return xListProperty() throws RecognitionException {
        AtrophyScriptParser.xListProperty_return retval = new AtrophyScriptParser.xListProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal81=null;
        Token INT82=null;
        Token char_literal83=null;
        Token INT84=null;

        CommonTree string_literal81_tree=null;
        CommonTree INT82_tree=null;
        CommonTree char_literal83_tree=null;
        CommonTree INT84_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:14: ( 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:4: 'x:' INT ( ',' INT )*
            {
            string_literal81=(Token)match(input,161,FOLLOW_161_in_xListProperty892);  
            stream_161.add(string_literal81);


            INT82=(Token)match(input,INT,FOLLOW_INT_in_xListProperty894);  
            stream_INT.add(INT82);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:13: ( ',' INT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==81) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:14: ',' INT
            	    {
            	    char_literal83=(Token)match(input,81,FOLLOW_81_in_xListProperty897);  
            	    stream_81.add(char_literal83);


            	    INT84=(Token)match(input,INT,FOLLOW_INT_in_xListProperty898);  
            	    stream_INT.add(INT84);


            	    }
            	    break;

            	default :
            	    break loop15;
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
            // 159:23: -> ^( XLIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:26: ^( XLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(XLIST, "XLIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:34: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:1: yListProperty : 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) ;
    public final AtrophyScriptParser.yListProperty_return yListProperty() throws RecognitionException {
        AtrophyScriptParser.yListProperty_return retval = new AtrophyScriptParser.yListProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal85=null;
        Token INT86=null;
        Token char_literal87=null;
        Token INT88=null;

        CommonTree string_literal85_tree=null;
        CommonTree INT86_tree=null;
        CommonTree char_literal87_tree=null;
        CommonTree INT88_tree=null;
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:14: ( 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:4: 'y:' INT ( ',' INT )*
            {
            string_literal85=(Token)match(input,162,FOLLOW_162_in_yListProperty922);  
            stream_162.add(string_literal85);


            INT86=(Token)match(input,INT,FOLLOW_INT_in_yListProperty924);  
            stream_INT.add(INT86);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:13: ( ',' INT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==81) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:14: ',' INT
            	    {
            	    char_literal87=(Token)match(input,81,FOLLOW_81_in_yListProperty927);  
            	    stream_81.add(char_literal87);


            	    INT88=(Token)match(input,INT,FOLLOW_INT_in_yListProperty928);  
            	    stream_INT.add(INT88);


            	    }
            	    break;

            	default :
            	    break loop16;
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
            // 163:23: -> ^( YLIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:26: ^( YLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(YLIST, "YLIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:34: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:1: factionTerritoryProperty : 'territory:' stringLiteral INT -> ^( TERRITORY stringLiteral INT ) ;
    public final AtrophyScriptParser.factionTerritoryProperty_return factionTerritoryProperty() throws RecognitionException {
        AtrophyScriptParser.factionTerritoryProperty_return retval = new AtrophyScriptParser.factionTerritoryProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal89=null;
        Token INT91=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral90 =null;


        CommonTree string_literal89_tree=null;
        CommonTree INT91_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:25: ( 'territory:' stringLiteral INT -> ^( TERRITORY stringLiteral INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:4: 'territory:' stringLiteral INT
            {
            string_literal89=(Token)match(input,153,FOLLOW_153_in_factionTerritoryProperty954);  
            stream_153.add(string_literal89);


            pushFollow(FOLLOW_stringLiteral_in_factionTerritoryProperty956);
            stringLiteral90=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral90.getTree());

            INT91=(Token)match(input,INT,FOLLOW_INT_in_factionTerritoryProperty958);  
            stream_INT.add(INT91);


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
            // 167:35: -> ^( TERRITORY stringLiteral INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:38: ^( TERRITORY stringLiteral INT )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:1: factionZoneProperty : 'zone:' stringList -> ^( ZONE stringList ) ;
    public final AtrophyScriptParser.factionZoneProperty_return factionZoneProperty() throws RecognitionException {
        AtrophyScriptParser.factionZoneProperty_return retval = new AtrophyScriptParser.factionZoneProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal92=null;
        AtrophyScriptParser.stringList_return stringList93 =null;


        CommonTree string_literal92_tree=null;
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:20: ( 'zone:' stringList -> ^( ZONE stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:4: 'zone:' stringList
            {
            string_literal92=(Token)match(input,163,FOLLOW_163_in_factionZoneProperty983);  
            stream_163.add(string_literal92);


            pushFollow(FOLLOW_stringList_in_factionZoneProperty985);
            stringList93=stringList();

            state._fsp--;

            stream_stringList.add(stringList93.getTree());

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
            // 171:23: -> ^( ZONE stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:26: ^( ZONE stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:1: saferoomProperty : 'saferoom' -> ^( SAFEROOM ) ;
    public final AtrophyScriptParser.saferoomProperty_return saferoomProperty() throws RecognitionException {
        AtrophyScriptParser.saferoomProperty_return retval = new AtrophyScriptParser.saferoomProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal94=null;

        CommonTree string_literal94_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:17: ( 'saferoom' -> ^( SAFEROOM ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:4: 'saferoom'
            {
            string_literal94=(Token)match(input,143,FOLLOW_143_in_saferoomProperty1008);  
            stream_143.add(string_literal94);


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
            // 175:15: -> ^( SAFEROOM )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:18: ^( SAFEROOM )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:1: stageDeclProperty : 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) ;
    public final AtrophyScriptParser.stageDeclProperty_return stageDeclProperty() throws RecognitionException {
        AtrophyScriptParser.stageDeclProperty_return retval = new AtrophyScriptParser.stageDeclProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal95=null;
        Token INT96=null;
        Token char_literal97=null;
        Token INT98=null;

        CommonTree string_literal95_tree=null;
        CommonTree INT96_tree=null;
        CommonTree char_literal97_tree=null;
        CommonTree INT98_tree=null;
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:18: ( 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:4: 'stages:' INT ( ',' INT )*
            {
            string_literal95=(Token)match(input,147,FOLLOW_147_in_stageDeclProperty1029);  
            stream_147.add(string_literal95);


            INT96=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1031);  
            stream_INT.add(INT96);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:18: ( ',' INT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==81) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:19: ',' INT
            	    {
            	    char_literal97=(Token)match(input,81,FOLLOW_81_in_stageDeclProperty1034);  
            	    stream_81.add(char_literal97);


            	    INT98=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1036);  
            	    stream_INT.add(INT98);


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
            // 179:29: -> ^( STAGELIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:32: ^( STAGELIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STAGELIST, "STAGELIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:44: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:1: talkMapParentProperty : ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) ;
    public final AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty() throws RecognitionException {
        AtrophyScriptParser.talkMapParentProperty_return retval = new AtrophyScriptParser.talkMapParentProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal99=null;
        Token string_literal100=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral101 =null;


        CommonTree string_literal99_tree=null;
        CommonTree string_literal100_tree=null;
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:22: ( ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:4: ( 'parent:' | 'p:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:4: ( 'parent:' | 'p:' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==137) ) {
                alt18=1;
            }
            else if ( (LA18_0==136) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:5: 'parent:'
                    {
                    string_literal99=(Token)match(input,137,FOLLOW_137_in_talkMapParentProperty1063);  
                    stream_137.add(string_literal99);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:17: 'p:'
                    {
                    string_literal100=(Token)match(input,136,FOLLOW_136_in_talkMapParentProperty1067);  
                    stream_136.add(string_literal100);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_talkMapParentProperty1070);
            stringLiteral101=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral101.getTree());

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
            // 183:37: -> ^( TALKPARENT stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:40: ^( TALKPARENT stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:1: stageProperty : ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) ;
    public final AtrophyScriptParser.stageProperty_return stageProperty() throws RecognitionException {
        AtrophyScriptParser.stageProperty_return retval = new AtrophyScriptParser.stageProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal102=null;
        Token string_literal103=null;
        Token INT104=null;

        CommonTree string_literal102_tree=null;
        CommonTree string_literal103_tree=null;
        CommonTree INT104_tree=null;
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:14: ( ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:4: ( 'stage:' | 's:' ) INT
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:4: ( 'stage:' | 's:' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==146) ) {
                alt19=1;
            }
            else if ( (LA19_0==142) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:5: 'stage:'
                    {
                    string_literal102=(Token)match(input,146,FOLLOW_146_in_stageProperty1094);  
                    stream_146.add(string_literal102);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:16: 's:'
                    {
                    string_literal103=(Token)match(input,142,FOLLOW_142_in_stageProperty1098);  
                    stream_142.add(string_literal103);


                    }
                    break;

            }


            INT104=(Token)match(input,INT,FOLLOW_INT_in_stageProperty1101);  
            stream_INT.add(INT104);


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
            // 187:26: -> ^( TALKSTAGE INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:29: ^( TALKSTAGE INT )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:190:1: aiInitProperty : ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) ;
    public final AtrophyScriptParser.aiInitProperty_return aiInitProperty() throws RecognitionException {
        AtrophyScriptParser.aiInitProperty_return retval = new AtrophyScriptParser.aiInitProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal105=null;
        Token string_literal106=null;
        Token BOOL107=null;

        CommonTree string_literal105_tree=null;
        CommonTree string_literal106_tree=null;
        CommonTree BOOL107_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:190:15: ( ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:4: ( 'aiInit:' | 'a:' ) BOOL
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:4: ( 'aiInit:' | 'a:' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==102) ) {
                alt20=1;
            }
            else if ( (LA20_0==100) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:5: 'aiInit:'
                    {
                    string_literal105=(Token)match(input,102,FOLLOW_102_in_aiInitProperty1125);  
                    stream_102.add(string_literal105);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:17: 'a:'
                    {
                    string_literal106=(Token)match(input,100,FOLLOW_100_in_aiInitProperty1129);  
                    stream_100.add(string_literal106);


                    }
                    break;

            }


            BOOL107=(Token)match(input,BOOL,FOLLOW_BOOL_in_aiInitProperty1132);  
            stream_BOOL.add(BOOL107);


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
            // 191:28: -> ^( AIINIT BOOL )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:31: ^( AIINIT BOOL )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:194:1: openingLineProperty : ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) ;
    public final AtrophyScriptParser.openingLineProperty_return openingLineProperty() throws RecognitionException {
        AtrophyScriptParser.openingLineProperty_return retval = new AtrophyScriptParser.openingLineProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal108=null;
        Token string_literal109=null;
        Token string_literal110=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral111 =null;


        CommonTree string_literal108_tree=null;
        CommonTree string_literal109_tree=null;
        CommonTree string_literal110_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:194:20: ( ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:4: ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:4: ( 'o:' | 'opening:' | 'openingLine:' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 133:
                {
                alt21=1;
                }
                break;
            case 134:
                {
                alt21=2;
                }
                break;
            case 135:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:5: 'o:'
                    {
                    string_literal108=(Token)match(input,133,FOLLOW_133_in_openingLineProperty1156);  
                    stream_133.add(string_literal108);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:12: 'opening:'
                    {
                    string_literal109=(Token)match(input,134,FOLLOW_134_in_openingLineProperty1160);  
                    stream_134.add(string_literal109);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:25: 'openingLine:'
                    {
                    string_literal110=(Token)match(input,135,FOLLOW_135_in_openingLineProperty1164);  
                    stream_135.add(string_literal110);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_openingLineProperty1167);
            stringLiteral111=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral111.getTree());

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
            // 195:55: -> ^( OPENINGLINE stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:58: ^( OPENINGLINE stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:198:1: lineProperty : ( 'l:' | 'line:' ) stringLiteral -> ^( LINE stringLiteral ) ;
    public final AtrophyScriptParser.lineProperty_return lineProperty() throws RecognitionException {
        AtrophyScriptParser.lineProperty_return retval = new AtrophyScriptParser.lineProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal112=null;
        Token string_literal113=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral114 =null;


        CommonTree string_literal112_tree=null;
        CommonTree string_literal113_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:198:13: ( ( 'l:' | 'line:' ) stringLiteral -> ^( LINE stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:4: ( 'l:' | 'line:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:4: ( 'l:' | 'line:' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==124) ) {
                alt22=1;
            }
            else if ( (LA22_0==125) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:5: 'l:'
                    {
                    string_literal112=(Token)match(input,124,FOLLOW_124_in_lineProperty1189);  
                    stream_124.add(string_literal112);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:12: 'line:'
                    {
                    string_literal113=(Token)match(input,125,FOLLOW_125_in_lineProperty1193);  
                    stream_125.add(string_literal113);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_lineProperty1196);
            stringLiteral114=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral114.getTree());

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
            // 199:35: -> ^( LINE stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:38: ^( LINE stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:1: term : ( '(' condExpression ')' | BOOL | booleanQuery );
    public final AtrophyScriptParser.term_return term() throws RecognitionException {
        AtrophyScriptParser.term_return retval = new AtrophyScriptParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal115=null;
        Token char_literal117=null;
        Token BOOL118=null;
        AtrophyScriptParser.condExpression_return condExpression116 =null;

        AtrophyScriptParser.booleanQuery_return booleanQuery119 =null;


        CommonTree char_literal115_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree BOOL118_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:5: ( '(' condExpression ')' | BOOL | booleanQuery )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt23=1;
                }
                break;
            case BOOL:
                {
                alt23=2;
                }
                break;
            case 75:
            case 79:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 91:
            case 96:
            case 100:
            case 102:
            case 109:
            case 124:
            case 125:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 142:
            case 143:
            case 146:
            case 147:
            case 148:
            case 150:
            case 151:
            case 153:
            case 157:
            case 158:
            case 161:
            case 162:
            case 163:
            case 165:
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:203:4: '(' condExpression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal115=(Token)match(input,78,FOLLOW_78_in_term1219); 
                    char_literal115_tree = 
                    (CommonTree)adaptor.create(char_literal115)
                    ;
                    adaptor.addChild(root_0, char_literal115_tree);


                    pushFollow(FOLLOW_condExpression_in_term1221);
                    condExpression116=condExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, condExpression116.getTree());

                    char_literal117=(Token)match(input,79,FOLLOW_79_in_term1223); 
                    char_literal117_tree = 
                    (CommonTree)adaptor.create(char_literal117)
                    ;
                    adaptor.addChild(root_0, char_literal117_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:204:8: BOOL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BOOL118=(Token)match(input,BOOL,FOLLOW_BOOL_in_term1232); 
                    BOOL118_tree = 
                    (CommonTree)adaptor.create(BOOL118)
                    ;
                    adaptor.addChild(root_0, BOOL118_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:8: booleanQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_booleanQuery_in_term1241);
                    booleanQuery119=booleanQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanQuery119.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:208:1: booleanQuery :;
    public final AtrophyScriptParser.booleanQuery_return booleanQuery() throws RecognitionException {
        AtrophyScriptParser.booleanQuery_return retval = new AtrophyScriptParser.booleanQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:208:13: ()
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:3: 
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:211:1: unary : ( '+' !| negation ^)* term ;
    public final AtrophyScriptParser.unary_return unary() throws RecognitionException {
        AtrophyScriptParser.unary_return retval = new AtrophyScriptParser.unary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal120=null;
        AtrophyScriptParser.negation_return negation121 =null;

        AtrophyScriptParser.term_return term122 =null;


        CommonTree char_literal120_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:211:6: ( ( '+' !| negation ^)* term )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:212:4: ( '+' !| negation ^)* term
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:212:4: ( '+' !| negation ^)*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==80) ) {
                    alt24=1;
                }
                else if ( (LA24_0==82) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:212:5: '+' !
            	    {
            	    char_literal120=(Token)match(input,80,FOLLOW_80_in_unary1278); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:212:12: negation ^
            	    {
            	    pushFollow(FOLLOW_negation_in_unary1283);
            	    negation121=negation();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(negation121.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary1288);
            term122=term();

            state._fsp--;

            adaptor.addChild(root_0, term122.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:215:1: negation : '-' -> NEGATION ;
    public final AtrophyScriptParser.negation_return negation() throws RecognitionException {
        AtrophyScriptParser.negation_return retval = new AtrophyScriptParser.negation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal123=null;

        CommonTree char_literal123_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:215:9: ( '-' -> NEGATION )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:216:5: '-'
            {
            char_literal123=(Token)match(input,82,FOLLOW_82_in_negation1310);  
            stream_82.add(char_literal123);


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
            // 216:9: -> NEGATION
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:219:1: condExpression : unary ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary )* ;
    public final AtrophyScriptParser.condExpression_return condExpression() throws RecognitionException {
        AtrophyScriptParser.condExpression_return retval = new AtrophyScriptParser.condExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set125=null;
        AtrophyScriptParser.unary_return unary124 =null;

        AtrophyScriptParser.unary_return unary126 =null;


        CommonTree set125_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:219:15: ( unary ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:220:5: unary ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_condExpression1336);
            unary124=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary124.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:220:11: ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==75||(LA25_0 >= 84 && LA25_0 <= 88)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:220:12: ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) unary
            	    {
            	    set125=(Token)input.LT(1);

            	    if ( input.LA(1)==75||(input.LA(1) >= 84 && input.LA(1) <= 88) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set125)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_condExpression1362);
            	    unary126=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary126.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:223:1: triggerCondProperty : ( 'tc:' | 'triggerCond:' ) condExpression -> ^( TRIGGERCOND condExpression ) ;
    public final AtrophyScriptParser.triggerCondProperty_return triggerCondProperty() throws RecognitionException {
        AtrophyScriptParser.triggerCondProperty_return retval = new AtrophyScriptParser.triggerCondProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal127=null;
        Token string_literal128=null;
        AtrophyScriptParser.condExpression_return condExpression129 =null;


        CommonTree string_literal127_tree=null;
        CommonTree string_literal128_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleSubtreeStream stream_condExpression=new RewriteRuleSubtreeStream(adaptor,"rule condExpression");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:223:20: ( ( 'tc:' | 'triggerCond:' ) condExpression -> ^( TRIGGERCOND condExpression ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:224:4: ( 'tc:' | 'triggerCond:' ) condExpression
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:224:4: ( 'tc:' | 'triggerCond:' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==150) ) {
                alt26=1;
            }
            else if ( (LA26_0==157) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:224:5: 'tc:'
                    {
                    string_literal127=(Token)match(input,150,FOLLOW_150_in_triggerCondProperty1380);  
                    stream_150.add(string_literal127);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:224:13: 'triggerCond:'
                    {
                    string_literal128=(Token)match(input,157,FOLLOW_157_in_triggerCondProperty1384);  
                    stream_157.add(string_literal128);


                    }
                    break;

            }


            pushFollow(FOLLOW_condExpression_in_triggerCondProperty1387);
            condExpression129=condExpression();

            state._fsp--;

            stream_condExpression.add(condExpression129.getTree());

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
            // 224:44: -> ^( TRIGGERCOND condExpression )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:224:47: ^( TRIGGERCOND condExpression )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:227:1: triggerEffectProperty : ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) ;
    public final AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty() throws RecognitionException {
        AtrophyScriptParser.triggerEffectProperty_return retval = new AtrophyScriptParser.triggerEffectProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal130=null;
        Token string_literal131=null;
        Token char_literal132=null;
        Token char_literal134=null;
        AtrophyScriptParser.triggerEffectList_return triggerEffectList133 =null;


        CommonTree string_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree char_literal134_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:227:22: ( ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:228:4: ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:228:4: ( 'te' | 'triggerEffect' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==151) ) {
                alt27=1;
            }
            else if ( (LA27_0==158) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:228:5: 'te'
                    {
                    string_literal130=(Token)match(input,151,FOLLOW_151_in_triggerEffectProperty1409);  
                    stream_151.add(string_literal130);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:228:12: 'triggerEffect'
                    {
                    string_literal131=(Token)match(input,158,FOLLOW_158_in_triggerEffectProperty1413);  
                    stream_158.add(string_literal131);


                    }
                    break;

            }


            char_literal132=(Token)match(input,164,FOLLOW_164_in_triggerEffectProperty1416);  
            stream_164.add(char_literal132);


            pushFollow(FOLLOW_triggerEffectList_in_triggerEffectProperty1418);
            triggerEffectList133=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList133.getTree());

            char_literal134=(Token)match(input,165,FOLLOW_165_in_triggerEffectProperty1420);  
            stream_165.add(char_literal134);


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
            // 228:55: -> ^( TRIGGEREFFECT triggerEffectList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:228:58: ^( TRIGGEREFFECT triggerEffectList )
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


    public static class coverDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "coverDecl"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:231:1: coverDecl : ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) ;
    public final AtrophyScriptParser.coverDecl_return coverDecl() throws RecognitionException {
        AtrophyScriptParser.coverDecl_return retval = new AtrophyScriptParser.coverDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal135=null;
        Token string_literal136=null;
        Token char_literal138=null;
        Token char_literal140=null;
        AtrophyScriptParser.varAssignment_return varAssignment137 =null;

        AtrophyScriptParser.properties_return properties139 =null;


        CommonTree string_literal135_tree=null;
        CommonTree string_literal136_tree=null;
        CommonTree char_literal138_tree=null;
        CommonTree char_literal140_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:231:10: ( ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:232:4: ( 'COVER' | 'cover' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:232:4: ( 'COVER' | 'cover' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==91) ) {
                alt28=1;
            }
            else if ( (LA28_0==109) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:232:5: 'COVER'
                    {
                    string_literal135=(Token)match(input,91,FOLLOW_91_in_coverDecl1444);  
                    stream_91.add(string_literal135);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:232:15: 'cover'
                    {
                    string_literal136=(Token)match(input,109,FOLLOW_109_in_coverDecl1448);  
                    stream_109.add(string_literal136);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_coverDecl1451);
            varAssignment137=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment137.getTree());

            char_literal138=(Token)match(input,164,FOLLOW_164_in_coverDecl1453);  
            stream_164.add(char_literal138);


            pushFollow(FOLLOW_properties_in_coverDecl1455);
            properties139=properties();

            state._fsp--;

            stream_properties.add(properties139.getTree());

            char_literal140=(Token)match(input,165,FOLLOW_165_in_coverDecl1457);  
            stream_165.add(char_literal140);


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
            // 232:57: -> ^( COVER varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:232:60: ^( COVER varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:235:1: stashDecl : ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) ;
    public final AtrophyScriptParser.stashDecl_return stashDecl() throws RecognitionException {
        AtrophyScriptParser.stashDecl_return retval = new AtrophyScriptParser.stashDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal141=null;
        Token string_literal142=null;
        Token char_literal144=null;
        Token char_literal146=null;
        AtrophyScriptParser.varAssignment_return varAssignment143 =null;

        AtrophyScriptParser.properties_return properties145 =null;


        CommonTree string_literal141_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree char_literal144_tree=null;
        CommonTree char_literal146_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:235:10: ( ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:236:4: ( 'STASH' | 'stash' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:236:4: ( 'STASH' | 'stash' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==96) ) {
                alt29=1;
            }
            else if ( (LA29_0==148) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:236:5: 'STASH'
                    {
                    string_literal141=(Token)match(input,96,FOLLOW_96_in_stashDecl1483);  
                    stream_96.add(string_literal141);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:236:15: 'stash'
                    {
                    string_literal142=(Token)match(input,148,FOLLOW_148_in_stashDecl1487);  
                    stream_148.add(string_literal142);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_stashDecl1490);
            varAssignment143=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment143.getTree());

            char_literal144=(Token)match(input,164,FOLLOW_164_in_stashDecl1492);  
            stream_164.add(char_literal144);


            pushFollow(FOLLOW_properties_in_stashDecl1494);
            properties145=properties();

            state._fsp--;

            stream_properties.add(properties145.getTree());

            char_literal146=(Token)match(input,165,FOLLOW_165_in_stashDecl1496);  
            stream_165.add(char_literal146);


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
            // 236:57: -> ^( STASH varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:236:60: ^( STASH varAssignment properties )
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


    public static class triggerEffectList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerEffectList"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:239:1: triggerEffectList : triggerEffect ( ',' ! triggerEffect )* ;
    public final AtrophyScriptParser.triggerEffectList_return triggerEffectList() throws RecognitionException {
        AtrophyScriptParser.triggerEffectList_return retval = new AtrophyScriptParser.triggerEffectList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal148=null;
        AtrophyScriptParser.triggerEffect_return triggerEffect147 =null;

        AtrophyScriptParser.triggerEffect_return triggerEffect149 =null;


        CommonTree char_literal148_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:239:18: ( triggerEffect ( ',' ! triggerEffect )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:240:4: triggerEffect ( ',' ! triggerEffect )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1519);
            triggerEffect147=triggerEffect();

            state._fsp--;

            adaptor.addChild(root_0, triggerEffect147.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:240:18: ( ',' ! triggerEffect )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==81) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:240:19: ',' ! triggerEffect
            	    {
            	    char_literal148=(Token)match(input,81,FOLLOW_81_in_triggerEffectList1522); 

            	    pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1525);
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:243:1: triggerEffect : ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | commandCallList );
    public final AtrophyScriptParser.triggerEffect_return triggerEffect() throws RecognitionException {
        AtrophyScriptParser.triggerEffect_return retval = new AtrophyScriptParser.triggerEffect_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.updateTalkTree_return updateTalkTree150 =null;

        AtrophyScriptParser.spawnTeam_return spawnTeam151 =null;

        AtrophyScriptParser.spawnCharacter_return spawnCharacter152 =null;

        AtrophyScriptParser.removeUnit_return removeUnit153 =null;

        AtrophyScriptParser.killUnit_return killUnit154 =null;

        AtrophyScriptParser.teleportUnit_return teleportUnit155 =null;

        AtrophyScriptParser.converseUnit_return converseUnit156 =null;

        AtrophyScriptParser.createSaferoom_return createSaferoom157 =null;

        AtrophyScriptParser.removeSaferoom_return removeSaferoom158 =null;

        AtrophyScriptParser.loadMap_return loadMap159 =null;

        AtrophyScriptParser.lockDoor_return lockDoor160 =null;

        AtrophyScriptParser.unlockDoor_return unlockDoor161 =null;

        AtrophyScriptParser.addTag_return addTag162 =null;

        AtrophyScriptParser.removeTag_return removeTag163 =null;

        AtrophyScriptParser.directorBias_return directorBias164 =null;

        AtrophyScriptParser.changeAiNode_return changeAiNode165 =null;

        AtrophyScriptParser.commandCallList_return commandCallList166 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:243:14: ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | commandCallList )
            int alt31=17;
            switch ( input.LA(1) ) {
            case UPDATE_TREE_PREFIX:
            case 160:
                {
                alt31=1;
                }
                break;
            case 145:
                {
                alt31=2;
                }
                break;
            case 144:
                {
                alt31=3;
                }
                break;
            case 141:
                {
                alt31=4;
                }
                break;
            case 123:
                {
                alt31=5;
                }
                break;
            case 152:
                {
                alt31=6;
                }
                break;
            case 108:
                {
                alt31=7;
                }
                break;
            case 143:
                {
                alt31=8;
                }
                break;
            case 139:
                {
                alt31=9;
                }
                break;
            case 126:
                {
                alt31=10;
                }
                break;
            case 127:
                {
                alt31=11;
                }
                break;
            case 159:
                {
                alt31=12;
                }
                break;
            case ADD_TAG_PREFIX:
            case 101:
                {
                alt31=13;
                }
                break;
            case REMOVE_TAG_PREFIX:
            case 140:
                {
                alt31=14;
                }
                break;
            case 111:
                {
                alt31=15;
                }
                break;
            case 105:
                {
                alt31=16;
                }
                break;
            case COMMAND_CALL_PREFIX:
            case 104:
                {
                alt31=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:244:4: updateTalkTree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_updateTalkTree_in_triggerEffect1540);
                    updateTalkTree150=updateTalkTree();

                    state._fsp--;

                    adaptor.addChild(root_0, updateTalkTree150.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:6: spawnTeam
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnTeam_in_triggerEffect1547);
                    spawnTeam151=spawnTeam();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnTeam151.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:6: spawnCharacter
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnCharacter_in_triggerEffect1554);
                    spawnCharacter152=spawnCharacter();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnCharacter152.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:247:6: removeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeUnit_in_triggerEffect1561);
                    removeUnit153=removeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, removeUnit153.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:248:6: killUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_killUnit_in_triggerEffect1568);
                    killUnit154=killUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, killUnit154.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:6: teleportUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_teleportUnit_in_triggerEffect1575);
                    teleportUnit155=teleportUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, teleportUnit155.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:6: converseUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_converseUnit_in_triggerEffect1582);
                    converseUnit156=converseUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, converseUnit156.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:251:6: createSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_createSaferoom_in_triggerEffect1589);
                    createSaferoom157=createSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, createSaferoom157.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:252:6: removeSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeSaferoom_in_triggerEffect1596);
                    removeSaferoom158=removeSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, removeSaferoom158.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:253:6: loadMap
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_loadMap_in_triggerEffect1603);
                    loadMap159=loadMap();

                    state._fsp--;

                    adaptor.addChild(root_0, loadMap159.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:6: lockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lockDoor_in_triggerEffect1610);
                    lockDoor160=lockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, lockDoor160.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:255:6: unlockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unlockDoor_in_triggerEffect1617);
                    unlockDoor161=unlockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, unlockDoor161.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:256:6: addTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_addTag_in_triggerEffect1624);
                    addTag162=addTag();

                    state._fsp--;

                    adaptor.addChild(root_0, addTag162.getTree());

                    }
                    break;
                case 14 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:6: removeTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeTag_in_triggerEffect1631);
                    removeTag163=removeTag();

                    state._fsp--;

                    adaptor.addChild(root_0, removeTag163.getTree());

                    }
                    break;
                case 15 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:6: directorBias
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_directorBias_in_triggerEffect1638);
                    directorBias164=directorBias();

                    state._fsp--;

                    adaptor.addChild(root_0, directorBias164.getTree());

                    }
                    break;
                case 16 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:259:6: changeAiNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_changeAiNode_in_triggerEffect1645);
                    changeAiNode165=changeAiNode();

                    state._fsp--;

                    adaptor.addChild(root_0, changeAiNode165.getTree());

                    }
                    break;
                case 17 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:260:6: commandCallList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandCallList_in_triggerEffect1652);
                    commandCallList166=commandCallList();

                    state._fsp--;

                    adaptor.addChild(root_0, commandCallList166.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:263:1: updateTalkTree : ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) );
    public final AtrophyScriptParser.updateTalkTree_return updateTalkTree() throws RecognitionException {
        AtrophyScriptParser.updateTalkTree_return retval = new AtrophyScriptParser.updateTalkTree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal167=null;
        Token INT169=null;
        Token UPDATE_TREE_PREFIX170=null;
        Token char_literal172=null;
        Token INT173=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral168 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral171 =null;


        CommonTree string_literal167_tree=null;
        CommonTree INT169_tree=null;
        CommonTree UPDATE_TREE_PREFIX170_tree=null;
        CommonTree char_literal172_tree=null;
        CommonTree INT173_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_UPDATE_TREE_PREFIX=new RewriteRuleTokenStream(adaptor,"token UPDATE_TREE_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:263:15: ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==160) ) {
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:264:4: 'updateTalk:' stringLiteral INT
                    {
                    string_literal167=(Token)match(input,160,FOLLOW_160_in_updateTalkTree1667);  
                    stream_160.add(string_literal167);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree1669);
                    stringLiteral168=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral168.getTree());

                    INT169=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree1671);  
                    stream_INT.add(INT169);


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
                    // 264:36: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:264:39: ^( UPDATETALK stringLiteral INT )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:6: UPDATE_TREE_PREFIX stringLiteral '#' INT
                    {
                    UPDATE_TREE_PREFIX170=(Token)match(input,UPDATE_TREE_PREFIX,FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree1688);  
                    stream_UPDATE_TREE_PREFIX.add(UPDATE_TREE_PREFIX170);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree1690);
                    stringLiteral171=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral171.getTree());

                    char_literal172=(Token)match(input,77,FOLLOW_77_in_updateTalkTree1692);  
                    stream_77.add(char_literal172);


                    INT173=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree1694);  
                    stream_INT.add(INT173);


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
                    // 265:47: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:50: ^( UPDATETALK stringLiteral INT )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:268:1: isName : 'isName:' stringList -> ^( ISNAME stringList ) ;
    public final AtrophyScriptParser.isName_return isName() throws RecognitionException {
        AtrophyScriptParser.isName_return retval = new AtrophyScriptParser.isName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal174=null;
        AtrophyScriptParser.stringList_return stringList175 =null;


        CommonTree string_literal174_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:268:7: ( 'isName:' stringList -> ^( ISNAME stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:269:4: 'isName:' stringList
            {
            string_literal174=(Token)match(input,120,FOLLOW_120_in_isName1719);  
            stream_120.add(string_literal174);


            pushFollow(FOLLOW_stringList_in_isName1721);
            stringList175=stringList();

            state._fsp--;

            stream_stringList.add(stringList175.getTree());

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
            // 269:25: -> ^( ISNAME stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:269:28: ^( ISNAME stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:1: isFaction : 'isFaction:' stringList -> ^( ISFACTION stringList ) ;
    public final AtrophyScriptParser.isFaction_return isFaction() throws RecognitionException {
        AtrophyScriptParser.isFaction_return retval = new AtrophyScriptParser.isFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal176=null;
        AtrophyScriptParser.stringList_return stringList177 =null;


        CommonTree string_literal176_tree=null;
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:10: ( 'isFaction:' stringList -> ^( ISFACTION stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:273:4: 'isFaction:' stringList
            {
            string_literal176=(Token)match(input,118,FOLLOW_118_in_isFaction1744);  
            stream_118.add(string_literal176);


            pushFollow(FOLLOW_stringList_in_isFaction1746);
            stringList177=stringList();

            state._fsp--;

            stream_stringList.add(stringList177.getTree());

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
            // 273:28: -> ^( ISFACTION stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:273:31: ^( ISFACTION stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:276:1: hasItem : 'hasItem:' stringList -> ^( HASITEM stringList ) ;
    public final AtrophyScriptParser.hasItem_return hasItem() throws RecognitionException {
        AtrophyScriptParser.hasItem_return retval = new AtrophyScriptParser.hasItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal178=null;
        AtrophyScriptParser.stringList_return stringList179 =null;


        CommonTree string_literal178_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:276:8: ( 'hasItem:' stringList -> ^( HASITEM stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:4: 'hasItem:' stringList
            {
            string_literal178=(Token)match(input,112,FOLLOW_112_in_hasItem1769);  
            stream_112.add(string_literal178);


            pushFollow(FOLLOW_stringList_in_hasItem1771);
            stringList179=stringList();

            state._fsp--;

            stream_stringList.add(stringList179.getTree());

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
            // 277:26: -> ^( HASITEM stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:29: ^( HASITEM stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:1: hasWeapon : 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) ;
    public final AtrophyScriptParser.hasWeapon_return hasWeapon() throws RecognitionException {
        AtrophyScriptParser.hasWeapon_return retval = new AtrophyScriptParser.hasWeapon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal180=null;
        AtrophyScriptParser.stringList_return stringList181 =null;


        CommonTree string_literal180_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:10: ( 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:281:4: 'hasWeapon:' stringList
            {
            string_literal180=(Token)match(input,113,FOLLOW_113_in_hasWeapon1794);  
            stream_113.add(string_literal180);


            pushFollow(FOLLOW_stringList_in_hasWeapon1796);
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
            // 281:28: -> ^( HASWEAPON stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:281:31: ^( HASWEAPON stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:284:1: stringList : stringLiteral ( ',' ! stringLiteral )* ;
    public final AtrophyScriptParser.stringList_return stringList() throws RecognitionException {
        AtrophyScriptParser.stringList_return retval = new AtrophyScriptParser.stringList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal183=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral182 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral184 =null;


        CommonTree char_literal183_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:284:11: ( stringLiteral ( ',' ! stringLiteral )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:4: stringLiteral ( ',' ! stringLiteral )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_stringLiteral_in_stringList1819);
            stringLiteral182=stringLiteral();

            state._fsp--;

            adaptor.addChild(root_0, stringLiteral182.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:18: ( ',' ! stringLiteral )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==81) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:19: ',' ! stringLiteral
            	    {
            	    char_literal183=(Token)match(input,81,FOLLOW_81_in_stringList1822); 

            	    pushFollow(FOLLOW_stringLiteral_in_stringList1825);
            	    stringLiteral184=stringLiteral();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stringLiteral184.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:288:1: isAlive : 'isAlive' -> ^( ISALIVE ) ;
    public final AtrophyScriptParser.isAlive_return isAlive() throws RecognitionException {
        AtrophyScriptParser.isAlive_return retval = new AtrophyScriptParser.isAlive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal185=null;

        CommonTree string_literal185_tree=null;
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:288:8: ( 'isAlive' -> ^( ISALIVE ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:289:4: 'isAlive'
            {
            string_literal185=(Token)match(input,115,FOLLOW_115_in_isAlive1840);  
            stream_115.add(string_literal185);


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
            // 289:14: -> ^( ISALIVE )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:289:17: ^( ISALIVE )
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


    public static class isDead_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isDead"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:292:1: isDead : 'isDead' -> ^( ISDEAD ) ;
    public final AtrophyScriptParser.isDead_return isDead() throws RecognitionException {
        AtrophyScriptParser.isDead_return retval = new AtrophyScriptParser.isDead_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal186=null;

        CommonTree string_literal186_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:292:7: ( 'isDead' -> ^( ISDEAD ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:293:4: 'isDead'
            {
            string_literal186=(Token)match(input,117,FOLLOW_117_in_isDead1861);  
            stream_117.add(string_literal186);


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
            // 293:13: -> ^( ISDEAD )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:293:16: ^( ISDEAD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ISDEAD, "ISDEAD")
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
    // $ANTLR end "isDead"


    public static class isInvestigated_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isInvestigated"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:296:1: isInvestigated : 'isInvestigated' -> ^( ISINVESTIGATED ) ;
    public final AtrophyScriptParser.isInvestigated_return isInvestigated() throws RecognitionException {
        AtrophyScriptParser.isInvestigated_return retval = new AtrophyScriptParser.isInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal187=null;

        CommonTree string_literal187_tree=null;
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:296:15: ( 'isInvestigated' -> ^( ISINVESTIGATED ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:297:4: 'isInvestigated'
            {
            string_literal187=(Token)match(input,119,FOLLOW_119_in_isInvestigated1882);  
            stream_119.add(string_literal187);


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
            // 297:21: -> ^( ISINVESTIGATED )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:297:24: ^( ISINVESTIGATED )
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


    public static class isNotInvestigated_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isNotInvestigated"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:300:1: isNotInvestigated : 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) ;
    public final AtrophyScriptParser.isNotInvestigated_return isNotInvestigated() throws RecognitionException {
        AtrophyScriptParser.isNotInvestigated_return retval = new AtrophyScriptParser.isNotInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal188=null;

        CommonTree string_literal188_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:300:18: ( 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:301:4: 'isNotInvestigated'
            {
            string_literal188=(Token)match(input,122,FOLLOW_122_in_isNotInvestigated1903);  
            stream_122.add(string_literal188);


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
            // 301:24: -> ^( ISNOTINVESTIGATED )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:301:27: ^( ISNOTINVESTIGATED )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ISNOTINVESTIGATED, "ISNOTINVESTIGATED")
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
    // $ANTLR end "isNotInvestigated"


    public static class isDaemon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isDaemon"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:1: isDaemon : 'isDaemon' -> ^( ISDAEMON ) ;
    public final AtrophyScriptParser.isDaemon_return isDaemon() throws RecognitionException {
        AtrophyScriptParser.isDaemon_return retval = new AtrophyScriptParser.isDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal189=null;

        CommonTree string_literal189_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:9: ( 'isDaemon' -> ^( ISDAEMON ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:4: 'isDaemon'
            {
            string_literal189=(Token)match(input,116,FOLLOW_116_in_isDaemon1924);  
            stream_116.add(string_literal189);


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
            // 305:15: -> ^( ISDAEMON )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:18: ^( ISDAEMON )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ISDAEMON, "ISDAEMON")
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
    // $ANTLR end "isDaemon"


    public static class isNotDaemon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isNotDaemon"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:1: isNotDaemon : 'isNotDaemon' -> ^( ISNOTDAEMON ) ;
    public final AtrophyScriptParser.isNotDaemon_return isNotDaemon() throws RecognitionException {
        AtrophyScriptParser.isNotDaemon_return retval = new AtrophyScriptParser.isNotDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal190=null;

        CommonTree string_literal190_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:12: ( 'isNotDaemon' -> ^( ISNOTDAEMON ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:4: 'isNotDaemon'
            {
            string_literal190=(Token)match(input,121,FOLLOW_121_in_isNotDaemon1943);  
            stream_121.add(string_literal190);


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
            // 309:18: -> ^( ISNOTDAEMON )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:21: ^( ISNOTDAEMON )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ISNOTDAEMON, "ISNOTDAEMON")
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
    // $ANTLR end "isNotDaemon"


    public static class teleDestination_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "teleDestination"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:312:1: teleDestination : 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) ;
    public final AtrophyScriptParser.teleDestination_return teleDestination() throws RecognitionException {
        AtrophyScriptParser.teleDestination_return retval = new AtrophyScriptParser.teleDestination_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal191=null;
        Token char_literal192=null;
        Token char_literal195=null;
        AtrophyScriptParser.xListProperty_return xListProperty193 =null;

        AtrophyScriptParser.yListProperty_return yListProperty194 =null;


        CommonTree string_literal191_tree=null;
        CommonTree char_literal192_tree=null;
        CommonTree char_literal195_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_yListProperty=new RewriteRuleSubtreeStream(adaptor,"rule yListProperty");
        RewriteRuleSubtreeStream stream_xListProperty=new RewriteRuleSubtreeStream(adaptor,"rule xListProperty");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:312:16: ( 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:313:4: 'destination' '{' xListProperty yListProperty '}'
            {
            string_literal191=(Token)match(input,110,FOLLOW_110_in_teleDestination1964);  
            stream_110.add(string_literal191);


            char_literal192=(Token)match(input,164,FOLLOW_164_in_teleDestination1966);  
            stream_164.add(char_literal192);


            pushFollow(FOLLOW_xListProperty_in_teleDestination1968);
            xListProperty193=xListProperty();

            state._fsp--;

            stream_xListProperty.add(xListProperty193.getTree());

            pushFollow(FOLLOW_yListProperty_in_teleDestination1970);
            yListProperty194=yListProperty();

            state._fsp--;

            stream_yListProperty.add(yListProperty194.getTree());

            char_literal195=(Token)match(input,165,FOLLOW_165_in_teleDestination1972);  
            stream_165.add(char_literal195);


            // AST REWRITE
            // elements: xListProperty, yListProperty
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 313:54: -> ^( TELEDEST xListProperty yListProperty )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:313:57: ^( TELEDEST xListProperty yListProperty )
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


    public static class maxTeamSize_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "maxTeamSize"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:316:1: maxTeamSize : 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) ;
    public final AtrophyScriptParser.maxTeamSize_return maxTeamSize() throws RecognitionException {
        AtrophyScriptParser.maxTeamSize_return retval = new AtrophyScriptParser.maxTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal196=null;
        Token INT197=null;

        CommonTree string_literal196_tree=null;
        CommonTree INT197_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:316:12: ( 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:4: 'maxTeamSize:' INT
            {
            string_literal196=(Token)match(input,130,FOLLOW_130_in_maxTeamSize1997);  
            stream_130.add(string_literal196);


            INT197=(Token)match(input,INT,FOLLOW_INT_in_maxTeamSize1999);  
            stream_INT.add(INT197);


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
            // 317:23: -> ^( MAXTEAMSIZE INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:26: ^( MAXTEAMSIZE INT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAXTEAMSIZE, "MAXTEAMSIZE")
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
    // $ANTLR end "maxTeamSize"


    public static class minTeamSize_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "minTeamSize"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:320:1: minTeamSize : 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) ;
    public final AtrophyScriptParser.minTeamSize_return minTeamSize() throws RecognitionException {
        AtrophyScriptParser.minTeamSize_return retval = new AtrophyScriptParser.minTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal198=null;
        Token INT199=null;

        CommonTree string_literal198_tree=null;
        CommonTree INT199_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:320:12: ( 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:321:4: 'minTeamSize:' INT
            {
            string_literal198=(Token)match(input,131,FOLLOW_131_in_minTeamSize2020);  
            stream_131.add(string_literal198);


            INT199=(Token)match(input,INT,FOLLOW_INT_in_minTeamSize2022);  
            stream_INT.add(INT199);


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
            // 321:23: -> ^( MINTEAMSIZE INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:321:26: ^( MINTEAMSIZE INT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MINTEAMSIZE, "MINTEAMSIZE")
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
    // $ANTLR end "minTeamSize"


    public static class unitInfo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unitInfo"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:324:1: unitInfo : ( isName | isFaction | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize )* ;
    public final AtrophyScriptParser.unitInfo_return unitInfo() throws RecognitionException {
        AtrophyScriptParser.unitInfo_return retval = new AtrophyScriptParser.unitInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName200 =null;

        AtrophyScriptParser.isFaction_return isFaction201 =null;

        AtrophyScriptParser.hasItem_return hasItem202 =null;

        AtrophyScriptParser.hasWeapon_return hasWeapon203 =null;

        AtrophyScriptParser.isAlive_return isAlive204 =null;

        AtrophyScriptParser.isDead_return isDead205 =null;

        AtrophyScriptParser.isInvestigated_return isInvestigated206 =null;

        AtrophyScriptParser.isNotInvestigated_return isNotInvestigated207 =null;

        AtrophyScriptParser.isDaemon_return isDaemon208 =null;

        AtrophyScriptParser.isNotDaemon_return isNotDaemon209 =null;

        AtrophyScriptParser.teleDestination_return teleDestination210 =null;

        AtrophyScriptParser.maxTeamSize_return maxTeamSize211 =null;

        AtrophyScriptParser.minTeamSize_return minTeamSize212 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:324:9: ( ( isName | isFaction | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:325:4: ( isName | isFaction | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:325:4: ( isName | isFaction | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize )*
            loop34:
            do {
                int alt34=14;
                switch ( input.LA(1) ) {
                case 120:
                    {
                    alt34=1;
                    }
                    break;
                case 118:
                    {
                    alt34=2;
                    }
                    break;
                case 112:
                    {
                    alt34=3;
                    }
                    break;
                case 113:
                    {
                    alt34=4;
                    }
                    break;
                case 115:
                    {
                    alt34=5;
                    }
                    break;
                case 117:
                    {
                    alt34=6;
                    }
                    break;
                case 119:
                    {
                    alt34=7;
                    }
                    break;
                case 122:
                    {
                    alt34=8;
                    }
                    break;
                case 116:
                    {
                    alt34=9;
                    }
                    break;
                case 121:
                    {
                    alt34=10;
                    }
                    break;
                case 110:
                    {
                    alt34=11;
                    }
                    break;
                case 130:
                    {
                    alt34=12;
                    }
                    break;
                case 131:
                    {
                    alt34=13;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:325:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_unitInfo2046);
            	    isName200=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName200.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:326:6: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_unitInfo2053);
            	    isFaction201=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction201.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:6: hasItem
            	    {
            	    pushFollow(FOLLOW_hasItem_in_unitInfo2060);
            	    hasItem202=hasItem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasItem202.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:328:6: hasWeapon
            	    {
            	    pushFollow(FOLLOW_hasWeapon_in_unitInfo2067);
            	    hasWeapon203=hasWeapon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasWeapon203.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:329:6: isAlive
            	    {
            	    pushFollow(FOLLOW_isAlive_in_unitInfo2074);
            	    isAlive204=isAlive();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isAlive204.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:330:6: isDead
            	    {
            	    pushFollow(FOLLOW_isDead_in_unitInfo2081);
            	    isDead205=isDead();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDead205.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:6: isInvestigated
            	    {
            	    pushFollow(FOLLOW_isInvestigated_in_unitInfo2088);
            	    isInvestigated206=isInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isInvestigated206.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:332:6: isNotInvestigated
            	    {
            	    pushFollow(FOLLOW_isNotInvestigated_in_unitInfo2095);
            	    isNotInvestigated207=isNotInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotInvestigated207.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:333:6: isDaemon
            	    {
            	    pushFollow(FOLLOW_isDaemon_in_unitInfo2102);
            	    isDaemon208=isDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDaemon208.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:334:6: isNotDaemon
            	    {
            	    pushFollow(FOLLOW_isNotDaemon_in_unitInfo2109);
            	    isNotDaemon209=isNotDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotDaemon209.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:6: teleDestination
            	    {
            	    pushFollow(FOLLOW_teleDestination_in_unitInfo2116);
            	    teleDestination210=teleDestination();

            	    state._fsp--;

            	    adaptor.addChild(root_0, teleDestination210.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:6: maxTeamSize
            	    {
            	    pushFollow(FOLLOW_maxTeamSize_in_unitInfo2123);
            	    maxTeamSize211=maxTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, maxTeamSize211.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:337:6: minTeamSize
            	    {
            	    pushFollow(FOLLOW_minTeamSize_in_unitInfo2130);
            	    minTeamSize212=minTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, minTeamSize212.getTree());

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


    public static class spawnTeam_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spawnTeam"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:1: spawnTeam : 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) ;
    public final AtrophyScriptParser.spawnTeam_return spawnTeam() throws RecognitionException {
        AtrophyScriptParser.spawnTeam_return retval = new AtrophyScriptParser.spawnTeam_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal213=null;
        Token char_literal214=null;
        Token char_literal216=null;
        AtrophyScriptParser.unitInfo_return unitInfo215 =null;


        CommonTree string_literal213_tree=null;
        CommonTree char_literal214_tree=null;
        CommonTree char_literal216_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:10: ( 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:341:4: 'spawnTeam' '{' unitInfo '}'
            {
            string_literal213=(Token)match(input,145,FOLLOW_145_in_spawnTeam2149);  
            stream_145.add(string_literal213);


            char_literal214=(Token)match(input,164,FOLLOW_164_in_spawnTeam2151);  
            stream_164.add(char_literal214);


            pushFollow(FOLLOW_unitInfo_in_spawnTeam2153);
            unitInfo215=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo215.getTree());

            char_literal216=(Token)match(input,165,FOLLOW_165_in_spawnTeam2155);  
            stream_165.add(char_literal216);


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
            // 341:33: -> ^( SPAWNTEAM unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:341:36: ^( SPAWNTEAM unitInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SPAWNTEAM, "SPAWNTEAM")
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
    // $ANTLR end "spawnTeam"


    public static class spawnCharacter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spawnCharacter"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:344:1: spawnCharacter : 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) ;
    public final AtrophyScriptParser.spawnCharacter_return spawnCharacter() throws RecognitionException {
        AtrophyScriptParser.spawnCharacter_return retval = new AtrophyScriptParser.spawnCharacter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal217=null;
        Token char_literal218=null;
        Token char_literal220=null;
        AtrophyScriptParser.unitInfo_return unitInfo219 =null;


        CommonTree string_literal217_tree=null;
        CommonTree char_literal218_tree=null;
        CommonTree char_literal220_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:344:15: ( 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:345:4: 'spawnCharacter' '{' unitInfo '}'
            {
            string_literal217=(Token)match(input,144,FOLLOW_144_in_spawnCharacter2178);  
            stream_144.add(string_literal217);


            char_literal218=(Token)match(input,164,FOLLOW_164_in_spawnCharacter2180);  
            stream_164.add(char_literal218);


            pushFollow(FOLLOW_unitInfo_in_spawnCharacter2182);
            unitInfo219=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo219.getTree());

            char_literal220=(Token)match(input,165,FOLLOW_165_in_spawnCharacter2184);  
            stream_165.add(char_literal220);


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
            // 345:38: -> ^( SPAWNCHARACTER unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:345:41: ^( SPAWNCHARACTER unitInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SPAWNCHARACTER, "SPAWNCHARACTER")
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
    // $ANTLR end "spawnCharacter"


    public static class removeUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "removeUnit"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:348:1: removeUnit : 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) ;
    public final AtrophyScriptParser.removeUnit_return removeUnit() throws RecognitionException {
        AtrophyScriptParser.removeUnit_return retval = new AtrophyScriptParser.removeUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal221=null;
        Token char_literal222=null;
        Token char_literal224=null;
        AtrophyScriptParser.unitInfo_return unitInfo223 =null;


        CommonTree string_literal221_tree=null;
        CommonTree char_literal222_tree=null;
        CommonTree char_literal224_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:348:11: ( 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:349:4: 'removeUnit' '{' unitInfo '}'
            {
            string_literal221=(Token)match(input,141,FOLLOW_141_in_removeUnit2207);  
            stream_141.add(string_literal221);


            char_literal222=(Token)match(input,164,FOLLOW_164_in_removeUnit2209);  
            stream_164.add(char_literal222);


            pushFollow(FOLLOW_unitInfo_in_removeUnit2211);
            unitInfo223=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo223.getTree());

            char_literal224=(Token)match(input,165,FOLLOW_165_in_removeUnit2213);  
            stream_165.add(char_literal224);


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
            // 349:34: -> ^( REMOVEUNIT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:349:37: ^( REMOVEUNIT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:1: killUnit : 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) ;
    public final AtrophyScriptParser.killUnit_return killUnit() throws RecognitionException {
        AtrophyScriptParser.killUnit_return retval = new AtrophyScriptParser.killUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal225=null;
        Token char_literal226=null;
        Token char_literal228=null;
        AtrophyScriptParser.unitInfo_return unitInfo227 =null;


        CommonTree string_literal225_tree=null;
        CommonTree char_literal226_tree=null;
        CommonTree char_literal228_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:9: ( 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:353:4: 'killUnit' '{' unitInfo '}'
            {
            string_literal225=(Token)match(input,123,FOLLOW_123_in_killUnit2236);  
            stream_123.add(string_literal225);


            char_literal226=(Token)match(input,164,FOLLOW_164_in_killUnit2238);  
            stream_164.add(char_literal226);


            pushFollow(FOLLOW_unitInfo_in_killUnit2240);
            unitInfo227=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo227.getTree());

            char_literal228=(Token)match(input,165,FOLLOW_165_in_killUnit2242);  
            stream_165.add(char_literal228);


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
            // 353:32: -> ^( KILLUNIT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:353:35: ^( KILLUNIT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:1: teleportUnit : 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) ;
    public final AtrophyScriptParser.teleportUnit_return teleportUnit() throws RecognitionException {
        AtrophyScriptParser.teleportUnit_return retval = new AtrophyScriptParser.teleportUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal229=null;
        Token char_literal230=null;
        Token char_literal232=null;
        AtrophyScriptParser.unitInfo_return unitInfo231 =null;


        CommonTree string_literal229_tree=null;
        CommonTree char_literal230_tree=null;
        CommonTree char_literal232_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:13: ( 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:357:4: 'teleport' '{' unitInfo '}'
            {
            string_literal229=(Token)match(input,152,FOLLOW_152_in_teleportUnit2265);  
            stream_152.add(string_literal229);


            char_literal230=(Token)match(input,164,FOLLOW_164_in_teleportUnit2267);  
            stream_164.add(char_literal230);


            pushFollow(FOLLOW_unitInfo_in_teleportUnit2269);
            unitInfo231=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo231.getTree());

            char_literal232=(Token)match(input,165,FOLLOW_165_in_teleportUnit2271);  
            stream_165.add(char_literal232);


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
            // 357:32: -> ^( TELEPORT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:357:35: ^( TELEPORT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:1: converseUnit : 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) ;
    public final AtrophyScriptParser.converseUnit_return converseUnit() throws RecognitionException {
        AtrophyScriptParser.converseUnit_return retval = new AtrophyScriptParser.converseUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal233=null;
        Token char_literal234=null;
        Token char_literal236=null;
        AtrophyScriptParser.unitInfo_return unitInfo235 =null;


        CommonTree string_literal233_tree=null;
        CommonTree char_literal234_tree=null;
        CommonTree char_literal236_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:13: ( 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:361:4: 'converse' '{' unitInfo '}'
            {
            string_literal233=(Token)match(input,108,FOLLOW_108_in_converseUnit2294);  
            stream_108.add(string_literal233);


            char_literal234=(Token)match(input,164,FOLLOW_164_in_converseUnit2296);  
            stream_164.add(char_literal234);


            pushFollow(FOLLOW_unitInfo_in_converseUnit2298);
            unitInfo235=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo235.getTree());

            char_literal236=(Token)match(input,165,FOLLOW_165_in_converseUnit2300);  
            stream_165.add(char_literal236);


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
            // 361:32: -> ^( CONVERSE unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:361:35: ^( CONVERSE unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:364:1: createSaferoom : 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.createSaferoom_return createSaferoom() throws RecognitionException {
        AtrophyScriptParser.createSaferoom_return retval = new AtrophyScriptParser.createSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal237=null;
        Token char_literal238=null;
        Token char_literal240=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo239 =null;


        CommonTree string_literal237_tree=null;
        CommonTree char_literal238_tree=null;
        CommonTree char_literal240_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:364:15: ( 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:365:4: 'saferoom' '{' saferoomInfo '}'
            {
            string_literal237=(Token)match(input,143,FOLLOW_143_in_createSaferoom2323);  
            stream_143.add(string_literal237);


            char_literal238=(Token)match(input,164,FOLLOW_164_in_createSaferoom2325);  
            stream_164.add(char_literal238);


            pushFollow(FOLLOW_saferoomInfo_in_createSaferoom2327);
            saferoomInfo239=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo239.getTree());

            char_literal240=(Token)match(input,165,FOLLOW_165_in_createSaferoom2329);  
            stream_165.add(char_literal240);


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
            // 365:36: -> ^( SAFEROOM saferoomInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:365:39: ^( SAFEROOM saferoomInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:368:1: removeSaferoom : 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.removeSaferoom_return removeSaferoom() throws RecognitionException {
        AtrophyScriptParser.removeSaferoom_return retval = new AtrophyScriptParser.removeSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal241=null;
        Token char_literal242=null;
        Token char_literal244=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo243 =null;


        CommonTree string_literal241_tree=null;
        CommonTree char_literal242_tree=null;
        CommonTree char_literal244_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:368:15: ( 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:369:4: 'removeSaferoom' '{' saferoomInfo '}'
            {
            string_literal241=(Token)match(input,139,FOLLOW_139_in_removeSaferoom2352);  
            stream_139.add(string_literal241);


            char_literal242=(Token)match(input,164,FOLLOW_164_in_removeSaferoom2354);  
            stream_164.add(char_literal242);


            pushFollow(FOLLOW_saferoomInfo_in_removeSaferoom2356);
            saferoomInfo243=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo243.getTree());

            char_literal244=(Token)match(input,165,FOLLOW_165_in_removeSaferoom2358);  
            stream_165.add(char_literal244);


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
            // 369:42: -> ^( REMOVESAFEROOM saferoomInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:369:45: ^( REMOVESAFEROOM saferoomInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:372:1: containsFaction : 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) ;
    public final AtrophyScriptParser.containsFaction_return containsFaction() throws RecognitionException {
        AtrophyScriptParser.containsFaction_return retval = new AtrophyScriptParser.containsFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal245=null;
        AtrophyScriptParser.stringList_return stringList246 =null;


        CommonTree string_literal245_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:372:16: ( 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:373:4: 'containsFaction:' stringList
            {
            string_literal245=(Token)match(input,107,FOLLOW_107_in_containsFaction2381);  
            stream_107.add(string_literal245);


            pushFollow(FOLLOW_stringList_in_containsFaction2383);
            stringList246=stringList();

            state._fsp--;

            stream_stringList.add(stringList246.getTree());

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
            // 373:34: -> ^( CONTAINSFACTION stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:373:37: ^( CONTAINSFACTION stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:1: saferoomInfo : ( containsFaction | isName )* ;
    public final AtrophyScriptParser.saferoomInfo_return saferoomInfo() throws RecognitionException {
        AtrophyScriptParser.saferoomInfo_return retval = new AtrophyScriptParser.saferoomInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.containsFaction_return containsFaction247 =null;

        AtrophyScriptParser.isName_return isName248 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:13: ( ( containsFaction | isName )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:377:4: ( containsFaction | isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:377:4: ( containsFaction | isName )*
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==107) ) {
                    alt35=1;
                }
                else if ( (LA35_0==120) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:377:5: containsFaction
            	    {
            	    pushFollow(FOLLOW_containsFaction_in_saferoomInfo2407);
            	    containsFaction247=containsFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, containsFaction247.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:378:6: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_saferoomInfo2414);
            	    isName248=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName248.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:381:1: loadMap : 'loadMap:' stringLiteral -> ^( LOADMAP stringLiteral ) ;
    public final AtrophyScriptParser.loadMap_return loadMap() throws RecognitionException {
        AtrophyScriptParser.loadMap_return retval = new AtrophyScriptParser.loadMap_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal249=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral250 =null;


        CommonTree string_literal249_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:381:8: ( 'loadMap:' stringLiteral -> ^( LOADMAP stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:382:4: 'loadMap:' stringLiteral
            {
            string_literal249=(Token)match(input,126,FOLLOW_126_in_loadMap2431);  
            stream_126.add(string_literal249);


            pushFollow(FOLLOW_stringLiteral_in_loadMap2433);
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
            // 382:29: -> ^( LOADMAP stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:382:32: ^( LOADMAP stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:385:1: lockDoor : 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.lockDoor_return lockDoor() throws RecognitionException {
        AtrophyScriptParser.lockDoor_return retval = new AtrophyScriptParser.lockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal251=null;
        Token char_literal252=null;
        Token char_literal254=null;
        AtrophyScriptParser.doorInfo_return doorInfo253 =null;


        CommonTree string_literal251_tree=null;
        CommonTree char_literal252_tree=null;
        CommonTree char_literal254_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:385:9: ( 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:386:4: 'lockDoor' '{' doorInfo '}'
            {
            string_literal251=(Token)match(input,127,FOLLOW_127_in_lockDoor2456);  
            stream_127.add(string_literal251);


            char_literal252=(Token)match(input,164,FOLLOW_164_in_lockDoor2458);  
            stream_164.add(char_literal252);


            pushFollow(FOLLOW_doorInfo_in_lockDoor2460);
            doorInfo253=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo253.getTree());

            char_literal254=(Token)match(input,165,FOLLOW_165_in_lockDoor2462);  
            stream_165.add(char_literal254);


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
            // 386:32: -> ^( LOCKDOOR doorInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:386:35: ^( LOCKDOOR doorInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:389:1: unlockDoor : 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.unlockDoor_return unlockDoor() throws RecognitionException {
        AtrophyScriptParser.unlockDoor_return retval = new AtrophyScriptParser.unlockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal255=null;
        Token char_literal256=null;
        Token char_literal258=null;
        AtrophyScriptParser.doorInfo_return doorInfo257 =null;


        CommonTree string_literal255_tree=null;
        CommonTree char_literal256_tree=null;
        CommonTree char_literal258_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:389:11: ( 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:390:4: 'unlockDoor' '{' doorInfo '}'
            {
            string_literal255=(Token)match(input,159,FOLLOW_159_in_unlockDoor2485);  
            stream_159.add(string_literal255);


            char_literal256=(Token)match(input,164,FOLLOW_164_in_unlockDoor2487);  
            stream_164.add(char_literal256);


            pushFollow(FOLLOW_doorInfo_in_unlockDoor2489);
            doorInfo257=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo257.getTree());

            char_literal258=(Token)match(input,165,FOLLOW_165_in_unlockDoor2491);  
            stream_165.add(char_literal258);


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
            // 390:34: -> ^( UNLOCKDOOR doorInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:390:37: ^( UNLOCKDOOR doorInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:393:1: doorInfo : 'name:' stringList -> ^( DOORNAMES stringList ) ;
    public final AtrophyScriptParser.doorInfo_return doorInfo() throws RecognitionException {
        AtrophyScriptParser.doorInfo_return retval = new AtrophyScriptParser.doorInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal259=null;
        AtrophyScriptParser.stringList_return stringList260 =null;


        CommonTree string_literal259_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:393:9: ( 'name:' stringList -> ^( DOORNAMES stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:394:4: 'name:' stringList
            {
            string_literal259=(Token)match(input,132,FOLLOW_132_in_doorInfo2514);  
            stream_132.add(string_literal259);


            pushFollow(FOLLOW_stringList_in_doorInfo2516);
            stringList260=stringList();

            state._fsp--;

            stream_stringList.add(stringList260.getTree());

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
            // 394:23: -> ^( DOORNAMES stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:394:26: ^( DOORNAMES stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:397:1: addTag : ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) );
    public final AtrophyScriptParser.addTag_return addTag() throws RecognitionException {
        AtrophyScriptParser.addTag_return retval = new AtrophyScriptParser.addTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal261=null;
        Token ADD_TAG_PREFIX263=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral262 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral264 =null;


        CommonTree string_literal261_tree=null;
        CommonTree ADD_TAG_PREFIX263_tree=null;
        RewriteRuleTokenStream stream_ADD_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token ADD_TAG_PREFIX");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:397:7: ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==101) ) {
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:398:4: 'addTag:' stringLiteral
                    {
                    string_literal261=(Token)match(input,101,FOLLOW_101_in_addTag2539);  
                    stream_101.add(string_literal261);


                    pushFollow(FOLLOW_stringLiteral_in_addTag2541);
                    stringLiteral262=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral262.getTree());

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
                    // 398:28: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:398:31: ^( ADDTAG stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:399:6: ADD_TAG_PREFIX stringLiteral
                    {
                    ADD_TAG_PREFIX263=(Token)match(input,ADD_TAG_PREFIX,FOLLOW_ADD_TAG_PREFIX_in_addTag2556);  
                    stream_ADD_TAG_PREFIX.add(ADD_TAG_PREFIX263);


                    pushFollow(FOLLOW_stringLiteral_in_addTag2558);
                    stringLiteral264=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral264.getTree());

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
                    // 399:35: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:399:38: ^( ADDTAG stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:402:1: removeTag : ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) );
    public final AtrophyScriptParser.removeTag_return removeTag() throws RecognitionException {
        AtrophyScriptParser.removeTag_return retval = new AtrophyScriptParser.removeTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal265=null;
        Token REMOVE_TAG_PREFIX267=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral266 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral268 =null;


        CommonTree string_literal265_tree=null;
        CommonTree REMOVE_TAG_PREFIX267_tree=null;
        RewriteRuleTokenStream stream_REMOVE_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token REMOVE_TAG_PREFIX");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:402:10: ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==140) ) {
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:403:4: 'removeTag:' stringLiteral
                    {
                    string_literal265=(Token)match(input,140,FOLLOW_140_in_removeTag2581);  
                    stream_140.add(string_literal265);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag2583);
                    stringLiteral266=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral266.getTree());

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
                    // 403:31: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:403:34: ^( REMOVETAG stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:404:6: REMOVE_TAG_PREFIX stringLiteral
                    {
                    REMOVE_TAG_PREFIX267=(Token)match(input,REMOVE_TAG_PREFIX,FOLLOW_REMOVE_TAG_PREFIX_in_removeTag2598);  
                    stream_REMOVE_TAG_PREFIX.add(REMOVE_TAG_PREFIX267);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag2600);
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
                    // 404:38: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:404:41: ^( REMOVETAG stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:407:1: directorBias : 'directorBias:' -> ^( DIRECTORBIAS ) ;
    public final AtrophyScriptParser.directorBias_return directorBias() throws RecognitionException {
        AtrophyScriptParser.directorBias_return retval = new AtrophyScriptParser.directorBias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal269=null;

        CommonTree string_literal269_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:407:13: ( 'directorBias:' -> ^( DIRECTORBIAS ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:408:4: 'directorBias:'
            {
            string_literal269=(Token)match(input,111,FOLLOW_111_in_directorBias2623);  
            stream_111.add(string_literal269);


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
            // 408:20: -> ^( DIRECTORBIAS )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:408:23: ^( DIRECTORBIAS )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:411:1: changeAiNode : 'changeAiNode:' -> ^( CHANGEAINODE ) ;
    public final AtrophyScriptParser.changeAiNode_return changeAiNode() throws RecognitionException {
        AtrophyScriptParser.changeAiNode_return retval = new AtrophyScriptParser.changeAiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal270=null;

        CommonTree string_literal270_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:411:13: ( 'changeAiNode:' -> ^( CHANGEAINODE ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:412:4: 'changeAiNode:'
            {
            string_literal270=(Token)match(input,105,FOLLOW_105_in_changeAiNode2644);  
            stream_105.add(string_literal270);


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
            // 412:21: -> ^( CHANGEAINODE )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:412:24: ^( CHANGEAINODE )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:415:1: beginStatement : ( 'INIT' | 'init' ) '{' commandCallList '}' -> ^( INIT commandCallList ) ;
    public final AtrophyScriptParser.beginStatement_return beginStatement() throws RecognitionException {
        AtrophyScriptParser.beginStatement_return retval = new AtrophyScriptParser.beginStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal271=null;
        Token string_literal272=null;
        Token char_literal273=null;
        Token char_literal275=null;
        AtrophyScriptParser.commandCallList_return commandCallList274 =null;


        CommonTree string_literal271_tree=null;
        CommonTree string_literal272_tree=null;
        CommonTree char_literal273_tree=null;
        CommonTree char_literal275_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_commandCallList=new RewriteRuleSubtreeStream(adaptor,"rule commandCallList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:415:15: ( ( 'INIT' | 'init' ) '{' commandCallList '}' -> ^( INIT commandCallList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:416:4: ( 'INIT' | 'init' ) '{' commandCallList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:416:4: ( 'INIT' | 'init' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==92) ) {
                alt38=1;
            }
            else if ( (LA38_0==114) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:416:5: 'INIT'
                    {
                    string_literal271=(Token)match(input,92,FOLLOW_92_in_beginStatement2667);  
                    stream_92.add(string_literal271);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:416:14: 'init'
                    {
                    string_literal272=(Token)match(input,114,FOLLOW_114_in_beginStatement2671);  
                    stream_114.add(string_literal272);


                    }
                    break;

            }


            char_literal273=(Token)match(input,164,FOLLOW_164_in_beginStatement2674);  
            stream_164.add(char_literal273);


            pushFollow(FOLLOW_commandCallList_in_beginStatement2679);
            commandCallList274=commandCallList();

            state._fsp--;

            stream_commandCallList.add(commandCallList274.getTree());

            char_literal275=(Token)match(input,165,FOLLOW_165_in_beginStatement2684);  
            stream_165.add(char_literal275);


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
            // 419:4: -> ^( INIT commandCallList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:420:4: ^( INIT commandCallList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:423:1: commandCallList : commandCall ( ',' ! commandCall )* ;
    public final AtrophyScriptParser.commandCallList_return commandCallList() throws RecognitionException {
        AtrophyScriptParser.commandCallList_return retval = new AtrophyScriptParser.commandCallList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal277=null;
        AtrophyScriptParser.commandCall_return commandCall276 =null;

        AtrophyScriptParser.commandCall_return commandCall278 =null;


        CommonTree char_literal277_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:423:16: ( commandCall ( ',' ! commandCall )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:4: commandCall ( ',' ! commandCall )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_commandCall_in_commandCallList2711);
            commandCall276=commandCall();

            state._fsp--;

            adaptor.addChild(root_0, commandCall276.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:16: ( ',' ! commandCall )*
            loop39:
            do {
                int alt39=2;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:17: ',' ! commandCall
            	    {
            	    char_literal277=(Token)match(input,81,FOLLOW_81_in_commandCallList2714); 

            	    pushFollow(FOLLOW_commandCall_in_commandCallList2717);
            	    commandCall278=commandCall();

            	    state._fsp--;

            	    adaptor.addChild(root_0, commandCall278.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:427:1: commandCall : ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) );
    public final AtrophyScriptParser.commandCall_return commandCall() throws RecognitionException {
        AtrophyScriptParser.commandCall_return retval = new AtrophyScriptParser.commandCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal279=null;
        Token COMMAND_CALL_PREFIX281=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral280 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral282 =null;


        CommonTree string_literal279_tree=null;
        CommonTree COMMAND_CALL_PREFIX281_tree=null;
        RewriteRuleTokenStream stream_COMMAND_CALL_PREFIX=new RewriteRuleTokenStream(adaptor,"token COMMAND_CALL_PREFIX");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:427:12: ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==104) ) {
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:428:4: 'callCommand:' stringLiteral
                    {
                    string_literal279=(Token)match(input,104,FOLLOW_104_in_commandCall2734);  
                    stream_104.add(string_literal279);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall2736);
                    stringLiteral280=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral280.getTree());

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
                    // 428:33: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:428:36: ^( COMMAND_CALL stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:429:6: COMMAND_CALL_PREFIX stringLiteral
                    {
                    COMMAND_CALL_PREFIX281=(Token)match(input,COMMAND_CALL_PREFIX,FOLLOW_COMMAND_CALL_PREFIX_in_commandCall2751);  
                    stream_COMMAND_CALL_PREFIX.add(COMMAND_CALL_PREFIX281);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall2753);
                    stringLiteral282=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral282.getTree());

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
                    // 429:40: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:429:43: ^( COMMAND_CALL stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:432:1: stringLiteral : '\"' ! ( . )* '\"' !;
    public final AtrophyScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        AtrophyScriptParser.stringLiteral_return retval = new AtrophyScriptParser.stringLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal283=null;
        Token wildcard284=null;
        Token char_literal285=null;

        CommonTree char_literal283_tree=null;
        CommonTree wildcard284_tree=null;
        CommonTree char_literal285_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:432:14: ( '\"' ! ( . )* '\"' !)
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:433:4: '\"' ! ( . )* '\"' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal283=(Token)match(input,76,FOLLOW_76_in_stringLiteral2776); 

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:433:9: ( . )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==76) ) {
                    alt41=2;
                }
                else if ( ((LA41_0 >= ADDTAG && LA41_0 <= 75)||(LA41_0 >= 77 && LA41_0 <= 165)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:433:10: .
            	    {
            	    wildcard284=(Token)input.LT(1);

            	    matchAny(input); 
            	    wildcard284_tree = (CommonTree)adaptor.create(wildcard284);
            	    adaptor.addChild(root_0, wildcard284_tree);


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            char_literal285=(Token)match(input,76,FOLLOW_76_in_stringLiteral2784); 

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
        "\1\121\1\5\1\uffff\2\114\2\4\1\uffff\1\4\1\uffff\1\4";
    static final String DFA39_maxS =
        "\1\u00a5\1\u00a0\1\uffff\2\114\2\u00a5\1\uffff\1\u00a5\1\uffff\1"+
        "\u00a5";
    static final String DFA39_acceptS =
        "\2\uffff\1\2\4\uffff\1\1\1\uffff\1\1\1\uffff";
    static final String DFA39_specialS =
        "\13\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1\123\uffff\1\2",
            "\1\2\6\uffff\1\4\43\uffff\1\2\24\uffff\1\2\37\uffff\1\2\2\uffff"+
            "\1\3\1\2\2\uffff\1\2\2\uffff\1\2\13\uffff\1\2\2\uffff\2\2\13"+
            "\uffff\3\2\1\uffff\3\2\6\uffff\1\2\6\uffff\2\2",
            "",
            "\1\5",
            "\1\6",
            "\110\10\1\7\131\10",
            "\110\12\1\11\131\12",
            "",
            "\110\10\1\7\131\10",
            "",
            "\110\12\1\11\131\12"
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
            return "()* loopback of 424:16: ( ',' ! commandCall )*";
        }
    }
 

    public static final BitSet FOLLOW_command_in_prog313 = new BitSet(new long[]{0x0000000000000000L,0x0004048EF6000000L,0x000000001C200403L});
    public static final BitSet FOLLOW_beginStatement_in_prog320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSize_in_command343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSpawns_in_command350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockDecl_in_command357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portalDecl_in_command364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textureBlockDecl_in_command371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerDecl_in_command378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandDecl_in_command385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_talkDecl_in_command392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_requiredAssignment405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_requiredAssignment407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requiredAssignment_in_varAssignment431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_mapSize458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_128_in_mapSize462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_mapSize465 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mapSize467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_mapSize469 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mapSize471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_mapSize473 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mapSize475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_mapSize477 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_mapSize479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_mapSize481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_mapSpawns506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_129_in_mapSpawns510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_mapSpawns513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000002000000000L});
    public static final BitSet FOLLOW_stringList_in_mapSpawns515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_mapSpawns518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_blockDecl543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_103_in_blockDecl547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_varAssignment_in_blockDecl550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_blockDecl552 = new BitSet(new long[]{0x0000000000000000L,0x3000205108000000L,0x0000002E62DCC3E0L});
    public static final BitSet FOLLOW_properties_in_blockDecl554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_blockDecl556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_portalDecl582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_138_in_portalDecl586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_varAssignment_in_portalDecl589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_portalDecl591 = new BitSet(new long[]{0x0000000000000000L,0x3000205108000000L,0x0000002E62DCC3E0L});
    public static final BitSet FOLLOW_properties_in_portalDecl593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_portalDecl595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_textureBlockDecl621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_155_in_textureBlockDecl625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_154_in_textureBlockDecl629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_textureBlockDecl632 = new BitSet(new long[]{0x0000000000000000L,0x3000205108000000L,0x0000002E62DCC3E0L});
    public static final BitSet FOLLOW_properties_in_textureBlockDecl634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_textureBlockDecl636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_triggerDecl660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_156_in_triggerDecl664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_requiredAssignment_in_triggerDecl667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_triggerDecl669 = new BitSet(new long[]{0x0000000000000000L,0x3000205108000000L,0x0000002E62DCC3E0L});
    public static final BitSet FOLLOW_properties_in_triggerDecl671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_triggerDecl673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_commandDecl699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_106_in_commandDecl703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_requiredAssignment_in_commandDecl706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_commandDecl708 = new BitSet(new long[]{0x0001000000001020L,0xC800932000000020L,0x000000018103B800L});
    public static final BitSet FOLLOW_triggerEffectList_in_commandDecl710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_commandDecl712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_talkDecl742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_149_in_talkDecl746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_talkDecl749 = new BitSet(new long[]{0x0000000000000000L,0x3000205108000000L,0x0000002E62DCC3E0L});
    public static final BitSet FOLLOW_properties_in_talkDecl751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_talkDecl753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xListProperty_in_properties777 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_yListProperty_in_properties784 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_factionTerritoryProperty_in_properties791 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_factionZoneProperty_in_properties798 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_saferoomProperty_in_properties805 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_stageProperty_in_properties812 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_stageDeclProperty_in_properties819 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_talkMapParentProperty_in_properties826 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_aiInitProperty_in_properties833 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_openingLineProperty_in_properties840 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_lineProperty_in_properties847 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_triggerCondProperty_in_properties854 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_triggerEffectProperty_in_properties861 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_coverDecl_in_properties868 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_stashDecl_in_properties875 = new BitSet(new long[]{0x0000000000000002L,0x3000205108000000L,0x0000000E62DCC3E0L});
    public static final BitSet FOLLOW_161_in_xListProperty892 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_xListProperty897 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty898 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_162_in_yListProperty922 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_yListProperty927 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_153_in_factionTerritoryProperty954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_factionTerritoryProperty956 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_factionTerritoryProperty958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_factionZoneProperty983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringList_in_factionZoneProperty985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_saferoomProperty1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_stageDeclProperty1029 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_stageDeclProperty1034 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1036 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_137_in_talkMapParentProperty1063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_136_in_talkMapParentProperty1067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_talkMapParentProperty1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_stageProperty1094 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_142_in_stageProperty1098 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_stageProperty1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_aiInitProperty1125 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_100_in_aiInitProperty1129 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BOOL_in_aiInitProperty1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_openingLineProperty1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_134_in_openingLineProperty1160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_135_in_openingLineProperty1164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_openingLineProperty1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_lineProperty1189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_125_in_lineProperty1193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_lineProperty1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_term1219 = new BitSet(new long[]{0x0000000000000100L,0x0000000000054000L});
    public static final BitSet FOLLOW_condExpression_in_term1221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_term1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_term1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanQuery_in_term1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_unary1278 = new BitSet(new long[]{0x0000000000000100L,0x0000000000054000L});
    public static final BitSet FOLLOW_negation_in_unary1283 = new BitSet(new long[]{0x0000000000000100L,0x0000000000054000L});
    public static final BitSet FOLLOW_term_in_unary1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_negation1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_condExpression1336 = new BitSet(new long[]{0x0000000000000002L,0x0000000001F00800L});
    public static final BitSet FOLLOW_set_in_condExpression1339 = new BitSet(new long[]{0x0000000000000100L,0x0000000000054000L});
    public static final BitSet FOLLOW_unary_in_condExpression1362 = new BitSet(new long[]{0x0000000000000002L,0x0000000001F00800L});
    public static final BitSet FOLLOW_150_in_triggerCondProperty1380 = new BitSet(new long[]{0x0000000000000100L,0x0000000000054000L});
    public static final BitSet FOLLOW_157_in_triggerCondProperty1384 = new BitSet(new long[]{0x0000000000000100L,0x0000000000054000L});
    public static final BitSet FOLLOW_condExpression_in_triggerCondProperty1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_triggerEffectProperty1409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_158_in_triggerEffectProperty1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_triggerEffectProperty1416 = new BitSet(new long[]{0x0001000000001020L,0xC800932000000020L,0x000000018103B800L});
    public static final BitSet FOLLOW_triggerEffectList_in_triggerEffectProperty1418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_triggerEffectProperty1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_coverDecl1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_109_in_coverDecl1448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_varAssignment_in_coverDecl1451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_coverDecl1453 = new BitSet(new long[]{0x0000000000000000L,0x3000205108000000L,0x0000002E62DCC3E0L});
    public static final BitSet FOLLOW_properties_in_coverDecl1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_coverDecl1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_stashDecl1483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_148_in_stashDecl1487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_varAssignment_in_stashDecl1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_stashDecl1492 = new BitSet(new long[]{0x0000000000000000L,0x3000205108000000L,0x0000002E62DCC3E0L});
    public static final BitSet FOLLOW_properties_in_stashDecl1494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_stashDecl1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1519 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_triggerEffectList1522 = new BitSet(new long[]{0x0001000000001020L,0xC800932000000020L,0x000000018103B800L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_updateTalkTree_in_triggerEffect1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnTeam_in_triggerEffect1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnCharacter_in_triggerEffect1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeUnit_in_triggerEffect1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_killUnit_in_triggerEffect1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_teleportUnit_in_triggerEffect1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_converseUnit_in_triggerEffect1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createSaferoom_in_triggerEffect1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeSaferoom_in_triggerEffect1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loadMap_in_triggerEffect1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lockDoor_in_triggerEffect1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlockDoor_in_triggerEffect1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addTag_in_triggerEffect1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeTag_in_triggerEffect1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directorBias_in_triggerEffect1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeAiNode_in_triggerEffect1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCallList_in_triggerEffect1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_updateTalkTree1667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree1669 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree1688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree1690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_updateTalkTree1692 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_isName1719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringList_in_isName1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_isFaction1744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringList_in_isFaction1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_hasItem1769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringList_in_hasItem1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_hasWeapon1794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringList_in_hasWeapon1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList1819 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_stringList1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList1825 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_115_in_isAlive1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_isDead1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_isInvestigated1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_isNotInvestigated1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_isDaemon1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_isNotDaemon1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_teleDestination1964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_teleDestination1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_xListProperty_in_teleDestination1968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_yListProperty_in_teleDestination1970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_teleDestination1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_maxTeamSize1997 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_maxTeamSize1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_minTeamSize2020 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_minTeamSize2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_unitInfo2046 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_isFaction_in_unitInfo2053 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_hasItem_in_unitInfo2060 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_hasWeapon_in_unitInfo2067 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_isAlive_in_unitInfo2074 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_isDead_in_unitInfo2081 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_isInvestigated_in_unitInfo2088 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_isNotInvestigated_in_unitInfo2095 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_isDaemon_in_unitInfo2102 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_isNotDaemon_in_unitInfo2109 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_teleDestination_in_unitInfo2116 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_maxTeamSize_in_unitInfo2123 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_minTeamSize_in_unitInfo2130 = new BitSet(new long[]{0x0000000000000002L,0x07FB400000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_145_in_spawnTeam2149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_spawnTeam2151 = new BitSet(new long[]{0x0000000000000000L,0x07FB400000000000L,0x000000200000000CL});
    public static final BitSet FOLLOW_unitInfo_in_spawnTeam2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_spawnTeam2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_spawnCharacter2178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_spawnCharacter2180 = new BitSet(new long[]{0x0000000000000000L,0x07FB400000000000L,0x000000200000000CL});
    public static final BitSet FOLLOW_unitInfo_in_spawnCharacter2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_spawnCharacter2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_removeUnit2207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_removeUnit2209 = new BitSet(new long[]{0x0000000000000000L,0x07FB400000000000L,0x000000200000000CL});
    public static final BitSet FOLLOW_unitInfo_in_removeUnit2211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_removeUnit2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_killUnit2236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_killUnit2238 = new BitSet(new long[]{0x0000000000000000L,0x07FB400000000000L,0x000000200000000CL});
    public static final BitSet FOLLOW_unitInfo_in_killUnit2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_killUnit2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_teleportUnit2265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_teleportUnit2267 = new BitSet(new long[]{0x0000000000000000L,0x07FB400000000000L,0x000000200000000CL});
    public static final BitSet FOLLOW_unitInfo_in_teleportUnit2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_teleportUnit2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_converseUnit2294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_converseUnit2296 = new BitSet(new long[]{0x0000000000000000L,0x07FB400000000000L,0x000000200000000CL});
    public static final BitSet FOLLOW_unitInfo_in_converseUnit2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_converseUnit2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_createSaferoom2323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_createSaferoom2325 = new BitSet(new long[]{0x0000000000000000L,0x0100080000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_createSaferoom2327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_createSaferoom2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_removeSaferoom2352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_removeSaferoom2354 = new BitSet(new long[]{0x0000000000000000L,0x0100080000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_removeSaferoom2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_removeSaferoom2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_containsFaction2381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringList_in_containsFaction2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsFaction_in_saferoomInfo2407 = new BitSet(new long[]{0x0000000000000002L,0x0100080000000000L});
    public static final BitSet FOLLOW_isName_in_saferoomInfo2414 = new BitSet(new long[]{0x0000000000000002L,0x0100080000000000L});
    public static final BitSet FOLLOW_126_in_loadMap2431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_loadMap2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_lockDoor2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_lockDoor2458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_doorInfo_in_lockDoor2460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_lockDoor2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_unlockDoor2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_unlockDoor2487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_doorInfo_in_unlockDoor2489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_unlockDoor2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_doorInfo2514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringList_in_doorInfo2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_addTag2539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_TAG_PREFIX_in_addTag2556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_removeTag2581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_TAG_PREFIX_in_removeTag2598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_directorBias2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_changeAiNode2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_beginStatement2667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_114_in_beginStatement2671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_beginStatement2674 = new BitSet(new long[]{0x0000000000001000L,0x0000010000000000L});
    public static final BitSet FOLLOW_commandCallList_in_beginStatement2679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_beginStatement2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList2711 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_commandCallList2714 = new BitSet(new long[]{0x0000000000001000L,0x0000010000000000L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList2717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_104_in_commandCall2734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_CALL_PREFIX_in_commandCall2751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_stringLiteral2776 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_76_in_stringLiteral2784 = new BitSet(new long[]{0x0000000000000002L});

}