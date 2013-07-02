// $ANTLR 3.4 C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g 2013-07-02 14:10:05

	package atrophy.combat.level;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AtrophyScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDTAG", "ADD_TAG_PREFIX", "AIINIT", "AINODE", "AND", "BEHAVIOUR", "BLOCK", "BOOL", "CHANGEAINODE", "COMMAND", "COMMAND_CALL", "COMMAND_CALL_PREFIX", "COMMENT", "CONTAINSFACTION", "CONVERSE", "COVER", "DIRECTORBIAS", "DOORNAMES", "EMPTY", "ENG", "EXPIREREPEATS", "EXPIRETIME", "HASITEM", "HASWEAPON", "IDENT", "INIT", "INROOM", "INT", "ISALIVE", "ISDAEMON", "ISDEAD", "ISFACTION", "ISINVESTIGATED", "ISNAME", "ISNOTDAEMON", "ISNOTINVESTIGATED", "KILLUNIT", "LINE", "LOADMAP", "LOCKDOOR", "LOGIC", "MAPSIZE", "MAPSPAWNS", "MAXTEAMSIZE", "MED", "MINTEAMSIZE", "MULTILINE_COMMENT", "NEGATION", "NOT_PREFIX", "ONTIME", "OPENINGLINE", "OPTION", "OR", "PORTAL", "PRIORITY", "REMOVESAFEROOM", "REMOVETAG", "REMOVEUNIT", "REMOVE_TAG_PREFIX", "REQ", "SAFEROOM", "SCI", "SETTRIGGERRUNNING", "SHOWMESSAGE", "SPAWNCHARACTER", "SPAWNITEM", "SPAWNTEAM", "STAGELIST", "STASH", "STRING", "SUBSCRIBE", "TALK", "TALKMAP", "TALKPARENT", "TALKSTAGE", "TELEDEST", "TELEPORT", "TERRITORY", "TEXTURE", "TEXTUREBLOCK", "TOPIC", "TRIGGER", "TRIGGERCOND", "TRIGGEREFFECT", "TRIGGERTYPE", "UNLOCKDOOR", "UPDATETALK", "UPDATE_TREE_PREFIX", "VAR", "WEP", "WS", "XLIST", "YLIST", "ZONE", "'\"'", "'#'", "'('", "')'", "','", "'::'", "'AND'", "'BLOCK'", "'COMMAND'", "'COVER'", "'INIT'", "'MAPSIZE'", "'MAPSPAWNS'", "'OR'", "'PORTAL'", "'STASH'", "'TALK'", "'TEXTUREBLOCK'", "'TRIGGER'", "'a:'", "'addTag:'", "'aiInit:'", "'aiNode'", "'behaviours:'", "'block'", "'callCommand:'", "'changeAiNode'", "'command'", "'containsFaction:'", "'converse'", "'cover'", "'destination'", "'directorBias:'", "'engChance:'", "'expireRepeats:'", "'expireTime:'", "'hasItem:'", "'hasWeapon:'", "'init'", "'isAlive'", "'isDaemon'", "'isDead'", "'isFaction:'", "'isInvestigated'", "'isName:'", "'isNotDaemon'", "'isNotInvestigated'", "'isPlayer'", "'killUnit'", "'l:'", "'lines:'", "'loadMap'", "'lockDoor'", "'mapsize'", "'mapspawns'", "'maxTeamSize:'", "'medChance:'", "'minTeamSize:'", "'o:'", "'onTime:'", "'opening:'", "'openingLine:'", "'option:'", "'p:'", "'parent:'", "'portal'", "'priority:'", "'removeSaferoom'", "'removeTag:'", "'removeUnit'", "'req:'", "'s:'", "'saferoom'", "'sciChance'", "'setTriggerRunning:'", "'showMessage:'", "'spawnCharacter'", "'spawnItem'", "'spawnTeam'", "'stage:'", "'stages:'", "'stash'", "'subscribe:'", "'t:'", "'talk'", "'tc'", "'te'", "'teleport'", "'territory:'", "'textureBlock'", "'textureblock'", "'topic'", "'trigger'", "'triggerCond'", "'triggerEffect'", "'unlockDoor'", "'updateTalk:'", "'wepChance:'", "'x:'", "'y:'", "'zone:'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__182=182;
    public static final int T__183=183;
    public static final int T__184=184;
    public static final int T__185=185;
    public static final int T__186=186;
    public static final int T__187=187;
    public static final int T__188=188;
    public static final int T__189=189;
    public static final int T__190=190;
    public static final int T__191=191;
    public static final int T__192=192;
    public static final int T__193=193;
    public static final int T__194=194;
    public static final int T__195=195;
    public static final int T__196=196;
    public static final int T__197=197;
    public static final int T__198=198;
    public static final int T__199=199;
    public static final int T__200=200;
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
    public static final int ENG=23;
    public static final int EXPIREREPEATS=24;
    public static final int EXPIRETIME=25;
    public static final int HASITEM=26;
    public static final int HASWEAPON=27;
    public static final int IDENT=28;
    public static final int INIT=29;
    public static final int INROOM=30;
    public static final int INT=31;
    public static final int ISALIVE=32;
    public static final int ISDAEMON=33;
    public static final int ISDEAD=34;
    public static final int ISFACTION=35;
    public static final int ISINVESTIGATED=36;
    public static final int ISNAME=37;
    public static final int ISNOTDAEMON=38;
    public static final int ISNOTINVESTIGATED=39;
    public static final int KILLUNIT=40;
    public static final int LINE=41;
    public static final int LOADMAP=42;
    public static final int LOCKDOOR=43;
    public static final int LOGIC=44;
    public static final int MAPSIZE=45;
    public static final int MAPSPAWNS=46;
    public static final int MAXTEAMSIZE=47;
    public static final int MED=48;
    public static final int MINTEAMSIZE=49;
    public static final int MULTILINE_COMMENT=50;
    public static final int NEGATION=51;
    public static final int NOT_PREFIX=52;
    public static final int ONTIME=53;
    public static final int OPENINGLINE=54;
    public static final int OPTION=55;
    public static final int OR=56;
    public static final int PORTAL=57;
    public static final int PRIORITY=58;
    public static final int REMOVESAFEROOM=59;
    public static final int REMOVETAG=60;
    public static final int REMOVEUNIT=61;
    public static final int REMOVE_TAG_PREFIX=62;
    public static final int REQ=63;
    public static final int SAFEROOM=64;
    public static final int SCI=65;
    public static final int SETTRIGGERRUNNING=66;
    public static final int SHOWMESSAGE=67;
    public static final int SPAWNCHARACTER=68;
    public static final int SPAWNITEM=69;
    public static final int SPAWNTEAM=70;
    public static final int STAGELIST=71;
    public static final int STASH=72;
    public static final int STRING=73;
    public static final int SUBSCRIBE=74;
    public static final int TALK=75;
    public static final int TALKMAP=76;
    public static final int TALKPARENT=77;
    public static final int TALKSTAGE=78;
    public static final int TELEDEST=79;
    public static final int TELEPORT=80;
    public static final int TERRITORY=81;
    public static final int TEXTURE=82;
    public static final int TEXTUREBLOCK=83;
    public static final int TOPIC=84;
    public static final int TRIGGER=85;
    public static final int TRIGGERCOND=86;
    public static final int TRIGGEREFFECT=87;
    public static final int TRIGGERTYPE=88;
    public static final int UNLOCKDOOR=89;
    public static final int UPDATETALK=90;
    public static final int UPDATE_TREE_PREFIX=91;
    public static final int VAR=92;
    public static final int WEP=93;
    public static final int WS=94;
    public static final int XLIST=95;
    public static final int YLIST=96;
    public static final int ZONE=97;

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:100:1: prog : ( command )* ( beginStatement )? EOF ;
    public final AtrophyScriptParser.prog_return prog() throws RecognitionException {
        AtrophyScriptParser.prog_return retval = new AtrophyScriptParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        AtrophyScriptParser.command_return command1 =null;

        AtrophyScriptParser.beginStatement_return beginStatement2 =null;


        CommonTree EOF3_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:100:5: ( ( command )* ( beginStatement )? EOF )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:101:5: ( command )* ( beginStatement )? EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:101:5: ( command )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 105 && LA1_0 <= 106)||(LA1_0 >= 109 && LA1_0 <= 110)||LA1_0==112||(LA1_0 >= 114 && LA1_0 <= 116)||LA1_0==122||LA1_0==125||(LA1_0 >= 151 && LA1_0 <= 152)||LA1_0==163||LA1_0==182||(LA1_0 >= 187 && LA1_0 <= 188)||LA1_0==190) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:101:5: command
            	    {
            	    pushFollow(FOLLOW_command_in_prog393);
            	    command1=command();

            	    state._fsp--;

            	    adaptor.addChild(root_0, command1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:102:5: ( beginStatement )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==108||LA2_0==136) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:102:5: beginStatement
                    {
                    pushFollow(FOLLOW_beginStatement_in_prog400);
                    beginStatement2=beginStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, beginStatement2.getTree());

                    }
                    break;

            }


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog407); 
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:106:1: command : ( mapSize | mapSpawns | blockDecl | portalDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl );
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
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:106:8: ( mapSize | mapSpawns | blockDecl | portalDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 109:
            case 151:
                {
                alt3=1;
                }
                break;
            case 110:
            case 152:
                {
                alt3=2;
                }
                break;
            case 105:
            case 122:
                {
                alt3=3;
                }
                break;
            case 112:
            case 163:
                {
                alt3=4;
                }
                break;
            case 115:
            case 187:
            case 188:
                {
                alt3=5;
                }
                break;
            case 116:
            case 190:
                {
                alt3=6;
                }
                break;
            case 106:
            case 125:
                {
                alt3=7;
                }
                break;
            case 114:
            case 182:
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:107:4: mapSize
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSize_in_command423);
                    mapSize4=mapSize();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSize4.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:108:6: mapSpawns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSpawns_in_command430);
                    mapSpawns5=mapSpawns();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSpawns5.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:109:6: blockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_blockDecl_in_command437);
                    blockDecl6=blockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, blockDecl6.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:110:6: portalDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_portalDecl_in_command444);
                    portalDecl7=portalDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, portalDecl7.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:111:6: textureBlockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_textureBlockDecl_in_command451);
                    textureBlockDecl8=textureBlockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, textureBlockDecl8.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:112:6: triggerDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_triggerDecl_in_command458);
                    triggerDecl9=triggerDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, triggerDecl9.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:6: commandDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandDecl_in_command465);
                    commandDecl10=commandDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, commandDecl10.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:114:6: talkDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_talkDecl_in_command472);
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:1: requiredAssignment : '::' stringLiteral -> ^( VAR stringLiteral ) ;
    public final AtrophyScriptParser.requiredAssignment_return requiredAssignment() throws RecognitionException {
        AtrophyScriptParser.requiredAssignment_return retval = new AtrophyScriptParser.requiredAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal12=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral13 =null;


        CommonTree string_literal12_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:19: ( '::' stringLiteral -> ^( VAR stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:118:4: '::' stringLiteral
            {
            string_literal12=(Token)match(input,103,FOLLOW_103_in_requiredAssignment485);  
            stream_103.add(string_literal12);


            pushFollow(FOLLOW_stringLiteral_in_requiredAssignment487);
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
            // 118:23: -> ^( VAR stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:118:26: ^( VAR stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:1: varAssignment : ( requiredAssignment | -> ^( EMPTY ) );
    public final AtrophyScriptParser.varAssignment_return varAssignment() throws RecognitionException {
        AtrophyScriptParser.varAssignment_return retval = new AtrophyScriptParser.varAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.requiredAssignment_return requiredAssignment14 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:14: ( requiredAssignment | -> ^( EMPTY ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==103) ) {
                alt4=1;
            }
            else if ( (LA4_0==199) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:122:4: requiredAssignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_requiredAssignment_in_varAssignment511);
                    requiredAssignment14=requiredAssignment();

                    state._fsp--;

                    adaptor.addChild(root_0, requiredAssignment14.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:6: 
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
                    // 123:6: -> ^( EMPTY )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:9: ^( EMPTY )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:126:1: mapSize : ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) ;
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
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:126:8: ( ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:4: ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:4: ( 'MAPSIZE' | 'mapsize' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==109) ) {
                alt5=1;
            }
            else if ( (LA5_0==151) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:5: 'MAPSIZE'
                    {
                    string_literal15=(Token)match(input,109,FOLLOW_109_in_mapSize538);  
                    stream_109.add(string_literal15);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:17: 'mapsize'
                    {
                    string_literal16=(Token)match(input,151,FOLLOW_151_in_mapSize542);  
                    stream_151.add(string_literal16);


                    }
                    break;

            }


            char_literal17=(Token)match(input,199,FOLLOW_199_in_mapSize545);  
            stream_199.add(char_literal17);


            INT18=(Token)match(input,INT,FOLLOW_INT_in_mapSize547);  
            stream_INT.add(INT18);


            char_literal19=(Token)match(input,102,FOLLOW_102_in_mapSize549);  
            stream_102.add(char_literal19);


            INT20=(Token)match(input,INT,FOLLOW_INT_in_mapSize551);  
            stream_INT.add(INT20);


            char_literal21=(Token)match(input,102,FOLLOW_102_in_mapSize553);  
            stream_102.add(char_literal21);


            INT22=(Token)match(input,INT,FOLLOW_INT_in_mapSize555);  
            stream_INT.add(INT22);


            char_literal23=(Token)match(input,102,FOLLOW_102_in_mapSize557);  
            stream_102.add(char_literal23);


            INT24=(Token)match(input,INT,FOLLOW_INT_in_mapSize559);  
            stream_INT.add(INT24);


            char_literal25=(Token)match(input,200,FOLLOW_200_in_mapSize561);  
            stream_200.add(char_literal25);


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
            // 127:64: -> ^( MAPSIZE ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:67: ^( MAPSIZE ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSIZE, "MAPSIZE")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:77: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:130:1: mapSpawns : ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) ;
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
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:130:10: ( ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:4: ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:4: ( 'MAPSPAWNS' | 'mapspawns' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==110) ) {
                alt6=1;
            }
            else if ( (LA6_0==152) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:5: 'MAPSPAWNS'
                    {
                    string_literal26=(Token)match(input,110,FOLLOW_110_in_mapSpawns586);  
                    stream_110.add(string_literal26);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:19: 'mapspawns'
                    {
                    string_literal27=(Token)match(input,152,FOLLOW_152_in_mapSpawns590);  
                    stream_152.add(string_literal27);


                    }
                    break;

            }


            char_literal28=(Token)match(input,199,FOLLOW_199_in_mapSpawns593);  
            stream_199.add(char_literal28);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:36: ( stringList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==98) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:36: stringList
                    {
                    pushFollow(FOLLOW_stringList_in_mapSpawns595);
                    stringList29=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList29.getTree());

                    }
                    break;

            }


            char_literal30=(Token)match(input,200,FOLLOW_200_in_mapSpawns598);  
            stream_200.add(char_literal30);


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
            // 131:52: -> ^( MAPSPAWNS ( stringList )? )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:55: ^( MAPSPAWNS ( stringList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSPAWNS, "MAPSPAWNS")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:67: ( stringList )?
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:134:1: blockDecl : ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) ;
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
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:134:10: ( ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:135:4: ( 'BLOCK' | 'block' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:135:4: ( 'BLOCK' | 'block' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==105) ) {
                alt8=1;
            }
            else if ( (LA8_0==122) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:135:5: 'BLOCK'
                    {
                    string_literal31=(Token)match(input,105,FOLLOW_105_in_blockDecl623);  
                    stream_105.add(string_literal31);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:135:15: 'block'
                    {
                    string_literal32=(Token)match(input,122,FOLLOW_122_in_blockDecl627);  
                    stream_122.add(string_literal32);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_blockDecl630);
            varAssignment33=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment33.getTree());

            char_literal34=(Token)match(input,199,FOLLOW_199_in_blockDecl632);  
            stream_199.add(char_literal34);


            pushFollow(FOLLOW_properties_in_blockDecl634);
            properties35=properties();

            state._fsp--;

            stream_properties.add(properties35.getTree());

            char_literal36=(Token)match(input,200,FOLLOW_200_in_blockDecl636);  
            stream_200.add(char_literal36);


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
            // 135:57: -> ^( BLOCK varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:135:60: ^( BLOCK varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:138:1: portalDecl : ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) ;
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
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:138:11: ( ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:139:4: ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:139:4: ( 'PORTAL' | 'portal' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==112) ) {
                alt9=1;
            }
            else if ( (LA9_0==163) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:139:5: 'PORTAL'
                    {
                    string_literal37=(Token)match(input,112,FOLLOW_112_in_portalDecl662);  
                    stream_112.add(string_literal37);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:139:16: 'portal'
                    {
                    string_literal38=(Token)match(input,163,FOLLOW_163_in_portalDecl666);  
                    stream_163.add(string_literal38);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_portalDecl669);
            varAssignment39=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment39.getTree());

            char_literal40=(Token)match(input,199,FOLLOW_199_in_portalDecl671);  
            stream_199.add(char_literal40);


            pushFollow(FOLLOW_properties_in_portalDecl673);
            properties41=properties();

            state._fsp--;

            stream_properties.add(properties41.getTree());

            char_literal42=(Token)match(input,200,FOLLOW_200_in_portalDecl675);  
            stream_200.add(char_literal42);


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
            // 139:59: -> ^( PORTAL varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:139:62: ^( PORTAL varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:1: textureBlockDecl : ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) ;
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
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:17: ( ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt10=1;
                }
                break;
            case 188:
                {
                alt10=2;
                }
                break;
            case 187:
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:5: 'TEXTUREBLOCK'
                    {
                    string_literal43=(Token)match(input,115,FOLLOW_115_in_textureBlockDecl701);  
                    stream_115.add(string_literal43);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:22: 'textureblock'
                    {
                    string_literal44=(Token)match(input,188,FOLLOW_188_in_textureBlockDecl705);  
                    stream_188.add(string_literal44);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:39: 'textureBlock'
                    {
                    string_literal45=(Token)match(input,187,FOLLOW_187_in_textureBlockDecl709);  
                    stream_187.add(string_literal45);


                    }
                    break;

            }


            char_literal46=(Token)match(input,199,FOLLOW_199_in_textureBlockDecl712);  
            stream_199.add(char_literal46);


            pushFollow(FOLLOW_properties_in_textureBlockDecl714);
            properties47=properties();

            state._fsp--;

            stream_properties.add(properties47.getTree());

            char_literal48=(Token)match(input,200,FOLLOW_200_in_textureBlockDecl716);  
            stream_200.add(char_literal48);


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
            // 143:74: -> ^( TEXTUREBLOCK properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:77: ^( TEXTUREBLOCK properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:146:1: triggerDecl : ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) ;
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
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:146:12: ( ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:4: ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:4: ( 'TRIGGER' | 'trigger' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==116) ) {
                alt11=1;
            }
            else if ( (LA11_0==190) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:5: 'TRIGGER'
                    {
                    string_literal49=(Token)match(input,116,FOLLOW_116_in_triggerDecl740);  
                    stream_116.add(string_literal49);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:17: 'trigger'
                    {
                    string_literal50=(Token)match(input,190,FOLLOW_190_in_triggerDecl744);  
                    stream_190.add(string_literal50);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_triggerDecl747);
            requiredAssignment51=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment51.getTree());

            char_literal52=(Token)match(input,199,FOLLOW_199_in_triggerDecl749);  
            stream_199.add(char_literal52);


            pushFollow(FOLLOW_properties_in_triggerDecl751);
            properties53=properties();

            state._fsp--;

            stream_properties.add(properties53.getTree());

            char_literal54=(Token)match(input,200,FOLLOW_200_in_triggerDecl753);  
            stream_200.add(char_literal54);


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
            // 147:66: -> ^( TRIGGER requiredAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:69: ^( TRIGGER requiredAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:1: commandDecl : ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) ;
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
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:12: ( ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:4: ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:4: ( 'COMMAND' | 'command' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==106) ) {
                alt12=1;
            }
            else if ( (LA12_0==125) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:5: 'COMMAND'
                    {
                    string_literal55=(Token)match(input,106,FOLLOW_106_in_commandDecl779);  
                    stream_106.add(string_literal55);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:17: 'command'
                    {
                    string_literal56=(Token)match(input,125,FOLLOW_125_in_commandDecl783);  
                    stream_125.add(string_literal56);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_commandDecl786);
            requiredAssignment57=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment57.getTree());

            char_literal58=(Token)match(input,199,FOLLOW_199_in_commandDecl788);  
            stream_199.add(char_literal58);


            pushFollow(FOLLOW_triggerEffectList_in_commandDecl790);
            triggerEffectList59=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList59.getTree());

            char_literal60=(Token)match(input,200,FOLLOW_200_in_commandDecl792);  
            stream_200.add(char_literal60);


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
            // 151:73: -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:76: ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COMMAND, "COMMAND")
                , root_1);

                adaptor.addChild(root_1, stream_requiredAssignment.nextTree());

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:105: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:1: talkDecl : ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) ;
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
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:9: ( ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:4: ( 'TALK' | 'talk' ) '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:4: ( 'TALK' | 'talk' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==114) ) {
                alt13=1;
            }
            else if ( (LA13_0==182) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:5: 'TALK'
                    {
                    string_literal61=(Token)match(input,114,FOLLOW_114_in_talkDecl822);  
                    stream_114.add(string_literal61);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:14: 'talk'
                    {
                    string_literal62=(Token)match(input,182,FOLLOW_182_in_talkDecl826);  
                    stream_182.add(string_literal62);


                    }
                    break;

            }


            char_literal63=(Token)match(input,199,FOLLOW_199_in_talkDecl829);  
            stream_199.add(char_literal63);


            pushFollow(FOLLOW_properties_in_talkDecl831);
            properties64=properties();

            state._fsp--;

            stream_properties.add(properties64.getTree());

            char_literal65=(Token)match(input,200,FOLLOW_200_in_talkDecl833);  
            stream_200.add(char_literal65);


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
            // 155:41: -> ^( TALK properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:44: ^( TALK properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:1: properties : ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )* ;
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
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:11: ( ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )*
            loop14:
            do {
                int alt14=17;
                switch ( input.LA(1) ) {
                case 196:
                    {
                    alt14=1;
                    }
                    break;
                case 197:
                    {
                    alt14=2;
                    }
                    break;
                case 186:
                    {
                    alt14=3;
                    }
                    break;
                case 198:
                    {
                    alt14=4;
                    }
                    break;
                case 170:
                    {
                    alt14=5;
                    }
                    break;
                case 169:
                case 177:
                    {
                    alt14=6;
                    }
                    break;
                case 178:
                    {
                    alt14=7;
                    }
                    break;
                case 161:
                case 162:
                    {
                    alt14=8;
                    }
                    break;
                case 117:
                case 119:
                    {
                    alt14=9;
                    }
                    break;
                case 156:
                case 158:
                case 159:
                    {
                    alt14=10;
                    }
                    break;
                case 147:
                case 160:
                    {
                    alt14=11;
                    }
                    break;
                case 181:
                case 189:
                    {
                    alt14=12;
                    }
                    break;
                case 183:
                case 191:
                    {
                    alt14=13;
                    }
                    break;
                case 184:
                case 192:
                    {
                    alt14=14;
                    }
                    break;
                case 107:
                case 128:
                    {
                    alt14=15;
                    }
                    break;
                case 113:
                case 179:
                    {
                    alt14=16;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:5: xListProperty
            	    {
            	    pushFollow(FOLLOW_xListProperty_in_properties857);
            	    xListProperty66=xListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xListProperty66.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:160:6: yListProperty
            	    {
            	    pushFollow(FOLLOW_yListProperty_in_properties864);
            	    yListProperty67=yListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, yListProperty67.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:161:6: factionTerritoryProperty
            	    {
            	    pushFollow(FOLLOW_factionTerritoryProperty_in_properties871);
            	    factionTerritoryProperty68=factionTerritoryProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionTerritoryProperty68.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:6: factionZoneProperty
            	    {
            	    pushFollow(FOLLOW_factionZoneProperty_in_properties878);
            	    factionZoneProperty69=factionZoneProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionZoneProperty69.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:6: saferoomProperty
            	    {
            	    pushFollow(FOLLOW_saferoomProperty_in_properties885);
            	    saferoomProperty70=saferoomProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, saferoomProperty70.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:164:6: stageProperty
            	    {
            	    pushFollow(FOLLOW_stageProperty_in_properties892);
            	    stageProperty71=stageProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageProperty71.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:165:6: stageDeclProperty
            	    {
            	    pushFollow(FOLLOW_stageDeclProperty_in_properties899);
            	    stageDeclProperty72=stageDeclProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageDeclProperty72.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:6: talkMapParentProperty
            	    {
            	    pushFollow(FOLLOW_talkMapParentProperty_in_properties906);
            	    talkMapParentProperty73=talkMapParentProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, talkMapParentProperty73.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:6: aiInitProperty
            	    {
            	    pushFollow(FOLLOW_aiInitProperty_in_properties913);
            	    aiInitProperty74=aiInitProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiInitProperty74.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:168:6: openingLineProperty
            	    {
            	    pushFollow(FOLLOW_openingLineProperty_in_properties920);
            	    openingLineProperty75=openingLineProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, openingLineProperty75.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:169:6: optionProperty
            	    {
            	    pushFollow(FOLLOW_optionProperty_in_properties927);
            	    optionProperty76=optionProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, optionProperty76.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:6: topicProperty
            	    {
            	    pushFollow(FOLLOW_topicProperty_in_properties934);
            	    topicProperty77=topicProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicProperty77.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:6: triggerCondProperty
            	    {
            	    pushFollow(FOLLOW_triggerCondProperty_in_properties941);
            	    triggerCondProperty78=triggerCondProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerCondProperty78.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:172:6: triggerEffectProperty
            	    {
            	    pushFollow(FOLLOW_triggerEffectProperty_in_properties948);
            	    triggerEffectProperty79=triggerEffectProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffectProperty79.getTree());

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:173:6: coverDecl
            	    {
            	    pushFollow(FOLLOW_coverDecl_in_properties955);
            	    coverDecl80=coverDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, coverDecl80.getTree());

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:6: stashDecl
            	    {
            	    pushFollow(FOLLOW_stashDecl_in_properties962);
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:177:1: xListProperty : 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) ;
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
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:177:14: ( 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:4: 'x:' INT ( ',' INT )*
            {
            string_literal82=(Token)match(input,196,FOLLOW_196_in_xListProperty979);  
            stream_196.add(string_literal82);


            INT83=(Token)match(input,INT,FOLLOW_INT_in_xListProperty981);  
            stream_INT.add(INT83);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:13: ( ',' INT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==102) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:14: ',' INT
            	    {
            	    char_literal84=(Token)match(input,102,FOLLOW_102_in_xListProperty984);  
            	    stream_102.add(char_literal84);


            	    INT85=(Token)match(input,INT,FOLLOW_INT_in_xListProperty985);  
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
            // 178:23: -> ^( XLIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:26: ^( XLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(XLIST, "XLIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:34: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:181:1: yListProperty : 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) ;
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
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:181:14: ( 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:4: 'y:' INT ( ',' INT )*
            {
            string_literal86=(Token)match(input,197,FOLLOW_197_in_yListProperty1009);  
            stream_197.add(string_literal86);


            INT87=(Token)match(input,INT,FOLLOW_INT_in_yListProperty1011);  
            stream_INT.add(INT87);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:13: ( ',' INT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==102) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:14: ',' INT
            	    {
            	    char_literal88=(Token)match(input,102,FOLLOW_102_in_yListProperty1014);  
            	    stream_102.add(char_literal88);


            	    INT89=(Token)match(input,INT,FOLLOW_INT_in_yListProperty1015);  
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
            // 182:23: -> ^( YLIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:26: ^( YLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(YLIST, "YLIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:34: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:185:1: factionTerritoryProperty : 'territory:' stringLiteral INT -> ^( TERRITORY ^( STRING stringLiteral ) INT ) ;
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
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:185:25: ( 'territory:' stringLiteral INT -> ^( TERRITORY ^( STRING stringLiteral ) INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:4: 'territory:' stringLiteral INT
            {
            string_literal90=(Token)match(input,186,FOLLOW_186_in_factionTerritoryProperty1041);  
            stream_186.add(string_literal90);


            pushFollow(FOLLOW_stringLiteral_in_factionTerritoryProperty1043);
            stringLiteral91=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral91.getTree());

            INT92=(Token)match(input,INT,FOLLOW_INT_in_factionTerritoryProperty1045);  
            stream_INT.add(INT92);


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
            // 186:35: -> ^( TERRITORY ^( STRING stringLiteral ) INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:38: ^( TERRITORY ^( STRING stringLiteral ) INT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TERRITORY, "TERRITORY")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:50: ^( STRING stringLiteral )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STRING, "STRING")
                , root_2);

                adaptor.addChild(root_2, stream_stringLiteral.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:1: factionZoneProperty : 'zone:' stringList -> ^( ZONE stringList ) ;
    public final AtrophyScriptParser.factionZoneProperty_return factionZoneProperty() throws RecognitionException {
        AtrophyScriptParser.factionZoneProperty_return retval = new AtrophyScriptParser.factionZoneProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal93=null;
        AtrophyScriptParser.stringList_return stringList94 =null;


        CommonTree string_literal93_tree=null;
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:20: ( 'zone:' stringList -> ^( ZONE stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:190:4: 'zone:' stringList
            {
            string_literal93=(Token)match(input,198,FOLLOW_198_in_factionZoneProperty1074);  
            stream_198.add(string_literal93);


            pushFollow(FOLLOW_stringList_in_factionZoneProperty1076);
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
            // 190:23: -> ^( ZONE stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:190:26: ^( ZONE stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:1: saferoomProperty : 'saferoom' -> ^( SAFEROOM ) ;
    public final AtrophyScriptParser.saferoomProperty_return saferoomProperty() throws RecognitionException {
        AtrophyScriptParser.saferoomProperty_return retval = new AtrophyScriptParser.saferoomProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal95=null;

        CommonTree string_literal95_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:17: ( 'saferoom' -> ^( SAFEROOM ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:194:4: 'saferoom'
            {
            string_literal95=(Token)match(input,170,FOLLOW_170_in_saferoomProperty1099);  
            stream_170.add(string_literal95);


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
            // 194:15: -> ^( SAFEROOM )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:194:18: ^( SAFEROOM )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:1: stageDeclProperty : 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) ;
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
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:18: ( 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:198:4: 'stages:' INT ( ',' INT )*
            {
            string_literal96=(Token)match(input,178,FOLLOW_178_in_stageDeclProperty1120);  
            stream_178.add(string_literal96);


            INT97=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1122);  
            stream_INT.add(INT97);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:198:18: ( ',' INT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==102) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:198:19: ',' INT
            	    {
            	    char_literal98=(Token)match(input,102,FOLLOW_102_in_stageDeclProperty1125);  
            	    stream_102.add(char_literal98);


            	    INT99=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1127);  
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
            // 198:29: -> ^( STAGELIST ( INT )* )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:198:32: ^( STAGELIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STAGELIST, "STAGELIST")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:198:44: ( INT )*
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:1: talkMapParentProperty : ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) ;
    public final AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty() throws RecognitionException {
        AtrophyScriptParser.talkMapParentProperty_return retval = new AtrophyScriptParser.talkMapParentProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal100=null;
        Token string_literal101=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral102 =null;


        CommonTree string_literal100_tree=null;
        CommonTree string_literal101_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:22: ( ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:4: ( 'parent:' | 'p:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:4: ( 'parent:' | 'p:' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==162) ) {
                alt18=1;
            }
            else if ( (LA18_0==161) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:5: 'parent:'
                    {
                    string_literal100=(Token)match(input,162,FOLLOW_162_in_talkMapParentProperty1154);  
                    stream_162.add(string_literal100);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:17: 'p:'
                    {
                    string_literal101=(Token)match(input,161,FOLLOW_161_in_talkMapParentProperty1158);  
                    stream_161.add(string_literal101);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_talkMapParentProperty1161);
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
            // 202:37: -> ^( TALKPARENT stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:40: ^( TALKPARENT stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:1: stageProperty : ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) ;
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
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:14: ( ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:4: ( 'stage:' | 's:' ) INT
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:4: ( 'stage:' | 's:' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==177) ) {
                alt19=1;
            }
            else if ( (LA19_0==169) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:5: 'stage:'
                    {
                    string_literal103=(Token)match(input,177,FOLLOW_177_in_stageProperty1185);  
                    stream_177.add(string_literal103);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:16: 's:'
                    {
                    string_literal104=(Token)match(input,169,FOLLOW_169_in_stageProperty1189);  
                    stream_169.add(string_literal104);


                    }
                    break;

            }


            INT105=(Token)match(input,INT,FOLLOW_INT_in_stageProperty1192);  
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
            // 206:26: -> ^( TALKSTAGE INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:29: ^( TALKSTAGE INT )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:1: aiInitProperty : ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) ;
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
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:15: ( ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:4: ( 'aiInit:' | 'a:' ) BOOL
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:4: ( 'aiInit:' | 'a:' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==119) ) {
                alt20=1;
            }
            else if ( (LA20_0==117) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:5: 'aiInit:'
                    {
                    string_literal106=(Token)match(input,119,FOLLOW_119_in_aiInitProperty1216);  
                    stream_119.add(string_literal106);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:17: 'a:'
                    {
                    string_literal107=(Token)match(input,117,FOLLOW_117_in_aiInitProperty1220);  
                    stream_117.add(string_literal107);


                    }
                    break;

            }


            BOOL108=(Token)match(input,BOOL,FOLLOW_BOOL_in_aiInitProperty1223);  
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
            // 210:28: -> ^( AIINIT BOOL )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:31: ^( AIINIT BOOL )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:1: openingLineProperty : ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) ;
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
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:20: ( ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:4: ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:4: ( 'o:' | 'opening:' | 'openingLine:' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 156:
                {
                alt21=1;
                }
                break;
            case 158:
                {
                alt21=2;
                }
                break;
            case 159:
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:5: 'o:'
                    {
                    string_literal109=(Token)match(input,156,FOLLOW_156_in_openingLineProperty1247);  
                    stream_156.add(string_literal109);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:12: 'opening:'
                    {
                    string_literal110=(Token)match(input,158,FOLLOW_158_in_openingLineProperty1251);  
                    stream_158.add(string_literal110);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:25: 'openingLine:'
                    {
                    string_literal111=(Token)match(input,159,FOLLOW_159_in_openingLineProperty1255);  
                    stream_159.add(string_literal111);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_openingLineProperty1258);
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
            // 214:55: -> ^( OPENINGLINE stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:58: ^( OPENINGLINE stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:1: optionProperty : ( 'l:' | 'option:' ) stringLiteral -> ^( OPTION stringLiteral ) ;
    public final AtrophyScriptParser.optionProperty_return optionProperty() throws RecognitionException {
        AtrophyScriptParser.optionProperty_return retval = new AtrophyScriptParser.optionProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal113=null;
        Token string_literal114=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral115 =null;


        CommonTree string_literal113_tree=null;
        CommonTree string_literal114_tree=null;
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:15: ( ( 'l:' | 'option:' ) stringLiteral -> ^( OPTION stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:4: ( 'l:' | 'option:' ) stringLiteral
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:4: ( 'l:' | 'option:' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==147) ) {
                alt22=1;
            }
            else if ( (LA22_0==160) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:5: 'l:'
                    {
                    string_literal113=(Token)match(input,147,FOLLOW_147_in_optionProperty1280);  
                    stream_147.add(string_literal113);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:12: 'option:'
                    {
                    string_literal114=(Token)match(input,160,FOLLOW_160_in_optionProperty1284);  
                    stream_160.add(string_literal114);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_optionProperty1287);
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
            // 218:37: -> ^( OPTION stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:40: ^( OPTION stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:1: topicProperty : ( 't:' | 'topic' ) requiredAssignment '{' topicProperties '}' -> ^( TOPIC requiredAssignment topicProperties ) ;
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
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_topicProperties=new RewriteRuleSubtreeStream(adaptor,"rule topicProperties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:14: ( ( 't:' | 'topic' ) requiredAssignment '{' topicProperties '}' -> ^( TOPIC requiredAssignment topicProperties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:4: ( 't:' | 'topic' ) requiredAssignment '{' topicProperties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:4: ( 't:' | 'topic' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==181) ) {
                alt23=1;
            }
            else if ( (LA23_0==189) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:5: 't:'
                    {
                    string_literal116=(Token)match(input,181,FOLLOW_181_in_topicProperty1311);  
                    stream_181.add(string_literal116);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:12: 'topic'
                    {
                    string_literal117=(Token)match(input,189,FOLLOW_189_in_topicProperty1315);  
                    stream_189.add(string_literal117);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_topicProperty1318);
            requiredAssignment118=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment118.getTree());

            char_literal119=(Token)match(input,199,FOLLOW_199_in_topicProperty1320);  
            stream_199.add(char_literal119);


            pushFollow(FOLLOW_topicProperties_in_topicProperty1322);
            topicProperties120=topicProperties();

            state._fsp--;

            stream_topicProperties.add(topicProperties120.getTree());

            char_literal121=(Token)match(input,200,FOLLOW_200_in_topicProperty1324);  
            stream_200.add(char_literal121);


            // AST REWRITE
            // elements: requiredAssignment, topicProperties
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 222:64: -> ^( TOPIC requiredAssignment topicProperties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:67: ^( TOPIC requiredAssignment topicProperties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:1: topicProperties : ( topicLine | topicRequiement )* ;
    public final AtrophyScriptParser.topicProperties_return topicProperties() throws RecognitionException {
        AtrophyScriptParser.topicProperties_return retval = new AtrophyScriptParser.topicProperties_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.topicLine_return topicLine122 =null;

        AtrophyScriptParser.topicRequiement_return topicRequiement123 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:16: ( ( topicLine | topicRequiement )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:4: ( topicLine | topicRequiement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:4: ( topicLine | topicRequiement )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==148) ) {
                    alt24=1;
                }
                else if ( (LA24_0==168) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:5: topicLine
            	    {
            	    pushFollow(FOLLOW_topicLine_in_topicProperties1351);
            	    topicLine122=topicLine();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicLine122.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:17: topicRequiement
            	    {
            	    pushFollow(FOLLOW_topicRequiement_in_topicProperties1355);
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:1: topicLine : 'lines:' stringLiteral ( ',' stringLiteral )* -> ( ^( LINE stringLiteral ) )* ;
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
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:10: ( 'lines:' stringLiteral ( ',' stringLiteral )* -> ( ^( LINE stringLiteral ) )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:4: 'lines:' stringLiteral ( ',' stringLiteral )*
            {
            string_literal124=(Token)match(input,148,FOLLOW_148_in_topicLine1372);  
            stream_148.add(string_literal124);


            pushFollow(FOLLOW_stringLiteral_in_topicLine1373);
            stringLiteral125=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral125.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:26: ( ',' stringLiteral )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==102) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:27: ',' stringLiteral
            	    {
            	    char_literal126=(Token)match(input,102,FOLLOW_102_in_topicLine1376);  
            	    stream_102.add(char_literal126);


            	    pushFollow(FOLLOW_stringLiteral_in_topicLine1378);
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
            // 230:47: -> ( ^( LINE stringLiteral ) )*
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:50: ( ^( LINE stringLiteral ) )*
                while ( stream_stringLiteral.hasNext() ) {
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:50: ^( LINE stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:1: topicRequiement : 'req:' reqString ( ',' reqString )* -> ( ^( REQ reqString ) )* ;
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
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleSubtreeStream stream_reqString=new RewriteRuleSubtreeStream(adaptor,"rule reqString");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:16: ( 'req:' reqString ( ',' reqString )* -> ( ^( REQ reqString ) )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:4: 'req:' reqString ( ',' reqString )*
            {
            string_literal128=(Token)match(input,168,FOLLOW_168_in_topicRequiement1404);  
            stream_168.add(string_literal128);


            pushFollow(FOLLOW_reqString_in_topicRequiement1406);
            reqString129=reqString();

            state._fsp--;

            stream_reqString.add(reqString129.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:21: ( ',' reqString )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==102) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:22: ',' reqString
            	    {
            	    char_literal130=(Token)match(input,102,FOLLOW_102_in_topicRequiement1409);  
            	    stream_102.add(char_literal130);


            	    pushFollow(FOLLOW_reqString_in_topicRequiement1411);
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
            // 234:38: -> ( ^( REQ reqString ) )*
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:41: ( ^( REQ reqString ) )*
                while ( stream_reqString.hasNext() ) {
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:41: ^( REQ reqString )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:1: reqString : ( NOT_PREFIX stringLiteral -> ^( NEGATION stringLiteral ) | stringLiteral );
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
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:10: ( NOT_PREFIX stringLiteral -> ^( NEGATION stringLiteral ) | stringLiteral )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==NOT_PREFIX) ) {
                alt27=1;
            }
            else if ( (LA27_0==98) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:4: NOT_PREFIX stringLiteral
                    {
                    NOT_PREFIX132=(Token)match(input,NOT_PREFIX,FOLLOW_NOT_PREFIX_in_reqString1437);  
                    stream_NOT_PREFIX.add(NOT_PREFIX132);


                    pushFollow(FOLLOW_stringLiteral_in_reqString1439);
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
                    // 238:29: -> ^( NEGATION stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:32: ^( NEGATION stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:239:6: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stringLiteral_in_reqString1454);
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:1: aliveQuery : 'isAlive' '{' unitInfo '}' -> ^( ISALIVE unitInfo ) ;
    public final AtrophyScriptParser.aliveQuery_return aliveQuery() throws RecognitionException {
        AtrophyScriptParser.aliveQuery_return retval = new AtrophyScriptParser.aliveQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal135=null;
        Token char_literal136=null;
        Token char_literal138=null;
        AtrophyScriptParser.unitInfo_return unitInfo137 =null;


        CommonTree string_literal135_tree=null;
        CommonTree char_literal136_tree=null;
        CommonTree char_literal138_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:11: ( 'isAlive' '{' unitInfo '}' -> ^( ISALIVE unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:243:4: 'isAlive' '{' unitInfo '}'
            {
            string_literal135=(Token)match(input,137,FOLLOW_137_in_aliveQuery1469);  
            stream_137.add(string_literal135);


            char_literal136=(Token)match(input,199,FOLLOW_199_in_aliveQuery1471);  
            stream_199.add(char_literal136);


            pushFollow(FOLLOW_unitInfo_in_aliveQuery1473);
            unitInfo137=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo137.getTree());

            char_literal138=(Token)match(input,200,FOLLOW_200_in_aliveQuery1475);  
            stream_200.add(char_literal138);


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
            // 243:31: -> ^( ISALIVE unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:243:34: ^( ISALIVE unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:1: timeQuery : 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) ) ;
    public final AtrophyScriptParser.timeQuery_return timeQuery() throws RecognitionException {
        AtrophyScriptParser.timeQuery_return retval = new AtrophyScriptParser.timeQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal139=null;
        Token INT140=null;
        Token string_literal141=null;
        Token INT142=null;
        Token string_literal143=null;
        Token INT144=null;

        CommonTree string_literal139_tree=null;
        CommonTree INT140_tree=null;
        CommonTree string_literal141_tree=null;
        CommonTree INT142_tree=null;
        CommonTree string_literal143_tree=null;
        CommonTree INT144_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:10: ( 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:247:4: 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) )
            {
            string_literal139=(Token)match(input,157,FOLLOW_157_in_timeQuery1498);  
            stream_157.add(string_literal139);


            INT140=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1500);  
            stream_INT.add(INT140);


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:248:4: ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 133:
                {
                alt28=1;
                }
                break;
            case 132:
                {
                alt28=2;
                }
                break;
            case 101:
            case 104:
            case 111:
            case 200:
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:248:5: 'expireTime:' INT
                    {
                    string_literal141=(Token)match(input,133,FOLLOW_133_in_timeQuery1506);  
                    stream_133.add(string_literal141);


                    INT142=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1508);  
                    stream_INT.add(INT142);


                    // AST REWRITE
                    // elements: INT, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 248:23: -> ^( ONTIME INT ^( EXPIRETIME INT ) )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:248:26: ^( ONTIME INT ^( EXPIRETIME INT ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ONTIME, "ONTIME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:248:39: ^( EXPIRETIME INT )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EXPIRETIME, "EXPIRETIME")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:5: 'expireRepeats:' INT
                    {
                    string_literal143=(Token)match(input,132,FOLLOW_132_in_timeQuery1528);  
                    stream_132.add(string_literal143);


                    INT144=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1530);  
                    stream_INT.add(INT144);


                    // AST REWRITE
                    // elements: INT, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 249:26: -> ^( ONTIME INT ^( EXPIREREPEATS INT ) )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:29: ^( ONTIME INT ^( EXPIREREPEATS INT ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ONTIME, "ONTIME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:42: ^( EXPIREREPEATS INT )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EXPIREREPEATS, "EXPIREREPEATS")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:6: 
                    {
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
                    // 250:6: -> ^( ONTIME INT EMPTY )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:9: ^( ONTIME INT EMPTY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ONTIME, "ONTIME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(EMPTY, "EMPTY")
                        );

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
    // $ANTLR end "timeQuery"


    public static class boolQuery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolQuery"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:253:1: boolQuery : ( '(' ! queryLogic ')' !| aliveQuery | timeQuery );
    public final AtrophyScriptParser.boolQuery_return boolQuery() throws RecognitionException {
        AtrophyScriptParser.boolQuery_return retval = new AtrophyScriptParser.boolQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal145=null;
        Token char_literal147=null;
        AtrophyScriptParser.queryLogic_return queryLogic146 =null;

        AtrophyScriptParser.aliveQuery_return aliveQuery148 =null;

        AtrophyScriptParser.timeQuery_return timeQuery149 =null;


        CommonTree char_literal145_tree=null;
        CommonTree char_literal147_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:253:10: ( '(' ! queryLogic ')' !| aliveQuery | timeQuery )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt29=1;
                }
                break;
            case 137:
                {
                alt29=2;
                }
                break;
            case 157:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:3: '(' ! queryLogic ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal145=(Token)match(input,100,FOLLOW_100_in_boolQuery1572); 

                    pushFollow(FOLLOW_queryLogic_in_boolQuery1575);
                    queryLogic146=queryLogic();

                    state._fsp--;

                    adaptor.addChild(root_0, queryLogic146.getTree());

                    char_literal147=(Token)match(input,101,FOLLOW_101_in_boolQuery1577); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:255:5: aliveQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_aliveQuery_in_boolQuery1584);
                    aliveQuery148=aliveQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, aliveQuery148.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:256:5: timeQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeQuery_in_boolQuery1590);
                    timeQuery149=timeQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, timeQuery149.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:259:1: queryNegation : ( boolQuery | '!' boolQuery -> ^( NEGATION boolQuery ) );
    public final AtrophyScriptParser.queryNegation_return queryNegation() throws RecognitionException {
        AtrophyScriptParser.queryNegation_return retval = new AtrophyScriptParser.queryNegation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal151=null;
        AtrophyScriptParser.boolQuery_return boolQuery150 =null;

        AtrophyScriptParser.boolQuery_return boolQuery152 =null;


        CommonTree char_literal151_tree=null;
        RewriteRuleTokenStream stream_NOT_PREFIX=new RewriteRuleTokenStream(adaptor,"token NOT_PREFIX");
        RewriteRuleSubtreeStream stream_boolQuery=new RewriteRuleSubtreeStream(adaptor,"rule boolQuery");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:259:14: ( boolQuery | '!' boolQuery -> ^( NEGATION boolQuery ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==100||LA30_0==137||LA30_0==157) ) {
                alt30=1;
            }
            else if ( (LA30_0==NOT_PREFIX) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:260:3: boolQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_boolQuery_in_queryNegation1604);
                    boolQuery150=boolQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, boolQuery150.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:4: '!' boolQuery
                    {
                    char_literal151=(Token)match(input,NOT_PREFIX,FOLLOW_NOT_PREFIX_in_queryNegation1609);  
                    stream_NOT_PREFIX.add(char_literal151);


                    pushFollow(FOLLOW_boolQuery_in_queryNegation1611);
                    boolQuery152=boolQuery();

                    state._fsp--;

                    stream_boolQuery.add(boolQuery152.getTree());

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
                    // 261:18: -> ^( NEGATION boolQuery )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:21: ^( NEGATION boolQuery )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:264:1: queryLogic : b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) ) ;
    public final AtrophyScriptParser.queryLogic_return queryLogic() throws RecognitionException {
        AtrophyScriptParser.queryLogic_return retval = new AtrophyScriptParser.queryLogic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal153=null;
        Token string_literal154=null;
        AtrophyScriptParser.queryNegation_return b1 =null;

        AtrophyScriptParser.queryNegation_return b2 =null;


        CommonTree string_literal153_tree=null;
        CommonTree string_literal154_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_queryNegation=new RewriteRuleSubtreeStream(adaptor,"rule queryNegation");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:264:11: (b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:3: b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) )
            {
            pushFollow(FOLLOW_queryNegation_in_queryLogic1635);
            b1=queryNegation();

            state._fsp--;

            stream_queryNegation.add(b1.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:3: ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt31=1;
                }
                break;
            case 111:
                {
                alt31=2;
                }
                break;
            case 101:
            case 200:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:4: 'AND' b2= queryNegation
                    {
                    string_literal153=(Token)match(input,104,FOLLOW_104_in_queryLogic1640);  
                    stream_104.add(string_literal153);


                    pushFollow(FOLLOW_queryNegation_in_queryLogic1644);
                    b2=queryNegation();

                    state._fsp--;

                    stream_queryNegation.add(b2.getTree());

                    // AST REWRITE
                    // elements: b1, b2
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
                    // 266:27: -> ^( AND $b1 $b2)
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:30: ^( AND $b1 $b2)
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:267:4: 'OR' b2= queryNegation
                    {
                    string_literal154=(Token)match(input,111,FOLLOW_111_in_queryLogic1661);  
                    stream_111.add(string_literal154);


                    pushFollow(FOLLOW_queryNegation_in_queryLogic1665);
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
                    // 267:26: -> ^( OR $b1 $b2)
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:267:29: ^( OR $b1 $b2)
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:268:5: 
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
                    // 268:5: -> ^( LOGIC $b1)
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:268:8: ^( LOGIC $b1)
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:271:1: triggerCondProperty : ( 'tc' | 'triggerCond' ) '{' queryLogic '}' -> ^( TRIGGERCOND queryLogic ) ;
    public final AtrophyScriptParser.triggerCondProperty_return triggerCondProperty() throws RecognitionException {
        AtrophyScriptParser.triggerCondProperty_return retval = new AtrophyScriptParser.triggerCondProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal155=null;
        Token string_literal156=null;
        Token char_literal157=null;
        Token char_literal159=null;
        AtrophyScriptParser.queryLogic_return queryLogic158 =null;


        CommonTree string_literal155_tree=null;
        CommonTree string_literal156_tree=null;
        CommonTree char_literal157_tree=null;
        CommonTree char_literal159_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleSubtreeStream stream_queryLogic=new RewriteRuleSubtreeStream(adaptor,"rule queryLogic");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:271:20: ( ( 'tc' | 'triggerCond' ) '{' queryLogic '}' -> ^( TRIGGERCOND queryLogic ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:4: ( 'tc' | 'triggerCond' ) '{' queryLogic '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:4: ( 'tc' | 'triggerCond' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==183) ) {
                alt32=1;
            }
            else if ( (LA32_0==191) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:5: 'tc'
                    {
                    string_literal155=(Token)match(input,183,FOLLOW_183_in_triggerCondProperty1705);  
                    stream_183.add(string_literal155);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:12: 'triggerCond'
                    {
                    string_literal156=(Token)match(input,191,FOLLOW_191_in_triggerCondProperty1709);  
                    stream_191.add(string_literal156);


                    }
                    break;

            }


            char_literal157=(Token)match(input,199,FOLLOW_199_in_triggerCondProperty1712);  
            stream_199.add(char_literal157);


            pushFollow(FOLLOW_queryLogic_in_triggerCondProperty1714);
            queryLogic158=queryLogic();

            state._fsp--;

            stream_queryLogic.add(queryLogic158.getTree());

            char_literal159=(Token)match(input,200,FOLLOW_200_in_triggerCondProperty1716);  
            stream_200.add(char_literal159);


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
            // 272:46: -> ^( TRIGGERCOND queryLogic )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:49: ^( TRIGGERCOND queryLogic )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:275:1: triggerEffectProperty : ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) ;
    public final AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty() throws RecognitionException {
        AtrophyScriptParser.triggerEffectProperty_return retval = new AtrophyScriptParser.triggerEffectProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal160=null;
        Token string_literal161=null;
        Token char_literal162=null;
        Token char_literal164=null;
        AtrophyScriptParser.triggerEffectList_return triggerEffectList163 =null;


        CommonTree string_literal160_tree=null;
        CommonTree string_literal161_tree=null;
        CommonTree char_literal162_tree=null;
        CommonTree char_literal164_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:275:22: ( ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:276:4: ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:276:4: ( 'te' | 'triggerEffect' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==184) ) {
                alt33=1;
            }
            else if ( (LA33_0==192) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:276:5: 'te'
                    {
                    string_literal160=(Token)match(input,184,FOLLOW_184_in_triggerEffectProperty1738);  
                    stream_184.add(string_literal160);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:276:12: 'triggerEffect'
                    {
                    string_literal161=(Token)match(input,192,FOLLOW_192_in_triggerEffectProperty1742);  
                    stream_192.add(string_literal161);


                    }
                    break;

            }


            char_literal162=(Token)match(input,199,FOLLOW_199_in_triggerEffectProperty1745);  
            stream_199.add(char_literal162);


            pushFollow(FOLLOW_triggerEffectList_in_triggerEffectProperty1747);
            triggerEffectList163=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList163.getTree());

            char_literal164=(Token)match(input,200,FOLLOW_200_in_triggerEffectProperty1749);  
            stream_200.add(char_literal164);


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
            // 276:55: -> ^( TRIGGEREFFECT triggerEffectList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:276:58: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:279:1: coverDecl : ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) ;
    public final AtrophyScriptParser.coverDecl_return coverDecl() throws RecognitionException {
        AtrophyScriptParser.coverDecl_return retval = new AtrophyScriptParser.coverDecl_return();
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
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:279:10: ( ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:4: ( 'COVER' | 'cover' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:4: ( 'COVER' | 'cover' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==107) ) {
                alt34=1;
            }
            else if ( (LA34_0==128) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:5: 'COVER'
                    {
                    string_literal165=(Token)match(input,107,FOLLOW_107_in_coverDecl1773);  
                    stream_107.add(string_literal165);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:15: 'cover'
                    {
                    string_literal166=(Token)match(input,128,FOLLOW_128_in_coverDecl1777);  
                    stream_128.add(string_literal166);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_coverDecl1780);
            varAssignment167=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment167.getTree());

            char_literal168=(Token)match(input,199,FOLLOW_199_in_coverDecl1782);  
            stream_199.add(char_literal168);


            pushFollow(FOLLOW_properties_in_coverDecl1784);
            properties169=properties();

            state._fsp--;

            stream_properties.add(properties169.getTree());

            char_literal170=(Token)match(input,200,FOLLOW_200_in_coverDecl1786);  
            stream_200.add(char_literal170);


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
            // 280:57: -> ^( COVER varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:60: ^( COVER varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:283:1: stashDecl : ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) ;
    public final AtrophyScriptParser.stashDecl_return stashDecl() throws RecognitionException {
        AtrophyScriptParser.stashDecl_return retval = new AtrophyScriptParser.stashDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal171=null;
        Token string_literal172=null;
        Token char_literal174=null;
        Token char_literal176=null;
        AtrophyScriptParser.varAssignment_return varAssignment173 =null;

        AtrophyScriptParser.properties_return properties175 =null;


        CommonTree string_literal171_tree=null;
        CommonTree string_literal172_tree=null;
        CommonTree char_literal174_tree=null;
        CommonTree char_literal176_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:283:10: ( ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:284:4: ( 'STASH' | 'stash' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:284:4: ( 'STASH' | 'stash' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==113) ) {
                alt35=1;
            }
            else if ( (LA35_0==179) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:284:5: 'STASH'
                    {
                    string_literal171=(Token)match(input,113,FOLLOW_113_in_stashDecl1812);  
                    stream_113.add(string_literal171);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:284:15: 'stash'
                    {
                    string_literal172=(Token)match(input,179,FOLLOW_179_in_stashDecl1816);  
                    stream_179.add(string_literal172);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_stashDecl1819);
            varAssignment173=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment173.getTree());

            char_literal174=(Token)match(input,199,FOLLOW_199_in_stashDecl1821);  
            stream_199.add(char_literal174);


            pushFollow(FOLLOW_properties_in_stashDecl1823);
            properties175=properties();

            state._fsp--;

            stream_properties.add(properties175.getTree());

            char_literal176=(Token)match(input,200,FOLLOW_200_in_stashDecl1825);  
            stream_200.add(char_literal176);


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
            // 284:57: -> ^( STASH varAssignment properties )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:284:60: ^( STASH varAssignment properties )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:287:1: triggerEffectList : triggerEffect ( ',' ! triggerEffect )* ;
    public final AtrophyScriptParser.triggerEffectList_return triggerEffectList() throws RecognitionException {
        AtrophyScriptParser.triggerEffectList_return retval = new AtrophyScriptParser.triggerEffectList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal178=null;
        AtrophyScriptParser.triggerEffect_return triggerEffect177 =null;

        AtrophyScriptParser.triggerEffect_return triggerEffect179 =null;


        CommonTree char_literal178_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:287:18: ( triggerEffect ( ',' ! triggerEffect )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:288:4: triggerEffect ( ',' ! triggerEffect )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1848);
            triggerEffect177=triggerEffect();

            state._fsp--;

            adaptor.addChild(root_0, triggerEffect177.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:288:18: ( ',' ! triggerEffect )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==102) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:288:19: ',' ! triggerEffect
            	    {
            	    char_literal178=(Token)match(input,102,FOLLOW_102_in_triggerEffectList1851); 

            	    pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1854);
            	    triggerEffect179=triggerEffect();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffect179.getTree());

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
    // $ANTLR end "triggerEffectList"


    public static class triggerEffect_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerEffect"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:291:1: triggerEffect : ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | showMessage | setTriggerRunning | spawnItem | commandCallList );
    public final AtrophyScriptParser.triggerEffect_return triggerEffect() throws RecognitionException {
        AtrophyScriptParser.triggerEffect_return retval = new AtrophyScriptParser.triggerEffect_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.updateTalkTree_return updateTalkTree180 =null;

        AtrophyScriptParser.spawnTeam_return spawnTeam181 =null;

        AtrophyScriptParser.spawnCharacter_return spawnCharacter182 =null;

        AtrophyScriptParser.removeUnit_return removeUnit183 =null;

        AtrophyScriptParser.killUnit_return killUnit184 =null;

        AtrophyScriptParser.teleportUnit_return teleportUnit185 =null;

        AtrophyScriptParser.converseUnit_return converseUnit186 =null;

        AtrophyScriptParser.createSaferoom_return createSaferoom187 =null;

        AtrophyScriptParser.removeSaferoom_return removeSaferoom188 =null;

        AtrophyScriptParser.loadMap_return loadMap189 =null;

        AtrophyScriptParser.lockDoor_return lockDoor190 =null;

        AtrophyScriptParser.unlockDoor_return unlockDoor191 =null;

        AtrophyScriptParser.addTag_return addTag192 =null;

        AtrophyScriptParser.removeTag_return removeTag193 =null;

        AtrophyScriptParser.directorBias_return directorBias194 =null;

        AtrophyScriptParser.changeAiNode_return changeAiNode195 =null;

        AtrophyScriptParser.showMessage_return showMessage196 =null;

        AtrophyScriptParser.setTriggerRunning_return setTriggerRunning197 =null;

        AtrophyScriptParser.spawnItem_return spawnItem198 =null;

        AtrophyScriptParser.commandCallList_return commandCallList199 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:291:14: ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | showMessage | setTriggerRunning | spawnItem | commandCallList )
            int alt37=20;
            switch ( input.LA(1) ) {
            case UPDATE_TREE_PREFIX:
            case 194:
                {
                alt37=1;
                }
                break;
            case 176:
                {
                alt37=2;
                }
                break;
            case 174:
                {
                alt37=3;
                }
                break;
            case 167:
                {
                alt37=4;
                }
                break;
            case 146:
                {
                alt37=5;
                }
                break;
            case 185:
                {
                alt37=6;
                }
                break;
            case 127:
                {
                alt37=7;
                }
                break;
            case 170:
                {
                alt37=8;
                }
                break;
            case 165:
                {
                alt37=9;
                }
                break;
            case 149:
                {
                alt37=10;
                }
                break;
            case 150:
                {
                alt37=11;
                }
                break;
            case 193:
                {
                alt37=12;
                }
                break;
            case ADD_TAG_PREFIX:
            case 118:
                {
                alt37=13;
                }
                break;
            case REMOVE_TAG_PREFIX:
            case 166:
                {
                alt37=14;
                }
                break;
            case 130:
                {
                alt37=15;
                }
                break;
            case 124:
                {
                alt37=16;
                }
                break;
            case 173:
                {
                alt37=17;
                }
                break;
            case 172:
                {
                alt37=18;
                }
                break;
            case 175:
                {
                alt37=19;
                }
                break;
            case COMMAND_CALL_PREFIX:
            case 123:
                {
                alt37=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:292:4: updateTalkTree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_updateTalkTree_in_triggerEffect1869);
                    updateTalkTree180=updateTalkTree();

                    state._fsp--;

                    adaptor.addChild(root_0, updateTalkTree180.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:293:6: spawnTeam
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnTeam_in_triggerEffect1876);
                    spawnTeam181=spawnTeam();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnTeam181.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:294:6: spawnCharacter
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnCharacter_in_triggerEffect1883);
                    spawnCharacter182=spawnCharacter();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnCharacter182.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:295:6: removeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeUnit_in_triggerEffect1890);
                    removeUnit183=removeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, removeUnit183.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:296:6: killUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_killUnit_in_triggerEffect1897);
                    killUnit184=killUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, killUnit184.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:297:6: teleportUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_teleportUnit_in_triggerEffect1904);
                    teleportUnit185=teleportUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, teleportUnit185.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:298:6: converseUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_converseUnit_in_triggerEffect1911);
                    converseUnit186=converseUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, converseUnit186.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:6: createSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_createSaferoom_in_triggerEffect1918);
                    createSaferoom187=createSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, createSaferoom187.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:300:6: removeSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeSaferoom_in_triggerEffect1925);
                    removeSaferoom188=removeSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, removeSaferoom188.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:301:6: loadMap
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_loadMap_in_triggerEffect1932);
                    loadMap189=loadMap();

                    state._fsp--;

                    adaptor.addChild(root_0, loadMap189.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:302:6: lockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lockDoor_in_triggerEffect1939);
                    lockDoor190=lockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, lockDoor190.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:303:6: unlockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unlockDoor_in_triggerEffect1946);
                    unlockDoor191=unlockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, unlockDoor191.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:6: addTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_addTag_in_triggerEffect1953);
                    addTag192=addTag();

                    state._fsp--;

                    adaptor.addChild(root_0, addTag192.getTree());

                    }
                    break;
                case 14 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:6: removeTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeTag_in_triggerEffect1960);
                    removeTag193=removeTag();

                    state._fsp--;

                    adaptor.addChild(root_0, removeTag193.getTree());

                    }
                    break;
                case 15 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:306:6: directorBias
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_directorBias_in_triggerEffect1967);
                    directorBias194=directorBias();

                    state._fsp--;

                    adaptor.addChild(root_0, directorBias194.getTree());

                    }
                    break;
                case 16 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:307:6: changeAiNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_changeAiNode_in_triggerEffect1974);
                    changeAiNode195=changeAiNode();

                    state._fsp--;

                    adaptor.addChild(root_0, changeAiNode195.getTree());

                    }
                    break;
                case 17 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:6: showMessage
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_showMessage_in_triggerEffect1981);
                    showMessage196=showMessage();

                    state._fsp--;

                    adaptor.addChild(root_0, showMessage196.getTree());

                    }
                    break;
                case 18 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:6: setTriggerRunning
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_setTriggerRunning_in_triggerEffect1988);
                    setTriggerRunning197=setTriggerRunning();

                    state._fsp--;

                    adaptor.addChild(root_0, setTriggerRunning197.getTree());

                    }
                    break;
                case 19 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:310:6: spawnItem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnItem_in_triggerEffect1995);
                    spawnItem198=spawnItem();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnItem198.getTree());

                    }
                    break;
                case 20 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:311:6: commandCallList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandCallList_in_triggerEffect2002);
                    commandCallList199=commandCallList();

                    state._fsp--;

                    adaptor.addChild(root_0, commandCallList199.getTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:314:1: updateTalkTree : ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) );
    public final AtrophyScriptParser.updateTalkTree_return updateTalkTree() throws RecognitionException {
        AtrophyScriptParser.updateTalkTree_return retval = new AtrophyScriptParser.updateTalkTree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal200=null;
        Token INT202=null;
        Token UPDATE_TREE_PREFIX203=null;
        Token char_literal205=null;
        Token INT206=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral201 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral204 =null;


        CommonTree string_literal200_tree=null;
        CommonTree INT202_tree=null;
        CommonTree UPDATE_TREE_PREFIX203_tree=null;
        CommonTree char_literal205_tree=null;
        CommonTree INT206_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_UPDATE_TREE_PREFIX=new RewriteRuleTokenStream(adaptor,"token UPDATE_TREE_PREFIX");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:314:15: ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==194) ) {
                alt38=1;
            }
            else if ( (LA38_0==UPDATE_TREE_PREFIX) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:315:4: 'updateTalk:' stringLiteral INT
                    {
                    string_literal200=(Token)match(input,194,FOLLOW_194_in_updateTalkTree2017);  
                    stream_194.add(string_literal200);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree2019);
                    stringLiteral201=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral201.getTree());

                    INT202=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree2021);  
                    stream_INT.add(INT202);


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
                    // 315:36: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:315:39: ^( UPDATETALK stringLiteral INT )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:316:6: UPDATE_TREE_PREFIX stringLiteral '#' INT
                    {
                    UPDATE_TREE_PREFIX203=(Token)match(input,UPDATE_TREE_PREFIX,FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree2038);  
                    stream_UPDATE_TREE_PREFIX.add(UPDATE_TREE_PREFIX203);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree2040);
                    stringLiteral204=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral204.getTree());

                    char_literal205=(Token)match(input,99,FOLLOW_99_in_updateTalkTree2042);  
                    stream_99.add(char_literal205);


                    INT206=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree2044);  
                    stream_INT.add(INT206);


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
                    // 316:47: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:316:50: ^( UPDATETALK stringLiteral INT )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:319:1: isName : 'isName:' stringList -> ^( ISNAME stringList ) ;
    public final AtrophyScriptParser.isName_return isName() throws RecognitionException {
        AtrophyScriptParser.isName_return retval = new AtrophyScriptParser.isName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal207=null;
        AtrophyScriptParser.stringList_return stringList208 =null;


        CommonTree string_literal207_tree=null;
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:319:7: ( 'isName:' stringList -> ^( ISNAME stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:320:4: 'isName:' stringList
            {
            string_literal207=(Token)match(input,142,FOLLOW_142_in_isName2069);  
            stream_142.add(string_literal207);


            pushFollow(FOLLOW_stringList_in_isName2071);
            stringList208=stringList();

            state._fsp--;

            stream_stringList.add(stringList208.getTree());

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
            // 320:25: -> ^( ISNAME stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:320:28: ^( ISNAME stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:323:1: isFaction : 'isFaction:' stringList -> ^( ISFACTION stringList ) ;
    public final AtrophyScriptParser.isFaction_return isFaction() throws RecognitionException {
        AtrophyScriptParser.isFaction_return retval = new AtrophyScriptParser.isFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal209=null;
        AtrophyScriptParser.stringList_return stringList210 =null;


        CommonTree string_literal209_tree=null;
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:323:10: ( 'isFaction:' stringList -> ^( ISFACTION stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:324:4: 'isFaction:' stringList
            {
            string_literal209=(Token)match(input,140,FOLLOW_140_in_isFaction2094);  
            stream_140.add(string_literal209);


            pushFollow(FOLLOW_stringList_in_isFaction2096);
            stringList210=stringList();

            state._fsp--;

            stream_stringList.add(stringList210.getTree());

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
            // 324:28: -> ^( ISFACTION stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:324:31: ^( ISFACTION stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:1: hasItem : 'hasItem:' stringList -> ^( HASITEM stringList ) ;
    public final AtrophyScriptParser.hasItem_return hasItem() throws RecognitionException {
        AtrophyScriptParser.hasItem_return retval = new AtrophyScriptParser.hasItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal211=null;
        AtrophyScriptParser.stringList_return stringList212 =null;


        CommonTree string_literal211_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:8: ( 'hasItem:' stringList -> ^( HASITEM stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:328:4: 'hasItem:' stringList
            {
            string_literal211=(Token)match(input,134,FOLLOW_134_in_hasItem2119);  
            stream_134.add(string_literal211);


            pushFollow(FOLLOW_stringList_in_hasItem2121);
            stringList212=stringList();

            state._fsp--;

            stream_stringList.add(stringList212.getTree());

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
            // 328:26: -> ^( HASITEM stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:328:29: ^( HASITEM stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:1: hasWeapon : 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) ;
    public final AtrophyScriptParser.hasWeapon_return hasWeapon() throws RecognitionException {
        AtrophyScriptParser.hasWeapon_return retval = new AtrophyScriptParser.hasWeapon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal213=null;
        AtrophyScriptParser.stringList_return stringList214 =null;


        CommonTree string_literal213_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:10: ( 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:332:4: 'hasWeapon:' stringList
            {
            string_literal213=(Token)match(input,135,FOLLOW_135_in_hasWeapon2144);  
            stream_135.add(string_literal213);


            pushFollow(FOLLOW_stringList_in_hasWeapon2146);
            stringList214=stringList();

            state._fsp--;

            stream_stringList.add(stringList214.getTree());

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
            // 332:28: -> ^( HASWEAPON stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:332:31: ^( HASWEAPON stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:1: stringList : stringLiteral ( ',' stringLiteral )* -> ( ^( STRING stringLiteral ) )* ;
    public final AtrophyScriptParser.stringList_return stringList() throws RecognitionException {
        AtrophyScriptParser.stringList_return retval = new AtrophyScriptParser.stringList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal216=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral215 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral217 =null;


        CommonTree char_literal216_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:11: ( stringLiteral ( ',' stringLiteral )* -> ( ^( STRING stringLiteral ) )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:4: stringLiteral ( ',' stringLiteral )*
            {
            pushFollow(FOLLOW_stringLiteral_in_stringList2169);
            stringLiteral215=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral215.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:18: ( ',' stringLiteral )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==102) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:19: ',' stringLiteral
            	    {
            	    char_literal216=(Token)match(input,102,FOLLOW_102_in_stringList2172);  
            	    stream_102.add(char_literal216);


            	    pushFollow(FOLLOW_stringLiteral_in_stringList2174);
            	    stringLiteral217=stringLiteral();

            	    state._fsp--;

            	    stream_stringLiteral.add(stringLiteral217.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
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
            // 336:39: -> ( ^( STRING stringLiteral ) )*
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:42: ( ^( STRING stringLiteral ) )*
                while ( stream_stringLiteral.hasNext() ) {
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:42: ^( STRING stringLiteral )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(STRING, "STRING")
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
    // $ANTLR end "stringList"


    public static class isAlive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isAlive"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:339:1: isAlive : 'isAlive' -> ^( ISALIVE ) ;
    public final AtrophyScriptParser.isAlive_return isAlive() throws RecognitionException {
        AtrophyScriptParser.isAlive_return retval = new AtrophyScriptParser.isAlive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal218=null;

        CommonTree string_literal218_tree=null;
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:339:8: ( 'isAlive' -> ^( ISALIVE ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:4: 'isAlive'
            {
            string_literal218=(Token)match(input,137,FOLLOW_137_in_isAlive2198);  
            stream_137.add(string_literal218);


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
            // 340:14: -> ^( ISALIVE )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:17: ^( ISALIVE )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:343:1: isDead : 'isDead' -> ^( ISDEAD ) ;
    public final AtrophyScriptParser.isDead_return isDead() throws RecognitionException {
        AtrophyScriptParser.isDead_return retval = new AtrophyScriptParser.isDead_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal219=null;

        CommonTree string_literal219_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:343:7: ( 'isDead' -> ^( ISDEAD ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:344:4: 'isDead'
            {
            string_literal219=(Token)match(input,139,FOLLOW_139_in_isDead2219);  
            stream_139.add(string_literal219);


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
            // 344:13: -> ^( ISDEAD )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:344:16: ^( ISDEAD )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:347:1: isInvestigated : 'isInvestigated' -> ^( ISINVESTIGATED ) ;
    public final AtrophyScriptParser.isInvestigated_return isInvestigated() throws RecognitionException {
        AtrophyScriptParser.isInvestigated_return retval = new AtrophyScriptParser.isInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal220=null;

        CommonTree string_literal220_tree=null;
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:347:15: ( 'isInvestigated' -> ^( ISINVESTIGATED ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:348:4: 'isInvestigated'
            {
            string_literal220=(Token)match(input,141,FOLLOW_141_in_isInvestigated2240);  
            stream_141.add(string_literal220);


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
            // 348:21: -> ^( ISINVESTIGATED )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:348:24: ^( ISINVESTIGATED )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:1: isNotInvestigated : 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) ;
    public final AtrophyScriptParser.isNotInvestigated_return isNotInvestigated() throws RecognitionException {
        AtrophyScriptParser.isNotInvestigated_return retval = new AtrophyScriptParser.isNotInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal221=null;

        CommonTree string_literal221_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:18: ( 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:4: 'isNotInvestigated'
            {
            string_literal221=(Token)match(input,144,FOLLOW_144_in_isNotInvestigated2261);  
            stream_144.add(string_literal221);


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
            // 352:24: -> ^( ISNOTINVESTIGATED )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:27: ^( ISNOTINVESTIGATED )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:1: isDaemon : 'isDaemon' -> ^( ISDAEMON ) ;
    public final AtrophyScriptParser.isDaemon_return isDaemon() throws RecognitionException {
        AtrophyScriptParser.isDaemon_return retval = new AtrophyScriptParser.isDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal222=null;

        CommonTree string_literal222_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:9: ( 'isDaemon' -> ^( ISDAEMON ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:4: 'isDaemon'
            {
            string_literal222=(Token)match(input,138,FOLLOW_138_in_isDaemon2282);  
            stream_138.add(string_literal222);


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
            // 356:15: -> ^( ISDAEMON )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:18: ^( ISDAEMON )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:359:1: isNotDaemon : 'isNotDaemon' -> ^( ISNOTDAEMON ) ;
    public final AtrophyScriptParser.isNotDaemon_return isNotDaemon() throws RecognitionException {
        AtrophyScriptParser.isNotDaemon_return retval = new AtrophyScriptParser.isNotDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal223=null;

        CommonTree string_literal223_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:359:12: ( 'isNotDaemon' -> ^( ISNOTDAEMON ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:4: 'isNotDaemon'
            {
            string_literal223=(Token)match(input,143,FOLLOW_143_in_isNotDaemon2301);  
            stream_143.add(string_literal223);


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
            // 360:18: -> ^( ISNOTDAEMON )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:21: ^( ISNOTDAEMON )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:363:1: teleDestination : 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) ;
    public final AtrophyScriptParser.teleDestination_return teleDestination() throws RecognitionException {
        AtrophyScriptParser.teleDestination_return retval = new AtrophyScriptParser.teleDestination_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal224=null;
        Token char_literal225=null;
        Token char_literal228=null;
        AtrophyScriptParser.xListProperty_return xListProperty226 =null;

        AtrophyScriptParser.yListProperty_return yListProperty227 =null;


        CommonTree string_literal224_tree=null;
        CommonTree char_literal225_tree=null;
        CommonTree char_literal228_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_yListProperty=new RewriteRuleSubtreeStream(adaptor,"rule yListProperty");
        RewriteRuleSubtreeStream stream_xListProperty=new RewriteRuleSubtreeStream(adaptor,"rule xListProperty");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:363:16: ( 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:364:4: 'destination' '{' xListProperty yListProperty '}'
            {
            string_literal224=(Token)match(input,129,FOLLOW_129_in_teleDestination2322);  
            stream_129.add(string_literal224);


            char_literal225=(Token)match(input,199,FOLLOW_199_in_teleDestination2324);  
            stream_199.add(char_literal225);


            pushFollow(FOLLOW_xListProperty_in_teleDestination2326);
            xListProperty226=xListProperty();

            state._fsp--;

            stream_xListProperty.add(xListProperty226.getTree());

            pushFollow(FOLLOW_yListProperty_in_teleDestination2328);
            yListProperty227=yListProperty();

            state._fsp--;

            stream_yListProperty.add(yListProperty227.getTree());

            char_literal228=(Token)match(input,200,FOLLOW_200_in_teleDestination2330);  
            stream_200.add(char_literal228);


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
            // 364:54: -> ^( TELEDEST xListProperty yListProperty )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:364:57: ^( TELEDEST xListProperty yListProperty )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:1: maxTeamSize : 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) ;
    public final AtrophyScriptParser.maxTeamSize_return maxTeamSize() throws RecognitionException {
        AtrophyScriptParser.maxTeamSize_return retval = new AtrophyScriptParser.maxTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal229=null;
        Token INT230=null;

        CommonTree string_literal229_tree=null;
        CommonTree INT230_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:12: ( 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:368:4: 'maxTeamSize:' INT
            {
            string_literal229=(Token)match(input,153,FOLLOW_153_in_maxTeamSize2355);  
            stream_153.add(string_literal229);


            INT230=(Token)match(input,INT,FOLLOW_INT_in_maxTeamSize2357);  
            stream_INT.add(INT230);


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
            // 368:23: -> ^( MAXTEAMSIZE INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:368:26: ^( MAXTEAMSIZE INT )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:371:1: minTeamSize : 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) ;
    public final AtrophyScriptParser.minTeamSize_return minTeamSize() throws RecognitionException {
        AtrophyScriptParser.minTeamSize_return retval = new AtrophyScriptParser.minTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal231=null;
        Token INT232=null;

        CommonTree string_literal231_tree=null;
        CommonTree INT232_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:371:12: ( 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:372:4: 'minTeamSize:' INT
            {
            string_literal231=(Token)match(input,155,FOLLOW_155_in_minTeamSize2378);  
            stream_155.add(string_literal231);


            INT232=(Token)match(input,INT,FOLLOW_INT_in_minTeamSize2380);  
            stream_INT.add(INT232);


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
            // 372:23: -> ^( MINTEAMSIZE INT )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:372:26: ^( MINTEAMSIZE INT )
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


    public static class isPlayer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isPlayer"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:375:1: isPlayer : 'isPlayer' ;
    public final AtrophyScriptParser.isPlayer_return isPlayer() throws RecognitionException {
        AtrophyScriptParser.isPlayer_return retval = new AtrophyScriptParser.isPlayer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal233=null;

        CommonTree string_literal233_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:375:9: ( 'isPlayer' )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:4: 'isPlayer'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal233=(Token)match(input,145,FOLLOW_145_in_isPlayer2403); 
            string_literal233_tree = 
            (CommonTree)adaptor.create(string_literal233)
            ;
            adaptor.addChild(root_0, string_literal233_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "isPlayer"


    public static class aiNode_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aiNode"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:1: aiNode : 'aiNode' '{' aiNodeOptions '}' -> ^( AINODE aiNodeOptions ) ;
    public final AtrophyScriptParser.aiNode_return aiNode() throws RecognitionException {
        AtrophyScriptParser.aiNode_return retval = new AtrophyScriptParser.aiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal234=null;
        Token char_literal235=null;
        Token char_literal237=null;
        AtrophyScriptParser.aiNodeOptions_return aiNodeOptions236 =null;


        CommonTree string_literal234_tree=null;
        CommonTree char_literal235_tree=null;
        CommonTree char_literal237_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_aiNodeOptions=new RewriteRuleSubtreeStream(adaptor,"rule aiNodeOptions");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:7: ( 'aiNode' '{' aiNodeOptions '}' -> ^( AINODE aiNodeOptions ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:380:4: 'aiNode' '{' aiNodeOptions '}'
            {
            string_literal234=(Token)match(input,120,FOLLOW_120_in_aiNode2418);  
            stream_120.add(string_literal234);


            char_literal235=(Token)match(input,199,FOLLOW_199_in_aiNode2420);  
            stream_199.add(char_literal235);


            pushFollow(FOLLOW_aiNodeOptions_in_aiNode2422);
            aiNodeOptions236=aiNodeOptions();

            state._fsp--;

            stream_aiNodeOptions.add(aiNodeOptions236.getTree());

            char_literal237=(Token)match(input,200,FOLLOW_200_in_aiNode2424);  
            stream_200.add(char_literal237);


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
            // 380:35: -> ^( AINODE aiNodeOptions )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:380:38: ^( AINODE aiNodeOptions )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:383:1: aiNodeOptions : ( subscribeTalkMaps | behaviours | aiNodePriority )* ;
    public final AtrophyScriptParser.aiNodeOptions_return aiNodeOptions() throws RecognitionException {
        AtrophyScriptParser.aiNodeOptions_return retval = new AtrophyScriptParser.aiNodeOptions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps238 =null;

        AtrophyScriptParser.behaviours_return behaviours239 =null;

        AtrophyScriptParser.aiNodePriority_return aiNodePriority240 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:383:14: ( ( subscribeTalkMaps | behaviours | aiNodePriority )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:384:3: ( subscribeTalkMaps | behaviours | aiNodePriority )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:384:3: ( subscribeTalkMaps | behaviours | aiNodePriority )*
            loop40:
            do {
                int alt40=4;
                switch ( input.LA(1) ) {
                case 180:
                    {
                    alt40=1;
                    }
                    break;
                case 121:
                    {
                    alt40=2;
                    }
                    break;
                case 164:
                    {
                    alt40=3;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:384:4: subscribeTalkMaps
            	    {
            	    pushFollow(FOLLOW_subscribeTalkMaps_in_aiNodeOptions2447);
            	    subscribeTalkMaps238=subscribeTalkMaps();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subscribeTalkMaps238.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:385:4: behaviours
            	    {
            	    pushFollow(FOLLOW_behaviours_in_aiNodeOptions2452);
            	    behaviours239=behaviours();

            	    state._fsp--;

            	    adaptor.addChild(root_0, behaviours239.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:386:4: aiNodePriority
            	    {
            	    pushFollow(FOLLOW_aiNodePriority_in_aiNodeOptions2457);
            	    aiNodePriority240=aiNodePriority();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiNodePriority240.getTree());

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
    // $ANTLR end "aiNodeOptions"


    public static class subscribeTalkMaps_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subscribeTalkMaps"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:389:1: subscribeTalkMaps : 'subscribe:' stringList -> ^( SUBSCRIBE stringList ) ;
    public final AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps() throws RecognitionException {
        AtrophyScriptParser.subscribeTalkMaps_return retval = new AtrophyScriptParser.subscribeTalkMaps_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal241=null;
        AtrophyScriptParser.stringList_return stringList242 =null;


        CommonTree string_literal241_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:389:18: ( 'subscribe:' stringList -> ^( SUBSCRIBE stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:390:4: 'subscribe:' stringList
            {
            string_literal241=(Token)match(input,180,FOLLOW_180_in_subscribeTalkMaps2474);  
            stream_180.add(string_literal241);


            pushFollow(FOLLOW_stringList_in_subscribeTalkMaps2475);
            stringList242=stringList();

            state._fsp--;

            stream_stringList.add(stringList242.getTree());

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
            // 390:27: -> ^( SUBSCRIBE stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:390:30: ^( SUBSCRIBE stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:393:1: behaviours : 'behaviours:' stringList -> ^( BEHAVIOUR stringList ) ;
    public final AtrophyScriptParser.behaviours_return behaviours() throws RecognitionException {
        AtrophyScriptParser.behaviours_return retval = new AtrophyScriptParser.behaviours_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal243=null;
        AtrophyScriptParser.stringList_return stringList244 =null;


        CommonTree string_literal243_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:393:11: ( 'behaviours:' stringList -> ^( BEHAVIOUR stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:394:4: 'behaviours:' stringList
            {
            string_literal243=(Token)match(input,121,FOLLOW_121_in_behaviours2498);  
            stream_121.add(string_literal243);


            pushFollow(FOLLOW_stringList_in_behaviours2500);
            stringList244=stringList();

            state._fsp--;

            stream_stringList.add(stringList244.getTree());

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
            // 394:29: -> ^( BEHAVIOUR stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:394:32: ^( BEHAVIOUR stringList )
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


    public static class aiNodePriority_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aiNodePriority"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:397:1: aiNodePriority : 'priority:' stringList -> ^( PRIORITY stringList ) ;
    public final AtrophyScriptParser.aiNodePriority_return aiNodePriority() throws RecognitionException {
        AtrophyScriptParser.aiNodePriority_return retval = new AtrophyScriptParser.aiNodePriority_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal245=null;
        AtrophyScriptParser.stringList_return stringList246 =null;


        CommonTree string_literal245_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:397:15: ( 'priority:' stringList -> ^( PRIORITY stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:398:4: 'priority:' stringList
            {
            string_literal245=(Token)match(input,164,FOLLOW_164_in_aiNodePriority2523);  
            stream_164.add(string_literal245);


            pushFollow(FOLLOW_stringList_in_aiNodePriority2525);
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
            // 398:27: -> ^( PRIORITY stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:398:30: ^( PRIORITY stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PRIORITY, "PRIORITY")
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
    // $ANTLR end "aiNodePriority"


    public static class unitInfo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unitInfo"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:401:1: unitInfo : ( isName | isFaction | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | aiNode | isPlayer )* ;
    public final AtrophyScriptParser.unitInfo_return unitInfo() throws RecognitionException {
        AtrophyScriptParser.unitInfo_return retval = new AtrophyScriptParser.unitInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName247 =null;

        AtrophyScriptParser.isFaction_return isFaction248 =null;

        AtrophyScriptParser.hasItem_return hasItem249 =null;

        AtrophyScriptParser.hasWeapon_return hasWeapon250 =null;

        AtrophyScriptParser.isAlive_return isAlive251 =null;

        AtrophyScriptParser.isDead_return isDead252 =null;

        AtrophyScriptParser.isInvestigated_return isInvestigated253 =null;

        AtrophyScriptParser.isNotInvestigated_return isNotInvestigated254 =null;

        AtrophyScriptParser.isDaemon_return isDaemon255 =null;

        AtrophyScriptParser.isNotDaemon_return isNotDaemon256 =null;

        AtrophyScriptParser.teleDestination_return teleDestination257 =null;

        AtrophyScriptParser.maxTeamSize_return maxTeamSize258 =null;

        AtrophyScriptParser.minTeamSize_return minTeamSize259 =null;

        AtrophyScriptParser.aiNode_return aiNode260 =null;

        AtrophyScriptParser.isPlayer_return isPlayer261 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:401:9: ( ( isName | isFaction | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | aiNode | isPlayer )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:402:4: ( isName | isFaction | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | aiNode | isPlayer )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:402:4: ( isName | isFaction | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | aiNode | isPlayer )*
            loop41:
            do {
                int alt41=16;
                switch ( input.LA(1) ) {
                case 142:
                    {
                    alt41=1;
                    }
                    break;
                case 140:
                    {
                    alt41=2;
                    }
                    break;
                case 134:
                    {
                    alt41=3;
                    }
                    break;
                case 135:
                    {
                    alt41=4;
                    }
                    break;
                case 137:
                    {
                    alt41=5;
                    }
                    break;
                case 139:
                    {
                    alt41=6;
                    }
                    break;
                case 141:
                    {
                    alt41=7;
                    }
                    break;
                case 144:
                    {
                    alt41=8;
                    }
                    break;
                case 138:
                    {
                    alt41=9;
                    }
                    break;
                case 143:
                    {
                    alt41=10;
                    }
                    break;
                case 129:
                    {
                    alt41=11;
                    }
                    break;
                case 153:
                    {
                    alt41=12;
                    }
                    break;
                case 155:
                    {
                    alt41=13;
                    }
                    break;
                case 120:
                    {
                    alt41=14;
                    }
                    break;
                case 145:
                    {
                    alt41=15;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:402:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_unitInfo2549);
            	    isName247=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName247.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:403:6: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_unitInfo2556);
            	    isFaction248=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction248.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:404:6: hasItem
            	    {
            	    pushFollow(FOLLOW_hasItem_in_unitInfo2563);
            	    hasItem249=hasItem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasItem249.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:405:6: hasWeapon
            	    {
            	    pushFollow(FOLLOW_hasWeapon_in_unitInfo2570);
            	    hasWeapon250=hasWeapon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasWeapon250.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:406:6: isAlive
            	    {
            	    pushFollow(FOLLOW_isAlive_in_unitInfo2577);
            	    isAlive251=isAlive();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isAlive251.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:407:6: isDead
            	    {
            	    pushFollow(FOLLOW_isDead_in_unitInfo2584);
            	    isDead252=isDead();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDead252.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:408:6: isInvestigated
            	    {
            	    pushFollow(FOLLOW_isInvestigated_in_unitInfo2591);
            	    isInvestigated253=isInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isInvestigated253.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:409:6: isNotInvestigated
            	    {
            	    pushFollow(FOLLOW_isNotInvestigated_in_unitInfo2598);
            	    isNotInvestigated254=isNotInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotInvestigated254.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:410:6: isDaemon
            	    {
            	    pushFollow(FOLLOW_isDaemon_in_unitInfo2605);
            	    isDaemon255=isDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDaemon255.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:411:6: isNotDaemon
            	    {
            	    pushFollow(FOLLOW_isNotDaemon_in_unitInfo2612);
            	    isNotDaemon256=isNotDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotDaemon256.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:412:6: teleDestination
            	    {
            	    pushFollow(FOLLOW_teleDestination_in_unitInfo2619);
            	    teleDestination257=teleDestination();

            	    state._fsp--;

            	    adaptor.addChild(root_0, teleDestination257.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:413:6: maxTeamSize
            	    {
            	    pushFollow(FOLLOW_maxTeamSize_in_unitInfo2626);
            	    maxTeamSize258=maxTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, maxTeamSize258.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:414:6: minTeamSize
            	    {
            	    pushFollow(FOLLOW_minTeamSize_in_unitInfo2633);
            	    minTeamSize259=minTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, minTeamSize259.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:415:6: aiNode
            	    {
            	    pushFollow(FOLLOW_aiNode_in_unitInfo2640);
            	    aiNode260=aiNode();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiNode260.getTree());

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:416:6: isPlayer
            	    {
            	    pushFollow(FOLLOW_isPlayer_in_unitInfo2647);
            	    isPlayer261=isPlayer();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isPlayer261.getTree());

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
    // $ANTLR end "unitInfo"


    public static class spawnTeam_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spawnTeam"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:419:1: spawnTeam : 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) ;
    public final AtrophyScriptParser.spawnTeam_return spawnTeam() throws RecognitionException {
        AtrophyScriptParser.spawnTeam_return retval = new AtrophyScriptParser.spawnTeam_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal262=null;
        Token char_literal263=null;
        Token char_literal265=null;
        AtrophyScriptParser.unitInfo_return unitInfo264 =null;


        CommonTree string_literal262_tree=null;
        CommonTree char_literal263_tree=null;
        CommonTree char_literal265_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:419:10: ( 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:420:4: 'spawnTeam' '{' unitInfo '}'
            {
            string_literal262=(Token)match(input,176,FOLLOW_176_in_spawnTeam2666);  
            stream_176.add(string_literal262);


            char_literal263=(Token)match(input,199,FOLLOW_199_in_spawnTeam2668);  
            stream_199.add(char_literal263);


            pushFollow(FOLLOW_unitInfo_in_spawnTeam2670);
            unitInfo264=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo264.getTree());

            char_literal265=(Token)match(input,200,FOLLOW_200_in_spawnTeam2672);  
            stream_200.add(char_literal265);


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
            // 420:33: -> ^( SPAWNTEAM unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:420:36: ^( SPAWNTEAM unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:423:1: spawnCharacter : 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) ;
    public final AtrophyScriptParser.spawnCharacter_return spawnCharacter() throws RecognitionException {
        AtrophyScriptParser.spawnCharacter_return retval = new AtrophyScriptParser.spawnCharacter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal266=null;
        Token char_literal267=null;
        Token char_literal269=null;
        AtrophyScriptParser.unitInfo_return unitInfo268 =null;


        CommonTree string_literal266_tree=null;
        CommonTree char_literal267_tree=null;
        CommonTree char_literal269_tree=null;
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:423:15: ( 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:4: 'spawnCharacter' '{' unitInfo '}'
            {
            string_literal266=(Token)match(input,174,FOLLOW_174_in_spawnCharacter2695);  
            stream_174.add(string_literal266);


            char_literal267=(Token)match(input,199,FOLLOW_199_in_spawnCharacter2697);  
            stream_199.add(char_literal267);


            pushFollow(FOLLOW_unitInfo_in_spawnCharacter2699);
            unitInfo268=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo268.getTree());

            char_literal269=(Token)match(input,200,FOLLOW_200_in_spawnCharacter2701);  
            stream_200.add(char_literal269);


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
            // 424:38: -> ^( SPAWNCHARACTER unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:41: ^( SPAWNCHARACTER unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:427:1: removeUnit : 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) ;
    public final AtrophyScriptParser.removeUnit_return removeUnit() throws RecognitionException {
        AtrophyScriptParser.removeUnit_return retval = new AtrophyScriptParser.removeUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal270=null;
        Token char_literal271=null;
        Token char_literal273=null;
        AtrophyScriptParser.unitInfo_return unitInfo272 =null;


        CommonTree string_literal270_tree=null;
        CommonTree char_literal271_tree=null;
        CommonTree char_literal273_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:427:11: ( 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:428:4: 'removeUnit' '{' unitInfo '}'
            {
            string_literal270=(Token)match(input,167,FOLLOW_167_in_removeUnit2724);  
            stream_167.add(string_literal270);


            char_literal271=(Token)match(input,199,FOLLOW_199_in_removeUnit2726);  
            stream_199.add(char_literal271);


            pushFollow(FOLLOW_unitInfo_in_removeUnit2728);
            unitInfo272=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo272.getTree());

            char_literal273=(Token)match(input,200,FOLLOW_200_in_removeUnit2730);  
            stream_200.add(char_literal273);


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
            // 428:34: -> ^( REMOVEUNIT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:428:37: ^( REMOVEUNIT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:431:1: killUnit : 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) ;
    public final AtrophyScriptParser.killUnit_return killUnit() throws RecognitionException {
        AtrophyScriptParser.killUnit_return retval = new AtrophyScriptParser.killUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal274=null;
        Token char_literal275=null;
        Token char_literal277=null;
        AtrophyScriptParser.unitInfo_return unitInfo276 =null;


        CommonTree string_literal274_tree=null;
        CommonTree char_literal275_tree=null;
        CommonTree char_literal277_tree=null;
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:431:9: ( 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:432:4: 'killUnit' '{' unitInfo '}'
            {
            string_literal274=(Token)match(input,146,FOLLOW_146_in_killUnit2753);  
            stream_146.add(string_literal274);


            char_literal275=(Token)match(input,199,FOLLOW_199_in_killUnit2755);  
            stream_199.add(char_literal275);


            pushFollow(FOLLOW_unitInfo_in_killUnit2757);
            unitInfo276=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo276.getTree());

            char_literal277=(Token)match(input,200,FOLLOW_200_in_killUnit2759);  
            stream_200.add(char_literal277);


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
            // 432:32: -> ^( KILLUNIT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:432:35: ^( KILLUNIT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:435:1: teleportUnit : 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) ;
    public final AtrophyScriptParser.teleportUnit_return teleportUnit() throws RecognitionException {
        AtrophyScriptParser.teleportUnit_return retval = new AtrophyScriptParser.teleportUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal278=null;
        Token char_literal279=null;
        Token char_literal281=null;
        AtrophyScriptParser.unitInfo_return unitInfo280 =null;


        CommonTree string_literal278_tree=null;
        CommonTree char_literal279_tree=null;
        CommonTree char_literal281_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:435:13: ( 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:436:4: 'teleport' '{' unitInfo '}'
            {
            string_literal278=(Token)match(input,185,FOLLOW_185_in_teleportUnit2782);  
            stream_185.add(string_literal278);


            char_literal279=(Token)match(input,199,FOLLOW_199_in_teleportUnit2784);  
            stream_199.add(char_literal279);


            pushFollow(FOLLOW_unitInfo_in_teleportUnit2786);
            unitInfo280=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo280.getTree());

            char_literal281=(Token)match(input,200,FOLLOW_200_in_teleportUnit2788);  
            stream_200.add(char_literal281);


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
            // 436:32: -> ^( TELEPORT unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:436:35: ^( TELEPORT unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:439:1: converseUnit : 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) ;
    public final AtrophyScriptParser.converseUnit_return converseUnit() throws RecognitionException {
        AtrophyScriptParser.converseUnit_return retval = new AtrophyScriptParser.converseUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal282=null;
        Token char_literal283=null;
        Token char_literal285=null;
        AtrophyScriptParser.unitInfo_return unitInfo284 =null;


        CommonTree string_literal282_tree=null;
        CommonTree char_literal283_tree=null;
        CommonTree char_literal285_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:439:13: ( 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:440:4: 'converse' '{' unitInfo '}'
            {
            string_literal282=(Token)match(input,127,FOLLOW_127_in_converseUnit2811);  
            stream_127.add(string_literal282);


            char_literal283=(Token)match(input,199,FOLLOW_199_in_converseUnit2813);  
            stream_199.add(char_literal283);


            pushFollow(FOLLOW_unitInfo_in_converseUnit2815);
            unitInfo284=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo284.getTree());

            char_literal285=(Token)match(input,200,FOLLOW_200_in_converseUnit2817);  
            stream_200.add(char_literal285);


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
            // 440:32: -> ^( CONVERSE unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:440:35: ^( CONVERSE unitInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:443:1: createSaferoom : 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.createSaferoom_return createSaferoom() throws RecognitionException {
        AtrophyScriptParser.createSaferoom_return retval = new AtrophyScriptParser.createSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal286=null;
        Token char_literal287=null;
        Token char_literal289=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo288 =null;


        CommonTree string_literal286_tree=null;
        CommonTree char_literal287_tree=null;
        CommonTree char_literal289_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:443:15: ( 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:444:4: 'saferoom' '{' saferoomInfo '}'
            {
            string_literal286=(Token)match(input,170,FOLLOW_170_in_createSaferoom2840);  
            stream_170.add(string_literal286);


            char_literal287=(Token)match(input,199,FOLLOW_199_in_createSaferoom2842);  
            stream_199.add(char_literal287);


            pushFollow(FOLLOW_saferoomInfo_in_createSaferoom2844);
            saferoomInfo288=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo288.getTree());

            char_literal289=(Token)match(input,200,FOLLOW_200_in_createSaferoom2846);  
            stream_200.add(char_literal289);


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
            // 444:36: -> ^( SAFEROOM saferoomInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:444:39: ^( SAFEROOM saferoomInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:447:1: removeSaferoom : 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.removeSaferoom_return removeSaferoom() throws RecognitionException {
        AtrophyScriptParser.removeSaferoom_return retval = new AtrophyScriptParser.removeSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal290=null;
        Token char_literal291=null;
        Token char_literal293=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo292 =null;


        CommonTree string_literal290_tree=null;
        CommonTree char_literal291_tree=null;
        CommonTree char_literal293_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:447:15: ( 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:448:4: 'removeSaferoom' '{' saferoomInfo '}'
            {
            string_literal290=(Token)match(input,165,FOLLOW_165_in_removeSaferoom2869);  
            stream_165.add(string_literal290);


            char_literal291=(Token)match(input,199,FOLLOW_199_in_removeSaferoom2871);  
            stream_199.add(char_literal291);


            pushFollow(FOLLOW_saferoomInfo_in_removeSaferoom2873);
            saferoomInfo292=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo292.getTree());

            char_literal293=(Token)match(input,200,FOLLOW_200_in_removeSaferoom2875);  
            stream_200.add(char_literal293);


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
            // 448:42: -> ^( REMOVESAFEROOM saferoomInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:448:45: ^( REMOVESAFEROOM saferoomInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:451:1: containsFaction : 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) ;
    public final AtrophyScriptParser.containsFaction_return containsFaction() throws RecognitionException {
        AtrophyScriptParser.containsFaction_return retval = new AtrophyScriptParser.containsFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal294=null;
        AtrophyScriptParser.stringList_return stringList295 =null;


        CommonTree string_literal294_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:451:16: ( 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:452:4: 'containsFaction:' stringList
            {
            string_literal294=(Token)match(input,126,FOLLOW_126_in_containsFaction2898);  
            stream_126.add(string_literal294);


            pushFollow(FOLLOW_stringList_in_containsFaction2900);
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
            // 452:34: -> ^( CONTAINSFACTION stringList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:452:37: ^( CONTAINSFACTION stringList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:455:1: saferoomInfo : ( containsFaction | isName )* ;
    public final AtrophyScriptParser.saferoomInfo_return saferoomInfo() throws RecognitionException {
        AtrophyScriptParser.saferoomInfo_return retval = new AtrophyScriptParser.saferoomInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.containsFaction_return containsFaction296 =null;

        AtrophyScriptParser.isName_return isName297 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:455:13: ( ( containsFaction | isName )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:456:4: ( containsFaction | isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:456:4: ( containsFaction | isName )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==126) ) {
                    alt42=1;
                }
                else if ( (LA42_0==142) ) {
                    alt42=2;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:456:5: containsFaction
            	    {
            	    pushFollow(FOLLOW_containsFaction_in_saferoomInfo2924);
            	    containsFaction296=containsFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, containsFaction296.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:457:6: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_saferoomInfo2931);
            	    isName297=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName297.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
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


    public static class mapInfo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mapInfo"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:460:1: mapInfo : ( isName | isFaction | itemSpawnChance )* ;
    public final AtrophyScriptParser.mapInfo_return mapInfo() throws RecognitionException {
        AtrophyScriptParser.mapInfo_return retval = new AtrophyScriptParser.mapInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName298 =null;

        AtrophyScriptParser.isFaction_return isFaction299 =null;

        AtrophyScriptParser.itemSpawnChance_return itemSpawnChance300 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:460:8: ( ( isName | isFaction | itemSpawnChance )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:461:4: ( isName | isFaction | itemSpawnChance )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:461:4: ( isName | isFaction | itemSpawnChance )*
            loop43:
            do {
                int alt43=4;
                switch ( input.LA(1) ) {
                case 142:
                    {
                    alt43=1;
                    }
                    break;
                case 140:
                    {
                    alt43=2;
                    }
                    break;
                case 131:
                case 154:
                case 171:
                case 195:
                    {
                    alt43=3;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:461:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_mapInfo2949);
            	    isName298=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName298.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:461:14: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_mapInfo2953);
            	    isFaction299=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction299.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:461:26: itemSpawnChance
            	    {
            	    pushFollow(FOLLOW_itemSpawnChance_in_mapInfo2957);
            	    itemSpawnChance300=itemSpawnChance();

            	    state._fsp--;

            	    adaptor.addChild(root_0, itemSpawnChance300.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // $ANTLR end "mapInfo"


    public static class itemSpawnChance_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "itemSpawnChance"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:464:1: itemSpawnChance : ( 'engChance:' INT -> ^( ENG INT ) | 'medChance:' INT -> ^( MED INT ) | 'wepChance:' INT -> ^( WEP INT ) | 'sciChance' INT -> ^( SCI INT ) );
    public final AtrophyScriptParser.itemSpawnChance_return itemSpawnChance() throws RecognitionException {
        AtrophyScriptParser.itemSpawnChance_return retval = new AtrophyScriptParser.itemSpawnChance_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal301=null;
        Token INT302=null;
        Token string_literal303=null;
        Token INT304=null;
        Token string_literal305=null;
        Token INT306=null;
        Token string_literal307=null;
        Token INT308=null;

        CommonTree string_literal301_tree=null;
        CommonTree INT302_tree=null;
        CommonTree string_literal303_tree=null;
        CommonTree INT304_tree=null;
        CommonTree string_literal305_tree=null;
        CommonTree INT306_tree=null;
        CommonTree string_literal307_tree=null;
        CommonTree INT308_tree=null;
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:464:16: ( 'engChance:' INT -> ^( ENG INT ) | 'medChance:' INT -> ^( MED INT ) | 'wepChance:' INT -> ^( WEP INT ) | 'sciChance' INT -> ^( SCI INT ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt44=1;
                }
                break;
            case 154:
                {
                alt44=2;
                }
                break;
            case 195:
                {
                alt44=3;
                }
                break;
            case 171:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:465:4: 'engChance:' INT
                    {
                    string_literal301=(Token)match(input,131,FOLLOW_131_in_itemSpawnChance2974);  
                    stream_131.add(string_literal301);


                    INT302=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance2976);  
                    stream_INT.add(INT302);


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
                    // 465:21: -> ^( ENG INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:465:24: ^( ENG INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ENG, "ENG")
                        , root_1);

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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:466:6: 'medChance:' INT
                    {
                    string_literal303=(Token)match(input,154,FOLLOW_154_in_itemSpawnChance2991);  
                    stream_154.add(string_literal303);


                    INT304=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance2993);  
                    stream_INT.add(INT304);


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
                    // 466:23: -> ^( MED INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:466:26: ^( MED INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(MED, "MED")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:467:6: 'wepChance:' INT
                    {
                    string_literal305=(Token)match(input,195,FOLLOW_195_in_itemSpawnChance3008);  
                    stream_195.add(string_literal305);


                    INT306=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3010);  
                    stream_INT.add(INT306);


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
                    // 467:23: -> ^( WEP INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:467:26: ^( WEP INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(WEP, "WEP")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:468:6: 'sciChance' INT
                    {
                    string_literal307=(Token)match(input,171,FOLLOW_171_in_itemSpawnChance3025);  
                    stream_171.add(string_literal307);


                    INT308=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3027);  
                    stream_INT.add(INT308);


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
                    // 468:22: -> ^( SCI INT )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:468:25: ^( SCI INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SCI, "SCI")
                        , root_1);

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
    // $ANTLR end "itemSpawnChance"


    public static class loadMap_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "loadMap"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:471:1: loadMap : 'loadMap' '{' mapInfo '}' -> ^( LOADMAP mapInfo ) ;
    public final AtrophyScriptParser.loadMap_return loadMap() throws RecognitionException {
        AtrophyScriptParser.loadMap_return retval = new AtrophyScriptParser.loadMap_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal309=null;
        Token char_literal310=null;
        Token char_literal312=null;
        AtrophyScriptParser.mapInfo_return mapInfo311 =null;


        CommonTree string_literal309_tree=null;
        CommonTree char_literal310_tree=null;
        CommonTree char_literal312_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_mapInfo=new RewriteRuleSubtreeStream(adaptor,"rule mapInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:471:8: ( 'loadMap' '{' mapInfo '}' -> ^( LOADMAP mapInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:472:4: 'loadMap' '{' mapInfo '}'
            {
            string_literal309=(Token)match(input,149,FOLLOW_149_in_loadMap3050);  
            stream_149.add(string_literal309);


            char_literal310=(Token)match(input,199,FOLLOW_199_in_loadMap3052);  
            stream_199.add(char_literal310);


            pushFollow(FOLLOW_mapInfo_in_loadMap3054);
            mapInfo311=mapInfo();

            state._fsp--;

            stream_mapInfo.add(mapInfo311.getTree());

            char_literal312=(Token)match(input,200,FOLLOW_200_in_loadMap3056);  
            stream_200.add(char_literal312);


            // AST REWRITE
            // elements: mapInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 472:30: -> ^( LOADMAP mapInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:472:33: ^( LOADMAP mapInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LOADMAP, "LOADMAP")
                , root_1);

                adaptor.addChild(root_1, stream_mapInfo.nextTree());

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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:475:1: lockDoor : 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.lockDoor_return lockDoor() throws RecognitionException {
        AtrophyScriptParser.lockDoor_return retval = new AtrophyScriptParser.lockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal313=null;
        Token char_literal314=null;
        Token char_literal316=null;
        AtrophyScriptParser.doorInfo_return doorInfo315 =null;


        CommonTree string_literal313_tree=null;
        CommonTree char_literal314_tree=null;
        CommonTree char_literal316_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:475:9: ( 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:476:4: 'lockDoor' '{' doorInfo '}'
            {
            string_literal313=(Token)match(input,150,FOLLOW_150_in_lockDoor3079);  
            stream_150.add(string_literal313);


            char_literal314=(Token)match(input,199,FOLLOW_199_in_lockDoor3081);  
            stream_199.add(char_literal314);


            pushFollow(FOLLOW_doorInfo_in_lockDoor3083);
            doorInfo315=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo315.getTree());

            char_literal316=(Token)match(input,200,FOLLOW_200_in_lockDoor3085);  
            stream_200.add(char_literal316);


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
            // 476:32: -> ^( LOCKDOOR doorInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:476:35: ^( LOCKDOOR doorInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:479:1: unlockDoor : 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.unlockDoor_return unlockDoor() throws RecognitionException {
        AtrophyScriptParser.unlockDoor_return retval = new AtrophyScriptParser.unlockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal317=null;
        Token char_literal318=null;
        Token char_literal320=null;
        AtrophyScriptParser.doorInfo_return doorInfo319 =null;


        CommonTree string_literal317_tree=null;
        CommonTree char_literal318_tree=null;
        CommonTree char_literal320_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:479:11: ( 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:480:4: 'unlockDoor' '{' doorInfo '}'
            {
            string_literal317=(Token)match(input,193,FOLLOW_193_in_unlockDoor3108);  
            stream_193.add(string_literal317);


            char_literal318=(Token)match(input,199,FOLLOW_199_in_unlockDoor3110);  
            stream_199.add(char_literal318);


            pushFollow(FOLLOW_doorInfo_in_unlockDoor3112);
            doorInfo319=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo319.getTree());

            char_literal320=(Token)match(input,200,FOLLOW_200_in_unlockDoor3114);  
            stream_200.add(char_literal320);


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
            // 480:34: -> ^( UNLOCKDOOR doorInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:480:37: ^( UNLOCKDOOR doorInfo )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:483:1: doorInfo : ( isName )* ;
    public final AtrophyScriptParser.doorInfo_return doorInfo() throws RecognitionException {
        AtrophyScriptParser.doorInfo_return retval = new AtrophyScriptParser.doorInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName321 =null;



        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:483:9: ( ( isName )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:484:4: ( isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:484:4: ( isName )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==142) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:484:4: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_doorInfo3137);
            	    isName321=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName321.getTree());

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
    // $ANTLR end "doorInfo"


    public static class addTag_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addTag"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:487:1: addTag : ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) );
    public final AtrophyScriptParser.addTag_return addTag() throws RecognitionException {
        AtrophyScriptParser.addTag_return retval = new AtrophyScriptParser.addTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal322=null;
        Token ADD_TAG_PREFIX324=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral323 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral325 =null;


        CommonTree string_literal322_tree=null;
        CommonTree ADD_TAG_PREFIX324_tree=null;
        RewriteRuleTokenStream stream_ADD_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token ADD_TAG_PREFIX");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:487:7: ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==118) ) {
                alt46=1;
            }
            else if ( (LA46_0==ADD_TAG_PREFIX) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:488:4: 'addTag:' stringLiteral
                    {
                    string_literal322=(Token)match(input,118,FOLLOW_118_in_addTag3153);  
                    stream_118.add(string_literal322);


                    pushFollow(FOLLOW_stringLiteral_in_addTag3155);
                    stringLiteral323=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral323.getTree());

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
                    // 488:28: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:488:31: ^( ADDTAG stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:489:6: ADD_TAG_PREFIX stringLiteral
                    {
                    ADD_TAG_PREFIX324=(Token)match(input,ADD_TAG_PREFIX,FOLLOW_ADD_TAG_PREFIX_in_addTag3170);  
                    stream_ADD_TAG_PREFIX.add(ADD_TAG_PREFIX324);


                    pushFollow(FOLLOW_stringLiteral_in_addTag3172);
                    stringLiteral325=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral325.getTree());

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
                    // 489:35: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:489:38: ^( ADDTAG stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:492:1: removeTag : ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) );
    public final AtrophyScriptParser.removeTag_return removeTag() throws RecognitionException {
        AtrophyScriptParser.removeTag_return retval = new AtrophyScriptParser.removeTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal326=null;
        Token REMOVE_TAG_PREFIX328=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral327 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral329 =null;


        CommonTree string_literal326_tree=null;
        CommonTree REMOVE_TAG_PREFIX328_tree=null;
        RewriteRuleTokenStream stream_REMOVE_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token REMOVE_TAG_PREFIX");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:492:10: ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==166) ) {
                alt47=1;
            }
            else if ( (LA47_0==REMOVE_TAG_PREFIX) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:493:4: 'removeTag:' stringLiteral
                    {
                    string_literal326=(Token)match(input,166,FOLLOW_166_in_removeTag3195);  
                    stream_166.add(string_literal326);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag3197);
                    stringLiteral327=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral327.getTree());

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
                    // 493:31: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:493:34: ^( REMOVETAG stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:6: REMOVE_TAG_PREFIX stringLiteral
                    {
                    REMOVE_TAG_PREFIX328=(Token)match(input,REMOVE_TAG_PREFIX,FOLLOW_REMOVE_TAG_PREFIX_in_removeTag3212);  
                    stream_REMOVE_TAG_PREFIX.add(REMOVE_TAG_PREFIX328);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag3214);
                    stringLiteral329=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral329.getTree());

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
                    // 494:38: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:41: ^( REMOVETAG stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:497:1: directorBias : 'directorBias:' -> ^( DIRECTORBIAS ) ;
    public final AtrophyScriptParser.directorBias_return directorBias() throws RecognitionException {
        AtrophyScriptParser.directorBias_return retval = new AtrophyScriptParser.directorBias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal330=null;

        CommonTree string_literal330_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:497:13: ( 'directorBias:' -> ^( DIRECTORBIAS ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:498:4: 'directorBias:'
            {
            string_literal330=(Token)match(input,130,FOLLOW_130_in_directorBias3237);  
            stream_130.add(string_literal330);


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
            // 498:20: -> ^( DIRECTORBIAS )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:498:23: ^( DIRECTORBIAS )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:501:1: changeAiNode : 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}' -> ^( CHANGEAINODE unitInfo aiNodeOptions ) ;
    public final AtrophyScriptParser.changeAiNode_return changeAiNode() throws RecognitionException {
        AtrophyScriptParser.changeAiNode_return retval = new AtrophyScriptParser.changeAiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal331=null;
        Token char_literal332=null;
        Token char_literal333=null;
        Token char_literal335=null;
        Token char_literal336=null;
        Token char_literal338=null;
        Token char_literal339=null;
        AtrophyScriptParser.unitInfo_return unitInfo334 =null;

        AtrophyScriptParser.aiNodeOptions_return aiNodeOptions337 =null;


        CommonTree string_literal331_tree=null;
        CommonTree char_literal332_tree=null;
        CommonTree char_literal333_tree=null;
        CommonTree char_literal335_tree=null;
        CommonTree char_literal336_tree=null;
        CommonTree char_literal338_tree=null;
        CommonTree char_literal339_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_aiNodeOptions=new RewriteRuleSubtreeStream(adaptor,"rule aiNodeOptions");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:501:13: ( 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}' -> ^( CHANGEAINODE unitInfo aiNodeOptions ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:502:4: 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}'
            {
            string_literal331=(Token)match(input,124,FOLLOW_124_in_changeAiNode3258);  
            stream_124.add(string_literal331);


            char_literal332=(Token)match(input,199,FOLLOW_199_in_changeAiNode3260);  
            stream_199.add(char_literal332);


            char_literal333=(Token)match(input,199,FOLLOW_199_in_changeAiNode3262);  
            stream_199.add(char_literal333);


            pushFollow(FOLLOW_unitInfo_in_changeAiNode3264);
            unitInfo334=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo334.getTree());

            char_literal335=(Token)match(input,200,FOLLOW_200_in_changeAiNode3266);  
            stream_200.add(char_literal335);


            char_literal336=(Token)match(input,199,FOLLOW_199_in_changeAiNode3268);  
            stream_199.add(char_literal336);


            pushFollow(FOLLOW_aiNodeOptions_in_changeAiNode3270);
            aiNodeOptions337=aiNodeOptions();

            state._fsp--;

            stream_aiNodeOptions.add(aiNodeOptions337.getTree());

            char_literal338=(Token)match(input,200,FOLLOW_200_in_changeAiNode3272);  
            stream_200.add(char_literal338);


            char_literal339=(Token)match(input,200,FOLLOW_200_in_changeAiNode3274);  
            stream_200.add(char_literal339);


            // AST REWRITE
            // elements: unitInfo, aiNodeOptions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 502:66: -> ^( CHANGEAINODE unitInfo aiNodeOptions )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:502:69: ^( CHANGEAINODE unitInfo aiNodeOptions )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CHANGEAINODE, "CHANGEAINODE")
                , root_1);

                adaptor.addChild(root_1, stream_unitInfo.nextTree());

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
    // $ANTLR end "changeAiNode"


    public static class showMessage_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "showMessage"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:505:1: showMessage : 'showMessage:' stringLiteral -> ^( SHOWMESSAGE stringLiteral ) ;
    public final AtrophyScriptParser.showMessage_return showMessage() throws RecognitionException {
        AtrophyScriptParser.showMessage_return retval = new AtrophyScriptParser.showMessage_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal340=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral341 =null;


        CommonTree string_literal340_tree=null;
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:505:12: ( 'showMessage:' stringLiteral -> ^( SHOWMESSAGE stringLiteral ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:506:4: 'showMessage:' stringLiteral
            {
            string_literal340=(Token)match(input,173,FOLLOW_173_in_showMessage3299);  
            stream_173.add(string_literal340);


            pushFollow(FOLLOW_stringLiteral_in_showMessage3301);
            stringLiteral341=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral341.getTree());

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
            // 506:33: -> ^( SHOWMESSAGE stringLiteral )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:506:36: ^( SHOWMESSAGE stringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SHOWMESSAGE, "SHOWMESSAGE")
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
    // $ANTLR end "showMessage"


    public static class setTriggerRunning_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "setTriggerRunning"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:509:1: setTriggerRunning : 'setTriggerRunning:' stringLiteral BOOL -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL ) ;
    public final AtrophyScriptParser.setTriggerRunning_return setTriggerRunning() throws RecognitionException {
        AtrophyScriptParser.setTriggerRunning_return retval = new AtrophyScriptParser.setTriggerRunning_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal342=null;
        Token BOOL344=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral343 =null;


        CommonTree string_literal342_tree=null;
        CommonTree BOOL344_tree=null;
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:509:18: ( 'setTriggerRunning:' stringLiteral BOOL -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:510:4: 'setTriggerRunning:' stringLiteral BOOL
            {
            string_literal342=(Token)match(input,172,FOLLOW_172_in_setTriggerRunning3324);  
            stream_172.add(string_literal342);


            pushFollow(FOLLOW_stringLiteral_in_setTriggerRunning3326);
            stringLiteral343=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral343.getTree());

            BOOL344=(Token)match(input,BOOL,FOLLOW_BOOL_in_setTriggerRunning3328);  
            stream_BOOL.add(BOOL344);


            // AST REWRITE
            // elements: stringLiteral, BOOL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 510:44: -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:510:47: ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SETTRIGGERRUNNING, "SETTRIGGERRUNNING")
                , root_1);

                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:510:67: ^( STRING stringLiteral )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STRING, "STRING")
                , root_2);

                adaptor.addChild(root_2, stream_stringLiteral.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
    // $ANTLR end "setTriggerRunning"


    public static class spawnItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spawnItem"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:513:1: spawnItem : 'spawnItem' stringList '{' unitInfo '}' -> ^( SPAWNITEM stringList unitInfo ) ;
    public final AtrophyScriptParser.spawnItem_return spawnItem() throws RecognitionException {
        AtrophyScriptParser.spawnItem_return retval = new AtrophyScriptParser.spawnItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal345=null;
        Token char_literal347=null;
        Token char_literal349=null;
        AtrophyScriptParser.stringList_return stringList346 =null;

        AtrophyScriptParser.unitInfo_return unitInfo348 =null;


        CommonTree string_literal345_tree=null;
        CommonTree char_literal347_tree=null;
        CommonTree char_literal349_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:513:10: ( 'spawnItem' stringList '{' unitInfo '}' -> ^( SPAWNITEM stringList unitInfo ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:514:4: 'spawnItem' stringList '{' unitInfo '}'
            {
            string_literal345=(Token)match(input,175,FOLLOW_175_in_spawnItem3357);  
            stream_175.add(string_literal345);


            pushFollow(FOLLOW_stringList_in_spawnItem3359);
            stringList346=stringList();

            state._fsp--;

            stream_stringList.add(stringList346.getTree());

            char_literal347=(Token)match(input,199,FOLLOW_199_in_spawnItem3361);  
            stream_199.add(char_literal347);


            pushFollow(FOLLOW_unitInfo_in_spawnItem3363);
            unitInfo348=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo348.getTree());

            char_literal349=(Token)match(input,200,FOLLOW_200_in_spawnItem3365);  
            stream_200.add(char_literal349);


            // AST REWRITE
            // elements: unitInfo, stringList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 514:44: -> ^( SPAWNITEM stringList unitInfo )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:514:47: ^( SPAWNITEM stringList unitInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SPAWNITEM, "SPAWNITEM")
                , root_1);

                adaptor.addChild(root_1, stream_stringList.nextTree());

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
    // $ANTLR end "spawnItem"


    public static class beginStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "beginStatement"
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:517:1: beginStatement : ( 'INIT' | 'init' ) '{' commandCallList '}' -> ^( INIT commandCallList ) ;
    public final AtrophyScriptParser.beginStatement_return beginStatement() throws RecognitionException {
        AtrophyScriptParser.beginStatement_return retval = new AtrophyScriptParser.beginStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal350=null;
        Token string_literal351=null;
        Token char_literal352=null;
        Token char_literal354=null;
        AtrophyScriptParser.commandCallList_return commandCallList353 =null;


        CommonTree string_literal350_tree=null;
        CommonTree string_literal351_tree=null;
        CommonTree char_literal352_tree=null;
        CommonTree char_literal354_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_commandCallList=new RewriteRuleSubtreeStream(adaptor,"rule commandCallList");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:517:15: ( ( 'INIT' | 'init' ) '{' commandCallList '}' -> ^( INIT commandCallList ) )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:518:4: ( 'INIT' | 'init' ) '{' commandCallList '}'
            {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:518:4: ( 'INIT' | 'init' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==108) ) {
                alt48=1;
            }
            else if ( (LA48_0==136) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:518:5: 'INIT'
                    {
                    string_literal350=(Token)match(input,108,FOLLOW_108_in_beginStatement3391);  
                    stream_108.add(string_literal350);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:518:14: 'init'
                    {
                    string_literal351=(Token)match(input,136,FOLLOW_136_in_beginStatement3395);  
                    stream_136.add(string_literal351);


                    }
                    break;

            }


            char_literal352=(Token)match(input,199,FOLLOW_199_in_beginStatement3398);  
            stream_199.add(char_literal352);


            pushFollow(FOLLOW_commandCallList_in_beginStatement3403);
            commandCallList353=commandCallList();

            state._fsp--;

            stream_commandCallList.add(commandCallList353.getTree());

            char_literal354=(Token)match(input,200,FOLLOW_200_in_beginStatement3408);  
            stream_200.add(char_literal354);


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
            // 521:4: -> ^( INIT commandCallList )
            {
                // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:522:4: ^( INIT commandCallList )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:525:1: commandCallList : commandCall ( ',' ! commandCall )* ;
    public final AtrophyScriptParser.commandCallList_return commandCallList() throws RecognitionException {
        AtrophyScriptParser.commandCallList_return retval = new AtrophyScriptParser.commandCallList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal356=null;
        AtrophyScriptParser.commandCall_return commandCall355 =null;

        AtrophyScriptParser.commandCall_return commandCall357 =null;


        CommonTree char_literal356_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:525:16: ( commandCall ( ',' ! commandCall )* )
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:526:4: commandCall ( ',' ! commandCall )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_commandCall_in_commandCallList3435);
            commandCall355=commandCall();

            state._fsp--;

            adaptor.addChild(root_0, commandCall355.getTree());

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:526:16: ( ',' ! commandCall )*
            loop49:
            do {
                int alt49=2;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:526:17: ',' ! commandCall
            	    {
            	    char_literal356=(Token)match(input,102,FOLLOW_102_in_commandCallList3438); 

            	    pushFollow(FOLLOW_commandCall_in_commandCallList3441);
            	    commandCall357=commandCall();

            	    state._fsp--;

            	    adaptor.addChild(root_0, commandCall357.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:529:1: commandCall : ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) );
    public final AtrophyScriptParser.commandCall_return commandCall() throws RecognitionException {
        AtrophyScriptParser.commandCall_return retval = new AtrophyScriptParser.commandCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal358=null;
        Token COMMAND_CALL_PREFIX360=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral359 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral361 =null;


        CommonTree string_literal358_tree=null;
        CommonTree COMMAND_CALL_PREFIX360_tree=null;
        RewriteRuleTokenStream stream_COMMAND_CALL_PREFIX=new RewriteRuleTokenStream(adaptor,"token COMMAND_CALL_PREFIX");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:529:12: ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==123) ) {
                alt50=1;
            }
            else if ( (LA50_0==COMMAND_CALL_PREFIX) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:530:4: 'callCommand:' stringLiteral
                    {
                    string_literal358=(Token)match(input,123,FOLLOW_123_in_commandCall3458);  
                    stream_123.add(string_literal358);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall3460);
                    stringLiteral359=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral359.getTree());

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
                    // 530:33: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:530:36: ^( COMMAND_CALL stringLiteral )
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
                    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:531:6: COMMAND_CALL_PREFIX stringLiteral
                    {
                    COMMAND_CALL_PREFIX360=(Token)match(input,COMMAND_CALL_PREFIX,FOLLOW_COMMAND_CALL_PREFIX_in_commandCall3475);  
                    stream_COMMAND_CALL_PREFIX.add(COMMAND_CALL_PREFIX360);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall3477);
                    stringLiteral361=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral361.getTree());

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
                    // 531:40: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:531:43: ^( COMMAND_CALL stringLiteral )
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
    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:534:1: stringLiteral : '\"' ! ( . )* '\"' !;
    public final AtrophyScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        AtrophyScriptParser.stringLiteral_return retval = new AtrophyScriptParser.stringLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal362=null;
        Token wildcard363=null;
        Token char_literal364=null;

        CommonTree char_literal362_tree=null;
        CommonTree wildcard363_tree=null;
        CommonTree char_literal364_tree=null;

        try {
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:534:14: ( '\"' ! ( . )* '\"' !)
            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:535:4: '\"' ! ( . )* '\"' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal362=(Token)match(input,98,FOLLOW_98_in_stringLiteral3500); 

            // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:535:9: ( . )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==98) ) {
                    alt51=2;
                }
                else if ( ((LA51_0 >= ADDTAG && LA51_0 <= ZONE)||(LA51_0 >= 99 && LA51_0 <= 200)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // C:\\Users\\Charles Sherman\\workspace\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:535:9: .
            	    {
            	    wildcard363=(Token)input.LT(1);

            	    matchAny(input); 
            	    wildcard363_tree = (CommonTree)adaptor.create(wildcard363);
            	    adaptor.addChild(root_0, wildcard363_tree);


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            char_literal364=(Token)match(input,98,FOLLOW_98_in_stringLiteral3506); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA49_eotS =
        "\13\uffff";
    static final String DFA49_eofS =
        "\13\uffff";
    static final String DFA49_minS =
        "\1\146\1\5\1\uffff\2\142\2\4\1\uffff\1\4\1\uffff\1\4";
    static final String DFA49_maxS =
        "\1\u00c8\1\u00c2\1\uffff\2\142\2\u00c8\1\uffff\1\u00c8\1\uffff\1"+
        "\u00c8";
    static final String DFA49_acceptS =
        "\2\uffff\1\2\4\uffff\1\1\1\uffff\1\1\1\uffff";
    static final String DFA49_specialS =
        "\13\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\1\141\uffff\1\2",
            "\1\2\11\uffff\1\4\56\uffff\1\2\34\uffff\1\2\32\uffff\1\2\4"+
            "\uffff\1\3\1\2\2\uffff\1\2\2\uffff\1\2\17\uffff\1\2\2\uffff"+
            "\2\2\16\uffff\3\2\2\uffff\1\2\1\uffff\5\2\10\uffff\1\2\7\uffff"+
            "\2\2",
            "",
            "\1\5",
            "\1\6",
            "\136\10\1\7\146\10",
            "\136\12\1\11\146\12",
            "",
            "\136\10\1\7\146\10",
            "",
            "\136\12\1\11\146\12"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "()* loopback of 526:16: ( ',' ! commandCall )*";
        }
    }
 

    public static final BitSet FOLLOW_command_in_prog393 = new BitSet(new long[]{0x0000000000000000L,0x241D760000000000L,0x5840000801800100L});
    public static final BitSet FOLLOW_beginStatement_in_prog400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSize_in_command423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSpawns_in_command430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockDecl_in_command437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portalDecl_in_command444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textureBlockDecl_in_command451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerDecl_in_command458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandDecl_in_command465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_talkDecl_in_command472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_requiredAssignment485 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_requiredAssignment487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requiredAssignment_in_varAssignment511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_mapSize538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_151_in_mapSize542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_mapSize545 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_mapSize547 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_mapSize549 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_mapSize551 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_mapSize553 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_mapSize555 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_mapSize557 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_mapSize559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_mapSize561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_mapSpawns586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_152_in_mapSpawns590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_mapSpawns593 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_stringList_in_mapSpawns595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_mapSpawns598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_blockDecl623 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_122_in_blockDecl627 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varAssignment_in_blockDecl630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_blockDecl632 = new BitSet(new long[]{0x0000000000000000L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000171L});
    public static final BitSet FOLLOW_properties_in_blockDecl634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_blockDecl636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_portalDecl662 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_163_in_portalDecl666 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varAssignment_in_portalDecl669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_portalDecl671 = new BitSet(new long[]{0x0000000000000000L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000171L});
    public static final BitSet FOLLOW_properties_in_portalDecl673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_portalDecl675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_textureBlockDecl701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_188_in_textureBlockDecl705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_187_in_textureBlockDecl709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_textureBlockDecl712 = new BitSet(new long[]{0x0000000000000000L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000171L});
    public static final BitSet FOLLOW_properties_in_textureBlockDecl714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_textureBlockDecl716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_triggerDecl740 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_190_in_triggerDecl744 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_triggerDecl747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_triggerDecl749 = new BitSet(new long[]{0x0000000000000000L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000171L});
    public static final BitSet FOLLOW_properties_in_triggerDecl751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_triggerDecl753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_commandDecl779 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_125_in_commandDecl783 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_commandDecl786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_commandDecl788 = new BitSet(new long[]{0x4000000000008020L,0x9840000008000000L,0x0201F4E000640004L,0x0000000000000006L});
    public static final BitSet FOLLOW_triggerEffectList_in_commandDecl790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_commandDecl792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_talkDecl822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_182_in_talkDecl826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_talkDecl829 = new BitSet(new long[]{0x0000000000000000L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000171L});
    public static final BitSet FOLLOW_properties_in_talkDecl831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_talkDecl833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xListProperty_in_properties857 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_yListProperty_in_properties864 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_factionTerritoryProperty_in_properties871 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_factionZoneProperty_in_properties878 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_saferoomProperty_in_properties885 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_stageProperty_in_properties892 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_stageDeclProperty_in_properties899 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_talkMapParentProperty_in_properties906 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_aiInitProperty_in_properties913 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_openingLineProperty_in_properties920 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_optionProperty_in_properties927 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_topicProperty_in_properties934 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_triggerCondProperty_in_properties941 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_triggerEffectProperty_in_properties948 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_coverDecl_in_properties955 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_stashDecl_in_properties962 = new BitSet(new long[]{0x0000000000000002L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000071L});
    public static final BitSet FOLLOW_196_in_xListProperty979 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty981 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_xListProperty984 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty985 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_197_in_yListProperty1009 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty1011 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_yListProperty1014 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty1015 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_186_in_factionTerritoryProperty1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_factionTerritoryProperty1043 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_factionTerritoryProperty1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_factionZoneProperty1074 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringList_in_factionZoneProperty1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_saferoomProperty1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_stageDeclProperty1120 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1122 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_stageDeclProperty1125 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1127 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_162_in_talkMapParentProperty1154 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_161_in_talkMapParentProperty1158 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_talkMapParentProperty1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_stageProperty1185 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_169_in_stageProperty1189 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_stageProperty1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_aiInitProperty1216 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_117_in_aiInitProperty1220 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BOOL_in_aiInitProperty1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_openingLineProperty1247 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_158_in_openingLineProperty1251 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_159_in_openingLineProperty1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_openingLineProperty1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_optionProperty1280 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_160_in_optionProperty1284 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_optionProperty1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_topicProperty1311 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_189_in_topicProperty1315 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_topicProperty1318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_topicProperty1320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000100000L,0x0000000000000100L});
    public static final BitSet FOLLOW_topicProperties_in_topicProperty1322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_topicProperty1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topicLine_in_topicProperties1351 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000100000L});
    public static final BitSet FOLLOW_topicRequiement_in_topicProperties1355 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000100000L});
    public static final BitSet FOLLOW_148_in_topicLine1372 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_topicLine1373 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_topicLine1376 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_topicLine1378 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_168_in_topicRequiement1404 = new BitSet(new long[]{0x0010000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_reqString_in_topicRequiement1406 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_topicRequiement1409 = new BitSet(new long[]{0x0010000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_reqString_in_topicRequiement1411 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_NOT_PREFIX_in_reqString1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_reqString1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_reqString1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_aliveQuery1469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_aliveQuery1471 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x000000000A03FEC2L,0x0000000000000100L});
    public static final BitSet FOLLOW_unitInfo_in_aliveQuery1473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_aliveQuery1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_timeQuery1498 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1500 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_133_in_timeQuery1506 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_timeQuery1528 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_boolQuery1572 = new BitSet(new long[]{0x0010000000000000L,0x0000001000000000L,0x0000000020000200L});
    public static final BitSet FOLLOW_queryLogic_in_boolQuery1575 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_boolQuery1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aliveQuery_in_boolQuery1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeQuery_in_boolQuery1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolQuery_in_queryNegation1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_PREFIX_in_queryNegation1609 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000020000200L});
    public static final BitSet FOLLOW_boolQuery_in_queryNegation1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1635 = new BitSet(new long[]{0x0000000000000002L,0x0000810000000000L});
    public static final BitSet FOLLOW_104_in_queryLogic1640 = new BitSet(new long[]{0x0010000000000000L,0x0000001000000000L,0x0000000020000200L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_queryLogic1661 = new BitSet(new long[]{0x0010000000000000L,0x0000001000000000L,0x0000000020000200L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_triggerCondProperty1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_191_in_triggerCondProperty1709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_triggerCondProperty1712 = new BitSet(new long[]{0x0010000000000000L,0x0000001000000000L,0x0000000020000200L});
    public static final BitSet FOLLOW_queryLogic_in_triggerCondProperty1714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_triggerCondProperty1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_triggerEffectProperty1738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_192_in_triggerEffectProperty1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_triggerEffectProperty1745 = new BitSet(new long[]{0x4000000000008020L,0x9840000008000000L,0x0201F4E000640004L,0x0000000000000006L});
    public static final BitSet FOLLOW_triggerEffectList_in_triggerEffectProperty1747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_triggerEffectProperty1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_coverDecl1773 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_128_in_coverDecl1777 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varAssignment_in_coverDecl1780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_coverDecl1782 = new BitSet(new long[]{0x0000000000000000L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000171L});
    public static final BitSet FOLLOW_properties_in_coverDecl1784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_coverDecl1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_stashDecl1812 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_179_in_stashDecl1816 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varAssignment_in_stashDecl1819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_stashDecl1821 = new BitSet(new long[]{0x0000000000000000L,0x00A2080000000000L,0xA5AE0607D0080001L,0x0000000000000171L});
    public static final BitSet FOLLOW_properties_in_stashDecl1823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_stashDecl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1848 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_triggerEffectList1851 = new BitSet(new long[]{0x4000000000008020L,0x9840000008000000L,0x0201F4E000640004L,0x0000000000000006L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1854 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_updateTalkTree_in_triggerEffect1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnTeam_in_triggerEffect1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnCharacter_in_triggerEffect1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeUnit_in_triggerEffect1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_killUnit_in_triggerEffect1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_teleportUnit_in_triggerEffect1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_converseUnit_in_triggerEffect1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createSaferoom_in_triggerEffect1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeSaferoom_in_triggerEffect1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loadMap_in_triggerEffect1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lockDoor_in_triggerEffect1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlockDoor_in_triggerEffect1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addTag_in_triggerEffect1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeTag_in_triggerEffect1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directorBias_in_triggerEffect1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeAiNode_in_triggerEffect1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showMessage_in_triggerEffect1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setTriggerRunning_in_triggerEffect1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnItem_in_triggerEffect1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCallList_in_triggerEffect2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_updateTalkTree2017 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree2019 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree2038 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree2040 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_updateTalkTree2042 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_isName2069 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringList_in_isName2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_isFaction2094 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringList_in_isFaction2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_hasItem2119 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringList_in_hasItem2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_hasWeapon2144 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringList_in_hasWeapon2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList2169 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_stringList2172 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList2174 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_137_in_isAlive2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_isDead2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_isInvestigated2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_isNotInvestigated2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_isDaemon2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_isNotDaemon2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_teleDestination2322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_teleDestination2324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_xListProperty_in_teleDestination2326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_yListProperty_in_teleDestination2328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_teleDestination2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_maxTeamSize2355 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_maxTeamSize2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_minTeamSize2378 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_minTeamSize2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_isPlayer2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_aiNode2418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_aiNode2420 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0010001000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_aiNodeOptions_in_aiNode2422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_aiNode2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subscribeTalkMaps_in_aiNodeOptions2447 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L,0x0010001000000000L});
    public static final BitSet FOLLOW_behaviours_in_aiNodeOptions2452 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L,0x0010001000000000L});
    public static final BitSet FOLLOW_aiNodePriority_in_aiNodeOptions2457 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L,0x0010001000000000L});
    public static final BitSet FOLLOW_180_in_subscribeTalkMaps2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringList_in_subscribeTalkMaps2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_behaviours2498 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringList_in_behaviours2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_aiNodePriority2523 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringList_in_aiNodePriority2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_unitInfo2549 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_isFaction_in_unitInfo2556 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_hasItem_in_unitInfo2563 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_hasWeapon_in_unitInfo2570 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_isAlive_in_unitInfo2577 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_isDead_in_unitInfo2584 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_isInvestigated_in_unitInfo2591 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_isNotInvestigated_in_unitInfo2598 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_isDaemon_in_unitInfo2605 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_isNotDaemon_in_unitInfo2612 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_teleDestination_in_unitInfo2619 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_maxTeamSize_in_unitInfo2626 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_minTeamSize_in_unitInfo2633 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_aiNode_in_unitInfo2640 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_isPlayer_in_unitInfo2647 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L,0x000000000A03FEC2L});
    public static final BitSet FOLLOW_176_in_spawnTeam2666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_spawnTeam2668 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x000000000A03FEC2L,0x0000000000000100L});
    public static final BitSet FOLLOW_unitInfo_in_spawnTeam2670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_spawnTeam2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_spawnCharacter2695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_spawnCharacter2697 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x000000000A03FEC2L,0x0000000000000100L});
    public static final BitSet FOLLOW_unitInfo_in_spawnCharacter2699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_spawnCharacter2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_removeUnit2724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_removeUnit2726 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x000000000A03FEC2L,0x0000000000000100L});
    public static final BitSet FOLLOW_unitInfo_in_removeUnit2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_removeUnit2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_killUnit2753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_killUnit2755 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x000000000A03FEC2L,0x0000000000000100L});
    public static final BitSet FOLLOW_unitInfo_in_killUnit2757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_killUnit2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_teleportUnit2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_teleportUnit2784 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x000000000A03FEC2L,0x0000000000000100L});
    public static final BitSet FOLLOW_unitInfo_in_teleportUnit2786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_teleportUnit2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_converseUnit2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_converseUnit2813 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x000000000A03FEC2L,0x0000000000000100L});
    public static final BitSet FOLLOW_unitInfo_in_converseUnit2815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_converseUnit2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_createSaferoom2840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_createSaferoom2842 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000004000L,0x0000000000000100L});
    public static final BitSet FOLLOW_saferoomInfo_in_createSaferoom2844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_createSaferoom2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_removeSaferoom2869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_removeSaferoom2871 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000004000L,0x0000000000000100L});
    public static final BitSet FOLLOW_saferoomInfo_in_removeSaferoom2873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_removeSaferoom2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_containsFaction2898 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringList_in_containsFaction2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsFaction_in_saferoomInfo2924 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_isName_in_saferoomInfo2931 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_isName_in_mapInfo2949 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000080004005008L,0x0000000000000008L});
    public static final BitSet FOLLOW_isFaction_in_mapInfo2953 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000080004005008L,0x0000000000000008L});
    public static final BitSet FOLLOW_itemSpawnChance_in_mapInfo2957 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000080004005008L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_itemSpawnChance2974 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_itemSpawnChance2991 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_itemSpawnChance3008 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_itemSpawnChance3025 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_loadMap3050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_loadMap3052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080004005008L,0x0000000000000108L});
    public static final BitSet FOLLOW_mapInfo_in_loadMap3054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_loadMap3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_lockDoor3079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_lockDoor3081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000100L});
    public static final BitSet FOLLOW_doorInfo_in_lockDoor3083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_lockDoor3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_unlockDoor3108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_unlockDoor3110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000100L});
    public static final BitSet FOLLOW_doorInfo_in_unlockDoor3112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_unlockDoor3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_doorInfo3137 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_118_in_addTag3153 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_TAG_PREFIX_in_addTag3170 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_removeTag3195 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_TAG_PREFIX_in_removeTag3212 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_directorBias3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_changeAiNode3258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_changeAiNode3260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_changeAiNode3262 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x000000000A03FEC2L,0x0000000000000100L});
    public static final BitSet FOLLOW_unitInfo_in_changeAiNode3264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_changeAiNode3266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_changeAiNode3268 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0010001000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_aiNodeOptions_in_changeAiNode3270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_changeAiNode3272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_changeAiNode3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_showMessage3299 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_showMessage3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_setTriggerRunning3324 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_setTriggerRunning3326 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BOOL_in_setTriggerRunning3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_spawnItem3357 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringList_in_spawnItem3359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_spawnItem3361 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x000000000A03FEC2L,0x0000000000000100L});
    public static final BitSet FOLLOW_unitInfo_in_spawnItem3363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_spawnItem3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_beginStatement3391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_136_in_beginStatement3395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_beginStatement3398 = new BitSet(new long[]{0x0000000000008000L,0x0800000000000000L});
    public static final BitSet FOLLOW_commandCallList_in_beginStatement3403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_beginStatement3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList3435 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_commandCallList3438 = new BitSet(new long[]{0x0000000000008000L,0x0800000000000000L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList3441 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_123_in_commandCall3458 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_CALL_PREFIX_in_commandCall3475 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_stringLiteral3500 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000001FFL});
    public static final BitSet FOLLOW_98_in_stringLiteral3506 = new BitSet(new long[]{0x0000000000000002L});

}