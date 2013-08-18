// $ANTLR 3.4 C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g 2013-08-18 18:06:43

	package atrophy.combat.level;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AtrophyScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDTAG", "ADD_TAG_PREFIX", "AIINIT", "AINODE", "AND", "ATCALL_MODULE", "ATCALL_SEQUENCE", "BEHAVIOUR", "BLOCK", "BOOL", "CHANGEADVANCE", "CHANGEAINODE", "CHANGESTABILITY", "COMMAND", "COMMAND_CALL", "COMMAND_CALL_PREFIX", "COMMENT", "CONDITIONAL", "CONTAINSFACTION", "CONVERSE", "COVER", "DIRECTORBIAS", "DOORNAMES", "EMPTY", "ENG", "ESUPPLY", "EXPIREREPEATS", "EXPIRETIME", "HASITEM", "HASWEAPON", "IDENT", "INIT", "INROOM", "INT", "ISALIVE", "ISDAEMON", "ISDEAD", "ISFACTION", "ISINVESTIGATED", "ISNAME", "ISNOTDAEMON", "ISNOTINVESTIGATED", "ISROOM", "ITEMSPAWNS", "KILLUNIT", "LINE", "LOADMAP", "LOCKDOOR", "LOGIC", "MAPSIZE", "MAPSPAWNS", "MAXTEAMSIZE", "MED", "MINTEAMSIZE", "MODULE", "MSUPPLY", "MULTILINE_COMMENT", "NEGATION", "NOT_PREFIX", "ONTIME", "OPENINGLINE", "OPTION", "OR", "PORTAL", "PRIORITY", "REMOVESAFEROOM", "REMOVETAG", "REMOVEUNIT", "REMOVE_TAG_PREFIX", "REQ", "SAFEROOM", "SCI", "SEQUENCE", "SETTRIGGERRUNNING", "SHOWMESSAGE", "SPAWNCHARACTER", "SPAWNITEM", "SPAWNTALKNODE", "SPAWNTEAM", "SSUPPLY", "STAGELIST", "STASH", "STRING", "SUBSCRIBE", "TALK", "TALKMAP", "TALKPARENT", "TALKSTAGE", "TELEDEST", "TELEPORT", "TERRITORY", "TEXTURE", "TEXTUREBLOCK", "TOPIC", "TRIGGER", "TRIGGERCOND", "TRIGGEREFFECT", "TRIGGERTYPE", "UNLOCKDOOR", "UNLOCKTECH", "UPDATETALK", "UPDATE_TREE_PREFIX", "VAR", "WEP", "WS", "WSUPPLY", "XLIST", "YLIST", "ZONE", "'!HAS'", "'\"'", "'#'", "'('", "')'", "','", "'-'", "'::'", "'@'", "'AND'", "'BLOCK'", "'COMMAND'", "'COVER'", "'HAS'", "'IF'", "'ITEMSPAWNS'", "'LOAD'", "'MAPSIZE'", "'MAPSPAWNS'", "'MODULE'", "'MODULE::'", "'OR'", "'PORTAL'", "'SEQUENCE'", "'SEQUENCE::'", "'STASH'", "'TALK'", "'TEXTUREBLOCK'", "'TRIGGER'", "'a:'", "'addTag:'", "'aiInit:'", "'aiNode'", "'behaviours:'", "'block'", "'callCommand:'", "'changeAdvance:'", "'changeAiNode'", "'changeStability:'", "'command'", "'containsFaction:'", "'converse'", "'cover'", "'destination'", "'directorBias:'", "'engChance:'", "'expireRepeats:'", "'expireTime:'", "'hasItem:'", "'hasWeapon:'", "'isAlive'", "'isDaemon'", "'isDead'", "'isFaction:'", "'isInvestigated'", "'isName:'", "'isNotDaemon'", "'isNotInvestigated'", "'isPlayer'", "'isRoom:'", "'killUnit'", "'l:'", "'lines:'", "'loadMap'", "'lockDoor'", "'mapsize'", "'mapspawns'", "'maxTeamSize:'", "'medChance:'", "'minTeamSize:'", "'o:'", "'onTime:'", "'opening:'", "'openingLine:'", "'option:'", "'p:'", "'parent:'", "'portal'", "'priority:'", "'removeSaferoom'", "'removeTag:'", "'removeUnit'", "'req:'", "'s:'", "'saferoom'", "'sciChance'", "'setTriggerRunning:'", "'showMessage:'", "'spawnCharacter'", "'spawnItem'", "'spawnTalkNode'", "'spawnTeam'", "'stage:'", "'stages:'", "'stash'", "'subscribe:'", "'t'", "'talk'", "'tc'", "'te'", "'teleport'", "'territory:'", "'textureBlock'", "'textureblock'", "'topic'", "'trigger'", "'triggerCond'", "'triggerEffect'", "'unlockDoor'", "'unlockTech:'", "'updateTalk:'", "'wepChance:'", "'x:'", "'y:'", "'zone:'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__217=217;
    public static final int T__218=218;
    public static final int T__219=219;
    public static final int T__220=220;
    public static final int T__221=221;
    public static final int T__222=222;
    public static final int T__223=223;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int T__227=227;
    public static final int T__228=228;
    public static final int T__229=229;
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
    public static final int CHANGEADVANCE=14;
    public static final int CHANGEAINODE=15;
    public static final int CHANGESTABILITY=16;
    public static final int COMMAND=17;
    public static final int COMMAND_CALL=18;
    public static final int COMMAND_CALL_PREFIX=19;
    public static final int COMMENT=20;
    public static final int CONDITIONAL=21;
    public static final int CONTAINSFACTION=22;
    public static final int CONVERSE=23;
    public static final int COVER=24;
    public static final int DIRECTORBIAS=25;
    public static final int DOORNAMES=26;
    public static final int EMPTY=27;
    public static final int ENG=28;
    public static final int ESUPPLY=29;
    public static final int EXPIREREPEATS=30;
    public static final int EXPIRETIME=31;
    public static final int HASITEM=32;
    public static final int HASWEAPON=33;
    public static final int IDENT=34;
    public static final int INIT=35;
    public static final int INROOM=36;
    public static final int INT=37;
    public static final int ISALIVE=38;
    public static final int ISDAEMON=39;
    public static final int ISDEAD=40;
    public static final int ISFACTION=41;
    public static final int ISINVESTIGATED=42;
    public static final int ISNAME=43;
    public static final int ISNOTDAEMON=44;
    public static final int ISNOTINVESTIGATED=45;
    public static final int ISROOM=46;
    public static final int ITEMSPAWNS=47;
    public static final int KILLUNIT=48;
    public static final int LINE=49;
    public static final int LOADMAP=50;
    public static final int LOCKDOOR=51;
    public static final int LOGIC=52;
    public static final int MAPSIZE=53;
    public static final int MAPSPAWNS=54;
    public static final int MAXTEAMSIZE=55;
    public static final int MED=56;
    public static final int MINTEAMSIZE=57;
    public static final int MODULE=58;
    public static final int MSUPPLY=59;
    public static final int MULTILINE_COMMENT=60;
    public static final int NEGATION=61;
    public static final int NOT_PREFIX=62;
    public static final int ONTIME=63;
    public static final int OPENINGLINE=64;
    public static final int OPTION=65;
    public static final int OR=66;
    public static final int PORTAL=67;
    public static final int PRIORITY=68;
    public static final int REMOVESAFEROOM=69;
    public static final int REMOVETAG=70;
    public static final int REMOVEUNIT=71;
    public static final int REMOVE_TAG_PREFIX=72;
    public static final int REQ=73;
    public static final int SAFEROOM=74;
    public static final int SCI=75;
    public static final int SEQUENCE=76;
    public static final int SETTRIGGERRUNNING=77;
    public static final int SHOWMESSAGE=78;
    public static final int SPAWNCHARACTER=79;
    public static final int SPAWNITEM=80;
    public static final int SPAWNTALKNODE=81;
    public static final int SPAWNTEAM=82;
    public static final int SSUPPLY=83;
    public static final int STAGELIST=84;
    public static final int STASH=85;
    public static final int STRING=86;
    public static final int SUBSCRIBE=87;
    public static final int TALK=88;
    public static final int TALKMAP=89;
    public static final int TALKPARENT=90;
    public static final int TALKSTAGE=91;
    public static final int TELEDEST=92;
    public static final int TELEPORT=93;
    public static final int TERRITORY=94;
    public static final int TEXTURE=95;
    public static final int TEXTUREBLOCK=96;
    public static final int TOPIC=97;
    public static final int TRIGGER=98;
    public static final int TRIGGERCOND=99;
    public static final int TRIGGEREFFECT=100;
    public static final int TRIGGERTYPE=101;
    public static final int UNLOCKDOOR=102;
    public static final int UNLOCKTECH=103;
    public static final int UPDATETALK=104;
    public static final int UPDATE_TREE_PREFIX=105;
    public static final int VAR=106;
    public static final int WEP=107;
    public static final int WS=108;
    public static final int WSUPPLY=109;
    public static final int XLIST=110;
    public static final int YLIST=111;
    public static final int ZONE=112;

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:114:1: prog : ( sequenceDecl | moduleDecl )* EOF ;
    public final AtrophyScriptParser.prog_return prog() throws RecognitionException {
        AtrophyScriptParser.prog_return retval = new AtrophyScriptParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        AtrophyScriptParser.sequenceDecl_return sequenceDecl1 =null;

        AtrophyScriptParser.moduleDecl_return moduleDecl2 =null;


        CommonTree EOF3_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:114:5: ( ( sequenceDecl | moduleDecl )* EOF )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:115:5: ( sequenceDecl | moduleDecl )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:115:5: ( sequenceDecl | moduleDecl )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==137) ) {
                    alt1=1;
                }
                else if ( (LA1_0==133) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:115:6: sequenceDecl
            	    {
            	    pushFollow(FOLLOW_sequenceDecl_in_prog452);
            	    sequenceDecl1=sequenceDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sequenceDecl1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:115:21: moduleDecl
            	    {
            	    pushFollow(FOLLOW_moduleDecl_in_prog456);
            	    moduleDecl2=moduleDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, moduleDecl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog464); 
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:119:1: moduleDecl : 'MODULE::' stringLiteral '{' ( command )* '}' -> ^( MODULE stringLiteral ( command )* ) ;
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
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:119:11: ( 'MODULE::' stringLiteral '{' ( command )* '}' -> ^( MODULE stringLiteral ( command )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:120:4: 'MODULE::' stringLiteral '{' ( command )* '}'
            {
            string_literal4=(Token)match(input,133,FOLLOW_133_in_moduleDecl480);  
            stream_133.add(string_literal4);


            pushFollow(FOLLOW_stringLiteral_in_moduleDecl482);
            stringLiteral5=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral5.getTree());

            char_literal6=(Token)match(input,228,FOLLOW_228_in_moduleDecl484);  
            stream_228.add(char_literal6);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:5: ( command )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 123 && LA2_0 <= 124)||LA2_0==128||(LA2_0 >= 130 && LA2_0 <= 131)||LA2_0==135||(LA2_0 >= 139 && LA2_0 <= 141)||LA2_0==147||LA2_0==152||(LA2_0 >= 178 && LA2_0 <= 179)||LA2_0==190||LA2_0==210||(LA2_0 >= 215 && LA2_0 <= 216)||LA2_0==218) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:121:5: command
            	    {
            	    pushFollow(FOLLOW_command_in_moduleDecl490);
            	    command7=command();

            	    state._fsp--;

            	    stream_command.add(command7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            char_literal8=(Token)match(input,229,FOLLOW_229_in_moduleDecl496);  
            stream_229.add(char_literal8);


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
            // 122:8: -> ^( MODULE stringLiteral ( command )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:122:11: ^( MODULE stringLiteral ( command )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE, "MODULE")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:122:34: ( command )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:1: command : ( mapSize | mapSpawns | itemSpawns | blockDecl | portalDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl );
    public final AtrophyScriptParser.command_return command() throws RecognitionException {
        AtrophyScriptParser.command_return retval = new AtrophyScriptParser.command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.mapSize_return mapSize9 =null;

        AtrophyScriptParser.mapSpawns_return mapSpawns10 =null;

        AtrophyScriptParser.itemSpawns_return itemSpawns11 =null;

        AtrophyScriptParser.blockDecl_return blockDecl12 =null;

        AtrophyScriptParser.portalDecl_return portalDecl13 =null;

        AtrophyScriptParser.textureBlockDecl_return textureBlockDecl14 =null;

        AtrophyScriptParser.triggerDecl_return triggerDecl15 =null;

        AtrophyScriptParser.commandDecl_return commandDecl16 =null;

        AtrophyScriptParser.talkDecl_return talkDecl17 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:8: ( mapSize | mapSpawns | itemSpawns | blockDecl | portalDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 130:
            case 178:
                {
                alt3=1;
                }
                break;
            case 131:
            case 179:
                {
                alt3=2;
                }
                break;
            case 128:
                {
                alt3=3;
                }
                break;
            case 123:
            case 147:
                {
                alt3=4;
                }
                break;
            case 135:
            case 190:
                {
                alt3=5;
                }
                break;
            case 140:
            case 215:
            case 216:
                {
                alt3=6;
                }
                break;
            case 141:
            case 218:
                {
                alt3=7;
                }
                break;
            case 124:
            case 152:
                {
                alt3=8;
                }
                break;
            case 139:
            case 210:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:126:4: mapSize
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSize_in_command521);
                    mapSize9=mapSize();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSize9.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:6: mapSpawns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSpawns_in_command528);
                    mapSpawns10=mapSpawns();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSpawns10.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:6: itemSpawns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_itemSpawns_in_command535);
                    itemSpawns11=itemSpawns();

                    state._fsp--;

                    adaptor.addChild(root_0, itemSpawns11.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:6: blockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_blockDecl_in_command542);
                    blockDecl12=blockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, blockDecl12.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:130:6: portalDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_portalDecl_in_command549);
                    portalDecl13=portalDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, portalDecl13.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:6: textureBlockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_textureBlockDecl_in_command556);
                    textureBlockDecl14=textureBlockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, textureBlockDecl14.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:6: triggerDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_triggerDecl_in_command563);
                    triggerDecl15=triggerDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, triggerDecl15.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:6: commandDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandDecl_in_command570);
                    commandDecl16=commandDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, commandDecl16.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:134:6: talkDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_talkDecl_in_command577);
                    talkDecl17=talkDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, talkDecl17.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:1: requiredAssignment : '::' stringLiteral -> ^( VAR stringLiteral ) ;
    public final AtrophyScriptParser.requiredAssignment_return requiredAssignment() throws RecognitionException {
        AtrophyScriptParser.requiredAssignment_return retval = new AtrophyScriptParser.requiredAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal18=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral19 =null;


        CommonTree string_literal18_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:19: ( '::' stringLiteral -> ^( VAR stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:138:4: '::' stringLiteral
            {
            string_literal18=(Token)match(input,120,FOLLOW_120_in_requiredAssignment590);  
            stream_120.add(string_literal18);


            pushFollow(FOLLOW_stringLiteral_in_requiredAssignment592);
            stringLiteral19=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral19.getTree());

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
            // 138:23: -> ^( VAR stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:138:26: ^( VAR stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:1: varAssignment : ( requiredAssignment | -> ^( EMPTY ) );
    public final AtrophyScriptParser.varAssignment_return varAssignment() throws RecognitionException {
        AtrophyScriptParser.varAssignment_return retval = new AtrophyScriptParser.varAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.requiredAssignment_return requiredAssignment20 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:14: ( requiredAssignment | -> ^( EMPTY ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==120) ) {
                alt4=1;
            }
            else if ( (LA4_0==228) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:4: requiredAssignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_requiredAssignment_in_varAssignment616);
                    requiredAssignment20=requiredAssignment();

                    state._fsp--;

                    adaptor.addChild(root_0, requiredAssignment20.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:6: 
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
                    // 143:6: -> ^( EMPTY )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:143:9: ^( EMPTY )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:146:1: mapSize : ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) ;
    public final AtrophyScriptParser.mapSize_return mapSize() throws RecognitionException {
        AtrophyScriptParser.mapSize_return retval = new AtrophyScriptParser.mapSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal21=null;
        Token string_literal22=null;
        Token char_literal23=null;
        Token INT24=null;
        Token char_literal25=null;
        Token INT26=null;
        Token char_literal27=null;
        Token INT28=null;
        Token char_literal29=null;
        Token INT30=null;
        Token char_literal31=null;

        CommonTree string_literal21_tree=null;
        CommonTree string_literal22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree INT24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree INT26_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree INT28_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree INT30_tree=null;
        CommonTree char_literal31_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:146:8: ( ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:4: ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:4: ( 'MAPSIZE' | 'mapsize' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==130) ) {
                alt5=1;
            }
            else if ( (LA5_0==178) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:5: 'MAPSIZE'
                    {
                    string_literal21=(Token)match(input,130,FOLLOW_130_in_mapSize643);  
                    stream_130.add(string_literal21);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:17: 'mapsize'
                    {
                    string_literal22=(Token)match(input,178,FOLLOW_178_in_mapSize647);  
                    stream_178.add(string_literal22);


                    }
                    break;

            }


            char_literal23=(Token)match(input,228,FOLLOW_228_in_mapSize650);  
            stream_228.add(char_literal23);


            INT24=(Token)match(input,INT,FOLLOW_INT_in_mapSize652);  
            stream_INT.add(INT24);


            char_literal25=(Token)match(input,118,FOLLOW_118_in_mapSize654);  
            stream_118.add(char_literal25);


            INT26=(Token)match(input,INT,FOLLOW_INT_in_mapSize656);  
            stream_INT.add(INT26);


            char_literal27=(Token)match(input,118,FOLLOW_118_in_mapSize658);  
            stream_118.add(char_literal27);


            INT28=(Token)match(input,INT,FOLLOW_INT_in_mapSize660);  
            stream_INT.add(INT28);


            char_literal29=(Token)match(input,118,FOLLOW_118_in_mapSize662);  
            stream_118.add(char_literal29);


            INT30=(Token)match(input,INT,FOLLOW_INT_in_mapSize664);  
            stream_INT.add(INT30);


            char_literal31=(Token)match(input,229,FOLLOW_229_in_mapSize666);  
            stream_229.add(char_literal31);


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
            // 147:64: -> ^( MAPSIZE ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:67: ^( MAPSIZE ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSIZE, "MAPSIZE")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:77: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:1: mapSpawns : ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) ;
    public final AtrophyScriptParser.mapSpawns_return mapSpawns() throws RecognitionException {
        AtrophyScriptParser.mapSpawns_return retval = new AtrophyScriptParser.mapSpawns_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal32=null;
        Token string_literal33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        AtrophyScriptParser.stringList_return stringList35 =null;


        CommonTree string_literal32_tree=null;
        CommonTree string_literal33_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal36_tree=null;
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:10: ( ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:4: ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:4: ( 'MAPSPAWNS' | 'mapspawns' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==131) ) {
                alt6=1;
            }
            else if ( (LA6_0==179) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:5: 'MAPSPAWNS'
                    {
                    string_literal32=(Token)match(input,131,FOLLOW_131_in_mapSpawns691);  
                    stream_131.add(string_literal32);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:19: 'mapspawns'
                    {
                    string_literal33=(Token)match(input,179,FOLLOW_179_in_mapSpawns695);  
                    stream_179.add(string_literal33);


                    }
                    break;

            }


            char_literal34=(Token)match(input,228,FOLLOW_228_in_mapSpawns698);  
            stream_228.add(char_literal34);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:36: ( stringList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==114) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:36: stringList
                    {
                    pushFollow(FOLLOW_stringList_in_mapSpawns700);
                    stringList35=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList35.getTree());

                    }
                    break;

            }


            char_literal36=(Token)match(input,229,FOLLOW_229_in_mapSpawns703);  
            stream_229.add(char_literal36);


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
            // 151:52: -> ^( MAPSPAWNS ( stringList )? )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:55: ^( MAPSPAWNS ( stringList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSPAWNS, "MAPSPAWNS")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:67: ( stringList )?
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


    public static class itemSpawns_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "itemSpawns"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:1: itemSpawns : 'ITEMSPAWNS' '{' INT ',' INT ',' INT ',' INT '}' -> ^( ITEMSPAWNS ( INT )* ) ;
    public final AtrophyScriptParser.itemSpawns_return itemSpawns() throws RecognitionException {
        AtrophyScriptParser.itemSpawns_return retval = new AtrophyScriptParser.itemSpawns_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal37=null;
        Token char_literal38=null;
        Token INT39=null;
        Token char_literal40=null;
        Token INT41=null;
        Token char_literal42=null;
        Token INT43=null;
        Token char_literal44=null;
        Token INT45=null;
        Token char_literal46=null;

        CommonTree string_literal37_tree=null;
        CommonTree char_literal38_tree=null;
        CommonTree INT39_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree INT41_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree INT43_tree=null;
        CommonTree char_literal44_tree=null;
        CommonTree INT45_tree=null;
        CommonTree char_literal46_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:11: ( 'ITEMSPAWNS' '{' INT ',' INT ',' INT ',' INT '}' -> ^( ITEMSPAWNS ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:4: 'ITEMSPAWNS' '{' INT ',' INT ',' INT ',' INT '}'
            {
            string_literal37=(Token)match(input,128,FOLLOW_128_in_itemSpawns727);  
            stream_128.add(string_literal37);


            char_literal38=(Token)match(input,228,FOLLOW_228_in_itemSpawns729);  
            stream_228.add(char_literal38);


            INT39=(Token)match(input,INT,FOLLOW_INT_in_itemSpawns731);  
            stream_INT.add(INT39);


            char_literal40=(Token)match(input,118,FOLLOW_118_in_itemSpawns733);  
            stream_118.add(char_literal40);


            INT41=(Token)match(input,INT,FOLLOW_INT_in_itemSpawns735);  
            stream_INT.add(INT41);


            char_literal42=(Token)match(input,118,FOLLOW_118_in_itemSpawns737);  
            stream_118.add(char_literal42);


            INT43=(Token)match(input,INT,FOLLOW_INT_in_itemSpawns739);  
            stream_INT.add(INT43);


            char_literal44=(Token)match(input,118,FOLLOW_118_in_itemSpawns741);  
            stream_118.add(char_literal44);


            INT45=(Token)match(input,INT,FOLLOW_INT_in_itemSpawns743);  
            stream_INT.add(INT45);


            char_literal46=(Token)match(input,229,FOLLOW_229_in_itemSpawns745);  
            stream_229.add(char_literal46);


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
            // 155:53: -> ^( ITEMSPAWNS ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:56: ^( ITEMSPAWNS ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ITEMSPAWNS, "ITEMSPAWNS")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:69: ( INT )*
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
    // $ANTLR end "itemSpawns"


    public static class blockDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockDecl"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:1: blockDecl : ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) ;
    public final AtrophyScriptParser.blockDecl_return blockDecl() throws RecognitionException {
        AtrophyScriptParser.blockDecl_return retval = new AtrophyScriptParser.blockDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal47=null;
        Token string_literal48=null;
        Token char_literal50=null;
        Token char_literal52=null;
        AtrophyScriptParser.varAssignment_return varAssignment49 =null;

        AtrophyScriptParser.properties_return properties51 =null;


        CommonTree string_literal47_tree=null;
        CommonTree string_literal48_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree char_literal52_tree=null;
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:10: ( ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:4: ( 'BLOCK' | 'block' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:4: ( 'BLOCK' | 'block' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==123) ) {
                alt8=1;
            }
            else if ( (LA8_0==147) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:5: 'BLOCK'
                    {
                    string_literal47=(Token)match(input,123,FOLLOW_123_in_blockDecl770);  
                    stream_123.add(string_literal47);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:15: 'block'
                    {
                    string_literal48=(Token)match(input,147,FOLLOW_147_in_blockDecl774);  
                    stream_147.add(string_literal48);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_blockDecl777);
            varAssignment49=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment49.getTree());

            char_literal50=(Token)match(input,228,FOLLOW_228_in_blockDecl779);  
            stream_228.add(char_literal50);


            pushFollow(FOLLOW_properties_in_blockDecl781);
            properties51=properties();

            state._fsp--;

            stream_properties.add(properties51.getTree());

            char_literal52=(Token)match(input,229,FOLLOW_229_in_blockDecl783);  
            stream_229.add(char_literal52);


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
            // 159:57: -> ^( BLOCK varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:60: ^( BLOCK varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:1: portalDecl : ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) ;
    public final AtrophyScriptParser.portalDecl_return portalDecl() throws RecognitionException {
        AtrophyScriptParser.portalDecl_return retval = new AtrophyScriptParser.portalDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal53=null;
        Token string_literal54=null;
        Token char_literal56=null;
        Token char_literal58=null;
        AtrophyScriptParser.varAssignment_return varAssignment55 =null;

        AtrophyScriptParser.properties_return properties57 =null;


        CommonTree string_literal53_tree=null;
        CommonTree string_literal54_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree char_literal58_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:11: ( ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:4: ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:4: ( 'PORTAL' | 'portal' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==135) ) {
                alt9=1;
            }
            else if ( (LA9_0==190) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:5: 'PORTAL'
                    {
                    string_literal53=(Token)match(input,135,FOLLOW_135_in_portalDecl809);  
                    stream_135.add(string_literal53);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:16: 'portal'
                    {
                    string_literal54=(Token)match(input,190,FOLLOW_190_in_portalDecl813);  
                    stream_190.add(string_literal54);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_portalDecl816);
            varAssignment55=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment55.getTree());

            char_literal56=(Token)match(input,228,FOLLOW_228_in_portalDecl818);  
            stream_228.add(char_literal56);


            pushFollow(FOLLOW_properties_in_portalDecl820);
            properties57=properties();

            state._fsp--;

            stream_properties.add(properties57.getTree());

            char_literal58=(Token)match(input,229,FOLLOW_229_in_portalDecl822);  
            stream_229.add(char_literal58);


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
            // 163:59: -> ^( PORTAL varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:62: ^( PORTAL varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:1: textureBlockDecl : ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) ;
    public final AtrophyScriptParser.textureBlockDecl_return textureBlockDecl() throws RecognitionException {
        AtrophyScriptParser.textureBlockDecl_return retval = new AtrophyScriptParser.textureBlockDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal59=null;
        Token string_literal60=null;
        Token string_literal61=null;
        Token char_literal62=null;
        Token char_literal64=null;
        AtrophyScriptParser.properties_return properties63 =null;


        CommonTree string_literal59_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree string_literal61_tree=null;
        CommonTree char_literal62_tree=null;
        CommonTree char_literal64_tree=null;
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:17: ( ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 140:
                {
                alt10=1;
                }
                break;
            case 216:
                {
                alt10=2;
                }
                break;
            case 215:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:5: 'TEXTUREBLOCK'
                    {
                    string_literal59=(Token)match(input,140,FOLLOW_140_in_textureBlockDecl848);  
                    stream_140.add(string_literal59);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:22: 'textureblock'
                    {
                    string_literal60=(Token)match(input,216,FOLLOW_216_in_textureBlockDecl852);  
                    stream_216.add(string_literal60);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:39: 'textureBlock'
                    {
                    string_literal61=(Token)match(input,215,FOLLOW_215_in_textureBlockDecl856);  
                    stream_215.add(string_literal61);


                    }
                    break;

            }


            char_literal62=(Token)match(input,228,FOLLOW_228_in_textureBlockDecl859);  
            stream_228.add(char_literal62);


            pushFollow(FOLLOW_properties_in_textureBlockDecl861);
            properties63=properties();

            state._fsp--;

            stream_properties.add(properties63.getTree());

            char_literal64=(Token)match(input,229,FOLLOW_229_in_textureBlockDecl863);  
            stream_229.add(char_literal64);


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
            // 167:74: -> ^( TEXTUREBLOCK properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:77: ^( TEXTUREBLOCK properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:1: triggerDecl : ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) ;
    public final AtrophyScriptParser.triggerDecl_return triggerDecl() throws RecognitionException {
        AtrophyScriptParser.triggerDecl_return retval = new AtrophyScriptParser.triggerDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal65=null;
        Token string_literal66=null;
        Token char_literal68=null;
        Token char_literal70=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment67 =null;

        AtrophyScriptParser.properties_return properties69 =null;


        CommonTree string_literal65_tree=null;
        CommonTree string_literal66_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree char_literal70_tree=null;
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_218=new RewriteRuleTokenStream(adaptor,"token 218");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:12: ( ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:4: ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:4: ( 'TRIGGER' | 'trigger' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==141) ) {
                alt11=1;
            }
            else if ( (LA11_0==218) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:5: 'TRIGGER'
                    {
                    string_literal65=(Token)match(input,141,FOLLOW_141_in_triggerDecl887);  
                    stream_141.add(string_literal65);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:17: 'trigger'
                    {
                    string_literal66=(Token)match(input,218,FOLLOW_218_in_triggerDecl891);  
                    stream_218.add(string_literal66);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_triggerDecl894);
            requiredAssignment67=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment67.getTree());

            char_literal68=(Token)match(input,228,FOLLOW_228_in_triggerDecl896);  
            stream_228.add(char_literal68);


            pushFollow(FOLLOW_properties_in_triggerDecl898);
            properties69=properties();

            state._fsp--;

            stream_properties.add(properties69.getTree());

            char_literal70=(Token)match(input,229,FOLLOW_229_in_triggerDecl900);  
            stream_229.add(char_literal70);


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
            // 171:66: -> ^( TRIGGER requiredAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:69: ^( TRIGGER requiredAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:1: commandDecl : ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) ;
    public final AtrophyScriptParser.commandDecl_return commandDecl() throws RecognitionException {
        AtrophyScriptParser.commandDecl_return retval = new AtrophyScriptParser.commandDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal71=null;
        Token string_literal72=null;
        Token char_literal74=null;
        Token char_literal76=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment73 =null;

        AtrophyScriptParser.triggerEffectList_return triggerEffectList75 =null;


        CommonTree string_literal71_tree=null;
        CommonTree string_literal72_tree=null;
        CommonTree char_literal74_tree=null;
        CommonTree char_literal76_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:12: ( ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:4: ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:4: ( 'COMMAND' | 'command' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==124) ) {
                alt12=1;
            }
            else if ( (LA12_0==152) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:5: 'COMMAND'
                    {
                    string_literal71=(Token)match(input,124,FOLLOW_124_in_commandDecl926);  
                    stream_124.add(string_literal71);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:17: 'command'
                    {
                    string_literal72=(Token)match(input,152,FOLLOW_152_in_commandDecl930);  
                    stream_152.add(string_literal72);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_commandDecl933);
            requiredAssignment73=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment73.getTree());

            char_literal74=(Token)match(input,228,FOLLOW_228_in_commandDecl935);  
            stream_228.add(char_literal74);


            pushFollow(FOLLOW_triggerEffectList_in_commandDecl937);
            triggerEffectList75=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList75.getTree());

            char_literal76=(Token)match(input,229,FOLLOW_229_in_commandDecl939);  
            stream_229.add(char_literal76);


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
            // 175:73: -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:76: ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COMMAND, "COMMAND")
                , root_1);

                adaptor.addChild(root_1, stream_requiredAssignment.nextTree());

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:105: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:1: talkDecl : ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) ;
    public final AtrophyScriptParser.talkDecl_return talkDecl() throws RecognitionException {
        AtrophyScriptParser.talkDecl_return retval = new AtrophyScriptParser.talkDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal77=null;
        Token string_literal78=null;
        Token char_literal79=null;
        Token char_literal81=null;
        AtrophyScriptParser.properties_return properties80 =null;


        CommonTree string_literal77_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree char_literal81_tree=null;
        RewriteRuleTokenStream stream_210=new RewriteRuleTokenStream(adaptor,"token 210");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:9: ( ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:4: ( 'TALK' | 'talk' ) '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:4: ( 'TALK' | 'talk' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==139) ) {
                alt13=1;
            }
            else if ( (LA13_0==210) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:5: 'TALK'
                    {
                    string_literal77=(Token)match(input,139,FOLLOW_139_in_talkDecl969);  
                    stream_139.add(string_literal77);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:14: 'talk'
                    {
                    string_literal78=(Token)match(input,210,FOLLOW_210_in_talkDecl973);  
                    stream_210.add(string_literal78);


                    }
                    break;

            }


            char_literal79=(Token)match(input,228,FOLLOW_228_in_talkDecl976);  
            stream_228.add(char_literal79);


            pushFollow(FOLLOW_properties_in_talkDecl978);
            properties80=properties();

            state._fsp--;

            stream_properties.add(properties80.getTree());

            char_literal81=(Token)match(input,229,FOLLOW_229_in_talkDecl980);  
            stream_229.add(char_literal81);


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
            // 179:41: -> ^( TALK properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:44: ^( TALK properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:1: properties : ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )* ;
    public final AtrophyScriptParser.properties_return properties() throws RecognitionException {
        AtrophyScriptParser.properties_return retval = new AtrophyScriptParser.properties_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.xListProperty_return xListProperty82 =null;

        AtrophyScriptParser.yListProperty_return yListProperty83 =null;

        AtrophyScriptParser.factionTerritoryProperty_return factionTerritoryProperty84 =null;

        AtrophyScriptParser.factionZoneProperty_return factionZoneProperty85 =null;

        AtrophyScriptParser.saferoomProperty_return saferoomProperty86 =null;

        AtrophyScriptParser.stageProperty_return stageProperty87 =null;

        AtrophyScriptParser.stageDeclProperty_return stageDeclProperty88 =null;

        AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty89 =null;

        AtrophyScriptParser.aiInitProperty_return aiInitProperty90 =null;

        AtrophyScriptParser.openingLineProperty_return openingLineProperty91 =null;

        AtrophyScriptParser.optionProperty_return optionProperty92 =null;

        AtrophyScriptParser.topicProperty_return topicProperty93 =null;

        AtrophyScriptParser.triggerCondProperty_return triggerCondProperty94 =null;

        AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty95 =null;

        AtrophyScriptParser.coverDecl_return coverDecl96 =null;

        AtrophyScriptParser.stashDecl_return stashDecl97 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:11: ( ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )*
            loop14:
            do {
                int alt14=17;
                switch ( input.LA(1) ) {
                case 225:
                    {
                    alt14=1;
                    }
                    break;
                case 226:
                    {
                    alt14=2;
                    }
                    break;
                case 214:
                    {
                    alt14=3;
                    }
                    break;
                case 227:
                    {
                    alt14=4;
                    }
                    break;
                case 197:
                    {
                    alt14=5;
                    }
                    break;
                case 196:
                case 205:
                    {
                    alt14=6;
                    }
                    break;
                case 206:
                    {
                    alt14=7;
                    }
                    break;
                case 188:
                case 189:
                    {
                    alt14=8;
                    }
                    break;
                case 142:
                case 144:
                    {
                    alt14=9;
                    }
                    break;
                case 183:
                case 185:
                case 186:
                    {
                    alt14=10;
                    }
                    break;
                case 174:
                case 187:
                    {
                    alt14=11;
                    }
                    break;
                case 209:
                case 217:
                    {
                    alt14=12;
                    }
                    break;
                case 211:
                case 219:
                    {
                    alt14=13;
                    }
                    break;
                case 212:
                case 220:
                    {
                    alt14=14;
                    }
                    break;
                case 125:
                case 155:
                    {
                    alt14=15;
                    }
                    break;
                case 138:
                case 207:
                    {
                    alt14=16;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:5: xListProperty
            	    {
            	    pushFollow(FOLLOW_xListProperty_in_properties1004);
            	    xListProperty82=xListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xListProperty82.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:184:6: yListProperty
            	    {
            	    pushFollow(FOLLOW_yListProperty_in_properties1011);
            	    yListProperty83=yListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, yListProperty83.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:185:6: factionTerritoryProperty
            	    {
            	    pushFollow(FOLLOW_factionTerritoryProperty_in_properties1018);
            	    factionTerritoryProperty84=factionTerritoryProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionTerritoryProperty84.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:6: factionZoneProperty
            	    {
            	    pushFollow(FOLLOW_factionZoneProperty_in_properties1025);
            	    factionZoneProperty85=factionZoneProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionZoneProperty85.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:6: saferoomProperty
            	    {
            	    pushFollow(FOLLOW_saferoomProperty_in_properties1032);
            	    saferoomProperty86=saferoomProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, saferoomProperty86.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:188:6: stageProperty
            	    {
            	    pushFollow(FOLLOW_stageProperty_in_properties1039);
            	    stageProperty87=stageProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageProperty87.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:6: stageDeclProperty
            	    {
            	    pushFollow(FOLLOW_stageDeclProperty_in_properties1046);
            	    stageDeclProperty88=stageDeclProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageDeclProperty88.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:190:6: talkMapParentProperty
            	    {
            	    pushFollow(FOLLOW_talkMapParentProperty_in_properties1053);
            	    talkMapParentProperty89=talkMapParentProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, talkMapParentProperty89.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:6: aiInitProperty
            	    {
            	    pushFollow(FOLLOW_aiInitProperty_in_properties1060);
            	    aiInitProperty90=aiInitProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiInitProperty90.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:192:6: openingLineProperty
            	    {
            	    pushFollow(FOLLOW_openingLineProperty_in_properties1067);
            	    openingLineProperty91=openingLineProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, openingLineProperty91.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:6: optionProperty
            	    {
            	    pushFollow(FOLLOW_optionProperty_in_properties1074);
            	    optionProperty92=optionProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, optionProperty92.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:194:6: topicProperty
            	    {
            	    pushFollow(FOLLOW_topicProperty_in_properties1081);
            	    topicProperty93=topicProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicProperty93.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:6: triggerCondProperty
            	    {
            	    pushFollow(FOLLOW_triggerCondProperty_in_properties1088);
            	    triggerCondProperty94=triggerCondProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerCondProperty94.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:6: triggerEffectProperty
            	    {
            	    pushFollow(FOLLOW_triggerEffectProperty_in_properties1095);
            	    triggerEffectProperty95=triggerEffectProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffectProperty95.getTree());

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:6: coverDecl
            	    {
            	    pushFollow(FOLLOW_coverDecl_in_properties1102);
            	    coverDecl96=coverDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, coverDecl96.getTree());

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:198:6: stashDecl
            	    {
            	    pushFollow(FOLLOW_stashDecl_in_properties1109);
            	    stashDecl97=stashDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stashDecl97.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:1: xListProperty : 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) ;
    public final AtrophyScriptParser.xListProperty_return xListProperty() throws RecognitionException {
        AtrophyScriptParser.xListProperty_return retval = new AtrophyScriptParser.xListProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal98=null;
        Token INT99=null;
        Token char_literal100=null;
        Token INT101=null;

        CommonTree string_literal98_tree=null;
        CommonTree INT99_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree INT101_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_225=new RewriteRuleTokenStream(adaptor,"token 225");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:14: ( 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:4: 'x:' INT ( ',' INT )*
            {
            string_literal98=(Token)match(input,225,FOLLOW_225_in_xListProperty1126);  
            stream_225.add(string_literal98);


            INT99=(Token)match(input,INT,FOLLOW_INT_in_xListProperty1128);  
            stream_INT.add(INT99);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:13: ( ',' INT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==118) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:14: ',' INT
            	    {
            	    char_literal100=(Token)match(input,118,FOLLOW_118_in_xListProperty1131);  
            	    stream_118.add(char_literal100);


            	    INT101=(Token)match(input,INT,FOLLOW_INT_in_xListProperty1132);  
            	    stream_INT.add(INT101);


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
            // 202:23: -> ^( XLIST ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:26: ^( XLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(XLIST, "XLIST")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:34: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:1: yListProperty : 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) ;
    public final AtrophyScriptParser.yListProperty_return yListProperty() throws RecognitionException {
        AtrophyScriptParser.yListProperty_return retval = new AtrophyScriptParser.yListProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal102=null;
        Token INT103=null;
        Token char_literal104=null;
        Token INT105=null;

        CommonTree string_literal102_tree=null;
        CommonTree INT103_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree INT105_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_226=new RewriteRuleTokenStream(adaptor,"token 226");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:14: ( 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:4: 'y:' INT ( ',' INT )*
            {
            string_literal102=(Token)match(input,226,FOLLOW_226_in_yListProperty1156);  
            stream_226.add(string_literal102);


            INT103=(Token)match(input,INT,FOLLOW_INT_in_yListProperty1158);  
            stream_INT.add(INT103);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:13: ( ',' INT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==118) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:14: ',' INT
            	    {
            	    char_literal104=(Token)match(input,118,FOLLOW_118_in_yListProperty1161);  
            	    stream_118.add(char_literal104);


            	    INT105=(Token)match(input,INT,FOLLOW_INT_in_yListProperty1162);  
            	    stream_INT.add(INT105);


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
            // 206:23: -> ^( YLIST ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:26: ^( YLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(YLIST, "YLIST")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:34: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:1: factionTerritoryProperty : 'territory:' stringLiteral INT -> ^( TERRITORY ^( STRING stringLiteral ) INT ) ;
    public final AtrophyScriptParser.factionTerritoryProperty_return factionTerritoryProperty() throws RecognitionException {
        AtrophyScriptParser.factionTerritoryProperty_return retval = new AtrophyScriptParser.factionTerritoryProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal106=null;
        Token INT108=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral107 =null;


        CommonTree string_literal106_tree=null;
        CommonTree INT108_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:25: ( 'territory:' stringLiteral INT -> ^( TERRITORY ^( STRING stringLiteral ) INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:4: 'territory:' stringLiteral INT
            {
            string_literal106=(Token)match(input,214,FOLLOW_214_in_factionTerritoryProperty1188);  
            stream_214.add(string_literal106);


            pushFollow(FOLLOW_stringLiteral_in_factionTerritoryProperty1190);
            stringLiteral107=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral107.getTree());

            INT108=(Token)match(input,INT,FOLLOW_INT_in_factionTerritoryProperty1192);  
            stream_INT.add(INT108);


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
            // 210:35: -> ^( TERRITORY ^( STRING stringLiteral ) INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:38: ^( TERRITORY ^( STRING stringLiteral ) INT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TERRITORY, "TERRITORY")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:50: ^( STRING stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:1: factionZoneProperty : 'zone:' stringList -> ^( ZONE stringList ) ;
    public final AtrophyScriptParser.factionZoneProperty_return factionZoneProperty() throws RecognitionException {
        AtrophyScriptParser.factionZoneProperty_return retval = new AtrophyScriptParser.factionZoneProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal109=null;
        AtrophyScriptParser.stringList_return stringList110 =null;


        CommonTree string_literal109_tree=null;
        RewriteRuleTokenStream stream_227=new RewriteRuleTokenStream(adaptor,"token 227");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:20: ( 'zone:' stringList -> ^( ZONE stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:4: 'zone:' stringList
            {
            string_literal109=(Token)match(input,227,FOLLOW_227_in_factionZoneProperty1221);  
            stream_227.add(string_literal109);


            pushFollow(FOLLOW_stringList_in_factionZoneProperty1223);
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
            // 214:23: -> ^( ZONE stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:26: ^( ZONE stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:1: saferoomProperty : 'saferoom' -> ^( SAFEROOM ) ;
    public final AtrophyScriptParser.saferoomProperty_return saferoomProperty() throws RecognitionException {
        AtrophyScriptParser.saferoomProperty_return retval = new AtrophyScriptParser.saferoomProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal111=null;

        CommonTree string_literal111_tree=null;
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:17: ( 'saferoom' -> ^( SAFEROOM ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:4: 'saferoom'
            {
            string_literal111=(Token)match(input,197,FOLLOW_197_in_saferoomProperty1246);  
            stream_197.add(string_literal111);


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
            // 218:15: -> ^( SAFEROOM )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:18: ^( SAFEROOM )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:1: stageDeclProperty : 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) ;
    public final AtrophyScriptParser.stageDeclProperty_return stageDeclProperty() throws RecognitionException {
        AtrophyScriptParser.stageDeclProperty_return retval = new AtrophyScriptParser.stageDeclProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal112=null;
        Token INT113=null;
        Token char_literal114=null;
        Token INT115=null;

        CommonTree string_literal112_tree=null;
        CommonTree INT113_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree INT115_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:18: ( 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:4: 'stages:' INT ( ',' INT )*
            {
            string_literal112=(Token)match(input,206,FOLLOW_206_in_stageDeclProperty1267);  
            stream_206.add(string_literal112);


            INT113=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1269);  
            stream_INT.add(INT113);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:18: ( ',' INT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==118) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:19: ',' INT
            	    {
            	    char_literal114=(Token)match(input,118,FOLLOW_118_in_stageDeclProperty1272);  
            	    stream_118.add(char_literal114);


            	    INT115=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1274);  
            	    stream_INT.add(INT115);


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
            // 222:29: -> ^( STAGELIST ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:32: ^( STAGELIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STAGELIST, "STAGELIST")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:44: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:1: talkMapParentProperty : ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) ;
    public final AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty() throws RecognitionException {
        AtrophyScriptParser.talkMapParentProperty_return retval = new AtrophyScriptParser.talkMapParentProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal116=null;
        Token string_literal117=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral118 =null;


        CommonTree string_literal116_tree=null;
        CommonTree string_literal117_tree=null;
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:22: ( ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:4: ( 'parent:' | 'p:' ) stringLiteral
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:4: ( 'parent:' | 'p:' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==189) ) {
                alt18=1;
            }
            else if ( (LA18_0==188) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:5: 'parent:'
                    {
                    string_literal116=(Token)match(input,189,FOLLOW_189_in_talkMapParentProperty1301);  
                    stream_189.add(string_literal116);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:17: 'p:'
                    {
                    string_literal117=(Token)match(input,188,FOLLOW_188_in_talkMapParentProperty1305);  
                    stream_188.add(string_literal117);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_talkMapParentProperty1308);
            stringLiteral118=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral118.getTree());

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
            // 226:37: -> ^( TALKPARENT stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:40: ^( TALKPARENT stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:1: stageProperty : ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) ;
    public final AtrophyScriptParser.stageProperty_return stageProperty() throws RecognitionException {
        AtrophyScriptParser.stageProperty_return retval = new AtrophyScriptParser.stageProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal119=null;
        Token string_literal120=null;
        Token INT121=null;

        CommonTree string_literal119_tree=null;
        CommonTree string_literal120_tree=null;
        CommonTree INT121_tree=null;
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:14: ( ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:4: ( 'stage:' | 's:' ) INT
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:4: ( 'stage:' | 's:' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==205) ) {
                alt19=1;
            }
            else if ( (LA19_0==196) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:5: 'stage:'
                    {
                    string_literal119=(Token)match(input,205,FOLLOW_205_in_stageProperty1332);  
                    stream_205.add(string_literal119);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:16: 's:'
                    {
                    string_literal120=(Token)match(input,196,FOLLOW_196_in_stageProperty1336);  
                    stream_196.add(string_literal120);


                    }
                    break;

            }


            INT121=(Token)match(input,INT,FOLLOW_INT_in_stageProperty1339);  
            stream_INT.add(INT121);


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
            // 230:26: -> ^( TALKSTAGE INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:29: ^( TALKSTAGE INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:1: aiInitProperty : ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) ;
    public final AtrophyScriptParser.aiInitProperty_return aiInitProperty() throws RecognitionException {
        AtrophyScriptParser.aiInitProperty_return retval = new AtrophyScriptParser.aiInitProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal122=null;
        Token string_literal123=null;
        Token BOOL124=null;

        CommonTree string_literal122_tree=null;
        CommonTree string_literal123_tree=null;
        CommonTree BOOL124_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:15: ( ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:4: ( 'aiInit:' | 'a:' ) BOOL
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:4: ( 'aiInit:' | 'a:' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==144) ) {
                alt20=1;
            }
            else if ( (LA20_0==142) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:5: 'aiInit:'
                    {
                    string_literal122=(Token)match(input,144,FOLLOW_144_in_aiInitProperty1363);  
                    stream_144.add(string_literal122);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:17: 'a:'
                    {
                    string_literal123=(Token)match(input,142,FOLLOW_142_in_aiInitProperty1367);  
                    stream_142.add(string_literal123);


                    }
                    break;

            }


            BOOL124=(Token)match(input,BOOL,FOLLOW_BOOL_in_aiInitProperty1370);  
            stream_BOOL.add(BOOL124);


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
            // 234:28: -> ^( AIINIT BOOL )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:31: ^( AIINIT BOOL )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:1: openingLineProperty : ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) ;
    public final AtrophyScriptParser.openingLineProperty_return openingLineProperty() throws RecognitionException {
        AtrophyScriptParser.openingLineProperty_return retval = new AtrophyScriptParser.openingLineProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal125=null;
        Token string_literal126=null;
        Token string_literal127=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral128 =null;


        CommonTree string_literal125_tree=null;
        CommonTree string_literal126_tree=null;
        CommonTree string_literal127_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:20: ( ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:4: ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:4: ( 'o:' | 'opening:' | 'openingLine:' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 183:
                {
                alt21=1;
                }
                break;
            case 185:
                {
                alt21=2;
                }
                break;
            case 186:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:5: 'o:'
                    {
                    string_literal125=(Token)match(input,183,FOLLOW_183_in_openingLineProperty1394);  
                    stream_183.add(string_literal125);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:12: 'opening:'
                    {
                    string_literal126=(Token)match(input,185,FOLLOW_185_in_openingLineProperty1398);  
                    stream_185.add(string_literal126);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:25: 'openingLine:'
                    {
                    string_literal127=(Token)match(input,186,FOLLOW_186_in_openingLineProperty1402);  
                    stream_186.add(string_literal127);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_openingLineProperty1405);
            stringLiteral128=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral128.getTree());

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
            // 238:55: -> ^( OPENINGLINE stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:58: ^( OPENINGLINE stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:1: optionProperty : ( 'l:' | 'option:' ) stringLiteral -> ^( OPTION stringLiteral ) ;
    public final AtrophyScriptParser.optionProperty_return optionProperty() throws RecognitionException {
        AtrophyScriptParser.optionProperty_return retval = new AtrophyScriptParser.optionProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal129=null;
        Token string_literal130=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral131 =null;


        CommonTree string_literal129_tree=null;
        CommonTree string_literal130_tree=null;
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:15: ( ( 'l:' | 'option:' ) stringLiteral -> ^( OPTION stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:4: ( 'l:' | 'option:' ) stringLiteral
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:4: ( 'l:' | 'option:' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==174) ) {
                alt22=1;
            }
            else if ( (LA22_0==187) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:5: 'l:'
                    {
                    string_literal129=(Token)match(input,174,FOLLOW_174_in_optionProperty1427);  
                    stream_174.add(string_literal129);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:12: 'option:'
                    {
                    string_literal130=(Token)match(input,187,FOLLOW_187_in_optionProperty1431);  
                    stream_187.add(string_literal130);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_optionProperty1434);
            stringLiteral131=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral131.getTree());

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
            // 242:37: -> ^( OPTION stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:40: ^( OPTION stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:1: topicProperty : ( 't' | 'topic' ) requiredAssignment '{' topicProperties '}' -> ^( TOPIC requiredAssignment topicProperties ) ;
    public final AtrophyScriptParser.topicProperty_return topicProperty() throws RecognitionException {
        AtrophyScriptParser.topicProperty_return retval = new AtrophyScriptParser.topicProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal132=null;
        Token string_literal133=null;
        Token char_literal135=null;
        Token char_literal137=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment134 =null;

        AtrophyScriptParser.topicProperties_return topicProperties136 =null;


        CommonTree char_literal132_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree char_literal135_tree=null;
        CommonTree char_literal137_tree=null;
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_217=new RewriteRuleTokenStream(adaptor,"token 217");
        RewriteRuleTokenStream stream_209=new RewriteRuleTokenStream(adaptor,"token 209");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_topicProperties=new RewriteRuleSubtreeStream(adaptor,"rule topicProperties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:14: ( ( 't' | 'topic' ) requiredAssignment '{' topicProperties '}' -> ^( TOPIC requiredAssignment topicProperties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:4: ( 't' | 'topic' ) requiredAssignment '{' topicProperties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:4: ( 't' | 'topic' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==209) ) {
                alt23=1;
            }
            else if ( (LA23_0==217) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:5: 't'
                    {
                    char_literal132=(Token)match(input,209,FOLLOW_209_in_topicProperty1458);  
                    stream_209.add(char_literal132);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:11: 'topic'
                    {
                    string_literal133=(Token)match(input,217,FOLLOW_217_in_topicProperty1462);  
                    stream_217.add(string_literal133);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_topicProperty1465);
            requiredAssignment134=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment134.getTree());

            char_literal135=(Token)match(input,228,FOLLOW_228_in_topicProperty1467);  
            stream_228.add(char_literal135);


            pushFollow(FOLLOW_topicProperties_in_topicProperty1469);
            topicProperties136=topicProperties();

            state._fsp--;

            stream_topicProperties.add(topicProperties136.getTree());

            char_literal137=(Token)match(input,229,FOLLOW_229_in_topicProperty1471);  
            stream_229.add(char_literal137);


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
            // 246:63: -> ^( TOPIC requiredAssignment topicProperties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:66: ^( TOPIC requiredAssignment topicProperties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:1: topicProperties : ( topicLine | topicRequiement )* ;
    public final AtrophyScriptParser.topicProperties_return topicProperties() throws RecognitionException {
        AtrophyScriptParser.topicProperties_return retval = new AtrophyScriptParser.topicProperties_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.topicLine_return topicLine138 =null;

        AtrophyScriptParser.topicRequiement_return topicRequiement139 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:16: ( ( topicLine | topicRequiement )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:4: ( topicLine | topicRequiement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:4: ( topicLine | topicRequiement )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==175) ) {
                    alt24=1;
                }
                else if ( (LA24_0==195) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:5: topicLine
            	    {
            	    pushFollow(FOLLOW_topicLine_in_topicProperties1498);
            	    topicLine138=topicLine();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicLine138.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:17: topicRequiement
            	    {
            	    pushFollow(FOLLOW_topicRequiement_in_topicProperties1502);
            	    topicRequiement139=topicRequiement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicRequiement139.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:253:1: topicLine : 'lines:' stringLiteral ( ',' stringLiteral )* -> ( ^( LINE stringLiteral ) )* ;
    public final AtrophyScriptParser.topicLine_return topicLine() throws RecognitionException {
        AtrophyScriptParser.topicLine_return retval = new AtrophyScriptParser.topicLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal140=null;
        Token char_literal142=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral141 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral143 =null;


        CommonTree string_literal140_tree=null;
        CommonTree char_literal142_tree=null;
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:253:10: ( 'lines:' stringLiteral ( ',' stringLiteral )* -> ( ^( LINE stringLiteral ) )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:4: 'lines:' stringLiteral ( ',' stringLiteral )*
            {
            string_literal140=(Token)match(input,175,FOLLOW_175_in_topicLine1519);  
            stream_175.add(string_literal140);


            pushFollow(FOLLOW_stringLiteral_in_topicLine1520);
            stringLiteral141=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral141.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:26: ( ',' stringLiteral )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==118) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:27: ',' stringLiteral
            	    {
            	    char_literal142=(Token)match(input,118,FOLLOW_118_in_topicLine1523);  
            	    stream_118.add(char_literal142);


            	    pushFollow(FOLLOW_stringLiteral_in_topicLine1525);
            	    stringLiteral143=stringLiteral();

            	    state._fsp--;

            	    stream_stringLiteral.add(stringLiteral143.getTree());

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
            // 254:47: -> ( ^( LINE stringLiteral ) )*
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:50: ( ^( LINE stringLiteral ) )*
                while ( stream_stringLiteral.hasNext() ) {
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:50: ^( LINE stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:1: topicRequiement : 'req:' reqString ( ',' reqString )* -> ( ^( REQ reqString ) )* ;
    public final AtrophyScriptParser.topicRequiement_return topicRequiement() throws RecognitionException {
        AtrophyScriptParser.topicRequiement_return retval = new AtrophyScriptParser.topicRequiement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal144=null;
        Token char_literal146=null;
        AtrophyScriptParser.reqString_return reqString145 =null;

        AtrophyScriptParser.reqString_return reqString147 =null;


        CommonTree string_literal144_tree=null;
        CommonTree char_literal146_tree=null;
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_reqString=new RewriteRuleSubtreeStream(adaptor,"rule reqString");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:16: ( 'req:' reqString ( ',' reqString )* -> ( ^( REQ reqString ) )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:4: 'req:' reqString ( ',' reqString )*
            {
            string_literal144=(Token)match(input,195,FOLLOW_195_in_topicRequiement1551);  
            stream_195.add(string_literal144);


            pushFollow(FOLLOW_reqString_in_topicRequiement1553);
            reqString145=reqString();

            state._fsp--;

            stream_reqString.add(reqString145.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:21: ( ',' reqString )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==118) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:22: ',' reqString
            	    {
            	    char_literal146=(Token)match(input,118,FOLLOW_118_in_topicRequiement1556);  
            	    stream_118.add(char_literal146);


            	    pushFollow(FOLLOW_reqString_in_topicRequiement1558);
            	    reqString147=reqString();

            	    state._fsp--;

            	    stream_reqString.add(reqString147.getTree());

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
            // 258:38: -> ( ^( REQ reqString ) )*
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:41: ( ^( REQ reqString ) )*
                while ( stream_reqString.hasNext() ) {
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:41: ^( REQ reqString )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:1: reqString : ( NOT_PREFIX stringLiteral -> ^( NEGATION stringLiteral ) | stringLiteral );
    public final AtrophyScriptParser.reqString_return reqString() throws RecognitionException {
        AtrophyScriptParser.reqString_return retval = new AtrophyScriptParser.reqString_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NOT_PREFIX148=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral149 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral150 =null;


        CommonTree NOT_PREFIX148_tree=null;
        RewriteRuleTokenStream stream_NOT_PREFIX=new RewriteRuleTokenStream(adaptor,"token NOT_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:10: ( NOT_PREFIX stringLiteral -> ^( NEGATION stringLiteral ) | stringLiteral )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==NOT_PREFIX) ) {
                alt27=1;
            }
            else if ( (LA27_0==114) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:4: NOT_PREFIX stringLiteral
                    {
                    NOT_PREFIX148=(Token)match(input,NOT_PREFIX,FOLLOW_NOT_PREFIX_in_reqString1584);  
                    stream_NOT_PREFIX.add(NOT_PREFIX148);


                    pushFollow(FOLLOW_stringLiteral_in_reqString1586);
                    stringLiteral149=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral149.getTree());

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
                    // 262:29: -> ^( NEGATION stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:32: ^( NEGATION stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:263:6: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stringLiteral_in_reqString1601);
                    stringLiteral150=stringLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, stringLiteral150.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:1: aliveQuery : 'isAlive' '{' unitInfo '}' -> ^( ISALIVE unitInfo ) ;
    public final AtrophyScriptParser.aliveQuery_return aliveQuery() throws RecognitionException {
        AtrophyScriptParser.aliveQuery_return retval = new AtrophyScriptParser.aliveQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal151=null;
        Token char_literal152=null;
        Token char_literal154=null;
        AtrophyScriptParser.unitInfo_return unitInfo153 =null;


        CommonTree string_literal151_tree=null;
        CommonTree char_literal152_tree=null;
        CommonTree char_literal154_tree=null;
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:11: ( 'isAlive' '{' unitInfo '}' -> ^( ISALIVE unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:267:4: 'isAlive' '{' unitInfo '}'
            {
            string_literal151=(Token)match(input,163,FOLLOW_163_in_aliveQuery1616);  
            stream_163.add(string_literal151);


            char_literal152=(Token)match(input,228,FOLLOW_228_in_aliveQuery1618);  
            stream_228.add(char_literal152);


            pushFollow(FOLLOW_unitInfo_in_aliveQuery1620);
            unitInfo153=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo153.getTree());

            char_literal154=(Token)match(input,229,FOLLOW_229_in_aliveQuery1622);  
            stream_229.add(char_literal154);


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
            // 267:31: -> ^( ISALIVE unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:267:34: ^( ISALIVE unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:1: timeQuery : 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) ) ;
    public final AtrophyScriptParser.timeQuery_return timeQuery() throws RecognitionException {
        AtrophyScriptParser.timeQuery_return retval = new AtrophyScriptParser.timeQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal155=null;
        Token INT156=null;
        Token string_literal157=null;
        Token INT158=null;
        Token string_literal159=null;
        Token INT160=null;

        CommonTree string_literal155_tree=null;
        CommonTree INT156_tree=null;
        CommonTree string_literal157_tree=null;
        CommonTree INT158_tree=null;
        CommonTree string_literal159_tree=null;
        CommonTree INT160_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:10: ( 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:271:4: 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) )
            {
            string_literal155=(Token)match(input,184,FOLLOW_184_in_timeQuery1645);  
            stream_184.add(string_literal155);


            INT156=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1647);  
            stream_INT.add(INT156);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:4: ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 160:
                {
                alt28=1;
                }
                break;
            case 159:
                {
                alt28=2;
                }
                break;
            case 117:
            case 122:
            case 134:
            case 229:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:5: 'expireTime:' INT
                    {
                    string_literal157=(Token)match(input,160,FOLLOW_160_in_timeQuery1653);  
                    stream_160.add(string_literal157);


                    INT158=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1655);  
                    stream_INT.add(INT158);


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
                    // 272:23: -> ^( ONTIME INT ^( EXPIRETIME INT ) )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:26: ^( ONTIME INT ^( EXPIRETIME INT ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ONTIME, "ONTIME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:272:39: ^( EXPIRETIME INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:273:5: 'expireRepeats:' INT
                    {
                    string_literal159=(Token)match(input,159,FOLLOW_159_in_timeQuery1675);  
                    stream_159.add(string_literal159);


                    INT160=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1677);  
                    stream_INT.add(INT160);


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
                    // 273:26: -> ^( ONTIME INT ^( EXPIREREPEATS INT ) )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:273:29: ^( ONTIME INT ^( EXPIREREPEATS INT ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ONTIME, "ONTIME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:273:42: ^( EXPIREREPEATS INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:274:6: 
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
                    // 274:6: -> ^( ONTIME INT EMPTY )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:274:9: ^( ONTIME INT EMPTY )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:1: boolQuery : ( '(' ! queryLogic ')' !| aliveQuery | timeQuery );
    public final AtrophyScriptParser.boolQuery_return boolQuery() throws RecognitionException {
        AtrophyScriptParser.boolQuery_return retval = new AtrophyScriptParser.boolQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal161=null;
        Token char_literal163=null;
        AtrophyScriptParser.queryLogic_return queryLogic162 =null;

        AtrophyScriptParser.aliveQuery_return aliveQuery164 =null;

        AtrophyScriptParser.timeQuery_return timeQuery165 =null;


        CommonTree char_literal161_tree=null;
        CommonTree char_literal163_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:277:10: ( '(' ! queryLogic ')' !| aliveQuery | timeQuery )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt29=1;
                }
                break;
            case 163:
                {
                alt29=2;
                }
                break;
            case 184:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:278:3: '(' ! queryLogic ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal161=(Token)match(input,116,FOLLOW_116_in_boolQuery1719); 

                    pushFollow(FOLLOW_queryLogic_in_boolQuery1722);
                    queryLogic162=queryLogic();

                    state._fsp--;

                    adaptor.addChild(root_0, queryLogic162.getTree());

                    char_literal163=(Token)match(input,117,FOLLOW_117_in_boolQuery1724); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:279:5: aliveQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_aliveQuery_in_boolQuery1731);
                    aliveQuery164=aliveQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, aliveQuery164.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:5: timeQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeQuery_in_boolQuery1737);
                    timeQuery165=timeQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, timeQuery165.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:283:1: queryNegation : ( boolQuery | '!' boolQuery -> ^( NEGATION boolQuery ) );
    public final AtrophyScriptParser.queryNegation_return queryNegation() throws RecognitionException {
        AtrophyScriptParser.queryNegation_return retval = new AtrophyScriptParser.queryNegation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal167=null;
        AtrophyScriptParser.boolQuery_return boolQuery166 =null;

        AtrophyScriptParser.boolQuery_return boolQuery168 =null;


        CommonTree char_literal167_tree=null;
        RewriteRuleTokenStream stream_NOT_PREFIX=new RewriteRuleTokenStream(adaptor,"token NOT_PREFIX");
        RewriteRuleSubtreeStream stream_boolQuery=new RewriteRuleSubtreeStream(adaptor,"rule boolQuery");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:283:14: ( boolQuery | '!' boolQuery -> ^( NEGATION boolQuery ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==116||LA30_0==163||LA30_0==184) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:284:3: boolQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_boolQuery_in_queryNegation1751);
                    boolQuery166=boolQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, boolQuery166.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:4: '!' boolQuery
                    {
                    char_literal167=(Token)match(input,NOT_PREFIX,FOLLOW_NOT_PREFIX_in_queryNegation1756);  
                    stream_NOT_PREFIX.add(char_literal167);


                    pushFollow(FOLLOW_boolQuery_in_queryNegation1758);
                    boolQuery168=boolQuery();

                    state._fsp--;

                    stream_boolQuery.add(boolQuery168.getTree());

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
                    // 285:18: -> ^( NEGATION boolQuery )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:21: ^( NEGATION boolQuery )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:288:1: queryLogic : b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) ) ;
    public final AtrophyScriptParser.queryLogic_return queryLogic() throws RecognitionException {
        AtrophyScriptParser.queryLogic_return retval = new AtrophyScriptParser.queryLogic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal169=null;
        Token string_literal170=null;
        AtrophyScriptParser.queryNegation_return b1 =null;

        AtrophyScriptParser.queryNegation_return b2 =null;


        CommonTree string_literal169_tree=null;
        CommonTree string_literal170_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleSubtreeStream stream_queryNegation=new RewriteRuleSubtreeStream(adaptor,"rule queryNegation");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:288:11: (b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:289:3: b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) )
            {
            pushFollow(FOLLOW_queryNegation_in_queryLogic1782);
            b1=queryNegation();

            state._fsp--;

            stream_queryNegation.add(b1.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:290:3: ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 122:
                {
                alt31=1;
                }
                break;
            case 134:
                {
                alt31=2;
                }
                break;
            case 117:
            case 229:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:290:4: 'AND' b2= queryNegation
                    {
                    string_literal169=(Token)match(input,122,FOLLOW_122_in_queryLogic1787);  
                    stream_122.add(string_literal169);


                    pushFollow(FOLLOW_queryNegation_in_queryLogic1791);
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
                    // 290:27: -> ^( AND $b1 $b2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:290:30: ^( AND $b1 $b2)
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:291:4: 'OR' b2= queryNegation
                    {
                    string_literal170=(Token)match(input,134,FOLLOW_134_in_queryLogic1808);  
                    stream_134.add(string_literal170);


                    pushFollow(FOLLOW_queryNegation_in_queryLogic1812);
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
                    // 291:26: -> ^( OR $b1 $b2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:291:29: ^( OR $b1 $b2)
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:292:5: 
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
                    // 292:5: -> ^( LOGIC $b1)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:292:8: ^( LOGIC $b1)
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:295:1: triggerCondProperty : ( 'tc' | 'triggerCond' ) '{' queryLogic '}' -> ^( TRIGGERCOND queryLogic ) ;
    public final AtrophyScriptParser.triggerCondProperty_return triggerCondProperty() throws RecognitionException {
        AtrophyScriptParser.triggerCondProperty_return retval = new AtrophyScriptParser.triggerCondProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal171=null;
        Token string_literal172=null;
        Token char_literal173=null;
        Token char_literal175=null;
        AtrophyScriptParser.queryLogic_return queryLogic174 =null;


        CommonTree string_literal171_tree=null;
        CommonTree string_literal172_tree=null;
        CommonTree char_literal173_tree=null;
        CommonTree char_literal175_tree=null;
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_219=new RewriteRuleTokenStream(adaptor,"token 219");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_queryLogic=new RewriteRuleSubtreeStream(adaptor,"rule queryLogic");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:295:20: ( ( 'tc' | 'triggerCond' ) '{' queryLogic '}' -> ^( TRIGGERCOND queryLogic ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:296:4: ( 'tc' | 'triggerCond' ) '{' queryLogic '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:296:4: ( 'tc' | 'triggerCond' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==211) ) {
                alt32=1;
            }
            else if ( (LA32_0==219) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:296:5: 'tc'
                    {
                    string_literal171=(Token)match(input,211,FOLLOW_211_in_triggerCondProperty1852);  
                    stream_211.add(string_literal171);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:296:12: 'triggerCond'
                    {
                    string_literal172=(Token)match(input,219,FOLLOW_219_in_triggerCondProperty1856);  
                    stream_219.add(string_literal172);


                    }
                    break;

            }


            char_literal173=(Token)match(input,228,FOLLOW_228_in_triggerCondProperty1859);  
            stream_228.add(char_literal173);


            pushFollow(FOLLOW_queryLogic_in_triggerCondProperty1861);
            queryLogic174=queryLogic();

            state._fsp--;

            stream_queryLogic.add(queryLogic174.getTree());

            char_literal175=(Token)match(input,229,FOLLOW_229_in_triggerCondProperty1863);  
            stream_229.add(char_literal175);


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
            // 296:46: -> ^( TRIGGERCOND queryLogic )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:296:49: ^( TRIGGERCOND queryLogic )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:1: triggerEffectProperty : ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) ;
    public final AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty() throws RecognitionException {
        AtrophyScriptParser.triggerEffectProperty_return retval = new AtrophyScriptParser.triggerEffectProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal176=null;
        Token string_literal177=null;
        Token char_literal178=null;
        Token char_literal180=null;
        AtrophyScriptParser.triggerEffectList_return triggerEffectList179 =null;


        CommonTree string_literal176_tree=null;
        CommonTree string_literal177_tree=null;
        CommonTree char_literal178_tree=null;
        CommonTree char_literal180_tree=null;
        RewriteRuleTokenStream stream_220=new RewriteRuleTokenStream(adaptor,"token 220");
        RewriteRuleTokenStream stream_212=new RewriteRuleTokenStream(adaptor,"token 212");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:22: ( ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:300:4: ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:300:4: ( 'te' | 'triggerEffect' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==212) ) {
                alt33=1;
            }
            else if ( (LA33_0==220) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:300:5: 'te'
                    {
                    string_literal176=(Token)match(input,212,FOLLOW_212_in_triggerEffectProperty1885);  
                    stream_212.add(string_literal176);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:300:12: 'triggerEffect'
                    {
                    string_literal177=(Token)match(input,220,FOLLOW_220_in_triggerEffectProperty1889);  
                    stream_220.add(string_literal177);


                    }
                    break;

            }


            char_literal178=(Token)match(input,228,FOLLOW_228_in_triggerEffectProperty1892);  
            stream_228.add(char_literal178);


            pushFollow(FOLLOW_triggerEffectList_in_triggerEffectProperty1894);
            triggerEffectList179=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList179.getTree());

            char_literal180=(Token)match(input,229,FOLLOW_229_in_triggerEffectProperty1896);  
            stream_229.add(char_literal180);


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
            // 300:55: -> ^( TRIGGEREFFECT triggerEffectList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:300:58: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:303:1: coverDecl : ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) ;
    public final AtrophyScriptParser.coverDecl_return coverDecl() throws RecognitionException {
        AtrophyScriptParser.coverDecl_return retval = new AtrophyScriptParser.coverDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal181=null;
        Token string_literal182=null;
        Token char_literal184=null;
        Token char_literal186=null;
        AtrophyScriptParser.varAssignment_return varAssignment183 =null;

        AtrophyScriptParser.properties_return properties185 =null;


        CommonTree string_literal181_tree=null;
        CommonTree string_literal182_tree=null;
        CommonTree char_literal184_tree=null;
        CommonTree char_literal186_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:303:10: ( ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:4: ( 'COVER' | 'cover' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:4: ( 'COVER' | 'cover' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==125) ) {
                alt34=1;
            }
            else if ( (LA34_0==155) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:5: 'COVER'
                    {
                    string_literal181=(Token)match(input,125,FOLLOW_125_in_coverDecl1920);  
                    stream_125.add(string_literal181);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:15: 'cover'
                    {
                    string_literal182=(Token)match(input,155,FOLLOW_155_in_coverDecl1924);  
                    stream_155.add(string_literal182);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_coverDecl1927);
            varAssignment183=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment183.getTree());

            char_literal184=(Token)match(input,228,FOLLOW_228_in_coverDecl1929);  
            stream_228.add(char_literal184);


            pushFollow(FOLLOW_properties_in_coverDecl1931);
            properties185=properties();

            state._fsp--;

            stream_properties.add(properties185.getTree());

            char_literal186=(Token)match(input,229,FOLLOW_229_in_coverDecl1933);  
            stream_229.add(char_literal186);


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
            // 304:57: -> ^( COVER varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:60: ^( COVER varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:307:1: stashDecl : ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) ;
    public final AtrophyScriptParser.stashDecl_return stashDecl() throws RecognitionException {
        AtrophyScriptParser.stashDecl_return retval = new AtrophyScriptParser.stashDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal187=null;
        Token string_literal188=null;
        Token char_literal190=null;
        Token char_literal192=null;
        AtrophyScriptParser.varAssignment_return varAssignment189 =null;

        AtrophyScriptParser.properties_return properties191 =null;


        CommonTree string_literal187_tree=null;
        CommonTree string_literal188_tree=null;
        CommonTree char_literal190_tree=null;
        CommonTree char_literal192_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:307:10: ( ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:4: ( 'STASH' | 'stash' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:4: ( 'STASH' | 'stash' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==138) ) {
                alt35=1;
            }
            else if ( (LA35_0==207) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:5: 'STASH'
                    {
                    string_literal187=(Token)match(input,138,FOLLOW_138_in_stashDecl1959);  
                    stream_138.add(string_literal187);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:15: 'stash'
                    {
                    string_literal188=(Token)match(input,207,FOLLOW_207_in_stashDecl1963);  
                    stream_207.add(string_literal188);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_stashDecl1966);
            varAssignment189=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment189.getTree());

            char_literal190=(Token)match(input,228,FOLLOW_228_in_stashDecl1968);  
            stream_228.add(char_literal190);


            pushFollow(FOLLOW_properties_in_stashDecl1970);
            properties191=properties();

            state._fsp--;

            stream_properties.add(properties191.getTree());

            char_literal192=(Token)match(input,229,FOLLOW_229_in_stashDecl1972);  
            stream_229.add(char_literal192);


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
            // 308:57: -> ^( STASH varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:60: ^( STASH varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:311:1: triggerEffectList : triggerEffect ( ',' ! triggerEffect )* ;
    public final AtrophyScriptParser.triggerEffectList_return triggerEffectList() throws RecognitionException {
        AtrophyScriptParser.triggerEffectList_return retval = new AtrophyScriptParser.triggerEffectList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal194=null;
        AtrophyScriptParser.triggerEffect_return triggerEffect193 =null;

        AtrophyScriptParser.triggerEffect_return triggerEffect195 =null;


        CommonTree char_literal194_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:311:18: ( triggerEffect ( ',' ! triggerEffect )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:312:4: triggerEffect ( ',' ! triggerEffect )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_triggerEffect_in_triggerEffectList1995);
            triggerEffect193=triggerEffect();

            state._fsp--;

            adaptor.addChild(root_0, triggerEffect193.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:312:18: ( ',' ! triggerEffect )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==118) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:312:19: ',' ! triggerEffect
            	    {
            	    char_literal194=(Token)match(input,118,FOLLOW_118_in_triggerEffectList1998); 

            	    pushFollow(FOLLOW_triggerEffect_in_triggerEffectList2001);
            	    triggerEffect195=triggerEffect();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffect195.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:315:1: triggerEffect : ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | showMessage | setTriggerRunning | spawnItem | spawnTalkNode | unlockTech | changeStat | commandCallList );
    public final AtrophyScriptParser.triggerEffect_return triggerEffect() throws RecognitionException {
        AtrophyScriptParser.triggerEffect_return retval = new AtrophyScriptParser.triggerEffect_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.updateTalkTree_return updateTalkTree196 =null;

        AtrophyScriptParser.spawnTeam_return spawnTeam197 =null;

        AtrophyScriptParser.spawnCharacter_return spawnCharacter198 =null;

        AtrophyScriptParser.removeUnit_return removeUnit199 =null;

        AtrophyScriptParser.killUnit_return killUnit200 =null;

        AtrophyScriptParser.teleportUnit_return teleportUnit201 =null;

        AtrophyScriptParser.converseUnit_return converseUnit202 =null;

        AtrophyScriptParser.createSaferoom_return createSaferoom203 =null;

        AtrophyScriptParser.removeSaferoom_return removeSaferoom204 =null;

        AtrophyScriptParser.loadMap_return loadMap205 =null;

        AtrophyScriptParser.lockDoor_return lockDoor206 =null;

        AtrophyScriptParser.unlockDoor_return unlockDoor207 =null;

        AtrophyScriptParser.addTag_return addTag208 =null;

        AtrophyScriptParser.removeTag_return removeTag209 =null;

        AtrophyScriptParser.directorBias_return directorBias210 =null;

        AtrophyScriptParser.changeAiNode_return changeAiNode211 =null;

        AtrophyScriptParser.showMessage_return showMessage212 =null;

        AtrophyScriptParser.setTriggerRunning_return setTriggerRunning213 =null;

        AtrophyScriptParser.spawnItem_return spawnItem214 =null;

        AtrophyScriptParser.spawnTalkNode_return spawnTalkNode215 =null;

        AtrophyScriptParser.unlockTech_return unlockTech216 =null;

        AtrophyScriptParser.changeStat_return changeStat217 =null;

        AtrophyScriptParser.commandCallList_return commandCallList218 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:315:14: ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | showMessage | setTriggerRunning | spawnItem | spawnTalkNode | unlockTech | changeStat | commandCallList )
            int alt37=23;
            switch ( input.LA(1) ) {
            case UPDATE_TREE_PREFIX:
            case 223:
                {
                alt37=1;
                }
                break;
            case 204:
                {
                alt37=2;
                }
                break;
            case 201:
                {
                alt37=3;
                }
                break;
            case 194:
                {
                alt37=4;
                }
                break;
            case 173:
                {
                alt37=5;
                }
                break;
            case 213:
                {
                alt37=6;
                }
                break;
            case 154:
                {
                alt37=7;
                }
                break;
            case 197:
                {
                alt37=8;
                }
                break;
            case 192:
                {
                alt37=9;
                }
                break;
            case 176:
                {
                alt37=10;
                }
                break;
            case 177:
                {
                alt37=11;
                }
                break;
            case 221:
                {
                alt37=12;
                }
                break;
            case ADD_TAG_PREFIX:
            case 143:
                {
                alt37=13;
                }
                break;
            case REMOVE_TAG_PREFIX:
            case 193:
                {
                alt37=14;
                }
                break;
            case 157:
                {
                alt37=15;
                }
                break;
            case 150:
                {
                alt37=16;
                }
                break;
            case 200:
                {
                alt37=17;
                }
                break;
            case 199:
                {
                alt37=18;
                }
                break;
            case 202:
                {
                alt37=19;
                }
                break;
            case 203:
                {
                alt37=20;
                }
                break;
            case 222:
                {
                alt37=21;
                }
                break;
            case 149:
            case 151:
                {
                alt37=22;
                }
                break;
            case COMMAND_CALL_PREFIX:
            case 129:
            case 148:
                {
                alt37=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:316:4: updateTalkTree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_updateTalkTree_in_triggerEffect2016);
                    updateTalkTree196=updateTalkTree();

                    state._fsp--;

                    adaptor.addChild(root_0, updateTalkTree196.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:6: spawnTeam
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnTeam_in_triggerEffect2023);
                    spawnTeam197=spawnTeam();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnTeam197.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:318:6: spawnCharacter
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnCharacter_in_triggerEffect2030);
                    spawnCharacter198=spawnCharacter();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnCharacter198.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:319:6: removeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeUnit_in_triggerEffect2037);
                    removeUnit199=removeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, removeUnit199.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:320:6: killUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_killUnit_in_triggerEffect2044);
                    killUnit200=killUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, killUnit200.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:321:6: teleportUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_teleportUnit_in_triggerEffect2051);
                    teleportUnit201=teleportUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, teleportUnit201.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:322:6: converseUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_converseUnit_in_triggerEffect2058);
                    converseUnit202=converseUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, converseUnit202.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:323:6: createSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_createSaferoom_in_triggerEffect2065);
                    createSaferoom203=createSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, createSaferoom203.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:324:6: removeSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeSaferoom_in_triggerEffect2072);
                    removeSaferoom204=removeSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, removeSaferoom204.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:325:6: loadMap
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_loadMap_in_triggerEffect2079);
                    loadMap205=loadMap();

                    state._fsp--;

                    adaptor.addChild(root_0, loadMap205.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:326:6: lockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lockDoor_in_triggerEffect2086);
                    lockDoor206=lockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, lockDoor206.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:6: unlockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unlockDoor_in_triggerEffect2093);
                    unlockDoor207=unlockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, unlockDoor207.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:328:6: addTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_addTag_in_triggerEffect2100);
                    addTag208=addTag();

                    state._fsp--;

                    adaptor.addChild(root_0, addTag208.getTree());

                    }
                    break;
                case 14 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:329:6: removeTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeTag_in_triggerEffect2107);
                    removeTag209=removeTag();

                    state._fsp--;

                    adaptor.addChild(root_0, removeTag209.getTree());

                    }
                    break;
                case 15 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:330:6: directorBias
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_directorBias_in_triggerEffect2114);
                    directorBias210=directorBias();

                    state._fsp--;

                    adaptor.addChild(root_0, directorBias210.getTree());

                    }
                    break;
                case 16 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:6: changeAiNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_changeAiNode_in_triggerEffect2121);
                    changeAiNode211=changeAiNode();

                    state._fsp--;

                    adaptor.addChild(root_0, changeAiNode211.getTree());

                    }
                    break;
                case 17 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:332:6: showMessage
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_showMessage_in_triggerEffect2128);
                    showMessage212=showMessage();

                    state._fsp--;

                    adaptor.addChild(root_0, showMessage212.getTree());

                    }
                    break;
                case 18 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:333:6: setTriggerRunning
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_setTriggerRunning_in_triggerEffect2135);
                    setTriggerRunning213=setTriggerRunning();

                    state._fsp--;

                    adaptor.addChild(root_0, setTriggerRunning213.getTree());

                    }
                    break;
                case 19 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:334:6: spawnItem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnItem_in_triggerEffect2142);
                    spawnItem214=spawnItem();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnItem214.getTree());

                    }
                    break;
                case 20 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:6: spawnTalkNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnTalkNode_in_triggerEffect2149);
                    spawnTalkNode215=spawnTalkNode();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnTalkNode215.getTree());

                    }
                    break;
                case 21 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:6: unlockTech
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unlockTech_in_triggerEffect2156);
                    unlockTech216=unlockTech();

                    state._fsp--;

                    adaptor.addChild(root_0, unlockTech216.getTree());

                    }
                    break;
                case 22 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:337:6: changeStat
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_changeStat_in_triggerEffect2163);
                    changeStat217=changeStat();

                    state._fsp--;

                    adaptor.addChild(root_0, changeStat217.getTree());

                    }
                    break;
                case 23 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:338:6: commandCallList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandCallList_in_triggerEffect2170);
                    commandCallList218=commandCallList();

                    state._fsp--;

                    adaptor.addChild(root_0, commandCallList218.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:341:1: updateTalkTree : ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) );
    public final AtrophyScriptParser.updateTalkTree_return updateTalkTree() throws RecognitionException {
        AtrophyScriptParser.updateTalkTree_return retval = new AtrophyScriptParser.updateTalkTree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal219=null;
        Token INT221=null;
        Token UPDATE_TREE_PREFIX222=null;
        Token char_literal224=null;
        Token INT225=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral220 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral223 =null;


        CommonTree string_literal219_tree=null;
        CommonTree INT221_tree=null;
        CommonTree UPDATE_TREE_PREFIX222_tree=null;
        CommonTree char_literal224_tree=null;
        CommonTree INT225_tree=null;
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_223=new RewriteRuleTokenStream(adaptor,"token 223");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_UPDATE_TREE_PREFIX=new RewriteRuleTokenStream(adaptor,"token UPDATE_TREE_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:341:15: ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==223) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:342:4: 'updateTalk:' stringLiteral INT
                    {
                    string_literal219=(Token)match(input,223,FOLLOW_223_in_updateTalkTree2185);  
                    stream_223.add(string_literal219);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree2187);
                    stringLiteral220=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral220.getTree());

                    INT221=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree2189);  
                    stream_INT.add(INT221);


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
                    // 342:36: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:342:39: ^( UPDATETALK stringLiteral INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:343:6: UPDATE_TREE_PREFIX stringLiteral '#' INT
                    {
                    UPDATE_TREE_PREFIX222=(Token)match(input,UPDATE_TREE_PREFIX,FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree2206);  
                    stream_UPDATE_TREE_PREFIX.add(UPDATE_TREE_PREFIX222);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree2208);
                    stringLiteral223=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral223.getTree());

                    char_literal224=(Token)match(input,115,FOLLOW_115_in_updateTalkTree2210);  
                    stream_115.add(char_literal224);


                    INT225=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree2212);  
                    stream_INT.add(INT225);


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
                    // 343:47: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:343:50: ^( UPDATETALK stringLiteral INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:346:1: isName : 'isName:' stringList -> ^( ISNAME stringList ) ;
    public final AtrophyScriptParser.isName_return isName() throws RecognitionException {
        AtrophyScriptParser.isName_return retval = new AtrophyScriptParser.isName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal226=null;
        AtrophyScriptParser.stringList_return stringList227 =null;


        CommonTree string_literal226_tree=null;
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:346:7: ( 'isName:' stringList -> ^( ISNAME stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:347:4: 'isName:' stringList
            {
            string_literal226=(Token)match(input,168,FOLLOW_168_in_isName2237);  
            stream_168.add(string_literal226);


            pushFollow(FOLLOW_stringList_in_isName2239);
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
            // 347:25: -> ^( ISNAME stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:347:28: ^( ISNAME stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:350:1: isFaction : 'isFaction:' stringList -> ^( ISFACTION stringList ) ;
    public final AtrophyScriptParser.isFaction_return isFaction() throws RecognitionException {
        AtrophyScriptParser.isFaction_return retval = new AtrophyScriptParser.isFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal228=null;
        AtrophyScriptParser.stringList_return stringList229 =null;


        CommonTree string_literal228_tree=null;
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:350:10: ( 'isFaction:' stringList -> ^( ISFACTION stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:4: 'isFaction:' stringList
            {
            string_literal228=(Token)match(input,166,FOLLOW_166_in_isFaction2262);  
            stream_166.add(string_literal228);


            pushFollow(FOLLOW_stringList_in_isFaction2264);
            stringList229=stringList();

            state._fsp--;

            stream_stringList.add(stringList229.getTree());

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
            // 351:28: -> ^( ISFACTION stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:31: ^( ISFACTION stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:354:1: isRoom : 'isRoom:' stringList -> ^( ISROOM stringList ) ;
    public final AtrophyScriptParser.isRoom_return isRoom() throws RecognitionException {
        AtrophyScriptParser.isRoom_return retval = new AtrophyScriptParser.isRoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal230=null;
        AtrophyScriptParser.stringList_return stringList231 =null;


        CommonTree string_literal230_tree=null;
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:354:7: ( 'isRoom:' stringList -> ^( ISROOM stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:4: 'isRoom:' stringList
            {
            string_literal230=(Token)match(input,172,FOLLOW_172_in_isRoom2287);  
            stream_172.add(string_literal230);


            pushFollow(FOLLOW_stringList_in_isRoom2289);
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
            // 355:25: -> ^( ISROOM stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:28: ^( ISROOM stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:358:1: hasItem : 'hasItem:' stringList -> ^( HASITEM stringList ) ;
    public final AtrophyScriptParser.hasItem_return hasItem() throws RecognitionException {
        AtrophyScriptParser.hasItem_return retval = new AtrophyScriptParser.hasItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal232=null;
        AtrophyScriptParser.stringList_return stringList233 =null;


        CommonTree string_literal232_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:358:8: ( 'hasItem:' stringList -> ^( HASITEM stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:359:4: 'hasItem:' stringList
            {
            string_literal232=(Token)match(input,161,FOLLOW_161_in_hasItem2312);  
            stream_161.add(string_literal232);


            pushFollow(FOLLOW_stringList_in_hasItem2314);
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
            // 359:26: -> ^( HASITEM stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:359:29: ^( HASITEM stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:362:1: hasWeapon : 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) ;
    public final AtrophyScriptParser.hasWeapon_return hasWeapon() throws RecognitionException {
        AtrophyScriptParser.hasWeapon_return retval = new AtrophyScriptParser.hasWeapon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal234=null;
        AtrophyScriptParser.stringList_return stringList235 =null;


        CommonTree string_literal234_tree=null;
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:362:10: ( 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:363:4: 'hasWeapon:' stringList
            {
            string_literal234=(Token)match(input,162,FOLLOW_162_in_hasWeapon2337);  
            stream_162.add(string_literal234);


            pushFollow(FOLLOW_stringList_in_hasWeapon2339);
            stringList235=stringList();

            state._fsp--;

            stream_stringList.add(stringList235.getTree());

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
            // 363:28: -> ^( HASWEAPON stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:363:31: ^( HASWEAPON stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:366:1: stringList : stringLiteral ( ',' stringLiteral )* -> ( ^( STRING stringLiteral ) )* ;
    public final AtrophyScriptParser.stringList_return stringList() throws RecognitionException {
        AtrophyScriptParser.stringList_return retval = new AtrophyScriptParser.stringList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal237=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral236 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral238 =null;


        CommonTree char_literal237_tree=null;
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:366:11: ( stringLiteral ( ',' stringLiteral )* -> ( ^( STRING stringLiteral ) )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:4: stringLiteral ( ',' stringLiteral )*
            {
            pushFollow(FOLLOW_stringLiteral_in_stringList2362);
            stringLiteral236=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral236.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:18: ( ',' stringLiteral )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==118) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==114) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:19: ',' stringLiteral
            	    {
            	    char_literal237=(Token)match(input,118,FOLLOW_118_in_stringList2365);  
            	    stream_118.add(char_literal237);


            	    pushFollow(FOLLOW_stringLiteral_in_stringList2367);
            	    stringLiteral238=stringLiteral();

            	    state._fsp--;

            	    stream_stringLiteral.add(stringLiteral238.getTree());

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
            // 367:39: -> ( ^( STRING stringLiteral ) )*
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:42: ( ^( STRING stringLiteral ) )*
                while ( stream_stringLiteral.hasNext() ) {
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:42: ^( STRING stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:370:1: isAlive : 'isAlive' -> ^( ISALIVE ) ;
    public final AtrophyScriptParser.isAlive_return isAlive() throws RecognitionException {
        AtrophyScriptParser.isAlive_return retval = new AtrophyScriptParser.isAlive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal239=null;

        CommonTree string_literal239_tree=null;
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:370:8: ( 'isAlive' -> ^( ISALIVE ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:371:4: 'isAlive'
            {
            string_literal239=(Token)match(input,163,FOLLOW_163_in_isAlive2391);  
            stream_163.add(string_literal239);


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
            // 371:14: -> ^( ISALIVE )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:371:17: ^( ISALIVE )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:374:1: isDead : 'isDead' -> ^( ISDEAD ) ;
    public final AtrophyScriptParser.isDead_return isDead() throws RecognitionException {
        AtrophyScriptParser.isDead_return retval = new AtrophyScriptParser.isDead_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal240=null;

        CommonTree string_literal240_tree=null;
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:374:7: ( 'isDead' -> ^( ISDEAD ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:375:4: 'isDead'
            {
            string_literal240=(Token)match(input,165,FOLLOW_165_in_isDead2412);  
            stream_165.add(string_literal240);


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
            // 375:13: -> ^( ISDEAD )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:375:16: ^( ISDEAD )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:378:1: isInvestigated : 'isInvestigated' -> ^( ISINVESTIGATED ) ;
    public final AtrophyScriptParser.isInvestigated_return isInvestigated() throws RecognitionException {
        AtrophyScriptParser.isInvestigated_return retval = new AtrophyScriptParser.isInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal241=null;

        CommonTree string_literal241_tree=null;
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:378:15: ( 'isInvestigated' -> ^( ISINVESTIGATED ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:4: 'isInvestigated'
            {
            string_literal241=(Token)match(input,167,FOLLOW_167_in_isInvestigated2433);  
            stream_167.add(string_literal241);


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
            // 379:21: -> ^( ISINVESTIGATED )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:24: ^( ISINVESTIGATED )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:382:1: isNotInvestigated : 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) ;
    public final AtrophyScriptParser.isNotInvestigated_return isNotInvestigated() throws RecognitionException {
        AtrophyScriptParser.isNotInvestigated_return retval = new AtrophyScriptParser.isNotInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal242=null;

        CommonTree string_literal242_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:382:18: ( 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:383:4: 'isNotInvestigated'
            {
            string_literal242=(Token)match(input,170,FOLLOW_170_in_isNotInvestigated2454);  
            stream_170.add(string_literal242);


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
            // 383:24: -> ^( ISNOTINVESTIGATED )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:383:27: ^( ISNOTINVESTIGATED )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:386:1: isDaemon : 'isDaemon' -> ^( ISDAEMON ) ;
    public final AtrophyScriptParser.isDaemon_return isDaemon() throws RecognitionException {
        AtrophyScriptParser.isDaemon_return retval = new AtrophyScriptParser.isDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal243=null;

        CommonTree string_literal243_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:386:9: ( 'isDaemon' -> ^( ISDAEMON ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:387:4: 'isDaemon'
            {
            string_literal243=(Token)match(input,164,FOLLOW_164_in_isDaemon2475);  
            stream_164.add(string_literal243);


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
            // 387:15: -> ^( ISDAEMON )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:387:18: ^( ISDAEMON )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:390:1: isNotDaemon : 'isNotDaemon' -> ^( ISNOTDAEMON ) ;
    public final AtrophyScriptParser.isNotDaemon_return isNotDaemon() throws RecognitionException {
        AtrophyScriptParser.isNotDaemon_return retval = new AtrophyScriptParser.isNotDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal244=null;

        CommonTree string_literal244_tree=null;
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:390:12: ( 'isNotDaemon' -> ^( ISNOTDAEMON ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:391:4: 'isNotDaemon'
            {
            string_literal244=(Token)match(input,169,FOLLOW_169_in_isNotDaemon2494);  
            stream_169.add(string_literal244);


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
            // 391:18: -> ^( ISNOTDAEMON )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:391:21: ^( ISNOTDAEMON )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:394:1: teleDestination : 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) ;
    public final AtrophyScriptParser.teleDestination_return teleDestination() throws RecognitionException {
        AtrophyScriptParser.teleDestination_return retval = new AtrophyScriptParser.teleDestination_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal245=null;
        Token char_literal246=null;
        Token char_literal249=null;
        AtrophyScriptParser.xListProperty_return xListProperty247 =null;

        AtrophyScriptParser.yListProperty_return yListProperty248 =null;


        CommonTree string_literal245_tree=null;
        CommonTree char_literal246_tree=null;
        CommonTree char_literal249_tree=null;
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleSubtreeStream stream_yListProperty=new RewriteRuleSubtreeStream(adaptor,"rule yListProperty");
        RewriteRuleSubtreeStream stream_xListProperty=new RewriteRuleSubtreeStream(adaptor,"rule xListProperty");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:394:16: ( 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:395:4: 'destination' '{' xListProperty yListProperty '}'
            {
            string_literal245=(Token)match(input,156,FOLLOW_156_in_teleDestination2515);  
            stream_156.add(string_literal245);


            char_literal246=(Token)match(input,228,FOLLOW_228_in_teleDestination2517);  
            stream_228.add(char_literal246);


            pushFollow(FOLLOW_xListProperty_in_teleDestination2519);
            xListProperty247=xListProperty();

            state._fsp--;

            stream_xListProperty.add(xListProperty247.getTree());

            pushFollow(FOLLOW_yListProperty_in_teleDestination2521);
            yListProperty248=yListProperty();

            state._fsp--;

            stream_yListProperty.add(yListProperty248.getTree());

            char_literal249=(Token)match(input,229,FOLLOW_229_in_teleDestination2523);  
            stream_229.add(char_literal249);


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
            // 395:54: -> ^( TELEDEST xListProperty yListProperty )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:395:57: ^( TELEDEST xListProperty yListProperty )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:398:1: maxTeamSize : 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) ;
    public final AtrophyScriptParser.maxTeamSize_return maxTeamSize() throws RecognitionException {
        AtrophyScriptParser.maxTeamSize_return retval = new AtrophyScriptParser.maxTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal250=null;
        Token INT251=null;

        CommonTree string_literal250_tree=null;
        CommonTree INT251_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:398:12: ( 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:399:4: 'maxTeamSize:' INT
            {
            string_literal250=(Token)match(input,180,FOLLOW_180_in_maxTeamSize2548);  
            stream_180.add(string_literal250);


            INT251=(Token)match(input,INT,FOLLOW_INT_in_maxTeamSize2550);  
            stream_INT.add(INT251);


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
            // 399:23: -> ^( MAXTEAMSIZE INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:399:26: ^( MAXTEAMSIZE INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:402:1: minTeamSize : 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) ;
    public final AtrophyScriptParser.minTeamSize_return minTeamSize() throws RecognitionException {
        AtrophyScriptParser.minTeamSize_return retval = new AtrophyScriptParser.minTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal252=null;
        Token INT253=null;

        CommonTree string_literal252_tree=null;
        CommonTree INT253_tree=null;
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:402:12: ( 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:403:4: 'minTeamSize:' INT
            {
            string_literal252=(Token)match(input,182,FOLLOW_182_in_minTeamSize2571);  
            stream_182.add(string_literal252);


            INT253=(Token)match(input,INT,FOLLOW_INT_in_minTeamSize2573);  
            stream_INT.add(INT253);


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
            // 403:23: -> ^( MINTEAMSIZE INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:403:26: ^( MINTEAMSIZE INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:406:1: isPlayer : 'isPlayer' ;
    public final AtrophyScriptParser.isPlayer_return isPlayer() throws RecognitionException {
        AtrophyScriptParser.isPlayer_return retval = new AtrophyScriptParser.isPlayer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal254=null;

        CommonTree string_literal254_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:406:9: ( 'isPlayer' )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:407:4: 'isPlayer'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal254=(Token)match(input,171,FOLLOW_171_in_isPlayer2596); 
            string_literal254_tree = 
            (CommonTree)adaptor.create(string_literal254)
            ;
            adaptor.addChild(root_0, string_literal254_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:410:1: aiNode : 'aiNode' '{' aiNodeOptions '}' -> ^( AINODE aiNodeOptions ) ;
    public final AtrophyScriptParser.aiNode_return aiNode() throws RecognitionException {
        AtrophyScriptParser.aiNode_return retval = new AtrophyScriptParser.aiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal255=null;
        Token char_literal256=null;
        Token char_literal258=null;
        AtrophyScriptParser.aiNodeOptions_return aiNodeOptions257 =null;


        CommonTree string_literal255_tree=null;
        CommonTree char_literal256_tree=null;
        CommonTree char_literal258_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_aiNodeOptions=new RewriteRuleSubtreeStream(adaptor,"rule aiNodeOptions");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:410:7: ( 'aiNode' '{' aiNodeOptions '}' -> ^( AINODE aiNodeOptions ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:411:4: 'aiNode' '{' aiNodeOptions '}'
            {
            string_literal255=(Token)match(input,145,FOLLOW_145_in_aiNode2611);  
            stream_145.add(string_literal255);


            char_literal256=(Token)match(input,228,FOLLOW_228_in_aiNode2613);  
            stream_228.add(char_literal256);


            pushFollow(FOLLOW_aiNodeOptions_in_aiNode2615);
            aiNodeOptions257=aiNodeOptions();

            state._fsp--;

            stream_aiNodeOptions.add(aiNodeOptions257.getTree());

            char_literal258=(Token)match(input,229,FOLLOW_229_in_aiNode2617);  
            stream_229.add(char_literal258);


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
            // 411:35: -> ^( AINODE aiNodeOptions )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:411:38: ^( AINODE aiNodeOptions )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:414:1: aiNodeOptions : ( subscribeTalkMaps | behaviours | aiNodePriority )* ;
    public final AtrophyScriptParser.aiNodeOptions_return aiNodeOptions() throws RecognitionException {
        AtrophyScriptParser.aiNodeOptions_return retval = new AtrophyScriptParser.aiNodeOptions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps259 =null;

        AtrophyScriptParser.behaviours_return behaviours260 =null;

        AtrophyScriptParser.aiNodePriority_return aiNodePriority261 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:414:14: ( ( subscribeTalkMaps | behaviours | aiNodePriority )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:415:3: ( subscribeTalkMaps | behaviours | aiNodePriority )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:415:3: ( subscribeTalkMaps | behaviours | aiNodePriority )*
            loop40:
            do {
                int alt40=4;
                switch ( input.LA(1) ) {
                case 208:
                    {
                    alt40=1;
                    }
                    break;
                case 146:
                    {
                    alt40=2;
                    }
                    break;
                case 191:
                    {
                    alt40=3;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:415:4: subscribeTalkMaps
            	    {
            	    pushFollow(FOLLOW_subscribeTalkMaps_in_aiNodeOptions2640);
            	    subscribeTalkMaps259=subscribeTalkMaps();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subscribeTalkMaps259.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:416:4: behaviours
            	    {
            	    pushFollow(FOLLOW_behaviours_in_aiNodeOptions2645);
            	    behaviours260=behaviours();

            	    state._fsp--;

            	    adaptor.addChild(root_0, behaviours260.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:417:4: aiNodePriority
            	    {
            	    pushFollow(FOLLOW_aiNodePriority_in_aiNodeOptions2650);
            	    aiNodePriority261=aiNodePriority();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiNodePriority261.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:420:1: subscribeTalkMaps : 'subscribe:' stringList -> ^( SUBSCRIBE stringList ) ;
    public final AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps() throws RecognitionException {
        AtrophyScriptParser.subscribeTalkMaps_return retval = new AtrophyScriptParser.subscribeTalkMaps_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal262=null;
        AtrophyScriptParser.stringList_return stringList263 =null;


        CommonTree string_literal262_tree=null;
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:420:18: ( 'subscribe:' stringList -> ^( SUBSCRIBE stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:421:4: 'subscribe:' stringList
            {
            string_literal262=(Token)match(input,208,FOLLOW_208_in_subscribeTalkMaps2667);  
            stream_208.add(string_literal262);


            pushFollow(FOLLOW_stringList_in_subscribeTalkMaps2668);
            stringList263=stringList();

            state._fsp--;

            stream_stringList.add(stringList263.getTree());

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
            // 421:27: -> ^( SUBSCRIBE stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:421:30: ^( SUBSCRIBE stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:1: behaviours : 'behaviours:' stringList -> ^( BEHAVIOUR stringList ) ;
    public final AtrophyScriptParser.behaviours_return behaviours() throws RecognitionException {
        AtrophyScriptParser.behaviours_return retval = new AtrophyScriptParser.behaviours_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal264=null;
        AtrophyScriptParser.stringList_return stringList265 =null;


        CommonTree string_literal264_tree=null;
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:11: ( 'behaviours:' stringList -> ^( BEHAVIOUR stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:425:4: 'behaviours:' stringList
            {
            string_literal264=(Token)match(input,146,FOLLOW_146_in_behaviours2691);  
            stream_146.add(string_literal264);


            pushFollow(FOLLOW_stringList_in_behaviours2693);
            stringList265=stringList();

            state._fsp--;

            stream_stringList.add(stringList265.getTree());

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
            // 425:29: -> ^( BEHAVIOUR stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:425:32: ^( BEHAVIOUR stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:428:1: aiNodePriority : 'priority:' stringList -> ^( PRIORITY stringList ) ;
    public final AtrophyScriptParser.aiNodePriority_return aiNodePriority() throws RecognitionException {
        AtrophyScriptParser.aiNodePriority_return retval = new AtrophyScriptParser.aiNodePriority_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal266=null;
        AtrophyScriptParser.stringList_return stringList267 =null;


        CommonTree string_literal266_tree=null;
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:428:15: ( 'priority:' stringList -> ^( PRIORITY stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:429:4: 'priority:' stringList
            {
            string_literal266=(Token)match(input,191,FOLLOW_191_in_aiNodePriority2716);  
            stream_191.add(string_literal266);


            pushFollow(FOLLOW_stringList_in_aiNodePriority2718);
            stringList267=stringList();

            state._fsp--;

            stream_stringList.add(stringList267.getTree());

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
            // 429:27: -> ^( PRIORITY stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:429:30: ^( PRIORITY stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:432:1: unitInfo : ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )* ;
    public final AtrophyScriptParser.unitInfo_return unitInfo() throws RecognitionException {
        AtrophyScriptParser.unitInfo_return retval = new AtrophyScriptParser.unitInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName268 =null;

        AtrophyScriptParser.isFaction_return isFaction269 =null;

        AtrophyScriptParser.isRoom_return isRoom270 =null;

        AtrophyScriptParser.hasItem_return hasItem271 =null;

        AtrophyScriptParser.hasWeapon_return hasWeapon272 =null;

        AtrophyScriptParser.isAlive_return isAlive273 =null;

        AtrophyScriptParser.isDead_return isDead274 =null;

        AtrophyScriptParser.isInvestigated_return isInvestigated275 =null;

        AtrophyScriptParser.isNotInvestigated_return isNotInvestigated276 =null;

        AtrophyScriptParser.isDaemon_return isDaemon277 =null;

        AtrophyScriptParser.isNotDaemon_return isNotDaemon278 =null;

        AtrophyScriptParser.teleDestination_return teleDestination279 =null;

        AtrophyScriptParser.maxTeamSize_return maxTeamSize280 =null;

        AtrophyScriptParser.minTeamSize_return minTeamSize281 =null;

        AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps282 =null;

        AtrophyScriptParser.aiNode_return aiNode283 =null;

        AtrophyScriptParser.isPlayer_return isPlayer284 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:432:9: ( ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:433:4: ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:433:4: ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )*
            loop41:
            do {
                int alt41=18;
                switch ( input.LA(1) ) {
                case 168:
                    {
                    alt41=1;
                    }
                    break;
                case 166:
                    {
                    alt41=2;
                    }
                    break;
                case 172:
                    {
                    alt41=3;
                    }
                    break;
                case 161:
                    {
                    alt41=4;
                    }
                    break;
                case 162:
                    {
                    alt41=5;
                    }
                    break;
                case 163:
                    {
                    alt41=6;
                    }
                    break;
                case 165:
                    {
                    alt41=7;
                    }
                    break;
                case 167:
                    {
                    alt41=8;
                    }
                    break;
                case 170:
                    {
                    alt41=9;
                    }
                    break;
                case 164:
                    {
                    alt41=10;
                    }
                    break;
                case 169:
                    {
                    alt41=11;
                    }
                    break;
                case 156:
                    {
                    alt41=12;
                    }
                    break;
                case 180:
                    {
                    alt41=13;
                    }
                    break;
                case 182:
                    {
                    alt41=14;
                    }
                    break;
                case 208:
                    {
                    alt41=15;
                    }
                    break;
                case 145:
                    {
                    alt41=16;
                    }
                    break;
                case 171:
                    {
                    alt41=17;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:433:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_unitInfo2742);
            	    isName268=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName268.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:434:6: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_unitInfo2749);
            	    isFaction269=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction269.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:435:6: isRoom
            	    {
            	    pushFollow(FOLLOW_isRoom_in_unitInfo2756);
            	    isRoom270=isRoom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isRoom270.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:436:6: hasItem
            	    {
            	    pushFollow(FOLLOW_hasItem_in_unitInfo2763);
            	    hasItem271=hasItem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasItem271.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:437:6: hasWeapon
            	    {
            	    pushFollow(FOLLOW_hasWeapon_in_unitInfo2770);
            	    hasWeapon272=hasWeapon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasWeapon272.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:438:6: isAlive
            	    {
            	    pushFollow(FOLLOW_isAlive_in_unitInfo2777);
            	    isAlive273=isAlive();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isAlive273.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:439:6: isDead
            	    {
            	    pushFollow(FOLLOW_isDead_in_unitInfo2784);
            	    isDead274=isDead();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDead274.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:440:6: isInvestigated
            	    {
            	    pushFollow(FOLLOW_isInvestigated_in_unitInfo2791);
            	    isInvestigated275=isInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isInvestigated275.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:441:6: isNotInvestigated
            	    {
            	    pushFollow(FOLLOW_isNotInvestigated_in_unitInfo2798);
            	    isNotInvestigated276=isNotInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotInvestigated276.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:442:6: isDaemon
            	    {
            	    pushFollow(FOLLOW_isDaemon_in_unitInfo2805);
            	    isDaemon277=isDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDaemon277.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:443:6: isNotDaemon
            	    {
            	    pushFollow(FOLLOW_isNotDaemon_in_unitInfo2812);
            	    isNotDaemon278=isNotDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotDaemon278.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:444:6: teleDestination
            	    {
            	    pushFollow(FOLLOW_teleDestination_in_unitInfo2819);
            	    teleDestination279=teleDestination();

            	    state._fsp--;

            	    adaptor.addChild(root_0, teleDestination279.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:445:6: maxTeamSize
            	    {
            	    pushFollow(FOLLOW_maxTeamSize_in_unitInfo2826);
            	    maxTeamSize280=maxTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, maxTeamSize280.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:446:6: minTeamSize
            	    {
            	    pushFollow(FOLLOW_minTeamSize_in_unitInfo2833);
            	    minTeamSize281=minTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, minTeamSize281.getTree());

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:447:6: subscribeTalkMaps
            	    {
            	    pushFollow(FOLLOW_subscribeTalkMaps_in_unitInfo2840);
            	    subscribeTalkMaps282=subscribeTalkMaps();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subscribeTalkMaps282.getTree());

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:448:6: aiNode
            	    {
            	    pushFollow(FOLLOW_aiNode_in_unitInfo2847);
            	    aiNode283=aiNode();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiNode283.getTree());

            	    }
            	    break;
            	case 17 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:449:6: isPlayer
            	    {
            	    pushFollow(FOLLOW_isPlayer_in_unitInfo2854);
            	    isPlayer284=isPlayer();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isPlayer284.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:452:1: spawnTeam : 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) ;
    public final AtrophyScriptParser.spawnTeam_return spawnTeam() throws RecognitionException {
        AtrophyScriptParser.spawnTeam_return retval = new AtrophyScriptParser.spawnTeam_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal285=null;
        Token char_literal286=null;
        Token char_literal288=null;
        AtrophyScriptParser.unitInfo_return unitInfo287 =null;


        CommonTree string_literal285_tree=null;
        CommonTree char_literal286_tree=null;
        CommonTree char_literal288_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:452:10: ( 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:453:4: 'spawnTeam' '{' unitInfo '}'
            {
            string_literal285=(Token)match(input,204,FOLLOW_204_in_spawnTeam2873);  
            stream_204.add(string_literal285);


            char_literal286=(Token)match(input,228,FOLLOW_228_in_spawnTeam2875);  
            stream_228.add(char_literal286);


            pushFollow(FOLLOW_unitInfo_in_spawnTeam2877);
            unitInfo287=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo287.getTree());

            char_literal288=(Token)match(input,229,FOLLOW_229_in_spawnTeam2879);  
            stream_229.add(char_literal288);


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
            // 453:33: -> ^( SPAWNTEAM unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:453:36: ^( SPAWNTEAM unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:456:1: spawnCharacter : 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) ;
    public final AtrophyScriptParser.spawnCharacter_return spawnCharacter() throws RecognitionException {
        AtrophyScriptParser.spawnCharacter_return retval = new AtrophyScriptParser.spawnCharacter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal289=null;
        Token char_literal290=null;
        Token char_literal292=null;
        AtrophyScriptParser.unitInfo_return unitInfo291 =null;


        CommonTree string_literal289_tree=null;
        CommonTree char_literal290_tree=null;
        CommonTree char_literal292_tree=null;
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:456:15: ( 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:457:4: 'spawnCharacter' '{' unitInfo '}'
            {
            string_literal289=(Token)match(input,201,FOLLOW_201_in_spawnCharacter2902);  
            stream_201.add(string_literal289);


            char_literal290=(Token)match(input,228,FOLLOW_228_in_spawnCharacter2904);  
            stream_228.add(char_literal290);


            pushFollow(FOLLOW_unitInfo_in_spawnCharacter2906);
            unitInfo291=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo291.getTree());

            char_literal292=(Token)match(input,229,FOLLOW_229_in_spawnCharacter2908);  
            stream_229.add(char_literal292);


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
            // 457:38: -> ^( SPAWNCHARACTER unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:457:41: ^( SPAWNCHARACTER unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:460:1: removeUnit : 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) ;
    public final AtrophyScriptParser.removeUnit_return removeUnit() throws RecognitionException {
        AtrophyScriptParser.removeUnit_return retval = new AtrophyScriptParser.removeUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal293=null;
        Token char_literal294=null;
        Token char_literal296=null;
        AtrophyScriptParser.unitInfo_return unitInfo295 =null;


        CommonTree string_literal293_tree=null;
        CommonTree char_literal294_tree=null;
        CommonTree char_literal296_tree=null;
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:460:11: ( 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:461:4: 'removeUnit' '{' unitInfo '}'
            {
            string_literal293=(Token)match(input,194,FOLLOW_194_in_removeUnit2931);  
            stream_194.add(string_literal293);


            char_literal294=(Token)match(input,228,FOLLOW_228_in_removeUnit2933);  
            stream_228.add(char_literal294);


            pushFollow(FOLLOW_unitInfo_in_removeUnit2935);
            unitInfo295=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo295.getTree());

            char_literal296=(Token)match(input,229,FOLLOW_229_in_removeUnit2937);  
            stream_229.add(char_literal296);


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
            // 461:34: -> ^( REMOVEUNIT unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:461:37: ^( REMOVEUNIT unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:464:1: killUnit : 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) ;
    public final AtrophyScriptParser.killUnit_return killUnit() throws RecognitionException {
        AtrophyScriptParser.killUnit_return retval = new AtrophyScriptParser.killUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal297=null;
        Token char_literal298=null;
        Token char_literal300=null;
        AtrophyScriptParser.unitInfo_return unitInfo299 =null;


        CommonTree string_literal297_tree=null;
        CommonTree char_literal298_tree=null;
        CommonTree char_literal300_tree=null;
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:464:9: ( 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:465:4: 'killUnit' '{' unitInfo '}'
            {
            string_literal297=(Token)match(input,173,FOLLOW_173_in_killUnit2960);  
            stream_173.add(string_literal297);


            char_literal298=(Token)match(input,228,FOLLOW_228_in_killUnit2962);  
            stream_228.add(char_literal298);


            pushFollow(FOLLOW_unitInfo_in_killUnit2964);
            unitInfo299=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo299.getTree());

            char_literal300=(Token)match(input,229,FOLLOW_229_in_killUnit2966);  
            stream_229.add(char_literal300);


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
            // 465:32: -> ^( KILLUNIT unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:465:35: ^( KILLUNIT unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:468:1: teleportUnit : 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) ;
    public final AtrophyScriptParser.teleportUnit_return teleportUnit() throws RecognitionException {
        AtrophyScriptParser.teleportUnit_return retval = new AtrophyScriptParser.teleportUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal301=null;
        Token char_literal302=null;
        Token char_literal304=null;
        AtrophyScriptParser.unitInfo_return unitInfo303 =null;


        CommonTree string_literal301_tree=null;
        CommonTree char_literal302_tree=null;
        CommonTree char_literal304_tree=null;
        RewriteRuleTokenStream stream_213=new RewriteRuleTokenStream(adaptor,"token 213");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:468:13: ( 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:469:4: 'teleport' '{' unitInfo '}'
            {
            string_literal301=(Token)match(input,213,FOLLOW_213_in_teleportUnit2989);  
            stream_213.add(string_literal301);


            char_literal302=(Token)match(input,228,FOLLOW_228_in_teleportUnit2991);  
            stream_228.add(char_literal302);


            pushFollow(FOLLOW_unitInfo_in_teleportUnit2993);
            unitInfo303=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo303.getTree());

            char_literal304=(Token)match(input,229,FOLLOW_229_in_teleportUnit2995);  
            stream_229.add(char_literal304);


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
            // 469:32: -> ^( TELEPORT unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:469:35: ^( TELEPORT unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:472:1: converseUnit : 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) ;
    public final AtrophyScriptParser.converseUnit_return converseUnit() throws RecognitionException {
        AtrophyScriptParser.converseUnit_return retval = new AtrophyScriptParser.converseUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal305=null;
        Token char_literal306=null;
        Token char_literal308=null;
        AtrophyScriptParser.unitInfo_return unitInfo307 =null;


        CommonTree string_literal305_tree=null;
        CommonTree char_literal306_tree=null;
        CommonTree char_literal308_tree=null;
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:472:13: ( 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:473:4: 'converse' '{' unitInfo '}'
            {
            string_literal305=(Token)match(input,154,FOLLOW_154_in_converseUnit3018);  
            stream_154.add(string_literal305);


            char_literal306=(Token)match(input,228,FOLLOW_228_in_converseUnit3020);  
            stream_228.add(char_literal306);


            pushFollow(FOLLOW_unitInfo_in_converseUnit3022);
            unitInfo307=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo307.getTree());

            char_literal308=(Token)match(input,229,FOLLOW_229_in_converseUnit3024);  
            stream_229.add(char_literal308);


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
            // 473:32: -> ^( CONVERSE unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:473:35: ^( CONVERSE unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:476:1: createSaferoom : 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.createSaferoom_return createSaferoom() throws RecognitionException {
        AtrophyScriptParser.createSaferoom_return retval = new AtrophyScriptParser.createSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal309=null;
        Token char_literal310=null;
        Token char_literal312=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo311 =null;


        CommonTree string_literal309_tree=null;
        CommonTree char_literal310_tree=null;
        CommonTree char_literal312_tree=null;
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:476:15: ( 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:477:4: 'saferoom' '{' saferoomInfo '}'
            {
            string_literal309=(Token)match(input,197,FOLLOW_197_in_createSaferoom3047);  
            stream_197.add(string_literal309);


            char_literal310=(Token)match(input,228,FOLLOW_228_in_createSaferoom3049);  
            stream_228.add(char_literal310);


            pushFollow(FOLLOW_saferoomInfo_in_createSaferoom3051);
            saferoomInfo311=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo311.getTree());

            char_literal312=(Token)match(input,229,FOLLOW_229_in_createSaferoom3053);  
            stream_229.add(char_literal312);


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
            // 477:36: -> ^( SAFEROOM saferoomInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:477:39: ^( SAFEROOM saferoomInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:480:1: removeSaferoom : 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.removeSaferoom_return removeSaferoom() throws RecognitionException {
        AtrophyScriptParser.removeSaferoom_return retval = new AtrophyScriptParser.removeSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal313=null;
        Token char_literal314=null;
        Token char_literal316=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo315 =null;


        CommonTree string_literal313_tree=null;
        CommonTree char_literal314_tree=null;
        CommonTree char_literal316_tree=null;
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:480:15: ( 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:481:4: 'removeSaferoom' '{' saferoomInfo '}'
            {
            string_literal313=(Token)match(input,192,FOLLOW_192_in_removeSaferoom3076);  
            stream_192.add(string_literal313);


            char_literal314=(Token)match(input,228,FOLLOW_228_in_removeSaferoom3078);  
            stream_228.add(char_literal314);


            pushFollow(FOLLOW_saferoomInfo_in_removeSaferoom3080);
            saferoomInfo315=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo315.getTree());

            char_literal316=(Token)match(input,229,FOLLOW_229_in_removeSaferoom3082);  
            stream_229.add(char_literal316);


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
            // 481:42: -> ^( REMOVESAFEROOM saferoomInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:481:45: ^( REMOVESAFEROOM saferoomInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:484:1: containsFaction : 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) ;
    public final AtrophyScriptParser.containsFaction_return containsFaction() throws RecognitionException {
        AtrophyScriptParser.containsFaction_return retval = new AtrophyScriptParser.containsFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal317=null;
        AtrophyScriptParser.stringList_return stringList318 =null;


        CommonTree string_literal317_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:484:16: ( 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:485:4: 'containsFaction:' stringList
            {
            string_literal317=(Token)match(input,153,FOLLOW_153_in_containsFaction3105);  
            stream_153.add(string_literal317);


            pushFollow(FOLLOW_stringList_in_containsFaction3107);
            stringList318=stringList();

            state._fsp--;

            stream_stringList.add(stringList318.getTree());

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
            // 485:34: -> ^( CONTAINSFACTION stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:485:37: ^( CONTAINSFACTION stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:488:1: saferoomInfo : ( containsFaction | isName )* ;
    public final AtrophyScriptParser.saferoomInfo_return saferoomInfo() throws RecognitionException {
        AtrophyScriptParser.saferoomInfo_return retval = new AtrophyScriptParser.saferoomInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.containsFaction_return containsFaction319 =null;

        AtrophyScriptParser.isName_return isName320 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:488:13: ( ( containsFaction | isName )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:489:4: ( containsFaction | isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:489:4: ( containsFaction | isName )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==153) ) {
                    alt42=1;
                }
                else if ( (LA42_0==168) ) {
                    alt42=2;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:489:5: containsFaction
            	    {
            	    pushFollow(FOLLOW_containsFaction_in_saferoomInfo3131);
            	    containsFaction319=containsFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, containsFaction319.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:490:6: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_saferoomInfo3138);
            	    isName320=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName320.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:493:1: mapInfo : ( isName | isFaction | itemSpawnChance )* ;
    public final AtrophyScriptParser.mapInfo_return mapInfo() throws RecognitionException {
        AtrophyScriptParser.mapInfo_return retval = new AtrophyScriptParser.mapInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName321 =null;

        AtrophyScriptParser.isFaction_return isFaction322 =null;

        AtrophyScriptParser.itemSpawnChance_return itemSpawnChance323 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:493:8: ( ( isName | isFaction | itemSpawnChance )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:4: ( isName | isFaction | itemSpawnChance )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:4: ( isName | isFaction | itemSpawnChance )*
            loop43:
            do {
                int alt43=4;
                switch ( input.LA(1) ) {
                case 168:
                    {
                    alt43=1;
                    }
                    break;
                case 166:
                    {
                    alt43=2;
                    }
                    break;
                case 158:
                case 181:
                case 198:
                case 224:
                    {
                    alt43=3;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_mapInfo3156);
            	    isName321=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName321.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:14: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_mapInfo3160);
            	    isFaction322=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction322.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:26: itemSpawnChance
            	    {
            	    pushFollow(FOLLOW_itemSpawnChance_in_mapInfo3164);
            	    itemSpawnChance323=itemSpawnChance();

            	    state._fsp--;

            	    adaptor.addChild(root_0, itemSpawnChance323.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:497:1: itemSpawnChance : ( 'engChance:' INT -> ^( ENG INT ) | 'medChance:' INT -> ^( MED INT ) | 'wepChance:' INT -> ^( WEP INT ) | 'sciChance' INT -> ^( SCI INT ) );
    public final AtrophyScriptParser.itemSpawnChance_return itemSpawnChance() throws RecognitionException {
        AtrophyScriptParser.itemSpawnChance_return retval = new AtrophyScriptParser.itemSpawnChance_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal324=null;
        Token INT325=null;
        Token string_literal326=null;
        Token INT327=null;
        Token string_literal328=null;
        Token INT329=null;
        Token string_literal330=null;
        Token INT331=null;

        CommonTree string_literal324_tree=null;
        CommonTree INT325_tree=null;
        CommonTree string_literal326_tree=null;
        CommonTree INT327_tree=null;
        CommonTree string_literal328_tree=null;
        CommonTree INT329_tree=null;
        CommonTree string_literal330_tree=null;
        CommonTree INT331_tree=null;
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_224=new RewriteRuleTokenStream(adaptor,"token 224");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:497:16: ( 'engChance:' INT -> ^( ENG INT ) | 'medChance:' INT -> ^( MED INT ) | 'wepChance:' INT -> ^( WEP INT ) | 'sciChance' INT -> ^( SCI INT ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 158:
                {
                alt44=1;
                }
                break;
            case 181:
                {
                alt44=2;
                }
                break;
            case 224:
                {
                alt44=3;
                }
                break;
            case 198:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:498:4: 'engChance:' INT
                    {
                    string_literal324=(Token)match(input,158,FOLLOW_158_in_itemSpawnChance3181);  
                    stream_158.add(string_literal324);


                    INT325=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3183);  
                    stream_INT.add(INT325);


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
                    // 498:21: -> ^( ENG INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:498:24: ^( ENG INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:499:6: 'medChance:' INT
                    {
                    string_literal326=(Token)match(input,181,FOLLOW_181_in_itemSpawnChance3198);  
                    stream_181.add(string_literal326);


                    INT327=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3200);  
                    stream_INT.add(INT327);


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
                    // 499:23: -> ^( MED INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:499:26: ^( MED INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:500:6: 'wepChance:' INT
                    {
                    string_literal328=(Token)match(input,224,FOLLOW_224_in_itemSpawnChance3215);  
                    stream_224.add(string_literal328);


                    INT329=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3217);  
                    stream_INT.add(INT329);


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
                    // 500:23: -> ^( WEP INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:500:26: ^( WEP INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:501:6: 'sciChance' INT
                    {
                    string_literal330=(Token)match(input,198,FOLLOW_198_in_itemSpawnChance3232);  
                    stream_198.add(string_literal330);


                    INT331=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3234);  
                    stream_INT.add(INT331);


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
                    // 501:22: -> ^( SCI INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:501:25: ^( SCI INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:504:1: loadMap : 'loadMap' '{' mapInfo '}' -> ^( LOADMAP mapInfo ) ;
    public final AtrophyScriptParser.loadMap_return loadMap() throws RecognitionException {
        AtrophyScriptParser.loadMap_return retval = new AtrophyScriptParser.loadMap_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal332=null;
        Token char_literal333=null;
        Token char_literal335=null;
        AtrophyScriptParser.mapInfo_return mapInfo334 =null;


        CommonTree string_literal332_tree=null;
        CommonTree char_literal333_tree=null;
        CommonTree char_literal335_tree=null;
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleSubtreeStream stream_mapInfo=new RewriteRuleSubtreeStream(adaptor,"rule mapInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:504:8: ( 'loadMap' '{' mapInfo '}' -> ^( LOADMAP mapInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:505:4: 'loadMap' '{' mapInfo '}'
            {
            string_literal332=(Token)match(input,176,FOLLOW_176_in_loadMap3257);  
            stream_176.add(string_literal332);


            char_literal333=(Token)match(input,228,FOLLOW_228_in_loadMap3259);  
            stream_228.add(char_literal333);


            pushFollow(FOLLOW_mapInfo_in_loadMap3261);
            mapInfo334=mapInfo();

            state._fsp--;

            stream_mapInfo.add(mapInfo334.getTree());

            char_literal335=(Token)match(input,229,FOLLOW_229_in_loadMap3263);  
            stream_229.add(char_literal335);


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
            // 505:30: -> ^( LOADMAP mapInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:505:33: ^( LOADMAP mapInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:508:1: lockDoor : 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.lockDoor_return lockDoor() throws RecognitionException {
        AtrophyScriptParser.lockDoor_return retval = new AtrophyScriptParser.lockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal336=null;
        Token char_literal337=null;
        Token char_literal339=null;
        AtrophyScriptParser.doorInfo_return doorInfo338 =null;


        CommonTree string_literal336_tree=null;
        CommonTree char_literal337_tree=null;
        CommonTree char_literal339_tree=null;
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:508:9: ( 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:509:4: 'lockDoor' '{' doorInfo '}'
            {
            string_literal336=(Token)match(input,177,FOLLOW_177_in_lockDoor3286);  
            stream_177.add(string_literal336);


            char_literal337=(Token)match(input,228,FOLLOW_228_in_lockDoor3288);  
            stream_228.add(char_literal337);


            pushFollow(FOLLOW_doorInfo_in_lockDoor3290);
            doorInfo338=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo338.getTree());

            char_literal339=(Token)match(input,229,FOLLOW_229_in_lockDoor3292);  
            stream_229.add(char_literal339);


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
            // 509:32: -> ^( LOCKDOOR doorInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:509:35: ^( LOCKDOOR doorInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:512:1: unlockDoor : 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.unlockDoor_return unlockDoor() throws RecognitionException {
        AtrophyScriptParser.unlockDoor_return retval = new AtrophyScriptParser.unlockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal340=null;
        Token char_literal341=null;
        Token char_literal343=null;
        AtrophyScriptParser.doorInfo_return doorInfo342 =null;


        CommonTree string_literal340_tree=null;
        CommonTree char_literal341_tree=null;
        CommonTree char_literal343_tree=null;
        RewriteRuleTokenStream stream_221=new RewriteRuleTokenStream(adaptor,"token 221");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:512:11: ( 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:513:4: 'unlockDoor' '{' doorInfo '}'
            {
            string_literal340=(Token)match(input,221,FOLLOW_221_in_unlockDoor3315);  
            stream_221.add(string_literal340);


            char_literal341=(Token)match(input,228,FOLLOW_228_in_unlockDoor3317);  
            stream_228.add(char_literal341);


            pushFollow(FOLLOW_doorInfo_in_unlockDoor3319);
            doorInfo342=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo342.getTree());

            char_literal343=(Token)match(input,229,FOLLOW_229_in_unlockDoor3321);  
            stream_229.add(char_literal343);


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
            // 513:34: -> ^( UNLOCKDOOR doorInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:513:37: ^( UNLOCKDOOR doorInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:516:1: doorInfo : ( isName )* ;
    public final AtrophyScriptParser.doorInfo_return doorInfo() throws RecognitionException {
        AtrophyScriptParser.doorInfo_return retval = new AtrophyScriptParser.doorInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName344 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:516:9: ( ( isName )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:517:4: ( isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:517:4: ( isName )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==168) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:517:4: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_doorInfo3344);
            	    isName344=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName344.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:520:1: addTag : ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) );
    public final AtrophyScriptParser.addTag_return addTag() throws RecognitionException {
        AtrophyScriptParser.addTag_return retval = new AtrophyScriptParser.addTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal345=null;
        Token ADD_TAG_PREFIX347=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral346 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral348 =null;


        CommonTree string_literal345_tree=null;
        CommonTree ADD_TAG_PREFIX347_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_ADD_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token ADD_TAG_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:520:7: ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==143) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:521:4: 'addTag:' stringLiteral
                    {
                    string_literal345=(Token)match(input,143,FOLLOW_143_in_addTag3360);  
                    stream_143.add(string_literal345);


                    pushFollow(FOLLOW_stringLiteral_in_addTag3362);
                    stringLiteral346=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral346.getTree());

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
                    // 521:28: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:521:31: ^( ADDTAG stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:522:6: ADD_TAG_PREFIX stringLiteral
                    {
                    ADD_TAG_PREFIX347=(Token)match(input,ADD_TAG_PREFIX,FOLLOW_ADD_TAG_PREFIX_in_addTag3377);  
                    stream_ADD_TAG_PREFIX.add(ADD_TAG_PREFIX347);


                    pushFollow(FOLLOW_stringLiteral_in_addTag3379);
                    stringLiteral348=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral348.getTree());

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
                    // 522:35: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:522:38: ^( ADDTAG stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:525:1: removeTag : ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) );
    public final AtrophyScriptParser.removeTag_return removeTag() throws RecognitionException {
        AtrophyScriptParser.removeTag_return retval = new AtrophyScriptParser.removeTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal349=null;
        Token REMOVE_TAG_PREFIX351=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral350 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral352 =null;


        CommonTree string_literal349_tree=null;
        CommonTree REMOVE_TAG_PREFIX351_tree=null;
        RewriteRuleTokenStream stream_REMOVE_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token REMOVE_TAG_PREFIX");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:525:10: ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==193) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:526:4: 'removeTag:' stringLiteral
                    {
                    string_literal349=(Token)match(input,193,FOLLOW_193_in_removeTag3402);  
                    stream_193.add(string_literal349);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag3404);
                    stringLiteral350=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral350.getTree());

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
                    // 526:31: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:526:34: ^( REMOVETAG stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:527:6: REMOVE_TAG_PREFIX stringLiteral
                    {
                    REMOVE_TAG_PREFIX351=(Token)match(input,REMOVE_TAG_PREFIX,FOLLOW_REMOVE_TAG_PREFIX_in_removeTag3419);  
                    stream_REMOVE_TAG_PREFIX.add(REMOVE_TAG_PREFIX351);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag3421);
                    stringLiteral352=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral352.getTree());

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
                    // 527:38: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:527:41: ^( REMOVETAG stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:530:1: directorBias : 'directorBias:' -> ^( DIRECTORBIAS ) ;
    public final AtrophyScriptParser.directorBias_return directorBias() throws RecognitionException {
        AtrophyScriptParser.directorBias_return retval = new AtrophyScriptParser.directorBias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal353=null;

        CommonTree string_literal353_tree=null;
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:530:13: ( 'directorBias:' -> ^( DIRECTORBIAS ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:531:4: 'directorBias:'
            {
            string_literal353=(Token)match(input,157,FOLLOW_157_in_directorBias3444);  
            stream_157.add(string_literal353);


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
            // 531:20: -> ^( DIRECTORBIAS )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:531:23: ^( DIRECTORBIAS )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:534:1: changeAiNode : 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}' -> ^( CHANGEAINODE unitInfo aiNodeOptions ) ;
    public final AtrophyScriptParser.changeAiNode_return changeAiNode() throws RecognitionException {
        AtrophyScriptParser.changeAiNode_return retval = new AtrophyScriptParser.changeAiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal354=null;
        Token char_literal355=null;
        Token char_literal356=null;
        Token char_literal358=null;
        Token char_literal359=null;
        Token char_literal361=null;
        Token char_literal362=null;
        AtrophyScriptParser.unitInfo_return unitInfo357 =null;

        AtrophyScriptParser.aiNodeOptions_return aiNodeOptions360 =null;


        CommonTree string_literal354_tree=null;
        CommonTree char_literal355_tree=null;
        CommonTree char_literal356_tree=null;
        CommonTree char_literal358_tree=null;
        CommonTree char_literal359_tree=null;
        CommonTree char_literal361_tree=null;
        CommonTree char_literal362_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_aiNodeOptions=new RewriteRuleSubtreeStream(adaptor,"rule aiNodeOptions");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:534:13: ( 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}' -> ^( CHANGEAINODE unitInfo aiNodeOptions ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:535:4: 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}'
            {
            string_literal354=(Token)match(input,150,FOLLOW_150_in_changeAiNode3465);  
            stream_150.add(string_literal354);


            char_literal355=(Token)match(input,228,FOLLOW_228_in_changeAiNode3467);  
            stream_228.add(char_literal355);


            char_literal356=(Token)match(input,228,FOLLOW_228_in_changeAiNode3469);  
            stream_228.add(char_literal356);


            pushFollow(FOLLOW_unitInfo_in_changeAiNode3471);
            unitInfo357=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo357.getTree());

            char_literal358=(Token)match(input,229,FOLLOW_229_in_changeAiNode3473);  
            stream_229.add(char_literal358);


            char_literal359=(Token)match(input,228,FOLLOW_228_in_changeAiNode3475);  
            stream_228.add(char_literal359);


            pushFollow(FOLLOW_aiNodeOptions_in_changeAiNode3477);
            aiNodeOptions360=aiNodeOptions();

            state._fsp--;

            stream_aiNodeOptions.add(aiNodeOptions360.getTree());

            char_literal361=(Token)match(input,229,FOLLOW_229_in_changeAiNode3479);  
            stream_229.add(char_literal361);


            char_literal362=(Token)match(input,229,FOLLOW_229_in_changeAiNode3481);  
            stream_229.add(char_literal362);


            // AST REWRITE
            // elements: aiNodeOptions, unitInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 535:66: -> ^( CHANGEAINODE unitInfo aiNodeOptions )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:535:69: ^( CHANGEAINODE unitInfo aiNodeOptions )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:538:1: showMessage : 'showMessage:' stringLiteral -> ^( SHOWMESSAGE stringLiteral ) ;
    public final AtrophyScriptParser.showMessage_return showMessage() throws RecognitionException {
        AtrophyScriptParser.showMessage_return retval = new AtrophyScriptParser.showMessage_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal363=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral364 =null;


        CommonTree string_literal363_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:538:12: ( 'showMessage:' stringLiteral -> ^( SHOWMESSAGE stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:539:4: 'showMessage:' stringLiteral
            {
            string_literal363=(Token)match(input,200,FOLLOW_200_in_showMessage3506);  
            stream_200.add(string_literal363);


            pushFollow(FOLLOW_stringLiteral_in_showMessage3508);
            stringLiteral364=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral364.getTree());

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
            // 539:33: -> ^( SHOWMESSAGE stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:539:36: ^( SHOWMESSAGE stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:542:1: setTriggerRunning : 'setTriggerRunning:' stringLiteral BOOL -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL ) ;
    public final AtrophyScriptParser.setTriggerRunning_return setTriggerRunning() throws RecognitionException {
        AtrophyScriptParser.setTriggerRunning_return retval = new AtrophyScriptParser.setTriggerRunning_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal365=null;
        Token BOOL367=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral366 =null;


        CommonTree string_literal365_tree=null;
        CommonTree BOOL367_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:542:18: ( 'setTriggerRunning:' stringLiteral BOOL -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:543:4: 'setTriggerRunning:' stringLiteral BOOL
            {
            string_literal365=(Token)match(input,199,FOLLOW_199_in_setTriggerRunning3531);  
            stream_199.add(string_literal365);


            pushFollow(FOLLOW_stringLiteral_in_setTriggerRunning3533);
            stringLiteral366=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral366.getTree());

            BOOL367=(Token)match(input,BOOL,FOLLOW_BOOL_in_setTriggerRunning3535);  
            stream_BOOL.add(BOOL367);


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
            // 543:44: -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:543:47: ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SETTRIGGERRUNNING, "SETTRIGGERRUNNING")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:543:67: ^( STRING stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:546:1: spawnItem : 'spawnItem' stringList '{' unitInfo '}' -> ^( SPAWNITEM stringList unitInfo ) ;
    public final AtrophyScriptParser.spawnItem_return spawnItem() throws RecognitionException {
        AtrophyScriptParser.spawnItem_return retval = new AtrophyScriptParser.spawnItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal368=null;
        Token char_literal370=null;
        Token char_literal372=null;
        AtrophyScriptParser.stringList_return stringList369 =null;

        AtrophyScriptParser.unitInfo_return unitInfo371 =null;


        CommonTree string_literal368_tree=null;
        CommonTree char_literal370_tree=null;
        CommonTree char_literal372_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:546:10: ( 'spawnItem' stringList '{' unitInfo '}' -> ^( SPAWNITEM stringList unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:547:4: 'spawnItem' stringList '{' unitInfo '}'
            {
            string_literal368=(Token)match(input,202,FOLLOW_202_in_spawnItem3564);  
            stream_202.add(string_literal368);


            pushFollow(FOLLOW_stringList_in_spawnItem3566);
            stringList369=stringList();

            state._fsp--;

            stream_stringList.add(stringList369.getTree());

            char_literal370=(Token)match(input,228,FOLLOW_228_in_spawnItem3568);  
            stream_228.add(char_literal370);


            pushFollow(FOLLOW_unitInfo_in_spawnItem3570);
            unitInfo371=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo371.getTree());

            char_literal372=(Token)match(input,229,FOLLOW_229_in_spawnItem3572);  
            stream_229.add(char_literal372);


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
            // 547:44: -> ^( SPAWNITEM stringList unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:547:47: ^( SPAWNITEM stringList unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:550:1: spawnTalkNode : 'spawnTalkNode' '{' unitInfo '}' -> ^( SPAWNTALKNODE unitInfo ) ;
    public final AtrophyScriptParser.spawnTalkNode_return spawnTalkNode() throws RecognitionException {
        AtrophyScriptParser.spawnTalkNode_return retval = new AtrophyScriptParser.spawnTalkNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal373=null;
        Token char_literal374=null;
        Token char_literal376=null;
        AtrophyScriptParser.unitInfo_return unitInfo375 =null;


        CommonTree string_literal373_tree=null;
        CommonTree char_literal374_tree=null;
        CommonTree char_literal376_tree=null;
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:550:14: ( 'spawnTalkNode' '{' unitInfo '}' -> ^( SPAWNTALKNODE unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:551:4: 'spawnTalkNode' '{' unitInfo '}'
            {
            string_literal373=(Token)match(input,203,FOLLOW_203_in_spawnTalkNode3597);  
            stream_203.add(string_literal373);


            char_literal374=(Token)match(input,228,FOLLOW_228_in_spawnTalkNode3599);  
            stream_228.add(char_literal374);


            pushFollow(FOLLOW_unitInfo_in_spawnTalkNode3601);
            unitInfo375=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo375.getTree());

            char_literal376=(Token)match(input,229,FOLLOW_229_in_spawnTalkNode3603);  
            stream_229.add(char_literal376);


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
            // 551:37: -> ^( SPAWNTALKNODE unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:551:40: ^( SPAWNTALKNODE unitInfo )
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


    public static class unlockTech_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unlockTech"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:554:1: unlockTech : 'unlockTech:' stringList -> ^( UNLOCKTECH stringList ) ;
    public final AtrophyScriptParser.unlockTech_return unlockTech() throws RecognitionException {
        AtrophyScriptParser.unlockTech_return retval = new AtrophyScriptParser.unlockTech_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal377=null;
        AtrophyScriptParser.stringList_return stringList378 =null;


        CommonTree string_literal377_tree=null;
        RewriteRuleTokenStream stream_222=new RewriteRuleTokenStream(adaptor,"token 222");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:554:11: ( 'unlockTech:' stringList -> ^( UNLOCKTECH stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:555:4: 'unlockTech:' stringList
            {
            string_literal377=(Token)match(input,222,FOLLOW_222_in_unlockTech3626);  
            stream_222.add(string_literal377);


            pushFollow(FOLLOW_stringList_in_unlockTech3628);
            stringList378=stringList();

            state._fsp--;

            stream_stringList.add(stringList378.getTree());

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
            // 555:29: -> ^( UNLOCKTECH stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:555:32: ^( UNLOCKTECH stringList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UNLOCKTECH, "UNLOCKTECH")
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
    // $ANTLR end "unlockTech"


    public static class changeStat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "changeStat"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:558:1: changeStat : ( 'changeAdvance:' ( '-' )? INT -> ^( CHANGEADVANCE ( '-' )? INT ) | 'changeStability:' ( '-' )? INT -> ^( CHANGESTABILITY ( '-' )? INT ) );
    public final AtrophyScriptParser.changeStat_return changeStat() throws RecognitionException {
        AtrophyScriptParser.changeStat_return retval = new AtrophyScriptParser.changeStat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal379=null;
        Token char_literal380=null;
        Token INT381=null;
        Token string_literal382=null;
        Token char_literal383=null;
        Token INT384=null;

        CommonTree string_literal379_tree=null;
        CommonTree char_literal380_tree=null;
        CommonTree INT381_tree=null;
        CommonTree string_literal382_tree=null;
        CommonTree char_literal383_tree=null;
        CommonTree INT384_tree=null;
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:558:11: ( 'changeAdvance:' ( '-' )? INT -> ^( CHANGEADVANCE ( '-' )? INT ) | 'changeStability:' ( '-' )? INT -> ^( CHANGESTABILITY ( '-' )? INT ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==149) ) {
                alt50=1;
            }
            else if ( (LA50_0==151) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:559:4: 'changeAdvance:' ( '-' )? INT
                    {
                    string_literal379=(Token)match(input,149,FOLLOW_149_in_changeStat3651);  
                    stream_149.add(string_literal379);


                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:559:21: ( '-' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==119) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:559:21: '-'
                            {
                            char_literal380=(Token)match(input,119,FOLLOW_119_in_changeStat3653);  
                            stream_119.add(char_literal380);


                            }
                            break;

                    }


                    INT381=(Token)match(input,INT,FOLLOW_INT_in_changeStat3656);  
                    stream_INT.add(INT381);


                    // AST REWRITE
                    // elements: INT, 119
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 559:30: -> ^( CHANGEADVANCE ( '-' )? INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:559:33: ^( CHANGEADVANCE ( '-' )? INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CHANGEADVANCE, "CHANGEADVANCE")
                        , root_1);

                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:559:49: ( '-' )?
                        if ( stream_119.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_119.nextNode()
                            );

                        }
                        stream_119.reset();

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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:560:6: 'changeStability:' ( '-' )? INT
                    {
                    string_literal382=(Token)match(input,151,FOLLOW_151_in_changeStat3674);  
                    stream_151.add(string_literal382);


                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:560:25: ( '-' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==119) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:560:25: '-'
                            {
                            char_literal383=(Token)match(input,119,FOLLOW_119_in_changeStat3676);  
                            stream_119.add(char_literal383);


                            }
                            break;

                    }


                    INT384=(Token)match(input,INT,FOLLOW_INT_in_changeStat3679);  
                    stream_INT.add(INT384);


                    // AST REWRITE
                    // elements: INT, 119
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 560:34: -> ^( CHANGESTABILITY ( '-' )? INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:560:37: ^( CHANGESTABILITY ( '-' )? INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CHANGESTABILITY, "CHANGESTABILITY")
                        , root_1);

                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:560:55: ( '-' )?
                        if ( stream_119.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_119.nextNode()
                            );

                        }
                        stream_119.reset();

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
    // $ANTLR end "changeStat"


    public static class sequenceDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sequenceDecl"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:563:1: sequenceDecl : 'SEQUENCE::' stringLiteral '{' ( ( commandConditional )? commandCallList )* '}' -> ^( SEQUENCE stringLiteral commandCallList ) ;
    public final AtrophyScriptParser.sequenceDecl_return sequenceDecl() throws RecognitionException {
        AtrophyScriptParser.sequenceDecl_return retval = new AtrophyScriptParser.sequenceDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal385=null;
        Token char_literal387=null;
        Token char_literal390=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral386 =null;

        AtrophyScriptParser.commandConditional_return commandConditional388 =null;

        AtrophyScriptParser.commandCallList_return commandCallList389 =null;


        CommonTree string_literal385_tree=null;
        CommonTree char_literal387_tree=null;
        CommonTree char_literal390_tree=null;
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleSubtreeStream stream_commandConditional=new RewriteRuleSubtreeStream(adaptor,"rule commandConditional");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_commandCallList=new RewriteRuleSubtreeStream(adaptor,"rule commandCallList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:563:13: ( 'SEQUENCE::' stringLiteral '{' ( ( commandConditional )? commandCallList )* '}' -> ^( SEQUENCE stringLiteral commandCallList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:564:4: 'SEQUENCE::' stringLiteral '{' ( ( commandConditional )? commandCallList )* '}'
            {
            string_literal385=(Token)match(input,137,FOLLOW_137_in_sequenceDecl3705);  
            stream_137.add(string_literal385);


            pushFollow(FOLLOW_stringLiteral_in_sequenceDecl3707);
            stringLiteral386=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral386.getTree());

            char_literal387=(Token)match(input,228,FOLLOW_228_in_sequenceDecl3709);  
            stream_228.add(char_literal387);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:565:4: ( ( commandConditional )? commandCallList )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==COMMAND_CALL_PREFIX||LA52_0==127||LA52_0==129||LA52_0==148) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:565:5: ( commandConditional )? commandCallList
            	    {
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:565:5: ( commandConditional )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==127) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:565:5: commandConditional
            	            {
            	            pushFollow(FOLLOW_commandConditional_in_sequenceDecl3715);
            	            commandConditional388=commandConditional();

            	            state._fsp--;

            	            stream_commandConditional.add(commandConditional388.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_commandCallList_in_sequenceDecl3718);
            	    commandCallList389=commandCallList();

            	    state._fsp--;

            	    stream_commandCallList.add(commandCallList389.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            char_literal390=(Token)match(input,229,FOLLOW_229_in_sequenceDecl3725);  
            stream_229.add(char_literal390);


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
            // 567:4: -> ^( SEQUENCE stringLiteral commandCallList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:568:4: ^( SEQUENCE stringLiteral commandCallList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:571:1: commandConditional : ( 'IF' 'HAS' stringList | 'IF' '!HAS' stringList );
    public final AtrophyScriptParser.commandConditional_return commandConditional() throws RecognitionException {
        AtrophyScriptParser.commandConditional_return retval = new AtrophyScriptParser.commandConditional_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal391=null;
        Token string_literal392=null;
        Token string_literal394=null;
        Token string_literal395=null;
        AtrophyScriptParser.stringList_return stringList393 =null;

        AtrophyScriptParser.stringList_return stringList396 =null;


        CommonTree string_literal391_tree=null;
        CommonTree string_literal392_tree=null;
        CommonTree string_literal394_tree=null;
        CommonTree string_literal395_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:571:19: ( 'IF' 'HAS' stringList | 'IF' '!HAS' stringList )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==127) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==126) ) {
                    alt53=1;
                }
                else if ( (LA53_1==113) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:572:3: 'IF' 'HAS' stringList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal391=(Token)match(input,127,FOLLOW_127_in_commandConditional3755); 
                    string_literal391_tree = 
                    (CommonTree)adaptor.create(string_literal391)
                    ;
                    adaptor.addChild(root_0, string_literal391_tree);


                    string_literal392=(Token)match(input,126,FOLLOW_126_in_commandConditional3756); 
                    string_literal392_tree = 
                    (CommonTree)adaptor.create(string_literal392)
                    ;
                    adaptor.addChild(root_0, string_literal392_tree);


                    pushFollow(FOLLOW_stringList_in_commandConditional3758);
                    stringList393=stringList();

                    state._fsp--;

                    adaptor.addChild(root_0, stringList393.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:573:5: 'IF' '!HAS' stringList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal394=(Token)match(input,127,FOLLOW_127_in_commandConditional3764); 
                    string_literal394_tree = 
                    (CommonTree)adaptor.create(string_literal394)
                    ;
                    adaptor.addChild(root_0, string_literal394_tree);


                    string_literal395=(Token)match(input,113,FOLLOW_113_in_commandConditional3765); 
                    string_literal395_tree = 
                    (CommonTree)adaptor.create(string_literal395)
                    ;
                    adaptor.addChild(root_0, string_literal395_tree);


                    pushFollow(FOLLOW_stringList_in_commandConditional3767);
                    stringList396=stringList();

                    state._fsp--;

                    adaptor.addChild(root_0, stringList396.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:576:1: commandCallList : commandCall ( ',' ! commandCall )* ;
    public final AtrophyScriptParser.commandCallList_return commandCallList() throws RecognitionException {
        AtrophyScriptParser.commandCallList_return retval = new AtrophyScriptParser.commandCallList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal398=null;
        AtrophyScriptParser.commandCall_return commandCall397 =null;

        AtrophyScriptParser.commandCall_return commandCall399 =null;


        CommonTree char_literal398_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:576:16: ( commandCall ( ',' ! commandCall )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:577:4: commandCall ( ',' ! commandCall )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_commandCall_in_commandCallList3780);
            commandCall397=commandCall();

            state._fsp--;

            adaptor.addChild(root_0, commandCall397.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:577:16: ( ',' ! commandCall )*
            loop54:
            do {
                int alt54=2;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:577:17: ',' ! commandCall
            	    {
            	    char_literal398=(Token)match(input,118,FOLLOW_118_in_commandCallList3783); 

            	    pushFollow(FOLLOW_commandCall_in_commandCallList3786);
            	    commandCall399=commandCall();

            	    state._fsp--;

            	    adaptor.addChild(root_0, commandCall399.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:580:1: commandCall : ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) | atCall );
    public final AtrophyScriptParser.commandCall_return commandCall() throws RecognitionException {
        AtrophyScriptParser.commandCall_return retval = new AtrophyScriptParser.commandCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal400=null;
        Token COMMAND_CALL_PREFIX402=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral401 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral403 =null;

        AtrophyScriptParser.atCall_return atCall404 =null;


        CommonTree string_literal400_tree=null;
        CommonTree COMMAND_CALL_PREFIX402_tree=null;
        RewriteRuleTokenStream stream_COMMAND_CALL_PREFIX=new RewriteRuleTokenStream(adaptor,"token COMMAND_CALL_PREFIX");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:580:12: ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) | atCall )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 148:
                {
                alt55=1;
                }
                break;
            case COMMAND_CALL_PREFIX:
                {
                alt55=2;
                }
                break;
            case 129:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }

            switch (alt55) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:581:4: 'callCommand:' stringLiteral
                    {
                    string_literal400=(Token)match(input,148,FOLLOW_148_in_commandCall3803);  
                    stream_148.add(string_literal400);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall3805);
                    stringLiteral401=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral401.getTree());

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
                    // 581:33: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:581:36: ^( COMMAND_CALL stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:582:6: COMMAND_CALL_PREFIX stringLiteral
                    {
                    COMMAND_CALL_PREFIX402=(Token)match(input,COMMAND_CALL_PREFIX,FOLLOW_COMMAND_CALL_PREFIX_in_commandCall3820);  
                    stream_COMMAND_CALL_PREFIX.add(COMMAND_CALL_PREFIX402);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall3822);
                    stringLiteral403=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral403.getTree());

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
                    // 582:40: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:582:43: ^( COMMAND_CALL stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:583:6: atCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atCall_in_commandCall3837);
                    atCall404=atCall();

                    state._fsp--;

                    adaptor.addChild(root_0, atCall404.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:586:1: atCall : ( 'LOAD' 'MODULE' stringList '@' s2= stringLiteral -> ^( ATCALL_MODULE stringList $s2) | 'LOAD' 'SEQUENCE' stringList '@' s2= stringLiteral -> ^( ATCALL_SEQUENCE stringList $s2) );
    public final AtrophyScriptParser.atCall_return atCall() throws RecognitionException {
        AtrophyScriptParser.atCall_return retval = new AtrophyScriptParser.atCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal405=null;
        Token string_literal406=null;
        Token char_literal408=null;
        Token string_literal409=null;
        Token string_literal410=null;
        Token char_literal412=null;
        AtrophyScriptParser.stringLiteral_return s2 =null;

        AtrophyScriptParser.stringList_return stringList407 =null;

        AtrophyScriptParser.stringList_return stringList411 =null;


        CommonTree string_literal405_tree=null;
        CommonTree string_literal406_tree=null;
        CommonTree char_literal408_tree=null;
        CommonTree string_literal409_tree=null;
        CommonTree string_literal410_tree=null;
        CommonTree char_literal412_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:586:7: ( 'LOAD' 'MODULE' stringList '@' s2= stringLiteral -> ^( ATCALL_MODULE stringList $s2) | 'LOAD' 'SEQUENCE' stringList '@' s2= stringLiteral -> ^( ATCALL_SEQUENCE stringList $s2) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==129) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==132) ) {
                    alt56=1;
                }
                else if ( (LA56_1==136) ) {
                    alt56=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:587:4: 'LOAD' 'MODULE' stringList '@' s2= stringLiteral
                    {
                    string_literal405=(Token)match(input,129,FOLLOW_129_in_atCall3852);  
                    stream_129.add(string_literal405);


                    string_literal406=(Token)match(input,132,FOLLOW_132_in_atCall3854);  
                    stream_132.add(string_literal406);


                    pushFollow(FOLLOW_stringList_in_atCall3856);
                    stringList407=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList407.getTree());

                    char_literal408=(Token)match(input,121,FOLLOW_121_in_atCall3858);  
                    stream_121.add(char_literal408);


                    pushFollow(FOLLOW_stringLiteral_in_atCall3862);
                    s2=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(s2.getTree());

                    // AST REWRITE
                    // elements: stringList, s2
                    // token labels: 
                    // rule labels: retval, s2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 587:52: -> ^( ATCALL_MODULE stringList $s2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:587:55: ^( ATCALL_MODULE stringList $s2)
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:588:6: 'LOAD' 'SEQUENCE' stringList '@' s2= stringLiteral
                    {
                    string_literal409=(Token)match(input,129,FOLLOW_129_in_atCall3880);  
                    stream_129.add(string_literal409);


                    string_literal410=(Token)match(input,136,FOLLOW_136_in_atCall3882);  
                    stream_136.add(string_literal410);


                    pushFollow(FOLLOW_stringList_in_atCall3884);
                    stringList411=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList411.getTree());

                    char_literal412=(Token)match(input,121,FOLLOW_121_in_atCall3886);  
                    stream_121.add(char_literal412);


                    pushFollow(FOLLOW_stringLiteral_in_atCall3890);
                    s2=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(s2.getTree());

                    // AST REWRITE
                    // elements: stringList, s2
                    // token labels: 
                    // rule labels: retval, s2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 588:56: -> ^( ATCALL_SEQUENCE stringList $s2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:588:59: ^( ATCALL_SEQUENCE stringList $s2)
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:591:1: stringLiteral : '\"' ! ( . )* '\"' !;
    public final AtrophyScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        AtrophyScriptParser.stringLiteral_return retval = new AtrophyScriptParser.stringLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal413=null;
        Token wildcard414=null;
        Token char_literal415=null;

        CommonTree char_literal413_tree=null;
        CommonTree wildcard414_tree=null;
        CommonTree char_literal415_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:591:14: ( '\"' ! ( . )* '\"' !)
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:592:4: '\"' ! ( . )* '\"' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal413=(Token)match(input,114,FOLLOW_114_in_stringLiteral3918); 

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:592:9: ( . )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==114) ) {
                    alt57=2;
                }
                else if ( ((LA57_0 >= ADDTAG && LA57_0 <= 113)||(LA57_0 >= 115 && LA57_0 <= 229)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:592:9: .
            	    {
            	    wildcard414=(Token)input.LT(1);

            	    matchAny(input); 
            	    wildcard414_tree = (CommonTree)adaptor.create(wildcard414);
            	    adaptor.addChild(root_0, wildcard414_tree);


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            char_literal415=(Token)match(input,114,FOLLOW_114_in_stringLiteral3924); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    protected DFA54 dfa54 = new DFA54(this);
    static final String DFA54_eotS =
        "\100\uffff";
    static final String DFA54_eofS =
        "\100\uffff";
    static final String DFA54_minS =
        "\1\23\1\5\1\uffff\2\162\1\u0084\2\4\2\162\1\uffff\1\4\1\uffff\25"+
        "\4\1\uffff\7\4\1\uffff\3\4\2\uffff\2\4\3\uffff\3\4\1\uffff\3\4\4"+
        "\uffff";
    static final String DFA54_maxS =
        "\1\u00e5\1\u00df\1\uffff\2\162\1\u0088\2\u00e5\2\162\1\uffff\1\u00e5"+
        "\1\uffff\25\u00e5\1\uffff\7\u00e5\1\uffff\3\u00e5\2\uffff\2\u00e5"+
        "\3\uffff\3\u00e5\1\uffff\3\u00e5\4\uffff";
    static final String DFA54_acceptS =
        "\2\uffff\1\2\7\uffff\1\1\1\uffff\1\1\25\uffff\1\1\7\uffff\1\1\3"+
        "\uffff\2\1\2\uffff\3\1\3\uffff\1\1\3\uffff\4\1";
    static final String DFA54_specialS =
        "\100\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\2\142\uffff\1\1\10\uffff\1\2\1\uffff\1\2\22\uffff\1\2\120"+
            "\uffff\1\2",
            "\1\2\15\uffff\1\4\64\uffff\1\2\40\uffff\1\2\27\uffff\1\5\15"+
            "\uffff\1\2\4\uffff\1\3\3\2\2\uffff\1\2\2\uffff\1\2\17\uffff"+
            "\1\2\2\uffff\2\2\16\uffff\3\2\2\uffff\1\2\1\uffff\6\2\10\uffff"+
            "\1\2\7\uffff\3\2",
            "",
            "\1\6",
            "\1\7",
            "\1\10\3\uffff\1\11",
            "\156\13\1\12\163\13",
            "\156\15\1\14\163\15",
            "\1\16",
            "\1\17",
            "",
            "\156\13\1\12\163\13",
            "",
            "\156\15\1\14\163\15",
            "\156\21\1\20\163\21",
            "\156\23\1\22\163\23",
            "\156\21\1\20\3\21\1\24\2\21\1\25\154\21",
            "\156\21\1\20\163\21",
            "\156\23\1\22\3\23\1\26\2\23\1\27\154\23",
            "\156\23\1\22\163\23",
            "\156\21\1\30\163\21",
            "\156\21\1\31\163\21",
            "\156\23\1\32\163\23",
            "\156\23\1\33\163\23",
            "\156\37\1\36\3\37\1\34\2\37\1\35\154\37",
            "\156\43\1\42\3\43\1\40\2\43\1\41\154\43",
            "\156\47\1\46\3\47\1\44\2\47\1\45\154\47",
            "\156\53\1\52\3\53\1\50\2\53\1\51\154\53",
            "\156\37\1\54\163\37",
            "\156\37\1\55\163\37",
            "\156\37\1\36\3\37\1\34\2\37\1\35\154\37",
            "\156\37\1\36\163\37",
            "\156\43\1\56\163\43",
            "\156\43\1\57\163\43",
            "",
            "\156\43\1\42\163\43",
            "\156\47\1\60\163\47",
            "\156\47\1\61\163\47",
            "\156\47\1\46\3\47\1\44\2\47\1\45\154\47",
            "\156\47\1\46\163\47",
            "\156\53\1\62\163\53",
            "\156\53\1\63\163\53",
            "",
            "\156\53\1\52\163\53",
            "\156\37\1\36\3\37\1\34\2\37\1\35\154\37",
            "\156\67\1\64\3\67\1\65\2\67\1\66\154\67",
            "",
            "",
            "\156\47\1\46\3\47\1\44\2\47\1\45\154\47",
            "\156\73\1\70\3\73\1\71\2\73\1\72\154\73",
            "",
            "",
            "",
            "\156\67\1\74\163\67",
            "\156\67\1\75\163\67",
            "\156\67\1\64\163\67",
            "",
            "\156\73\1\76\163\73",
            "\156\73\1\77\163\73",
            "\156\73\1\70\163\73",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "()* loopback of 577:16: ( ',' ! commandCall )*";
        }
    }
 

    public static final BitSet FOLLOW_sequenceDecl_in_prog452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000220L});
    public static final BitSet FOLLOW_moduleDecl_in_prog456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000220L});
    public static final BitSet FOLLOW_EOF_in_prog464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_moduleDecl480 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_moduleDecl482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_moduleDecl484 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x400C00000108388DL,0x0000002005840000L});
    public static final BitSet FOLLOW_command_in_moduleDecl490 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L,0x400C00000108388DL,0x0000002005840000L});
    public static final BitSet FOLLOW_229_in_moduleDecl496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSize_in_command521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSpawns_in_command528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemSpawns_in_command535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockDecl_in_command542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portalDecl_in_command549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textureBlockDecl_in_command556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerDecl_in_command563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandDecl_in_command570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_talkDecl_in_command577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_requiredAssignment590 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_requiredAssignment592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requiredAssignment_in_varAssignment616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_mapSize643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_178_in_mapSize647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_mapSize650 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_mapSize652 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_mapSize654 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_mapSize656 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_mapSize658 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_mapSize660 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_mapSize662 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_mapSize664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_mapSize666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_mapSpawns691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_179_in_mapSpawns695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_mapSpawns698 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_stringList_in_mapSpawns700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_mapSpawns703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_itemSpawns727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_itemSpawns729 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawns731 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_itemSpawns733 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawns735 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_itemSpawns737 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawns739 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_itemSpawns741 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawns743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_itemSpawns745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_blockDecl770 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_147_in_blockDecl774 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_varAssignment_in_blockDecl777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_blockDecl779 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x3E80400008014400L,0x0000002E1A5AE030L});
    public static final BitSet FOLLOW_properties_in_blockDecl781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_blockDecl783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_portalDecl809 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_190_in_portalDecl813 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_varAssignment_in_portalDecl816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_portalDecl818 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x3E80400008014400L,0x0000002E1A5AE030L});
    public static final BitSet FOLLOW_properties_in_portalDecl820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_portalDecl822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_textureBlockDecl848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_216_in_textureBlockDecl852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_215_in_textureBlockDecl856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_textureBlockDecl859 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x3E80400008014400L,0x0000002E1A5AE030L});
    public static final BitSet FOLLOW_properties_in_textureBlockDecl861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_textureBlockDecl863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_triggerDecl887 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_218_in_triggerDecl891 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_triggerDecl894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_triggerDecl896 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x3E80400008014400L,0x0000002E1A5AE030L});
    public static final BitSet FOLLOW_properties_in_triggerDecl898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_triggerDecl900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_commandDecl926 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_152_in_commandDecl930 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_commandDecl933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_commandDecl935 = new BitSet(new long[]{0x0000000000080020L,0x0000020000000100L,0x0003200024F08002L,0x00000000E0201FA7L});
    public static final BitSet FOLLOW_triggerEffectList_in_commandDecl937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_commandDecl939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_talkDecl969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_210_in_talkDecl973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_talkDecl976 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x3E80400008014400L,0x0000002E1A5AE030L});
    public static final BitSet FOLLOW_properties_in_talkDecl978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_talkDecl980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xListProperty_in_properties1004 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_yListProperty_in_properties1011 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_factionTerritoryProperty_in_properties1018 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_factionZoneProperty_in_properties1025 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_saferoomProperty_in_properties1032 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_stageProperty_in_properties1039 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_stageDeclProperty_in_properties1046 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_talkMapParentProperty_in_properties1053 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_aiInitProperty_in_properties1060 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_openingLineProperty_in_properties1067 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_optionProperty_in_properties1074 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_topicProperty_in_properties1081 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_triggerCondProperty_in_properties1088 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_triggerEffectProperty_in_properties1095 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_coverDecl_in_properties1102 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_stashDecl_in_properties1109 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x3E80400008014400L,0x0000000E1A5AE030L});
    public static final BitSet FOLLOW_225_in_xListProperty1126 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty1128 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_xListProperty1131 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty1132 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_226_in_yListProperty1156 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty1158 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_yListProperty1161 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty1162 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_214_in_factionTerritoryProperty1188 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_factionTerritoryProperty1190 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_factionTerritoryProperty1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_factionZoneProperty1221 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_factionZoneProperty1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_saferoomProperty1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_stageDeclProperty1267 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1269 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_stageDeclProperty1272 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1274 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_189_in_talkMapParentProperty1301 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_188_in_talkMapParentProperty1305 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_talkMapParentProperty1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_stageProperty1332 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_196_in_stageProperty1336 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_stageProperty1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_aiInitProperty1363 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_142_in_aiInitProperty1367 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOL_in_aiInitProperty1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_openingLineProperty1394 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_185_in_openingLineProperty1398 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_186_in_openingLineProperty1402 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_openingLineProperty1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_optionProperty1427 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_187_in_optionProperty1431 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_optionProperty1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_topicProperty1458 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_217_in_topicProperty1462 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_topicProperty1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_topicProperty1467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L,0x0000002000000008L});
    public static final BitSet FOLLOW_topicProperties_in_topicProperty1469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_topicProperty1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topicLine_in_topicProperties1498 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_topicRequiement_in_topicProperties1502 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_175_in_topicLine1519 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_topicLine1520 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_topicLine1523 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_topicLine1525 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_195_in_topicRequiement1551 = new BitSet(new long[]{0x4000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_reqString_in_topicRequiement1553 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_topicRequiement1556 = new BitSet(new long[]{0x4000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_reqString_in_topicRequiement1558 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_NOT_PREFIX_in_reqString1584 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_reqString1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_reqString1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_aliveQuery1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_aliveQuery1618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00501FFE10020000L,0x0000002000010000L});
    public static final BitSet FOLLOW_unitInfo_in_aliveQuery1620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_aliveQuery1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_timeQuery1645 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_160_in_timeQuery1653 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_timeQuery1675 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_boolQuery1719 = new BitSet(new long[]{0x4000000000000000L,0x0010000000000000L,0x0100000800000000L});
    public static final BitSet FOLLOW_queryLogic_in_boolQuery1722 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_boolQuery1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aliveQuery_in_boolQuery1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeQuery_in_boolQuery1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolQuery_in_queryNegation1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_PREFIX_in_queryNegation1756 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0100000800000000L});
    public static final BitSet FOLLOW_boolQuery_in_queryNegation1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1782 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_122_in_queryLogic1787 = new BitSet(new long[]{0x4000000000000000L,0x0010000000000000L,0x0100000800000000L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_queryLogic1808 = new BitSet(new long[]{0x4000000000000000L,0x0010000000000000L,0x0100000800000000L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_triggerCondProperty1852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_219_in_triggerCondProperty1856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_triggerCondProperty1859 = new BitSet(new long[]{0x4000000000000000L,0x0010000000000000L,0x0100000800000000L});
    public static final BitSet FOLLOW_queryLogic_in_triggerCondProperty1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_triggerCondProperty1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_triggerEffectProperty1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_220_in_triggerEffectProperty1889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_triggerEffectProperty1892 = new BitSet(new long[]{0x0000000000080020L,0x0000020000000100L,0x0003200024F08002L,0x00000000E0201FA7L});
    public static final BitSet FOLLOW_triggerEffectList_in_triggerEffectProperty1894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_triggerEffectProperty1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_coverDecl1920 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_155_in_coverDecl1924 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_varAssignment_in_coverDecl1927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_coverDecl1929 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x3E80400008014400L,0x0000002E1A5AE030L});
    public static final BitSet FOLLOW_properties_in_coverDecl1931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_coverDecl1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_stashDecl1959 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_207_in_stashDecl1963 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_varAssignment_in_stashDecl1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_stashDecl1968 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x3E80400008014400L,0x0000002E1A5AE030L});
    public static final BitSet FOLLOW_properties_in_stashDecl1970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_stashDecl1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList1995 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_triggerEffectList1998 = new BitSet(new long[]{0x0000000000080020L,0x0000020000000100L,0x0003200024F08002L,0x00000000E0201FA7L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList2001 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_updateTalkTree_in_triggerEffect2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnTeam_in_triggerEffect2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnCharacter_in_triggerEffect2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeUnit_in_triggerEffect2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_killUnit_in_triggerEffect2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_teleportUnit_in_triggerEffect2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_converseUnit_in_triggerEffect2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createSaferoom_in_triggerEffect2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeSaferoom_in_triggerEffect2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loadMap_in_triggerEffect2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lockDoor_in_triggerEffect2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlockDoor_in_triggerEffect2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addTag_in_triggerEffect2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeTag_in_triggerEffect2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directorBias_in_triggerEffect2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeAiNode_in_triggerEffect2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showMessage_in_triggerEffect2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setTriggerRunning_in_triggerEffect2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnItem_in_triggerEffect2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnTalkNode_in_triggerEffect2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlockTech_in_triggerEffect2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeStat_in_triggerEffect2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCallList_in_triggerEffect2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_223_in_updateTalkTree2185 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree2187 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree2206 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree2208 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_updateTalkTree2210 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_isName2237 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_isName2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_isFaction2262 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_isFaction2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_isRoom2287 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_isRoom2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_hasItem2312 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_hasItem2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_hasWeapon2337 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_hasWeapon2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList2362 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_stringList2365 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList2367 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_163_in_isAlive2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_isDead2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_isInvestigated2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_isNotInvestigated2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_isDaemon2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_isNotDaemon2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_teleDestination2515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_teleDestination2517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_xListProperty_in_teleDestination2519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_yListProperty_in_teleDestination2521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_teleDestination2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_maxTeamSize2548 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_maxTeamSize2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_minTeamSize2571 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_minTeamSize2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_isPlayer2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_aiNode2611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_aiNode2613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000040000L,0x0000002000010000L});
    public static final BitSet FOLLOW_aiNodeOptions_in_aiNode2615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_aiNode2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subscribeTalkMaps_in_aiNodeOptions2640 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000040000L,0x0000000000010000L});
    public static final BitSet FOLLOW_behaviours_in_aiNodeOptions2645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000040000L,0x0000000000010000L});
    public static final BitSet FOLLOW_aiNodePriority_in_aiNodeOptions2650 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000040000L,0x0000000000010000L});
    public static final BitSet FOLLOW_208_in_subscribeTalkMaps2667 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_subscribeTalkMaps2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_behaviours2691 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_behaviours2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_aiNodePriority2716 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_aiNodePriority2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_unitInfo2742 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_isFaction_in_unitInfo2749 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_isRoom_in_unitInfo2756 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_hasItem_in_unitInfo2763 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_hasWeapon_in_unitInfo2770 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_isAlive_in_unitInfo2777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_isDead_in_unitInfo2784 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_isInvestigated_in_unitInfo2791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_isNotInvestigated_in_unitInfo2798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_isDaemon_in_unitInfo2805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_isNotDaemon_in_unitInfo2812 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_teleDestination_in_unitInfo2819 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_maxTeamSize_in_unitInfo2826 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_minTeamSize_in_unitInfo2833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_subscribeTalkMaps_in_unitInfo2840 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_aiNode_in_unitInfo2847 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_isPlayer_in_unitInfo2854 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00501FFE10020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_204_in_spawnTeam2873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_spawnTeam2875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00501FFE10020000L,0x0000002000010000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnTeam2877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_spawnTeam2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_spawnCharacter2902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_spawnCharacter2904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00501FFE10020000L,0x0000002000010000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnCharacter2906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_spawnCharacter2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_removeUnit2931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_removeUnit2933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00501FFE10020000L,0x0000002000010000L});
    public static final BitSet FOLLOW_unitInfo_in_removeUnit2935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_removeUnit2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_killUnit2960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_killUnit2962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00501FFE10020000L,0x0000002000010000L});
    public static final BitSet FOLLOW_unitInfo_in_killUnit2964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_killUnit2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_teleportUnit2989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_teleportUnit2991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00501FFE10020000L,0x0000002000010000L});
    public static final BitSet FOLLOW_unitInfo_in_teleportUnit2993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_teleportUnit2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_converseUnit3018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_converseUnit3020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00501FFE10020000L,0x0000002000010000L});
    public static final BitSet FOLLOW_unitInfo_in_converseUnit3022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_converseUnit3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_createSaferoom3047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_createSaferoom3049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010002000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_createSaferoom3051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_createSaferoom3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_removeSaferoom3076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_removeSaferoom3078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010002000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_removeSaferoom3080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_removeSaferoom3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_containsFaction3105 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_containsFaction3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsFaction_in_saferoomInfo3131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010002000000L});
    public static final BitSet FOLLOW_isName_in_saferoomInfo3138 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010002000000L});
    public static final BitSet FOLLOW_isName_in_mapInfo3156 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020014040000000L,0x0000000100000040L});
    public static final BitSet FOLLOW_isFaction_in_mapInfo3160 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020014040000000L,0x0000000100000040L});
    public static final BitSet FOLLOW_itemSpawnChance_in_mapInfo3164 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020014040000000L,0x0000000100000040L});
    public static final BitSet FOLLOW_158_in_itemSpawnChance3181 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_itemSpawnChance3198 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_224_in_itemSpawnChance3215 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_itemSpawnChance3232 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_loadMap3257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_loadMap3259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020014040000000L,0x0000002100000040L});
    public static final BitSet FOLLOW_mapInfo_in_loadMap3261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_loadMap3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_lockDoor3286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_lockDoor3288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_doorInfo_in_lockDoor3290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_lockDoor3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_221_in_unlockDoor3315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_unlockDoor3317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_doorInfo_in_unlockDoor3319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_unlockDoor3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_doorInfo3344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_143_in_addTag3360 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_TAG_PREFIX_in_addTag3377 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_removeTag3402 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_TAG_PREFIX_in_removeTag3419 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_directorBias3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_changeAiNode3465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_changeAiNode3467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_changeAiNode3469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00501FFE10020000L,0x0000002000010000L});
    public static final BitSet FOLLOW_unitInfo_in_changeAiNode3471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_changeAiNode3473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_changeAiNode3475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000040000L,0x0000002000010000L});
    public static final BitSet FOLLOW_aiNodeOptions_in_changeAiNode3477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_changeAiNode3479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_changeAiNode3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_showMessage3506 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_showMessage3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_setTriggerRunning3531 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_setTriggerRunning3533 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOL_in_setTriggerRunning3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_spawnItem3564 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_spawnItem3566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_spawnItem3568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00501FFE10020000L,0x0000002000010000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnItem3570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_spawnItem3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_spawnTalkNode3597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_spawnTalkNode3599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00501FFE10020000L,0x0000002000010000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnTalkNode3601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_spawnTalkNode3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_unlockTech3626 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_unlockTech3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_changeStat3651 = new BitSet(new long[]{0x0000002000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_changeStat3653 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_changeStat3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_changeStat3674 = new BitSet(new long[]{0x0000002000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_changeStat3676 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_changeStat3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_sequenceDecl3705 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_sequenceDecl3707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_228_in_sequenceDecl3709 = new BitSet(new long[]{0x0000000000080000L,0x8000000000000000L,0x0000000000100002L,0x0000002000000000L});
    public static final BitSet FOLLOW_commandConditional_in_sequenceDecl3715 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000000100002L});
    public static final BitSet FOLLOW_commandCallList_in_sequenceDecl3718 = new BitSet(new long[]{0x0000000000080000L,0x8000000000000000L,0x0000000000100002L,0x0000002000000000L});
    public static final BitSet FOLLOW_229_in_sequenceDecl3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_commandConditional3755 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_commandConditional3756 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_commandConditional3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_commandConditional3764 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_commandConditional3765 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_commandConditional3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList3780 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_commandCallList3783 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000000100002L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList3786 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_148_in_commandCall3803 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_CALL_PREFIX_in_commandCall3820 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atCall_in_commandCall3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_atCall3852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_atCall3854 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_atCall3856 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_atCall3858 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_atCall3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_atCall3880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_atCall3882 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringList_in_atCall3884 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_atCall3886 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_atCall3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_stringLiteral3918 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000003FFFFFFFFFL});
    public static final BitSet FOLLOW_114_in_stringLiteral3924 = new BitSet(new long[]{0x0000000000000002L});

}