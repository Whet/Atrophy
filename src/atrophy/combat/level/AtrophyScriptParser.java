// $ANTLR 3.4 C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g 2013-06-26 22:11:39

	package atrophy.combat.level;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AtrophyScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDTAG", "ADD_TAG_PREFIX", "AIINIT", "AINODE", "AND", "BEHAVIOUR", "BLOCK", "BOOL", "CHANGEAINODE", "COMMAND", "COMMAND_CALL", "COMMAND_CALL_PREFIX", "COMMENT", "CONTAINSFACTION", "CONVERSE", "COVER", "DIRECTORBIAS", "DOORNAMES", "EMPTY", "HASITEM", "HASWEAPON", "IDENT", "INIT", "INROOM", "INT", "ISALIVE", "ISDAEMON", "ISDEAD", "ISFACTION", "ISINVESTIGATED", "ISNAME", "ISNOTDAEMON", "ISNOTINVESTIGATED", "KILLUNIT", "LINE", "LOADMAP", "LOCKDOOR", "LOGIC", "MAPSIZE", "MAPSPAWNS", "MAXTEAMSIZE", "MINTEAMSIZE", "MULTILINE_COMMENT", "NEGATION", "NOT_PREFIX", "ONTIME", "OPENINGLINE", "OPTION", "OR", "PORTAL", "REMOVESAFEROOM", "REMOVETAG", "REMOVEUNIT", "REMOVE_TAG_PREFIX", "REQ", "SAFEROOM", "SPAWNCHARACTER", "SPAWNTEAM", "STAGELIST", "STASH", "SUBSCRIBE", "TALK", "TALKMAP", "TALKPARENT", "TALKSTAGE", "TELEDEST", "TELEPORT", "TERRITORY", "TEXTURE", "TEXTUREBLOCK", "TOPIC", "TRIGGER", "TRIGGERCOND", "TRIGGEREFFECT", "TRIGGERTYPE", "UNLOCKDOOR", "UPDATETALK", "UPDATE_TREE_PREFIX", "VAR", "WS", "XLIST", "YLIST", "ZONE", "'\"'", "'#'", "'('", "')'", "','", "'-'", "'::'", "'AND'", "'BLOCK'", "'COMMAND'", "'COVER'", "'INIT'", "'MAPSIZE'", "'MAPSPAWNS'", "'OR'", "'PORTAL'", "'STASH'", "'TALK'", "'TEXTUREBLOCK'", "'TRIGGER'", "'a:'", "'addTag:'", "'aiInit:'", "'aiNode'", "'behaviours:'", "'block'", "'callCommand:'", "'changeAiNode:'", "'command'", "'containsFaction:'", "'converse'", "'cover'", "'destination'", "'directorBias:'", "'hasItem:'", "'hasWeapon:'", "'init'", "'isAlive'", "'isAlive:'", "'isDaemon'", "'isDead'", "'isFaction:'", "'isInvestigated'", "'isName:'", "'isNotDaemon'", "'isNotInvestigated'", "'killUnit'", "'l:'", "'lines:'", "'loadMap:'", "'lockDoor'", "'mapsize'", "'mapspawns'", "'maxTeamSize:'", "'minTeamSize:'", "'name:'", "'o:'", "'onTime:'", "'opening:'", "'openingLine:'", "'option:'", "'p:'", "'parent:'", "'portal'", "'removeSaferoom'", "'removeTag:'", "'removeUnit'", "'req:'", "'s:'", "'saferoom'", "'spawnCharacter'", "'spawnTeam'", "'stage:'", "'stages:'", "'stash'", "'subscribe:'", "'t:'", "'talk'", "'tc'", "'te'", "'teleport'", "'territory:'", "'textureBlock'", "'textureblock'", "'topic'", "'trigger'", "'triggerCond'", "'triggerEffect'", "'unlockDoor'", "'updateTalk:'", "'x:'", "'y:'", "'zone:'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__166=166;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int T__169=169;
    public static final int T__170=170;
    public static final int T__171=171;
    public static final int T__172=172;
    public static final int T__173=173;
    public static final int T__174=174;
    public static final int T__175=175;
    public static final int T__176=176;
    public static final int T__177=177;
    public static final int T__178=178;
    public static final int T__179=179;
    public static final int T__180=180;
    public static final int T__181=181;
    public static final int ADDTAG=4;
    public static final int ADD_TAG_PREFIX=5;
    public static final int AIINIT=6;
    public static final int AINODE=7;
    public static final int AND=8;
    public static final int BEHAVIOUR=9;
    public static final int BLOCK=10;
    public static final int BOOL=11;
    public static final int CHANGEAINODE=12;
    public static final int COMMAND=13;
    public static final int COMMAND_CALL=14;
    public static final int COMMAND_CALL_PREFIX=15;
    public static final int COMMENT=16;
    public static final int CONTAINSFACTION=17;
    public static final int CONVERSE=18;
    public static final int COVER=19;
    public static final int DIRECTORBIAS=20;
    public static final int DOORNAMES=21;
    public static final int EMPTY=22;
    public static final int HASITEM=23;
    public static final int HASWEAPON=24;
    public static final int IDENT=25;
    public static final int INIT=26;
    public static final int INROOM=27;
    public static final int INT=28;
    public static final int ISALIVE=29;
    public static final int ISDAEMON=30;
    public static final int ISDEAD=31;
    public static final int ISFACTION=32;
    public static final int ISINVESTIGATED=33;
    public static final int ISNAME=34;
    public static final int ISNOTDAEMON=35;
    public static final int ISNOTINVESTIGATED=36;
    public static final int KILLUNIT=37;
    public static final int LINE=38;
    public static final int LOADMAP=39;
    public static final int LOCKDOOR=40;
    public static final int LOGIC=41;
    public static final int MAPSIZE=42;
    public static final int MAPSPAWNS=43;
    public static final int MAXTEAMSIZE=44;
    public static final int MINTEAMSIZE=45;
    public static final int MULTILINE_COMMENT=46;
    public static final int NEGATION=47;
    public static final int NOT_PREFIX=48;
    public static final int ONTIME=49;
    public static final int OPENINGLINE=50;
    public static final int OPTION=51;
    public static final int OR=52;
    public static final int PORTAL=53;
    public static final int REMOVESAFEROOM=54;
    public static final int REMOVETAG=55;
    public static final int REMOVEUNIT=56;
    public static final int REMOVE_TAG_PREFIX=57;
    public static final int REQ=58;
    public static final int SAFEROOM=59;
    public static final int SPAWNCHARACTER=60;
    public static final int SPAWNTEAM=61;
    public static final int STAGELIST=62;
    public static final int STASH=63;
    public static final int SUBSCRIBE=64;
    public static final int TALK=65;
    public static final int TALKMAP=66;
    public static final int TALKPARENT=67;
    public static final int TALKSTAGE=68;
    public static final int TELEDEST=69;
    public static final int TELEPORT=70;
    public static final int TERRITORY=71;
    public static final int TEXTURE=72;
    public static final int TEXTUREBLOCK=73;
    public static final int TOPIC=74;
    public static final int TRIGGER=75;
    public static final int TRIGGERCOND=76;
    public static final int TRIGGEREFFECT=77;
    public static final int TRIGGERTYPE=78;
    public static final int UNLOCKDOOR=79;
    public static final int UPDATETALK=80;
    public static final int UPDATE_TREE_PREFIX=81;
    public static final int VAR=82;
    public static final int WS=83;
    public static final int XLIST=84;
    public static final int YLIST=85;
    public static final int ZONE=86;

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:93:1: prog : ( command )* ( beginStatement )? EOF ;
    public final AtrophyScriptParser.prog_return prog() throws RecognitionException {
        AtrophyScriptParser.prog_return retval = new AtrophyScriptParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        AtrophyScriptParser.command_return command1 =null;

        AtrophyScriptParser.beginStatement_return beginStatement2 =null;


        CommonTree EOF3_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:93:5: ( ( command )* ( beginStatement )? EOF )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:94:5: ( command )* ( beginStatement )? EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:94:5: ( command )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 95 && LA1_0 <= 96)||(LA1_0 >= 99 && LA1_0 <= 100)||LA1_0==102||(LA1_0 >= 104 && LA1_0 <= 106)||LA1_0==112||LA1_0==115||(LA1_0 >= 138 && LA1_0 <= 139)||LA1_0==150||LA1_0==164||(LA1_0 >= 169 && LA1_0 <= 170)||LA1_0==172) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:94:5: command
            	    {
            	    pushFollow(FOLLOW_command_in_prog357);
            	    command1=command();

            	    state._fsp--;

            	    adaptor.addChild(root_0, command1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:95:5: ( beginStatement )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==98||LA2_0==123) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:95:5: beginStatement
                    {
                    pushFollow(FOLLOW_beginStatement_in_prog364);
                    beginStatement2=beginStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, beginStatement2.getTree());

                    }
                    break;

            }


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog371); 
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:99:1: command : ( mapSize | mapSpawns | blockDecl | portalDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl );
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
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:99:8: ( mapSize | mapSpawns | blockDecl | portalDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 99:
            case 138:
                {
                alt3=1;
                }
                break;
            case 100:
            case 139:
                {
                alt3=2;
                }
                break;
            case 95:
            case 112:
                {
                alt3=3;
                }
                break;
            case 102:
            case 150:
                {
                alt3=4;
                }
                break;
            case 105:
            case 169:
            case 170:
                {
                alt3=5;
                }
                break;
            case 106:
            case 172:
                {
                alt3=6;
                }
                break;
            case 96:
            case 115:
                {
                alt3=7;
                }
                break;
            case 104:
            case 164:
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:100:4: mapSize
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSize_in_command387);
                    mapSize4=mapSize();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSize4.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:101:6: mapSpawns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSpawns_in_command394);
                    mapSpawns5=mapSpawns();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSpawns5.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:102:6: blockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_blockDecl_in_command401);
                    blockDecl6=blockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, blockDecl6.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:103:6: portalDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_portalDecl_in_command408);
                    portalDecl7=portalDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, portalDecl7.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:104:6: textureBlockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_textureBlockDecl_in_command415);
                    textureBlockDecl8=textureBlockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, textureBlockDecl8.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:105:6: triggerDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_triggerDecl_in_command422);
                    triggerDecl9=triggerDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, triggerDecl9.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:106:6: commandDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandDecl_in_command429);
                    commandDecl10=commandDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, commandDecl10.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:107:6: talkDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_talkDecl_in_command436);
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:110:1: requiredAssignment : '::' stringLiteral -> ^( VAR stringLiteral ) ;
    public final AtrophyScriptParser.requiredAssignment_return requiredAssignment() throws RecognitionException {
        AtrophyScriptParser.requiredAssignment_return retval = new AtrophyScriptParser.requiredAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal12=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral13 =null;


        CommonTree string_literal12_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:110:19: ( '::' stringLiteral -> ^( VAR stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:111:4: '::' stringLiteral
            {
            string_literal12=(Token)match(input,93,FOLLOW_93_in_requiredAssignment449);  
            stream_93.add(string_literal12);


            pushFollow(FOLLOW_stringLiteral_in_requiredAssignment451);
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
            // 111:23: -> ^( VAR stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:111:26: ^( VAR stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:114:1: varAssignment : ( requiredAssignment | -> ^( EMPTY ) );
    public final AtrophyScriptParser.varAssignment_return varAssignment() throws RecognitionException {
        AtrophyScriptParser.varAssignment_return retval = new AtrophyScriptParser.varAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.requiredAssignment_return requiredAssignment14 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:114:14: ( requiredAssignment | -> ^( EMPTY ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==93) ) {
                alt4=1;
            }
            else if ( (LA4_0==180) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:115:4: requiredAssignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_requiredAssignment_in_varAssignment475);
                    requiredAssignment14=requiredAssignment();

                    state._fsp--;

                    adaptor.addChild(root_0, requiredAssignment14.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:116:6: 
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
                    // 116:6: -> ^( EMPTY )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:116:9: ^( EMPTY )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:119:1: mapSize : ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) ;
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
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:119:8: ( ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:4: ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:4: ( 'MAPSIZE' | 'mapsize' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==99) ) {
                alt5=1;
            }
            else if ( (LA5_0==138) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:5: 'MAPSIZE'
                    {
                    string_literal15=(Token)match(input,99,FOLLOW_99_in_mapSize502);  
                    stream_99.add(string_literal15);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:17: 'mapsize'
                    {
                    string_literal16=(Token)match(input,138,FOLLOW_138_in_mapSize506);  
                    stream_138.add(string_literal16);


                    }
                    break;

            }


            char_literal17=(Token)match(input,180,FOLLOW_180_in_mapSize509);  
            stream_180.add(char_literal17);


            INT18=(Token)match(input,INT,FOLLOW_INT_in_mapSize511);  
            stream_INT.add(INT18);


            char_literal19=(Token)match(input,91,FOLLOW_91_in_mapSize513);  
            stream_91.add(char_literal19);


            INT20=(Token)match(input,INT,FOLLOW_INT_in_mapSize515);  
            stream_INT.add(INT20);


            char_literal21=(Token)match(input,91,FOLLOW_91_in_mapSize517);  
            stream_91.add(char_literal21);


            INT22=(Token)match(input,INT,FOLLOW_INT_in_mapSize519);  
            stream_INT.add(INT22);


            char_literal23=(Token)match(input,91,FOLLOW_91_in_mapSize521);  
            stream_91.add(char_literal23);


            INT24=(Token)match(input,INT,FOLLOW_INT_in_mapSize523);  
            stream_INT.add(INT24);


            char_literal25=(Token)match(input,181,FOLLOW_181_in_mapSize525);  
            stream_181.add(char_literal25);


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
            // 120:64: -> ^( MAPSIZE ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:67: ^( MAPSIZE ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSIZE, "MAPSIZE")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:77: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:1: mapSpawns : ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) ;
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
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:10: ( ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:4: ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:4: ( 'MAPSPAWNS' | 'mapspawns' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==100) ) {
                alt6=1;
            }
            else if ( (LA6_0==139) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:5: 'MAPSPAWNS'
                    {
                    string_literal26=(Token)match(input,100,FOLLOW_100_in_mapSpawns550);  
                    stream_100.add(string_literal26);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:19: 'mapspawns'
                    {
                    string_literal27=(Token)match(input,139,FOLLOW_139_in_mapSpawns554);  
                    stream_139.add(string_literal27);


                    }
                    break;

            }


            char_literal28=(Token)match(input,180,FOLLOW_180_in_mapSpawns557);  
            stream_180.add(char_literal28);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:36: ( stringList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==87) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:36: stringList
                    {
                    pushFollow(FOLLOW_stringList_in_mapSpawns559);
                    stringList29=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList29.getTree());

                    }
                    break;

            }


            char_literal30=(Token)match(input,181,FOLLOW_181_in_mapSpawns562);  
            stream_181.add(char_literal30);


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
            // 124:52: -> ^( MAPSPAWNS ( stringList )? )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:55: ^( MAPSPAWNS ( stringList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSPAWNS, "MAPSPAWNS")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:67: ( stringList )?
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:1: blockDecl : ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) ;
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
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:10: ( ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:4: ( 'BLOCK' | 'block' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:4: ( 'BLOCK' | 'block' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==95) ) {
                alt8=1;
            }
            else if ( (LA8_0==112) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:5: 'BLOCK'
                    {
                    string_literal31=(Token)match(input,95,FOLLOW_95_in_blockDecl587);  
                    stream_95.add(string_literal31);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:15: 'block'
                    {
                    string_literal32=(Token)match(input,112,FOLLOW_112_in_blockDecl591);  
                    stream_112.add(string_literal32);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_blockDecl594);
            varAssignment33=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment33.getTree());

            char_literal34=(Token)match(input,180,FOLLOW_180_in_blockDecl596);  
            stream_180.add(char_literal34);


            pushFollow(FOLLOW_properties_in_blockDecl598);
            properties35=properties();

            state._fsp--;

            stream_properties.add(properties35.getTree());

            char_literal36=(Token)match(input,181,FOLLOW_181_in_blockDecl600);  
            stream_181.add(char_literal36);


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
            // 128:57: -> ^( BLOCK varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:60: ^( BLOCK varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:1: portalDecl : ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) ;
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
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:11: ( ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:4: ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:4: ( 'PORTAL' | 'portal' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==102) ) {
                alt9=1;
            }
            else if ( (LA9_0==150) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:5: 'PORTAL'
                    {
                    string_literal37=(Token)match(input,102,FOLLOW_102_in_portalDecl626);  
                    stream_102.add(string_literal37);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:16: 'portal'
                    {
                    string_literal38=(Token)match(input,150,FOLLOW_150_in_portalDecl630);  
                    stream_150.add(string_literal38);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_portalDecl633);
            varAssignment39=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment39.getTree());

            char_literal40=(Token)match(input,180,FOLLOW_180_in_portalDecl635);  
            stream_180.add(char_literal40);


            pushFollow(FOLLOW_properties_in_portalDecl637);
            properties41=properties();

            state._fsp--;

            stream_properties.add(properties41.getTree());

            char_literal42=(Token)match(input,181,FOLLOW_181_in_portalDecl639);  
            stream_181.add(char_literal42);


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
            // 132:59: -> ^( PORTAL varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:62: ^( PORTAL varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:135:1: textureBlockDecl : ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) ;
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
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:135:17: ( ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt10=1;
                }
                break;
            case 170:
                {
                alt10=2;
                }
                break;
            case 169:
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:5: 'TEXTUREBLOCK'
                    {
                    string_literal43=(Token)match(input,105,FOLLOW_105_in_textureBlockDecl665);  
                    stream_105.add(string_literal43);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:22: 'textureblock'
                    {
                    string_literal44=(Token)match(input,170,FOLLOW_170_in_textureBlockDecl669);  
                    stream_170.add(string_literal44);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:39: 'textureBlock'
                    {
                    string_literal45=(Token)match(input,169,FOLLOW_169_in_textureBlockDecl673);  
                    stream_169.add(string_literal45);


                    }
                    break;

            }


            char_literal46=(Token)match(input,180,FOLLOW_180_in_textureBlockDecl676);  
            stream_180.add(char_literal46);


            pushFollow(FOLLOW_properties_in_textureBlockDecl678);
            properties47=properties();

            state._fsp--;

            stream_properties.add(properties47.getTree());

            char_literal48=(Token)match(input,181,FOLLOW_181_in_textureBlockDecl680);  
            stream_181.add(char_literal48);


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
            // 136:74: -> ^( TEXTUREBLOCK properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:77: ^( TEXTUREBLOCK properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:139:1: triggerDecl : ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) ;
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
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:139:12: ( ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:4: ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:4: ( 'TRIGGER' | 'trigger' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==106) ) {
                alt11=1;
            }
            else if ( (LA11_0==172) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:5: 'TRIGGER'
                    {
                    string_literal49=(Token)match(input,106,FOLLOW_106_in_triggerDecl704);  
                    stream_106.add(string_literal49);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:17: 'trigger'
                    {
                    string_literal50=(Token)match(input,172,FOLLOW_172_in_triggerDecl708);  
                    stream_172.add(string_literal50);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_triggerDecl711);
            requiredAssignment51=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment51.getTree());

            char_literal52=(Token)match(input,180,FOLLOW_180_in_triggerDecl713);  
            stream_180.add(char_literal52);


            pushFollow(FOLLOW_properties_in_triggerDecl715);
            properties53=properties();

            state._fsp--;

            stream_properties.add(properties53.getTree());

            char_literal54=(Token)match(input,181,FOLLOW_181_in_triggerDecl717);  
            stream_181.add(char_literal54);


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
            // 140:66: -> ^( TRIGGER requiredAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:69: ^( TRIGGER requiredAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:1: commandDecl : ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) ;
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
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:12: ( ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:4: ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:4: ( 'COMMAND' | 'command' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==96) ) {
                alt12=1;
            }
            else if ( (LA12_0==115) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:5: 'COMMAND'
                    {
                    string_literal55=(Token)match(input,96,FOLLOW_96_in_commandDecl743);  
                    stream_96.add(string_literal55);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:17: 'command'
                    {
                    string_literal56=(Token)match(input,115,FOLLOW_115_in_commandDecl747);  
                    stream_115.add(string_literal56);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_commandDecl750);
            requiredAssignment57=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment57.getTree());

            char_literal58=(Token)match(input,180,FOLLOW_180_in_commandDecl752);  
            stream_180.add(char_literal58);


            pushFollow(FOLLOW_triggerEffectList_in_commandDecl754);
            triggerEffectList59=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList59.getTree());

            char_literal60=(Token)match(input,181,FOLLOW_181_in_commandDecl756);  
            stream_181.add(char_literal60);


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
            // 144:73: -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:76: ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COMMAND, "COMMAND")
                , root_1);

                adaptor.addChild(root_1, stream_requiredAssignment.nextTree());

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:105: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:1: talkDecl : ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) ;
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
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:9: ( ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:148:4: ( 'TALK' | 'talk' ) '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:148:4: ( 'TALK' | 'talk' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==104) ) {
                alt13=1;
            }
            else if ( (LA13_0==164) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:148:5: 'TALK'
                    {
                    string_literal61=(Token)match(input,104,FOLLOW_104_in_talkDecl786);  
                    stream_104.add(string_literal61);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:148:14: 'talk'
                    {
                    string_literal62=(Token)match(input,164,FOLLOW_164_in_talkDecl790);  
                    stream_164.add(string_literal62);


                    }
                    break;

            }


            char_literal63=(Token)match(input,180,FOLLOW_180_in_talkDecl793);  
            stream_180.add(char_literal63);


            pushFollow(FOLLOW_properties_in_talkDecl795);
            properties64=properties();

            state._fsp--;

            stream_properties.add(properties64.getTree());

            char_literal65=(Token)match(input,181,FOLLOW_181_in_talkDecl797);  
            stream_181.add(char_literal65);


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
            // 148:41: -> ^( TALK properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:148:44: ^( TALK properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:1: properties : ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )* ;
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

        AtrophyScriptParser.optionProperty_return optionProperty76 =null;

        AtrophyScriptParser.topicProperty_return topicProperty77 =null;

        AtrophyScriptParser.triggerCondProperty_return triggerCondProperty78 =null;

        AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty79 =null;

        AtrophyScriptParser.coverDecl_return coverDecl80 =null;

        AtrophyScriptParser.stashDecl_return stashDecl81 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:11: ( ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:152:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:152:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )*
            loop14:
            do {
                int alt14=17;
                switch ( input.LA(1) ) {
                case 177:
                    {
                    alt14=1;
                    }
                    break;
                case 178:
                    {
                    alt14=2;
                    }
                    break;
                case 168:
                    {
                    alt14=3;
                    }
                    break;
                case 179:
                    {
                    alt14=4;
                    }
                    break;
                case 156:
                    {
                    alt14=5;
                    }
                    break;
                case 155:
                case 159:
                    {
                    alt14=6;
                    }
                    break;
                case 160:
                    {
                    alt14=7;
                    }
                    break;
                case 148:
                case 149:
                    {
                    alt14=8;
                    }
                    break;
                case 107:
                case 109:
                    {
                    alt14=9;
                    }
                    break;
                case 143:
                case 145:
                case 146:
                    {
                    alt14=10;
                    }
                    break;
                case 134:
                case 147:
                    {
                    alt14=11;
                    }
                    break;
                case 163:
                case 171:
                    {
                    alt14=12;
                    }
                    break;
                case 165:
                case 173:
                    {
                    alt14=13;
                    }
                    break;
                case 166:
                case 174:
                    {
                    alt14=14;
                    }
                    break;
                case 97:
                case 118:
                    {
                    alt14=15;
                    }
                    break;
                case 103:
                case 161:
                    {
                    alt14=16;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:152:5: xListProperty
            	    {
            	    pushFollow(FOLLOW_xListProperty_in_properties821);
            	    xListProperty66=xListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xListProperty66.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:153:6: yListProperty
            	    {
            	    pushFollow(FOLLOW_yListProperty_in_properties828);
            	    yListProperty67=yListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, yListProperty67.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:6: factionTerritoryProperty
            	    {
            	    pushFollow(FOLLOW_factionTerritoryProperty_in_properties835);
            	    factionTerritoryProperty68=factionTerritoryProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionTerritoryProperty68.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:6: factionZoneProperty
            	    {
            	    pushFollow(FOLLOW_factionZoneProperty_in_properties842);
            	    factionZoneProperty69=factionZoneProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionZoneProperty69.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:156:6: saferoomProperty
            	    {
            	    pushFollow(FOLLOW_saferoomProperty_in_properties849);
            	    saferoomProperty70=saferoomProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, saferoomProperty70.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:157:6: stageProperty
            	    {
            	    pushFollow(FOLLOW_stageProperty_in_properties856);
            	    stageProperty71=stageProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageProperty71.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:6: stageDeclProperty
            	    {
            	    pushFollow(FOLLOW_stageDeclProperty_in_properties863);
            	    stageDeclProperty72=stageDeclProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageDeclProperty72.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:6: talkMapParentProperty
            	    {
            	    pushFollow(FOLLOW_talkMapParentProperty_in_properties870);
            	    talkMapParentProperty73=talkMapParentProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, talkMapParentProperty73.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:160:6: aiInitProperty
            	    {
            	    pushFollow(FOLLOW_aiInitProperty_in_properties877);
            	    aiInitProperty74=aiInitProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiInitProperty74.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:161:6: openingLineProperty
            	    {
            	    pushFollow(FOLLOW_openingLineProperty_in_properties884);
            	    openingLineProperty75=openingLineProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, openingLineProperty75.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:6: optionProperty
            	    {
            	    pushFollow(FOLLOW_optionProperty_in_properties891);
            	    optionProperty76=optionProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, optionProperty76.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:6: topicProperty
            	    {
            	    pushFollow(FOLLOW_topicProperty_in_properties898);
            	    topicProperty77=topicProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicProperty77.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:164:6: triggerCondProperty
            	    {
            	    pushFollow(FOLLOW_triggerCondProperty_in_properties905);
            	    triggerCondProperty78=triggerCondProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerCondProperty78.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:165:6: triggerEffectProperty
            	    {
            	    pushFollow(FOLLOW_triggerEffectProperty_in_properties912);
            	    triggerEffectProperty79=triggerEffectProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffectProperty79.getTree());

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:6: coverDecl
            	    {
            	    pushFollow(FOLLOW_coverDecl_in_properties919);
            	    coverDecl80=coverDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, coverDecl80.getTree());

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:6: stashDecl
            	    {
            	    pushFollow(FOLLOW_stashDecl_in_properties926);
            	    stashDecl81=stashDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stashDecl81.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:1: xListProperty : 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) ;
    public final AtrophyScriptParser.xListProperty_return xListProperty() throws RecognitionException {
        AtrophyScriptParser.xListProperty_return retval = new AtrophyScriptParser.xListProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal82=null;
        Token INT83=null;
        Token char_literal84=null;
        Token INT85=null;

        CommonTree string_literal82_tree=null;
        CommonTree INT83_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree INT85_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:14: ( 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:4: 'x:' INT ( ',' INT )*
            {
            string_literal82=(Token)match(input,177,FOLLOW_177_in_xListProperty943);  
            stream_177.add(string_literal82);


            INT83=(Token)match(input,INT,FOLLOW_INT_in_xListProperty945);  
            stream_INT.add(INT83);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:13: ( ',' INT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==91) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:14: ',' INT
            	    {
            	    char_literal84=(Token)match(input,91,FOLLOW_91_in_xListProperty948);  
            	    stream_91.add(char_literal84);


            	    INT85=(Token)match(input,INT,FOLLOW_INT_in_xListProperty949);  
            	    stream_INT.add(INT85);


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
            // 171:23: -> ^( XLIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:26: ^( XLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(XLIST, "XLIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:34: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:1: yListProperty : 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) ;
    public final AtrophyScriptParser.yListProperty_return yListProperty() throws RecognitionException {
        AtrophyScriptParser.yListProperty_return retval = new AtrophyScriptParser.yListProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal86=null;
        Token INT87=null;
        Token char_literal88=null;
        Token INT89=null;

        CommonTree string_literal86_tree=null;
        CommonTree INT87_tree=null;
        CommonTree char_literal88_tree=null;
        CommonTree INT89_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:14: ( 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:4: 'y:' INT ( ',' INT )*
            {
            string_literal86=(Token)match(input,178,FOLLOW_178_in_yListProperty973);  
            stream_178.add(string_literal86);


            INT87=(Token)match(input,INT,FOLLOW_INT_in_yListProperty975);  
            stream_INT.add(INT87);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:13: ( ',' INT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==91) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:14: ',' INT
            	    {
            	    char_literal88=(Token)match(input,91,FOLLOW_91_in_yListProperty978);  
            	    stream_91.add(char_literal88);


            	    INT89=(Token)match(input,INT,FOLLOW_INT_in_yListProperty979);  
            	    stream_INT.add(INT89);


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
            // 175:23: -> ^( YLIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:26: ^( YLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(YLIST, "YLIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:34: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:1: factionTerritoryProperty : 'territory:' stringLiteral INT -> ^( TERRITORY stringLiteral INT ) ;
    public final AtrophyScriptParser.factionTerritoryProperty_return factionTerritoryProperty() throws RecognitionException {
        AtrophyScriptParser.factionTerritoryProperty_return retval = new AtrophyScriptParser.factionTerritoryProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal90=null;
        Token INT92=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral91 =null;


        CommonTree string_literal90_tree=null;
        CommonTree INT92_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:25: ( 'territory:' stringLiteral INT -> ^( TERRITORY stringLiteral INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:4: 'territory:' stringLiteral INT
            {
            string_literal90=(Token)match(input,168,FOLLOW_168_in_factionTerritoryProperty1005);  
            stream_168.add(string_literal90);


            pushFollow(FOLLOW_stringLiteral_in_factionTerritoryProperty1007);
            stringLiteral91=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral91.getTree());

            INT92=(Token)match(input,INT,FOLLOW_INT_in_factionTerritoryProperty1009);  
            stream_INT.add(INT92);


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
            // 179:35: -> ^( TERRITORY stringLiteral INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:38: ^( TERRITORY stringLiteral INT )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:1: factionZoneProperty : 'zone:' stringList -> ^( ZONE stringList ) ;
    public final AtrophyScriptParser.factionZoneProperty_return factionZoneProperty() throws RecognitionException {
        AtrophyScriptParser.factionZoneProperty_return retval = new AtrophyScriptParser.factionZoneProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal93=null;
        AtrophyScriptParser.stringList_return stringList94 =null;


        CommonTree string_literal93_tree=null;
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:20: ( 'zone:' stringList -> ^( ZONE stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:4: 'zone:' stringList
            {
            string_literal93=(Token)match(input,179,FOLLOW_179_in_factionZoneProperty1034);  
            stream_179.add(string_literal93);


            pushFollow(FOLLOW_stringList_in_factionZoneProperty1036);
            stringList94=stringList();

            state._fsp--;

            stream_stringList.add(stringList94.getTree());

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
            // 183:23: -> ^( ZONE stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:26: ^( ZONE stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:1: saferoomProperty : 'saferoom' -> ^( SAFEROOM ) ;
    public final AtrophyScriptParser.saferoomProperty_return saferoomProperty() throws RecognitionException {
        AtrophyScriptParser.saferoomProperty_return retval = new AtrophyScriptParser.saferoomProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal95=null;

        CommonTree string_literal95_tree=null;
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:17: ( 'saferoom' -> ^( SAFEROOM ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:4: 'saferoom'
            {
            string_literal95=(Token)match(input,156,FOLLOW_156_in_saferoomProperty1059);  
            stream_156.add(string_literal95);


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
            // 187:15: -> ^( SAFEROOM )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:18: ^( SAFEROOM )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:190:1: stageDeclProperty : 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) ;
    public final AtrophyScriptParser.stageDeclProperty_return stageDeclProperty() throws RecognitionException {
        AtrophyScriptParser.stageDeclProperty_return retval = new AtrophyScriptParser.stageDeclProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal96=null;
        Token INT97=null;
        Token char_literal98=null;
        Token INT99=null;

        CommonTree string_literal96_tree=null;
        CommonTree INT97_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree INT99_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:190:18: ( 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:4: 'stages:' INT ( ',' INT )*
            {
            string_literal96=(Token)match(input,160,FOLLOW_160_in_stageDeclProperty1080);  
            stream_160.add(string_literal96);


            INT97=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1082);  
            stream_INT.add(INT97);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:18: ( ',' INT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==91) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:19: ',' INT
            	    {
            	    char_literal98=(Token)match(input,91,FOLLOW_91_in_stageDeclProperty1085);  
            	    stream_91.add(char_literal98);


            	    INT99=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1087);  
            	    stream_INT.add(INT99);


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
            // 191:29: -> ^( STAGELIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:32: ^( STAGELIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STAGELIST, "STAGELIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:44: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:194:1: talkMapParentProperty : ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) ;
    public final AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty() throws RecognitionException {
        AtrophyScriptParser.talkMapParentProperty_return retval = new AtrophyScriptParser.talkMapParentProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal100=null;
        Token string_literal101=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral102 =null;


        CommonTree string_literal100_tree=null;
        CommonTree string_literal101_tree=null;
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:194:22: ( ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:4: ( 'parent:' | 'p:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:4: ( 'parent:' | 'p:' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==149) ) {
                alt18=1;
            }
            else if ( (LA18_0==148) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:5: 'parent:'
                    {
                    string_literal100=(Token)match(input,149,FOLLOW_149_in_talkMapParentProperty1114);  
                    stream_149.add(string_literal100);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:17: 'p:'
                    {
                    string_literal101=(Token)match(input,148,FOLLOW_148_in_talkMapParentProperty1118);  
                    stream_148.add(string_literal101);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_talkMapParentProperty1121);
            stringLiteral102=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral102.getTree());

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
            // 195:37: -> ^( TALKPARENT stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:40: ^( TALKPARENT stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:198:1: stageProperty : ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) ;
    public final AtrophyScriptParser.stageProperty_return stageProperty() throws RecognitionException {
        AtrophyScriptParser.stageProperty_return retval = new AtrophyScriptParser.stageProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal103=null;
        Token string_literal104=null;
        Token INT105=null;

        CommonTree string_literal103_tree=null;
        CommonTree string_literal104_tree=null;
        CommonTree INT105_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:198:14: ( ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:4: ( 'stage:' | 's:' ) INT
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:4: ( 'stage:' | 's:' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==159) ) {
                alt19=1;
            }
            else if ( (LA19_0==155) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:5: 'stage:'
                    {
                    string_literal103=(Token)match(input,159,FOLLOW_159_in_stageProperty1145);  
                    stream_159.add(string_literal103);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:16: 's:'
                    {
                    string_literal104=(Token)match(input,155,FOLLOW_155_in_stageProperty1149);  
                    stream_155.add(string_literal104);


                    }
                    break;

            }


            INT105=(Token)match(input,INT,FOLLOW_INT_in_stageProperty1152);  
            stream_INT.add(INT105);


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
            // 199:26: -> ^( TALKSTAGE INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:29: ^( TALKSTAGE INT )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:1: aiInitProperty : ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) ;
    public final AtrophyScriptParser.aiInitProperty_return aiInitProperty() throws RecognitionException {
        AtrophyScriptParser.aiInitProperty_return retval = new AtrophyScriptParser.aiInitProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal106=null;
        Token string_literal107=null;
        Token BOOL108=null;

        CommonTree string_literal106_tree=null;
        CommonTree string_literal107_tree=null;
        CommonTree BOOL108_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:15: ( ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:203:4: ( 'aiInit:' | 'a:' ) BOOL
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:203:4: ( 'aiInit:' | 'a:' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==109) ) {
                alt20=1;
            }
            else if ( (LA20_0==107) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:203:5: 'aiInit:'
                    {
                    string_literal106=(Token)match(input,109,FOLLOW_109_in_aiInitProperty1176);  
                    stream_109.add(string_literal106);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:203:17: 'a:'
                    {
                    string_literal107=(Token)match(input,107,FOLLOW_107_in_aiInitProperty1180);  
                    stream_107.add(string_literal107);


                    }
                    break;

            }


            BOOL108=(Token)match(input,BOOL,FOLLOW_BOOL_in_aiInitProperty1183);  
            stream_BOOL.add(BOOL108);


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
            // 203:28: -> ^( AIINIT BOOL )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:203:31: ^( AIINIT BOOL )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:1: openingLineProperty : ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) ;
    public final AtrophyScriptParser.openingLineProperty_return openingLineProperty() throws RecognitionException {
        AtrophyScriptParser.openingLineProperty_return retval = new AtrophyScriptParser.openingLineProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal109=null;
        Token string_literal110=null;
        Token string_literal111=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral112 =null;


        CommonTree string_literal109_tree=null;
        CommonTree string_literal110_tree=null;
        CommonTree string_literal111_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:20: ( ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:207:4: ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:207:4: ( 'o:' | 'opening:' | 'openingLine:' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 143:
                {
                alt21=1;
                }
                break;
            case 145:
                {
                alt21=2;
                }
                break;
            case 146:
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:207:5: 'o:'
                    {
                    string_literal109=(Token)match(input,143,FOLLOW_143_in_openingLineProperty1207);  
                    stream_143.add(string_literal109);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:207:12: 'opening:'
                    {
                    string_literal110=(Token)match(input,145,FOLLOW_145_in_openingLineProperty1211);  
                    stream_145.add(string_literal110);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:207:25: 'openingLine:'
                    {
                    string_literal111=(Token)match(input,146,FOLLOW_146_in_openingLineProperty1215);  
                    stream_146.add(string_literal111);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_openingLineProperty1218);
            stringLiteral112=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral112.getTree());

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
            // 207:55: -> ^( OPENINGLINE stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:207:58: ^( OPENINGLINE stringLiteral )
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


    public static class optionProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optionProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:1: optionProperty : ( 'l:' | 'option:' ) stringLiteral -> ^( OPTION stringLiteral ) ;
    public final AtrophyScriptParser.optionProperty_return optionProperty() throws RecognitionException {
        AtrophyScriptParser.optionProperty_return retval = new AtrophyScriptParser.optionProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal113=null;
        Token string_literal114=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral115 =null;


        CommonTree string_literal113_tree=null;
        CommonTree string_literal114_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:15: ( ( 'l:' | 'option:' ) stringLiteral -> ^( OPTION stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:211:4: ( 'l:' | 'option:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:211:4: ( 'l:' | 'option:' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==134) ) {
                alt22=1;
            }
            else if ( (LA22_0==147) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:211:5: 'l:'
                    {
                    string_literal113=(Token)match(input,134,FOLLOW_134_in_optionProperty1240);  
                    stream_134.add(string_literal113);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:211:12: 'option:'
                    {
                    string_literal114=(Token)match(input,147,FOLLOW_147_in_optionProperty1244);  
                    stream_147.add(string_literal114);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_optionProperty1247);
            stringLiteral115=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral115.getTree());

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
            // 211:37: -> ^( OPTION stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:211:40: ^( OPTION stringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(OPTION, "OPTION")
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
    // $ANTLR end "optionProperty"


    public static class topicProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topicProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:1: topicProperty : ( 't:' | 'topic' ) requiredAssignment '{' topicProperties '}' -> ^( TOPIC requiredAssignment topicProperties ) ;
    public final AtrophyScriptParser.topicProperty_return topicProperty() throws RecognitionException {
        AtrophyScriptParser.topicProperty_return retval = new AtrophyScriptParser.topicProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal116=null;
        Token string_literal117=null;
        Token char_literal119=null;
        Token char_literal121=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment118 =null;

        AtrophyScriptParser.topicProperties_return topicProperties120 =null;


        CommonTree string_literal116_tree=null;
        CommonTree string_literal117_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree char_literal121_tree=null;
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_topicProperties=new RewriteRuleSubtreeStream(adaptor,"rule topicProperties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:14: ( ( 't:' | 'topic' ) requiredAssignment '{' topicProperties '}' -> ^( TOPIC requiredAssignment topicProperties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:215:4: ( 't:' | 'topic' ) requiredAssignment '{' topicProperties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:215:4: ( 't:' | 'topic' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==163) ) {
                alt23=1;
            }
            else if ( (LA23_0==171) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:215:5: 't:'
                    {
                    string_literal116=(Token)match(input,163,FOLLOW_163_in_topicProperty1271);  
                    stream_163.add(string_literal116);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:215:12: 'topic'
                    {
                    string_literal117=(Token)match(input,171,FOLLOW_171_in_topicProperty1275);  
                    stream_171.add(string_literal117);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_topicProperty1278);
            requiredAssignment118=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment118.getTree());

            char_literal119=(Token)match(input,180,FOLLOW_180_in_topicProperty1280);  
            stream_180.add(char_literal119);


            pushFollow(FOLLOW_topicProperties_in_topicProperty1282);
            topicProperties120=topicProperties();

            state._fsp--;

            stream_topicProperties.add(topicProperties120.getTree());

            char_literal121=(Token)match(input,181,FOLLOW_181_in_topicProperty1284);  
            stream_181.add(char_literal121);


            // AST REWRITE
            // elements: topicProperties, requiredAssignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 215:64: -> ^( TOPIC requiredAssignment topicProperties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:215:67: ^( TOPIC requiredAssignment topicProperties )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOPIC, "TOPIC")
                , root_1);

                adaptor.addChild(root_1, stream_requiredAssignment.nextTree());

                adaptor.addChild(root_1, stream_topicProperties.nextTree());

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
    // $ANTLR end "topicProperty"


    public static class topicProperties_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topicProperties"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:1: topicProperties : ( topicLine | topicRequiement )* ;
    public final AtrophyScriptParser.topicProperties_return topicProperties() throws RecognitionException {
        AtrophyScriptParser.topicProperties_return retval = new AtrophyScriptParser.topicProperties_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.topicLine_return topicLine122 =null;

        AtrophyScriptParser.topicRequiement_return topicRequiement123 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:16: ( ( topicLine | topicRequiement )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:219:4: ( topicLine | topicRequiement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:219:4: ( topicLine | topicRequiement )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==135) ) {
                    alt24=1;
                }
                else if ( (LA24_0==154) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:219:5: topicLine
            	    {
            	    pushFollow(FOLLOW_topicLine_in_topicProperties1311);
            	    topicLine122=topicLine();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicLine122.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:219:17: topicRequiement
            	    {
            	    pushFollow(FOLLOW_topicRequiement_in_topicProperties1315);
            	    topicRequiement123=topicRequiement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicRequiement123.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "topicProperties"


    public static class topicLine_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topicLine"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:1: topicLine : 'lines:' stringLiteral ( ',' stringLiteral )* -> ( ^( LINE stringLiteral ) )* ;
    public final AtrophyScriptParser.topicLine_return topicLine() throws RecognitionException {
        AtrophyScriptParser.topicLine_return retval = new AtrophyScriptParser.topicLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal124=null;
        Token char_literal126=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral125 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral127 =null;


        CommonTree string_literal124_tree=null;
        CommonTree char_literal126_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:10: ( 'lines:' stringLiteral ( ',' stringLiteral )* -> ( ^( LINE stringLiteral ) )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:223:4: 'lines:' stringLiteral ( ',' stringLiteral )*
            {
            string_literal124=(Token)match(input,135,FOLLOW_135_in_topicLine1332);  
            stream_135.add(string_literal124);


            pushFollow(FOLLOW_stringLiteral_in_topicLine1333);
            stringLiteral125=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral125.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:223:26: ( ',' stringLiteral )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==91) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:223:27: ',' stringLiteral
            	    {
            	    char_literal126=(Token)match(input,91,FOLLOW_91_in_topicLine1336);  
            	    stream_91.add(char_literal126);


            	    pushFollow(FOLLOW_stringLiteral_in_topicLine1338);
            	    stringLiteral127=stringLiteral();

            	    state._fsp--;

            	    stream_stringLiteral.add(stringLiteral127.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
            // 223:47: -> ( ^( LINE stringLiteral ) )*
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:223:50: ( ^( LINE stringLiteral ) )*
                while ( stream_stringLiteral.hasNext() ) {
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:223:50: ^( LINE stringLiteral )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(LINE, "LINE")
                    , root_1);

                    adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_stringLiteral.reset();

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
    // $ANTLR end "topicLine"


    public static class topicRequiement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topicRequiement"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:1: topicRequiement : 'req:' reqString ( ',' reqString )* -> ( ^( REQ reqString ) )* ;
    public final AtrophyScriptParser.topicRequiement_return topicRequiement() throws RecognitionException {
        AtrophyScriptParser.topicRequiement_return retval = new AtrophyScriptParser.topicRequiement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal128=null;
        Token char_literal130=null;
        AtrophyScriptParser.reqString_return reqString129 =null;

        AtrophyScriptParser.reqString_return reqString131 =null;


        CommonTree string_literal128_tree=null;
        CommonTree char_literal130_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_reqString=new RewriteRuleSubtreeStream(adaptor,"rule reqString");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:16: ( 'req:' reqString ( ',' reqString )* -> ( ^( REQ reqString ) )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:227:4: 'req:' reqString ( ',' reqString )*
            {
            string_literal128=(Token)match(input,154,FOLLOW_154_in_topicRequiement1364);  
            stream_154.add(string_literal128);


            pushFollow(FOLLOW_reqString_in_topicRequiement1366);
            reqString129=reqString();

            state._fsp--;

            stream_reqString.add(reqString129.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:227:21: ( ',' reqString )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==91) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:227:22: ',' reqString
            	    {
            	    char_literal130=(Token)match(input,91,FOLLOW_91_in_topicRequiement1369);  
            	    stream_91.add(char_literal130);


            	    pushFollow(FOLLOW_reqString_in_topicRequiement1371);
            	    reqString131=reqString();

            	    state._fsp--;

            	    stream_reqString.add(reqString131.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            // AST REWRITE
            // elements: reqString
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 227:38: -> ( ^( REQ reqString ) )*
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:227:41: ( ^( REQ reqString ) )*
                while ( stream_reqString.hasNext() ) {
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:227:41: ^( REQ reqString )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(REQ, "REQ")
                    , root_1);

                    adaptor.addChild(root_1, stream_reqString.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_reqString.reset();

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
    // $ANTLR end "topicRequiement"


    public static class reqString_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "reqString"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:1: reqString : ( NOT_PREFIX stringLiteral -> ^( NEGATION stringLiteral ) | stringLiteral );
    public final AtrophyScriptParser.reqString_return reqString() throws RecognitionException {
        AtrophyScriptParser.reqString_return retval = new AtrophyScriptParser.reqString_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NOT_PREFIX132=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral133 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral134 =null;


        CommonTree NOT_PREFIX132_tree=null;
        RewriteRuleTokenStream stream_NOT_PREFIX=new RewriteRuleTokenStream(adaptor,"token NOT_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:10: ( NOT_PREFIX stringLiteral -> ^( NEGATION stringLiteral ) | stringLiteral )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==NOT_PREFIX) ) {
                alt27=1;
            }
            else if ( (LA27_0==87) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:231:4: NOT_PREFIX stringLiteral
                    {
                    NOT_PREFIX132=(Token)match(input,NOT_PREFIX,FOLLOW_NOT_PREFIX_in_reqString1397);  
                    stream_NOT_PREFIX.add(NOT_PREFIX132);


                    pushFollow(FOLLOW_stringLiteral_in_reqString1399);
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
                    // 231:29: -> ^( NEGATION stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:231:32: ^( NEGATION stringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NEGATION, "NEGATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:232:6: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stringLiteral_in_reqString1414);
                    stringLiteral134=stringLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, stringLiteral134.getTree());

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
    // $ANTLR end "reqString"


    public static class aliveQuery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aliveQuery"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:235:1: aliveQuery : 'isAlive:' unitInfo -> ^( ISALIVE unitInfo ) ;
    public final AtrophyScriptParser.aliveQuery_return aliveQuery() throws RecognitionException {
        AtrophyScriptParser.aliveQuery_return retval = new AtrophyScriptParser.aliveQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal135=null;
        AtrophyScriptParser.unitInfo_return unitInfo136 =null;


        CommonTree string_literal135_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:235:11: ( 'isAlive:' unitInfo -> ^( ISALIVE unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:236:4: 'isAlive:' unitInfo
            {
            string_literal135=(Token)match(input,125,FOLLOW_125_in_aliveQuery1429);  
            stream_125.add(string_literal135);


            pushFollow(FOLLOW_unitInfo_in_aliveQuery1431);
            unitInfo136=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo136.getTree());

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
            // 236:24: -> ^( ISALIVE unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:236:27: ^( ISALIVE unitInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ISALIVE, "ISALIVE")
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
    // $ANTLR end "aliveQuery"


    public static class timeQuery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeQuery"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:239:1: timeQuery : 'onTime:' INT -> ^( ONTIME INT ) ;
    public final AtrophyScriptParser.timeQuery_return timeQuery() throws RecognitionException {
        AtrophyScriptParser.timeQuery_return retval = new AtrophyScriptParser.timeQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal137=null;
        Token INT138=null;

        CommonTree string_literal137_tree=null;
        CommonTree INT138_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:239:10: ( 'onTime:' INT -> ^( ONTIME INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:240:4: 'onTime:' INT
            {
            string_literal137=(Token)match(input,144,FOLLOW_144_in_timeQuery1454);  
            stream_144.add(string_literal137);


            INT138=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1456);  
            stream_INT.add(INT138);


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
            // 240:18: -> ^( ONTIME INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:240:21: ^( ONTIME INT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ONTIME, "ONTIME")
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
    // $ANTLR end "timeQuery"


    public static class boolQuery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolQuery"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:243:1: boolQuery : ( '(' ! queryLogic ')' !| aliveQuery | timeQuery );
    public final AtrophyScriptParser.boolQuery_return boolQuery() throws RecognitionException {
        AtrophyScriptParser.boolQuery_return retval = new AtrophyScriptParser.boolQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal139=null;
        Token char_literal141=null;
        AtrophyScriptParser.queryLogic_return queryLogic140 =null;

        AtrophyScriptParser.aliveQuery_return aliveQuery142 =null;

        AtrophyScriptParser.timeQuery_return timeQuery143 =null;


        CommonTree char_literal139_tree=null;
        CommonTree char_literal141_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:243:10: ( '(' ! queryLogic ')' !| aliveQuery | timeQuery )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt28=1;
                }
                break;
            case 125:
                {
                alt28=2;
                }
                break;
            case 144:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:244:3: '(' ! queryLogic ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal139=(Token)match(input,89,FOLLOW_89_in_boolQuery1476); 

                    pushFollow(FOLLOW_queryLogic_in_boolQuery1479);
                    queryLogic140=queryLogic();

                    state._fsp--;

                    adaptor.addChild(root_0, queryLogic140.getTree());

                    char_literal141=(Token)match(input,90,FOLLOW_90_in_boolQuery1481); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:5: aliveQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_aliveQuery_in_boolQuery1488);
                    aliveQuery142=aliveQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, aliveQuery142.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:5: timeQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeQuery_in_boolQuery1494);
                    timeQuery143=timeQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, timeQuery143.getTree());

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
    // $ANTLR end "boolQuery"


    public static class queryNegation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "queryNegation"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:1: queryNegation : ( boolQuery | '-' boolQuery -> ^( NEGATION boolQuery ) );
    public final AtrophyScriptParser.queryNegation_return queryNegation() throws RecognitionException {
        AtrophyScriptParser.queryNegation_return retval = new AtrophyScriptParser.queryNegation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal145=null;
        AtrophyScriptParser.boolQuery_return boolQuery144 =null;

        AtrophyScriptParser.boolQuery_return boolQuery146 =null;


        CommonTree char_literal145_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_boolQuery=new RewriteRuleSubtreeStream(adaptor,"rule boolQuery");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:14: ( boolQuery | '-' boolQuery -> ^( NEGATION boolQuery ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==89||LA29_0==125||LA29_0==144) ) {
                alt29=1;
            }
            else if ( (LA29_0==92) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:3: boolQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_boolQuery_in_queryNegation1508);
                    boolQuery144=boolQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, boolQuery144.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:251:4: '-' boolQuery
                    {
                    char_literal145=(Token)match(input,92,FOLLOW_92_in_queryNegation1513);  
                    stream_92.add(char_literal145);


                    pushFollow(FOLLOW_boolQuery_in_queryNegation1515);
                    boolQuery146=boolQuery();

                    state._fsp--;

                    stream_boolQuery.add(boolQuery146.getTree());

                    // AST REWRITE
                    // elements: boolQuery
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 251:18: -> ^( NEGATION boolQuery )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:251:21: ^( NEGATION boolQuery )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NEGATION, "NEGATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_boolQuery.nextTree());

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
    // $ANTLR end "queryNegation"


    public static class queryLogic_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "queryLogic"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:1: queryLogic : b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) ) ;
    public final AtrophyScriptParser.queryLogic_return queryLogic() throws RecognitionException {
        AtrophyScriptParser.queryLogic_return retval = new AtrophyScriptParser.queryLogic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal147=null;
        Token string_literal148=null;
        AtrophyScriptParser.queryNegation_return b1 =null;

        AtrophyScriptParser.queryNegation_return b2 =null;


        CommonTree string_literal147_tree=null;
        CommonTree string_literal148_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_queryNegation=new RewriteRuleSubtreeStream(adaptor,"rule queryNegation");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:11: (b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:255:3: b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) )
            {
            pushFollow(FOLLOW_queryNegation_in_queryLogic1539);
            b1=queryNegation();

            state._fsp--;

            stream_queryNegation.add(b1.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:256:3: ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt30=1;
                }
                break;
            case 101:
                {
                alt30=2;
                }
                break;
            case 90:
            case 181:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:256:4: 'AND' b2= queryNegation
                    {
                    string_literal147=(Token)match(input,94,FOLLOW_94_in_queryLogic1544);  
                    stream_94.add(string_literal147);


                    pushFollow(FOLLOW_queryNegation_in_queryLogic1548);
                    b2=queryNegation();

                    state._fsp--;

                    stream_queryNegation.add(b2.getTree());

                    // AST REWRITE
                    // elements: b2, b1
                    // token labels: 
                    // rule labels: retval, b1, b2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b1=new RewriteRuleSubtreeStream(adaptor,"rule b1",b1!=null?b1.tree:null);
                    RewriteRuleSubtreeStream stream_b2=new RewriteRuleSubtreeStream(adaptor,"rule b2",b2!=null?b2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 256:27: -> ^( AND $b1 $b2)
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:256:30: ^( AND $b1 $b2)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(AND, "AND")
                        , root_1);

                        adaptor.addChild(root_1, stream_b1.nextTree());

                        adaptor.addChild(root_1, stream_b2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:4: 'OR' b2= queryNegation
                    {
                    string_literal148=(Token)match(input,101,FOLLOW_101_in_queryLogic1565);  
                    stream_101.add(string_literal148);


                    pushFollow(FOLLOW_queryNegation_in_queryLogic1569);
                    b2=queryNegation();

                    state._fsp--;

                    stream_queryNegation.add(b2.getTree());

                    // AST REWRITE
                    // elements: b2, b1
                    // token labels: 
                    // rule labels: retval, b1, b2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b1=new RewriteRuleSubtreeStream(adaptor,"rule b1",b1!=null?b1.tree:null);
                    RewriteRuleSubtreeStream stream_b2=new RewriteRuleSubtreeStream(adaptor,"rule b2",b2!=null?b2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 257:26: -> ^( OR $b1 $b2)
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:29: ^( OR $b1 $b2)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(OR, "OR")
                        , root_1);

                        adaptor.addChild(root_1, stream_b1.nextTree());

                        adaptor.addChild(root_1, stream_b2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:5: 
                    {
                    // AST REWRITE
                    // elements: b1
                    // token labels: 
                    // rule labels: retval, b1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b1=new RewriteRuleSubtreeStream(adaptor,"rule b1",b1!=null?b1.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 258:5: -> ^( LOGIC $b1)
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:8: ^( LOGIC $b1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOGIC, "LOGIC")
                        , root_1);

                        adaptor.addChild(root_1, stream_b1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


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
    // $ANTLR end "queryLogic"


    public static class triggerCondProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerCondProperty"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:1: triggerCondProperty : ( 'tc' | 'triggerCond' ) '{' queryLogic '}' -> ^( TRIGGERCOND queryLogic ) ;
    public final AtrophyScriptParser.triggerCondProperty_return triggerCondProperty() throws RecognitionException {
        AtrophyScriptParser.triggerCondProperty_return retval = new AtrophyScriptParser.triggerCondProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal149=null;
        Token string_literal150=null;
        Token char_literal151=null;
        Token char_literal153=null;
        AtrophyScriptParser.queryLogic_return queryLogic152 =null;


        CommonTree string_literal149_tree=null;
        CommonTree string_literal150_tree=null;
        CommonTree char_literal151_tree=null;
        CommonTree char_literal153_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_queryLogic=new RewriteRuleSubtreeStream(adaptor,"rule queryLogic");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:20: ( ( 'tc' | 'triggerCond' ) '{' queryLogic '}' -> ^( TRIGGERCOND queryLogic ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:4: ( 'tc' | 'triggerCond' ) '{' queryLogic '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:4: ( 'tc' | 'triggerCond' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==165) ) {
                alt31=1;
            }
            else if ( (LA31_0==173) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:5: 'tc'
                    {
                    string_literal149=(Token)match(input,165,FOLLOW_165_in_triggerCondProperty1609);  
                    stream_165.add(string_literal149);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:12: 'triggerCond'
                    {
                    string_literal150=(Token)match(input,173,FOLLOW_173_in_triggerCondProperty1613);  
                    stream_173.add(string_literal150);


                    }
                    break;

            }


            char_literal151=(Token)match(input,180,FOLLOW_180_in_triggerCondProperty1616);  
            stream_180.add(char_literal151);


            pushFollow(FOLLOW_queryLogic_in_triggerCondProperty1618);
            queryLogic152=queryLogic();

            state._fsp--;

            stream_queryLogic.add(queryLogic152.getTree());

            char_literal153=(Token)match(input,181,FOLLOW_181_in_triggerCondProperty1620);  
            stream_181.add(char_literal153);


            // AST REWRITE
            // elements: queryLogic
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 262:46: -> ^( TRIGGERCOND queryLogic )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:49: ^( TRIGGERCOND queryLogic )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TRIGGERCOND, "TRIGGERCOND")
                , root_1);

                adaptor.addChild(root_1, stream_queryLogic.nextTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:1: triggerEffectProperty : ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) ;
    public final AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty() throws RecognitionException {
        AtrophyScriptParser.triggerEffectProperty_return retval = new AtrophyScriptParser.triggerEffectProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal154=null;
        Token string_literal155=null;
        Token char_literal156=null;
        Token char_literal158=null;
        AtrophyScriptParser.triggerEffectList_return triggerEffectList157 =null;


        CommonTree string_literal154_tree=null;
        CommonTree string_literal155_tree=null;
        CommonTree char_literal156_tree=null;
        CommonTree char_literal158_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:22: ( ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:4: ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:4: ( 'te' | 'triggerEffect' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==166) ) {
                alt32=1;
            }
            else if ( (LA32_0==174) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:5: 'te'
                    {
                    string_literal154=(Token)match(input,166,FOLLOW_166_in_triggerEffectProperty1642);  
                    stream_166.add(string_literal154);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:12: 'triggerEffect'
                    {
                    string_literal155=(Token)match(input,174,FOLLOW_174_in_triggerEffectProperty1646);  
                    stream_174.add(string_literal155);


                    }
                    break;

            }


            char_literal156=(Token)match(input,180,FOLLOW_180_in_triggerEffectProperty1649);  
            stream_180.add(char_literal156);


            pushFollow(FOLLOW_triggerEffectList_in_triggerEffectProperty1651);
            triggerEffectList157=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList157.getTree());

            char_literal158=(Token)match(input,181,FOLLOW_181_in_triggerEffectProperty1653);  
            stream_181.add(char_literal158);


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
            // 266:55: -> ^( TRIGGEREFFECT triggerEffectList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:58: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:269:1: coverDecl : ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) ;
    public final AtrophyScriptParser.coverDecl_return coverDecl() throws RecognitionException {
        AtrophyScriptParser.coverDecl_return retval = new AtrophyScriptParser.coverDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal159=null;
        Token string_literal160=null;
        Token char_literal162=null;
        Token char_literal164=null;
        AtrophyScriptParser.varAssignment_return varAssignment161 =null;

        AtrophyScriptParser.properties_return properties163 =null;


        CommonTree string_literal159_tree=null;
        CommonTree string_literal160_tree=null;
        CommonTree char_literal162_tree=null;
        CommonTree char_literal164_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:269:10: ( ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:4: ( 'COVER' | 'cover' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:4: ( 'COVER' | 'cover' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==97) ) {
                alt33=1;
            }
            else if ( (LA33_0==118) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:5: 'COVER'
                    {
                    string_literal159=(Token)match(input,97,FOLLOW_97_in_coverDecl1677);  
                    stream_97.add(string_literal159);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:15: 'cover'
                    {
                    string_literal160=(Token)match(input,118,FOLLOW_118_in_coverDecl1681);  
                    stream_118.add(string_literal160);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_coverDecl1684);
            varAssignment161=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment161.getTree());

            char_literal162=(Token)match(input,180,FOLLOW_180_in_coverDecl1686);  
            stream_180.add(char_literal162);


            pushFollow(FOLLOW_properties_in_coverDecl1688);
            properties163=properties();

            state._fsp--;

            stream_properties.add(properties163.getTree());

            char_literal164=(Token)match(input,181,FOLLOW_181_in_coverDecl1690);  
            stream_181.add(char_literal164);


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
            // 270:57: -> ^( COVER varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:60: ^( COVER varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:273:1: stashDecl : ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) ;
    public final AtrophyScriptParser.stashDecl_return stashDecl() throws RecognitionException {
        AtrophyScriptParser.stashDecl_return retval = new AtrophyScriptParser.stashDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal165=null;
        Token string_literal166=null;
        Token char_literal168=null;
        Token char_literal170=null;
        AtrophyScriptParser.varAssignment_return varAssignment167 =null;

        AtrophyScriptParser.properties_return properties169 =null;


        CommonTree string_literal165_tree=null;
        CommonTree string_literal166_tree=null;
        CommonTree char_literal168_tree=null;
        CommonTree char_literal170_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:273:10: ( ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:274:4: ( 'STASH' | 'stash' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:274:4: ( 'STASH' | 'stash' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==103) ) {
                alt34=1;
            }
            else if ( (LA34_0==161) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:274:5: 'STASH'
                    {
                    string_literal165=(Token)match(input,103,FOLLOW_103_in_stashDecl1716);  
                    stream_103.add(string_literal165);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:274:15: 'stash'
                    {
                    string_literal166=(Token)match(input,161,FOLLOW_161_in_stashDecl1720);  
                    stream_161.add(string_literal166);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_stashDecl1723);
            varAssignment167=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment167.getTree());

            char_literal168=(Token)match(input,180,FOLLOW_180_in_stashDecl1725);  
            stream_180.add(char_literal168);


            pushFollow(FOLLOW_properties_in_stashDecl1727);
            properties169=properties();

            state._fsp--;

            stream_properties.add(properties169.getTree());

            char_literal170=(Token)match(input,181,FOLLOW_181_in_stashDecl1729);  
            stream_181.add(char_literal170);


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
            // 274:57: -> ^( STASH varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:274:60: ^( STASH varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:1: triggerEffectList : triggerEffect ( ',' ! triggerEffect )* ;
    public final AtrophyScriptParser.triggerEffectList_return triggerEffectList() throws RecognitionException {
        AtrophyScriptParser.triggerEffectList_return retval = new AtrophyScriptParser.triggerEffectList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal172=null;
        AtrophyScriptParser.triggerEffect_return triggerEffect171 =null;

        AtrophyScriptParser.triggerEffect_return triggerEffect173 =null;


        CommonTree char_literal172_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:18: ( triggerEffect ( ',' ! triggerEffect )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:278:4: triggerEffect ( ',' ! triggerEffect )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1752);
            triggerEffect171=triggerEffect();

            state._fsp--;

            adaptor.addChild(root_0, triggerEffect171.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:278:18: ( ',' ! triggerEffect )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==91) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:278:19: ',' ! triggerEffect
            	    {
            	    char_literal172=(Token)match(input,91,FOLLOW_91_in_triggerEffectList1755); 

            	    pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1758);
            	    triggerEffect173=triggerEffect();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffect173.getTree());

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
    // $ANTLR end "triggerEffectList"


    public static class triggerEffect_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerEffect"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:281:1: triggerEffect : ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | commandCallList );
    public final AtrophyScriptParser.triggerEffect_return triggerEffect() throws RecognitionException {
        AtrophyScriptParser.triggerEffect_return retval = new AtrophyScriptParser.triggerEffect_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.updateTalkTree_return updateTalkTree174 =null;

        AtrophyScriptParser.spawnTeam_return spawnTeam175 =null;

        AtrophyScriptParser.spawnCharacter_return spawnCharacter176 =null;

        AtrophyScriptParser.removeUnit_return removeUnit177 =null;

        AtrophyScriptParser.killUnit_return killUnit178 =null;

        AtrophyScriptParser.teleportUnit_return teleportUnit179 =null;

        AtrophyScriptParser.converseUnit_return converseUnit180 =null;

        AtrophyScriptParser.createSaferoom_return createSaferoom181 =null;

        AtrophyScriptParser.removeSaferoom_return removeSaferoom182 =null;

        AtrophyScriptParser.loadMap_return loadMap183 =null;

        AtrophyScriptParser.lockDoor_return lockDoor184 =null;

        AtrophyScriptParser.unlockDoor_return unlockDoor185 =null;

        AtrophyScriptParser.addTag_return addTag186 =null;

        AtrophyScriptParser.removeTag_return removeTag187 =null;

        AtrophyScriptParser.directorBias_return directorBias188 =null;

        AtrophyScriptParser.changeAiNode_return changeAiNode189 =null;

        AtrophyScriptParser.commandCallList_return commandCallList190 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:281:14: ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | commandCallList )
            int alt36=17;
            switch ( input.LA(1) ) {
            case UPDATE_TREE_PREFIX:
            case 176:
                {
                alt36=1;
                }
                break;
            case 158:
                {
                alt36=2;
                }
                break;
            case 157:
                {
                alt36=3;
                }
                break;
            case 153:
                {
                alt36=4;
                }
                break;
            case 133:
                {
                alt36=5;
                }
                break;
            case 167:
                {
                alt36=6;
                }
                break;
            case 117:
                {
                alt36=7;
                }
                break;
            case 156:
                {
                alt36=8;
                }
                break;
            case 151:
                {
                alt36=9;
                }
                break;
            case 136:
                {
                alt36=10;
                }
                break;
            case 137:
                {
                alt36=11;
                }
                break;
            case 175:
                {
                alt36=12;
                }
                break;
            case ADD_TAG_PREFIX:
            case 108:
                {
                alt36=13;
                }
                break;
            case REMOVE_TAG_PREFIX:
            case 152:
                {
                alt36=14;
                }
                break;
            case 120:
                {
                alt36=15;
                }
                break;
            case 114:
                {
                alt36=16;
                }
                break;
            case COMMAND_CALL_PREFIX:
            case 113:
                {
                alt36=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:282:4: updateTalkTree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_updateTalkTree_in_triggerEffect1773);
                    updateTalkTree174=updateTalkTree();

                    state._fsp--;

                    adaptor.addChild(root_0, updateTalkTree174.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:283:6: spawnTeam
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnTeam_in_triggerEffect1780);
                    spawnTeam175=spawnTeam();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnTeam175.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:284:6: spawnCharacter
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnCharacter_in_triggerEffect1787);
                    spawnCharacter176=spawnCharacter();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnCharacter176.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:6: removeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeUnit_in_triggerEffect1794);
                    removeUnit177=removeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, removeUnit177.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:286:6: killUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_killUnit_in_triggerEffect1801);
                    killUnit178=killUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, killUnit178.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:287:6: teleportUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_teleportUnit_in_triggerEffect1808);
                    teleportUnit179=teleportUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, teleportUnit179.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:288:6: converseUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_converseUnit_in_triggerEffect1815);
                    converseUnit180=converseUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, converseUnit180.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:289:6: createSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_createSaferoom_in_triggerEffect1822);
                    createSaferoom181=createSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, createSaferoom181.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:290:6: removeSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeSaferoom_in_triggerEffect1829);
                    removeSaferoom182=removeSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, removeSaferoom182.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:291:6: loadMap
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_loadMap_in_triggerEffect1836);
                    loadMap183=loadMap();

                    state._fsp--;

                    adaptor.addChild(root_0, loadMap183.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:292:6: lockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lockDoor_in_triggerEffect1843);
                    lockDoor184=lockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, lockDoor184.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:293:6: unlockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unlockDoor_in_triggerEffect1850);
                    unlockDoor185=unlockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, unlockDoor185.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:294:6: addTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_addTag_in_triggerEffect1857);
                    addTag186=addTag();

                    state._fsp--;

                    adaptor.addChild(root_0, addTag186.getTree());

                    }
                    break;
                case 14 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:295:6: removeTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeTag_in_triggerEffect1864);
                    removeTag187=removeTag();

                    state._fsp--;

                    adaptor.addChild(root_0, removeTag187.getTree());

                    }
                    break;
                case 15 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:296:6: directorBias
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_directorBias_in_triggerEffect1871);
                    directorBias188=directorBias();

                    state._fsp--;

                    adaptor.addChild(root_0, directorBias188.getTree());

                    }
                    break;
                case 16 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:297:6: changeAiNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_changeAiNode_in_triggerEffect1878);
                    changeAiNode189=changeAiNode();

                    state._fsp--;

                    adaptor.addChild(root_0, changeAiNode189.getTree());

                    }
                    break;
                case 17 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:298:6: commandCallList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandCallList_in_triggerEffect1885);
                    commandCallList190=commandCallList();

                    state._fsp--;

                    adaptor.addChild(root_0, commandCallList190.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:301:1: updateTalkTree : ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) );
    public final AtrophyScriptParser.updateTalkTree_return updateTalkTree() throws RecognitionException {
        AtrophyScriptParser.updateTalkTree_return retval = new AtrophyScriptParser.updateTalkTree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal191=null;
        Token INT193=null;
        Token UPDATE_TREE_PREFIX194=null;
        Token char_literal196=null;
        Token INT197=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral192 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral195 =null;


        CommonTree string_literal191_tree=null;
        CommonTree INT193_tree=null;
        CommonTree UPDATE_TREE_PREFIX194_tree=null;
        CommonTree char_literal196_tree=null;
        CommonTree INT197_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_UPDATE_TREE_PREFIX=new RewriteRuleTokenStream(adaptor,"token UPDATE_TREE_PREFIX");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:301:15: ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==176) ) {
                alt37=1;
            }
            else if ( (LA37_0==UPDATE_TREE_PREFIX) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:302:4: 'updateTalk:' stringLiteral INT
                    {
                    string_literal191=(Token)match(input,176,FOLLOW_176_in_updateTalkTree1900);  
                    stream_176.add(string_literal191);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree1902);
                    stringLiteral192=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral192.getTree());

                    INT193=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree1904);  
                    stream_INT.add(INT193);


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
                    // 302:36: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:302:39: ^( UPDATETALK stringLiteral INT )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:303:6: UPDATE_TREE_PREFIX stringLiteral '#' INT
                    {
                    UPDATE_TREE_PREFIX194=(Token)match(input,UPDATE_TREE_PREFIX,FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree1921);  
                    stream_UPDATE_TREE_PREFIX.add(UPDATE_TREE_PREFIX194);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree1923);
                    stringLiteral195=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral195.getTree());

                    char_literal196=(Token)match(input,88,FOLLOW_88_in_updateTalkTree1925);  
                    stream_88.add(char_literal196);


                    INT197=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree1927);  
                    stream_INT.add(INT197);


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
                    // 303:47: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:303:50: ^( UPDATETALK stringLiteral INT )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:306:1: isName : 'isName:' stringList -> ^( ISNAME stringList ) ;
    public final AtrophyScriptParser.isName_return isName() throws RecognitionException {
        AtrophyScriptParser.isName_return retval = new AtrophyScriptParser.isName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal198=null;
        AtrophyScriptParser.stringList_return stringList199 =null;


        CommonTree string_literal198_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:306:7: ( 'isName:' stringList -> ^( ISNAME stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:307:4: 'isName:' stringList
            {
            string_literal198=(Token)match(input,130,FOLLOW_130_in_isName1952);  
            stream_130.add(string_literal198);


            pushFollow(FOLLOW_stringList_in_isName1954);
            stringList199=stringList();

            state._fsp--;

            stream_stringList.add(stringList199.getTree());

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
            // 307:25: -> ^( ISNAME stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:307:28: ^( ISNAME stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:310:1: isFaction : 'isFaction:' stringList -> ^( ISFACTION stringList ) ;
    public final AtrophyScriptParser.isFaction_return isFaction() throws RecognitionException {
        AtrophyScriptParser.isFaction_return retval = new AtrophyScriptParser.isFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal200=null;
        AtrophyScriptParser.stringList_return stringList201 =null;


        CommonTree string_literal200_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:310:10: ( 'isFaction:' stringList -> ^( ISFACTION stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:311:4: 'isFaction:' stringList
            {
            string_literal200=(Token)match(input,128,FOLLOW_128_in_isFaction1977);  
            stream_128.add(string_literal200);


            pushFollow(FOLLOW_stringList_in_isFaction1979);
            stringList201=stringList();

            state._fsp--;

            stream_stringList.add(stringList201.getTree());

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
            // 311:28: -> ^( ISFACTION stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:311:31: ^( ISFACTION stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:314:1: hasItem : 'hasItem:' stringList -> ^( HASITEM stringList ) ;
    public final AtrophyScriptParser.hasItem_return hasItem() throws RecognitionException {
        AtrophyScriptParser.hasItem_return retval = new AtrophyScriptParser.hasItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal202=null;
        AtrophyScriptParser.stringList_return stringList203 =null;


        CommonTree string_literal202_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:314:8: ( 'hasItem:' stringList -> ^( HASITEM stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:315:4: 'hasItem:' stringList
            {
            string_literal202=(Token)match(input,121,FOLLOW_121_in_hasItem2002);  
            stream_121.add(string_literal202);


            pushFollow(FOLLOW_stringList_in_hasItem2004);
            stringList203=stringList();

            state._fsp--;

            stream_stringList.add(stringList203.getTree());

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
            // 315:26: -> ^( HASITEM stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:315:29: ^( HASITEM stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:318:1: hasWeapon : 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) ;
    public final AtrophyScriptParser.hasWeapon_return hasWeapon() throws RecognitionException {
        AtrophyScriptParser.hasWeapon_return retval = new AtrophyScriptParser.hasWeapon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal204=null;
        AtrophyScriptParser.stringList_return stringList205 =null;


        CommonTree string_literal204_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:318:10: ( 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:319:4: 'hasWeapon:' stringList
            {
            string_literal204=(Token)match(input,122,FOLLOW_122_in_hasWeapon2027);  
            stream_122.add(string_literal204);


            pushFollow(FOLLOW_stringList_in_hasWeapon2029);
            stringList205=stringList();

            state._fsp--;

            stream_stringList.add(stringList205.getTree());

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
            // 319:28: -> ^( HASWEAPON stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:319:31: ^( HASWEAPON stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:322:1: stringList : stringLiteral ( ',' ! stringLiteral )* ;
    public final AtrophyScriptParser.stringList_return stringList() throws RecognitionException {
        AtrophyScriptParser.stringList_return retval = new AtrophyScriptParser.stringList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal207=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral206 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral208 =null;


        CommonTree char_literal207_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:322:11: ( stringLiteral ( ',' ! stringLiteral )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:323:4: stringLiteral ( ',' ! stringLiteral )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_stringLiteral_in_stringList2052);
            stringLiteral206=stringLiteral();

            state._fsp--;

            adaptor.addChild(root_0, stringLiteral206.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:323:18: ( ',' ! stringLiteral )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==91) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:323:19: ',' ! stringLiteral
            	    {
            	    char_literal207=(Token)match(input,91,FOLLOW_91_in_stringList2055); 

            	    pushFollow(FOLLOW_stringLiteral_in_stringList2058);
            	    stringLiteral208=stringLiteral();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stringLiteral208.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:326:1: isAlive : 'isAlive' -> ^( ISALIVE ) ;
    public final AtrophyScriptParser.isAlive_return isAlive() throws RecognitionException {
        AtrophyScriptParser.isAlive_return retval = new AtrophyScriptParser.isAlive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal209=null;

        CommonTree string_literal209_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:326:8: ( 'isAlive' -> ^( ISALIVE ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:4: 'isAlive'
            {
            string_literal209=(Token)match(input,124,FOLLOW_124_in_isAlive2073);  
            stream_124.add(string_literal209);


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
            // 327:14: -> ^( ISALIVE )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:17: ^( ISALIVE )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:330:1: isDead : 'isDead' -> ^( ISDEAD ) ;
    public final AtrophyScriptParser.isDead_return isDead() throws RecognitionException {
        AtrophyScriptParser.isDead_return retval = new AtrophyScriptParser.isDead_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal210=null;

        CommonTree string_literal210_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:330:7: ( 'isDead' -> ^( ISDEAD ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:4: 'isDead'
            {
            string_literal210=(Token)match(input,127,FOLLOW_127_in_isDead2094);  
            stream_127.add(string_literal210);


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
            // 331:13: -> ^( ISDEAD )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:16: ^( ISDEAD )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:334:1: isInvestigated : 'isInvestigated' -> ^( ISINVESTIGATED ) ;
    public final AtrophyScriptParser.isInvestigated_return isInvestigated() throws RecognitionException {
        AtrophyScriptParser.isInvestigated_return retval = new AtrophyScriptParser.isInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal211=null;

        CommonTree string_literal211_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:334:15: ( 'isInvestigated' -> ^( ISINVESTIGATED ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:4: 'isInvestigated'
            {
            string_literal211=(Token)match(input,129,FOLLOW_129_in_isInvestigated2115);  
            stream_129.add(string_literal211);


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
            // 335:21: -> ^( ISINVESTIGATED )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:24: ^( ISINVESTIGATED )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:338:1: isNotInvestigated : 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) ;
    public final AtrophyScriptParser.isNotInvestigated_return isNotInvestigated() throws RecognitionException {
        AtrophyScriptParser.isNotInvestigated_return retval = new AtrophyScriptParser.isNotInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal212=null;

        CommonTree string_literal212_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:338:18: ( 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:339:4: 'isNotInvestigated'
            {
            string_literal212=(Token)match(input,132,FOLLOW_132_in_isNotInvestigated2136);  
            stream_132.add(string_literal212);


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
            // 339:24: -> ^( ISNOTINVESTIGATED )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:339:27: ^( ISNOTINVESTIGATED )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:342:1: isDaemon : 'isDaemon' -> ^( ISDAEMON ) ;
    public final AtrophyScriptParser.isDaemon_return isDaemon() throws RecognitionException {
        AtrophyScriptParser.isDaemon_return retval = new AtrophyScriptParser.isDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal213=null;

        CommonTree string_literal213_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:342:9: ( 'isDaemon' -> ^( ISDAEMON ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:343:4: 'isDaemon'
            {
            string_literal213=(Token)match(input,126,FOLLOW_126_in_isDaemon2157);  
            stream_126.add(string_literal213);


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
            // 343:15: -> ^( ISDAEMON )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:343:18: ^( ISDAEMON )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:346:1: isNotDaemon : 'isNotDaemon' -> ^( ISNOTDAEMON ) ;
    public final AtrophyScriptParser.isNotDaemon_return isNotDaemon() throws RecognitionException {
        AtrophyScriptParser.isNotDaemon_return retval = new AtrophyScriptParser.isNotDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal214=null;

        CommonTree string_literal214_tree=null;
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:346:12: ( 'isNotDaemon' -> ^( ISNOTDAEMON ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:347:4: 'isNotDaemon'
            {
            string_literal214=(Token)match(input,131,FOLLOW_131_in_isNotDaemon2176);  
            stream_131.add(string_literal214);


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
            // 347:18: -> ^( ISNOTDAEMON )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:347:21: ^( ISNOTDAEMON )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:350:1: teleDestination : 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) ;
    public final AtrophyScriptParser.teleDestination_return teleDestination() throws RecognitionException {
        AtrophyScriptParser.teleDestination_return retval = new AtrophyScriptParser.teleDestination_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal215=null;
        Token char_literal216=null;
        Token char_literal219=null;
        AtrophyScriptParser.xListProperty_return xListProperty217 =null;

        AtrophyScriptParser.yListProperty_return yListProperty218 =null;


        CommonTree string_literal215_tree=null;
        CommonTree char_literal216_tree=null;
        CommonTree char_literal219_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_yListProperty=new RewriteRuleSubtreeStream(adaptor,"rule yListProperty");
        RewriteRuleSubtreeStream stream_xListProperty=new RewriteRuleSubtreeStream(adaptor,"rule xListProperty");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:350:16: ( 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:4: 'destination' '{' xListProperty yListProperty '}'
            {
            string_literal215=(Token)match(input,119,FOLLOW_119_in_teleDestination2197);  
            stream_119.add(string_literal215);


            char_literal216=(Token)match(input,180,FOLLOW_180_in_teleDestination2199);  
            stream_180.add(char_literal216);


            pushFollow(FOLLOW_xListProperty_in_teleDestination2201);
            xListProperty217=xListProperty();

            state._fsp--;

            stream_xListProperty.add(xListProperty217.getTree());

            pushFollow(FOLLOW_yListProperty_in_teleDestination2203);
            yListProperty218=yListProperty();

            state._fsp--;

            stream_yListProperty.add(yListProperty218.getTree());

            char_literal219=(Token)match(input,181,FOLLOW_181_in_teleDestination2205);  
            stream_181.add(char_literal219);


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
            // 351:54: -> ^( TELEDEST xListProperty yListProperty )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:57: ^( TELEDEST xListProperty yListProperty )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:354:1: maxTeamSize : 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) ;
    public final AtrophyScriptParser.maxTeamSize_return maxTeamSize() throws RecognitionException {
        AtrophyScriptParser.maxTeamSize_return retval = new AtrophyScriptParser.maxTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal220=null;
        Token INT221=null;

        CommonTree string_literal220_tree=null;
        CommonTree INT221_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:354:12: ( 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:4: 'maxTeamSize:' INT
            {
            string_literal220=(Token)match(input,140,FOLLOW_140_in_maxTeamSize2230);  
            stream_140.add(string_literal220);


            INT221=(Token)match(input,INT,FOLLOW_INT_in_maxTeamSize2232);  
            stream_INT.add(INT221);


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
            // 355:23: -> ^( MAXTEAMSIZE INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:26: ^( MAXTEAMSIZE INT )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:358:1: minTeamSize : 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) ;
    public final AtrophyScriptParser.minTeamSize_return minTeamSize() throws RecognitionException {
        AtrophyScriptParser.minTeamSize_return retval = new AtrophyScriptParser.minTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal222=null;
        Token INT223=null;

        CommonTree string_literal222_tree=null;
        CommonTree INT223_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:358:12: ( 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:359:4: 'minTeamSize:' INT
            {
            string_literal222=(Token)match(input,141,FOLLOW_141_in_minTeamSize2253);  
            stream_141.add(string_literal222);


            INT223=(Token)match(input,INT,FOLLOW_INT_in_minTeamSize2255);  
            stream_INT.add(INT223);


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
            // 359:23: -> ^( MINTEAMSIZE INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:359:26: ^( MINTEAMSIZE INT )
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


    public static class aiNode_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aiNode"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:362:1: aiNode : 'aiNode' '{' aiNodeOptions '}' -> ^( AINODE aiNodeOptions ) ;
    public final AtrophyScriptParser.aiNode_return aiNode() throws RecognitionException {
        AtrophyScriptParser.aiNode_return retval = new AtrophyScriptParser.aiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal224=null;
        Token char_literal225=null;
        Token char_literal227=null;
        AtrophyScriptParser.aiNodeOptions_return aiNodeOptions226 =null;


        CommonTree string_literal224_tree=null;
        CommonTree char_literal225_tree=null;
        CommonTree char_literal227_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_aiNodeOptions=new RewriteRuleSubtreeStream(adaptor,"rule aiNodeOptions");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:362:7: ( 'aiNode' '{' aiNodeOptions '}' -> ^( AINODE aiNodeOptions ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:363:4: 'aiNode' '{' aiNodeOptions '}'
            {
            string_literal224=(Token)match(input,110,FOLLOW_110_in_aiNode2278);  
            stream_110.add(string_literal224);


            char_literal225=(Token)match(input,180,FOLLOW_180_in_aiNode2280);  
            stream_180.add(char_literal225);


            pushFollow(FOLLOW_aiNodeOptions_in_aiNode2282);
            aiNodeOptions226=aiNodeOptions();

            state._fsp--;

            stream_aiNodeOptions.add(aiNodeOptions226.getTree());

            char_literal227=(Token)match(input,181,FOLLOW_181_in_aiNode2284);  
            stream_181.add(char_literal227);


            // AST REWRITE
            // elements: aiNodeOptions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 363:35: -> ^( AINODE aiNodeOptions )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:363:38: ^( AINODE aiNodeOptions )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(AINODE, "AINODE")
                , root_1);

                adaptor.addChild(root_1, stream_aiNodeOptions.nextTree());

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
    // $ANTLR end "aiNode"


    public static class aiNodeOptions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aiNodeOptions"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:366:1: aiNodeOptions : ( subscribeTalkMaps | behaviours )* ;
    public final AtrophyScriptParser.aiNodeOptions_return aiNodeOptions() throws RecognitionException {
        AtrophyScriptParser.aiNodeOptions_return retval = new AtrophyScriptParser.aiNodeOptions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps228 =null;

        AtrophyScriptParser.behaviours_return behaviours229 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:366:14: ( ( subscribeTalkMaps | behaviours )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:3: ( subscribeTalkMaps | behaviours )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:3: ( subscribeTalkMaps | behaviours )*
            loop39:
            do {
                int alt39=3;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==162) ) {
                    alt39=1;
                }
                else if ( (LA39_0==111) ) {
                    alt39=2;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:4: subscribeTalkMaps
            	    {
            	    pushFollow(FOLLOW_subscribeTalkMaps_in_aiNodeOptions2307);
            	    subscribeTalkMaps228=subscribeTalkMaps();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subscribeTalkMaps228.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:368:4: behaviours
            	    {
            	    pushFollow(FOLLOW_behaviours_in_aiNodeOptions2312);
            	    behaviours229=behaviours();

            	    state._fsp--;

            	    adaptor.addChild(root_0, behaviours229.getTree());

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
    // $ANTLR end "aiNodeOptions"


    public static class subscribeTalkMaps_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subscribeTalkMaps"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:371:1: subscribeTalkMaps : 'subscribe:' stringList -> ^( SUBSCRIBE stringList ) ;
    public final AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps() throws RecognitionException {
        AtrophyScriptParser.subscribeTalkMaps_return retval = new AtrophyScriptParser.subscribeTalkMaps_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal230=null;
        AtrophyScriptParser.stringList_return stringList231 =null;


        CommonTree string_literal230_tree=null;
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:371:18: ( 'subscribe:' stringList -> ^( SUBSCRIBE stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:372:4: 'subscribe:' stringList
            {
            string_literal230=(Token)match(input,162,FOLLOW_162_in_subscribeTalkMaps2329);  
            stream_162.add(string_literal230);


            pushFollow(FOLLOW_stringList_in_subscribeTalkMaps2330);
            stringList231=stringList();

            state._fsp--;

            stream_stringList.add(stringList231.getTree());

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
            // 372:27: -> ^( SUBSCRIBE stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:372:30: ^( SUBSCRIBE stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SUBSCRIBE, "SUBSCRIBE")
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
    // $ANTLR end "subscribeTalkMaps"


    public static class behaviours_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviours"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:375:1: behaviours : 'behaviours:' stringList -> ^( BEHAVIOUR stringList ) ;
    public final AtrophyScriptParser.behaviours_return behaviours() throws RecognitionException {
        AtrophyScriptParser.behaviours_return retval = new AtrophyScriptParser.behaviours_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal232=null;
        AtrophyScriptParser.stringList_return stringList233 =null;


        CommonTree string_literal232_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:375:11: ( 'behaviours:' stringList -> ^( BEHAVIOUR stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:4: 'behaviours:' stringList
            {
            string_literal232=(Token)match(input,111,FOLLOW_111_in_behaviours2353);  
            stream_111.add(string_literal232);


            pushFollow(FOLLOW_stringList_in_behaviours2355);
            stringList233=stringList();

            state._fsp--;

            stream_stringList.add(stringList233.getTree());

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
            // 376:29: -> ^( BEHAVIOUR stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:32: ^( BEHAVIOUR stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BEHAVIOUR, "BEHAVIOUR")
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
    // $ANTLR end "behaviours"


    public static class unitInfo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unitInfo"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:1: unitInfo : ( isName | isFaction | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | aiNode )* ;
    public final AtrophyScriptParser.unitInfo_return unitInfo() throws RecognitionException {
        AtrophyScriptParser.unitInfo_return retval = new AtrophyScriptParser.unitInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName234 =null;

        AtrophyScriptParser.isFaction_return isFaction235 =null;

        AtrophyScriptParser.hasItem_return hasItem236 =null;

        AtrophyScriptParser.hasWeapon_return hasWeapon237 =null;

        AtrophyScriptParser.isAlive_return isAlive238 =null;

        AtrophyScriptParser.isDead_return isDead239 =null;

        AtrophyScriptParser.isInvestigated_return isInvestigated240 =null;

        AtrophyScriptParser.isNotInvestigated_return isNotInvestigated241 =null;

        AtrophyScriptParser.isDaemon_return isDaemon242 =null;

        AtrophyScriptParser.isNotDaemon_return isNotDaemon243 =null;

        AtrophyScriptParser.teleDestination_return teleDestination244 =null;

        AtrophyScriptParser.maxTeamSize_return maxTeamSize245 =null;

        AtrophyScriptParser.minTeamSize_return minTeamSize246 =null;

        AtrophyScriptParser.aiNode_return aiNode247 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:9: ( ( isName | isFaction | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | aiNode )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:380:4: ( isName | isFaction | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | aiNode )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:380:4: ( isName | isFaction | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | aiNode )*
            loop40:
            do {
                int alt40=15;
                switch ( input.LA(1) ) {
                case 130:
                    {
                    alt40=1;
                    }
                    break;
                case 128:
                    {
                    alt40=2;
                    }
                    break;
                case 121:
                    {
                    alt40=3;
                    }
                    break;
                case 122:
                    {
                    alt40=4;
                    }
                    break;
                case 124:
                    {
                    alt40=5;
                    }
                    break;
                case 127:
                    {
                    alt40=6;
                    }
                    break;
                case 129:
                    {
                    alt40=7;
                    }
                    break;
                case 132:
                    {
                    alt40=8;
                    }
                    break;
                case 126:
                    {
                    alt40=9;
                    }
                    break;
                case 131:
                    {
                    alt40=10;
                    }
                    break;
                case 119:
                    {
                    alt40=11;
                    }
                    break;
                case 140:
                    {
                    alt40=12;
                    }
                    break;
                case 141:
                    {
                    alt40=13;
                    }
                    break;
                case 110:
                    {
                    alt40=14;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:380:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_unitInfo2379);
            	    isName234=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName234.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:381:6: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_unitInfo2386);
            	    isFaction235=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction235.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:382:6: hasItem
            	    {
            	    pushFollow(FOLLOW_hasItem_in_unitInfo2393);
            	    hasItem236=hasItem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasItem236.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:383:6: hasWeapon
            	    {
            	    pushFollow(FOLLOW_hasWeapon_in_unitInfo2400);
            	    hasWeapon237=hasWeapon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasWeapon237.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:384:6: isAlive
            	    {
            	    pushFollow(FOLLOW_isAlive_in_unitInfo2407);
            	    isAlive238=isAlive();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isAlive238.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:385:6: isDead
            	    {
            	    pushFollow(FOLLOW_isDead_in_unitInfo2414);
            	    isDead239=isDead();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDead239.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:386:6: isInvestigated
            	    {
            	    pushFollow(FOLLOW_isInvestigated_in_unitInfo2421);
            	    isInvestigated240=isInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isInvestigated240.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:387:6: isNotInvestigated
            	    {
            	    pushFollow(FOLLOW_isNotInvestigated_in_unitInfo2428);
            	    isNotInvestigated241=isNotInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotInvestigated241.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:388:6: isDaemon
            	    {
            	    pushFollow(FOLLOW_isDaemon_in_unitInfo2435);
            	    isDaemon242=isDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDaemon242.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:389:6: isNotDaemon
            	    {
            	    pushFollow(FOLLOW_isNotDaemon_in_unitInfo2442);
            	    isNotDaemon243=isNotDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotDaemon243.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:390:6: teleDestination
            	    {
            	    pushFollow(FOLLOW_teleDestination_in_unitInfo2449);
            	    teleDestination244=teleDestination();

            	    state._fsp--;

            	    adaptor.addChild(root_0, teleDestination244.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:391:6: maxTeamSize
            	    {
            	    pushFollow(FOLLOW_maxTeamSize_in_unitInfo2456);
            	    maxTeamSize245=maxTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, maxTeamSize245.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:392:6: minTeamSize
            	    {
            	    pushFollow(FOLLOW_minTeamSize_in_unitInfo2463);
            	    minTeamSize246=minTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, minTeamSize246.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:393:6: aiNode
            	    {
            	    pushFollow(FOLLOW_aiNode_in_unitInfo2470);
            	    aiNode247=aiNode();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiNode247.getTree());

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
    // $ANTLR end "unitInfo"


    public static class spawnTeam_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spawnTeam"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:396:1: spawnTeam : 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) ;
    public final AtrophyScriptParser.spawnTeam_return spawnTeam() throws RecognitionException {
        AtrophyScriptParser.spawnTeam_return retval = new AtrophyScriptParser.spawnTeam_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal248=null;
        Token char_literal249=null;
        Token char_literal251=null;
        AtrophyScriptParser.unitInfo_return unitInfo250 =null;


        CommonTree string_literal248_tree=null;
        CommonTree char_literal249_tree=null;
        CommonTree char_literal251_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:396:10: ( 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:397:4: 'spawnTeam' '{' unitInfo '}'
            {
            string_literal248=(Token)match(input,158,FOLLOW_158_in_spawnTeam2489);  
            stream_158.add(string_literal248);


            char_literal249=(Token)match(input,180,FOLLOW_180_in_spawnTeam2491);  
            stream_180.add(char_literal249);


            pushFollow(FOLLOW_unitInfo_in_spawnTeam2493);
            unitInfo250=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo250.getTree());

            char_literal251=(Token)match(input,181,FOLLOW_181_in_spawnTeam2495);  
            stream_181.add(char_literal251);


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
            // 397:33: -> ^( SPAWNTEAM unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:397:36: ^( SPAWNTEAM unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:400:1: spawnCharacter : 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) ;
    public final AtrophyScriptParser.spawnCharacter_return spawnCharacter() throws RecognitionException {
        AtrophyScriptParser.spawnCharacter_return retval = new AtrophyScriptParser.spawnCharacter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal252=null;
        Token char_literal253=null;
        Token char_literal255=null;
        AtrophyScriptParser.unitInfo_return unitInfo254 =null;


        CommonTree string_literal252_tree=null;
        CommonTree char_literal253_tree=null;
        CommonTree char_literal255_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:400:15: ( 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:401:4: 'spawnCharacter' '{' unitInfo '}'
            {
            string_literal252=(Token)match(input,157,FOLLOW_157_in_spawnCharacter2518);  
            stream_157.add(string_literal252);


            char_literal253=(Token)match(input,180,FOLLOW_180_in_spawnCharacter2520);  
            stream_180.add(char_literal253);


            pushFollow(FOLLOW_unitInfo_in_spawnCharacter2522);
            unitInfo254=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo254.getTree());

            char_literal255=(Token)match(input,181,FOLLOW_181_in_spawnCharacter2524);  
            stream_181.add(char_literal255);


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
            // 401:38: -> ^( SPAWNCHARACTER unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:401:41: ^( SPAWNCHARACTER unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:404:1: removeUnit : 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) ;
    public final AtrophyScriptParser.removeUnit_return removeUnit() throws RecognitionException {
        AtrophyScriptParser.removeUnit_return retval = new AtrophyScriptParser.removeUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal256=null;
        Token char_literal257=null;
        Token char_literal259=null;
        AtrophyScriptParser.unitInfo_return unitInfo258 =null;


        CommonTree string_literal256_tree=null;
        CommonTree char_literal257_tree=null;
        CommonTree char_literal259_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:404:11: ( 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:405:4: 'removeUnit' '{' unitInfo '}'
            {
            string_literal256=(Token)match(input,153,FOLLOW_153_in_removeUnit2547);  
            stream_153.add(string_literal256);


            char_literal257=(Token)match(input,180,FOLLOW_180_in_removeUnit2549);  
            stream_180.add(char_literal257);


            pushFollow(FOLLOW_unitInfo_in_removeUnit2551);
            unitInfo258=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo258.getTree());

            char_literal259=(Token)match(input,181,FOLLOW_181_in_removeUnit2553);  
            stream_181.add(char_literal259);


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
            // 405:34: -> ^( REMOVEUNIT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:405:37: ^( REMOVEUNIT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:408:1: killUnit : 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) ;
    public final AtrophyScriptParser.killUnit_return killUnit() throws RecognitionException {
        AtrophyScriptParser.killUnit_return retval = new AtrophyScriptParser.killUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal260=null;
        Token char_literal261=null;
        Token char_literal263=null;
        AtrophyScriptParser.unitInfo_return unitInfo262 =null;


        CommonTree string_literal260_tree=null;
        CommonTree char_literal261_tree=null;
        CommonTree char_literal263_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:408:9: ( 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:409:4: 'killUnit' '{' unitInfo '}'
            {
            string_literal260=(Token)match(input,133,FOLLOW_133_in_killUnit2576);  
            stream_133.add(string_literal260);


            char_literal261=(Token)match(input,180,FOLLOW_180_in_killUnit2578);  
            stream_180.add(char_literal261);


            pushFollow(FOLLOW_unitInfo_in_killUnit2580);
            unitInfo262=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo262.getTree());

            char_literal263=(Token)match(input,181,FOLLOW_181_in_killUnit2582);  
            stream_181.add(char_literal263);


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
            // 409:32: -> ^( KILLUNIT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:409:35: ^( KILLUNIT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:412:1: teleportUnit : 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) ;
    public final AtrophyScriptParser.teleportUnit_return teleportUnit() throws RecognitionException {
        AtrophyScriptParser.teleportUnit_return retval = new AtrophyScriptParser.teleportUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal264=null;
        Token char_literal265=null;
        Token char_literal267=null;
        AtrophyScriptParser.unitInfo_return unitInfo266 =null;


        CommonTree string_literal264_tree=null;
        CommonTree char_literal265_tree=null;
        CommonTree char_literal267_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:412:13: ( 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:413:4: 'teleport' '{' unitInfo '}'
            {
            string_literal264=(Token)match(input,167,FOLLOW_167_in_teleportUnit2605);  
            stream_167.add(string_literal264);


            char_literal265=(Token)match(input,180,FOLLOW_180_in_teleportUnit2607);  
            stream_180.add(char_literal265);


            pushFollow(FOLLOW_unitInfo_in_teleportUnit2609);
            unitInfo266=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo266.getTree());

            char_literal267=(Token)match(input,181,FOLLOW_181_in_teleportUnit2611);  
            stream_181.add(char_literal267);


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
            // 413:32: -> ^( TELEPORT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:413:35: ^( TELEPORT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:416:1: converseUnit : 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) ;
    public final AtrophyScriptParser.converseUnit_return converseUnit() throws RecognitionException {
        AtrophyScriptParser.converseUnit_return retval = new AtrophyScriptParser.converseUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal268=null;
        Token char_literal269=null;
        Token char_literal271=null;
        AtrophyScriptParser.unitInfo_return unitInfo270 =null;


        CommonTree string_literal268_tree=null;
        CommonTree char_literal269_tree=null;
        CommonTree char_literal271_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:416:13: ( 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:417:4: 'converse' '{' unitInfo '}'
            {
            string_literal268=(Token)match(input,117,FOLLOW_117_in_converseUnit2634);  
            stream_117.add(string_literal268);


            char_literal269=(Token)match(input,180,FOLLOW_180_in_converseUnit2636);  
            stream_180.add(char_literal269);


            pushFollow(FOLLOW_unitInfo_in_converseUnit2638);
            unitInfo270=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo270.getTree());

            char_literal271=(Token)match(input,181,FOLLOW_181_in_converseUnit2640);  
            stream_181.add(char_literal271);


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
            // 417:32: -> ^( CONVERSE unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:417:35: ^( CONVERSE unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:420:1: createSaferoom : 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.createSaferoom_return createSaferoom() throws RecognitionException {
        AtrophyScriptParser.createSaferoom_return retval = new AtrophyScriptParser.createSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal272=null;
        Token char_literal273=null;
        Token char_literal275=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo274 =null;


        CommonTree string_literal272_tree=null;
        CommonTree char_literal273_tree=null;
        CommonTree char_literal275_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:420:15: ( 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:421:4: 'saferoom' '{' saferoomInfo '}'
            {
            string_literal272=(Token)match(input,156,FOLLOW_156_in_createSaferoom2663);  
            stream_156.add(string_literal272);


            char_literal273=(Token)match(input,180,FOLLOW_180_in_createSaferoom2665);  
            stream_180.add(char_literal273);


            pushFollow(FOLLOW_saferoomInfo_in_createSaferoom2667);
            saferoomInfo274=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo274.getTree());

            char_literal275=(Token)match(input,181,FOLLOW_181_in_createSaferoom2669);  
            stream_181.add(char_literal275);


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
            // 421:36: -> ^( SAFEROOM saferoomInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:421:39: ^( SAFEROOM saferoomInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:1: removeSaferoom : 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.removeSaferoom_return removeSaferoom() throws RecognitionException {
        AtrophyScriptParser.removeSaferoom_return retval = new AtrophyScriptParser.removeSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal276=null;
        Token char_literal277=null;
        Token char_literal279=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo278 =null;


        CommonTree string_literal276_tree=null;
        CommonTree char_literal277_tree=null;
        CommonTree char_literal279_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:15: ( 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:425:4: 'removeSaferoom' '{' saferoomInfo '}'
            {
            string_literal276=(Token)match(input,151,FOLLOW_151_in_removeSaferoom2692);  
            stream_151.add(string_literal276);


            char_literal277=(Token)match(input,180,FOLLOW_180_in_removeSaferoom2694);  
            stream_180.add(char_literal277);


            pushFollow(FOLLOW_saferoomInfo_in_removeSaferoom2696);
            saferoomInfo278=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo278.getTree());

            char_literal279=(Token)match(input,181,FOLLOW_181_in_removeSaferoom2698);  
            stream_181.add(char_literal279);


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
            // 425:42: -> ^( REMOVESAFEROOM saferoomInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:425:45: ^( REMOVESAFEROOM saferoomInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:428:1: containsFaction : 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) ;
    public final AtrophyScriptParser.containsFaction_return containsFaction() throws RecognitionException {
        AtrophyScriptParser.containsFaction_return retval = new AtrophyScriptParser.containsFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal280=null;
        AtrophyScriptParser.stringList_return stringList281 =null;


        CommonTree string_literal280_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:428:16: ( 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:429:4: 'containsFaction:' stringList
            {
            string_literal280=(Token)match(input,116,FOLLOW_116_in_containsFaction2721);  
            stream_116.add(string_literal280);


            pushFollow(FOLLOW_stringList_in_containsFaction2723);
            stringList281=stringList();

            state._fsp--;

            stream_stringList.add(stringList281.getTree());

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
            // 429:34: -> ^( CONTAINSFACTION stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:429:37: ^( CONTAINSFACTION stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:432:1: saferoomInfo : ( containsFaction | isName )* ;
    public final AtrophyScriptParser.saferoomInfo_return saferoomInfo() throws RecognitionException {
        AtrophyScriptParser.saferoomInfo_return retval = new AtrophyScriptParser.saferoomInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.containsFaction_return containsFaction282 =null;

        AtrophyScriptParser.isName_return isName283 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:432:13: ( ( containsFaction | isName )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:433:4: ( containsFaction | isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:433:4: ( containsFaction | isName )*
            loop41:
            do {
                int alt41=3;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==116) ) {
                    alt41=1;
                }
                else if ( (LA41_0==130) ) {
                    alt41=2;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:433:5: containsFaction
            	    {
            	    pushFollow(FOLLOW_containsFaction_in_saferoomInfo2747);
            	    containsFaction282=containsFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, containsFaction282.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:434:6: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_saferoomInfo2754);
            	    isName283=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName283.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:437:1: loadMap : 'loadMap:' stringLiteral -> ^( LOADMAP stringLiteral ) ;
    public final AtrophyScriptParser.loadMap_return loadMap() throws RecognitionException {
        AtrophyScriptParser.loadMap_return retval = new AtrophyScriptParser.loadMap_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal284=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral285 =null;


        CommonTree string_literal284_tree=null;
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:437:8: ( 'loadMap:' stringLiteral -> ^( LOADMAP stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:438:4: 'loadMap:' stringLiteral
            {
            string_literal284=(Token)match(input,136,FOLLOW_136_in_loadMap2771);  
            stream_136.add(string_literal284);


            pushFollow(FOLLOW_stringLiteral_in_loadMap2773);
            stringLiteral285=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral285.getTree());

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
            // 438:29: -> ^( LOADMAP stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:438:32: ^( LOADMAP stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:441:1: lockDoor : 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.lockDoor_return lockDoor() throws RecognitionException {
        AtrophyScriptParser.lockDoor_return retval = new AtrophyScriptParser.lockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal286=null;
        Token char_literal287=null;
        Token char_literal289=null;
        AtrophyScriptParser.doorInfo_return doorInfo288 =null;


        CommonTree string_literal286_tree=null;
        CommonTree char_literal287_tree=null;
        CommonTree char_literal289_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:441:9: ( 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:442:4: 'lockDoor' '{' doorInfo '}'
            {
            string_literal286=(Token)match(input,137,FOLLOW_137_in_lockDoor2796);  
            stream_137.add(string_literal286);


            char_literal287=(Token)match(input,180,FOLLOW_180_in_lockDoor2798);  
            stream_180.add(char_literal287);


            pushFollow(FOLLOW_doorInfo_in_lockDoor2800);
            doorInfo288=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo288.getTree());

            char_literal289=(Token)match(input,181,FOLLOW_181_in_lockDoor2802);  
            stream_181.add(char_literal289);


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
            // 442:32: -> ^( LOCKDOOR doorInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:442:35: ^( LOCKDOOR doorInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:445:1: unlockDoor : 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.unlockDoor_return unlockDoor() throws RecognitionException {
        AtrophyScriptParser.unlockDoor_return retval = new AtrophyScriptParser.unlockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal290=null;
        Token char_literal291=null;
        Token char_literal293=null;
        AtrophyScriptParser.doorInfo_return doorInfo292 =null;


        CommonTree string_literal290_tree=null;
        CommonTree char_literal291_tree=null;
        CommonTree char_literal293_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:445:11: ( 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:446:4: 'unlockDoor' '{' doorInfo '}'
            {
            string_literal290=(Token)match(input,175,FOLLOW_175_in_unlockDoor2825);  
            stream_175.add(string_literal290);


            char_literal291=(Token)match(input,180,FOLLOW_180_in_unlockDoor2827);  
            stream_180.add(char_literal291);


            pushFollow(FOLLOW_doorInfo_in_unlockDoor2829);
            doorInfo292=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo292.getTree());

            char_literal293=(Token)match(input,181,FOLLOW_181_in_unlockDoor2831);  
            stream_181.add(char_literal293);


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
            // 446:34: -> ^( UNLOCKDOOR doorInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:446:37: ^( UNLOCKDOOR doorInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:449:1: doorInfo : 'name:' stringList -> ^( DOORNAMES stringList ) ;
    public final AtrophyScriptParser.doorInfo_return doorInfo() throws RecognitionException {
        AtrophyScriptParser.doorInfo_return retval = new AtrophyScriptParser.doorInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal294=null;
        AtrophyScriptParser.stringList_return stringList295 =null;


        CommonTree string_literal294_tree=null;
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:449:9: ( 'name:' stringList -> ^( DOORNAMES stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:450:4: 'name:' stringList
            {
            string_literal294=(Token)match(input,142,FOLLOW_142_in_doorInfo2854);  
            stream_142.add(string_literal294);


            pushFollow(FOLLOW_stringList_in_doorInfo2856);
            stringList295=stringList();

            state._fsp--;

            stream_stringList.add(stringList295.getTree());

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
            // 450:23: -> ^( DOORNAMES stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:450:26: ^( DOORNAMES stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:453:1: addTag : ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) );
    public final AtrophyScriptParser.addTag_return addTag() throws RecognitionException {
        AtrophyScriptParser.addTag_return retval = new AtrophyScriptParser.addTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal296=null;
        Token ADD_TAG_PREFIX298=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral297 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral299 =null;


        CommonTree string_literal296_tree=null;
        CommonTree ADD_TAG_PREFIX298_tree=null;
        RewriteRuleTokenStream stream_ADD_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token ADD_TAG_PREFIX");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:453:7: ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==108) ) {
                alt42=1;
            }
            else if ( (LA42_0==ADD_TAG_PREFIX) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:454:4: 'addTag:' stringLiteral
                    {
                    string_literal296=(Token)match(input,108,FOLLOW_108_in_addTag2879);  
                    stream_108.add(string_literal296);


                    pushFollow(FOLLOW_stringLiteral_in_addTag2881);
                    stringLiteral297=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral297.getTree());

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
                    // 454:28: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:454:31: ^( ADDTAG stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:455:6: ADD_TAG_PREFIX stringLiteral
                    {
                    ADD_TAG_PREFIX298=(Token)match(input,ADD_TAG_PREFIX,FOLLOW_ADD_TAG_PREFIX_in_addTag2896);  
                    stream_ADD_TAG_PREFIX.add(ADD_TAG_PREFIX298);


                    pushFollow(FOLLOW_stringLiteral_in_addTag2898);
                    stringLiteral299=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral299.getTree());

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
                    // 455:35: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:455:38: ^( ADDTAG stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:458:1: removeTag : ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) );
    public final AtrophyScriptParser.removeTag_return removeTag() throws RecognitionException {
        AtrophyScriptParser.removeTag_return retval = new AtrophyScriptParser.removeTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal300=null;
        Token REMOVE_TAG_PREFIX302=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral301 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral303 =null;


        CommonTree string_literal300_tree=null;
        CommonTree REMOVE_TAG_PREFIX302_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_REMOVE_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token REMOVE_TAG_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:458:10: ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==152) ) {
                alt43=1;
            }
            else if ( (LA43_0==REMOVE_TAG_PREFIX) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:459:4: 'removeTag:' stringLiteral
                    {
                    string_literal300=(Token)match(input,152,FOLLOW_152_in_removeTag2921);  
                    stream_152.add(string_literal300);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag2923);
                    stringLiteral301=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral301.getTree());

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
                    // 459:31: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:459:34: ^( REMOVETAG stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:460:6: REMOVE_TAG_PREFIX stringLiteral
                    {
                    REMOVE_TAG_PREFIX302=(Token)match(input,REMOVE_TAG_PREFIX,FOLLOW_REMOVE_TAG_PREFIX_in_removeTag2938);  
                    stream_REMOVE_TAG_PREFIX.add(REMOVE_TAG_PREFIX302);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag2940);
                    stringLiteral303=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral303.getTree());

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
                    // 460:38: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:460:41: ^( REMOVETAG stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:463:1: directorBias : 'directorBias:' -> ^( DIRECTORBIAS ) ;
    public final AtrophyScriptParser.directorBias_return directorBias() throws RecognitionException {
        AtrophyScriptParser.directorBias_return retval = new AtrophyScriptParser.directorBias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal304=null;

        CommonTree string_literal304_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:463:13: ( 'directorBias:' -> ^( DIRECTORBIAS ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:464:4: 'directorBias:'
            {
            string_literal304=(Token)match(input,120,FOLLOW_120_in_directorBias2963);  
            stream_120.add(string_literal304);


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
            // 464:20: -> ^( DIRECTORBIAS )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:464:23: ^( DIRECTORBIAS )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:467:1: changeAiNode : 'changeAiNode:' -> ^( CHANGEAINODE ) ;
    public final AtrophyScriptParser.changeAiNode_return changeAiNode() throws RecognitionException {
        AtrophyScriptParser.changeAiNode_return retval = new AtrophyScriptParser.changeAiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal305=null;

        CommonTree string_literal305_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:467:13: ( 'changeAiNode:' -> ^( CHANGEAINODE ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:468:4: 'changeAiNode:'
            {
            string_literal305=(Token)match(input,114,FOLLOW_114_in_changeAiNode2984);  
            stream_114.add(string_literal305);


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
            // 468:21: -> ^( CHANGEAINODE )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:468:24: ^( CHANGEAINODE )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:471:1: beginStatement : ( 'INIT' | 'init' ) '{' commandCallList '}' -> ^( INIT commandCallList ) ;
    public final AtrophyScriptParser.beginStatement_return beginStatement() throws RecognitionException {
        AtrophyScriptParser.beginStatement_return retval = new AtrophyScriptParser.beginStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal306=null;
        Token string_literal307=null;
        Token char_literal308=null;
        Token char_literal310=null;
        AtrophyScriptParser.commandCallList_return commandCallList309 =null;


        CommonTree string_literal306_tree=null;
        CommonTree string_literal307_tree=null;
        CommonTree char_literal308_tree=null;
        CommonTree char_literal310_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_commandCallList=new RewriteRuleSubtreeStream(adaptor,"rule commandCallList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:471:15: ( ( 'INIT' | 'init' ) '{' commandCallList '}' -> ^( INIT commandCallList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:472:4: ( 'INIT' | 'init' ) '{' commandCallList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:472:4: ( 'INIT' | 'init' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==98) ) {
                alt44=1;
            }
            else if ( (LA44_0==123) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:472:5: 'INIT'
                    {
                    string_literal306=(Token)match(input,98,FOLLOW_98_in_beginStatement3007);  
                    stream_98.add(string_literal306);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:472:14: 'init'
                    {
                    string_literal307=(Token)match(input,123,FOLLOW_123_in_beginStatement3011);  
                    stream_123.add(string_literal307);


                    }
                    break;

            }


            char_literal308=(Token)match(input,180,FOLLOW_180_in_beginStatement3014);  
            stream_180.add(char_literal308);


            pushFollow(FOLLOW_commandCallList_in_beginStatement3019);
            commandCallList309=commandCallList();

            state._fsp--;

            stream_commandCallList.add(commandCallList309.getTree());

            char_literal310=(Token)match(input,181,FOLLOW_181_in_beginStatement3024);  
            stream_181.add(char_literal310);


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
            // 475:4: -> ^( INIT commandCallList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:476:4: ^( INIT commandCallList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:479:1: commandCallList : commandCall ( ',' ! commandCall )* ;
    public final AtrophyScriptParser.commandCallList_return commandCallList() throws RecognitionException {
        AtrophyScriptParser.commandCallList_return retval = new AtrophyScriptParser.commandCallList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal312=null;
        AtrophyScriptParser.commandCall_return commandCall311 =null;

        AtrophyScriptParser.commandCall_return commandCall313 =null;


        CommonTree char_literal312_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:479:16: ( commandCall ( ',' ! commandCall )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:480:4: commandCall ( ',' ! commandCall )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_commandCall_in_commandCallList3051);
            commandCall311=commandCall();

            state._fsp--;

            adaptor.addChild(root_0, commandCall311.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:480:16: ( ',' ! commandCall )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:480:17: ',' ! commandCall
            	    {
            	    char_literal312=(Token)match(input,91,FOLLOW_91_in_commandCallList3054); 

            	    pushFollow(FOLLOW_commandCall_in_commandCallList3057);
            	    commandCall313=commandCall();

            	    state._fsp--;

            	    adaptor.addChild(root_0, commandCall313.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:483:1: commandCall : ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) );
    public final AtrophyScriptParser.commandCall_return commandCall() throws RecognitionException {
        AtrophyScriptParser.commandCall_return retval = new AtrophyScriptParser.commandCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal314=null;
        Token COMMAND_CALL_PREFIX316=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral315 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral317 =null;


        CommonTree string_literal314_tree=null;
        CommonTree COMMAND_CALL_PREFIX316_tree=null;
        RewriteRuleTokenStream stream_COMMAND_CALL_PREFIX=new RewriteRuleTokenStream(adaptor,"token COMMAND_CALL_PREFIX");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:483:12: ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==113) ) {
                alt46=1;
            }
            else if ( (LA46_0==COMMAND_CALL_PREFIX) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:484:4: 'callCommand:' stringLiteral
                    {
                    string_literal314=(Token)match(input,113,FOLLOW_113_in_commandCall3074);  
                    stream_113.add(string_literal314);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall3076);
                    stringLiteral315=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral315.getTree());

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
                    // 484:33: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:484:36: ^( COMMAND_CALL stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:485:6: COMMAND_CALL_PREFIX stringLiteral
                    {
                    COMMAND_CALL_PREFIX316=(Token)match(input,COMMAND_CALL_PREFIX,FOLLOW_COMMAND_CALL_PREFIX_in_commandCall3091);  
                    stream_COMMAND_CALL_PREFIX.add(COMMAND_CALL_PREFIX316);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall3093);
                    stringLiteral317=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral317.getTree());

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
                    // 485:40: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:485:43: ^( COMMAND_CALL stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:488:1: stringLiteral : '\"' ! ( . )* '\"' !;
    public final AtrophyScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        AtrophyScriptParser.stringLiteral_return retval = new AtrophyScriptParser.stringLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal318=null;
        Token wildcard319=null;
        Token char_literal320=null;

        CommonTree char_literal318_tree=null;
        CommonTree wildcard319_tree=null;
        CommonTree char_literal320_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:488:14: ( '\"' ! ( . )* '\"' !)
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:489:4: '\"' ! ( . )* '\"' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal318=(Token)match(input,87,FOLLOW_87_in_stringLiteral3116); 

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:489:9: ( . )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==87) ) {
                    alt47=2;
                }
                else if ( ((LA47_0 >= ADDTAG && LA47_0 <= ZONE)||(LA47_0 >= 88 && LA47_0 <= 181)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:489:9: .
            	    {
            	    wildcard319=(Token)input.LT(1);

            	    matchAny(input); 
            	    wildcard319_tree = (CommonTree)adaptor.create(wildcard319);
            	    adaptor.addChild(root_0, wildcard319_tree);


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            char_literal320=(Token)match(input,87,FOLLOW_87_in_stringLiteral3122); 

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


    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA45_eotS =
        "\13\uffff";
    static final String DFA45_eofS =
        "\13\uffff";
    static final String DFA45_minS =
        "\1\133\1\5\1\uffff\2\127\2\4\1\uffff\1\4\1\uffff\1\4";
    static final String DFA45_maxS =
        "\1\u00b5\1\u00b0\1\uffff\2\127\2\u00b5\1\uffff\1\u00b5\1\uffff\1"+
        "\u00b5";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\4\uffff\1\1\1\uffff\1\1\1\uffff";
    static final String DFA45_specialS =
        "\13\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\1\131\uffff\1\2",
            "\1\2\11\uffff\1\4\51\uffff\1\2\27\uffff\1\2\32\uffff\1\2\4"+
            "\uffff\1\3\1\2\2\uffff\1\2\2\uffff\1\2\14\uffff\1\2\2\uffff"+
            "\2\2\15\uffff\3\2\2\uffff\3\2\10\uffff\1\2\7\uffff\2\2",
            "",
            "\1\5",
            "\1\6",
            "\123\10\1\7\136\10",
            "\123\12\1\11\136\12",
            "",
            "\123\10\1\7\136\10",
            "",
            "\123\12\1\11\136\12"
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "()* loopback of 480:16: ( ',' ! commandCall )*";
        }
    }
 

    public static final BitSet FOLLOW_command_in_prog357 = new BitSet(new long[]{0x0000000000000000L,0x0809075D80000000L,0x0000161000400C00L});
    public static final BitSet FOLLOW_beginStatement_in_prog364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSize_in_command387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSpawns_in_command394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockDecl_in_command401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portalDecl_in_command408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textureBlockDecl_in_command415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerDecl_in_command422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandDecl_in_command429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_talkDecl_in_command436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_requiredAssignment449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_requiredAssignment451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requiredAssignment_in_varAssignment475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_mapSize502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_138_in_mapSize506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_mapSize509 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_mapSize511 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_mapSize513 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_mapSize515 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_mapSize517 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_mapSize519 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_mapSize521 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_mapSize523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_mapSize525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_mapSpawns550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_139_in_mapSpawns554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_mapSpawns557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0020000000000000L});
    public static final BitSet FOLLOW_stringList_in_mapSpawns559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_mapSpawns562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_blockDecl587 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_112_in_blockDecl591 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_varAssignment_in_blockDecl594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_blockDecl596 = new BitSet(new long[]{0x0000000000000000L,0x0040288200000000L,0x002E696B983E8040L});
    public static final BitSet FOLLOW_properties_in_blockDecl598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_blockDecl600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_portalDecl626 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_150_in_portalDecl630 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_varAssignment_in_portalDecl633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_portalDecl635 = new BitSet(new long[]{0x0000000000000000L,0x0040288200000000L,0x002E696B983E8040L});
    public static final BitSet FOLLOW_properties_in_portalDecl637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_portalDecl639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_textureBlockDecl665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_170_in_textureBlockDecl669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_169_in_textureBlockDecl673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_textureBlockDecl676 = new BitSet(new long[]{0x0000000000000000L,0x0040288200000000L,0x002E696B983E8040L});
    public static final BitSet FOLLOW_properties_in_textureBlockDecl678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_textureBlockDecl680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_triggerDecl704 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_172_in_triggerDecl708 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_triggerDecl711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_triggerDecl713 = new BitSet(new long[]{0x0000000000000000L,0x0040288200000000L,0x002E696B983E8040L});
    public static final BitSet FOLLOW_properties_in_triggerDecl715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_triggerDecl717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_commandDecl743 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_115_in_commandDecl747 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_commandDecl750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_commandDecl752 = new BitSet(new long[]{0x0200000000008020L,0x0126100000020000L,0x0001808073800320L});
    public static final BitSet FOLLOW_triggerEffectList_in_commandDecl754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_commandDecl756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_talkDecl786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_164_in_talkDecl790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_talkDecl793 = new BitSet(new long[]{0x0000000000000000L,0x0040288200000000L,0x002E696B983E8040L});
    public static final BitSet FOLLOW_properties_in_talkDecl795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_talkDecl797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xListProperty_in_properties821 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_yListProperty_in_properties828 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_factionTerritoryProperty_in_properties835 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_factionZoneProperty_in_properties842 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_saferoomProperty_in_properties849 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_stageProperty_in_properties856 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_stageDeclProperty_in_properties863 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_talkMapParentProperty_in_properties870 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_aiInitProperty_in_properties877 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_openingLineProperty_in_properties884 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_optionProperty_in_properties891 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_topicProperty_in_properties898 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_triggerCondProperty_in_properties905 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_triggerEffectProperty_in_properties912 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_coverDecl_in_properties919 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_stashDecl_in_properties926 = new BitSet(new long[]{0x0000000000000002L,0x0040288200000000L,0x000E696B983E8040L});
    public static final BitSet FOLLOW_177_in_xListProperty943 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty945 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_xListProperty948 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty949 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_178_in_yListProperty973 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty975 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_yListProperty978 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty979 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_168_in_factionTerritoryProperty1005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_factionTerritoryProperty1007 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_factionTerritoryProperty1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_factionZoneProperty1034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringList_in_factionZoneProperty1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_saferoomProperty1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_stageDeclProperty1080 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1082 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_stageDeclProperty1085 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1087 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_149_in_talkMapParentProperty1114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_148_in_talkMapParentProperty1118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_talkMapParentProperty1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_stageProperty1145 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_155_in_stageProperty1149 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_stageProperty1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_aiInitProperty1176 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_107_in_aiInitProperty1180 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BOOL_in_aiInitProperty1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_openingLineProperty1207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_145_in_openingLineProperty1211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_146_in_openingLineProperty1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_openingLineProperty1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_optionProperty1240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_147_in_optionProperty1244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_optionProperty1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_topicProperty1271 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_171_in_topicProperty1275 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_topicProperty1278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_topicProperty1280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000004000080L});
    public static final BitSet FOLLOW_topicProperties_in_topicProperty1282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_topicProperty1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topicLine_in_topicProperties1311 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000080L});
    public static final BitSet FOLLOW_topicRequiement_in_topicProperties1315 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000080L});
    public static final BitSet FOLLOW_135_in_topicLine1332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_topicLine1333 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_topicLine1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_topicLine1338 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_154_in_topicRequiement1364 = new BitSet(new long[]{0x0001000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_reqString_in_topicRequiement1366 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_topicRequiement1369 = new BitSet(new long[]{0x0001000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_reqString_in_topicRequiement1371 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_NOT_PREFIX_in_reqString1397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_reqString1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_reqString1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_aliveQuery1429 = new BitSet(new long[]{0x0000000000000000L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_unitInfo_in_aliveQuery1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_timeQuery1454 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_boolQuery1476 = new BitSet(new long[]{0x0000000000000000L,0x2000000012000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_queryLogic_in_boolQuery1479 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_boolQuery1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aliveQuery_in_boolQuery1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeQuery_in_boolQuery1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolQuery_in_queryNegation1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_queryNegation1513 = new BitSet(new long[]{0x0000000000000000L,0x2000000002000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_boolQuery_in_queryNegation1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1539 = new BitSet(new long[]{0x0000000000000002L,0x0000002040000000L});
    public static final BitSet FOLLOW_94_in_queryLogic1544 = new BitSet(new long[]{0x0000000000000000L,0x2000000012000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_queryLogic1565 = new BitSet(new long[]{0x0000000000000000L,0x2000000012000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_triggerCondProperty1609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_173_in_triggerCondProperty1613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_triggerCondProperty1616 = new BitSet(new long[]{0x0000000000000000L,0x2000000012000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_queryLogic_in_triggerCondProperty1618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_triggerCondProperty1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_triggerEffectProperty1642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_174_in_triggerEffectProperty1646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_triggerEffectProperty1649 = new BitSet(new long[]{0x0200000000008020L,0x0126100000020000L,0x0001808073800320L});
    public static final BitSet FOLLOW_triggerEffectList_in_triggerEffectProperty1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_triggerEffectProperty1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_coverDecl1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_118_in_coverDecl1681 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_varAssignment_in_coverDecl1684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_coverDecl1686 = new BitSet(new long[]{0x0000000000000000L,0x0040288200000000L,0x002E696B983E8040L});
    public static final BitSet FOLLOW_properties_in_coverDecl1688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_coverDecl1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_stashDecl1716 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_161_in_stashDecl1720 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_varAssignment_in_stashDecl1723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_stashDecl1725 = new BitSet(new long[]{0x0000000000000000L,0x0040288200000000L,0x002E696B983E8040L});
    public static final BitSet FOLLOW_properties_in_stashDecl1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_stashDecl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1752 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_triggerEffectList1755 = new BitSet(new long[]{0x0200000000008020L,0x0126100000020000L,0x0001808073800320L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1758 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_updateTalkTree_in_triggerEffect1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnTeam_in_triggerEffect1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnCharacter_in_triggerEffect1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeUnit_in_triggerEffect1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_killUnit_in_triggerEffect1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_teleportUnit_in_triggerEffect1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_converseUnit_in_triggerEffect1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createSaferoom_in_triggerEffect1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeSaferoom_in_triggerEffect1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loadMap_in_triggerEffect1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lockDoor_in_triggerEffect1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlockDoor_in_triggerEffect1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addTag_in_triggerEffect1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeTag_in_triggerEffect1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directorBias_in_triggerEffect1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeAiNode_in_triggerEffect1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCallList_in_triggerEffect1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_updateTalkTree1900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree1902 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree1921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree1923 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_updateTalkTree1925 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_isName1952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringList_in_isName1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_isFaction1977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringList_in_isFaction1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_hasItem2002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringList_in_hasItem2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_hasWeapon2027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringList_in_hasWeapon2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList2052 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_stringList2055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList2058 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_124_in_isAlive2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_isDead2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_isInvestigated2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_isNotInvestigated2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_isDaemon2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_isNotDaemon2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_teleDestination2197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_teleDestination2199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_xListProperty_in_teleDestination2201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_yListProperty_in_teleDestination2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_teleDestination2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_maxTeamSize2230 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_maxTeamSize2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_minTeamSize2253 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_minTeamSize2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_aiNode2278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_aiNode2280 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0020000400000000L});
    public static final BitSet FOLLOW_aiNodeOptions_in_aiNode2282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_aiNode2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subscribeTalkMaps_in_aiNodeOptions2307 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_behaviours_in_aiNodeOptions2312 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_162_in_subscribeTalkMaps2329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringList_in_subscribeTalkMaps2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_behaviours2353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringList_in_behaviours2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_unitInfo2379 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_isFaction_in_unitInfo2386 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_hasItem_in_unitInfo2393 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_hasWeapon_in_unitInfo2400 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_isAlive_in_unitInfo2407 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_isDead_in_unitInfo2414 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_isInvestigated_in_unitInfo2421 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_isNotInvestigated_in_unitInfo2428 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_isDaemon_in_unitInfo2435 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_isNotDaemon_in_unitInfo2442 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_teleDestination_in_unitInfo2449 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_maxTeamSize_in_unitInfo2456 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_minTeamSize_in_unitInfo2463 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_aiNode_in_unitInfo2470 = new BitSet(new long[]{0x0000000000000002L,0xD680400000000000L,0x000000000000301FL});
    public static final BitSet FOLLOW_158_in_spawnTeam2489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_spawnTeam2491 = new BitSet(new long[]{0x0000000000000000L,0xD680400000000000L,0x002000000000301FL});
    public static final BitSet FOLLOW_unitInfo_in_spawnTeam2493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_spawnTeam2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_spawnCharacter2518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_spawnCharacter2520 = new BitSet(new long[]{0x0000000000000000L,0xD680400000000000L,0x002000000000301FL});
    public static final BitSet FOLLOW_unitInfo_in_spawnCharacter2522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_spawnCharacter2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_removeUnit2547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_removeUnit2549 = new BitSet(new long[]{0x0000000000000000L,0xD680400000000000L,0x002000000000301FL});
    public static final BitSet FOLLOW_unitInfo_in_removeUnit2551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_removeUnit2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_killUnit2576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_killUnit2578 = new BitSet(new long[]{0x0000000000000000L,0xD680400000000000L,0x002000000000301FL});
    public static final BitSet FOLLOW_unitInfo_in_killUnit2580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_killUnit2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_teleportUnit2605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_teleportUnit2607 = new BitSet(new long[]{0x0000000000000000L,0xD680400000000000L,0x002000000000301FL});
    public static final BitSet FOLLOW_unitInfo_in_teleportUnit2609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_teleportUnit2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_converseUnit2634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_converseUnit2636 = new BitSet(new long[]{0x0000000000000000L,0xD680400000000000L,0x002000000000301FL});
    public static final BitSet FOLLOW_unitInfo_in_converseUnit2638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_converseUnit2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_createSaferoom2663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_createSaferoom2665 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0020000000000004L});
    public static final BitSet FOLLOW_saferoomInfo_in_createSaferoom2667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_createSaferoom2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_removeSaferoom2692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_removeSaferoom2694 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0020000000000004L});
    public static final BitSet FOLLOW_saferoomInfo_in_removeSaferoom2696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_removeSaferoom2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_containsFaction2721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringList_in_containsFaction2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsFaction_in_saferoomInfo2747 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_isName_in_saferoomInfo2754 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_136_in_loadMap2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_loadMap2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_lockDoor2796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_lockDoor2798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_doorInfo_in_lockDoor2800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_lockDoor2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_unlockDoor2825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_unlockDoor2827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_doorInfo_in_unlockDoor2829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_unlockDoor2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_doorInfo2854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringList_in_doorInfo2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_addTag2879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_TAG_PREFIX_in_addTag2896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_removeTag2921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_TAG_PREFIX_in_removeTag2938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_directorBias2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_changeAiNode2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_beginStatement3007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_123_in_beginStatement3011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_beginStatement3014 = new BitSet(new long[]{0x0000000000008000L,0x0002000000000000L});
    public static final BitSet FOLLOW_commandCallList_in_beginStatement3019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_181_in_beginStatement3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList3051 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_commandCallList3054 = new BitSet(new long[]{0x0000000000008000L,0x0002000000000000L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList3057 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_113_in_commandCall3074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_CALL_PREFIX_in_commandCall3091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_stringLiteral3116 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x003FFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_87_in_stringLiteral3122 = new BitSet(new long[]{0x0000000000000002L});

}