// $ANTLR 3.4 C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g 2013-08-03 21:10:19

	package atrophy.combat.level;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AtrophyScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDTAG", "ADD_TAG_PREFIX", "AIINIT", "AINODE", "AND", "ATCALL_MODULE", "ATCALL_SEQUENCE", "BEHAVIOUR", "BLOCK", "BOOL", "CHANGEAINODE", "COMMAND", "COMMAND_CALL", "COMMAND_CALL_PREFIX", "COMMENT", "CONDITIONAL", "CONTAINSFACTION", "CONVERSE", "COVER", "DIRECTORBIAS", "DOORNAMES", "EMPTY", "ENG", "EXPIREREPEATS", "EXPIRETIME", "HASITEM", "HASWEAPON", "IDENT", "INIT", "INROOM", "INT", "ISALIVE", "ISDAEMON", "ISDEAD", "ISFACTION", "ISINVESTIGATED", "ISNAME", "ISNOTDAEMON", "ISNOTINVESTIGATED", "ISROOM", "KILLUNIT", "LINE", "LOADMAP", "LOCKDOOR", "LOGIC", "MAPSIZE", "MAPSPAWNS", "MAXTEAMSIZE", "MED", "MINTEAMSIZE", "MODULE", "MULTILINE_COMMENT", "NEGATION", "NOT_PREFIX", "ONTIME", "OPENINGLINE", "OPTION", "OR", "PORTAL", "PRIORITY", "REMOVESAFEROOM", "REMOVETAG", "REMOVEUNIT", "REMOVE_TAG_PREFIX", "REQ", "SAFEROOM", "SCI", "SEQUENCE", "SETTRIGGERRUNNING", "SHOWMESSAGE", "SPAWNCHARACTER", "SPAWNITEM", "SPAWNTALKNODE", "SPAWNTEAM", "STAGELIST", "STASH", "STRING", "SUBSCRIBE", "TALK", "TALKMAP", "TALKPARENT", "TALKSTAGE", "TELEDEST", "TELEPORT", "TERRITORY", "TEXTURE", "TEXTUREBLOCK", "TOPIC", "TRIGGER", "TRIGGERCOND", "TRIGGEREFFECT", "TRIGGERTYPE", "UNLOCKDOOR", "UPDATETALK", "UPDATE_TREE_PREFIX", "VAR", "WEP", "WS", "XLIST", "YLIST", "ZONE", "'!HAS'", "'\"'", "'#'", "'('", "')'", "','", "'::'", "'@'", "'AND'", "'BLOCK'", "'COMMAND'", "'COVER'", "'HAS'", "'IF'", "'LOAD'", "'MAPSIZE'", "'MAPSPAWNS'", "'MODULE'", "'MODULE::'", "'OR'", "'PORTAL'", "'SEQUENCE'", "'SEQUENCE::'", "'STASH'", "'TALK'", "'TEXTUREBLOCK'", "'TRIGGER'", "'a:'", "'addTag:'", "'aiInit:'", "'aiNode'", "'behaviours:'", "'block'", "'callCommand:'", "'changeAiNode'", "'command'", "'containsFaction:'", "'converse'", "'cover'", "'destination'", "'directorBias:'", "'engChance:'", "'expireRepeats:'", "'expireTime:'", "'hasItem:'", "'hasWeapon:'", "'isAlive'", "'isDaemon'", "'isDead'", "'isFaction:'", "'isInvestigated'", "'isName:'", "'isNotDaemon'", "'isNotInvestigated'", "'isPlayer'", "'isRoom:'", "'killUnit'", "'l:'", "'lines:'", "'loadMap'", "'lockDoor'", "'mapsize'", "'mapspawns'", "'maxTeamSize:'", "'medChance:'", "'minTeamSize:'", "'o:'", "'onTime:'", "'opening:'", "'openingLine:'", "'option:'", "'p:'", "'parent:'", "'portal'", "'priority:'", "'removeSaferoom'", "'removeTag:'", "'removeUnit'", "'req:'", "'s:'", "'saferoom'", "'sciChance'", "'setTriggerRunning:'", "'showMessage:'", "'spawnCharacter'", "'spawnItem'", "'spawnTalkNode'", "'spawnTeam'", "'stage:'", "'stages:'", "'stash'", "'subscribe:'", "'t'", "'talk'", "'tc'", "'te'", "'teleport'", "'territory:'", "'textureBlock'", "'textureblock'", "'topic'", "'trigger'", "'triggerCond'", "'triggerEffect'", "'unlockDoor'", "'updateTalk:'", "'wepChance:'", "'x:'", "'y:'", "'zone:'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__201=201;
    public static final int T__202=202;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int T__206=206;
    public static final int T__207=207;
    public static final int T__208=208;
    public static final int T__209=209;
    public static final int T__210=210;
    public static final int T__211=211;
    public static final int T__212=212;
    public static final int T__213=213;
    public static final int T__214=214;
    public static final int T__215=215;
    public static final int T__216=216;
    public static final int ADDTAG=4;
    public static final int ADD_TAG_PREFIX=5;
    public static final int AIINIT=6;
    public static final int AINODE=7;
    public static final int AND=8;
    public static final int ATCALL_MODULE=9;
    public static final int ATCALL_SEQUENCE=10;
    public static final int BEHAVIOUR=11;
    public static final int BLOCK=12;
    public static final int BOOL=13;
    public static final int CHANGEAINODE=14;
    public static final int COMMAND=15;
    public static final int COMMAND_CALL=16;
    public static final int COMMAND_CALL_PREFIX=17;
    public static final int COMMENT=18;
    public static final int CONDITIONAL=19;
    public static final int CONTAINSFACTION=20;
    public static final int CONVERSE=21;
    public static final int COVER=22;
    public static final int DIRECTORBIAS=23;
    public static final int DOORNAMES=24;
    public static final int EMPTY=25;
    public static final int ENG=26;
    public static final int EXPIREREPEATS=27;
    public static final int EXPIRETIME=28;
    public static final int HASITEM=29;
    public static final int HASWEAPON=30;
    public static final int IDENT=31;
    public static final int INIT=32;
    public static final int INROOM=33;
    public static final int INT=34;
    public static final int ISALIVE=35;
    public static final int ISDAEMON=36;
    public static final int ISDEAD=37;
    public static final int ISFACTION=38;
    public static final int ISINVESTIGATED=39;
    public static final int ISNAME=40;
    public static final int ISNOTDAEMON=41;
    public static final int ISNOTINVESTIGATED=42;
    public static final int ISROOM=43;
    public static final int KILLUNIT=44;
    public static final int LINE=45;
    public static final int LOADMAP=46;
    public static final int LOCKDOOR=47;
    public static final int LOGIC=48;
    public static final int MAPSIZE=49;
    public static final int MAPSPAWNS=50;
    public static final int MAXTEAMSIZE=51;
    public static final int MED=52;
    public static final int MINTEAMSIZE=53;
    public static final int MODULE=54;
    public static final int MULTILINE_COMMENT=55;
    public static final int NEGATION=56;
    public static final int NOT_PREFIX=57;
    public static final int ONTIME=58;
    public static final int OPENINGLINE=59;
    public static final int OPTION=60;
    public static final int OR=61;
    public static final int PORTAL=62;
    public static final int PRIORITY=63;
    public static final int REMOVESAFEROOM=64;
    public static final int REMOVETAG=65;
    public static final int REMOVEUNIT=66;
    public static final int REMOVE_TAG_PREFIX=67;
    public static final int REQ=68;
    public static final int SAFEROOM=69;
    public static final int SCI=70;
    public static final int SEQUENCE=71;
    public static final int SETTRIGGERRUNNING=72;
    public static final int SHOWMESSAGE=73;
    public static final int SPAWNCHARACTER=74;
    public static final int SPAWNITEM=75;
    public static final int SPAWNTALKNODE=76;
    public static final int SPAWNTEAM=77;
    public static final int STAGELIST=78;
    public static final int STASH=79;
    public static final int STRING=80;
    public static final int SUBSCRIBE=81;
    public static final int TALK=82;
    public static final int TALKMAP=83;
    public static final int TALKPARENT=84;
    public static final int TALKSTAGE=85;
    public static final int TELEDEST=86;
    public static final int TELEPORT=87;
    public static final int TERRITORY=88;
    public static final int TEXTURE=89;
    public static final int TEXTUREBLOCK=90;
    public static final int TOPIC=91;
    public static final int TRIGGER=92;
    public static final int TRIGGERCOND=93;
    public static final int TRIGGEREFFECT=94;
    public static final int TRIGGERTYPE=95;
    public static final int UNLOCKDOOR=96;
    public static final int UPDATETALK=97;
    public static final int UPDATE_TREE_PREFIX=98;
    public static final int VAR=99;
    public static final int WEP=100;
    public static final int WS=101;
    public static final int XLIST=102;
    public static final int YLIST=103;
    public static final int ZONE=104;

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
    public String getGrammarFileName() { return "C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:106:1: prog : ( sequenceDecl | moduleDecl )* EOF ;
    public final AtrophyScriptParser.prog_return prog() throws RecognitionException {
        AtrophyScriptParser.prog_return retval = new AtrophyScriptParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        AtrophyScriptParser.sequenceDecl_return sequenceDecl1 =null;

        AtrophyScriptParser.moduleDecl_return moduleDecl2 =null;


        CommonTree EOF3_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:106:5: ( ( sequenceDecl | moduleDecl )* EOF )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:107:5: ( sequenceDecl | moduleDecl )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:107:5: ( sequenceDecl | moduleDecl )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==127) ) {
                    alt1=1;
                }
                else if ( (LA1_0==123) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:107:6: sequenceDecl
            	    {
            	    pushFollow(FOLLOW_sequenceDecl_in_prog420);
            	    sequenceDecl1=sequenceDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sequenceDecl1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:107:21: moduleDecl
            	    {
            	    pushFollow(FOLLOW_moduleDecl_in_prog424);
            	    moduleDecl2=moduleDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, moduleDecl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog432); 
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


    public static class moduleDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moduleDecl"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:111:1: moduleDecl : 'MODULE::' stringLiteral '{' ( command )* '}' -> ^( MODULE stringLiteral ( command )* ) ;
    public final AtrophyScriptParser.moduleDecl_return moduleDecl() throws RecognitionException {
        AtrophyScriptParser.moduleDecl_return retval = new AtrophyScriptParser.moduleDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal4=null;
        Token char_literal6=null;
        Token char_literal8=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral5 =null;

        AtrophyScriptParser.command_return command7 =null;


        CommonTree string_literal4_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree char_literal8_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:111:11: ( 'MODULE::' stringLiteral '{' ( command )* '}' -> ^( MODULE stringLiteral ( command )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:112:4: 'MODULE::' stringLiteral '{' ( command )* '}'
            {
            string_literal4=(Token)match(input,123,FOLLOW_123_in_moduleDecl448);  
            stream_123.add(string_literal4);


            pushFollow(FOLLOW_stringLiteral_in_moduleDecl450);
            stringLiteral5=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral5.getTree());

            char_literal6=(Token)match(input,215,FOLLOW_215_in_moduleDecl452);  
            stream_215.add(char_literal6);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:5: ( command )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 114 && LA2_0 <= 115)||(LA2_0 >= 120 && LA2_0 <= 121)||LA2_0==125||(LA2_0 >= 129 && LA2_0 <= 131)||LA2_0==137||LA2_0==140||(LA2_0 >= 166 && LA2_0 <= 167)||LA2_0==178||LA2_0==198||(LA2_0 >= 203 && LA2_0 <= 204)||LA2_0==206) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:113:5: command
            	    {
            	    pushFollow(FOLLOW_command_in_moduleDecl458);
            	    command7=command();

            	    state._fsp--;

            	    stream_command.add(command7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            char_literal8=(Token)match(input,216,FOLLOW_216_in_moduleDecl464);  
            stream_216.add(char_literal8);


            // AST REWRITE
            // elements: command, stringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 114:8: -> ^( MODULE stringLiteral ( command )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:114:11: ^( MODULE stringLiteral ( command )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE, "MODULE")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:114:34: ( command )*
                while ( stream_command.hasNext() ) {
                    adaptor.addChild(root_1, stream_command.nextTree());

                }
                stream_command.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "moduleDecl"


    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "command"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:1: command : ( mapSize | mapSpawns | blockDecl | portalDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl );
    public final AtrophyScriptParser.command_return command() throws RecognitionException {
        AtrophyScriptParser.command_return retval = new AtrophyScriptParser.command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.mapSize_return mapSize9 =null;

        AtrophyScriptParser.mapSpawns_return mapSpawns10 =null;

        AtrophyScriptParser.blockDecl_return blockDecl11 =null;

        AtrophyScriptParser.portalDecl_return portalDecl12 =null;

        AtrophyScriptParser.textureBlockDecl_return textureBlockDecl13 =null;

        AtrophyScriptParser.triggerDecl_return triggerDecl14 =null;

        AtrophyScriptParser.commandDecl_return commandDecl15 =null;

        AtrophyScriptParser.talkDecl_return talkDecl16 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:117:8: ( mapSize | mapSpawns | blockDecl | portalDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 120:
            case 166:
                {
                alt3=1;
                }
                break;
            case 121:
            case 167:
                {
                alt3=2;
                }
                break;
            case 114:
            case 137:
                {
                alt3=3;
                }
                break;
            case 125:
            case 178:
                {
                alt3=4;
                }
                break;
            case 130:
            case 203:
            case 204:
                {
                alt3=5;
                }
                break;
            case 131:
            case 206:
                {
                alt3=6;
                }
                break;
            case 115:
            case 140:
                {
                alt3=7;
                }
                break;
            case 129:
            case 198:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:118:4: mapSize
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSize_in_command489);
                    mapSize9=mapSize();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSize9.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:119:6: mapSpawns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSpawns_in_command496);
                    mapSpawns10=mapSpawns();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSpawns10.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:6: blockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_blockDecl_in_command503);
                    blockDecl11=blockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, blockDecl11.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:6: portalDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_portalDecl_in_command510);
                    portalDecl12=portalDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, portalDecl12.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:122:6: textureBlockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_textureBlockDecl_in_command517);
                    textureBlockDecl13=textureBlockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, textureBlockDecl13.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:6: triggerDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_triggerDecl_in_command524);
                    triggerDecl14=triggerDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, triggerDecl14.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:6: commandDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandDecl_in_command531);
                    commandDecl15=commandDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, commandDecl15.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:6: talkDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_talkDecl_in_command538);
                    talkDecl16=talkDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, talkDecl16.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:1: requiredAssignment : '::' stringLiteral -> ^( VAR stringLiteral ) ;
    public final AtrophyScriptParser.requiredAssignment_return requiredAssignment() throws RecognitionException {
        AtrophyScriptParser.requiredAssignment_return retval = new AtrophyScriptParser.requiredAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal17=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral18 =null;


        CommonTree string_literal17_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:19: ( '::' stringLiteral -> ^( VAR stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:4: '::' stringLiteral
            {
            string_literal17=(Token)match(input,111,FOLLOW_111_in_requiredAssignment551);  
            stream_111.add(string_literal17);


            pushFollow(FOLLOW_stringLiteral_in_requiredAssignment553);
            stringLiteral18=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral18.getTree());

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
            // 129:23: -> ^( VAR stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:26: ^( VAR stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:1: varAssignment : ( requiredAssignment | -> ^( EMPTY ) );
    public final AtrophyScriptParser.varAssignment_return varAssignment() throws RecognitionException {
        AtrophyScriptParser.varAssignment_return retval = new AtrophyScriptParser.varAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.requiredAssignment_return requiredAssignment19 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:14: ( requiredAssignment | -> ^( EMPTY ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==111) ) {
                alt4=1;
            }
            else if ( (LA4_0==215) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:4: requiredAssignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_requiredAssignment_in_varAssignment577);
                    requiredAssignment19=requiredAssignment();

                    state._fsp--;

                    adaptor.addChild(root_0, requiredAssignment19.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:134:6: 
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
                    // 134:6: -> ^( EMPTY )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:134:9: ^( EMPTY )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:1: mapSize : ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) ;
    public final AtrophyScriptParser.mapSize_return mapSize() throws RecognitionException {
        AtrophyScriptParser.mapSize_return retval = new AtrophyScriptParser.mapSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal20=null;
        Token string_literal21=null;
        Token char_literal22=null;
        Token INT23=null;
        Token char_literal24=null;
        Token INT25=null;
        Token char_literal26=null;
        Token INT27=null;
        Token char_literal28=null;
        Token INT29=null;
        Token char_literal30=null;

        CommonTree string_literal20_tree=null;
        CommonTree string_literal21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree INT23_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree INT25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree INT27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree INT29_tree=null;
        CommonTree char_literal30_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:8: ( ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:138:4: ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:138:4: ( 'MAPSIZE' | 'mapsize' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==120) ) {
                alt5=1;
            }
            else if ( (LA5_0==166) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:138:5: 'MAPSIZE'
                    {
                    string_literal20=(Token)match(input,120,FOLLOW_120_in_mapSize604);  
                    stream_120.add(string_literal20);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:138:17: 'mapsize'
                    {
                    string_literal21=(Token)match(input,166,FOLLOW_166_in_mapSize608);  
                    stream_166.add(string_literal21);


                    }
                    break;

            }


            char_literal22=(Token)match(input,215,FOLLOW_215_in_mapSize611);  
            stream_215.add(char_literal22);


            INT23=(Token)match(input,INT,FOLLOW_INT_in_mapSize613);  
            stream_INT.add(INT23);


            char_literal24=(Token)match(input,110,FOLLOW_110_in_mapSize615);  
            stream_110.add(char_literal24);


            INT25=(Token)match(input,INT,FOLLOW_INT_in_mapSize617);  
            stream_INT.add(INT25);


            char_literal26=(Token)match(input,110,FOLLOW_110_in_mapSize619);  
            stream_110.add(char_literal26);


            INT27=(Token)match(input,INT,FOLLOW_INT_in_mapSize621);  
            stream_INT.add(INT27);


            char_literal28=(Token)match(input,110,FOLLOW_110_in_mapSize623);  
            stream_110.add(char_literal28);


            INT29=(Token)match(input,INT,FOLLOW_INT_in_mapSize625);  
            stream_INT.add(INT29);


            char_literal30=(Token)match(input,216,FOLLOW_216_in_mapSize627);  
            stream_216.add(char_literal30);


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
            // 138:64: -> ^( MAPSIZE ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:138:67: ^( MAPSIZE ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSIZE, "MAPSIZE")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:138:77: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:1: mapSpawns : ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) ;
    public final AtrophyScriptParser.mapSpawns_return mapSpawns() throws RecognitionException {
        AtrophyScriptParser.mapSpawns_return retval = new AtrophyScriptParser.mapSpawns_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal31=null;
        Token string_literal32=null;
        Token char_literal33=null;
        Token char_literal35=null;
        AtrophyScriptParser.stringList_return stringList34 =null;


        CommonTree string_literal31_tree=null;
        CommonTree string_literal32_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal35_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:10: ( ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:4: ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:4: ( 'MAPSPAWNS' | 'mapspawns' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==121) ) {
                alt6=1;
            }
            else if ( (LA6_0==167) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:5: 'MAPSPAWNS'
                    {
                    string_literal31=(Token)match(input,121,FOLLOW_121_in_mapSpawns652);  
                    stream_121.add(string_literal31);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:19: 'mapspawns'
                    {
                    string_literal32=(Token)match(input,167,FOLLOW_167_in_mapSpawns656);  
                    stream_167.add(string_literal32);


                    }
                    break;

            }


            char_literal33=(Token)match(input,215,FOLLOW_215_in_mapSpawns659);  
            stream_215.add(char_literal33);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:36: ( stringList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==106) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:36: stringList
                    {
                    pushFollow(FOLLOW_stringList_in_mapSpawns661);
                    stringList34=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList34.getTree());

                    }
                    break;

            }


            char_literal35=(Token)match(input,216,FOLLOW_216_in_mapSpawns664);  
            stream_216.add(char_literal35);


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
            // 142:52: -> ^( MAPSPAWNS ( stringList )? )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:55: ^( MAPSPAWNS ( stringList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSPAWNS, "MAPSPAWNS")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:67: ( stringList )?
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:1: blockDecl : ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) ;
    public final AtrophyScriptParser.blockDecl_return blockDecl() throws RecognitionException {
        AtrophyScriptParser.blockDecl_return retval = new AtrophyScriptParser.blockDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal36=null;
        Token string_literal37=null;
        Token char_literal39=null;
        Token char_literal41=null;
        AtrophyScriptParser.varAssignment_return varAssignment38 =null;

        AtrophyScriptParser.properties_return properties40 =null;


        CommonTree string_literal36_tree=null;
        CommonTree string_literal37_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree char_literal41_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:10: ( ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:146:4: ( 'BLOCK' | 'block' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:146:4: ( 'BLOCK' | 'block' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==114) ) {
                alt8=1;
            }
            else if ( (LA8_0==137) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:146:5: 'BLOCK'
                    {
                    string_literal36=(Token)match(input,114,FOLLOW_114_in_blockDecl689);  
                    stream_114.add(string_literal36);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:146:15: 'block'
                    {
                    string_literal37=(Token)match(input,137,FOLLOW_137_in_blockDecl693);  
                    stream_137.add(string_literal37);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_blockDecl696);
            varAssignment38=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment38.getTree());

            char_literal39=(Token)match(input,215,FOLLOW_215_in_blockDecl698);  
            stream_215.add(char_literal39);


            pushFollow(FOLLOW_properties_in_blockDecl700);
            properties40=properties();

            state._fsp--;

            stream_properties.add(properties40.getTree());

            char_literal41=(Token)match(input,216,FOLLOW_216_in_blockDecl702);  
            stream_216.add(char_literal41);


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
            // 146:57: -> ^( BLOCK varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:146:60: ^( BLOCK varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:149:1: portalDecl : ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) ;
    public final AtrophyScriptParser.portalDecl_return portalDecl() throws RecognitionException {
        AtrophyScriptParser.portalDecl_return retval = new AtrophyScriptParser.portalDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal42=null;
        Token string_literal43=null;
        Token char_literal45=null;
        Token char_literal47=null;
        AtrophyScriptParser.varAssignment_return varAssignment44 =null;

        AtrophyScriptParser.properties_return properties46 =null;


        CommonTree string_literal42_tree=null;
        CommonTree string_literal43_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree char_literal47_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:149:11: ( ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:4: ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:4: ( 'PORTAL' | 'portal' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==125) ) {
                alt9=1;
            }
            else if ( (LA9_0==178) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:5: 'PORTAL'
                    {
                    string_literal42=(Token)match(input,125,FOLLOW_125_in_portalDecl728);  
                    stream_125.add(string_literal42);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:16: 'portal'
                    {
                    string_literal43=(Token)match(input,178,FOLLOW_178_in_portalDecl732);  
                    stream_178.add(string_literal43);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_portalDecl735);
            varAssignment44=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment44.getTree());

            char_literal45=(Token)match(input,215,FOLLOW_215_in_portalDecl737);  
            stream_215.add(char_literal45);


            pushFollow(FOLLOW_properties_in_portalDecl739);
            properties46=properties();

            state._fsp--;

            stream_properties.add(properties46.getTree());

            char_literal47=(Token)match(input,216,FOLLOW_216_in_portalDecl741);  
            stream_216.add(char_literal47);


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
            // 150:59: -> ^( PORTAL varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:62: ^( PORTAL varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:153:1: textureBlockDecl : ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) ;
    public final AtrophyScriptParser.textureBlockDecl_return textureBlockDecl() throws RecognitionException {
        AtrophyScriptParser.textureBlockDecl_return retval = new AtrophyScriptParser.textureBlockDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal48=null;
        Token string_literal49=null;
        Token string_literal50=null;
        Token char_literal51=null;
        Token char_literal53=null;
        AtrophyScriptParser.properties_return properties52 =null;


        CommonTree string_literal48_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree string_literal50_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree char_literal53_tree=null;
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:153:17: ( ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt10=1;
                }
                break;
            case 204:
                {
                alt10=2;
                }
                break;
            case 203:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:5: 'TEXTUREBLOCK'
                    {
                    string_literal48=(Token)match(input,130,FOLLOW_130_in_textureBlockDecl767);  
                    stream_130.add(string_literal48);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:22: 'textureblock'
                    {
                    string_literal49=(Token)match(input,204,FOLLOW_204_in_textureBlockDecl771);  
                    stream_204.add(string_literal49);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:39: 'textureBlock'
                    {
                    string_literal50=(Token)match(input,203,FOLLOW_203_in_textureBlockDecl775);  
                    stream_203.add(string_literal50);


                    }
                    break;

            }


            char_literal51=(Token)match(input,215,FOLLOW_215_in_textureBlockDecl778);  
            stream_215.add(char_literal51);


            pushFollow(FOLLOW_properties_in_textureBlockDecl780);
            properties52=properties();

            state._fsp--;

            stream_properties.add(properties52.getTree());

            char_literal53=(Token)match(input,216,FOLLOW_216_in_textureBlockDecl782);  
            stream_216.add(char_literal53);


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
            // 154:74: -> ^( TEXTUREBLOCK properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:77: ^( TEXTUREBLOCK properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:157:1: triggerDecl : ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) ;
    public final AtrophyScriptParser.triggerDecl_return triggerDecl() throws RecognitionException {
        AtrophyScriptParser.triggerDecl_return retval = new AtrophyScriptParser.triggerDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal54=null;
        Token string_literal55=null;
        Token char_literal57=null;
        Token char_literal59=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment56 =null;

        AtrophyScriptParser.properties_return properties58 =null;


        CommonTree string_literal54_tree=null;
        CommonTree string_literal55_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree char_literal59_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:157:12: ( ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:4: ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:4: ( 'TRIGGER' | 'trigger' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==131) ) {
                alt11=1;
            }
            else if ( (LA11_0==206) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:5: 'TRIGGER'
                    {
                    string_literal54=(Token)match(input,131,FOLLOW_131_in_triggerDecl806);  
                    stream_131.add(string_literal54);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:17: 'trigger'
                    {
                    string_literal55=(Token)match(input,206,FOLLOW_206_in_triggerDecl810);  
                    stream_206.add(string_literal55);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_triggerDecl813);
            requiredAssignment56=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment56.getTree());

            char_literal57=(Token)match(input,215,FOLLOW_215_in_triggerDecl815);  
            stream_215.add(char_literal57);


            pushFollow(FOLLOW_properties_in_triggerDecl817);
            properties58=properties();

            state._fsp--;

            stream_properties.add(properties58.getTree());

            char_literal59=(Token)match(input,216,FOLLOW_216_in_triggerDecl819);  
            stream_216.add(char_literal59);


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
            // 158:66: -> ^( TRIGGER requiredAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:69: ^( TRIGGER requiredAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:161:1: commandDecl : ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) ;
    public final AtrophyScriptParser.commandDecl_return commandDecl() throws RecognitionException {
        AtrophyScriptParser.commandDecl_return retval = new AtrophyScriptParser.commandDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal60=null;
        Token string_literal61=null;
        Token char_literal63=null;
        Token char_literal65=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment62 =null;

        AtrophyScriptParser.triggerEffectList_return triggerEffectList64 =null;


        CommonTree string_literal60_tree=null;
        CommonTree string_literal61_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree char_literal65_tree=null;
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:161:12: ( ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:4: ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:4: ( 'COMMAND' | 'command' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==115) ) {
                alt12=1;
            }
            else if ( (LA12_0==140) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:5: 'COMMAND'
                    {
                    string_literal60=(Token)match(input,115,FOLLOW_115_in_commandDecl845);  
                    stream_115.add(string_literal60);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:17: 'command'
                    {
                    string_literal61=(Token)match(input,140,FOLLOW_140_in_commandDecl849);  
                    stream_140.add(string_literal61);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_commandDecl852);
            requiredAssignment62=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment62.getTree());

            char_literal63=(Token)match(input,215,FOLLOW_215_in_commandDecl854);  
            stream_215.add(char_literal63);


            pushFollow(FOLLOW_triggerEffectList_in_commandDecl856);
            triggerEffectList64=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList64.getTree());

            char_literal65=(Token)match(input,216,FOLLOW_216_in_commandDecl858);  
            stream_216.add(char_literal65);


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
            // 162:73: -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:76: ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COMMAND, "COMMAND")
                , root_1);

                adaptor.addChild(root_1, stream_requiredAssignment.nextTree());

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:105: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:165:1: talkDecl : ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) ;
    public final AtrophyScriptParser.talkDecl_return talkDecl() throws RecognitionException {
        AtrophyScriptParser.talkDecl_return retval = new AtrophyScriptParser.talkDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal66=null;
        Token string_literal67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        AtrophyScriptParser.properties_return properties69 =null;


        CommonTree string_literal66_tree=null;
        CommonTree string_literal67_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree char_literal70_tree=null;
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:165:9: ( ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:4: ( 'TALK' | 'talk' ) '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:4: ( 'TALK' | 'talk' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==129) ) {
                alt13=1;
            }
            else if ( (LA13_0==198) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:5: 'TALK'
                    {
                    string_literal66=(Token)match(input,129,FOLLOW_129_in_talkDecl888);  
                    stream_129.add(string_literal66);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:14: 'talk'
                    {
                    string_literal67=(Token)match(input,198,FOLLOW_198_in_talkDecl892);  
                    stream_198.add(string_literal67);


                    }
                    break;

            }


            char_literal68=(Token)match(input,215,FOLLOW_215_in_talkDecl895);  
            stream_215.add(char_literal68);


            pushFollow(FOLLOW_properties_in_talkDecl897);
            properties69=properties();

            state._fsp--;

            stream_properties.add(properties69.getTree());

            char_literal70=(Token)match(input,216,FOLLOW_216_in_talkDecl899);  
            stream_216.add(char_literal70);


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
            // 166:41: -> ^( TALK properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:44: ^( TALK properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:169:1: properties : ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )* ;
    public final AtrophyScriptParser.properties_return properties() throws RecognitionException {
        AtrophyScriptParser.properties_return retval = new AtrophyScriptParser.properties_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.xListProperty_return xListProperty71 =null;

        AtrophyScriptParser.yListProperty_return yListProperty72 =null;

        AtrophyScriptParser.factionTerritoryProperty_return factionTerritoryProperty73 =null;

        AtrophyScriptParser.factionZoneProperty_return factionZoneProperty74 =null;

        AtrophyScriptParser.saferoomProperty_return saferoomProperty75 =null;

        AtrophyScriptParser.stageProperty_return stageProperty76 =null;

        AtrophyScriptParser.stageDeclProperty_return stageDeclProperty77 =null;

        AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty78 =null;

        AtrophyScriptParser.aiInitProperty_return aiInitProperty79 =null;

        AtrophyScriptParser.openingLineProperty_return openingLineProperty80 =null;

        AtrophyScriptParser.optionProperty_return optionProperty81 =null;

        AtrophyScriptParser.topicProperty_return topicProperty82 =null;

        AtrophyScriptParser.triggerCondProperty_return triggerCondProperty83 =null;

        AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty84 =null;

        AtrophyScriptParser.coverDecl_return coverDecl85 =null;

        AtrophyScriptParser.stashDecl_return stashDecl86 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:169:11: ( ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )*
            loop14:
            do {
                int alt14=17;
                switch ( input.LA(1) ) {
                case 212:
                    {
                    alt14=1;
                    }
                    break;
                case 213:
                    {
                    alt14=2;
                    }
                    break;
                case 202:
                    {
                    alt14=3;
                    }
                    break;
                case 214:
                    {
                    alt14=4;
                    }
                    break;
                case 185:
                    {
                    alt14=5;
                    }
                    break;
                case 184:
                case 193:
                    {
                    alt14=6;
                    }
                    break;
                case 194:
                    {
                    alt14=7;
                    }
                    break;
                case 176:
                case 177:
                    {
                    alt14=8;
                    }
                    break;
                case 132:
                case 134:
                    {
                    alt14=9;
                    }
                    break;
                case 171:
                case 173:
                case 174:
                    {
                    alt14=10;
                    }
                    break;
                case 162:
                case 175:
                    {
                    alt14=11;
                    }
                    break;
                case 197:
                case 205:
                    {
                    alt14=12;
                    }
                    break;
                case 199:
                case 207:
                    {
                    alt14=13;
                    }
                    break;
                case 200:
                case 208:
                    {
                    alt14=14;
                    }
                    break;
                case 116:
                case 143:
                    {
                    alt14=15;
                    }
                    break;
                case 128:
                case 195:
                    {
                    alt14=16;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:5: xListProperty
            	    {
            	    pushFollow(FOLLOW_xListProperty_in_properties923);
            	    xListProperty71=xListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xListProperty71.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:6: yListProperty
            	    {
            	    pushFollow(FOLLOW_yListProperty_in_properties930);
            	    yListProperty72=yListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, yListProperty72.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:172:6: factionTerritoryProperty
            	    {
            	    pushFollow(FOLLOW_factionTerritoryProperty_in_properties937);
            	    factionTerritoryProperty73=factionTerritoryProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionTerritoryProperty73.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:173:6: factionZoneProperty
            	    {
            	    pushFollow(FOLLOW_factionZoneProperty_in_properties944);
            	    factionZoneProperty74=factionZoneProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionZoneProperty74.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:6: saferoomProperty
            	    {
            	    pushFollow(FOLLOW_saferoomProperty_in_properties951);
            	    saferoomProperty75=saferoomProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, saferoomProperty75.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:6: stageProperty
            	    {
            	    pushFollow(FOLLOW_stageProperty_in_properties958);
            	    stageProperty76=stageProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageProperty76.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:176:6: stageDeclProperty
            	    {
            	    pushFollow(FOLLOW_stageDeclProperty_in_properties965);
            	    stageDeclProperty77=stageDeclProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageDeclProperty77.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:177:6: talkMapParentProperty
            	    {
            	    pushFollow(FOLLOW_talkMapParentProperty_in_properties972);
            	    talkMapParentProperty78=talkMapParentProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, talkMapParentProperty78.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:6: aiInitProperty
            	    {
            	    pushFollow(FOLLOW_aiInitProperty_in_properties979);
            	    aiInitProperty79=aiInitProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiInitProperty79.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:6: openingLineProperty
            	    {
            	    pushFollow(FOLLOW_openingLineProperty_in_properties986);
            	    openingLineProperty80=openingLineProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, openingLineProperty80.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:180:6: optionProperty
            	    {
            	    pushFollow(FOLLOW_optionProperty_in_properties993);
            	    optionProperty81=optionProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, optionProperty81.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:181:6: topicProperty
            	    {
            	    pushFollow(FOLLOW_topicProperty_in_properties1000);
            	    topicProperty82=topicProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicProperty82.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:6: triggerCondProperty
            	    {
            	    pushFollow(FOLLOW_triggerCondProperty_in_properties1007);
            	    triggerCondProperty83=triggerCondProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerCondProperty83.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:6: triggerEffectProperty
            	    {
            	    pushFollow(FOLLOW_triggerEffectProperty_in_properties1014);
            	    triggerEffectProperty84=triggerEffectProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffectProperty84.getTree());

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:184:6: coverDecl
            	    {
            	    pushFollow(FOLLOW_coverDecl_in_properties1021);
            	    coverDecl85=coverDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, coverDecl85.getTree());

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:185:6: stashDecl
            	    {
            	    pushFollow(FOLLOW_stashDecl_in_properties1028);
            	    stashDecl86=stashDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stashDecl86.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:188:1: xListProperty : 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) ;
    public final AtrophyScriptParser.xListProperty_return xListProperty() throws RecognitionException {
        AtrophyScriptParser.xListProperty_return retval = new AtrophyScriptParser.xListProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal87=null;
        Token INT88=null;
        Token char_literal89=null;
        Token INT90=null;

        CommonTree string_literal87_tree=null;
        CommonTree INT88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree INT90_tree=null;
        RewriteRuleTokenStream stream_212=new RewriteRuleTokenStream(adaptor,"token 212");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:188:14: ( 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:4: 'x:' INT ( ',' INT )*
            {
            string_literal87=(Token)match(input,212,FOLLOW_212_in_xListProperty1045);  
            stream_212.add(string_literal87);


            INT88=(Token)match(input,INT,FOLLOW_INT_in_xListProperty1047);  
            stream_INT.add(INT88);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:13: ( ',' INT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==110) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:14: ',' INT
            	    {
            	    char_literal89=(Token)match(input,110,FOLLOW_110_in_xListProperty1050);  
            	    stream_110.add(char_literal89);


            	    INT90=(Token)match(input,INT,FOLLOW_INT_in_xListProperty1051);  
            	    stream_INT.add(INT90);


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
            // 189:23: -> ^( XLIST ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:26: ^( XLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(XLIST, "XLIST")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:34: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:192:1: yListProperty : 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) ;
    public final AtrophyScriptParser.yListProperty_return yListProperty() throws RecognitionException {
        AtrophyScriptParser.yListProperty_return retval = new AtrophyScriptParser.yListProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal91=null;
        Token INT92=null;
        Token char_literal93=null;
        Token INT94=null;

        CommonTree string_literal91_tree=null;
        CommonTree INT92_tree=null;
        CommonTree char_literal93_tree=null;
        CommonTree INT94_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_213=new RewriteRuleTokenStream(adaptor,"token 213");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:192:14: ( 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:4: 'y:' INT ( ',' INT )*
            {
            string_literal91=(Token)match(input,213,FOLLOW_213_in_yListProperty1075);  
            stream_213.add(string_literal91);


            INT92=(Token)match(input,INT,FOLLOW_INT_in_yListProperty1077);  
            stream_INT.add(INT92);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:13: ( ',' INT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==110) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:14: ',' INT
            	    {
            	    char_literal93=(Token)match(input,110,FOLLOW_110_in_yListProperty1080);  
            	    stream_110.add(char_literal93);


            	    INT94=(Token)match(input,INT,FOLLOW_INT_in_yListProperty1081);  
            	    stream_INT.add(INT94);


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
            // 193:23: -> ^( YLIST ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:26: ^( YLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(YLIST, "YLIST")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:34: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:1: factionTerritoryProperty : 'territory:' stringLiteral INT -> ^( TERRITORY ^( STRING stringLiteral ) INT ) ;
    public final AtrophyScriptParser.factionTerritoryProperty_return factionTerritoryProperty() throws RecognitionException {
        AtrophyScriptParser.factionTerritoryProperty_return retval = new AtrophyScriptParser.factionTerritoryProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal95=null;
        Token INT97=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral96 =null;


        CommonTree string_literal95_tree=null;
        CommonTree INT97_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:25: ( 'territory:' stringLiteral INT -> ^( TERRITORY ^( STRING stringLiteral ) INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:4: 'territory:' stringLiteral INT
            {
            string_literal95=(Token)match(input,202,FOLLOW_202_in_factionTerritoryProperty1107);  
            stream_202.add(string_literal95);


            pushFollow(FOLLOW_stringLiteral_in_factionTerritoryProperty1109);
            stringLiteral96=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral96.getTree());

            INT97=(Token)match(input,INT,FOLLOW_INT_in_factionTerritoryProperty1111);  
            stream_INT.add(INT97);


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
            // 197:35: -> ^( TERRITORY ^( STRING stringLiteral ) INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:38: ^( TERRITORY ^( STRING stringLiteral ) INT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TERRITORY, "TERRITORY")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:50: ^( STRING stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:200:1: factionZoneProperty : 'zone:' stringList -> ^( ZONE stringList ) ;
    public final AtrophyScriptParser.factionZoneProperty_return factionZoneProperty() throws RecognitionException {
        AtrophyScriptParser.factionZoneProperty_return retval = new AtrophyScriptParser.factionZoneProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal98=null;
        AtrophyScriptParser.stringList_return stringList99 =null;


        CommonTree string_literal98_tree=null;
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:200:20: ( 'zone:' stringList -> ^( ZONE stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:4: 'zone:' stringList
            {
            string_literal98=(Token)match(input,214,FOLLOW_214_in_factionZoneProperty1140);  
            stream_214.add(string_literal98);


            pushFollow(FOLLOW_stringList_in_factionZoneProperty1142);
            stringList99=stringList();

            state._fsp--;

            stream_stringList.add(stringList99.getTree());

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
            // 201:23: -> ^( ZONE stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:26: ^( ZONE stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:204:1: saferoomProperty : 'saferoom' -> ^( SAFEROOM ) ;
    public final AtrophyScriptParser.saferoomProperty_return saferoomProperty() throws RecognitionException {
        AtrophyScriptParser.saferoomProperty_return retval = new AtrophyScriptParser.saferoomProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal100=null;

        CommonTree string_literal100_tree=null;
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:204:17: ( 'saferoom' -> ^( SAFEROOM ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:4: 'saferoom'
            {
            string_literal100=(Token)match(input,185,FOLLOW_185_in_saferoomProperty1165);  
            stream_185.add(string_literal100);


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
            // 205:15: -> ^( SAFEROOM )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:18: ^( SAFEROOM )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:208:1: stageDeclProperty : 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) ;
    public final AtrophyScriptParser.stageDeclProperty_return stageDeclProperty() throws RecognitionException {
        AtrophyScriptParser.stageDeclProperty_return retval = new AtrophyScriptParser.stageDeclProperty_return();
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
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:208:18: ( 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:4: 'stages:' INT ( ',' INT )*
            {
            string_literal101=(Token)match(input,194,FOLLOW_194_in_stageDeclProperty1186);  
            stream_194.add(string_literal101);


            INT102=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1188);  
            stream_INT.add(INT102);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:18: ( ',' INT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==110) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:19: ',' INT
            	    {
            	    char_literal103=(Token)match(input,110,FOLLOW_110_in_stageDeclProperty1191);  
            	    stream_110.add(char_literal103);


            	    INT104=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1193);  
            	    stream_INT.add(INT104);


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
            // 209:29: -> ^( STAGELIST ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:32: ^( STAGELIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STAGELIST, "STAGELIST")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:44: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:212:1: talkMapParentProperty : ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) ;
    public final AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty() throws RecognitionException {
        AtrophyScriptParser.talkMapParentProperty_return retval = new AtrophyScriptParser.talkMapParentProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal105=null;
        Token string_literal106=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral107 =null;


        CommonTree string_literal105_tree=null;
        CommonTree string_literal106_tree=null;
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:212:22: ( ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:4: ( 'parent:' | 'p:' ) stringLiteral
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:4: ( 'parent:' | 'p:' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==177) ) {
                alt18=1;
            }
            else if ( (LA18_0==176) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:5: 'parent:'
                    {
                    string_literal105=(Token)match(input,177,FOLLOW_177_in_talkMapParentProperty1220);  
                    stream_177.add(string_literal105);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:17: 'p:'
                    {
                    string_literal106=(Token)match(input,176,FOLLOW_176_in_talkMapParentProperty1224);  
                    stream_176.add(string_literal106);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_talkMapParentProperty1227);
            stringLiteral107=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral107.getTree());

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
            // 213:37: -> ^( TALKPARENT stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:40: ^( TALKPARENT stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:216:1: stageProperty : ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) ;
    public final AtrophyScriptParser.stageProperty_return stageProperty() throws RecognitionException {
        AtrophyScriptParser.stageProperty_return retval = new AtrophyScriptParser.stageProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal108=null;
        Token string_literal109=null;
        Token INT110=null;

        CommonTree string_literal108_tree=null;
        CommonTree string_literal109_tree=null;
        CommonTree INT110_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:216:14: ( ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:4: ( 'stage:' | 's:' ) INT
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:4: ( 'stage:' | 's:' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==193) ) {
                alt19=1;
            }
            else if ( (LA19_0==184) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:5: 'stage:'
                    {
                    string_literal108=(Token)match(input,193,FOLLOW_193_in_stageProperty1251);  
                    stream_193.add(string_literal108);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:16: 's:'
                    {
                    string_literal109=(Token)match(input,184,FOLLOW_184_in_stageProperty1255);  
                    stream_184.add(string_literal109);


                    }
                    break;

            }


            INT110=(Token)match(input,INT,FOLLOW_INT_in_stageProperty1258);  
            stream_INT.add(INT110);


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
            // 217:26: -> ^( TALKSTAGE INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:29: ^( TALKSTAGE INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:220:1: aiInitProperty : ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) ;
    public final AtrophyScriptParser.aiInitProperty_return aiInitProperty() throws RecognitionException {
        AtrophyScriptParser.aiInitProperty_return retval = new AtrophyScriptParser.aiInitProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal111=null;
        Token string_literal112=null;
        Token BOOL113=null;

        CommonTree string_literal111_tree=null;
        CommonTree string_literal112_tree=null;
        CommonTree BOOL113_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:220:15: ( ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:4: ( 'aiInit:' | 'a:' ) BOOL
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:4: ( 'aiInit:' | 'a:' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==134) ) {
                alt20=1;
            }
            else if ( (LA20_0==132) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:5: 'aiInit:'
                    {
                    string_literal111=(Token)match(input,134,FOLLOW_134_in_aiInitProperty1282);  
                    stream_134.add(string_literal111);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:17: 'a:'
                    {
                    string_literal112=(Token)match(input,132,FOLLOW_132_in_aiInitProperty1286);  
                    stream_132.add(string_literal112);


                    }
                    break;

            }


            BOOL113=(Token)match(input,BOOL,FOLLOW_BOOL_in_aiInitProperty1289);  
            stream_BOOL.add(BOOL113);


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
            // 221:28: -> ^( AIINIT BOOL )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:31: ^( AIINIT BOOL )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:224:1: openingLineProperty : ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) ;
    public final AtrophyScriptParser.openingLineProperty_return openingLineProperty() throws RecognitionException {
        AtrophyScriptParser.openingLineProperty_return retval = new AtrophyScriptParser.openingLineProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal114=null;
        Token string_literal115=null;
        Token string_literal116=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral117 =null;


        CommonTree string_literal114_tree=null;
        CommonTree string_literal115_tree=null;
        CommonTree string_literal116_tree=null;
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:224:20: ( ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:4: ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:4: ( 'o:' | 'opening:' | 'openingLine:' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 171:
                {
                alt21=1;
                }
                break;
            case 173:
                {
                alt21=2;
                }
                break;
            case 174:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:5: 'o:'
                    {
                    string_literal114=(Token)match(input,171,FOLLOW_171_in_openingLineProperty1313);  
                    stream_171.add(string_literal114);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:12: 'opening:'
                    {
                    string_literal115=(Token)match(input,173,FOLLOW_173_in_openingLineProperty1317);  
                    stream_173.add(string_literal115);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:25: 'openingLine:'
                    {
                    string_literal116=(Token)match(input,174,FOLLOW_174_in_openingLineProperty1321);  
                    stream_174.add(string_literal116);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_openingLineProperty1324);
            stringLiteral117=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral117.getTree());

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
            // 225:55: -> ^( OPENINGLINE stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:58: ^( OPENINGLINE stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:228:1: optionProperty : ( 'l:' | 'option:' ) stringLiteral -> ^( OPTION stringLiteral ) ;
    public final AtrophyScriptParser.optionProperty_return optionProperty() throws RecognitionException {
        AtrophyScriptParser.optionProperty_return retval = new AtrophyScriptParser.optionProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal118=null;
        Token string_literal119=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral120 =null;


        CommonTree string_literal118_tree=null;
        CommonTree string_literal119_tree=null;
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:228:15: ( ( 'l:' | 'option:' ) stringLiteral -> ^( OPTION stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:4: ( 'l:' | 'option:' ) stringLiteral
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:4: ( 'l:' | 'option:' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==162) ) {
                alt22=1;
            }
            else if ( (LA22_0==175) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:5: 'l:'
                    {
                    string_literal118=(Token)match(input,162,FOLLOW_162_in_optionProperty1346);  
                    stream_162.add(string_literal118);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:12: 'option:'
                    {
                    string_literal119=(Token)match(input,175,FOLLOW_175_in_optionProperty1350);  
                    stream_175.add(string_literal119);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_optionProperty1353);
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
            // 229:37: -> ^( OPTION stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:40: ^( OPTION stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:232:1: topicProperty : ( 't' | 'topic' ) requiredAssignment '{' topicProperties '}' -> ^( TOPIC requiredAssignment topicProperties ) ;
    public final AtrophyScriptParser.topicProperty_return topicProperty() throws RecognitionException {
        AtrophyScriptParser.topicProperty_return retval = new AtrophyScriptParser.topicProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal121=null;
        Token string_literal122=null;
        Token char_literal124=null;
        Token char_literal126=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment123 =null;

        AtrophyScriptParser.topicProperties_return topicProperties125 =null;


        CommonTree char_literal121_tree=null;
        CommonTree string_literal122_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree char_literal126_tree=null;
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_topicProperties=new RewriteRuleSubtreeStream(adaptor,"rule topicProperties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:232:14: ( ( 't' | 'topic' ) requiredAssignment '{' topicProperties '}' -> ^( TOPIC requiredAssignment topicProperties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:4: ( 't' | 'topic' ) requiredAssignment '{' topicProperties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:4: ( 't' | 'topic' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==197) ) {
                alt23=1;
            }
            else if ( (LA23_0==205) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:5: 't'
                    {
                    char_literal121=(Token)match(input,197,FOLLOW_197_in_topicProperty1377);  
                    stream_197.add(char_literal121);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:11: 'topic'
                    {
                    string_literal122=(Token)match(input,205,FOLLOW_205_in_topicProperty1381);  
                    stream_205.add(string_literal122);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_topicProperty1384);
            requiredAssignment123=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment123.getTree());

            char_literal124=(Token)match(input,215,FOLLOW_215_in_topicProperty1386);  
            stream_215.add(char_literal124);


            pushFollow(FOLLOW_topicProperties_in_topicProperty1388);
            topicProperties125=topicProperties();

            state._fsp--;

            stream_topicProperties.add(topicProperties125.getTree());

            char_literal126=(Token)match(input,216,FOLLOW_216_in_topicProperty1390);  
            stream_216.add(char_literal126);


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
            // 233:63: -> ^( TOPIC requiredAssignment topicProperties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:66: ^( TOPIC requiredAssignment topicProperties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:236:1: topicProperties : ( topicLine | topicRequiement )* ;
    public final AtrophyScriptParser.topicProperties_return topicProperties() throws RecognitionException {
        AtrophyScriptParser.topicProperties_return retval = new AtrophyScriptParser.topicProperties_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.topicLine_return topicLine127 =null;

        AtrophyScriptParser.topicRequiement_return topicRequiement128 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:236:16: ( ( topicLine | topicRequiement )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:4: ( topicLine | topicRequiement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:4: ( topicLine | topicRequiement )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==163) ) {
                    alt24=1;
                }
                else if ( (LA24_0==183) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:5: topicLine
            	    {
            	    pushFollow(FOLLOW_topicLine_in_topicProperties1417);
            	    topicLine127=topicLine();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicLine127.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:17: topicRequiement
            	    {
            	    pushFollow(FOLLOW_topicRequiement_in_topicProperties1421);
            	    topicRequiement128=topicRequiement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicRequiement128.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:240:1: topicLine : 'lines:' stringLiteral ( ',' stringLiteral )* -> ( ^( LINE stringLiteral ) )* ;
    public final AtrophyScriptParser.topicLine_return topicLine() throws RecognitionException {
        AtrophyScriptParser.topicLine_return retval = new AtrophyScriptParser.topicLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal129=null;
        Token char_literal131=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral130 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral132 =null;


        CommonTree string_literal129_tree=null;
        CommonTree char_literal131_tree=null;
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:240:10: ( 'lines:' stringLiteral ( ',' stringLiteral )* -> ( ^( LINE stringLiteral ) )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:4: 'lines:' stringLiteral ( ',' stringLiteral )*
            {
            string_literal129=(Token)match(input,163,FOLLOW_163_in_topicLine1438);  
            stream_163.add(string_literal129);


            pushFollow(FOLLOW_stringLiteral_in_topicLine1439);
            stringLiteral130=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral130.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:26: ( ',' stringLiteral )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==110) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:27: ',' stringLiteral
            	    {
            	    char_literal131=(Token)match(input,110,FOLLOW_110_in_topicLine1442);  
            	    stream_110.add(char_literal131);


            	    pushFollow(FOLLOW_stringLiteral_in_topicLine1444);
            	    stringLiteral132=stringLiteral();

            	    state._fsp--;

            	    stream_stringLiteral.add(stringLiteral132.getTree());

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
            // 241:47: -> ( ^( LINE stringLiteral ) )*
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:50: ( ^( LINE stringLiteral ) )*
                while ( stream_stringLiteral.hasNext() ) {
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:50: ^( LINE stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:244:1: topicRequiement : 'req:' reqString ( ',' reqString )* -> ( ^( REQ reqString ) )* ;
    public final AtrophyScriptParser.topicRequiement_return topicRequiement() throws RecognitionException {
        AtrophyScriptParser.topicRequiement_return retval = new AtrophyScriptParser.topicRequiement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal133=null;
        Token char_literal135=null;
        AtrophyScriptParser.reqString_return reqString134 =null;

        AtrophyScriptParser.reqString_return reqString136 =null;


        CommonTree string_literal133_tree=null;
        CommonTree char_literal135_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_reqString=new RewriteRuleSubtreeStream(adaptor,"rule reqString");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:244:16: ( 'req:' reqString ( ',' reqString )* -> ( ^( REQ reqString ) )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:4: 'req:' reqString ( ',' reqString )*
            {
            string_literal133=(Token)match(input,183,FOLLOW_183_in_topicRequiement1470);  
            stream_183.add(string_literal133);


            pushFollow(FOLLOW_reqString_in_topicRequiement1472);
            reqString134=reqString();

            state._fsp--;

            stream_reqString.add(reqString134.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:21: ( ',' reqString )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==110) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:22: ',' reqString
            	    {
            	    char_literal135=(Token)match(input,110,FOLLOW_110_in_topicRequiement1475);  
            	    stream_110.add(char_literal135);


            	    pushFollow(FOLLOW_reqString_in_topicRequiement1477);
            	    reqString136=reqString();

            	    state._fsp--;

            	    stream_reqString.add(reqString136.getTree());

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
            // 245:38: -> ( ^( REQ reqString ) )*
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:41: ( ^( REQ reqString ) )*
                while ( stream_reqString.hasNext() ) {
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:41: ^( REQ reqString )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:248:1: reqString : ( NOT_PREFIX stringLiteral -> ^( NEGATION stringLiteral ) | stringLiteral );
    public final AtrophyScriptParser.reqString_return reqString() throws RecognitionException {
        AtrophyScriptParser.reqString_return retval = new AtrophyScriptParser.reqString_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NOT_PREFIX137=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral138 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral139 =null;


        CommonTree NOT_PREFIX137_tree=null;
        RewriteRuleTokenStream stream_NOT_PREFIX=new RewriteRuleTokenStream(adaptor,"token NOT_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:248:10: ( NOT_PREFIX stringLiteral -> ^( NEGATION stringLiteral ) | stringLiteral )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==NOT_PREFIX) ) {
                alt27=1;
            }
            else if ( (LA27_0==106) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:4: NOT_PREFIX stringLiteral
                    {
                    NOT_PREFIX137=(Token)match(input,NOT_PREFIX,FOLLOW_NOT_PREFIX_in_reqString1503);  
                    stream_NOT_PREFIX.add(NOT_PREFIX137);


                    pushFollow(FOLLOW_stringLiteral_in_reqString1505);
                    stringLiteral138=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral138.getTree());

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
                    // 249:29: -> ^( NEGATION stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:32: ^( NEGATION stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:6: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stringLiteral_in_reqString1520);
                    stringLiteral139=stringLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, stringLiteral139.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:253:1: aliveQuery : 'isAlive' '{' unitInfo '}' -> ^( ISALIVE unitInfo ) ;
    public final AtrophyScriptParser.aliveQuery_return aliveQuery() throws RecognitionException {
        AtrophyScriptParser.aliveQuery_return retval = new AtrophyScriptParser.aliveQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal140=null;
        Token char_literal141=null;
        Token char_literal143=null;
        AtrophyScriptParser.unitInfo_return unitInfo142 =null;


        CommonTree string_literal140_tree=null;
        CommonTree char_literal141_tree=null;
        CommonTree char_literal143_tree=null;
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:253:11: ( 'isAlive' '{' unitInfo '}' -> ^( ISALIVE unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:4: 'isAlive' '{' unitInfo '}'
            {
            string_literal140=(Token)match(input,151,FOLLOW_151_in_aliveQuery1535);  
            stream_151.add(string_literal140);


            char_literal141=(Token)match(input,215,FOLLOW_215_in_aliveQuery1537);  
            stream_215.add(char_literal141);


            pushFollow(FOLLOW_unitInfo_in_aliveQuery1539);
            unitInfo142=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo142.getTree());

            char_literal143=(Token)match(input,216,FOLLOW_216_in_aliveQuery1541);  
            stream_216.add(char_literal143);


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
            // 254:31: -> ^( ISALIVE unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:34: ^( ISALIVE unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:1: timeQuery : 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) ) ;
    public final AtrophyScriptParser.timeQuery_return timeQuery() throws RecognitionException {
        AtrophyScriptParser.timeQuery_return retval = new AtrophyScriptParser.timeQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal144=null;
        Token INT145=null;
        Token string_literal146=null;
        Token INT147=null;
        Token string_literal148=null;
        Token INT149=null;

        CommonTree string_literal144_tree=null;
        CommonTree INT145_tree=null;
        CommonTree string_literal146_tree=null;
        CommonTree INT147_tree=null;
        CommonTree string_literal148_tree=null;
        CommonTree INT149_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:10: ( 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:4: 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) )
            {
            string_literal144=(Token)match(input,172,FOLLOW_172_in_timeQuery1564);  
            stream_172.add(string_literal144);


            INT145=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1566);  
            stream_INT.add(INT145);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:259:4: ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 148:
                {
                alt28=1;
                }
                break;
            case 147:
                {
                alt28=2;
                }
                break;
            case 109:
            case 113:
            case 124:
            case 216:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:259:5: 'expireTime:' INT
                    {
                    string_literal146=(Token)match(input,148,FOLLOW_148_in_timeQuery1572);  
                    stream_148.add(string_literal146);


                    INT147=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1574);  
                    stream_INT.add(INT147);


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
                    // 259:23: -> ^( ONTIME INT ^( EXPIRETIME INT ) )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:259:26: ^( ONTIME INT ^( EXPIRETIME INT ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ONTIME, "ONTIME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:259:39: ^( EXPIRETIME INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:260:5: 'expireRepeats:' INT
                    {
                    string_literal148=(Token)match(input,147,FOLLOW_147_in_timeQuery1594);  
                    stream_147.add(string_literal148);


                    INT149=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1596);  
                    stream_INT.add(INT149);


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
                    // 260:26: -> ^( ONTIME INT ^( EXPIREREPEATS INT ) )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:260:29: ^( ONTIME INT ^( EXPIREREPEATS INT ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ONTIME, "ONTIME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:260:42: ^( EXPIREREPEATS INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:6: 
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
                    // 261:6: -> ^( ONTIME INT EMPTY )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:9: ^( ONTIME INT EMPTY )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:264:1: boolQuery : ( '(' ! queryLogic ')' !| aliveQuery | timeQuery );
    public final AtrophyScriptParser.boolQuery_return boolQuery() throws RecognitionException {
        AtrophyScriptParser.boolQuery_return retval = new AtrophyScriptParser.boolQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal150=null;
        Token char_literal152=null;
        AtrophyScriptParser.queryLogic_return queryLogic151 =null;

        AtrophyScriptParser.aliveQuery_return aliveQuery153 =null;

        AtrophyScriptParser.timeQuery_return timeQuery154 =null;


        CommonTree char_literal150_tree=null;
        CommonTree char_literal152_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:264:10: ( '(' ! queryLogic ')' !| aliveQuery | timeQuery )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt29=1;
                }
                break;
            case 151:
                {
                alt29=2;
                }
                break;
            case 172:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:3: '(' ! queryLogic ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal150=(Token)match(input,108,FOLLOW_108_in_boolQuery1638); 

                    pushFollow(FOLLOW_queryLogic_in_boolQuery1641);
                    queryLogic151=queryLogic();

                    state._fsp--;

                    adaptor.addChild(root_0, queryLogic151.getTree());

                    char_literal152=(Token)match(input,109,FOLLOW_109_in_boolQuery1643); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:5: aliveQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_aliveQuery_in_boolQuery1650);
                    aliveQuery153=aliveQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, aliveQuery153.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:267:5: timeQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeQuery_in_boolQuery1656);
                    timeQuery154=timeQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, timeQuery154.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:1: queryNegation : ( boolQuery | '!' boolQuery -> ^( NEGATION boolQuery ) );
    public final AtrophyScriptParser.queryNegation_return queryNegation() throws RecognitionException {
        AtrophyScriptParser.queryNegation_return retval = new AtrophyScriptParser.queryNegation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal156=null;
        AtrophyScriptParser.boolQuery_return boolQuery155 =null;

        AtrophyScriptParser.boolQuery_return boolQuery157 =null;


        CommonTree char_literal156_tree=null;
        RewriteRuleTokenStream stream_NOT_PREFIX=new RewriteRuleTokenStream(adaptor,"token NOT_PREFIX");
        RewriteRuleSubtreeStream stream_boolQuery=new RewriteRuleSubtreeStream(adaptor,"rule boolQuery");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:14: ( boolQuery | '!' boolQuery -> ^( NEGATION boolQuery ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==108||LA30_0==151||LA30_0==172) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:271:3: boolQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_boolQuery_in_queryNegation1670);
                    boolQuery155=boolQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, boolQuery155.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:4: '!' boolQuery
                    {
                    char_literal156=(Token)match(input,NOT_PREFIX,FOLLOW_NOT_PREFIX_in_queryNegation1675);  
                    stream_NOT_PREFIX.add(char_literal156);


                    pushFollow(FOLLOW_boolQuery_in_queryNegation1677);
                    boolQuery157=boolQuery();

                    state._fsp--;

                    stream_boolQuery.add(boolQuery157.getTree());

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
                    // 272:18: -> ^( NEGATION boolQuery )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:21: ^( NEGATION boolQuery )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:275:1: queryLogic : b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) ) ;
    public final AtrophyScriptParser.queryLogic_return queryLogic() throws RecognitionException {
        AtrophyScriptParser.queryLogic_return retval = new AtrophyScriptParser.queryLogic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal158=null;
        Token string_literal159=null;
        AtrophyScriptParser.queryNegation_return b1 =null;

        AtrophyScriptParser.queryNegation_return b2 =null;


        CommonTree string_literal158_tree=null;
        CommonTree string_literal159_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_queryNegation=new RewriteRuleSubtreeStream(adaptor,"rule queryNegation");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:275:11: (b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:276:3: b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) )
            {
            pushFollow(FOLLOW_queryNegation_in_queryLogic1701);
            b1=queryNegation();

            state._fsp--;

            stream_queryNegation.add(b1.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:3: ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt31=1;
                }
                break;
            case 124:
                {
                alt31=2;
                }
                break;
            case 109:
            case 216:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:4: 'AND' b2= queryNegation
                    {
                    string_literal158=(Token)match(input,113,FOLLOW_113_in_queryLogic1706);  
                    stream_113.add(string_literal158);


                    pushFollow(FOLLOW_queryNegation_in_queryLogic1710);
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
                    // 277:27: -> ^( AND $b1 $b2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:30: ^( AND $b1 $b2)
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:278:4: 'OR' b2= queryNegation
                    {
                    string_literal159=(Token)match(input,124,FOLLOW_124_in_queryLogic1727);  
                    stream_124.add(string_literal159);


                    pushFollow(FOLLOW_queryNegation_in_queryLogic1731);
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
                    // 278:26: -> ^( OR $b1 $b2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:278:29: ^( OR $b1 $b2)
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:279:5: 
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
                    // 279:5: -> ^( LOGIC $b1)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:279:8: ^( LOGIC $b1)
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:282:1: triggerCondProperty : ( 'tc' | 'triggerCond' ) '{' queryLogic '}' -> ^( TRIGGERCOND queryLogic ) ;
    public final AtrophyScriptParser.triggerCondProperty_return triggerCondProperty() throws RecognitionException {
        AtrophyScriptParser.triggerCondProperty_return retval = new AtrophyScriptParser.triggerCondProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal160=null;
        Token string_literal161=null;
        Token char_literal162=null;
        Token char_literal164=null;
        AtrophyScriptParser.queryLogic_return queryLogic163 =null;


        CommonTree string_literal160_tree=null;
        CommonTree string_literal161_tree=null;
        CommonTree char_literal162_tree=null;
        CommonTree char_literal164_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleSubtreeStream stream_queryLogic=new RewriteRuleSubtreeStream(adaptor,"rule queryLogic");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:282:20: ( ( 'tc' | 'triggerCond' ) '{' queryLogic '}' -> ^( TRIGGERCOND queryLogic ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:283:4: ( 'tc' | 'triggerCond' ) '{' queryLogic '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:283:4: ( 'tc' | 'triggerCond' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==199) ) {
                alt32=1;
            }
            else if ( (LA32_0==207) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:283:5: 'tc'
                    {
                    string_literal160=(Token)match(input,199,FOLLOW_199_in_triggerCondProperty1771);  
                    stream_199.add(string_literal160);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:283:12: 'triggerCond'
                    {
                    string_literal161=(Token)match(input,207,FOLLOW_207_in_triggerCondProperty1775);  
                    stream_207.add(string_literal161);


                    }
                    break;

            }


            char_literal162=(Token)match(input,215,FOLLOW_215_in_triggerCondProperty1778);  
            stream_215.add(char_literal162);


            pushFollow(FOLLOW_queryLogic_in_triggerCondProperty1780);
            queryLogic163=queryLogic();

            state._fsp--;

            stream_queryLogic.add(queryLogic163.getTree());

            char_literal164=(Token)match(input,216,FOLLOW_216_in_triggerCondProperty1782);  
            stream_216.add(char_literal164);


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
            // 283:46: -> ^( TRIGGERCOND queryLogic )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:283:49: ^( TRIGGERCOND queryLogic )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:286:1: triggerEffectProperty : ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) ;
    public final AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty() throws RecognitionException {
        AtrophyScriptParser.triggerEffectProperty_return retval = new AtrophyScriptParser.triggerEffectProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal165=null;
        Token string_literal166=null;
        Token char_literal167=null;
        Token char_literal169=null;
        AtrophyScriptParser.triggerEffectList_return triggerEffectList168 =null;


        CommonTree string_literal165_tree=null;
        CommonTree string_literal166_tree=null;
        CommonTree char_literal167_tree=null;
        CommonTree char_literal169_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:286:22: ( ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:287:4: ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:287:4: ( 'te' | 'triggerEffect' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==200) ) {
                alt33=1;
            }
            else if ( (LA33_0==208) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:287:5: 'te'
                    {
                    string_literal165=(Token)match(input,200,FOLLOW_200_in_triggerEffectProperty1804);  
                    stream_200.add(string_literal165);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:287:12: 'triggerEffect'
                    {
                    string_literal166=(Token)match(input,208,FOLLOW_208_in_triggerEffectProperty1808);  
                    stream_208.add(string_literal166);


                    }
                    break;

            }


            char_literal167=(Token)match(input,215,FOLLOW_215_in_triggerEffectProperty1811);  
            stream_215.add(char_literal167);


            pushFollow(FOLLOW_triggerEffectList_in_triggerEffectProperty1813);
            triggerEffectList168=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList168.getTree());

            char_literal169=(Token)match(input,216,FOLLOW_216_in_triggerEffectProperty1815);  
            stream_216.add(char_literal169);


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
            // 287:55: -> ^( TRIGGEREFFECT triggerEffectList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:287:58: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:290:1: coverDecl : ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) ;
    public final AtrophyScriptParser.coverDecl_return coverDecl() throws RecognitionException {
        AtrophyScriptParser.coverDecl_return retval = new AtrophyScriptParser.coverDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal170=null;
        Token string_literal171=null;
        Token char_literal173=null;
        Token char_literal175=null;
        AtrophyScriptParser.varAssignment_return varAssignment172 =null;

        AtrophyScriptParser.properties_return properties174 =null;


        CommonTree string_literal170_tree=null;
        CommonTree string_literal171_tree=null;
        CommonTree char_literal173_tree=null;
        CommonTree char_literal175_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:290:10: ( ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:291:4: ( 'COVER' | 'cover' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:291:4: ( 'COVER' | 'cover' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==116) ) {
                alt34=1;
            }
            else if ( (LA34_0==143) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:291:5: 'COVER'
                    {
                    string_literal170=(Token)match(input,116,FOLLOW_116_in_coverDecl1839);  
                    stream_116.add(string_literal170);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:291:15: 'cover'
                    {
                    string_literal171=(Token)match(input,143,FOLLOW_143_in_coverDecl1843);  
                    stream_143.add(string_literal171);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_coverDecl1846);
            varAssignment172=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment172.getTree());

            char_literal173=(Token)match(input,215,FOLLOW_215_in_coverDecl1848);  
            stream_215.add(char_literal173);


            pushFollow(FOLLOW_properties_in_coverDecl1850);
            properties174=properties();

            state._fsp--;

            stream_properties.add(properties174.getTree());

            char_literal175=(Token)match(input,216,FOLLOW_216_in_coverDecl1852);  
            stream_216.add(char_literal175);


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
            // 291:57: -> ^( COVER varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:291:60: ^( COVER varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:294:1: stashDecl : ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) ;
    public final AtrophyScriptParser.stashDecl_return stashDecl() throws RecognitionException {
        AtrophyScriptParser.stashDecl_return retval = new AtrophyScriptParser.stashDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal176=null;
        Token string_literal177=null;
        Token char_literal179=null;
        Token char_literal181=null;
        AtrophyScriptParser.varAssignment_return varAssignment178 =null;

        AtrophyScriptParser.properties_return properties180 =null;


        CommonTree string_literal176_tree=null;
        CommonTree string_literal177_tree=null;
        CommonTree char_literal179_tree=null;
        CommonTree char_literal181_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:294:10: ( ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:295:4: ( 'STASH' | 'stash' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:295:4: ( 'STASH' | 'stash' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==128) ) {
                alt35=1;
            }
            else if ( (LA35_0==195) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:295:5: 'STASH'
                    {
                    string_literal176=(Token)match(input,128,FOLLOW_128_in_stashDecl1878);  
                    stream_128.add(string_literal176);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:295:15: 'stash'
                    {
                    string_literal177=(Token)match(input,195,FOLLOW_195_in_stashDecl1882);  
                    stream_195.add(string_literal177);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_stashDecl1885);
            varAssignment178=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment178.getTree());

            char_literal179=(Token)match(input,215,FOLLOW_215_in_stashDecl1887);  
            stream_215.add(char_literal179);


            pushFollow(FOLLOW_properties_in_stashDecl1889);
            properties180=properties();

            state._fsp--;

            stream_properties.add(properties180.getTree());

            char_literal181=(Token)match(input,216,FOLLOW_216_in_stashDecl1891);  
            stream_216.add(char_literal181);


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
            // 295:57: -> ^( STASH varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:295:60: ^( STASH varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:298:1: triggerEffectList : triggerEffect ( ',' ! triggerEffect )* ;
    public final AtrophyScriptParser.triggerEffectList_return triggerEffectList() throws RecognitionException {
        AtrophyScriptParser.triggerEffectList_return retval = new AtrophyScriptParser.triggerEffectList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal183=null;
        AtrophyScriptParser.triggerEffect_return triggerEffect182 =null;

        AtrophyScriptParser.triggerEffect_return triggerEffect184 =null;


        CommonTree char_literal183_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:298:18: ( triggerEffect ( ',' ! triggerEffect )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:4: triggerEffect ( ',' ! triggerEffect )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1914);
            triggerEffect182=triggerEffect();

            state._fsp--;

            adaptor.addChild(root_0, triggerEffect182.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:18: ( ',' ! triggerEffect )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==110) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:19: ',' ! triggerEffect
            	    {
            	    char_literal183=(Token)match(input,110,FOLLOW_110_in_triggerEffectList1917); 

            	    pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1920);
            	    triggerEffect184=triggerEffect();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffect184.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:302:1: triggerEffect : ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | showMessage | setTriggerRunning | spawnItem | spawnTalkNode | commandCallList );
    public final AtrophyScriptParser.triggerEffect_return triggerEffect() throws RecognitionException {
        AtrophyScriptParser.triggerEffect_return retval = new AtrophyScriptParser.triggerEffect_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.updateTalkTree_return updateTalkTree185 =null;

        AtrophyScriptParser.spawnTeam_return spawnTeam186 =null;

        AtrophyScriptParser.spawnCharacter_return spawnCharacter187 =null;

        AtrophyScriptParser.removeUnit_return removeUnit188 =null;

        AtrophyScriptParser.killUnit_return killUnit189 =null;

        AtrophyScriptParser.teleportUnit_return teleportUnit190 =null;

        AtrophyScriptParser.converseUnit_return converseUnit191 =null;

        AtrophyScriptParser.createSaferoom_return createSaferoom192 =null;

        AtrophyScriptParser.removeSaferoom_return removeSaferoom193 =null;

        AtrophyScriptParser.loadMap_return loadMap194 =null;

        AtrophyScriptParser.lockDoor_return lockDoor195 =null;

        AtrophyScriptParser.unlockDoor_return unlockDoor196 =null;

        AtrophyScriptParser.addTag_return addTag197 =null;

        AtrophyScriptParser.removeTag_return removeTag198 =null;

        AtrophyScriptParser.directorBias_return directorBias199 =null;

        AtrophyScriptParser.changeAiNode_return changeAiNode200 =null;

        AtrophyScriptParser.showMessage_return showMessage201 =null;

        AtrophyScriptParser.setTriggerRunning_return setTriggerRunning202 =null;

        AtrophyScriptParser.spawnItem_return spawnItem203 =null;

        AtrophyScriptParser.spawnTalkNode_return spawnTalkNode204 =null;

        AtrophyScriptParser.commandCallList_return commandCallList205 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:302:14: ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | showMessage | setTriggerRunning | spawnItem | spawnTalkNode | commandCallList )
            int alt37=21;
            switch ( input.LA(1) ) {
            case UPDATE_TREE_PREFIX:
            case 210:
                {
                alt37=1;
                }
                break;
            case 192:
                {
                alt37=2;
                }
                break;
            case 189:
                {
                alt37=3;
                }
                break;
            case 182:
                {
                alt37=4;
                }
                break;
            case 161:
                {
                alt37=5;
                }
                break;
            case 201:
                {
                alt37=6;
                }
                break;
            case 142:
                {
                alt37=7;
                }
                break;
            case 185:
                {
                alt37=8;
                }
                break;
            case 180:
                {
                alt37=9;
                }
                break;
            case 164:
                {
                alt37=10;
                }
                break;
            case 165:
                {
                alt37=11;
                }
                break;
            case 209:
                {
                alt37=12;
                }
                break;
            case ADD_TAG_PREFIX:
            case 133:
                {
                alt37=13;
                }
                break;
            case REMOVE_TAG_PREFIX:
            case 181:
                {
                alt37=14;
                }
                break;
            case 145:
                {
                alt37=15;
                }
                break;
            case 139:
                {
                alt37=16;
                }
                break;
            case 188:
                {
                alt37=17;
                }
                break;
            case 187:
                {
                alt37=18;
                }
                break;
            case 190:
                {
                alt37=19;
                }
                break;
            case 191:
                {
                alt37=20;
                }
                break;
            case COMMAND_CALL_PREFIX:
            case 119:
            case 138:
                {
                alt37=21;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:303:4: updateTalkTree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_updateTalkTree_in_triggerEffect1935);
                    updateTalkTree185=updateTalkTree();

                    state._fsp--;

                    adaptor.addChild(root_0, updateTalkTree185.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:6: spawnTeam
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnTeam_in_triggerEffect1942);
                    spawnTeam186=spawnTeam();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnTeam186.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:6: spawnCharacter
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnCharacter_in_triggerEffect1949);
                    spawnCharacter187=spawnCharacter();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnCharacter187.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:306:6: removeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeUnit_in_triggerEffect1956);
                    removeUnit188=removeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, removeUnit188.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:307:6: killUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_killUnit_in_triggerEffect1963);
                    killUnit189=killUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, killUnit189.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:6: teleportUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_teleportUnit_in_triggerEffect1970);
                    teleportUnit190=teleportUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, teleportUnit190.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:6: converseUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_converseUnit_in_triggerEffect1977);
                    converseUnit191=converseUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, converseUnit191.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:310:6: createSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_createSaferoom_in_triggerEffect1984);
                    createSaferoom192=createSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, createSaferoom192.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:311:6: removeSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeSaferoom_in_triggerEffect1991);
                    removeSaferoom193=removeSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, removeSaferoom193.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:312:6: loadMap
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_loadMap_in_triggerEffect1998);
                    loadMap194=loadMap();

                    state._fsp--;

                    adaptor.addChild(root_0, loadMap194.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:313:6: lockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lockDoor_in_triggerEffect2005);
                    lockDoor195=lockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, lockDoor195.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:314:6: unlockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unlockDoor_in_triggerEffect2012);
                    unlockDoor196=unlockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, unlockDoor196.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:315:6: addTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_addTag_in_triggerEffect2019);
                    addTag197=addTag();

                    state._fsp--;

                    adaptor.addChild(root_0, addTag197.getTree());

                    }
                    break;
                case 14 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:316:6: removeTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeTag_in_triggerEffect2026);
                    removeTag198=removeTag();

                    state._fsp--;

                    adaptor.addChild(root_0, removeTag198.getTree());

                    }
                    break;
                case 15 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:6: directorBias
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_directorBias_in_triggerEffect2033);
                    directorBias199=directorBias();

                    state._fsp--;

                    adaptor.addChild(root_0, directorBias199.getTree());

                    }
                    break;
                case 16 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:318:6: changeAiNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_changeAiNode_in_triggerEffect2040);
                    changeAiNode200=changeAiNode();

                    state._fsp--;

                    adaptor.addChild(root_0, changeAiNode200.getTree());

                    }
                    break;
                case 17 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:319:6: showMessage
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_showMessage_in_triggerEffect2047);
                    showMessage201=showMessage();

                    state._fsp--;

                    adaptor.addChild(root_0, showMessage201.getTree());

                    }
                    break;
                case 18 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:320:6: setTriggerRunning
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_setTriggerRunning_in_triggerEffect2054);
                    setTriggerRunning202=setTriggerRunning();

                    state._fsp--;

                    adaptor.addChild(root_0, setTriggerRunning202.getTree());

                    }
                    break;
                case 19 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:321:6: spawnItem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnItem_in_triggerEffect2061);
                    spawnItem203=spawnItem();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnItem203.getTree());

                    }
                    break;
                case 20 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:322:6: spawnTalkNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnTalkNode_in_triggerEffect2068);
                    spawnTalkNode204=spawnTalkNode();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnTalkNode204.getTree());

                    }
                    break;
                case 21 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:323:6: commandCallList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandCallList_in_triggerEffect2075);
                    commandCallList205=commandCallList();

                    state._fsp--;

                    adaptor.addChild(root_0, commandCallList205.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:326:1: updateTalkTree : ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) );
    public final AtrophyScriptParser.updateTalkTree_return updateTalkTree() throws RecognitionException {
        AtrophyScriptParser.updateTalkTree_return retval = new AtrophyScriptParser.updateTalkTree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal206=null;
        Token INT208=null;
        Token UPDATE_TREE_PREFIX209=null;
        Token char_literal211=null;
        Token INT212=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral207 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral210 =null;


        CommonTree string_literal206_tree=null;
        CommonTree INT208_tree=null;
        CommonTree UPDATE_TREE_PREFIX209_tree=null;
        CommonTree char_literal211_tree=null;
        CommonTree INT212_tree=null;
        RewriteRuleTokenStream stream_210=new RewriteRuleTokenStream(adaptor,"token 210");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_UPDATE_TREE_PREFIX=new RewriteRuleTokenStream(adaptor,"token UPDATE_TREE_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:326:15: ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==210) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:4: 'updateTalk:' stringLiteral INT
                    {
                    string_literal206=(Token)match(input,210,FOLLOW_210_in_updateTalkTree2090);  
                    stream_210.add(string_literal206);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree2092);
                    stringLiteral207=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral207.getTree());

                    INT208=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree2094);  
                    stream_INT.add(INT208);


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
                    // 327:36: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:39: ^( UPDATETALK stringLiteral INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:328:6: UPDATE_TREE_PREFIX stringLiteral '#' INT
                    {
                    UPDATE_TREE_PREFIX209=(Token)match(input,UPDATE_TREE_PREFIX,FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree2111);  
                    stream_UPDATE_TREE_PREFIX.add(UPDATE_TREE_PREFIX209);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree2113);
                    stringLiteral210=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral210.getTree());

                    char_literal211=(Token)match(input,107,FOLLOW_107_in_updateTalkTree2115);  
                    stream_107.add(char_literal211);


                    INT212=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree2117);  
                    stream_INT.add(INT212);


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
                    // 328:47: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:328:50: ^( UPDATETALK stringLiteral INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:1: isName : 'isName:' stringList -> ^( ISNAME stringList ) ;
    public final AtrophyScriptParser.isName_return isName() throws RecognitionException {
        AtrophyScriptParser.isName_return retval = new AtrophyScriptParser.isName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal213=null;
        AtrophyScriptParser.stringList_return stringList214 =null;


        CommonTree string_literal213_tree=null;
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:7: ( 'isName:' stringList -> ^( ISNAME stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:332:4: 'isName:' stringList
            {
            string_literal213=(Token)match(input,156,FOLLOW_156_in_isName2142);  
            stream_156.add(string_literal213);


            pushFollow(FOLLOW_stringList_in_isName2144);
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
            // 332:25: -> ^( ISNAME stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:332:28: ^( ISNAME stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:1: isFaction : 'isFaction:' stringList -> ^( ISFACTION stringList ) ;
    public final AtrophyScriptParser.isFaction_return isFaction() throws RecognitionException {
        AtrophyScriptParser.isFaction_return retval = new AtrophyScriptParser.isFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal215=null;
        AtrophyScriptParser.stringList_return stringList216 =null;


        CommonTree string_literal215_tree=null;
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:10: ( 'isFaction:' stringList -> ^( ISFACTION stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:4: 'isFaction:' stringList
            {
            string_literal215=(Token)match(input,154,FOLLOW_154_in_isFaction2167);  
            stream_154.add(string_literal215);


            pushFollow(FOLLOW_stringList_in_isFaction2169);
            stringList216=stringList();

            state._fsp--;

            stream_stringList.add(stringList216.getTree());

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
            // 336:28: -> ^( ISFACTION stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:31: ^( ISFACTION stringList )
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


    public static class isRoom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isRoom"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:339:1: isRoom : 'isRoom:' stringList -> ^( ISROOM stringList ) ;
    public final AtrophyScriptParser.isRoom_return isRoom() throws RecognitionException {
        AtrophyScriptParser.isRoom_return retval = new AtrophyScriptParser.isRoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal217=null;
        AtrophyScriptParser.stringList_return stringList218 =null;


        CommonTree string_literal217_tree=null;
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:339:7: ( 'isRoom:' stringList -> ^( ISROOM stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:4: 'isRoom:' stringList
            {
            string_literal217=(Token)match(input,160,FOLLOW_160_in_isRoom2192);  
            stream_160.add(string_literal217);


            pushFollow(FOLLOW_stringList_in_isRoom2194);
            stringList218=stringList();

            state._fsp--;

            stream_stringList.add(stringList218.getTree());

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
            // 340:25: -> ^( ISROOM stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:28: ^( ISROOM stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ISROOM, "ISROOM")
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
    // $ANTLR end "isRoom"


    public static class hasItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hasItem"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:343:1: hasItem : 'hasItem:' stringList -> ^( HASITEM stringList ) ;
    public final AtrophyScriptParser.hasItem_return hasItem() throws RecognitionException {
        AtrophyScriptParser.hasItem_return retval = new AtrophyScriptParser.hasItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal219=null;
        AtrophyScriptParser.stringList_return stringList220 =null;


        CommonTree string_literal219_tree=null;
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:343:8: ( 'hasItem:' stringList -> ^( HASITEM stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:344:4: 'hasItem:' stringList
            {
            string_literal219=(Token)match(input,149,FOLLOW_149_in_hasItem2217);  
            stream_149.add(string_literal219);


            pushFollow(FOLLOW_stringList_in_hasItem2219);
            stringList220=stringList();

            state._fsp--;

            stream_stringList.add(stringList220.getTree());

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
            // 344:26: -> ^( HASITEM stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:344:29: ^( HASITEM stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:347:1: hasWeapon : 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) ;
    public final AtrophyScriptParser.hasWeapon_return hasWeapon() throws RecognitionException {
        AtrophyScriptParser.hasWeapon_return retval = new AtrophyScriptParser.hasWeapon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal221=null;
        AtrophyScriptParser.stringList_return stringList222 =null;


        CommonTree string_literal221_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:347:10: ( 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:348:4: 'hasWeapon:' stringList
            {
            string_literal221=(Token)match(input,150,FOLLOW_150_in_hasWeapon2242);  
            stream_150.add(string_literal221);


            pushFollow(FOLLOW_stringList_in_hasWeapon2244);
            stringList222=stringList();

            state._fsp--;

            stream_stringList.add(stringList222.getTree());

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
            // 348:28: -> ^( HASWEAPON stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:348:31: ^( HASWEAPON stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:1: stringList : stringLiteral ( ',' stringLiteral )* -> ( ^( STRING stringLiteral ) )* ;
    public final AtrophyScriptParser.stringList_return stringList() throws RecognitionException {
        AtrophyScriptParser.stringList_return retval = new AtrophyScriptParser.stringList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal224=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral223 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral225 =null;


        CommonTree char_literal224_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:11: ( stringLiteral ( ',' stringLiteral )* -> ( ^( STRING stringLiteral ) )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:4: stringLiteral ( ',' stringLiteral )*
            {
            pushFollow(FOLLOW_stringLiteral_in_stringList2267);
            stringLiteral223=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral223.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:18: ( ',' stringLiteral )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==110) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:19: ',' stringLiteral
            	    {
            	    char_literal224=(Token)match(input,110,FOLLOW_110_in_stringList2270);  
            	    stream_110.add(char_literal224);


            	    pushFollow(FOLLOW_stringLiteral_in_stringList2272);
            	    stringLiteral225=stringLiteral();

            	    state._fsp--;

            	    stream_stringLiteral.add(stringLiteral225.getTree());

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
            // 352:39: -> ( ^( STRING stringLiteral ) )*
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:42: ( ^( STRING stringLiteral ) )*
                while ( stream_stringLiteral.hasNext() ) {
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:42: ^( STRING stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:1: isAlive : 'isAlive' -> ^( ISALIVE ) ;
    public final AtrophyScriptParser.isAlive_return isAlive() throws RecognitionException {
        AtrophyScriptParser.isAlive_return retval = new AtrophyScriptParser.isAlive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal226=null;

        CommonTree string_literal226_tree=null;
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:8: ( 'isAlive' -> ^( ISALIVE ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:4: 'isAlive'
            {
            string_literal226=(Token)match(input,151,FOLLOW_151_in_isAlive2296);  
            stream_151.add(string_literal226);


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
            // 356:14: -> ^( ISALIVE )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:17: ^( ISALIVE )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:359:1: isDead : 'isDead' -> ^( ISDEAD ) ;
    public final AtrophyScriptParser.isDead_return isDead() throws RecognitionException {
        AtrophyScriptParser.isDead_return retval = new AtrophyScriptParser.isDead_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal227=null;

        CommonTree string_literal227_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:359:7: ( 'isDead' -> ^( ISDEAD ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:4: 'isDead'
            {
            string_literal227=(Token)match(input,153,FOLLOW_153_in_isDead2317);  
            stream_153.add(string_literal227);


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
            // 360:13: -> ^( ISDEAD )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:16: ^( ISDEAD )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:363:1: isInvestigated : 'isInvestigated' -> ^( ISINVESTIGATED ) ;
    public final AtrophyScriptParser.isInvestigated_return isInvestigated() throws RecognitionException {
        AtrophyScriptParser.isInvestigated_return retval = new AtrophyScriptParser.isInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal228=null;

        CommonTree string_literal228_tree=null;
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:363:15: ( 'isInvestigated' -> ^( ISINVESTIGATED ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:364:4: 'isInvestigated'
            {
            string_literal228=(Token)match(input,155,FOLLOW_155_in_isInvestigated2338);  
            stream_155.add(string_literal228);


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
            // 364:21: -> ^( ISINVESTIGATED )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:364:24: ^( ISINVESTIGATED )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:1: isNotInvestigated : 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) ;
    public final AtrophyScriptParser.isNotInvestigated_return isNotInvestigated() throws RecognitionException {
        AtrophyScriptParser.isNotInvestigated_return retval = new AtrophyScriptParser.isNotInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal229=null;

        CommonTree string_literal229_tree=null;
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:18: ( 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:368:4: 'isNotInvestigated'
            {
            string_literal229=(Token)match(input,158,FOLLOW_158_in_isNotInvestigated2359);  
            stream_158.add(string_literal229);


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
            // 368:24: -> ^( ISNOTINVESTIGATED )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:368:27: ^( ISNOTINVESTIGATED )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:371:1: isDaemon : 'isDaemon' -> ^( ISDAEMON ) ;
    public final AtrophyScriptParser.isDaemon_return isDaemon() throws RecognitionException {
        AtrophyScriptParser.isDaemon_return retval = new AtrophyScriptParser.isDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal230=null;

        CommonTree string_literal230_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:371:9: ( 'isDaemon' -> ^( ISDAEMON ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:372:4: 'isDaemon'
            {
            string_literal230=(Token)match(input,152,FOLLOW_152_in_isDaemon2380);  
            stream_152.add(string_literal230);


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
            // 372:15: -> ^( ISDAEMON )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:372:18: ^( ISDAEMON )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:375:1: isNotDaemon : 'isNotDaemon' -> ^( ISNOTDAEMON ) ;
    public final AtrophyScriptParser.isNotDaemon_return isNotDaemon() throws RecognitionException {
        AtrophyScriptParser.isNotDaemon_return retval = new AtrophyScriptParser.isNotDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal231=null;

        CommonTree string_literal231_tree=null;
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:375:12: ( 'isNotDaemon' -> ^( ISNOTDAEMON ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:4: 'isNotDaemon'
            {
            string_literal231=(Token)match(input,157,FOLLOW_157_in_isNotDaemon2399);  
            stream_157.add(string_literal231);


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
            // 376:18: -> ^( ISNOTDAEMON )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:21: ^( ISNOTDAEMON )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:1: teleDestination : 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) ;
    public final AtrophyScriptParser.teleDestination_return teleDestination() throws RecognitionException {
        AtrophyScriptParser.teleDestination_return retval = new AtrophyScriptParser.teleDestination_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal232=null;
        Token char_literal233=null;
        Token char_literal236=null;
        AtrophyScriptParser.xListProperty_return xListProperty234 =null;

        AtrophyScriptParser.yListProperty_return yListProperty235 =null;


        CommonTree string_literal232_tree=null;
        CommonTree char_literal233_tree=null;
        CommonTree char_literal236_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleSubtreeStream stream_yListProperty=new RewriteRuleSubtreeStream(adaptor,"rule yListProperty");
        RewriteRuleSubtreeStream stream_xListProperty=new RewriteRuleSubtreeStream(adaptor,"rule xListProperty");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:16: ( 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:380:4: 'destination' '{' xListProperty yListProperty '}'
            {
            string_literal232=(Token)match(input,144,FOLLOW_144_in_teleDestination2420);  
            stream_144.add(string_literal232);


            char_literal233=(Token)match(input,215,FOLLOW_215_in_teleDestination2422);  
            stream_215.add(char_literal233);


            pushFollow(FOLLOW_xListProperty_in_teleDestination2424);
            xListProperty234=xListProperty();

            state._fsp--;

            stream_xListProperty.add(xListProperty234.getTree());

            pushFollow(FOLLOW_yListProperty_in_teleDestination2426);
            yListProperty235=yListProperty();

            state._fsp--;

            stream_yListProperty.add(yListProperty235.getTree());

            char_literal236=(Token)match(input,216,FOLLOW_216_in_teleDestination2428);  
            stream_216.add(char_literal236);


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
            // 380:54: -> ^( TELEDEST xListProperty yListProperty )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:380:57: ^( TELEDEST xListProperty yListProperty )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:383:1: maxTeamSize : 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) ;
    public final AtrophyScriptParser.maxTeamSize_return maxTeamSize() throws RecognitionException {
        AtrophyScriptParser.maxTeamSize_return retval = new AtrophyScriptParser.maxTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal237=null;
        Token INT238=null;

        CommonTree string_literal237_tree=null;
        CommonTree INT238_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:383:12: ( 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:384:4: 'maxTeamSize:' INT
            {
            string_literal237=(Token)match(input,168,FOLLOW_168_in_maxTeamSize2453);  
            stream_168.add(string_literal237);


            INT238=(Token)match(input,INT,FOLLOW_INT_in_maxTeamSize2455);  
            stream_INT.add(INT238);


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
            // 384:23: -> ^( MAXTEAMSIZE INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:384:26: ^( MAXTEAMSIZE INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:387:1: minTeamSize : 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) ;
    public final AtrophyScriptParser.minTeamSize_return minTeamSize() throws RecognitionException {
        AtrophyScriptParser.minTeamSize_return retval = new AtrophyScriptParser.minTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal239=null;
        Token INT240=null;

        CommonTree string_literal239_tree=null;
        CommonTree INT240_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:387:12: ( 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:388:4: 'minTeamSize:' INT
            {
            string_literal239=(Token)match(input,170,FOLLOW_170_in_minTeamSize2476);  
            stream_170.add(string_literal239);


            INT240=(Token)match(input,INT,FOLLOW_INT_in_minTeamSize2478);  
            stream_INT.add(INT240);


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
            // 388:23: -> ^( MINTEAMSIZE INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:388:26: ^( MINTEAMSIZE INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:391:1: isPlayer : 'isPlayer' ;
    public final AtrophyScriptParser.isPlayer_return isPlayer() throws RecognitionException {
        AtrophyScriptParser.isPlayer_return retval = new AtrophyScriptParser.isPlayer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal241=null;

        CommonTree string_literal241_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:391:9: ( 'isPlayer' )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:392:4: 'isPlayer'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal241=(Token)match(input,159,FOLLOW_159_in_isPlayer2501); 
            string_literal241_tree = 
            (CommonTree)adaptor.create(string_literal241)
            ;
            adaptor.addChild(root_0, string_literal241_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:395:1: aiNode : 'aiNode' '{' aiNodeOptions '}' -> ^( AINODE aiNodeOptions ) ;
    public final AtrophyScriptParser.aiNode_return aiNode() throws RecognitionException {
        AtrophyScriptParser.aiNode_return retval = new AtrophyScriptParser.aiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal242=null;
        Token char_literal243=null;
        Token char_literal245=null;
        AtrophyScriptParser.aiNodeOptions_return aiNodeOptions244 =null;


        CommonTree string_literal242_tree=null;
        CommonTree char_literal243_tree=null;
        CommonTree char_literal245_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleSubtreeStream stream_aiNodeOptions=new RewriteRuleSubtreeStream(adaptor,"rule aiNodeOptions");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:395:7: ( 'aiNode' '{' aiNodeOptions '}' -> ^( AINODE aiNodeOptions ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:396:4: 'aiNode' '{' aiNodeOptions '}'
            {
            string_literal242=(Token)match(input,135,FOLLOW_135_in_aiNode2516);  
            stream_135.add(string_literal242);


            char_literal243=(Token)match(input,215,FOLLOW_215_in_aiNode2518);  
            stream_215.add(char_literal243);


            pushFollow(FOLLOW_aiNodeOptions_in_aiNode2520);
            aiNodeOptions244=aiNodeOptions();

            state._fsp--;

            stream_aiNodeOptions.add(aiNodeOptions244.getTree());

            char_literal245=(Token)match(input,216,FOLLOW_216_in_aiNode2522);  
            stream_216.add(char_literal245);


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
            // 396:35: -> ^( AINODE aiNodeOptions )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:396:38: ^( AINODE aiNodeOptions )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:399:1: aiNodeOptions : ( subscribeTalkMaps | behaviours | aiNodePriority )* ;
    public final AtrophyScriptParser.aiNodeOptions_return aiNodeOptions() throws RecognitionException {
        AtrophyScriptParser.aiNodeOptions_return retval = new AtrophyScriptParser.aiNodeOptions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps246 =null;

        AtrophyScriptParser.behaviours_return behaviours247 =null;

        AtrophyScriptParser.aiNodePriority_return aiNodePriority248 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:399:14: ( ( subscribeTalkMaps | behaviours | aiNodePriority )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:400:3: ( subscribeTalkMaps | behaviours | aiNodePriority )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:400:3: ( subscribeTalkMaps | behaviours | aiNodePriority )*
            loop40:
            do {
                int alt40=4;
                switch ( input.LA(1) ) {
                case 196:
                    {
                    alt40=1;
                    }
                    break;
                case 136:
                    {
                    alt40=2;
                    }
                    break;
                case 179:
                    {
                    alt40=3;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:400:4: subscribeTalkMaps
            	    {
            	    pushFollow(FOLLOW_subscribeTalkMaps_in_aiNodeOptions2545);
            	    subscribeTalkMaps246=subscribeTalkMaps();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subscribeTalkMaps246.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:401:4: behaviours
            	    {
            	    pushFollow(FOLLOW_behaviours_in_aiNodeOptions2550);
            	    behaviours247=behaviours();

            	    state._fsp--;

            	    adaptor.addChild(root_0, behaviours247.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:402:4: aiNodePriority
            	    {
            	    pushFollow(FOLLOW_aiNodePriority_in_aiNodeOptions2555);
            	    aiNodePriority248=aiNodePriority();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiNodePriority248.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:405:1: subscribeTalkMaps : 'subscribe:' stringList -> ^( SUBSCRIBE stringList ) ;
    public final AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps() throws RecognitionException {
        AtrophyScriptParser.subscribeTalkMaps_return retval = new AtrophyScriptParser.subscribeTalkMaps_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal249=null;
        AtrophyScriptParser.stringList_return stringList250 =null;


        CommonTree string_literal249_tree=null;
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:405:18: ( 'subscribe:' stringList -> ^( SUBSCRIBE stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:406:4: 'subscribe:' stringList
            {
            string_literal249=(Token)match(input,196,FOLLOW_196_in_subscribeTalkMaps2572);  
            stream_196.add(string_literal249);


            pushFollow(FOLLOW_stringList_in_subscribeTalkMaps2573);
            stringList250=stringList();

            state._fsp--;

            stream_stringList.add(stringList250.getTree());

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
            // 406:27: -> ^( SUBSCRIBE stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:406:30: ^( SUBSCRIBE stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:409:1: behaviours : 'behaviours:' stringList -> ^( BEHAVIOUR stringList ) ;
    public final AtrophyScriptParser.behaviours_return behaviours() throws RecognitionException {
        AtrophyScriptParser.behaviours_return retval = new AtrophyScriptParser.behaviours_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal251=null;
        AtrophyScriptParser.stringList_return stringList252 =null;


        CommonTree string_literal251_tree=null;
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:409:11: ( 'behaviours:' stringList -> ^( BEHAVIOUR stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:410:4: 'behaviours:' stringList
            {
            string_literal251=(Token)match(input,136,FOLLOW_136_in_behaviours2596);  
            stream_136.add(string_literal251);


            pushFollow(FOLLOW_stringList_in_behaviours2598);
            stringList252=stringList();

            state._fsp--;

            stream_stringList.add(stringList252.getTree());

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
            // 410:29: -> ^( BEHAVIOUR stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:410:32: ^( BEHAVIOUR stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:413:1: aiNodePriority : 'priority:' stringList -> ^( PRIORITY stringList ) ;
    public final AtrophyScriptParser.aiNodePriority_return aiNodePriority() throws RecognitionException {
        AtrophyScriptParser.aiNodePriority_return retval = new AtrophyScriptParser.aiNodePriority_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal253=null;
        AtrophyScriptParser.stringList_return stringList254 =null;


        CommonTree string_literal253_tree=null;
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:413:15: ( 'priority:' stringList -> ^( PRIORITY stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:414:4: 'priority:' stringList
            {
            string_literal253=(Token)match(input,179,FOLLOW_179_in_aiNodePriority2621);  
            stream_179.add(string_literal253);


            pushFollow(FOLLOW_stringList_in_aiNodePriority2623);
            stringList254=stringList();

            state._fsp--;

            stream_stringList.add(stringList254.getTree());

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
            // 414:27: -> ^( PRIORITY stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:414:30: ^( PRIORITY stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:417:1: unitInfo : ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )* ;
    public final AtrophyScriptParser.unitInfo_return unitInfo() throws RecognitionException {
        AtrophyScriptParser.unitInfo_return retval = new AtrophyScriptParser.unitInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName255 =null;

        AtrophyScriptParser.isFaction_return isFaction256 =null;

        AtrophyScriptParser.isRoom_return isRoom257 =null;

        AtrophyScriptParser.hasItem_return hasItem258 =null;

        AtrophyScriptParser.hasWeapon_return hasWeapon259 =null;

        AtrophyScriptParser.isAlive_return isAlive260 =null;

        AtrophyScriptParser.isDead_return isDead261 =null;

        AtrophyScriptParser.isInvestigated_return isInvestigated262 =null;

        AtrophyScriptParser.isNotInvestigated_return isNotInvestigated263 =null;

        AtrophyScriptParser.isDaemon_return isDaemon264 =null;

        AtrophyScriptParser.isNotDaemon_return isNotDaemon265 =null;

        AtrophyScriptParser.teleDestination_return teleDestination266 =null;

        AtrophyScriptParser.maxTeamSize_return maxTeamSize267 =null;

        AtrophyScriptParser.minTeamSize_return minTeamSize268 =null;

        AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps269 =null;

        AtrophyScriptParser.aiNode_return aiNode270 =null;

        AtrophyScriptParser.isPlayer_return isPlayer271 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:417:9: ( ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:418:4: ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:418:4: ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )*
            loop41:
            do {
                int alt41=18;
                switch ( input.LA(1) ) {
                case 156:
                    {
                    alt41=1;
                    }
                    break;
                case 154:
                    {
                    alt41=2;
                    }
                    break;
                case 160:
                    {
                    alt41=3;
                    }
                    break;
                case 149:
                    {
                    alt41=4;
                    }
                    break;
                case 150:
                    {
                    alt41=5;
                    }
                    break;
                case 151:
                    {
                    alt41=6;
                    }
                    break;
                case 153:
                    {
                    alt41=7;
                    }
                    break;
                case 155:
                    {
                    alt41=8;
                    }
                    break;
                case 158:
                    {
                    alt41=9;
                    }
                    break;
                case 152:
                    {
                    alt41=10;
                    }
                    break;
                case 157:
                    {
                    alt41=11;
                    }
                    break;
                case 144:
                    {
                    alt41=12;
                    }
                    break;
                case 168:
                    {
                    alt41=13;
                    }
                    break;
                case 170:
                    {
                    alt41=14;
                    }
                    break;
                case 196:
                    {
                    alt41=15;
                    }
                    break;
                case 135:
                    {
                    alt41=16;
                    }
                    break;
                case 159:
                    {
                    alt41=17;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:418:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_unitInfo2647);
            	    isName255=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName255.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:419:6: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_unitInfo2654);
            	    isFaction256=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction256.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:420:6: isRoom
            	    {
            	    pushFollow(FOLLOW_isRoom_in_unitInfo2661);
            	    isRoom257=isRoom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isRoom257.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:421:6: hasItem
            	    {
            	    pushFollow(FOLLOW_hasItem_in_unitInfo2668);
            	    hasItem258=hasItem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasItem258.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:422:6: hasWeapon
            	    {
            	    pushFollow(FOLLOW_hasWeapon_in_unitInfo2675);
            	    hasWeapon259=hasWeapon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasWeapon259.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:423:6: isAlive
            	    {
            	    pushFollow(FOLLOW_isAlive_in_unitInfo2682);
            	    isAlive260=isAlive();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isAlive260.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:6: isDead
            	    {
            	    pushFollow(FOLLOW_isDead_in_unitInfo2689);
            	    isDead261=isDead();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDead261.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:425:6: isInvestigated
            	    {
            	    pushFollow(FOLLOW_isInvestigated_in_unitInfo2696);
            	    isInvestigated262=isInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isInvestigated262.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:426:6: isNotInvestigated
            	    {
            	    pushFollow(FOLLOW_isNotInvestigated_in_unitInfo2703);
            	    isNotInvestigated263=isNotInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotInvestigated263.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:427:6: isDaemon
            	    {
            	    pushFollow(FOLLOW_isDaemon_in_unitInfo2710);
            	    isDaemon264=isDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDaemon264.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:428:6: isNotDaemon
            	    {
            	    pushFollow(FOLLOW_isNotDaemon_in_unitInfo2717);
            	    isNotDaemon265=isNotDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotDaemon265.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:429:6: teleDestination
            	    {
            	    pushFollow(FOLLOW_teleDestination_in_unitInfo2724);
            	    teleDestination266=teleDestination();

            	    state._fsp--;

            	    adaptor.addChild(root_0, teleDestination266.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:430:6: maxTeamSize
            	    {
            	    pushFollow(FOLLOW_maxTeamSize_in_unitInfo2731);
            	    maxTeamSize267=maxTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, maxTeamSize267.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:431:6: minTeamSize
            	    {
            	    pushFollow(FOLLOW_minTeamSize_in_unitInfo2738);
            	    minTeamSize268=minTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, minTeamSize268.getTree());

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:432:6: subscribeTalkMaps
            	    {
            	    pushFollow(FOLLOW_subscribeTalkMaps_in_unitInfo2745);
            	    subscribeTalkMaps269=subscribeTalkMaps();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subscribeTalkMaps269.getTree());

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:433:6: aiNode
            	    {
            	    pushFollow(FOLLOW_aiNode_in_unitInfo2752);
            	    aiNode270=aiNode();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiNode270.getTree());

            	    }
            	    break;
            	case 17 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:434:6: isPlayer
            	    {
            	    pushFollow(FOLLOW_isPlayer_in_unitInfo2759);
            	    isPlayer271=isPlayer();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isPlayer271.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:437:1: spawnTeam : 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) ;
    public final AtrophyScriptParser.spawnTeam_return spawnTeam() throws RecognitionException {
        AtrophyScriptParser.spawnTeam_return retval = new AtrophyScriptParser.spawnTeam_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal272=null;
        Token char_literal273=null;
        Token char_literal275=null;
        AtrophyScriptParser.unitInfo_return unitInfo274 =null;


        CommonTree string_literal272_tree=null;
        CommonTree char_literal273_tree=null;
        CommonTree char_literal275_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:437:10: ( 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:438:4: 'spawnTeam' '{' unitInfo '}'
            {
            string_literal272=(Token)match(input,192,FOLLOW_192_in_spawnTeam2778);  
            stream_192.add(string_literal272);


            char_literal273=(Token)match(input,215,FOLLOW_215_in_spawnTeam2780);  
            stream_215.add(char_literal273);


            pushFollow(FOLLOW_unitInfo_in_spawnTeam2782);
            unitInfo274=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo274.getTree());

            char_literal275=(Token)match(input,216,FOLLOW_216_in_spawnTeam2784);  
            stream_216.add(char_literal275);


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
            // 438:33: -> ^( SPAWNTEAM unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:438:36: ^( SPAWNTEAM unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:441:1: spawnCharacter : 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) ;
    public final AtrophyScriptParser.spawnCharacter_return spawnCharacter() throws RecognitionException {
        AtrophyScriptParser.spawnCharacter_return retval = new AtrophyScriptParser.spawnCharacter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal276=null;
        Token char_literal277=null;
        Token char_literal279=null;
        AtrophyScriptParser.unitInfo_return unitInfo278 =null;


        CommonTree string_literal276_tree=null;
        CommonTree char_literal277_tree=null;
        CommonTree char_literal279_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:441:15: ( 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:442:4: 'spawnCharacter' '{' unitInfo '}'
            {
            string_literal276=(Token)match(input,189,FOLLOW_189_in_spawnCharacter2807);  
            stream_189.add(string_literal276);


            char_literal277=(Token)match(input,215,FOLLOW_215_in_spawnCharacter2809);  
            stream_215.add(char_literal277);


            pushFollow(FOLLOW_unitInfo_in_spawnCharacter2811);
            unitInfo278=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo278.getTree());

            char_literal279=(Token)match(input,216,FOLLOW_216_in_spawnCharacter2813);  
            stream_216.add(char_literal279);


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
            // 442:38: -> ^( SPAWNCHARACTER unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:442:41: ^( SPAWNCHARACTER unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:445:1: removeUnit : 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) ;
    public final AtrophyScriptParser.removeUnit_return removeUnit() throws RecognitionException {
        AtrophyScriptParser.removeUnit_return retval = new AtrophyScriptParser.removeUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal280=null;
        Token char_literal281=null;
        Token char_literal283=null;
        AtrophyScriptParser.unitInfo_return unitInfo282 =null;


        CommonTree string_literal280_tree=null;
        CommonTree char_literal281_tree=null;
        CommonTree char_literal283_tree=null;
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:445:11: ( 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:446:4: 'removeUnit' '{' unitInfo '}'
            {
            string_literal280=(Token)match(input,182,FOLLOW_182_in_removeUnit2836);  
            stream_182.add(string_literal280);


            char_literal281=(Token)match(input,215,FOLLOW_215_in_removeUnit2838);  
            stream_215.add(char_literal281);


            pushFollow(FOLLOW_unitInfo_in_removeUnit2840);
            unitInfo282=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo282.getTree());

            char_literal283=(Token)match(input,216,FOLLOW_216_in_removeUnit2842);  
            stream_216.add(char_literal283);


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
            // 446:34: -> ^( REMOVEUNIT unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:446:37: ^( REMOVEUNIT unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:449:1: killUnit : 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) ;
    public final AtrophyScriptParser.killUnit_return killUnit() throws RecognitionException {
        AtrophyScriptParser.killUnit_return retval = new AtrophyScriptParser.killUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal284=null;
        Token char_literal285=null;
        Token char_literal287=null;
        AtrophyScriptParser.unitInfo_return unitInfo286 =null;


        CommonTree string_literal284_tree=null;
        CommonTree char_literal285_tree=null;
        CommonTree char_literal287_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:449:9: ( 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:450:4: 'killUnit' '{' unitInfo '}'
            {
            string_literal284=(Token)match(input,161,FOLLOW_161_in_killUnit2865);  
            stream_161.add(string_literal284);


            char_literal285=(Token)match(input,215,FOLLOW_215_in_killUnit2867);  
            stream_215.add(char_literal285);


            pushFollow(FOLLOW_unitInfo_in_killUnit2869);
            unitInfo286=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo286.getTree());

            char_literal287=(Token)match(input,216,FOLLOW_216_in_killUnit2871);  
            stream_216.add(char_literal287);


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
            // 450:32: -> ^( KILLUNIT unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:450:35: ^( KILLUNIT unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:453:1: teleportUnit : 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) ;
    public final AtrophyScriptParser.teleportUnit_return teleportUnit() throws RecognitionException {
        AtrophyScriptParser.teleportUnit_return retval = new AtrophyScriptParser.teleportUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal288=null;
        Token char_literal289=null;
        Token char_literal291=null;
        AtrophyScriptParser.unitInfo_return unitInfo290 =null;


        CommonTree string_literal288_tree=null;
        CommonTree char_literal289_tree=null;
        CommonTree char_literal291_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:453:13: ( 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:454:4: 'teleport' '{' unitInfo '}'
            {
            string_literal288=(Token)match(input,201,FOLLOW_201_in_teleportUnit2894);  
            stream_201.add(string_literal288);


            char_literal289=(Token)match(input,215,FOLLOW_215_in_teleportUnit2896);  
            stream_215.add(char_literal289);


            pushFollow(FOLLOW_unitInfo_in_teleportUnit2898);
            unitInfo290=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo290.getTree());

            char_literal291=(Token)match(input,216,FOLLOW_216_in_teleportUnit2900);  
            stream_216.add(char_literal291);


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
            // 454:32: -> ^( TELEPORT unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:454:35: ^( TELEPORT unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:457:1: converseUnit : 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) ;
    public final AtrophyScriptParser.converseUnit_return converseUnit() throws RecognitionException {
        AtrophyScriptParser.converseUnit_return retval = new AtrophyScriptParser.converseUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal292=null;
        Token char_literal293=null;
        Token char_literal295=null;
        AtrophyScriptParser.unitInfo_return unitInfo294 =null;


        CommonTree string_literal292_tree=null;
        CommonTree char_literal293_tree=null;
        CommonTree char_literal295_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:457:13: ( 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:458:4: 'converse' '{' unitInfo '}'
            {
            string_literal292=(Token)match(input,142,FOLLOW_142_in_converseUnit2923);  
            stream_142.add(string_literal292);


            char_literal293=(Token)match(input,215,FOLLOW_215_in_converseUnit2925);  
            stream_215.add(char_literal293);


            pushFollow(FOLLOW_unitInfo_in_converseUnit2927);
            unitInfo294=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo294.getTree());

            char_literal295=(Token)match(input,216,FOLLOW_216_in_converseUnit2929);  
            stream_216.add(char_literal295);


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
            // 458:32: -> ^( CONVERSE unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:458:35: ^( CONVERSE unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:461:1: createSaferoom : 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.createSaferoom_return createSaferoom() throws RecognitionException {
        AtrophyScriptParser.createSaferoom_return retval = new AtrophyScriptParser.createSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal296=null;
        Token char_literal297=null;
        Token char_literal299=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo298 =null;


        CommonTree string_literal296_tree=null;
        CommonTree char_literal297_tree=null;
        CommonTree char_literal299_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:461:15: ( 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:462:4: 'saferoom' '{' saferoomInfo '}'
            {
            string_literal296=(Token)match(input,185,FOLLOW_185_in_createSaferoom2952);  
            stream_185.add(string_literal296);


            char_literal297=(Token)match(input,215,FOLLOW_215_in_createSaferoom2954);  
            stream_215.add(char_literal297);


            pushFollow(FOLLOW_saferoomInfo_in_createSaferoom2956);
            saferoomInfo298=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo298.getTree());

            char_literal299=(Token)match(input,216,FOLLOW_216_in_createSaferoom2958);  
            stream_216.add(char_literal299);


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
            // 462:36: -> ^( SAFEROOM saferoomInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:462:39: ^( SAFEROOM saferoomInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:465:1: removeSaferoom : 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.removeSaferoom_return removeSaferoom() throws RecognitionException {
        AtrophyScriptParser.removeSaferoom_return retval = new AtrophyScriptParser.removeSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal300=null;
        Token char_literal301=null;
        Token char_literal303=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo302 =null;


        CommonTree string_literal300_tree=null;
        CommonTree char_literal301_tree=null;
        CommonTree char_literal303_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:465:15: ( 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:466:4: 'removeSaferoom' '{' saferoomInfo '}'
            {
            string_literal300=(Token)match(input,180,FOLLOW_180_in_removeSaferoom2981);  
            stream_180.add(string_literal300);


            char_literal301=(Token)match(input,215,FOLLOW_215_in_removeSaferoom2983);  
            stream_215.add(char_literal301);


            pushFollow(FOLLOW_saferoomInfo_in_removeSaferoom2985);
            saferoomInfo302=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo302.getTree());

            char_literal303=(Token)match(input,216,FOLLOW_216_in_removeSaferoom2987);  
            stream_216.add(char_literal303);


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
            // 466:42: -> ^( REMOVESAFEROOM saferoomInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:466:45: ^( REMOVESAFEROOM saferoomInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:469:1: containsFaction : 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) ;
    public final AtrophyScriptParser.containsFaction_return containsFaction() throws RecognitionException {
        AtrophyScriptParser.containsFaction_return retval = new AtrophyScriptParser.containsFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal304=null;
        AtrophyScriptParser.stringList_return stringList305 =null;


        CommonTree string_literal304_tree=null;
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:469:16: ( 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:470:4: 'containsFaction:' stringList
            {
            string_literal304=(Token)match(input,141,FOLLOW_141_in_containsFaction3010);  
            stream_141.add(string_literal304);


            pushFollow(FOLLOW_stringList_in_containsFaction3012);
            stringList305=stringList();

            state._fsp--;

            stream_stringList.add(stringList305.getTree());

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
            // 470:34: -> ^( CONTAINSFACTION stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:470:37: ^( CONTAINSFACTION stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:473:1: saferoomInfo : ( containsFaction | isName )* ;
    public final AtrophyScriptParser.saferoomInfo_return saferoomInfo() throws RecognitionException {
        AtrophyScriptParser.saferoomInfo_return retval = new AtrophyScriptParser.saferoomInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.containsFaction_return containsFaction306 =null;

        AtrophyScriptParser.isName_return isName307 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:473:13: ( ( containsFaction | isName )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:474:4: ( containsFaction | isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:474:4: ( containsFaction | isName )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==141) ) {
                    alt42=1;
                }
                else if ( (LA42_0==156) ) {
                    alt42=2;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:474:5: containsFaction
            	    {
            	    pushFollow(FOLLOW_containsFaction_in_saferoomInfo3036);
            	    containsFaction306=containsFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, containsFaction306.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:475:6: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_saferoomInfo3043);
            	    isName307=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName307.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:478:1: mapInfo : ( isName | isFaction | itemSpawnChance )* ;
    public final AtrophyScriptParser.mapInfo_return mapInfo() throws RecognitionException {
        AtrophyScriptParser.mapInfo_return retval = new AtrophyScriptParser.mapInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName308 =null;

        AtrophyScriptParser.isFaction_return isFaction309 =null;

        AtrophyScriptParser.itemSpawnChance_return itemSpawnChance310 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:478:8: ( ( isName | isFaction | itemSpawnChance )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:479:4: ( isName | isFaction | itemSpawnChance )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:479:4: ( isName | isFaction | itemSpawnChance )*
            loop43:
            do {
                int alt43=4;
                switch ( input.LA(1) ) {
                case 156:
                    {
                    alt43=1;
                    }
                    break;
                case 154:
                    {
                    alt43=2;
                    }
                    break;
                case 146:
                case 169:
                case 186:
                case 211:
                    {
                    alt43=3;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:479:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_mapInfo3061);
            	    isName308=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName308.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:479:14: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_mapInfo3065);
            	    isFaction309=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction309.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:479:26: itemSpawnChance
            	    {
            	    pushFollow(FOLLOW_itemSpawnChance_in_mapInfo3069);
            	    itemSpawnChance310=itemSpawnChance();

            	    state._fsp--;

            	    adaptor.addChild(root_0, itemSpawnChance310.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:482:1: itemSpawnChance : ( 'engChance:' INT -> ^( ENG INT ) | 'medChance:' INT -> ^( MED INT ) | 'wepChance:' INT -> ^( WEP INT ) | 'sciChance' INT -> ^( SCI INT ) );
    public final AtrophyScriptParser.itemSpawnChance_return itemSpawnChance() throws RecognitionException {
        AtrophyScriptParser.itemSpawnChance_return retval = new AtrophyScriptParser.itemSpawnChance_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal311=null;
        Token INT312=null;
        Token string_literal313=null;
        Token INT314=null;
        Token string_literal315=null;
        Token INT316=null;
        Token string_literal317=null;
        Token INT318=null;

        CommonTree string_literal311_tree=null;
        CommonTree INT312_tree=null;
        CommonTree string_literal313_tree=null;
        CommonTree INT314_tree=null;
        CommonTree string_literal315_tree=null;
        CommonTree INT316_tree=null;
        CommonTree string_literal317_tree=null;
        CommonTree INT318_tree=null;
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:482:16: ( 'engChance:' INT -> ^( ENG INT ) | 'medChance:' INT -> ^( MED INT ) | 'wepChance:' INT -> ^( WEP INT ) | 'sciChance' INT -> ^( SCI INT ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 146:
                {
                alt44=1;
                }
                break;
            case 169:
                {
                alt44=2;
                }
                break;
            case 211:
                {
                alt44=3;
                }
                break;
            case 186:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:483:4: 'engChance:' INT
                    {
                    string_literal311=(Token)match(input,146,FOLLOW_146_in_itemSpawnChance3086);  
                    stream_146.add(string_literal311);


                    INT312=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3088);  
                    stream_INT.add(INT312);


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
                    // 483:21: -> ^( ENG INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:483:24: ^( ENG INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:484:6: 'medChance:' INT
                    {
                    string_literal313=(Token)match(input,169,FOLLOW_169_in_itemSpawnChance3103);  
                    stream_169.add(string_literal313);


                    INT314=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3105);  
                    stream_INT.add(INT314);


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
                    // 484:23: -> ^( MED INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:484:26: ^( MED INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:485:6: 'wepChance:' INT
                    {
                    string_literal315=(Token)match(input,211,FOLLOW_211_in_itemSpawnChance3120);  
                    stream_211.add(string_literal315);


                    INT316=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3122);  
                    stream_INT.add(INT316);


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
                    // 485:23: -> ^( WEP INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:485:26: ^( WEP INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:486:6: 'sciChance' INT
                    {
                    string_literal317=(Token)match(input,186,FOLLOW_186_in_itemSpawnChance3137);  
                    stream_186.add(string_literal317);


                    INT318=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3139);  
                    stream_INT.add(INT318);


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
                    // 486:22: -> ^( SCI INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:486:25: ^( SCI INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:489:1: loadMap : 'loadMap' '{' mapInfo '}' -> ^( LOADMAP mapInfo ) ;
    public final AtrophyScriptParser.loadMap_return loadMap() throws RecognitionException {
        AtrophyScriptParser.loadMap_return retval = new AtrophyScriptParser.loadMap_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal319=null;
        Token char_literal320=null;
        Token char_literal322=null;
        AtrophyScriptParser.mapInfo_return mapInfo321 =null;


        CommonTree string_literal319_tree=null;
        CommonTree char_literal320_tree=null;
        CommonTree char_literal322_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleSubtreeStream stream_mapInfo=new RewriteRuleSubtreeStream(adaptor,"rule mapInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:489:8: ( 'loadMap' '{' mapInfo '}' -> ^( LOADMAP mapInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:490:4: 'loadMap' '{' mapInfo '}'
            {
            string_literal319=(Token)match(input,164,FOLLOW_164_in_loadMap3162);  
            stream_164.add(string_literal319);


            char_literal320=(Token)match(input,215,FOLLOW_215_in_loadMap3164);  
            stream_215.add(char_literal320);


            pushFollow(FOLLOW_mapInfo_in_loadMap3166);
            mapInfo321=mapInfo();

            state._fsp--;

            stream_mapInfo.add(mapInfo321.getTree());

            char_literal322=(Token)match(input,216,FOLLOW_216_in_loadMap3168);  
            stream_216.add(char_literal322);


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
            // 490:30: -> ^( LOADMAP mapInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:490:33: ^( LOADMAP mapInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:493:1: lockDoor : 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.lockDoor_return lockDoor() throws RecognitionException {
        AtrophyScriptParser.lockDoor_return retval = new AtrophyScriptParser.lockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal323=null;
        Token char_literal324=null;
        Token char_literal326=null;
        AtrophyScriptParser.doorInfo_return doorInfo325 =null;


        CommonTree string_literal323_tree=null;
        CommonTree char_literal324_tree=null;
        CommonTree char_literal326_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:493:9: ( 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:4: 'lockDoor' '{' doorInfo '}'
            {
            string_literal323=(Token)match(input,165,FOLLOW_165_in_lockDoor3191);  
            stream_165.add(string_literal323);


            char_literal324=(Token)match(input,215,FOLLOW_215_in_lockDoor3193);  
            stream_215.add(char_literal324);


            pushFollow(FOLLOW_doorInfo_in_lockDoor3195);
            doorInfo325=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo325.getTree());

            char_literal326=(Token)match(input,216,FOLLOW_216_in_lockDoor3197);  
            stream_216.add(char_literal326);


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
            // 494:32: -> ^( LOCKDOOR doorInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:35: ^( LOCKDOOR doorInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:497:1: unlockDoor : 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.unlockDoor_return unlockDoor() throws RecognitionException {
        AtrophyScriptParser.unlockDoor_return retval = new AtrophyScriptParser.unlockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal327=null;
        Token char_literal328=null;
        Token char_literal330=null;
        AtrophyScriptParser.doorInfo_return doorInfo329 =null;


        CommonTree string_literal327_tree=null;
        CommonTree char_literal328_tree=null;
        CommonTree char_literal330_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_209=new RewriteRuleTokenStream(adaptor,"token 209");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:497:11: ( 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:498:4: 'unlockDoor' '{' doorInfo '}'
            {
            string_literal327=(Token)match(input,209,FOLLOW_209_in_unlockDoor3220);  
            stream_209.add(string_literal327);


            char_literal328=(Token)match(input,215,FOLLOW_215_in_unlockDoor3222);  
            stream_215.add(char_literal328);


            pushFollow(FOLLOW_doorInfo_in_unlockDoor3224);
            doorInfo329=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo329.getTree());

            char_literal330=(Token)match(input,216,FOLLOW_216_in_unlockDoor3226);  
            stream_216.add(char_literal330);


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
            // 498:34: -> ^( UNLOCKDOOR doorInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:498:37: ^( UNLOCKDOOR doorInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:501:1: doorInfo : ( isName )* ;
    public final AtrophyScriptParser.doorInfo_return doorInfo() throws RecognitionException {
        AtrophyScriptParser.doorInfo_return retval = new AtrophyScriptParser.doorInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName331 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:501:9: ( ( isName )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:502:4: ( isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:502:4: ( isName )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==156) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:502:4: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_doorInfo3249);
            	    isName331=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName331.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:505:1: addTag : ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) );
    public final AtrophyScriptParser.addTag_return addTag() throws RecognitionException {
        AtrophyScriptParser.addTag_return retval = new AtrophyScriptParser.addTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal332=null;
        Token ADD_TAG_PREFIX334=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral333 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral335 =null;


        CommonTree string_literal332_tree=null;
        CommonTree ADD_TAG_PREFIX334_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_ADD_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token ADD_TAG_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:505:7: ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==133) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:506:4: 'addTag:' stringLiteral
                    {
                    string_literal332=(Token)match(input,133,FOLLOW_133_in_addTag3265);  
                    stream_133.add(string_literal332);


                    pushFollow(FOLLOW_stringLiteral_in_addTag3267);
                    stringLiteral333=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral333.getTree());

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
                    // 506:28: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:506:31: ^( ADDTAG stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:507:6: ADD_TAG_PREFIX stringLiteral
                    {
                    ADD_TAG_PREFIX334=(Token)match(input,ADD_TAG_PREFIX,FOLLOW_ADD_TAG_PREFIX_in_addTag3282);  
                    stream_ADD_TAG_PREFIX.add(ADD_TAG_PREFIX334);


                    pushFollow(FOLLOW_stringLiteral_in_addTag3284);
                    stringLiteral335=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral335.getTree());

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
                    // 507:35: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:507:38: ^( ADDTAG stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:510:1: removeTag : ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) );
    public final AtrophyScriptParser.removeTag_return removeTag() throws RecognitionException {
        AtrophyScriptParser.removeTag_return retval = new AtrophyScriptParser.removeTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal336=null;
        Token REMOVE_TAG_PREFIX338=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral337 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral339 =null;


        CommonTree string_literal336_tree=null;
        CommonTree REMOVE_TAG_PREFIX338_tree=null;
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_REMOVE_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token REMOVE_TAG_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:510:10: ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==181) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:511:4: 'removeTag:' stringLiteral
                    {
                    string_literal336=(Token)match(input,181,FOLLOW_181_in_removeTag3307);  
                    stream_181.add(string_literal336);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag3309);
                    stringLiteral337=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral337.getTree());

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
                    // 511:31: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:511:34: ^( REMOVETAG stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:512:6: REMOVE_TAG_PREFIX stringLiteral
                    {
                    REMOVE_TAG_PREFIX338=(Token)match(input,REMOVE_TAG_PREFIX,FOLLOW_REMOVE_TAG_PREFIX_in_removeTag3324);  
                    stream_REMOVE_TAG_PREFIX.add(REMOVE_TAG_PREFIX338);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag3326);
                    stringLiteral339=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral339.getTree());

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
                    // 512:38: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:512:41: ^( REMOVETAG stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:515:1: directorBias : 'directorBias:' -> ^( DIRECTORBIAS ) ;
    public final AtrophyScriptParser.directorBias_return directorBias() throws RecognitionException {
        AtrophyScriptParser.directorBias_return retval = new AtrophyScriptParser.directorBias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal340=null;

        CommonTree string_literal340_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:515:13: ( 'directorBias:' -> ^( DIRECTORBIAS ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:516:4: 'directorBias:'
            {
            string_literal340=(Token)match(input,145,FOLLOW_145_in_directorBias3349);  
            stream_145.add(string_literal340);


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
            // 516:20: -> ^( DIRECTORBIAS )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:516:23: ^( DIRECTORBIAS )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:519:1: changeAiNode : 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}' -> ^( CHANGEAINODE unitInfo aiNodeOptions ) ;
    public final AtrophyScriptParser.changeAiNode_return changeAiNode() throws RecognitionException {
        AtrophyScriptParser.changeAiNode_return retval = new AtrophyScriptParser.changeAiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal341=null;
        Token char_literal342=null;
        Token char_literal343=null;
        Token char_literal345=null;
        Token char_literal346=null;
        Token char_literal348=null;
        Token char_literal349=null;
        AtrophyScriptParser.unitInfo_return unitInfo344 =null;

        AtrophyScriptParser.aiNodeOptions_return aiNodeOptions347 =null;


        CommonTree string_literal341_tree=null;
        CommonTree char_literal342_tree=null;
        CommonTree char_literal343_tree=null;
        CommonTree char_literal345_tree=null;
        CommonTree char_literal346_tree=null;
        CommonTree char_literal348_tree=null;
        CommonTree char_literal349_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleSubtreeStream stream_aiNodeOptions=new RewriteRuleSubtreeStream(adaptor,"rule aiNodeOptions");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:519:13: ( 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}' -> ^( CHANGEAINODE unitInfo aiNodeOptions ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:520:4: 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}'
            {
            string_literal341=(Token)match(input,139,FOLLOW_139_in_changeAiNode3370);  
            stream_139.add(string_literal341);


            char_literal342=(Token)match(input,215,FOLLOW_215_in_changeAiNode3372);  
            stream_215.add(char_literal342);


            char_literal343=(Token)match(input,215,FOLLOW_215_in_changeAiNode3374);  
            stream_215.add(char_literal343);


            pushFollow(FOLLOW_unitInfo_in_changeAiNode3376);
            unitInfo344=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo344.getTree());

            char_literal345=(Token)match(input,216,FOLLOW_216_in_changeAiNode3378);  
            stream_216.add(char_literal345);


            char_literal346=(Token)match(input,215,FOLLOW_215_in_changeAiNode3380);  
            stream_215.add(char_literal346);


            pushFollow(FOLLOW_aiNodeOptions_in_changeAiNode3382);
            aiNodeOptions347=aiNodeOptions();

            state._fsp--;

            stream_aiNodeOptions.add(aiNodeOptions347.getTree());

            char_literal348=(Token)match(input,216,FOLLOW_216_in_changeAiNode3384);  
            stream_216.add(char_literal348);


            char_literal349=(Token)match(input,216,FOLLOW_216_in_changeAiNode3386);  
            stream_216.add(char_literal349);


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
            // 520:66: -> ^( CHANGEAINODE unitInfo aiNodeOptions )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:520:69: ^( CHANGEAINODE unitInfo aiNodeOptions )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:523:1: showMessage : 'showMessage:' stringLiteral -> ^( SHOWMESSAGE stringLiteral ) ;
    public final AtrophyScriptParser.showMessage_return showMessage() throws RecognitionException {
        AtrophyScriptParser.showMessage_return retval = new AtrophyScriptParser.showMessage_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal350=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral351 =null;


        CommonTree string_literal350_tree=null;
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:523:12: ( 'showMessage:' stringLiteral -> ^( SHOWMESSAGE stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:524:4: 'showMessage:' stringLiteral
            {
            string_literal350=(Token)match(input,188,FOLLOW_188_in_showMessage3411);  
            stream_188.add(string_literal350);


            pushFollow(FOLLOW_stringLiteral_in_showMessage3413);
            stringLiteral351=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral351.getTree());

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
            // 524:33: -> ^( SHOWMESSAGE stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:524:36: ^( SHOWMESSAGE stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:527:1: setTriggerRunning : 'setTriggerRunning:' stringLiteral BOOL -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL ) ;
    public final AtrophyScriptParser.setTriggerRunning_return setTriggerRunning() throws RecognitionException {
        AtrophyScriptParser.setTriggerRunning_return retval = new AtrophyScriptParser.setTriggerRunning_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal352=null;
        Token BOOL354=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral353 =null;


        CommonTree string_literal352_tree=null;
        CommonTree BOOL354_tree=null;
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:527:18: ( 'setTriggerRunning:' stringLiteral BOOL -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:528:4: 'setTriggerRunning:' stringLiteral BOOL
            {
            string_literal352=(Token)match(input,187,FOLLOW_187_in_setTriggerRunning3436);  
            stream_187.add(string_literal352);


            pushFollow(FOLLOW_stringLiteral_in_setTriggerRunning3438);
            stringLiteral353=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral353.getTree());

            BOOL354=(Token)match(input,BOOL,FOLLOW_BOOL_in_setTriggerRunning3440);  
            stream_BOOL.add(BOOL354);


            // AST REWRITE
            // elements: BOOL, stringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 528:44: -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:528:47: ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SETTRIGGERRUNNING, "SETTRIGGERRUNNING")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:528:67: ^( STRING stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:531:1: spawnItem : 'spawnItem' stringList '{' unitInfo '}' -> ^( SPAWNITEM stringList unitInfo ) ;
    public final AtrophyScriptParser.spawnItem_return spawnItem() throws RecognitionException {
        AtrophyScriptParser.spawnItem_return retval = new AtrophyScriptParser.spawnItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal355=null;
        Token char_literal357=null;
        Token char_literal359=null;
        AtrophyScriptParser.stringList_return stringList356 =null;

        AtrophyScriptParser.unitInfo_return unitInfo358 =null;


        CommonTree string_literal355_tree=null;
        CommonTree char_literal357_tree=null;
        CommonTree char_literal359_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:531:10: ( 'spawnItem' stringList '{' unitInfo '}' -> ^( SPAWNITEM stringList unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:532:4: 'spawnItem' stringList '{' unitInfo '}'
            {
            string_literal355=(Token)match(input,190,FOLLOW_190_in_spawnItem3469);  
            stream_190.add(string_literal355);


            pushFollow(FOLLOW_stringList_in_spawnItem3471);
            stringList356=stringList();

            state._fsp--;

            stream_stringList.add(stringList356.getTree());

            char_literal357=(Token)match(input,215,FOLLOW_215_in_spawnItem3473);  
            stream_215.add(char_literal357);


            pushFollow(FOLLOW_unitInfo_in_spawnItem3475);
            unitInfo358=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo358.getTree());

            char_literal359=(Token)match(input,216,FOLLOW_216_in_spawnItem3477);  
            stream_216.add(char_literal359);


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
            // 532:44: -> ^( SPAWNITEM stringList unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:532:47: ^( SPAWNITEM stringList unitInfo )
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


    public static class spawnTalkNode_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spawnTalkNode"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:535:1: spawnTalkNode : 'spawnTalkNode' '{' unitInfo '}' -> ^( SPAWNTALKNODE unitInfo ) ;
    public final AtrophyScriptParser.spawnTalkNode_return spawnTalkNode() throws RecognitionException {
        AtrophyScriptParser.spawnTalkNode_return retval = new AtrophyScriptParser.spawnTalkNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal360=null;
        Token char_literal361=null;
        Token char_literal363=null;
        AtrophyScriptParser.unitInfo_return unitInfo362 =null;


        CommonTree string_literal360_tree=null;
        CommonTree char_literal361_tree=null;
        CommonTree char_literal363_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:535:14: ( 'spawnTalkNode' '{' unitInfo '}' -> ^( SPAWNTALKNODE unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:536:4: 'spawnTalkNode' '{' unitInfo '}'
            {
            string_literal360=(Token)match(input,191,FOLLOW_191_in_spawnTalkNode3502);  
            stream_191.add(string_literal360);


            char_literal361=(Token)match(input,215,FOLLOW_215_in_spawnTalkNode3504);  
            stream_215.add(char_literal361);


            pushFollow(FOLLOW_unitInfo_in_spawnTalkNode3506);
            unitInfo362=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo362.getTree());

            char_literal363=(Token)match(input,216,FOLLOW_216_in_spawnTalkNode3508);  
            stream_216.add(char_literal363);


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
            // 536:37: -> ^( SPAWNTALKNODE unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:536:40: ^( SPAWNTALKNODE unitInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SPAWNTALKNODE, "SPAWNTALKNODE")
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
    // $ANTLR end "spawnTalkNode"


    public static class sequenceDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sequenceDecl"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:539:1: sequenceDecl : 'SEQUENCE::' stringLiteral '{' ( ( commandConditional )? commandCallList )* '}' -> ^( SEQUENCE stringLiteral commandCallList ) ;
    public final AtrophyScriptParser.sequenceDecl_return sequenceDecl() throws RecognitionException {
        AtrophyScriptParser.sequenceDecl_return retval = new AtrophyScriptParser.sequenceDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal364=null;
        Token char_literal366=null;
        Token char_literal369=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral365 =null;

        AtrophyScriptParser.commandConditional_return commandConditional367 =null;

        AtrophyScriptParser.commandCallList_return commandCallList368 =null;


        CommonTree string_literal364_tree=null;
        CommonTree char_literal366_tree=null;
        CommonTree char_literal369_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleSubtreeStream stream_commandConditional=new RewriteRuleSubtreeStream(adaptor,"rule commandConditional");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_commandCallList=new RewriteRuleSubtreeStream(adaptor,"rule commandCallList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:539:13: ( 'SEQUENCE::' stringLiteral '{' ( ( commandConditional )? commandCallList )* '}' -> ^( SEQUENCE stringLiteral commandCallList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:540:4: 'SEQUENCE::' stringLiteral '{' ( ( commandConditional )? commandCallList )* '}'
            {
            string_literal364=(Token)match(input,127,FOLLOW_127_in_sequenceDecl3531);  
            stream_127.add(string_literal364);


            pushFollow(FOLLOW_stringLiteral_in_sequenceDecl3533);
            stringLiteral365=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral365.getTree());

            char_literal366=(Token)match(input,215,FOLLOW_215_in_sequenceDecl3535);  
            stream_215.add(char_literal366);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:541:4: ( ( commandConditional )? commandCallList )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMAND_CALL_PREFIX||(LA49_0 >= 118 && LA49_0 <= 119)||LA49_0==138) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:541:5: ( commandConditional )? commandCallList
            	    {
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:541:5: ( commandConditional )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==118) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:541:5: commandConditional
            	            {
            	            pushFollow(FOLLOW_commandConditional_in_sequenceDecl3541);
            	            commandConditional367=commandConditional();

            	            state._fsp--;

            	            stream_commandConditional.add(commandConditional367.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_commandCallList_in_sequenceDecl3544);
            	    commandCallList368=commandCallList();

            	    state._fsp--;

            	    stream_commandCallList.add(commandCallList368.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            char_literal369=(Token)match(input,216,FOLLOW_216_in_sequenceDecl3551);  
            stream_216.add(char_literal369);


            // AST REWRITE
            // elements: stringLiteral, commandCallList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 543:4: -> ^( SEQUENCE stringLiteral commandCallList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:544:4: ^( SEQUENCE stringLiteral commandCallList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SEQUENCE, "SEQUENCE")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

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
    // $ANTLR end "sequenceDecl"


    public static class commandConditional_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commandConditional"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:547:1: commandConditional : ( 'IF' 'HAS' stringList | 'IF' '!HAS' stringList );
    public final AtrophyScriptParser.commandConditional_return commandConditional() throws RecognitionException {
        AtrophyScriptParser.commandConditional_return retval = new AtrophyScriptParser.commandConditional_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal370=null;
        Token string_literal371=null;
        Token string_literal373=null;
        Token string_literal374=null;
        AtrophyScriptParser.stringList_return stringList372 =null;

        AtrophyScriptParser.stringList_return stringList375 =null;


        CommonTree string_literal370_tree=null;
        CommonTree string_literal371_tree=null;
        CommonTree string_literal373_tree=null;
        CommonTree string_literal374_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:547:19: ( 'IF' 'HAS' stringList | 'IF' '!HAS' stringList )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==118) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==117) ) {
                    alt50=1;
                }
                else if ( (LA50_1==105) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:548:3: 'IF' 'HAS' stringList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal370=(Token)match(input,118,FOLLOW_118_in_commandConditional3581); 
                    string_literal370_tree = 
                    (CommonTree)adaptor.create(string_literal370)
                    ;
                    adaptor.addChild(root_0, string_literal370_tree);


                    string_literal371=(Token)match(input,117,FOLLOW_117_in_commandConditional3582); 
                    string_literal371_tree = 
                    (CommonTree)adaptor.create(string_literal371)
                    ;
                    adaptor.addChild(root_0, string_literal371_tree);


                    pushFollow(FOLLOW_stringList_in_commandConditional3584);
                    stringList372=stringList();

                    state._fsp--;

                    adaptor.addChild(root_0, stringList372.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:549:5: 'IF' '!HAS' stringList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal373=(Token)match(input,118,FOLLOW_118_in_commandConditional3590); 
                    string_literal373_tree = 
                    (CommonTree)adaptor.create(string_literal373)
                    ;
                    adaptor.addChild(root_0, string_literal373_tree);


                    string_literal374=(Token)match(input,105,FOLLOW_105_in_commandConditional3591); 
                    string_literal374_tree = 
                    (CommonTree)adaptor.create(string_literal374)
                    ;
                    adaptor.addChild(root_0, string_literal374_tree);


                    pushFollow(FOLLOW_stringList_in_commandConditional3593);
                    stringList375=stringList();

                    state._fsp--;

                    adaptor.addChild(root_0, stringList375.getTree());

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
    // $ANTLR end "commandConditional"


    public static class commandCallList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commandCallList"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:552:1: commandCallList : commandCall ( ',' ! commandCall )* ;
    public final AtrophyScriptParser.commandCallList_return commandCallList() throws RecognitionException {
        AtrophyScriptParser.commandCallList_return retval = new AtrophyScriptParser.commandCallList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal377=null;
        AtrophyScriptParser.commandCall_return commandCall376 =null;

        AtrophyScriptParser.commandCall_return commandCall378 =null;


        CommonTree char_literal377_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:552:16: ( commandCall ( ',' ! commandCall )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:553:4: commandCall ( ',' ! commandCall )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_commandCall_in_commandCallList3606);
            commandCall376=commandCall();

            state._fsp--;

            adaptor.addChild(root_0, commandCall376.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:553:16: ( ',' ! commandCall )*
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:553:17: ',' ! commandCall
            	    {
            	    char_literal377=(Token)match(input,110,FOLLOW_110_in_commandCallList3609); 

            	    pushFollow(FOLLOW_commandCall_in_commandCallList3612);
            	    commandCall378=commandCall();

            	    state._fsp--;

            	    adaptor.addChild(root_0, commandCall378.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:556:1: commandCall : ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) | atCall );
    public final AtrophyScriptParser.commandCall_return commandCall() throws RecognitionException {
        AtrophyScriptParser.commandCall_return retval = new AtrophyScriptParser.commandCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal379=null;
        Token COMMAND_CALL_PREFIX381=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral380 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral382 =null;

        AtrophyScriptParser.atCall_return atCall383 =null;


        CommonTree string_literal379_tree=null;
        CommonTree COMMAND_CALL_PREFIX381_tree=null;
        RewriteRuleTokenStream stream_COMMAND_CALL_PREFIX=new RewriteRuleTokenStream(adaptor,"token COMMAND_CALL_PREFIX");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:556:12: ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) | atCall )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt52=1;
                }
                break;
            case COMMAND_CALL_PREFIX:
                {
                alt52=2;
                }
                break;
            case 119:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:557:4: 'callCommand:' stringLiteral
                    {
                    string_literal379=(Token)match(input,138,FOLLOW_138_in_commandCall3629);  
                    stream_138.add(string_literal379);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall3631);
                    stringLiteral380=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral380.getTree());

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
                    // 557:33: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:557:36: ^( COMMAND_CALL stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:558:6: COMMAND_CALL_PREFIX stringLiteral
                    {
                    COMMAND_CALL_PREFIX381=(Token)match(input,COMMAND_CALL_PREFIX,FOLLOW_COMMAND_CALL_PREFIX_in_commandCall3646);  
                    stream_COMMAND_CALL_PREFIX.add(COMMAND_CALL_PREFIX381);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall3648);
                    stringLiteral382=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral382.getTree());

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
                    // 558:40: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:558:43: ^( COMMAND_CALL stringLiteral )
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
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:559:6: atCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atCall_in_commandCall3663);
                    atCall383=atCall();

                    state._fsp--;

                    adaptor.addChild(root_0, atCall383.getTree());

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


    public static class atCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atCall"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:562:1: atCall : ( 'LOAD' 'MODULE' stringList '@' s2= stringLiteral -> ^( ATCALL_MODULE stringList $s2) | 'LOAD' 'SEQUENCE' stringList '@' s2= stringLiteral -> ^( ATCALL_SEQUENCE stringList $s2) );
    public final AtrophyScriptParser.atCall_return atCall() throws RecognitionException {
        AtrophyScriptParser.atCall_return retval = new AtrophyScriptParser.atCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal384=null;
        Token string_literal385=null;
        Token char_literal387=null;
        Token string_literal388=null;
        Token string_literal389=null;
        Token char_literal391=null;
        AtrophyScriptParser.stringLiteral_return s2 =null;

        AtrophyScriptParser.stringList_return stringList386 =null;

        AtrophyScriptParser.stringList_return stringList390 =null;


        CommonTree string_literal384_tree=null;
        CommonTree string_literal385_tree=null;
        CommonTree char_literal387_tree=null;
        CommonTree string_literal388_tree=null;
        CommonTree string_literal389_tree=null;
        CommonTree char_literal391_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:562:7: ( 'LOAD' 'MODULE' stringList '@' s2= stringLiteral -> ^( ATCALL_MODULE stringList $s2) | 'LOAD' 'SEQUENCE' stringList '@' s2= stringLiteral -> ^( ATCALL_SEQUENCE stringList $s2) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==119) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==122) ) {
                    alt53=1;
                }
                else if ( (LA53_1==126) ) {
                    alt53=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:563:4: 'LOAD' 'MODULE' stringList '@' s2= stringLiteral
                    {
                    string_literal384=(Token)match(input,119,FOLLOW_119_in_atCall3678);  
                    stream_119.add(string_literal384);


                    string_literal385=(Token)match(input,122,FOLLOW_122_in_atCall3680);  
                    stream_122.add(string_literal385);


                    pushFollow(FOLLOW_stringList_in_atCall3682);
                    stringList386=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList386.getTree());

                    char_literal387=(Token)match(input,112,FOLLOW_112_in_atCall3684);  
                    stream_112.add(char_literal387);


                    pushFollow(FOLLOW_stringLiteral_in_atCall3688);
                    s2=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(s2.getTree());

                    // AST REWRITE
                    // elements: s2, stringList
                    // token labels: 
                    // rule labels: retval, s2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 563:52: -> ^( ATCALL_MODULE stringList $s2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:563:55: ^( ATCALL_MODULE stringList $s2)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ATCALL_MODULE, "ATCALL_MODULE")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringList.nextTree());

                        adaptor.addChild(root_1, stream_s2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:564:6: 'LOAD' 'SEQUENCE' stringList '@' s2= stringLiteral
                    {
                    string_literal388=(Token)match(input,119,FOLLOW_119_in_atCall3706);  
                    stream_119.add(string_literal388);


                    string_literal389=(Token)match(input,126,FOLLOW_126_in_atCall3708);  
                    stream_126.add(string_literal389);


                    pushFollow(FOLLOW_stringList_in_atCall3710);
                    stringList390=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList390.getTree());

                    char_literal391=(Token)match(input,112,FOLLOW_112_in_atCall3712);  
                    stream_112.add(char_literal391);


                    pushFollow(FOLLOW_stringLiteral_in_atCall3716);
                    s2=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(s2.getTree());

                    // AST REWRITE
                    // elements: s2, stringList
                    // token labels: 
                    // rule labels: retval, s2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 564:56: -> ^( ATCALL_SEQUENCE stringList $s2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:564:59: ^( ATCALL_SEQUENCE stringList $s2)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ATCALL_SEQUENCE, "ATCALL_SEQUENCE")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringList.nextTree());

                        adaptor.addChild(root_1, stream_s2.nextTree());

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
    // $ANTLR end "atCall"


    public static class stringLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringLiteral"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:567:1: stringLiteral : '\"' ! ( . )* '\"' !;
    public final AtrophyScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        AtrophyScriptParser.stringLiteral_return retval = new AtrophyScriptParser.stringLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal392=null;
        Token wildcard393=null;
        Token char_literal394=null;

        CommonTree char_literal392_tree=null;
        CommonTree wildcard393_tree=null;
        CommonTree char_literal394_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:567:14: ( '\"' ! ( . )* '\"' !)
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:568:4: '\"' ! ( . )* '\"' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal392=(Token)match(input,106,FOLLOW_106_in_stringLiteral3744); 

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:568:9: ( . )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==106) ) {
                    alt54=2;
                }
                else if ( ((LA54_0 >= ADDTAG && LA54_0 <= 105)||(LA54_0 >= 107 && LA54_0 <= 216)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:568:9: .
            	    {
            	    wildcard393=(Token)input.LT(1);

            	    matchAny(input); 
            	    wildcard393_tree = (CommonTree)adaptor.create(wildcard393);
            	    adaptor.addChild(root_0, wildcard393_tree);


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            char_literal394=(Token)match(input,106,FOLLOW_106_in_stringLiteral3750); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA51_eotS =
        "\100\uffff";
    static final String DFA51_eofS =
        "\100\uffff";
    static final String DFA51_minS =
        "\1\21\1\5\1\uffff\2\152\1\172\2\4\2\152\1\uffff\1\4\1\uffff\25\4"+
        "\1\uffff\7\4\1\uffff\3\4\2\uffff\2\4\3\uffff\3\4\1\uffff\3\4\4\uffff";
    static final String DFA51_maxS =
        "\1\u00d8\1\u00d2\1\uffff\2\152\1\176\2\u00d8\2\152\1\uffff\1\u00d8"+
        "\1\uffff\25\u00d8\1\uffff\7\u00d8\1\uffff\3\u00d8\2\uffff\2\u00d8"+
        "\3\uffff\3\u00d8\1\uffff\3\u00d8\4\uffff";
    static final String DFA51_acceptS =
        "\2\uffff\1\2\7\uffff\1\1\1\uffff\1\1\25\uffff\1\1\7\uffff\1\1\3"+
        "\uffff\2\1\2\uffff\3\1\3\uffff\1\1\3\uffff\4\1";
    static final String DFA51_specialS =
        "\100\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\2\134\uffff\1\1\7\uffff\2\2\22\uffff\1\2\115\uffff\1\2",
            "\1\2\13\uffff\1\4\61\uffff\1\2\36\uffff\1\2\24\uffff\1\5\15"+
            "\uffff\1\2\4\uffff\1\3\1\2\2\uffff\1\2\2\uffff\1\2\17\uffff"+
            "\1\2\2\uffff\2\2\16\uffff\3\2\2\uffff\1\2\1\uffff\6\2\10\uffff"+
            "\1\2\7\uffff\2\2",
            "",
            "\1\6",
            "\1\7",
            "\1\10\3\uffff\1\11",
            "\146\13\1\12\156\13",
            "\146\15\1\14\156\15",
            "\1\16",
            "\1\17",
            "",
            "\146\13\1\12\156\13",
            "",
            "\146\15\1\14\156\15",
            "\146\21\1\20\156\21",
            "\146\23\1\22\156\23",
            "\146\21\1\20\3\21\1\24\1\21\1\25\150\21",
            "\146\21\1\20\156\21",
            "\146\23\1\22\3\23\1\26\1\23\1\27\150\23",
            "\146\23\1\22\156\23",
            "\146\21\1\30\156\21",
            "\146\21\1\31\156\21",
            "\146\23\1\32\156\23",
            "\146\23\1\33\156\23",
            "\146\37\1\36\3\37\1\34\1\37\1\35\150\37",
            "\146\43\1\42\3\43\1\40\1\43\1\41\150\43",
            "\146\47\1\46\3\47\1\44\1\47\1\45\150\47",
            "\146\53\1\52\3\53\1\50\1\53\1\51\150\53",
            "\146\37\1\54\156\37",
            "\146\37\1\55\156\37",
            "\146\37\1\36\3\37\1\34\1\37\1\35\150\37",
            "\146\37\1\36\156\37",
            "\146\43\1\56\156\43",
            "\146\43\1\57\156\43",
            "",
            "\146\43\1\42\156\43",
            "\146\47\1\60\156\47",
            "\146\47\1\61\156\47",
            "\146\47\1\46\3\47\1\44\1\47\1\45\150\47",
            "\146\47\1\46\156\47",
            "\146\53\1\62\156\53",
            "\146\53\1\63\156\53",
            "",
            "\146\53\1\52\156\53",
            "\146\37\1\36\3\37\1\34\1\37\1\35\150\37",
            "\146\67\1\64\3\67\1\65\1\67\1\66\150\67",
            "",
            "",
            "\146\47\1\46\3\47\1\44\1\47\1\45\150\47",
            "\146\73\1\70\3\73\1\71\1\73\1\72\150\73",
            "",
            "",
            "",
            "\146\67\1\74\156\67",
            "\146\67\1\75\156\67",
            "\146\67\1\64\156\67",
            "",
            "\146\73\1\76\156\73",
            "\146\73\1\77\156\73",
            "\146\73\1\70\156\73",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "()* loopback of 553:16: ( ',' ! commandCall )*";
        }
    }
 

    public static final BitSet FOLLOW_sequenceDecl_in_prog420 = new BitSet(new long[]{0x0000000000000000L,0x8800000000000000L});
    public static final BitSet FOLLOW_moduleDecl_in_prog424 = new BitSet(new long[]{0x0000000000000000L,0x8800000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_moduleDecl448 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_moduleDecl450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_moduleDecl452 = new BitSet(new long[]{0x0000000000000000L,0x230C000000000000L,0x000400C00000120EL,0x0000000001005840L});
    public static final BitSet FOLLOW_command_in_moduleDecl458 = new BitSet(new long[]{0x0000000000000000L,0x230C000000000000L,0x000400C00000120EL,0x0000000001005840L});
    public static final BitSet FOLLOW_216_in_moduleDecl464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSize_in_command489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSpawns_in_command496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockDecl_in_command503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portalDecl_in_command510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textureBlockDecl_in_command517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerDecl_in_command524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandDecl_in_command531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_talkDecl_in_command538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_requiredAssignment551 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_requiredAssignment553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requiredAssignment_in_varAssignment577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_mapSize604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_166_in_mapSize608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_mapSize611 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_mapSize613 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_mapSize615 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_mapSize617 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_mapSize619 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_mapSize621 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_mapSize623 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_mapSize625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_mapSize627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_mapSpawns652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_167_in_mapSpawns656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_mapSpawns659 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_stringList_in_mapSpawns661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_mapSpawns664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_blockDecl689 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_137_in_blockDecl693 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varAssignment_in_blockDecl696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_blockDecl698 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0303E80400008051L,0x000000000171A5AEL});
    public static final BitSet FOLLOW_properties_in_blockDecl700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_blockDecl702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_portalDecl728 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_178_in_portalDecl732 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varAssignment_in_portalDecl735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_portalDecl737 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0303E80400008051L,0x000000000171A5AEL});
    public static final BitSet FOLLOW_properties_in_portalDecl739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_portalDecl741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_textureBlockDecl767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_204_in_textureBlockDecl771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_203_in_textureBlockDecl775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_textureBlockDecl778 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0303E80400008051L,0x000000000171A5AEL});
    public static final BitSet FOLLOW_properties_in_textureBlockDecl780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_textureBlockDecl782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_triggerDecl806 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_206_in_triggerDecl810 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_triggerDecl813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_triggerDecl815 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0303E80400008051L,0x000000000171A5AEL});
    public static final BitSet FOLLOW_properties_in_triggerDecl817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_triggerDecl819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_commandDecl845 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_140_in_commandDecl849 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_commandDecl852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_commandDecl854 = new BitSet(new long[]{0x0000000000020020L,0x0080000400000008L,0xFA70003200024C20L,0x0000000000060201L});
    public static final BitSet FOLLOW_triggerEffectList_in_commandDecl856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_commandDecl858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_talkDecl888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_198_in_talkDecl892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_talkDecl895 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0303E80400008051L,0x000000000171A5AEL});
    public static final BitSet FOLLOW_properties_in_talkDecl897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_talkDecl899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xListProperty_in_properties923 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_yListProperty_in_properties930 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_factionTerritoryProperty_in_properties937 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_factionZoneProperty_in_properties944 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_saferoomProperty_in_properties951 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_stageProperty_in_properties958 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_stageDeclProperty_in_properties965 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_talkMapParentProperty_in_properties972 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_aiInitProperty_in_properties979 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_openingLineProperty_in_properties986 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_optionProperty_in_properties993 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_topicProperty_in_properties1000 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_triggerCondProperty_in_properties1007 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_triggerEffectProperty_in_properties1014 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_coverDecl_in_properties1021 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_stashDecl_in_properties1028 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0303E80400008051L,0x000000000071A5AEL});
    public static final BitSet FOLLOW_212_in_xListProperty1045 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty1047 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_xListProperty1050 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty1051 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_213_in_yListProperty1075 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty1077 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_yListProperty1080 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty1081 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_202_in_factionTerritoryProperty1107 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_factionTerritoryProperty1109 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_factionTerritoryProperty1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_factionZoneProperty1140 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_factionZoneProperty1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_saferoomProperty1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_stageDeclProperty1186 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1188 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_stageDeclProperty1191 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1193 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_177_in_talkMapParentProperty1220 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_176_in_talkMapParentProperty1224 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_talkMapParentProperty1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_stageProperty1251 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_184_in_stageProperty1255 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_stageProperty1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_aiInitProperty1282 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_132_in_aiInitProperty1286 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOL_in_aiInitProperty1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_openingLineProperty1313 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_173_in_openingLineProperty1317 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_174_in_openingLineProperty1321 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_openingLineProperty1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_optionProperty1346 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_175_in_optionProperty1350 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_optionProperty1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_topicProperty1377 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_205_in_topicProperty1381 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_topicProperty1384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_topicProperty1386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000800000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_topicProperties_in_topicProperty1388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_topicProperty1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topicLine_in_topicProperties1417 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000800000000L});
    public static final BitSet FOLLOW_topicRequiement_in_topicProperties1421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000800000000L});
    public static final BitSet FOLLOW_163_in_topicLine1438 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_topicLine1439 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_topicLine1442 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_topicLine1444 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_183_in_topicRequiement1470 = new BitSet(new long[]{0x0200000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_reqString_in_topicRequiement1472 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_topicRequiement1475 = new BitSet(new long[]{0x0200000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_reqString_in_topicRequiement1477 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_NOT_PREFIX_in_reqString1503 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_reqString1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_reqString1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_aliveQuery1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_aliveQuery1537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000501FFE10080L,0x0000000001000010L});
    public static final BitSet FOLLOW_unitInfo_in_aliveQuery1539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_aliveQuery1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_timeQuery1564 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1566 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_148_in_timeQuery1572 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_timeQuery1594 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_boolQuery1638 = new BitSet(new long[]{0x0200000000000000L,0x0000100000000000L,0x0000100000800000L});
    public static final BitSet FOLLOW_queryLogic_in_boolQuery1641 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_boolQuery1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aliveQuery_in_boolQuery1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeQuery_in_boolQuery1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolQuery_in_queryNegation1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_PREFIX_in_queryNegation1675 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000100000800000L});
    public static final BitSet FOLLOW_boolQuery_in_queryNegation1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1701 = new BitSet(new long[]{0x0000000000000002L,0x1002000000000000L});
    public static final BitSet FOLLOW_113_in_queryLogic1706 = new BitSet(new long[]{0x0200000000000000L,0x0000100000000000L,0x0000100000800000L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_queryLogic1727 = new BitSet(new long[]{0x0200000000000000L,0x0000100000000000L,0x0000100000800000L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_triggerCondProperty1771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_207_in_triggerCondProperty1775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_triggerCondProperty1778 = new BitSet(new long[]{0x0200000000000000L,0x0000100000000000L,0x0000100000800000L});
    public static final BitSet FOLLOW_queryLogic_in_triggerCondProperty1780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_triggerCondProperty1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_triggerEffectProperty1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_208_in_triggerEffectProperty1808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_triggerEffectProperty1811 = new BitSet(new long[]{0x0000000000020020L,0x0080000400000008L,0xFA70003200024C20L,0x0000000000060201L});
    public static final BitSet FOLLOW_triggerEffectList_in_triggerEffectProperty1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_triggerEffectProperty1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_coverDecl1839 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_143_in_coverDecl1843 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varAssignment_in_coverDecl1846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_coverDecl1848 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0303E80400008051L,0x000000000171A5AEL});
    public static final BitSet FOLLOW_properties_in_coverDecl1850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_coverDecl1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_stashDecl1878 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_195_in_stashDecl1882 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varAssignment_in_stashDecl1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_stashDecl1887 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0303E80400008051L,0x000000000171A5AEL});
    public static final BitSet FOLLOW_properties_in_stashDecl1889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_stashDecl1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1914 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_triggerEffectList1917 = new BitSet(new long[]{0x0000000000020020L,0x0080000400000008L,0xFA70003200024C20L,0x0000000000060201L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1920 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_updateTalkTree_in_triggerEffect1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnTeam_in_triggerEffect1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnCharacter_in_triggerEffect1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeUnit_in_triggerEffect1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_killUnit_in_triggerEffect1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_teleportUnit_in_triggerEffect1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_converseUnit_in_triggerEffect1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createSaferoom_in_triggerEffect1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeSaferoom_in_triggerEffect1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loadMap_in_triggerEffect1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lockDoor_in_triggerEffect2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlockDoor_in_triggerEffect2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addTag_in_triggerEffect2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeTag_in_triggerEffect2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directorBias_in_triggerEffect2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeAiNode_in_triggerEffect2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showMessage_in_triggerEffect2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setTriggerRunning_in_triggerEffect2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnItem_in_triggerEffect2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnTalkNode_in_triggerEffect2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCallList_in_triggerEffect2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_updateTalkTree2090 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree2092 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree2111 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree2113 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_updateTalkTree2115 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_isName2142 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_isName2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_isFaction2167 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_isFaction2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_isRoom2192 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_isRoom2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_hasItem2217 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_hasItem2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_hasWeapon2242 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_hasWeapon2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList2267 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_stringList2270 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList2272 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_151_in_isAlive2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_isDead2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_isInvestigated2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_isNotInvestigated2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_isDaemon2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_isNotDaemon2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_teleDestination2420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_teleDestination2422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_xListProperty_in_teleDestination2424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_yListProperty_in_teleDestination2426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_teleDestination2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_maxTeamSize2453 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_maxTeamSize2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_minTeamSize2476 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_minTeamSize2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_isPlayer2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_aiNode2516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_aiNode2518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000100L,0x0000000001000010L});
    public static final BitSet FOLLOW_aiNodeOptions_in_aiNode2520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_aiNode2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subscribeTalkMaps_in_aiNodeOptions2545 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000100L,0x0000000000000010L});
    public static final BitSet FOLLOW_behaviours_in_aiNodeOptions2550 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000100L,0x0000000000000010L});
    public static final BitSet FOLLOW_aiNodePriority_in_aiNodeOptions2555 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000100L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_subscribeTalkMaps2572 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_subscribeTalkMaps2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_behaviours2596 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_behaviours2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_aiNodePriority2621 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_aiNodePriority2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_unitInfo2647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_isFaction_in_unitInfo2654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_isRoom_in_unitInfo2661 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_hasItem_in_unitInfo2668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_hasWeapon_in_unitInfo2675 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_isAlive_in_unitInfo2682 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_isDead_in_unitInfo2689 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_isInvestigated_in_unitInfo2696 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_isNotInvestigated_in_unitInfo2703 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_isDaemon_in_unitInfo2710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_isNotDaemon_in_unitInfo2717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_teleDestination_in_unitInfo2724 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_maxTeamSize_in_unitInfo2731 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_minTeamSize_in_unitInfo2738 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_subscribeTalkMaps_in_unitInfo2745 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_aiNode_in_unitInfo2752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_isPlayer_in_unitInfo2759 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000501FFE10080L,0x0000000000000010L});
    public static final BitSet FOLLOW_192_in_spawnTeam2778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_spawnTeam2780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000501FFE10080L,0x0000000001000010L});
    public static final BitSet FOLLOW_unitInfo_in_spawnTeam2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_spawnTeam2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_spawnCharacter2807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_spawnCharacter2809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000501FFE10080L,0x0000000001000010L});
    public static final BitSet FOLLOW_unitInfo_in_spawnCharacter2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_spawnCharacter2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_removeUnit2836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_removeUnit2838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000501FFE10080L,0x0000000001000010L});
    public static final BitSet FOLLOW_unitInfo_in_removeUnit2840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_removeUnit2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_killUnit2865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_killUnit2867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000501FFE10080L,0x0000000001000010L});
    public static final BitSet FOLLOW_unitInfo_in_killUnit2869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_killUnit2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_teleportUnit2894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_teleportUnit2896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000501FFE10080L,0x0000000001000010L});
    public static final BitSet FOLLOW_unitInfo_in_teleportUnit2898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_teleportUnit2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_converseUnit2923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_converseUnit2925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000501FFE10080L,0x0000000001000010L});
    public static final BitSet FOLLOW_unitInfo_in_converseUnit2927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_converseUnit2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_createSaferoom2952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_createSaferoom2954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010002000L,0x0000000001000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_createSaferoom2956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_createSaferoom2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_removeSaferoom2981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_removeSaferoom2983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010002000L,0x0000000001000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_removeSaferoom2985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_removeSaferoom2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_containsFaction3010 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_containsFaction3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsFaction_in_saferoomInfo3036 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010002000L});
    public static final BitSet FOLLOW_isName_in_saferoomInfo3043 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010002000L});
    public static final BitSet FOLLOW_isName_in_mapInfo3061 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400020014040000L,0x0000000000080000L});
    public static final BitSet FOLLOW_isFaction_in_mapInfo3065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400020014040000L,0x0000000000080000L});
    public static final BitSet FOLLOW_itemSpawnChance_in_mapInfo3069 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400020014040000L,0x0000000000080000L});
    public static final BitSet FOLLOW_146_in_itemSpawnChance3086 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_itemSpawnChance3103 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_itemSpawnChance3120 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_itemSpawnChance3137 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_loadMap3162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_loadMap3164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400020014040000L,0x0000000001080000L});
    public static final BitSet FOLLOW_mapInfo_in_loadMap3166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_loadMap3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_lockDoor3191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_lockDoor3193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_doorInfo_in_lockDoor3195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_lockDoor3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_unlockDoor3220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_unlockDoor3222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_doorInfo_in_unlockDoor3224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_unlockDoor3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_doorInfo3249 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_133_in_addTag3265 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_TAG_PREFIX_in_addTag3282 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_removeTag3307 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_TAG_PREFIX_in_removeTag3324 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_directorBias3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_changeAiNode3370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_changeAiNode3372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_changeAiNode3374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000501FFE10080L,0x0000000001000010L});
    public static final BitSet FOLLOW_unitInfo_in_changeAiNode3376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_changeAiNode3378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_changeAiNode3380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000100L,0x0000000001000010L});
    public static final BitSet FOLLOW_aiNodeOptions_in_changeAiNode3382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_changeAiNode3384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_changeAiNode3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_showMessage3411 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_showMessage3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_setTriggerRunning3436 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_setTriggerRunning3438 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOL_in_setTriggerRunning3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_spawnItem3469 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_spawnItem3471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_spawnItem3473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000501FFE10080L,0x0000000001000010L});
    public static final BitSet FOLLOW_unitInfo_in_spawnItem3475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_spawnItem3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_spawnTalkNode3502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_spawnTalkNode3504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000501FFE10080L,0x0000000001000010L});
    public static final BitSet FOLLOW_unitInfo_in_spawnTalkNode3506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_spawnTalkNode3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_sequenceDecl3531 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_sequenceDecl3533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_sequenceDecl3535 = new BitSet(new long[]{0x0000000000020000L,0x00C0000000000000L,0x0000000000000400L,0x0000000001000000L});
    public static final BitSet FOLLOW_commandConditional_in_sequenceDecl3541 = new BitSet(new long[]{0x0000000000020000L,0x0080000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_commandCallList_in_sequenceDecl3544 = new BitSet(new long[]{0x0000000000020000L,0x00C0000000000000L,0x0000000000000400L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_sequenceDecl3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_commandConditional3581 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_commandConditional3582 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_commandConditional3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_commandConditional3590 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_commandConditional3591 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_commandConditional3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList3606 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_commandCallList3609 = new BitSet(new long[]{0x0000000000020000L,0x0080000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList3612 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_138_in_commandCall3629 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_CALL_PREFIX_in_commandCall3646 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atCall_in_commandCall3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_atCall3678 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_atCall3680 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_atCall3682 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atCall3684 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_atCall3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_atCall3706 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_atCall3708 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_atCall3710 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_atCall3712 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_atCall3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_stringLiteral3744 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000001FFFFFFL});
    public static final BitSet FOLLOW_106_in_stringLiteral3750 = new BitSet(new long[]{0x0000000000000002L});

}