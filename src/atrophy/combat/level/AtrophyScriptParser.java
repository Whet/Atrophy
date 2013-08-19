// $ANTLR 3.4 C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g 2013-08-19 20:48:35

	package atrophy.combat.level;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AtrophyScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDTAG", "ADD_TAG_PREFIX", "AIINIT", "AINODE", "AND", "ATCALL_MODULE", "ATCALL_SEQUENCE", "BEHAVIOUR", "BLOCK", "BOOL", "CHANGEADVANCE", "CHANGEAINODE", "CHANGESTABILITY", "COMMAND", "COMMAND_CALL", "COMMAND_CALL_PREFIX", "COMMENT", "CONDITIONAL", "CONTAINSFACTION", "CONVERSE", "COVER", "DIRECTORBIAS", "DOORNAMES", "EMPTY", "ENG", "ESUPPLY", "EXPIREREPEATS", "EXPIRETIME", "HASITEM", "HASWEAPON", "IDENT", "INIT", "INROOM", "INT", "ISALIVE", "ISDAEMON", "ISDEAD", "ISFACTION", "ISINROOM", "ISINVESTIGATED", "ISNAME", "ISNOTDAEMON", "ISNOTINVESTIGATED", "ISPLAYER", "ISROOM", "ITEMSPAWNS", "KILLUNIT", "LINE", "LOADMAP", "LOCKDOOR", "LOGIC", "MAPSIZE", "MAPSPAWNS", "MAXTEAMSIZE", "MED", "MINTEAMSIZE", "MODULE", "MSUPPLY", "MULTILINE_COMMENT", "NEGATION", "NOT_PREFIX", "ONTIME", "OPENINGLINE", "OPTION", "OR", "PORTAL", "PRIORITY", "REMOVESAFEROOM", "REMOVETAG", "REMOVEUNIT", "REMOVE_TAG_PREFIX", "REQ", "ROOMINFO", "SAFEROOM", "SCI", "SEQUENCE", "SETTRIGGERRUNNING", "SHOWMESSAGE", "SPAWNCHARACTER", "SPAWNITEM", "SPAWNTALKNODE", "SPAWNTEAM", "SSUPPLY", "STAGELIST", "STASH", "STRING", "SUBSCRIBE", "TALK", "TALKMAP", "TALKPARENT", "TALKSTAGE", "TELEDEST", "TELEPORT", "TERRITORY", "TEXTURE", "TEXTUREBLOCK", "TOPIC", "TRIGGER", "TRIGGERCOND", "TRIGGEREFFECT", "TRIGGERTYPE", "UNITINFO", "UNLOCKDOOR", "UNLOCKTECH", "UPDATETALK", "UPDATE_TREE_PREFIX", "VAR", "WEP", "WS", "WSUPPLY", "XLIST", "YLIST", "ZONE", "'!HAS'", "'\"'", "'#'", "'('", "')'", "','", "'-'", "'::'", "'@'", "'AND'", "'BLOCK'", "'COMMAND'", "'COVER'", "'HAS'", "'IF'", "'ITEMSPAWNS'", "'LOAD'", "'MAPSIZE'", "'MAPSPAWNS'", "'MODULE'", "'MODULE::'", "'OR'", "'PORTAL'", "'SEQUENCE'", "'SEQUENCE::'", "'STASH'", "'TALK'", "'TEXTUREBLOCK'", "'TRIGGER'", "'a:'", "'addTag:'", "'aiInit:'", "'aiNode'", "'behaviours:'", "'block'", "'callCommand:'", "'changeAdvance:'", "'changeAiNode'", "'changeStability:'", "'command'", "'containsFaction:'", "'converse'", "'cover'", "'destination'", "'directorBias:'", "'engChance:'", "'expireRepeats:'", "'expireTime:'", "'hasItem:'", "'hasWeapon:'", "'isAlive'", "'isDaemon'", "'isDead'", "'isFaction:'", "'isInRoom'", "'isInvestigated'", "'isName:'", "'isNotDaemon'", "'isNotInvestigated'", "'isPlayer'", "'isRoom:'", "'killUnit'", "'l:'", "'lines:'", "'loadMap'", "'lockDoor'", "'mapsize'", "'mapspawns'", "'maxTeamSize:'", "'medChance:'", "'minTeamSize:'", "'o:'", "'onTime:'", "'opening:'", "'openingLine:'", "'option:'", "'p:'", "'parent:'", "'portal'", "'priority:'", "'removeSaferoom'", "'removeTag:'", "'removeUnit'", "'req:'", "'s:'", "'saferoom'", "'sciChance'", "'setTriggerRunning:'", "'showMessage:'", "'spawnCharacter'", "'spawnItem'", "'spawnTalkNode'", "'spawnTeam'", "'stage:'", "'stages:'", "'stash'", "'subscribe:'", "'t'", "'talk'", "'tc'", "'te'", "'teleport'", "'territory:'", "'textureBlock'", "'textureblock'", "'topic'", "'trigger'", "'triggerCond'", "'triggerEffect'", "'unlockDoor'", "'unlockTech:'", "'updateTalk:'", "'wepChance:'", "'x:'", "'y:'", "'zone:'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__230=230;
    public static final int T__231=231;
    public static final int T__232=232;
    public static final int T__233=233;
    public static final int T__234=234;
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
    public static final int ISINROOM=42;
    public static final int ISINVESTIGATED=43;
    public static final int ISNAME=44;
    public static final int ISNOTDAEMON=45;
    public static final int ISNOTINVESTIGATED=46;
    public static final int ISPLAYER=47;
    public static final int ISROOM=48;
    public static final int ITEMSPAWNS=49;
    public static final int KILLUNIT=50;
    public static final int LINE=51;
    public static final int LOADMAP=52;
    public static final int LOCKDOOR=53;
    public static final int LOGIC=54;
    public static final int MAPSIZE=55;
    public static final int MAPSPAWNS=56;
    public static final int MAXTEAMSIZE=57;
    public static final int MED=58;
    public static final int MINTEAMSIZE=59;
    public static final int MODULE=60;
    public static final int MSUPPLY=61;
    public static final int MULTILINE_COMMENT=62;
    public static final int NEGATION=63;
    public static final int NOT_PREFIX=64;
    public static final int ONTIME=65;
    public static final int OPENINGLINE=66;
    public static final int OPTION=67;
    public static final int OR=68;
    public static final int PORTAL=69;
    public static final int PRIORITY=70;
    public static final int REMOVESAFEROOM=71;
    public static final int REMOVETAG=72;
    public static final int REMOVEUNIT=73;
    public static final int REMOVE_TAG_PREFIX=74;
    public static final int REQ=75;
    public static final int ROOMINFO=76;
    public static final int SAFEROOM=77;
    public static final int SCI=78;
    public static final int SEQUENCE=79;
    public static final int SETTRIGGERRUNNING=80;
    public static final int SHOWMESSAGE=81;
    public static final int SPAWNCHARACTER=82;
    public static final int SPAWNITEM=83;
    public static final int SPAWNTALKNODE=84;
    public static final int SPAWNTEAM=85;
    public static final int SSUPPLY=86;
    public static final int STAGELIST=87;
    public static final int STASH=88;
    public static final int STRING=89;
    public static final int SUBSCRIBE=90;
    public static final int TALK=91;
    public static final int TALKMAP=92;
    public static final int TALKPARENT=93;
    public static final int TALKSTAGE=94;
    public static final int TELEDEST=95;
    public static final int TELEPORT=96;
    public static final int TERRITORY=97;
    public static final int TEXTURE=98;
    public static final int TEXTUREBLOCK=99;
    public static final int TOPIC=100;
    public static final int TRIGGER=101;
    public static final int TRIGGERCOND=102;
    public static final int TRIGGEREFFECT=103;
    public static final int TRIGGERTYPE=104;
    public static final int UNITINFO=105;
    public static final int UNLOCKDOOR=106;
    public static final int UNLOCKTECH=107;
    public static final int UPDATETALK=108;
    public static final int UPDATE_TREE_PREFIX=109;
    public static final int VAR=110;
    public static final int WEP=111;
    public static final int WS=112;
    public static final int WSUPPLY=113;
    public static final int XLIST=114;
    public static final int YLIST=115;
    public static final int ZONE=116;

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:118:1: prog : ( sequenceDecl | moduleDecl )* EOF ;
    public final AtrophyScriptParser.prog_return prog() throws RecognitionException {
        AtrophyScriptParser.prog_return retval = new AtrophyScriptParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        AtrophyScriptParser.sequenceDecl_return sequenceDecl1 =null;

        AtrophyScriptParser.moduleDecl_return moduleDecl2 =null;


        CommonTree EOF3_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:118:5: ( ( sequenceDecl | moduleDecl )* EOF )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:119:5: ( sequenceDecl | moduleDecl )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:119:5: ( sequenceDecl | moduleDecl )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==141) ) {
                    alt1=1;
                }
                else if ( (LA1_0==137) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:119:6: sequenceDecl
            	    {
            	    pushFollow(FOLLOW_sequenceDecl_in_prog468);
            	    sequenceDecl1=sequenceDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sequenceDecl1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:119:21: moduleDecl
            	    {
            	    pushFollow(FOLLOW_moduleDecl_in_prog472);
            	    moduleDecl2=moduleDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, moduleDecl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog480); 
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:1: moduleDecl : 'MODULE::' stringLiteral '{' ( command )* '}' -> ^( MODULE stringLiteral ( command )* ) ;
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
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:11: ( 'MODULE::' stringLiteral '{' ( command )* '}' -> ^( MODULE stringLiteral ( command )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:124:4: 'MODULE::' stringLiteral '{' ( command )* '}'
            {
            string_literal4=(Token)match(input,137,FOLLOW_137_in_moduleDecl496);  
            stream_137.add(string_literal4);


            pushFollow(FOLLOW_stringLiteral_in_moduleDecl498);
            stringLiteral5=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral5.getTree());

            char_literal6=(Token)match(input,233,FOLLOW_233_in_moduleDecl500);  
            stream_233.add(char_literal6);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:5: ( command )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 127 && LA2_0 <= 128)||LA2_0==132||(LA2_0 >= 134 && LA2_0 <= 135)||LA2_0==139||(LA2_0 >= 143 && LA2_0 <= 145)||LA2_0==151||LA2_0==156||(LA2_0 >= 183 && LA2_0 <= 184)||LA2_0==195||LA2_0==215||(LA2_0 >= 220 && LA2_0 <= 221)||LA2_0==223) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:125:5: command
            	    {
            	    pushFollow(FOLLOW_command_in_moduleDecl506);
            	    command7=command();

            	    state._fsp--;

            	    stream_command.add(command7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            char_literal8=(Token)match(input,234,FOLLOW_234_in_moduleDecl512);  
            stream_234.add(char_literal8);


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
            // 126:8: -> ^( MODULE stringLiteral ( command )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:126:11: ^( MODULE stringLiteral ( command )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE, "MODULE")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:126:34: ( command )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:1: command : ( mapSize | mapSpawns | itemSpawns | blockDecl | portalDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl );
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
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:8: ( mapSize | mapSpawns | itemSpawns | blockDecl | portalDecl | textureBlockDecl | triggerDecl | commandDecl | talkDecl )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 134:
            case 183:
                {
                alt3=1;
                }
                break;
            case 135:
            case 184:
                {
                alt3=2;
                }
                break;
            case 132:
                {
                alt3=3;
                }
                break;
            case 127:
            case 151:
                {
                alt3=4;
                }
                break;
            case 139:
            case 195:
                {
                alt3=5;
                }
                break;
            case 144:
            case 220:
            case 221:
                {
                alt3=6;
                }
                break;
            case 145:
            case 223:
                {
                alt3=7;
                }
                break;
            case 128:
            case 156:
                {
                alt3=8;
                }
                break;
            case 143:
            case 215:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:130:4: mapSize
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSize_in_command537);
                    mapSize9=mapSize();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSize9.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:131:6: mapSpawns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSpawns_in_command544);
                    mapSpawns10=mapSpawns();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSpawns10.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:132:6: itemSpawns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_itemSpawns_in_command551);
                    itemSpawns11=itemSpawns();

                    state._fsp--;

                    adaptor.addChild(root_0, itemSpawns11.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:6: blockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_blockDecl_in_command558);
                    blockDecl12=blockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, blockDecl12.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:134:6: portalDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_portalDecl_in_command565);
                    portalDecl13=portalDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, portalDecl13.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:135:6: textureBlockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_textureBlockDecl_in_command572);
                    textureBlockDecl14=textureBlockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, textureBlockDecl14.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:6: triggerDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_triggerDecl_in_command579);
                    triggerDecl15=triggerDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, triggerDecl15.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:6: commandDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandDecl_in_command586);
                    commandDecl16=commandDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, commandDecl16.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:138:6: talkDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_talkDecl_in_command593);
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:1: requiredAssignment : '::' stringLiteral -> ^( VAR stringLiteral ) ;
    public final AtrophyScriptParser.requiredAssignment_return requiredAssignment() throws RecognitionException {
        AtrophyScriptParser.requiredAssignment_return retval = new AtrophyScriptParser.requiredAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal18=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral19 =null;


        CommonTree string_literal18_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:19: ( '::' stringLiteral -> ^( VAR stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:4: '::' stringLiteral
            {
            string_literal18=(Token)match(input,124,FOLLOW_124_in_requiredAssignment606);  
            stream_124.add(string_literal18);


            pushFollow(FOLLOW_stringLiteral_in_requiredAssignment608);
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
            // 142:23: -> ^( VAR stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:142:26: ^( VAR stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:1: varAssignment : ( requiredAssignment | -> ^( EMPTY ) );
    public final AtrophyScriptParser.varAssignment_return varAssignment() throws RecognitionException {
        AtrophyScriptParser.varAssignment_return retval = new AtrophyScriptParser.varAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.requiredAssignment_return requiredAssignment20 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:14: ( requiredAssignment | -> ^( EMPTY ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==124) ) {
                alt4=1;
            }
            else if ( (LA4_0==233) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:146:4: requiredAssignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_requiredAssignment_in_varAssignment632);
                    requiredAssignment20=requiredAssignment();

                    state._fsp--;

                    adaptor.addChild(root_0, requiredAssignment20.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:6: 
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
                    // 147:6: -> ^( EMPTY )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:147:9: ^( EMPTY )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:1: mapSize : ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) ;
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
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:8: ( ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:4: ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:4: ( 'MAPSIZE' | 'mapsize' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==134) ) {
                alt5=1;
            }
            else if ( (LA5_0==183) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:5: 'MAPSIZE'
                    {
                    string_literal21=(Token)match(input,134,FOLLOW_134_in_mapSize659);  
                    stream_134.add(string_literal21);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:17: 'mapsize'
                    {
                    string_literal22=(Token)match(input,183,FOLLOW_183_in_mapSize663);  
                    stream_183.add(string_literal22);


                    }
                    break;

            }


            char_literal23=(Token)match(input,233,FOLLOW_233_in_mapSize666);  
            stream_233.add(char_literal23);


            INT24=(Token)match(input,INT,FOLLOW_INT_in_mapSize668);  
            stream_INT.add(INT24);


            char_literal25=(Token)match(input,122,FOLLOW_122_in_mapSize670);  
            stream_122.add(char_literal25);


            INT26=(Token)match(input,INT,FOLLOW_INT_in_mapSize672);  
            stream_INT.add(INT26);


            char_literal27=(Token)match(input,122,FOLLOW_122_in_mapSize674);  
            stream_122.add(char_literal27);


            INT28=(Token)match(input,INT,FOLLOW_INT_in_mapSize676);  
            stream_INT.add(INT28);


            char_literal29=(Token)match(input,122,FOLLOW_122_in_mapSize678);  
            stream_122.add(char_literal29);


            INT30=(Token)match(input,INT,FOLLOW_INT_in_mapSize680);  
            stream_INT.add(INT30);


            char_literal31=(Token)match(input,234,FOLLOW_234_in_mapSize682);  
            stream_234.add(char_literal31);


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
            // 151:64: -> ^( MAPSIZE ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:67: ^( MAPSIZE ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSIZE, "MAPSIZE")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:151:77: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:1: mapSpawns : ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) ;
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
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:10: ( ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:4: ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:4: ( 'MAPSPAWNS' | 'mapspawns' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==135) ) {
                alt6=1;
            }
            else if ( (LA6_0==184) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:5: 'MAPSPAWNS'
                    {
                    string_literal32=(Token)match(input,135,FOLLOW_135_in_mapSpawns707);  
                    stream_135.add(string_literal32);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:19: 'mapspawns'
                    {
                    string_literal33=(Token)match(input,184,FOLLOW_184_in_mapSpawns711);  
                    stream_184.add(string_literal33);


                    }
                    break;

            }


            char_literal34=(Token)match(input,233,FOLLOW_233_in_mapSpawns714);  
            stream_233.add(char_literal34);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:36: ( stringList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==118) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:36: stringList
                    {
                    pushFollow(FOLLOW_stringList_in_mapSpawns716);
                    stringList35=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList35.getTree());

                    }
                    break;

            }


            char_literal36=(Token)match(input,234,FOLLOW_234_in_mapSpawns719);  
            stream_234.add(char_literal36);


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
            // 155:52: -> ^( MAPSPAWNS ( stringList )? )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:55: ^( MAPSPAWNS ( stringList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSPAWNS, "MAPSPAWNS")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:155:67: ( stringList )?
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:1: itemSpawns : 'ITEMSPAWNS' '{' INT ',' INT ',' INT ',' INT '}' -> ^( ITEMSPAWNS ( INT )* ) ;
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
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:11: ( 'ITEMSPAWNS' '{' INT ',' INT ',' INT ',' INT '}' -> ^( ITEMSPAWNS ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:4: 'ITEMSPAWNS' '{' INT ',' INT ',' INT ',' INT '}'
            {
            string_literal37=(Token)match(input,132,FOLLOW_132_in_itemSpawns743);  
            stream_132.add(string_literal37);


            char_literal38=(Token)match(input,233,FOLLOW_233_in_itemSpawns745);  
            stream_233.add(char_literal38);


            INT39=(Token)match(input,INT,FOLLOW_INT_in_itemSpawns747);  
            stream_INT.add(INT39);


            char_literal40=(Token)match(input,122,FOLLOW_122_in_itemSpawns749);  
            stream_122.add(char_literal40);


            INT41=(Token)match(input,INT,FOLLOW_INT_in_itemSpawns751);  
            stream_INT.add(INT41);


            char_literal42=(Token)match(input,122,FOLLOW_122_in_itemSpawns753);  
            stream_122.add(char_literal42);


            INT43=(Token)match(input,INT,FOLLOW_INT_in_itemSpawns755);  
            stream_INT.add(INT43);


            char_literal44=(Token)match(input,122,FOLLOW_122_in_itemSpawns757);  
            stream_122.add(char_literal44);


            INT45=(Token)match(input,INT,FOLLOW_INT_in_itemSpawns759);  
            stream_INT.add(INT45);


            char_literal46=(Token)match(input,234,FOLLOW_234_in_itemSpawns761);  
            stream_234.add(char_literal46);


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
            // 159:53: -> ^( ITEMSPAWNS ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:56: ^( ITEMSPAWNS ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ITEMSPAWNS, "ITEMSPAWNS")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:159:69: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:1: blockDecl : ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) ;
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
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:10: ( ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:4: ( 'BLOCK' | 'block' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:4: ( 'BLOCK' | 'block' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==127) ) {
                alt8=1;
            }
            else if ( (LA8_0==151) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:5: 'BLOCK'
                    {
                    string_literal47=(Token)match(input,127,FOLLOW_127_in_blockDecl786);  
                    stream_127.add(string_literal47);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:15: 'block'
                    {
                    string_literal48=(Token)match(input,151,FOLLOW_151_in_blockDecl790);  
                    stream_151.add(string_literal48);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_blockDecl793);
            varAssignment49=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment49.getTree());

            char_literal50=(Token)match(input,233,FOLLOW_233_in_blockDecl795);  
            stream_233.add(char_literal50);


            pushFollow(FOLLOW_properties_in_blockDecl797);
            properties51=properties();

            state._fsp--;

            stream_properties.add(properties51.getTree());

            char_literal52=(Token)match(input,234,FOLLOW_234_in_blockDecl799);  
            stream_234.add(char_literal52);


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
            // 163:57: -> ^( BLOCK varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:163:60: ^( BLOCK varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:1: portalDecl : ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) ;
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
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:11: ( ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:4: ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:4: ( 'PORTAL' | 'portal' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==139) ) {
                alt9=1;
            }
            else if ( (LA9_0==195) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:5: 'PORTAL'
                    {
                    string_literal53=(Token)match(input,139,FOLLOW_139_in_portalDecl825);  
                    stream_139.add(string_literal53);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:16: 'portal'
                    {
                    string_literal54=(Token)match(input,195,FOLLOW_195_in_portalDecl829);  
                    stream_195.add(string_literal54);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_portalDecl832);
            varAssignment55=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment55.getTree());

            char_literal56=(Token)match(input,233,FOLLOW_233_in_portalDecl834);  
            stream_233.add(char_literal56);


            pushFollow(FOLLOW_properties_in_portalDecl836);
            properties57=properties();

            state._fsp--;

            stream_properties.add(properties57.getTree());

            char_literal58=(Token)match(input,234,FOLLOW_234_in_portalDecl838);  
            stream_234.add(char_literal58);


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
            // 167:59: -> ^( PORTAL varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:167:62: ^( PORTAL varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:1: textureBlockDecl : ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) ;
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
        RewriteRuleTokenStream stream_220=new RewriteRuleTokenStream(adaptor,"token 220");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_221=new RewriteRuleTokenStream(adaptor,"token 221");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:17: ( ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}' -> ^( TEXTUREBLOCK properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' ) '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:4: ( 'TEXTUREBLOCK' | 'textureblock' | 'textureBlock' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 144:
                {
                alt10=1;
                }
                break;
            case 221:
                {
                alt10=2;
                }
                break;
            case 220:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:5: 'TEXTUREBLOCK'
                    {
                    string_literal59=(Token)match(input,144,FOLLOW_144_in_textureBlockDecl864);  
                    stream_144.add(string_literal59);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:22: 'textureblock'
                    {
                    string_literal60=(Token)match(input,221,FOLLOW_221_in_textureBlockDecl868);  
                    stream_221.add(string_literal60);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:39: 'textureBlock'
                    {
                    string_literal61=(Token)match(input,220,FOLLOW_220_in_textureBlockDecl872);  
                    stream_220.add(string_literal61);


                    }
                    break;

            }


            char_literal62=(Token)match(input,233,FOLLOW_233_in_textureBlockDecl875);  
            stream_233.add(char_literal62);


            pushFollow(FOLLOW_properties_in_textureBlockDecl877);
            properties63=properties();

            state._fsp--;

            stream_properties.add(properties63.getTree());

            char_literal64=(Token)match(input,234,FOLLOW_234_in_textureBlockDecl879);  
            stream_234.add(char_literal64);


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
            // 171:74: -> ^( TEXTUREBLOCK properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:171:77: ^( TEXTUREBLOCK properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:1: triggerDecl : ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) ;
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
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_223=new RewriteRuleTokenStream(adaptor,"token 223");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:12: ( ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:4: ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:4: ( 'TRIGGER' | 'trigger' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==145) ) {
                alt11=1;
            }
            else if ( (LA11_0==223) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:5: 'TRIGGER'
                    {
                    string_literal65=(Token)match(input,145,FOLLOW_145_in_triggerDecl903);  
                    stream_145.add(string_literal65);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:17: 'trigger'
                    {
                    string_literal66=(Token)match(input,223,FOLLOW_223_in_triggerDecl907);  
                    stream_223.add(string_literal66);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_triggerDecl910);
            requiredAssignment67=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment67.getTree());

            char_literal68=(Token)match(input,233,FOLLOW_233_in_triggerDecl912);  
            stream_233.add(char_literal68);


            pushFollow(FOLLOW_properties_in_triggerDecl914);
            properties69=properties();

            state._fsp--;

            stream_properties.add(properties69.getTree());

            char_literal70=(Token)match(input,234,FOLLOW_234_in_triggerDecl916);  
            stream_234.add(char_literal70);


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
            // 175:66: -> ^( TRIGGER requiredAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:175:69: ^( TRIGGER requiredAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:1: commandDecl : ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) ;
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
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:12: ( ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:4: ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:4: ( 'COMMAND' | 'command' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==128) ) {
                alt12=1;
            }
            else if ( (LA12_0==156) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:5: 'COMMAND'
                    {
                    string_literal71=(Token)match(input,128,FOLLOW_128_in_commandDecl942);  
                    stream_128.add(string_literal71);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:17: 'command'
                    {
                    string_literal72=(Token)match(input,156,FOLLOW_156_in_commandDecl946);  
                    stream_156.add(string_literal72);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_commandDecl949);
            requiredAssignment73=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment73.getTree());

            char_literal74=(Token)match(input,233,FOLLOW_233_in_commandDecl951);  
            stream_233.add(char_literal74);


            pushFollow(FOLLOW_triggerEffectList_in_commandDecl953);
            triggerEffectList75=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList75.getTree());

            char_literal76=(Token)match(input,234,FOLLOW_234_in_commandDecl955);  
            stream_234.add(char_literal76);


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
            // 179:73: -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:76: ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COMMAND, "COMMAND")
                , root_1);

                adaptor.addChild(root_1, stream_requiredAssignment.nextTree());

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:179:105: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:1: talkDecl : ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) ;
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
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:9: ( ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:4: ( 'TALK' | 'talk' ) '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:4: ( 'TALK' | 'talk' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==143) ) {
                alt13=1;
            }
            else if ( (LA13_0==215) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:5: 'TALK'
                    {
                    string_literal77=(Token)match(input,143,FOLLOW_143_in_talkDecl985);  
                    stream_143.add(string_literal77);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:14: 'talk'
                    {
                    string_literal78=(Token)match(input,215,FOLLOW_215_in_talkDecl989);  
                    stream_215.add(string_literal78);


                    }
                    break;

            }


            char_literal79=(Token)match(input,233,FOLLOW_233_in_talkDecl992);  
            stream_233.add(char_literal79);


            pushFollow(FOLLOW_properties_in_talkDecl994);
            properties80=properties();

            state._fsp--;

            stream_properties.add(properties80.getTree());

            char_literal81=(Token)match(input,234,FOLLOW_234_in_talkDecl996);  
            stream_234.add(char_literal81);


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
            // 183:41: -> ^( TALK properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:183:44: ^( TALK properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:1: properties : ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )* ;
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
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:11: ( ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | coverDecl | stashDecl )*
            loop14:
            do {
                int alt14=17;
                switch ( input.LA(1) ) {
                case 230:
                    {
                    alt14=1;
                    }
                    break;
                case 231:
                    {
                    alt14=2;
                    }
                    break;
                case 219:
                    {
                    alt14=3;
                    }
                    break;
                case 232:
                    {
                    alt14=4;
                    }
                    break;
                case 202:
                    {
                    alt14=5;
                    }
                    break;
                case 201:
                case 210:
                    {
                    alt14=6;
                    }
                    break;
                case 211:
                    {
                    alt14=7;
                    }
                    break;
                case 193:
                case 194:
                    {
                    alt14=8;
                    }
                    break;
                case 146:
                case 148:
                    {
                    alt14=9;
                    }
                    break;
                case 188:
                case 190:
                case 191:
                    {
                    alt14=10;
                    }
                    break;
                case 179:
                case 192:
                    {
                    alt14=11;
                    }
                    break;
                case 214:
                case 222:
                    {
                    alt14=12;
                    }
                    break;
                case 216:
                case 224:
                    {
                    alt14=13;
                    }
                    break;
                case 217:
                case 225:
                    {
                    alt14=14;
                    }
                    break;
                case 129:
                case 159:
                    {
                    alt14=15;
                    }
                    break;
                case 142:
                case 212:
                    {
                    alt14=16;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:5: xListProperty
            	    {
            	    pushFollow(FOLLOW_xListProperty_in_properties1020);
            	    xListProperty82=xListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xListProperty82.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:188:6: yListProperty
            	    {
            	    pushFollow(FOLLOW_yListProperty_in_properties1027);
            	    yListProperty83=yListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, yListProperty83.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:6: factionTerritoryProperty
            	    {
            	    pushFollow(FOLLOW_factionTerritoryProperty_in_properties1034);
            	    factionTerritoryProperty84=factionTerritoryProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionTerritoryProperty84.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:190:6: factionZoneProperty
            	    {
            	    pushFollow(FOLLOW_factionZoneProperty_in_properties1041);
            	    factionZoneProperty85=factionZoneProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionZoneProperty85.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:6: saferoomProperty
            	    {
            	    pushFollow(FOLLOW_saferoomProperty_in_properties1048);
            	    saferoomProperty86=saferoomProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, saferoomProperty86.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:192:6: stageProperty
            	    {
            	    pushFollow(FOLLOW_stageProperty_in_properties1055);
            	    stageProperty87=stageProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageProperty87.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:6: stageDeclProperty
            	    {
            	    pushFollow(FOLLOW_stageDeclProperty_in_properties1062);
            	    stageDeclProperty88=stageDeclProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageDeclProperty88.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:194:6: talkMapParentProperty
            	    {
            	    pushFollow(FOLLOW_talkMapParentProperty_in_properties1069);
            	    talkMapParentProperty89=talkMapParentProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, talkMapParentProperty89.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:6: aiInitProperty
            	    {
            	    pushFollow(FOLLOW_aiInitProperty_in_properties1076);
            	    aiInitProperty90=aiInitProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiInitProperty90.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:6: openingLineProperty
            	    {
            	    pushFollow(FOLLOW_openingLineProperty_in_properties1083);
            	    openingLineProperty91=openingLineProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, openingLineProperty91.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:6: optionProperty
            	    {
            	    pushFollow(FOLLOW_optionProperty_in_properties1090);
            	    optionProperty92=optionProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, optionProperty92.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:198:6: topicProperty
            	    {
            	    pushFollow(FOLLOW_topicProperty_in_properties1097);
            	    topicProperty93=topicProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicProperty93.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:6: triggerCondProperty
            	    {
            	    pushFollow(FOLLOW_triggerCondProperty_in_properties1104);
            	    triggerCondProperty94=triggerCondProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerCondProperty94.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:200:6: triggerEffectProperty
            	    {
            	    pushFollow(FOLLOW_triggerEffectProperty_in_properties1111);
            	    triggerEffectProperty95=triggerEffectProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffectProperty95.getTree());

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:6: coverDecl
            	    {
            	    pushFollow(FOLLOW_coverDecl_in_properties1118);
            	    coverDecl96=coverDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, coverDecl96.getTree());

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:6: stashDecl
            	    {
            	    pushFollow(FOLLOW_stashDecl_in_properties1125);
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:1: xListProperty : 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) ;
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
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_230=new RewriteRuleTokenStream(adaptor,"token 230");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:14: ( 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:4: 'x:' INT ( ',' INT )*
            {
            string_literal98=(Token)match(input,230,FOLLOW_230_in_xListProperty1142);  
            stream_230.add(string_literal98);


            INT99=(Token)match(input,INT,FOLLOW_INT_in_xListProperty1144);  
            stream_INT.add(INT99);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:13: ( ',' INT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==122) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:14: ',' INT
            	    {
            	    char_literal100=(Token)match(input,122,FOLLOW_122_in_xListProperty1147);  
            	    stream_122.add(char_literal100);


            	    INT101=(Token)match(input,INT,FOLLOW_INT_in_xListProperty1148);  
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
            // 206:23: -> ^( XLIST ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:26: ^( XLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(XLIST, "XLIST")
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
    // $ANTLR end "xListProperty"


    public static class yListProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "yListProperty"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:1: yListProperty : 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) ;
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
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_231=new RewriteRuleTokenStream(adaptor,"token 231");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:14: ( 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:4: 'y:' INT ( ',' INT )*
            {
            string_literal102=(Token)match(input,231,FOLLOW_231_in_yListProperty1172);  
            stream_231.add(string_literal102);


            INT103=(Token)match(input,INT,FOLLOW_INT_in_yListProperty1174);  
            stream_INT.add(INT103);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:13: ( ',' INT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==122) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:14: ',' INT
            	    {
            	    char_literal104=(Token)match(input,122,FOLLOW_122_in_yListProperty1177);  
            	    stream_122.add(char_literal104);


            	    INT105=(Token)match(input,INT,FOLLOW_INT_in_yListProperty1178);  
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
            // 210:23: -> ^( YLIST ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:26: ^( YLIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(YLIST, "YLIST")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:34: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:1: factionTerritoryProperty : 'territory:' stringLiteral INT -> ^( TERRITORY ^( STRING stringLiteral ) INT ) ;
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
        RewriteRuleTokenStream stream_219=new RewriteRuleTokenStream(adaptor,"token 219");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:25: ( 'territory:' stringLiteral INT -> ^( TERRITORY ^( STRING stringLiteral ) INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:4: 'territory:' stringLiteral INT
            {
            string_literal106=(Token)match(input,219,FOLLOW_219_in_factionTerritoryProperty1204);  
            stream_219.add(string_literal106);


            pushFollow(FOLLOW_stringLiteral_in_factionTerritoryProperty1206);
            stringLiteral107=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral107.getTree());

            INT108=(Token)match(input,INT,FOLLOW_INT_in_factionTerritoryProperty1208);  
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
            // 214:35: -> ^( TERRITORY ^( STRING stringLiteral ) INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:38: ^( TERRITORY ^( STRING stringLiteral ) INT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TERRITORY, "TERRITORY")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:50: ^( STRING stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:1: factionZoneProperty : 'zone:' stringList -> ^( ZONE stringList ) ;
    public final AtrophyScriptParser.factionZoneProperty_return factionZoneProperty() throws RecognitionException {
        AtrophyScriptParser.factionZoneProperty_return retval = new AtrophyScriptParser.factionZoneProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal109=null;
        AtrophyScriptParser.stringList_return stringList110 =null;


        CommonTree string_literal109_tree=null;
        RewriteRuleTokenStream stream_232=new RewriteRuleTokenStream(adaptor,"token 232");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:20: ( 'zone:' stringList -> ^( ZONE stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:4: 'zone:' stringList
            {
            string_literal109=(Token)match(input,232,FOLLOW_232_in_factionZoneProperty1237);  
            stream_232.add(string_literal109);


            pushFollow(FOLLOW_stringList_in_factionZoneProperty1239);
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
            // 218:23: -> ^( ZONE stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:26: ^( ZONE stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:1: saferoomProperty : 'saferoom' -> ^( SAFEROOM ) ;
    public final AtrophyScriptParser.saferoomProperty_return saferoomProperty() throws RecognitionException {
        AtrophyScriptParser.saferoomProperty_return retval = new AtrophyScriptParser.saferoomProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal111=null;

        CommonTree string_literal111_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:17: ( 'saferoom' -> ^( SAFEROOM ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:4: 'saferoom'
            {
            string_literal111=(Token)match(input,202,FOLLOW_202_in_saferoomProperty1262);  
            stream_202.add(string_literal111);


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
            // 222:15: -> ^( SAFEROOM )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:18: ^( SAFEROOM )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:1: stageDeclProperty : 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) ;
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
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:18: ( 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:4: 'stages:' INT ( ',' INT )*
            {
            string_literal112=(Token)match(input,211,FOLLOW_211_in_stageDeclProperty1283);  
            stream_211.add(string_literal112);


            INT113=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1285);  
            stream_INT.add(INT113);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:18: ( ',' INT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==122) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:19: ',' INT
            	    {
            	    char_literal114=(Token)match(input,122,FOLLOW_122_in_stageDeclProperty1288);  
            	    stream_122.add(char_literal114);


            	    INT115=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1290);  
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
            // 226:29: -> ^( STAGELIST ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:32: ^( STAGELIST ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STAGELIST, "STAGELIST")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:44: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:1: talkMapParentProperty : ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) ;
    public final AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty() throws RecognitionException {
        AtrophyScriptParser.talkMapParentProperty_return retval = new AtrophyScriptParser.talkMapParentProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal116=null;
        Token string_literal117=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral118 =null;


        CommonTree string_literal116_tree=null;
        CommonTree string_literal117_tree=null;
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:22: ( ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:4: ( 'parent:' | 'p:' ) stringLiteral
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:4: ( 'parent:' | 'p:' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==194) ) {
                alt18=1;
            }
            else if ( (LA18_0==193) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:5: 'parent:'
                    {
                    string_literal116=(Token)match(input,194,FOLLOW_194_in_talkMapParentProperty1317);  
                    stream_194.add(string_literal116);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:17: 'p:'
                    {
                    string_literal117=(Token)match(input,193,FOLLOW_193_in_talkMapParentProperty1321);  
                    stream_193.add(string_literal117);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_talkMapParentProperty1324);
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
            // 230:37: -> ^( TALKPARENT stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:40: ^( TALKPARENT stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:1: stageProperty : ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) ;
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
        RewriteRuleTokenStream stream_210=new RewriteRuleTokenStream(adaptor,"token 210");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:14: ( ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:4: ( 'stage:' | 's:' ) INT
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:4: ( 'stage:' | 's:' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==210) ) {
                alt19=1;
            }
            else if ( (LA19_0==201) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:5: 'stage:'
                    {
                    string_literal119=(Token)match(input,210,FOLLOW_210_in_stageProperty1348);  
                    stream_210.add(string_literal119);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:16: 's:'
                    {
                    string_literal120=(Token)match(input,201,FOLLOW_201_in_stageProperty1352);  
                    stream_201.add(string_literal120);


                    }
                    break;

            }


            INT121=(Token)match(input,INT,FOLLOW_INT_in_stageProperty1355);  
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
            // 234:26: -> ^( TALKSTAGE INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:29: ^( TALKSTAGE INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:1: aiInitProperty : ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) ;
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
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:15: ( ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:4: ( 'aiInit:' | 'a:' ) BOOL
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:4: ( 'aiInit:' | 'a:' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==148) ) {
                alt20=1;
            }
            else if ( (LA20_0==146) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:5: 'aiInit:'
                    {
                    string_literal122=(Token)match(input,148,FOLLOW_148_in_aiInitProperty1379);  
                    stream_148.add(string_literal122);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:17: 'a:'
                    {
                    string_literal123=(Token)match(input,146,FOLLOW_146_in_aiInitProperty1383);  
                    stream_146.add(string_literal123);


                    }
                    break;

            }


            BOOL124=(Token)match(input,BOOL,FOLLOW_BOOL_in_aiInitProperty1386);  
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
            // 238:28: -> ^( AIINIT BOOL )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:31: ^( AIINIT BOOL )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:1: openingLineProperty : ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) ;
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
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:20: ( ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:4: ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:4: ( 'o:' | 'opening:' | 'openingLine:' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 188:
                {
                alt21=1;
                }
                break;
            case 190:
                {
                alt21=2;
                }
                break;
            case 191:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:5: 'o:'
                    {
                    string_literal125=(Token)match(input,188,FOLLOW_188_in_openingLineProperty1410);  
                    stream_188.add(string_literal125);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:12: 'opening:'
                    {
                    string_literal126=(Token)match(input,190,FOLLOW_190_in_openingLineProperty1414);  
                    stream_190.add(string_literal126);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:25: 'openingLine:'
                    {
                    string_literal127=(Token)match(input,191,FOLLOW_191_in_openingLineProperty1418);  
                    stream_191.add(string_literal127);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_openingLineProperty1421);
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
            // 242:55: -> ^( OPENINGLINE stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:58: ^( OPENINGLINE stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:1: optionProperty : ( 'l:' | 'option:' ) stringLiteral -> ^( OPTION stringLiteral ) ;
    public final AtrophyScriptParser.optionProperty_return optionProperty() throws RecognitionException {
        AtrophyScriptParser.optionProperty_return retval = new AtrophyScriptParser.optionProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal129=null;
        Token string_literal130=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral131 =null;


        CommonTree string_literal129_tree=null;
        CommonTree string_literal130_tree=null;
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:15: ( ( 'l:' | 'option:' ) stringLiteral -> ^( OPTION stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:4: ( 'l:' | 'option:' ) stringLiteral
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:4: ( 'l:' | 'option:' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==179) ) {
                alt22=1;
            }
            else if ( (LA22_0==192) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:5: 'l:'
                    {
                    string_literal129=(Token)match(input,179,FOLLOW_179_in_optionProperty1443);  
                    stream_179.add(string_literal129);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:12: 'option:'
                    {
                    string_literal130=(Token)match(input,192,FOLLOW_192_in_optionProperty1447);  
                    stream_192.add(string_literal130);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_optionProperty1450);
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
            // 246:37: -> ^( OPTION stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:40: ^( OPTION stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:1: topicProperty : ( 't' | 'topic' ) requiredAssignment '{' topicProperties '}' -> ^( TOPIC requiredAssignment topicProperties ) ;
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
        RewriteRuleTokenStream stream_222=new RewriteRuleTokenStream(adaptor,"token 222");
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_topicProperties=new RewriteRuleSubtreeStream(adaptor,"rule topicProperties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:14: ( ( 't' | 'topic' ) requiredAssignment '{' topicProperties '}' -> ^( TOPIC requiredAssignment topicProperties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:4: ( 't' | 'topic' ) requiredAssignment '{' topicProperties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:4: ( 't' | 'topic' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==214) ) {
                alt23=1;
            }
            else if ( (LA23_0==222) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:5: 't'
                    {
                    char_literal132=(Token)match(input,214,FOLLOW_214_in_topicProperty1474);  
                    stream_214.add(char_literal132);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:11: 'topic'
                    {
                    string_literal133=(Token)match(input,222,FOLLOW_222_in_topicProperty1478);  
                    stream_222.add(string_literal133);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_topicProperty1481);
            requiredAssignment134=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment134.getTree());

            char_literal135=(Token)match(input,233,FOLLOW_233_in_topicProperty1483);  
            stream_233.add(char_literal135);


            pushFollow(FOLLOW_topicProperties_in_topicProperty1485);
            topicProperties136=topicProperties();

            state._fsp--;

            stream_topicProperties.add(topicProperties136.getTree());

            char_literal137=(Token)match(input,234,FOLLOW_234_in_topicProperty1487);  
            stream_234.add(char_literal137);


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
            // 250:63: -> ^( TOPIC requiredAssignment topicProperties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:66: ^( TOPIC requiredAssignment topicProperties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:253:1: topicProperties : ( topicLine | topicRequiement )* ;
    public final AtrophyScriptParser.topicProperties_return topicProperties() throws RecognitionException {
        AtrophyScriptParser.topicProperties_return retval = new AtrophyScriptParser.topicProperties_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.topicLine_return topicLine138 =null;

        AtrophyScriptParser.topicRequiement_return topicRequiement139 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:253:16: ( ( topicLine | topicRequiement )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:4: ( topicLine | topicRequiement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:4: ( topicLine | topicRequiement )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==180) ) {
                    alt24=1;
                }
                else if ( (LA24_0==200) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:5: topicLine
            	    {
            	    pushFollow(FOLLOW_topicLine_in_topicProperties1514);
            	    topicLine138=topicLine();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicLine138.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:17: topicRequiement
            	    {
            	    pushFollow(FOLLOW_topicRequiement_in_topicProperties1518);
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:1: topicLine : 'lines:' stringLiteral ( ',' stringLiteral )* -> ( ^( LINE stringLiteral ) )* ;
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
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:10: ( 'lines:' stringLiteral ( ',' stringLiteral )* -> ( ^( LINE stringLiteral ) )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:4: 'lines:' stringLiteral ( ',' stringLiteral )*
            {
            string_literal140=(Token)match(input,180,FOLLOW_180_in_topicLine1535);  
            stream_180.add(string_literal140);


            pushFollow(FOLLOW_stringLiteral_in_topicLine1536);
            stringLiteral141=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral141.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:26: ( ',' stringLiteral )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==122) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:27: ',' stringLiteral
            	    {
            	    char_literal142=(Token)match(input,122,FOLLOW_122_in_topicLine1539);  
            	    stream_122.add(char_literal142);


            	    pushFollow(FOLLOW_stringLiteral_in_topicLine1541);
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
            // 258:47: -> ( ^( LINE stringLiteral ) )*
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:50: ( ^( LINE stringLiteral ) )*
                while ( stream_stringLiteral.hasNext() ) {
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:50: ^( LINE stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:1: topicRequiement : 'req:' reqString ( ',' reqString )* -> ( ^( REQ reqString ) )* ;
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
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_reqString=new RewriteRuleSubtreeStream(adaptor,"rule reqString");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:16: ( 'req:' reqString ( ',' reqString )* -> ( ^( REQ reqString ) )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:4: 'req:' reqString ( ',' reqString )*
            {
            string_literal144=(Token)match(input,200,FOLLOW_200_in_topicRequiement1567);  
            stream_200.add(string_literal144);


            pushFollow(FOLLOW_reqString_in_topicRequiement1569);
            reqString145=reqString();

            state._fsp--;

            stream_reqString.add(reqString145.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:21: ( ',' reqString )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==122) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:22: ',' reqString
            	    {
            	    char_literal146=(Token)match(input,122,FOLLOW_122_in_topicRequiement1572);  
            	    stream_122.add(char_literal146);


            	    pushFollow(FOLLOW_reqString_in_topicRequiement1574);
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
            // 262:38: -> ( ^( REQ reqString ) )*
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:41: ( ^( REQ reqString ) )*
                while ( stream_reqString.hasNext() ) {
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:41: ^( REQ reqString )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:1: reqString : ( NOT_PREFIX stringLiteral -> ^( NEGATION stringLiteral ) | stringLiteral );
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
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:10: ( NOT_PREFIX stringLiteral -> ^( NEGATION stringLiteral ) | stringLiteral )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==NOT_PREFIX) ) {
                alt27=1;
            }
            else if ( (LA27_0==118) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:4: NOT_PREFIX stringLiteral
                    {
                    NOT_PREFIX148=(Token)match(input,NOT_PREFIX,FOLLOW_NOT_PREFIX_in_reqString1600);  
                    stream_NOT_PREFIX.add(NOT_PREFIX148);


                    pushFollow(FOLLOW_stringLiteral_in_reqString1602);
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
                    // 266:29: -> ^( NEGATION stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:32: ^( NEGATION stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:267:6: stringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stringLiteral_in_reqString1617);
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:1: aliveQuery : 'isAlive' '{' unitInfo '}' -> ^( ISALIVE unitInfo ) ;
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
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:11: ( 'isAlive' '{' unitInfo '}' -> ^( ISALIVE unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:271:4: 'isAlive' '{' unitInfo '}'
            {
            string_literal151=(Token)match(input,167,FOLLOW_167_in_aliveQuery1632);  
            stream_167.add(string_literal151);


            char_literal152=(Token)match(input,233,FOLLOW_233_in_aliveQuery1634);  
            stream_233.add(char_literal152);


            pushFollow(FOLLOW_unitInfo_in_aliveQuery1636);
            unitInfo153=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo153.getTree());

            char_literal154=(Token)match(input,234,FOLLOW_234_in_aliveQuery1638);  
            stream_234.add(char_literal154);


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
            // 271:31: -> ^( ISALIVE unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:271:34: ^( ISALIVE unitInfo )
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


    public static class roomQuery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "roomQuery"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:274:1: roomQuery : 'isInRoom' '{' unitInfo '}' '{' saferoomInfo '}' -> ^( ISINROOM ^( UNITINFO unitInfo ) ^( ROOMINFO saferoomInfo ) ) ;
    public final AtrophyScriptParser.roomQuery_return roomQuery() throws RecognitionException {
        AtrophyScriptParser.roomQuery_return retval = new AtrophyScriptParser.roomQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal155=null;
        Token char_literal156=null;
        Token char_literal158=null;
        Token char_literal159=null;
        Token char_literal161=null;
        AtrophyScriptParser.unitInfo_return unitInfo157 =null;

        AtrophyScriptParser.saferoomInfo_return saferoomInfo160 =null;


        CommonTree string_literal155_tree=null;
        CommonTree char_literal156_tree=null;
        CommonTree char_literal158_tree=null;
        CommonTree char_literal159_tree=null;
        CommonTree char_literal161_tree=null;
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:274:10: ( 'isInRoom' '{' unitInfo '}' '{' saferoomInfo '}' -> ^( ISINROOM ^( UNITINFO unitInfo ) ^( ROOMINFO saferoomInfo ) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:275:4: 'isInRoom' '{' unitInfo '}' '{' saferoomInfo '}'
            {
            string_literal155=(Token)match(input,171,FOLLOW_171_in_roomQuery1661);  
            stream_171.add(string_literal155);


            char_literal156=(Token)match(input,233,FOLLOW_233_in_roomQuery1663);  
            stream_233.add(char_literal156);


            pushFollow(FOLLOW_unitInfo_in_roomQuery1665);
            unitInfo157=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo157.getTree());

            char_literal158=(Token)match(input,234,FOLLOW_234_in_roomQuery1667);  
            stream_234.add(char_literal158);


            char_literal159=(Token)match(input,233,FOLLOW_233_in_roomQuery1669);  
            stream_233.add(char_literal159);


            pushFollow(FOLLOW_saferoomInfo_in_roomQuery1671);
            saferoomInfo160=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo160.getTree());

            char_literal161=(Token)match(input,234,FOLLOW_234_in_roomQuery1673);  
            stream_234.add(char_literal161);


            // AST REWRITE
            // elements: saferoomInfo, unitInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 275:53: -> ^( ISINROOM ^( UNITINFO unitInfo ) ^( ROOMINFO saferoomInfo ) )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:275:56: ^( ISINROOM ^( UNITINFO unitInfo ) ^( ROOMINFO saferoomInfo ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ISINROOM, "ISINROOM")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:275:67: ^( UNITINFO unitInfo )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UNITINFO, "UNITINFO")
                , root_2);

                adaptor.addChild(root_2, stream_unitInfo.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:275:88: ^( ROOMINFO saferoomInfo )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ROOMINFO, "ROOMINFO")
                , root_2);

                adaptor.addChild(root_2, stream_saferoomInfo.nextTree());

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
    // $ANTLR end "roomQuery"


    public static class timeQuery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeQuery"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:278:1: timeQuery : 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) ) ;
    public final AtrophyScriptParser.timeQuery_return timeQuery() throws RecognitionException {
        AtrophyScriptParser.timeQuery_return retval = new AtrophyScriptParser.timeQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal162=null;
        Token INT163=null;
        Token string_literal164=null;
        Token INT165=null;
        Token string_literal166=null;
        Token INT167=null;

        CommonTree string_literal162_tree=null;
        CommonTree INT163_tree=null;
        CommonTree string_literal164_tree=null;
        CommonTree INT165_tree=null;
        CommonTree string_literal166_tree=null;
        CommonTree INT167_tree=null;
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:278:10: ( 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:279:4: 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) )
            {
            string_literal162=(Token)match(input,189,FOLLOW_189_in_timeQuery1707);  
            stream_189.add(string_literal162);


            INT163=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1709);  
            stream_INT.add(INT163);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:4: ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 164:
                {
                alt28=1;
                }
                break;
            case 163:
                {
                alt28=2;
                }
                break;
            case 121:
            case 126:
            case 138:
            case 234:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:5: 'expireTime:' INT
                    {
                    string_literal164=(Token)match(input,164,FOLLOW_164_in_timeQuery1715);  
                    stream_164.add(string_literal164);


                    INT165=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1717);  
                    stream_INT.add(INT165);


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
                    // 280:23: -> ^( ONTIME INT ^( EXPIRETIME INT ) )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:26: ^( ONTIME INT ^( EXPIRETIME INT ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ONTIME, "ONTIME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:39: ^( EXPIRETIME INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:281:5: 'expireRepeats:' INT
                    {
                    string_literal166=(Token)match(input,163,FOLLOW_163_in_timeQuery1737);  
                    stream_163.add(string_literal166);


                    INT167=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1739);  
                    stream_INT.add(INT167);


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
                    // 281:26: -> ^( ONTIME INT ^( EXPIREREPEATS INT ) )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:281:29: ^( ONTIME INT ^( EXPIREREPEATS INT ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ONTIME, "ONTIME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:281:42: ^( EXPIREREPEATS INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:282:6: 
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
                    // 282:6: -> ^( ONTIME INT EMPTY )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:282:9: ^( ONTIME INT EMPTY )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:1: boolQuery : ( '(' ! queryLogic ')' !| aliveQuery | roomQuery | timeQuery );
    public final AtrophyScriptParser.boolQuery_return boolQuery() throws RecognitionException {
        AtrophyScriptParser.boolQuery_return retval = new AtrophyScriptParser.boolQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal168=null;
        Token char_literal170=null;
        AtrophyScriptParser.queryLogic_return queryLogic169 =null;

        AtrophyScriptParser.aliveQuery_return aliveQuery171 =null;

        AtrophyScriptParser.roomQuery_return roomQuery172 =null;

        AtrophyScriptParser.timeQuery_return timeQuery173 =null;


        CommonTree char_literal168_tree=null;
        CommonTree char_literal170_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:10: ( '(' ! queryLogic ')' !| aliveQuery | roomQuery | timeQuery )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt29=1;
                }
                break;
            case 167:
                {
                alt29=2;
                }
                break;
            case 171:
                {
                alt29=3;
                }
                break;
            case 189:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:286:3: '(' ! queryLogic ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal168=(Token)match(input,120,FOLLOW_120_in_boolQuery1781); 

                    pushFollow(FOLLOW_queryLogic_in_boolQuery1784);
                    queryLogic169=queryLogic();

                    state._fsp--;

                    adaptor.addChild(root_0, queryLogic169.getTree());

                    char_literal170=(Token)match(input,121,FOLLOW_121_in_boolQuery1786); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:287:5: aliveQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_aliveQuery_in_boolQuery1793);
                    aliveQuery171=aliveQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, aliveQuery171.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:288:5: roomQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_roomQuery_in_boolQuery1799);
                    roomQuery172=roomQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, roomQuery172.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:289:5: timeQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeQuery_in_boolQuery1805);
                    timeQuery173=timeQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, timeQuery173.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:292:1: queryNegation : ( boolQuery | '!' boolQuery -> ^( NEGATION boolQuery ) );
    public final AtrophyScriptParser.queryNegation_return queryNegation() throws RecognitionException {
        AtrophyScriptParser.queryNegation_return retval = new AtrophyScriptParser.queryNegation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal175=null;
        AtrophyScriptParser.boolQuery_return boolQuery174 =null;

        AtrophyScriptParser.boolQuery_return boolQuery176 =null;


        CommonTree char_literal175_tree=null;
        RewriteRuleTokenStream stream_NOT_PREFIX=new RewriteRuleTokenStream(adaptor,"token NOT_PREFIX");
        RewriteRuleSubtreeStream stream_boolQuery=new RewriteRuleSubtreeStream(adaptor,"rule boolQuery");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:292:14: ( boolQuery | '!' boolQuery -> ^( NEGATION boolQuery ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==120||LA30_0==167||LA30_0==171||LA30_0==189) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:293:3: boolQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_boolQuery_in_queryNegation1819);
                    boolQuery174=boolQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, boolQuery174.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:294:4: '!' boolQuery
                    {
                    char_literal175=(Token)match(input,NOT_PREFIX,FOLLOW_NOT_PREFIX_in_queryNegation1824);  
                    stream_NOT_PREFIX.add(char_literal175);


                    pushFollow(FOLLOW_boolQuery_in_queryNegation1826);
                    boolQuery176=boolQuery();

                    state._fsp--;

                    stream_boolQuery.add(boolQuery176.getTree());

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
                    // 294:18: -> ^( NEGATION boolQuery )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:294:21: ^( NEGATION boolQuery )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:297:1: queryLogic : b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) ) ;
    public final AtrophyScriptParser.queryLogic_return queryLogic() throws RecognitionException {
        AtrophyScriptParser.queryLogic_return retval = new AtrophyScriptParser.queryLogic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal177=null;
        Token string_literal178=null;
        AtrophyScriptParser.queryNegation_return b1 =null;

        AtrophyScriptParser.queryNegation_return b2 =null;


        CommonTree string_literal177_tree=null;
        CommonTree string_literal178_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleSubtreeStream stream_queryNegation=new RewriteRuleSubtreeStream(adaptor,"rule queryNegation");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:297:11: (b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:298:3: b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) )
            {
            pushFollow(FOLLOW_queryNegation_in_queryLogic1850);
            b1=queryNegation();

            state._fsp--;

            stream_queryNegation.add(b1.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:3: ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt31=1;
                }
                break;
            case 138:
                {
                alt31=2;
                }
                break;
            case 121:
            case 234:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:4: 'AND' b2= queryNegation
                    {
                    string_literal177=(Token)match(input,126,FOLLOW_126_in_queryLogic1855);  
                    stream_126.add(string_literal177);


                    pushFollow(FOLLOW_queryNegation_in_queryLogic1859);
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
                    // 299:27: -> ^( AND $b1 $b2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:30: ^( AND $b1 $b2)
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:300:4: 'OR' b2= queryNegation
                    {
                    string_literal178=(Token)match(input,138,FOLLOW_138_in_queryLogic1876);  
                    stream_138.add(string_literal178);


                    pushFollow(FOLLOW_queryNegation_in_queryLogic1880);
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
                    // 300:26: -> ^( OR $b1 $b2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:300:29: ^( OR $b1 $b2)
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:301:5: 
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
                    // 301:5: -> ^( LOGIC $b1)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:301:8: ^( LOGIC $b1)
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:1: triggerCondProperty : ( 'tc' | 'triggerCond' ) '{' queryLogic '}' -> ^( TRIGGERCOND queryLogic ) ;
    public final AtrophyScriptParser.triggerCondProperty_return triggerCondProperty() throws RecognitionException {
        AtrophyScriptParser.triggerCondProperty_return retval = new AtrophyScriptParser.triggerCondProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal179=null;
        Token string_literal180=null;
        Token char_literal181=null;
        Token char_literal183=null;
        AtrophyScriptParser.queryLogic_return queryLogic182 =null;


        CommonTree string_literal179_tree=null;
        CommonTree string_literal180_tree=null;
        CommonTree char_literal181_tree=null;
        CommonTree char_literal183_tree=null;
        RewriteRuleTokenStream stream_224=new RewriteRuleTokenStream(adaptor,"token 224");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_queryLogic=new RewriteRuleSubtreeStream(adaptor,"rule queryLogic");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:20: ( ( 'tc' | 'triggerCond' ) '{' queryLogic '}' -> ^( TRIGGERCOND queryLogic ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:4: ( 'tc' | 'triggerCond' ) '{' queryLogic '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:4: ( 'tc' | 'triggerCond' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==216) ) {
                alt32=1;
            }
            else if ( (LA32_0==224) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:5: 'tc'
                    {
                    string_literal179=(Token)match(input,216,FOLLOW_216_in_triggerCondProperty1920);  
                    stream_216.add(string_literal179);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:12: 'triggerCond'
                    {
                    string_literal180=(Token)match(input,224,FOLLOW_224_in_triggerCondProperty1924);  
                    stream_224.add(string_literal180);


                    }
                    break;

            }


            char_literal181=(Token)match(input,233,FOLLOW_233_in_triggerCondProperty1927);  
            stream_233.add(char_literal181);


            pushFollow(FOLLOW_queryLogic_in_triggerCondProperty1929);
            queryLogic182=queryLogic();

            state._fsp--;

            stream_queryLogic.add(queryLogic182.getTree());

            char_literal183=(Token)match(input,234,FOLLOW_234_in_triggerCondProperty1931);  
            stream_234.add(char_literal183);


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
            // 305:46: -> ^( TRIGGERCOND queryLogic )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:49: ^( TRIGGERCOND queryLogic )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:1: triggerEffectProperty : ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) ;
    public final AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty() throws RecognitionException {
        AtrophyScriptParser.triggerEffectProperty_return retval = new AtrophyScriptParser.triggerEffectProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal184=null;
        Token string_literal185=null;
        Token char_literal186=null;
        Token char_literal188=null;
        AtrophyScriptParser.triggerEffectList_return triggerEffectList187 =null;


        CommonTree string_literal184_tree=null;
        CommonTree string_literal185_tree=null;
        CommonTree char_literal186_tree=null;
        CommonTree char_literal188_tree=null;
        RewriteRuleTokenStream stream_225=new RewriteRuleTokenStream(adaptor,"token 225");
        RewriteRuleTokenStream stream_217=new RewriteRuleTokenStream(adaptor,"token 217");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:22: ( ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:4: ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:4: ( 'te' | 'triggerEffect' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==217) ) {
                alt33=1;
            }
            else if ( (LA33_0==225) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:5: 'te'
                    {
                    string_literal184=(Token)match(input,217,FOLLOW_217_in_triggerEffectProperty1953);  
                    stream_217.add(string_literal184);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:12: 'triggerEffect'
                    {
                    string_literal185=(Token)match(input,225,FOLLOW_225_in_triggerEffectProperty1957);  
                    stream_225.add(string_literal185);


                    }
                    break;

            }


            char_literal186=(Token)match(input,233,FOLLOW_233_in_triggerEffectProperty1960);  
            stream_233.add(char_literal186);


            pushFollow(FOLLOW_triggerEffectList_in_triggerEffectProperty1962);
            triggerEffectList187=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList187.getTree());

            char_literal188=(Token)match(input,234,FOLLOW_234_in_triggerEffectProperty1964);  
            stream_234.add(char_literal188);


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
            // 309:55: -> ^( TRIGGEREFFECT triggerEffectList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:58: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:312:1: coverDecl : ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) ;
    public final AtrophyScriptParser.coverDecl_return coverDecl() throws RecognitionException {
        AtrophyScriptParser.coverDecl_return retval = new AtrophyScriptParser.coverDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal189=null;
        Token string_literal190=null;
        Token char_literal192=null;
        Token char_literal194=null;
        AtrophyScriptParser.varAssignment_return varAssignment191 =null;

        AtrophyScriptParser.properties_return properties193 =null;


        CommonTree string_literal189_tree=null;
        CommonTree string_literal190_tree=null;
        CommonTree char_literal192_tree=null;
        CommonTree char_literal194_tree=null;
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:312:10: ( ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:313:4: ( 'COVER' | 'cover' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:313:4: ( 'COVER' | 'cover' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==129) ) {
                alt34=1;
            }
            else if ( (LA34_0==159) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:313:5: 'COVER'
                    {
                    string_literal189=(Token)match(input,129,FOLLOW_129_in_coverDecl1988);  
                    stream_129.add(string_literal189);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:313:15: 'cover'
                    {
                    string_literal190=(Token)match(input,159,FOLLOW_159_in_coverDecl1992);  
                    stream_159.add(string_literal190);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_coverDecl1995);
            varAssignment191=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment191.getTree());

            char_literal192=(Token)match(input,233,FOLLOW_233_in_coverDecl1997);  
            stream_233.add(char_literal192);


            pushFollow(FOLLOW_properties_in_coverDecl1999);
            properties193=properties();

            state._fsp--;

            stream_properties.add(properties193.getTree());

            char_literal194=(Token)match(input,234,FOLLOW_234_in_coverDecl2001);  
            stream_234.add(char_literal194);


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
            // 313:57: -> ^( COVER varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:313:60: ^( COVER varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:316:1: stashDecl : ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) ;
    public final AtrophyScriptParser.stashDecl_return stashDecl() throws RecognitionException {
        AtrophyScriptParser.stashDecl_return retval = new AtrophyScriptParser.stashDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal195=null;
        Token string_literal196=null;
        Token char_literal198=null;
        Token char_literal200=null;
        AtrophyScriptParser.varAssignment_return varAssignment197 =null;

        AtrophyScriptParser.properties_return properties199 =null;


        CommonTree string_literal195_tree=null;
        CommonTree string_literal196_tree=null;
        CommonTree char_literal198_tree=null;
        CommonTree char_literal200_tree=null;
        RewriteRuleTokenStream stream_212=new RewriteRuleTokenStream(adaptor,"token 212");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:316:10: ( ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:4: ( 'STASH' | 'stash' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:4: ( 'STASH' | 'stash' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==142) ) {
                alt35=1;
            }
            else if ( (LA35_0==212) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:5: 'STASH'
                    {
                    string_literal195=(Token)match(input,142,FOLLOW_142_in_stashDecl2027);  
                    stream_142.add(string_literal195);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:15: 'stash'
                    {
                    string_literal196=(Token)match(input,212,FOLLOW_212_in_stashDecl2031);  
                    stream_212.add(string_literal196);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_stashDecl2034);
            varAssignment197=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment197.getTree());

            char_literal198=(Token)match(input,233,FOLLOW_233_in_stashDecl2036);  
            stream_233.add(char_literal198);


            pushFollow(FOLLOW_properties_in_stashDecl2038);
            properties199=properties();

            state._fsp--;

            stream_properties.add(properties199.getTree());

            char_literal200=(Token)match(input,234,FOLLOW_234_in_stashDecl2040);  
            stream_234.add(char_literal200);


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
            // 317:57: -> ^( STASH varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:60: ^( STASH varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:320:1: triggerEffectList : triggerEffect ( ',' ! triggerEffect )* ;
    public final AtrophyScriptParser.triggerEffectList_return triggerEffectList() throws RecognitionException {
        AtrophyScriptParser.triggerEffectList_return retval = new AtrophyScriptParser.triggerEffectList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal202=null;
        AtrophyScriptParser.triggerEffect_return triggerEffect201 =null;

        AtrophyScriptParser.triggerEffect_return triggerEffect203 =null;


        CommonTree char_literal202_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:320:18: ( triggerEffect ( ',' ! triggerEffect )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:321:4: triggerEffect ( ',' ! triggerEffect )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_triggerEffect_in_triggerEffectList2063);
            triggerEffect201=triggerEffect();

            state._fsp--;

            adaptor.addChild(root_0, triggerEffect201.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:321:18: ( ',' ! triggerEffect )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==122) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:321:19: ',' ! triggerEffect
            	    {
            	    char_literal202=(Token)match(input,122,FOLLOW_122_in_triggerEffectList2066); 

            	    pushFollow(FOLLOW_triggerEffect_in_triggerEffectList2069);
            	    triggerEffect203=triggerEffect();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffect203.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:324:1: triggerEffect : ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | showMessage | setTriggerRunning | spawnItem | spawnTalkNode | unlockTech | changeStat | commandCallList );
    public final AtrophyScriptParser.triggerEffect_return triggerEffect() throws RecognitionException {
        AtrophyScriptParser.triggerEffect_return retval = new AtrophyScriptParser.triggerEffect_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.updateTalkTree_return updateTalkTree204 =null;

        AtrophyScriptParser.spawnTeam_return spawnTeam205 =null;

        AtrophyScriptParser.spawnCharacter_return spawnCharacter206 =null;

        AtrophyScriptParser.removeUnit_return removeUnit207 =null;

        AtrophyScriptParser.killUnit_return killUnit208 =null;

        AtrophyScriptParser.teleportUnit_return teleportUnit209 =null;

        AtrophyScriptParser.converseUnit_return converseUnit210 =null;

        AtrophyScriptParser.createSaferoom_return createSaferoom211 =null;

        AtrophyScriptParser.removeSaferoom_return removeSaferoom212 =null;

        AtrophyScriptParser.loadMap_return loadMap213 =null;

        AtrophyScriptParser.lockDoor_return lockDoor214 =null;

        AtrophyScriptParser.unlockDoor_return unlockDoor215 =null;

        AtrophyScriptParser.addTag_return addTag216 =null;

        AtrophyScriptParser.removeTag_return removeTag217 =null;

        AtrophyScriptParser.directorBias_return directorBias218 =null;

        AtrophyScriptParser.changeAiNode_return changeAiNode219 =null;

        AtrophyScriptParser.showMessage_return showMessage220 =null;

        AtrophyScriptParser.setTriggerRunning_return setTriggerRunning221 =null;

        AtrophyScriptParser.spawnItem_return spawnItem222 =null;

        AtrophyScriptParser.spawnTalkNode_return spawnTalkNode223 =null;

        AtrophyScriptParser.unlockTech_return unlockTech224 =null;

        AtrophyScriptParser.changeStat_return changeStat225 =null;

        AtrophyScriptParser.commandCallList_return commandCallList226 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:324:14: ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | showMessage | setTriggerRunning | spawnItem | spawnTalkNode | unlockTech | changeStat | commandCallList )
            int alt37=23;
            switch ( input.LA(1) ) {
            case UPDATE_TREE_PREFIX:
            case 228:
                {
                alt37=1;
                }
                break;
            case 209:
                {
                alt37=2;
                }
                break;
            case 206:
                {
                alt37=3;
                }
                break;
            case 199:
                {
                alt37=4;
                }
                break;
            case 178:
                {
                alt37=5;
                }
                break;
            case 218:
                {
                alt37=6;
                }
                break;
            case 158:
                {
                alt37=7;
                }
                break;
            case 202:
                {
                alt37=8;
                }
                break;
            case 197:
                {
                alt37=9;
                }
                break;
            case 181:
                {
                alt37=10;
                }
                break;
            case 182:
                {
                alt37=11;
                }
                break;
            case 226:
                {
                alt37=12;
                }
                break;
            case ADD_TAG_PREFIX:
            case 147:
                {
                alt37=13;
                }
                break;
            case REMOVE_TAG_PREFIX:
            case 198:
                {
                alt37=14;
                }
                break;
            case 161:
                {
                alt37=15;
                }
                break;
            case 154:
                {
                alt37=16;
                }
                break;
            case 205:
                {
                alt37=17;
                }
                break;
            case 204:
                {
                alt37=18;
                }
                break;
            case 207:
                {
                alt37=19;
                }
                break;
            case 208:
                {
                alt37=20;
                }
                break;
            case 227:
                {
                alt37=21;
                }
                break;
            case 153:
            case 155:
                {
                alt37=22;
                }
                break;
            case COMMAND_CALL_PREFIX:
            case 133:
            case 152:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:325:4: updateTalkTree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_updateTalkTree_in_triggerEffect2084);
                    updateTalkTree204=updateTalkTree();

                    state._fsp--;

                    adaptor.addChild(root_0, updateTalkTree204.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:326:6: spawnTeam
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnTeam_in_triggerEffect2091);
                    spawnTeam205=spawnTeam();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnTeam205.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:327:6: spawnCharacter
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnCharacter_in_triggerEffect2098);
                    spawnCharacter206=spawnCharacter();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnCharacter206.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:328:6: removeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeUnit_in_triggerEffect2105);
                    removeUnit207=removeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, removeUnit207.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:329:6: killUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_killUnit_in_triggerEffect2112);
                    killUnit208=killUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, killUnit208.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:330:6: teleportUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_teleportUnit_in_triggerEffect2119);
                    teleportUnit209=teleportUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, teleportUnit209.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:6: converseUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_converseUnit_in_triggerEffect2126);
                    converseUnit210=converseUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, converseUnit210.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:332:6: createSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_createSaferoom_in_triggerEffect2133);
                    createSaferoom211=createSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, createSaferoom211.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:333:6: removeSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeSaferoom_in_triggerEffect2140);
                    removeSaferoom212=removeSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, removeSaferoom212.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:334:6: loadMap
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_loadMap_in_triggerEffect2147);
                    loadMap213=loadMap();

                    state._fsp--;

                    adaptor.addChild(root_0, loadMap213.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:6: lockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lockDoor_in_triggerEffect2154);
                    lockDoor214=lockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, lockDoor214.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:6: unlockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unlockDoor_in_triggerEffect2161);
                    unlockDoor215=unlockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, unlockDoor215.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:337:6: addTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_addTag_in_triggerEffect2168);
                    addTag216=addTag();

                    state._fsp--;

                    adaptor.addChild(root_0, addTag216.getTree());

                    }
                    break;
                case 14 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:338:6: removeTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeTag_in_triggerEffect2175);
                    removeTag217=removeTag();

                    state._fsp--;

                    adaptor.addChild(root_0, removeTag217.getTree());

                    }
                    break;
                case 15 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:339:6: directorBias
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_directorBias_in_triggerEffect2182);
                    directorBias218=directorBias();

                    state._fsp--;

                    adaptor.addChild(root_0, directorBias218.getTree());

                    }
                    break;
                case 16 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:6: changeAiNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_changeAiNode_in_triggerEffect2189);
                    changeAiNode219=changeAiNode();

                    state._fsp--;

                    adaptor.addChild(root_0, changeAiNode219.getTree());

                    }
                    break;
                case 17 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:341:6: showMessage
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_showMessage_in_triggerEffect2196);
                    showMessage220=showMessage();

                    state._fsp--;

                    adaptor.addChild(root_0, showMessage220.getTree());

                    }
                    break;
                case 18 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:342:6: setTriggerRunning
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_setTriggerRunning_in_triggerEffect2203);
                    setTriggerRunning221=setTriggerRunning();

                    state._fsp--;

                    adaptor.addChild(root_0, setTriggerRunning221.getTree());

                    }
                    break;
                case 19 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:343:6: spawnItem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnItem_in_triggerEffect2210);
                    spawnItem222=spawnItem();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnItem222.getTree());

                    }
                    break;
                case 20 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:344:6: spawnTalkNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnTalkNode_in_triggerEffect2217);
                    spawnTalkNode223=spawnTalkNode();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnTalkNode223.getTree());

                    }
                    break;
                case 21 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:345:6: unlockTech
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unlockTech_in_triggerEffect2224);
                    unlockTech224=unlockTech();

                    state._fsp--;

                    adaptor.addChild(root_0, unlockTech224.getTree());

                    }
                    break;
                case 22 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:346:6: changeStat
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_changeStat_in_triggerEffect2231);
                    changeStat225=changeStat();

                    state._fsp--;

                    adaptor.addChild(root_0, changeStat225.getTree());

                    }
                    break;
                case 23 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:347:6: commandCallList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandCallList_in_triggerEffect2238);
                    commandCallList226=commandCallList();

                    state._fsp--;

                    adaptor.addChild(root_0, commandCallList226.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:350:1: updateTalkTree : ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) );
    public final AtrophyScriptParser.updateTalkTree_return updateTalkTree() throws RecognitionException {
        AtrophyScriptParser.updateTalkTree_return retval = new AtrophyScriptParser.updateTalkTree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal227=null;
        Token INT229=null;
        Token UPDATE_TREE_PREFIX230=null;
        Token char_literal232=null;
        Token INT233=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral228 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral231 =null;


        CommonTree string_literal227_tree=null;
        CommonTree INT229_tree=null;
        CommonTree UPDATE_TREE_PREFIX230_tree=null;
        CommonTree char_literal232_tree=null;
        CommonTree INT233_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_UPDATE_TREE_PREFIX=new RewriteRuleTokenStream(adaptor,"token UPDATE_TREE_PREFIX");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:350:15: ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==228) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:4: 'updateTalk:' stringLiteral INT
                    {
                    string_literal227=(Token)match(input,228,FOLLOW_228_in_updateTalkTree2253);  
                    stream_228.add(string_literal227);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree2255);
                    stringLiteral228=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral228.getTree());

                    INT229=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree2257);  
                    stream_INT.add(INT229);


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
                    // 351:36: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:39: ^( UPDATETALK stringLiteral INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:6: UPDATE_TREE_PREFIX stringLiteral '#' INT
                    {
                    UPDATE_TREE_PREFIX230=(Token)match(input,UPDATE_TREE_PREFIX,FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree2274);  
                    stream_UPDATE_TREE_PREFIX.add(UPDATE_TREE_PREFIX230);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree2276);
                    stringLiteral231=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral231.getTree());

                    char_literal232=(Token)match(input,119,FOLLOW_119_in_updateTalkTree2278);  
                    stream_119.add(char_literal232);


                    INT233=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree2280);  
                    stream_INT.add(INT233);


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
                    // 352:47: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:50: ^( UPDATETALK stringLiteral INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:1: isName : 'isName:' stringList -> ^( ISNAME stringList ) ;
    public final AtrophyScriptParser.isName_return isName() throws RecognitionException {
        AtrophyScriptParser.isName_return retval = new AtrophyScriptParser.isName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal234=null;
        AtrophyScriptParser.stringList_return stringList235 =null;


        CommonTree string_literal234_tree=null;
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:7: ( 'isName:' stringList -> ^( ISNAME stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:4: 'isName:' stringList
            {
            string_literal234=(Token)match(input,173,FOLLOW_173_in_isName2305);  
            stream_173.add(string_literal234);


            pushFollow(FOLLOW_stringList_in_isName2307);
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
            // 356:25: -> ^( ISNAME stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:28: ^( ISNAME stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:359:1: isFaction : 'isFaction:' stringList -> ^( ISFACTION stringList ) ;
    public final AtrophyScriptParser.isFaction_return isFaction() throws RecognitionException {
        AtrophyScriptParser.isFaction_return retval = new AtrophyScriptParser.isFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal236=null;
        AtrophyScriptParser.stringList_return stringList237 =null;


        CommonTree string_literal236_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:359:10: ( 'isFaction:' stringList -> ^( ISFACTION stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:4: 'isFaction:' stringList
            {
            string_literal236=(Token)match(input,170,FOLLOW_170_in_isFaction2330);  
            stream_170.add(string_literal236);


            pushFollow(FOLLOW_stringList_in_isFaction2332);
            stringList237=stringList();

            state._fsp--;

            stream_stringList.add(stringList237.getTree());

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
            // 360:28: -> ^( ISFACTION stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:31: ^( ISFACTION stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:363:1: isRoom : 'isRoom:' stringList -> ^( ISROOM stringList ) ;
    public final AtrophyScriptParser.isRoom_return isRoom() throws RecognitionException {
        AtrophyScriptParser.isRoom_return retval = new AtrophyScriptParser.isRoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal238=null;
        AtrophyScriptParser.stringList_return stringList239 =null;


        CommonTree string_literal238_tree=null;
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:363:7: ( 'isRoom:' stringList -> ^( ISROOM stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:364:4: 'isRoom:' stringList
            {
            string_literal238=(Token)match(input,177,FOLLOW_177_in_isRoom2355);  
            stream_177.add(string_literal238);


            pushFollow(FOLLOW_stringList_in_isRoom2357);
            stringList239=stringList();

            state._fsp--;

            stream_stringList.add(stringList239.getTree());

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
            // 364:25: -> ^( ISROOM stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:364:28: ^( ISROOM stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:1: hasItem : 'hasItem:' stringList -> ^( HASITEM stringList ) ;
    public final AtrophyScriptParser.hasItem_return hasItem() throws RecognitionException {
        AtrophyScriptParser.hasItem_return retval = new AtrophyScriptParser.hasItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal240=null;
        AtrophyScriptParser.stringList_return stringList241 =null;


        CommonTree string_literal240_tree=null;
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:367:8: ( 'hasItem:' stringList -> ^( HASITEM stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:368:4: 'hasItem:' stringList
            {
            string_literal240=(Token)match(input,165,FOLLOW_165_in_hasItem2380);  
            stream_165.add(string_literal240);


            pushFollow(FOLLOW_stringList_in_hasItem2382);
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
            // 368:26: -> ^( HASITEM stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:368:29: ^( HASITEM stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:371:1: hasWeapon : 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) ;
    public final AtrophyScriptParser.hasWeapon_return hasWeapon() throws RecognitionException {
        AtrophyScriptParser.hasWeapon_return retval = new AtrophyScriptParser.hasWeapon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal242=null;
        AtrophyScriptParser.stringList_return stringList243 =null;


        CommonTree string_literal242_tree=null;
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:371:10: ( 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:372:4: 'hasWeapon:' stringList
            {
            string_literal242=(Token)match(input,166,FOLLOW_166_in_hasWeapon2405);  
            stream_166.add(string_literal242);


            pushFollow(FOLLOW_stringList_in_hasWeapon2407);
            stringList243=stringList();

            state._fsp--;

            stream_stringList.add(stringList243.getTree());

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
            // 372:28: -> ^( HASWEAPON stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:372:31: ^( HASWEAPON stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:375:1: stringList : stringLiteral ( ',' stringLiteral )* -> ( ^( STRING stringLiteral ) )* ;
    public final AtrophyScriptParser.stringList_return stringList() throws RecognitionException {
        AtrophyScriptParser.stringList_return retval = new AtrophyScriptParser.stringList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal245=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral244 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral246 =null;


        CommonTree char_literal245_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:375:11: ( stringLiteral ( ',' stringLiteral )* -> ( ^( STRING stringLiteral ) )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:4: stringLiteral ( ',' stringLiteral )*
            {
            pushFollow(FOLLOW_stringLiteral_in_stringList2430);
            stringLiteral244=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral244.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:18: ( ',' stringLiteral )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==122) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==118) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:19: ',' stringLiteral
            	    {
            	    char_literal245=(Token)match(input,122,FOLLOW_122_in_stringList2433);  
            	    stream_122.add(char_literal245);


            	    pushFollow(FOLLOW_stringLiteral_in_stringList2435);
            	    stringLiteral246=stringLiteral();

            	    state._fsp--;

            	    stream_stringLiteral.add(stringLiteral246.getTree());

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
            // 376:39: -> ( ^( STRING stringLiteral ) )*
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:42: ( ^( STRING stringLiteral ) )*
                while ( stream_stringLiteral.hasNext() ) {
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:42: ^( STRING stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:1: isAlive : 'isAlive' -> ^( ISALIVE ) ;
    public final AtrophyScriptParser.isAlive_return isAlive() throws RecognitionException {
        AtrophyScriptParser.isAlive_return retval = new AtrophyScriptParser.isAlive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal247=null;

        CommonTree string_literal247_tree=null;
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:379:8: ( 'isAlive' -> ^( ISALIVE ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:380:4: 'isAlive'
            {
            string_literal247=(Token)match(input,167,FOLLOW_167_in_isAlive2459);  
            stream_167.add(string_literal247);


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
            // 380:14: -> ^( ISALIVE )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:380:17: ^( ISALIVE )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:383:1: isDead : 'isDead' -> ^( ISDEAD ) ;
    public final AtrophyScriptParser.isDead_return isDead() throws RecognitionException {
        AtrophyScriptParser.isDead_return retval = new AtrophyScriptParser.isDead_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal248=null;

        CommonTree string_literal248_tree=null;
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:383:7: ( 'isDead' -> ^( ISDEAD ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:384:4: 'isDead'
            {
            string_literal248=(Token)match(input,169,FOLLOW_169_in_isDead2480);  
            stream_169.add(string_literal248);


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
            // 384:13: -> ^( ISDEAD )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:384:16: ^( ISDEAD )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:387:1: isInvestigated : 'isInvestigated' -> ^( ISINVESTIGATED ) ;
    public final AtrophyScriptParser.isInvestigated_return isInvestigated() throws RecognitionException {
        AtrophyScriptParser.isInvestigated_return retval = new AtrophyScriptParser.isInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal249=null;

        CommonTree string_literal249_tree=null;
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:387:15: ( 'isInvestigated' -> ^( ISINVESTIGATED ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:388:4: 'isInvestigated'
            {
            string_literal249=(Token)match(input,172,FOLLOW_172_in_isInvestigated2501);  
            stream_172.add(string_literal249);


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
            // 388:21: -> ^( ISINVESTIGATED )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:388:24: ^( ISINVESTIGATED )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:391:1: isNotInvestigated : 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) ;
    public final AtrophyScriptParser.isNotInvestigated_return isNotInvestigated() throws RecognitionException {
        AtrophyScriptParser.isNotInvestigated_return retval = new AtrophyScriptParser.isNotInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal250=null;

        CommonTree string_literal250_tree=null;
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:391:18: ( 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:392:4: 'isNotInvestigated'
            {
            string_literal250=(Token)match(input,175,FOLLOW_175_in_isNotInvestigated2522);  
            stream_175.add(string_literal250);


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
            // 392:24: -> ^( ISNOTINVESTIGATED )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:392:27: ^( ISNOTINVESTIGATED )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:395:1: isDaemon : 'isDaemon' -> ^( ISDAEMON ) ;
    public final AtrophyScriptParser.isDaemon_return isDaemon() throws RecognitionException {
        AtrophyScriptParser.isDaemon_return retval = new AtrophyScriptParser.isDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal251=null;

        CommonTree string_literal251_tree=null;
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:395:9: ( 'isDaemon' -> ^( ISDAEMON ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:396:4: 'isDaemon'
            {
            string_literal251=(Token)match(input,168,FOLLOW_168_in_isDaemon2543);  
            stream_168.add(string_literal251);


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
            // 396:15: -> ^( ISDAEMON )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:396:18: ^( ISDAEMON )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:399:1: isNotDaemon : 'isNotDaemon' -> ^( ISNOTDAEMON ) ;
    public final AtrophyScriptParser.isNotDaemon_return isNotDaemon() throws RecognitionException {
        AtrophyScriptParser.isNotDaemon_return retval = new AtrophyScriptParser.isNotDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal252=null;

        CommonTree string_literal252_tree=null;
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:399:12: ( 'isNotDaemon' -> ^( ISNOTDAEMON ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:400:4: 'isNotDaemon'
            {
            string_literal252=(Token)match(input,174,FOLLOW_174_in_isNotDaemon2562);  
            stream_174.add(string_literal252);


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
            // 400:18: -> ^( ISNOTDAEMON )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:400:21: ^( ISNOTDAEMON )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:403:1: teleDestination : 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) ;
    public final AtrophyScriptParser.teleDestination_return teleDestination() throws RecognitionException {
        AtrophyScriptParser.teleDestination_return retval = new AtrophyScriptParser.teleDestination_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal253=null;
        Token char_literal254=null;
        Token char_literal257=null;
        AtrophyScriptParser.xListProperty_return xListProperty255 =null;

        AtrophyScriptParser.yListProperty_return yListProperty256 =null;


        CommonTree string_literal253_tree=null;
        CommonTree char_literal254_tree=null;
        CommonTree char_literal257_tree=null;
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_yListProperty=new RewriteRuleSubtreeStream(adaptor,"rule yListProperty");
        RewriteRuleSubtreeStream stream_xListProperty=new RewriteRuleSubtreeStream(adaptor,"rule xListProperty");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:403:16: ( 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:404:4: 'destination' '{' xListProperty yListProperty '}'
            {
            string_literal253=(Token)match(input,160,FOLLOW_160_in_teleDestination2583);  
            stream_160.add(string_literal253);


            char_literal254=(Token)match(input,233,FOLLOW_233_in_teleDestination2585);  
            stream_233.add(char_literal254);


            pushFollow(FOLLOW_xListProperty_in_teleDestination2587);
            xListProperty255=xListProperty();

            state._fsp--;

            stream_xListProperty.add(xListProperty255.getTree());

            pushFollow(FOLLOW_yListProperty_in_teleDestination2589);
            yListProperty256=yListProperty();

            state._fsp--;

            stream_yListProperty.add(yListProperty256.getTree());

            char_literal257=(Token)match(input,234,FOLLOW_234_in_teleDestination2591);  
            stream_234.add(char_literal257);


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
            // 404:54: -> ^( TELEDEST xListProperty yListProperty )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:404:57: ^( TELEDEST xListProperty yListProperty )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:407:1: maxTeamSize : 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) ;
    public final AtrophyScriptParser.maxTeamSize_return maxTeamSize() throws RecognitionException {
        AtrophyScriptParser.maxTeamSize_return retval = new AtrophyScriptParser.maxTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal258=null;
        Token INT259=null;

        CommonTree string_literal258_tree=null;
        CommonTree INT259_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:407:12: ( 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:408:4: 'maxTeamSize:' INT
            {
            string_literal258=(Token)match(input,185,FOLLOW_185_in_maxTeamSize2616);  
            stream_185.add(string_literal258);


            INT259=(Token)match(input,INT,FOLLOW_INT_in_maxTeamSize2618);  
            stream_INT.add(INT259);


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
            // 408:23: -> ^( MAXTEAMSIZE INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:408:26: ^( MAXTEAMSIZE INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:411:1: minTeamSize : 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) ;
    public final AtrophyScriptParser.minTeamSize_return minTeamSize() throws RecognitionException {
        AtrophyScriptParser.minTeamSize_return retval = new AtrophyScriptParser.minTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal260=null;
        Token INT261=null;

        CommonTree string_literal260_tree=null;
        CommonTree INT261_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:411:12: ( 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:412:4: 'minTeamSize:' INT
            {
            string_literal260=(Token)match(input,187,FOLLOW_187_in_minTeamSize2639);  
            stream_187.add(string_literal260);


            INT261=(Token)match(input,INT,FOLLOW_INT_in_minTeamSize2641);  
            stream_INT.add(INT261);


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
            // 412:23: -> ^( MINTEAMSIZE INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:412:26: ^( MINTEAMSIZE INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:415:1: isPlayer : 'isPlayer' -> ^( ISPLAYER ) ;
    public final AtrophyScriptParser.isPlayer_return isPlayer() throws RecognitionException {
        AtrophyScriptParser.isPlayer_return retval = new AtrophyScriptParser.isPlayer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal262=null;

        CommonTree string_literal262_tree=null;
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:415:9: ( 'isPlayer' -> ^( ISPLAYER ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:416:4: 'isPlayer'
            {
            string_literal262=(Token)match(input,176,FOLLOW_176_in_isPlayer2664);  
            stream_176.add(string_literal262);


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
            // 416:15: -> ^( ISPLAYER )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:416:18: ^( ISPLAYER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ISPLAYER, "ISPLAYER")
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
    // $ANTLR end "isPlayer"


    public static class aiNode_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aiNode"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:419:1: aiNode : 'aiNode' '{' aiNodeOptions '}' -> ^( AINODE aiNodeOptions ) ;
    public final AtrophyScriptParser.aiNode_return aiNode() throws RecognitionException {
        AtrophyScriptParser.aiNode_return retval = new AtrophyScriptParser.aiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal263=null;
        Token char_literal264=null;
        Token char_literal266=null;
        AtrophyScriptParser.aiNodeOptions_return aiNodeOptions265 =null;


        CommonTree string_literal263_tree=null;
        CommonTree char_literal264_tree=null;
        CommonTree char_literal266_tree=null;
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_aiNodeOptions=new RewriteRuleSubtreeStream(adaptor,"rule aiNodeOptions");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:419:7: ( 'aiNode' '{' aiNodeOptions '}' -> ^( AINODE aiNodeOptions ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:420:4: 'aiNode' '{' aiNodeOptions '}'
            {
            string_literal263=(Token)match(input,149,FOLLOW_149_in_aiNode2685);  
            stream_149.add(string_literal263);


            char_literal264=(Token)match(input,233,FOLLOW_233_in_aiNode2687);  
            stream_233.add(char_literal264);


            pushFollow(FOLLOW_aiNodeOptions_in_aiNode2689);
            aiNodeOptions265=aiNodeOptions();

            state._fsp--;

            stream_aiNodeOptions.add(aiNodeOptions265.getTree());

            char_literal266=(Token)match(input,234,FOLLOW_234_in_aiNode2691);  
            stream_234.add(char_literal266);


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
            // 420:35: -> ^( AINODE aiNodeOptions )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:420:38: ^( AINODE aiNodeOptions )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:423:1: aiNodeOptions : ( subscribeTalkMaps | behaviours | aiNodePriority )* ;
    public final AtrophyScriptParser.aiNodeOptions_return aiNodeOptions() throws RecognitionException {
        AtrophyScriptParser.aiNodeOptions_return retval = new AtrophyScriptParser.aiNodeOptions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps267 =null;

        AtrophyScriptParser.behaviours_return behaviours268 =null;

        AtrophyScriptParser.aiNodePriority_return aiNodePriority269 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:423:14: ( ( subscribeTalkMaps | behaviours | aiNodePriority )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:3: ( subscribeTalkMaps | behaviours | aiNodePriority )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:3: ( subscribeTalkMaps | behaviours | aiNodePriority )*
            loop40:
            do {
                int alt40=4;
                switch ( input.LA(1) ) {
                case 213:
                    {
                    alt40=1;
                    }
                    break;
                case 150:
                    {
                    alt40=2;
                    }
                    break;
                case 196:
                    {
                    alt40=3;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:4: subscribeTalkMaps
            	    {
            	    pushFollow(FOLLOW_subscribeTalkMaps_in_aiNodeOptions2714);
            	    subscribeTalkMaps267=subscribeTalkMaps();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subscribeTalkMaps267.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:425:4: behaviours
            	    {
            	    pushFollow(FOLLOW_behaviours_in_aiNodeOptions2719);
            	    behaviours268=behaviours();

            	    state._fsp--;

            	    adaptor.addChild(root_0, behaviours268.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:426:4: aiNodePriority
            	    {
            	    pushFollow(FOLLOW_aiNodePriority_in_aiNodeOptions2724);
            	    aiNodePriority269=aiNodePriority();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiNodePriority269.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:429:1: subscribeTalkMaps : 'subscribe:' stringList -> ^( SUBSCRIBE stringList ) ;
    public final AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps() throws RecognitionException {
        AtrophyScriptParser.subscribeTalkMaps_return retval = new AtrophyScriptParser.subscribeTalkMaps_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal270=null;
        AtrophyScriptParser.stringList_return stringList271 =null;


        CommonTree string_literal270_tree=null;
        RewriteRuleTokenStream stream_213=new RewriteRuleTokenStream(adaptor,"token 213");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:429:18: ( 'subscribe:' stringList -> ^( SUBSCRIBE stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:430:4: 'subscribe:' stringList
            {
            string_literal270=(Token)match(input,213,FOLLOW_213_in_subscribeTalkMaps2741);  
            stream_213.add(string_literal270);


            pushFollow(FOLLOW_stringList_in_subscribeTalkMaps2742);
            stringList271=stringList();

            state._fsp--;

            stream_stringList.add(stringList271.getTree());

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
            // 430:27: -> ^( SUBSCRIBE stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:430:30: ^( SUBSCRIBE stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:433:1: behaviours : 'behaviours:' stringList -> ^( BEHAVIOUR stringList ) ;
    public final AtrophyScriptParser.behaviours_return behaviours() throws RecognitionException {
        AtrophyScriptParser.behaviours_return retval = new AtrophyScriptParser.behaviours_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal272=null;
        AtrophyScriptParser.stringList_return stringList273 =null;


        CommonTree string_literal272_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:433:11: ( 'behaviours:' stringList -> ^( BEHAVIOUR stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:434:4: 'behaviours:' stringList
            {
            string_literal272=(Token)match(input,150,FOLLOW_150_in_behaviours2765);  
            stream_150.add(string_literal272);


            pushFollow(FOLLOW_stringList_in_behaviours2767);
            stringList273=stringList();

            state._fsp--;

            stream_stringList.add(stringList273.getTree());

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
            // 434:29: -> ^( BEHAVIOUR stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:434:32: ^( BEHAVIOUR stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:437:1: aiNodePriority : 'priority:' stringList -> ^( PRIORITY stringList ) ;
    public final AtrophyScriptParser.aiNodePriority_return aiNodePriority() throws RecognitionException {
        AtrophyScriptParser.aiNodePriority_return retval = new AtrophyScriptParser.aiNodePriority_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal274=null;
        AtrophyScriptParser.stringList_return stringList275 =null;


        CommonTree string_literal274_tree=null;
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:437:15: ( 'priority:' stringList -> ^( PRIORITY stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:438:4: 'priority:' stringList
            {
            string_literal274=(Token)match(input,196,FOLLOW_196_in_aiNodePriority2790);  
            stream_196.add(string_literal274);


            pushFollow(FOLLOW_stringList_in_aiNodePriority2792);
            stringList275=stringList();

            state._fsp--;

            stream_stringList.add(stringList275.getTree());

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
            // 438:27: -> ^( PRIORITY stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:438:30: ^( PRIORITY stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:441:1: unitInfo : ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )* ;
    public final AtrophyScriptParser.unitInfo_return unitInfo() throws RecognitionException {
        AtrophyScriptParser.unitInfo_return retval = new AtrophyScriptParser.unitInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName276 =null;

        AtrophyScriptParser.isFaction_return isFaction277 =null;

        AtrophyScriptParser.isRoom_return isRoom278 =null;

        AtrophyScriptParser.hasItem_return hasItem279 =null;

        AtrophyScriptParser.hasWeapon_return hasWeapon280 =null;

        AtrophyScriptParser.isAlive_return isAlive281 =null;

        AtrophyScriptParser.isDead_return isDead282 =null;

        AtrophyScriptParser.isInvestigated_return isInvestigated283 =null;

        AtrophyScriptParser.isNotInvestigated_return isNotInvestigated284 =null;

        AtrophyScriptParser.isDaemon_return isDaemon285 =null;

        AtrophyScriptParser.isNotDaemon_return isNotDaemon286 =null;

        AtrophyScriptParser.teleDestination_return teleDestination287 =null;

        AtrophyScriptParser.maxTeamSize_return maxTeamSize288 =null;

        AtrophyScriptParser.minTeamSize_return minTeamSize289 =null;

        AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps290 =null;

        AtrophyScriptParser.aiNode_return aiNode291 =null;

        AtrophyScriptParser.isPlayer_return isPlayer292 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:441:9: ( ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:442:4: ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:442:4: ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )*
            loop41:
            do {
                int alt41=18;
                switch ( input.LA(1) ) {
                case 173:
                    {
                    alt41=1;
                    }
                    break;
                case 170:
                    {
                    alt41=2;
                    }
                    break;
                case 177:
                    {
                    alt41=3;
                    }
                    break;
                case 165:
                    {
                    alt41=4;
                    }
                    break;
                case 166:
                    {
                    alt41=5;
                    }
                    break;
                case 167:
                    {
                    alt41=6;
                    }
                    break;
                case 169:
                    {
                    alt41=7;
                    }
                    break;
                case 172:
                    {
                    alt41=8;
                    }
                    break;
                case 175:
                    {
                    alt41=9;
                    }
                    break;
                case 168:
                    {
                    alt41=10;
                    }
                    break;
                case 174:
                    {
                    alt41=11;
                    }
                    break;
                case 160:
                    {
                    alt41=12;
                    }
                    break;
                case 185:
                    {
                    alt41=13;
                    }
                    break;
                case 187:
                    {
                    alt41=14;
                    }
                    break;
                case 213:
                    {
                    alt41=15;
                    }
                    break;
                case 149:
                    {
                    alt41=16;
                    }
                    break;
                case 176:
                    {
                    alt41=17;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:442:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_unitInfo2816);
            	    isName276=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName276.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:443:6: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_unitInfo2823);
            	    isFaction277=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction277.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:444:6: isRoom
            	    {
            	    pushFollow(FOLLOW_isRoom_in_unitInfo2830);
            	    isRoom278=isRoom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isRoom278.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:445:6: hasItem
            	    {
            	    pushFollow(FOLLOW_hasItem_in_unitInfo2837);
            	    hasItem279=hasItem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasItem279.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:446:6: hasWeapon
            	    {
            	    pushFollow(FOLLOW_hasWeapon_in_unitInfo2844);
            	    hasWeapon280=hasWeapon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasWeapon280.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:447:6: isAlive
            	    {
            	    pushFollow(FOLLOW_isAlive_in_unitInfo2851);
            	    isAlive281=isAlive();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isAlive281.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:448:6: isDead
            	    {
            	    pushFollow(FOLLOW_isDead_in_unitInfo2858);
            	    isDead282=isDead();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDead282.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:449:6: isInvestigated
            	    {
            	    pushFollow(FOLLOW_isInvestigated_in_unitInfo2865);
            	    isInvestigated283=isInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isInvestigated283.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:450:6: isNotInvestigated
            	    {
            	    pushFollow(FOLLOW_isNotInvestigated_in_unitInfo2872);
            	    isNotInvestigated284=isNotInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotInvestigated284.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:451:6: isDaemon
            	    {
            	    pushFollow(FOLLOW_isDaemon_in_unitInfo2879);
            	    isDaemon285=isDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDaemon285.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:452:6: isNotDaemon
            	    {
            	    pushFollow(FOLLOW_isNotDaemon_in_unitInfo2886);
            	    isNotDaemon286=isNotDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotDaemon286.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:453:6: teleDestination
            	    {
            	    pushFollow(FOLLOW_teleDestination_in_unitInfo2893);
            	    teleDestination287=teleDestination();

            	    state._fsp--;

            	    adaptor.addChild(root_0, teleDestination287.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:454:6: maxTeamSize
            	    {
            	    pushFollow(FOLLOW_maxTeamSize_in_unitInfo2900);
            	    maxTeamSize288=maxTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, maxTeamSize288.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:455:6: minTeamSize
            	    {
            	    pushFollow(FOLLOW_minTeamSize_in_unitInfo2907);
            	    minTeamSize289=minTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, minTeamSize289.getTree());

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:456:6: subscribeTalkMaps
            	    {
            	    pushFollow(FOLLOW_subscribeTalkMaps_in_unitInfo2914);
            	    subscribeTalkMaps290=subscribeTalkMaps();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subscribeTalkMaps290.getTree());

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:457:6: aiNode
            	    {
            	    pushFollow(FOLLOW_aiNode_in_unitInfo2921);
            	    aiNode291=aiNode();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiNode291.getTree());

            	    }
            	    break;
            	case 17 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:458:6: isPlayer
            	    {
            	    pushFollow(FOLLOW_isPlayer_in_unitInfo2928);
            	    isPlayer292=isPlayer();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isPlayer292.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:461:1: spawnTeam : 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) ;
    public final AtrophyScriptParser.spawnTeam_return spawnTeam() throws RecognitionException {
        AtrophyScriptParser.spawnTeam_return retval = new AtrophyScriptParser.spawnTeam_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal293=null;
        Token char_literal294=null;
        Token char_literal296=null;
        AtrophyScriptParser.unitInfo_return unitInfo295 =null;


        CommonTree string_literal293_tree=null;
        CommonTree char_literal294_tree=null;
        CommonTree char_literal296_tree=null;
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_209=new RewriteRuleTokenStream(adaptor,"token 209");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:461:10: ( 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:462:4: 'spawnTeam' '{' unitInfo '}'
            {
            string_literal293=(Token)match(input,209,FOLLOW_209_in_spawnTeam2947);  
            stream_209.add(string_literal293);


            char_literal294=(Token)match(input,233,FOLLOW_233_in_spawnTeam2949);  
            stream_233.add(char_literal294);


            pushFollow(FOLLOW_unitInfo_in_spawnTeam2951);
            unitInfo295=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo295.getTree());

            char_literal296=(Token)match(input,234,FOLLOW_234_in_spawnTeam2953);  
            stream_234.add(char_literal296);


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
            // 462:33: -> ^( SPAWNTEAM unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:462:36: ^( SPAWNTEAM unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:465:1: spawnCharacter : 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) ;
    public final AtrophyScriptParser.spawnCharacter_return spawnCharacter() throws RecognitionException {
        AtrophyScriptParser.spawnCharacter_return retval = new AtrophyScriptParser.spawnCharacter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal297=null;
        Token char_literal298=null;
        Token char_literal300=null;
        AtrophyScriptParser.unitInfo_return unitInfo299 =null;


        CommonTree string_literal297_tree=null;
        CommonTree char_literal298_tree=null;
        CommonTree char_literal300_tree=null;
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:465:15: ( 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:466:4: 'spawnCharacter' '{' unitInfo '}'
            {
            string_literal297=(Token)match(input,206,FOLLOW_206_in_spawnCharacter2976);  
            stream_206.add(string_literal297);


            char_literal298=(Token)match(input,233,FOLLOW_233_in_spawnCharacter2978);  
            stream_233.add(char_literal298);


            pushFollow(FOLLOW_unitInfo_in_spawnCharacter2980);
            unitInfo299=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo299.getTree());

            char_literal300=(Token)match(input,234,FOLLOW_234_in_spawnCharacter2982);  
            stream_234.add(char_literal300);


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
            // 466:38: -> ^( SPAWNCHARACTER unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:466:41: ^( SPAWNCHARACTER unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:469:1: removeUnit : 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) ;
    public final AtrophyScriptParser.removeUnit_return removeUnit() throws RecognitionException {
        AtrophyScriptParser.removeUnit_return retval = new AtrophyScriptParser.removeUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal301=null;
        Token char_literal302=null;
        Token char_literal304=null;
        AtrophyScriptParser.unitInfo_return unitInfo303 =null;


        CommonTree string_literal301_tree=null;
        CommonTree char_literal302_tree=null;
        CommonTree char_literal304_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:469:11: ( 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:470:4: 'removeUnit' '{' unitInfo '}'
            {
            string_literal301=(Token)match(input,199,FOLLOW_199_in_removeUnit3005);  
            stream_199.add(string_literal301);


            char_literal302=(Token)match(input,233,FOLLOW_233_in_removeUnit3007);  
            stream_233.add(char_literal302);


            pushFollow(FOLLOW_unitInfo_in_removeUnit3009);
            unitInfo303=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo303.getTree());

            char_literal304=(Token)match(input,234,FOLLOW_234_in_removeUnit3011);  
            stream_234.add(char_literal304);


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
            // 470:34: -> ^( REMOVEUNIT unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:470:37: ^( REMOVEUNIT unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:473:1: killUnit : 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) ;
    public final AtrophyScriptParser.killUnit_return killUnit() throws RecognitionException {
        AtrophyScriptParser.killUnit_return retval = new AtrophyScriptParser.killUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal305=null;
        Token char_literal306=null;
        Token char_literal308=null;
        AtrophyScriptParser.unitInfo_return unitInfo307 =null;


        CommonTree string_literal305_tree=null;
        CommonTree char_literal306_tree=null;
        CommonTree char_literal308_tree=null;
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:473:9: ( 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:474:4: 'killUnit' '{' unitInfo '}'
            {
            string_literal305=(Token)match(input,178,FOLLOW_178_in_killUnit3034);  
            stream_178.add(string_literal305);


            char_literal306=(Token)match(input,233,FOLLOW_233_in_killUnit3036);  
            stream_233.add(char_literal306);


            pushFollow(FOLLOW_unitInfo_in_killUnit3038);
            unitInfo307=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo307.getTree());

            char_literal308=(Token)match(input,234,FOLLOW_234_in_killUnit3040);  
            stream_234.add(char_literal308);


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
            // 474:32: -> ^( KILLUNIT unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:474:35: ^( KILLUNIT unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:477:1: teleportUnit : 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) ;
    public final AtrophyScriptParser.teleportUnit_return teleportUnit() throws RecognitionException {
        AtrophyScriptParser.teleportUnit_return retval = new AtrophyScriptParser.teleportUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal309=null;
        Token char_literal310=null;
        Token char_literal312=null;
        AtrophyScriptParser.unitInfo_return unitInfo311 =null;


        CommonTree string_literal309_tree=null;
        CommonTree char_literal310_tree=null;
        CommonTree char_literal312_tree=null;
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_218=new RewriteRuleTokenStream(adaptor,"token 218");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:477:13: ( 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:478:4: 'teleport' '{' unitInfo '}'
            {
            string_literal309=(Token)match(input,218,FOLLOW_218_in_teleportUnit3063);  
            stream_218.add(string_literal309);


            char_literal310=(Token)match(input,233,FOLLOW_233_in_teleportUnit3065);  
            stream_233.add(char_literal310);


            pushFollow(FOLLOW_unitInfo_in_teleportUnit3067);
            unitInfo311=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo311.getTree());

            char_literal312=(Token)match(input,234,FOLLOW_234_in_teleportUnit3069);  
            stream_234.add(char_literal312);


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
            // 478:32: -> ^( TELEPORT unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:478:35: ^( TELEPORT unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:481:1: converseUnit : 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) ;
    public final AtrophyScriptParser.converseUnit_return converseUnit() throws RecognitionException {
        AtrophyScriptParser.converseUnit_return retval = new AtrophyScriptParser.converseUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal313=null;
        Token char_literal314=null;
        Token char_literal316=null;
        AtrophyScriptParser.unitInfo_return unitInfo315 =null;


        CommonTree string_literal313_tree=null;
        CommonTree char_literal314_tree=null;
        CommonTree char_literal316_tree=null;
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:481:13: ( 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:482:4: 'converse' '{' unitInfo '}'
            {
            string_literal313=(Token)match(input,158,FOLLOW_158_in_converseUnit3092);  
            stream_158.add(string_literal313);


            char_literal314=(Token)match(input,233,FOLLOW_233_in_converseUnit3094);  
            stream_233.add(char_literal314);


            pushFollow(FOLLOW_unitInfo_in_converseUnit3096);
            unitInfo315=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo315.getTree());

            char_literal316=(Token)match(input,234,FOLLOW_234_in_converseUnit3098);  
            stream_234.add(char_literal316);


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
            // 482:32: -> ^( CONVERSE unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:482:35: ^( CONVERSE unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:485:1: createSaferoom : 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.createSaferoom_return createSaferoom() throws RecognitionException {
        AtrophyScriptParser.createSaferoom_return retval = new AtrophyScriptParser.createSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal317=null;
        Token char_literal318=null;
        Token char_literal320=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo319 =null;


        CommonTree string_literal317_tree=null;
        CommonTree char_literal318_tree=null;
        CommonTree char_literal320_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:485:15: ( 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:486:4: 'saferoom' '{' saferoomInfo '}'
            {
            string_literal317=(Token)match(input,202,FOLLOW_202_in_createSaferoom3121);  
            stream_202.add(string_literal317);


            char_literal318=(Token)match(input,233,FOLLOW_233_in_createSaferoom3123);  
            stream_233.add(char_literal318);


            pushFollow(FOLLOW_saferoomInfo_in_createSaferoom3125);
            saferoomInfo319=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo319.getTree());

            char_literal320=(Token)match(input,234,FOLLOW_234_in_createSaferoom3127);  
            stream_234.add(char_literal320);


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
            // 486:36: -> ^( SAFEROOM saferoomInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:486:39: ^( SAFEROOM saferoomInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:489:1: removeSaferoom : 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.removeSaferoom_return removeSaferoom() throws RecognitionException {
        AtrophyScriptParser.removeSaferoom_return retval = new AtrophyScriptParser.removeSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal321=null;
        Token char_literal322=null;
        Token char_literal324=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo323 =null;


        CommonTree string_literal321_tree=null;
        CommonTree char_literal322_tree=null;
        CommonTree char_literal324_tree=null;
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:489:15: ( 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:490:4: 'removeSaferoom' '{' saferoomInfo '}'
            {
            string_literal321=(Token)match(input,197,FOLLOW_197_in_removeSaferoom3150);  
            stream_197.add(string_literal321);


            char_literal322=(Token)match(input,233,FOLLOW_233_in_removeSaferoom3152);  
            stream_233.add(char_literal322);


            pushFollow(FOLLOW_saferoomInfo_in_removeSaferoom3154);
            saferoomInfo323=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo323.getTree());

            char_literal324=(Token)match(input,234,FOLLOW_234_in_removeSaferoom3156);  
            stream_234.add(char_literal324);


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
            // 490:42: -> ^( REMOVESAFEROOM saferoomInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:490:45: ^( REMOVESAFEROOM saferoomInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:493:1: containsFaction : 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) ;
    public final AtrophyScriptParser.containsFaction_return containsFaction() throws RecognitionException {
        AtrophyScriptParser.containsFaction_return retval = new AtrophyScriptParser.containsFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal325=null;
        AtrophyScriptParser.stringList_return stringList326 =null;


        CommonTree string_literal325_tree=null;
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:493:16: ( 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:4: 'containsFaction:' stringList
            {
            string_literal325=(Token)match(input,157,FOLLOW_157_in_containsFaction3179);  
            stream_157.add(string_literal325);


            pushFollow(FOLLOW_stringList_in_containsFaction3181);
            stringList326=stringList();

            state._fsp--;

            stream_stringList.add(stringList326.getTree());

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
            // 494:34: -> ^( CONTAINSFACTION stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:37: ^( CONTAINSFACTION stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:497:1: saferoomInfo : ( containsFaction | isName )* ;
    public final AtrophyScriptParser.saferoomInfo_return saferoomInfo() throws RecognitionException {
        AtrophyScriptParser.saferoomInfo_return retval = new AtrophyScriptParser.saferoomInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.containsFaction_return containsFaction327 =null;

        AtrophyScriptParser.isName_return isName328 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:497:13: ( ( containsFaction | isName )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:498:4: ( containsFaction | isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:498:4: ( containsFaction | isName )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==157) ) {
                    alt42=1;
                }
                else if ( (LA42_0==173) ) {
                    alt42=2;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:498:5: containsFaction
            	    {
            	    pushFollow(FOLLOW_containsFaction_in_saferoomInfo3205);
            	    containsFaction327=containsFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, containsFaction327.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:499:6: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_saferoomInfo3212);
            	    isName328=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName328.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:502:1: mapInfo : ( isName | isFaction | itemSpawnChance )* ;
    public final AtrophyScriptParser.mapInfo_return mapInfo() throws RecognitionException {
        AtrophyScriptParser.mapInfo_return retval = new AtrophyScriptParser.mapInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName329 =null;

        AtrophyScriptParser.isFaction_return isFaction330 =null;

        AtrophyScriptParser.itemSpawnChance_return itemSpawnChance331 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:502:8: ( ( isName | isFaction | itemSpawnChance )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:503:4: ( isName | isFaction | itemSpawnChance )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:503:4: ( isName | isFaction | itemSpawnChance )*
            loop43:
            do {
                int alt43=4;
                switch ( input.LA(1) ) {
                case 173:
                    {
                    alt43=1;
                    }
                    break;
                case 170:
                    {
                    alt43=2;
                    }
                    break;
                case 162:
                case 186:
                case 203:
                case 229:
                    {
                    alt43=3;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:503:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_mapInfo3230);
            	    isName329=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName329.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:503:14: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_mapInfo3234);
            	    isFaction330=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction330.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:503:26: itemSpawnChance
            	    {
            	    pushFollow(FOLLOW_itemSpawnChance_in_mapInfo3238);
            	    itemSpawnChance331=itemSpawnChance();

            	    state._fsp--;

            	    adaptor.addChild(root_0, itemSpawnChance331.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:506:1: itemSpawnChance : ( 'engChance:' INT -> ^( ENG INT ) | 'medChance:' INT -> ^( MED INT ) | 'wepChance:' INT -> ^( WEP INT ) | 'sciChance' INT -> ^( SCI INT ) );
    public final AtrophyScriptParser.itemSpawnChance_return itemSpawnChance() throws RecognitionException {
        AtrophyScriptParser.itemSpawnChance_return retval = new AtrophyScriptParser.itemSpawnChance_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal332=null;
        Token INT333=null;
        Token string_literal334=null;
        Token INT335=null;
        Token string_literal336=null;
        Token INT337=null;
        Token string_literal338=null;
        Token INT339=null;

        CommonTree string_literal332_tree=null;
        CommonTree INT333_tree=null;
        CommonTree string_literal334_tree=null;
        CommonTree INT335_tree=null;
        CommonTree string_literal336_tree=null;
        CommonTree INT337_tree=null;
        CommonTree string_literal338_tree=null;
        CommonTree INT339_tree=null;
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:506:16: ( 'engChance:' INT -> ^( ENG INT ) | 'medChance:' INT -> ^( MED INT ) | 'wepChance:' INT -> ^( WEP INT ) | 'sciChance' INT -> ^( SCI INT ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 162:
                {
                alt44=1;
                }
                break;
            case 186:
                {
                alt44=2;
                }
                break;
            case 229:
                {
                alt44=3;
                }
                break;
            case 203:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:507:4: 'engChance:' INT
                    {
                    string_literal332=(Token)match(input,162,FOLLOW_162_in_itemSpawnChance3255);  
                    stream_162.add(string_literal332);


                    INT333=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3257);  
                    stream_INT.add(INT333);


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
                    // 507:21: -> ^( ENG INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:507:24: ^( ENG INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:508:6: 'medChance:' INT
                    {
                    string_literal334=(Token)match(input,186,FOLLOW_186_in_itemSpawnChance3272);  
                    stream_186.add(string_literal334);


                    INT335=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3274);  
                    stream_INT.add(INT335);


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
                    // 508:23: -> ^( MED INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:508:26: ^( MED INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:509:6: 'wepChance:' INT
                    {
                    string_literal336=(Token)match(input,229,FOLLOW_229_in_itemSpawnChance3289);  
                    stream_229.add(string_literal336);


                    INT337=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3291);  
                    stream_INT.add(INT337);


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
                    // 509:23: -> ^( WEP INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:509:26: ^( WEP INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:510:6: 'sciChance' INT
                    {
                    string_literal338=(Token)match(input,203,FOLLOW_203_in_itemSpawnChance3306);  
                    stream_203.add(string_literal338);


                    INT339=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3308);  
                    stream_INT.add(INT339);


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
                    // 510:22: -> ^( SCI INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:510:25: ^( SCI INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:513:1: loadMap : 'loadMap' '{' mapInfo '}' -> ^( LOADMAP mapInfo ) ;
    public final AtrophyScriptParser.loadMap_return loadMap() throws RecognitionException {
        AtrophyScriptParser.loadMap_return retval = new AtrophyScriptParser.loadMap_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal340=null;
        Token char_literal341=null;
        Token char_literal343=null;
        AtrophyScriptParser.mapInfo_return mapInfo342 =null;


        CommonTree string_literal340_tree=null;
        CommonTree char_literal341_tree=null;
        CommonTree char_literal343_tree=null;
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_mapInfo=new RewriteRuleSubtreeStream(adaptor,"rule mapInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:513:8: ( 'loadMap' '{' mapInfo '}' -> ^( LOADMAP mapInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:514:4: 'loadMap' '{' mapInfo '}'
            {
            string_literal340=(Token)match(input,181,FOLLOW_181_in_loadMap3331);  
            stream_181.add(string_literal340);


            char_literal341=(Token)match(input,233,FOLLOW_233_in_loadMap3333);  
            stream_233.add(char_literal341);


            pushFollow(FOLLOW_mapInfo_in_loadMap3335);
            mapInfo342=mapInfo();

            state._fsp--;

            stream_mapInfo.add(mapInfo342.getTree());

            char_literal343=(Token)match(input,234,FOLLOW_234_in_loadMap3337);  
            stream_234.add(char_literal343);


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
            // 514:30: -> ^( LOADMAP mapInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:514:33: ^( LOADMAP mapInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:517:1: lockDoor : 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.lockDoor_return lockDoor() throws RecognitionException {
        AtrophyScriptParser.lockDoor_return retval = new AtrophyScriptParser.lockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal344=null;
        Token char_literal345=null;
        Token char_literal347=null;
        AtrophyScriptParser.doorInfo_return doorInfo346 =null;


        CommonTree string_literal344_tree=null;
        CommonTree char_literal345_tree=null;
        CommonTree char_literal347_tree=null;
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:517:9: ( 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:518:4: 'lockDoor' '{' doorInfo '}'
            {
            string_literal344=(Token)match(input,182,FOLLOW_182_in_lockDoor3360);  
            stream_182.add(string_literal344);


            char_literal345=(Token)match(input,233,FOLLOW_233_in_lockDoor3362);  
            stream_233.add(char_literal345);


            pushFollow(FOLLOW_doorInfo_in_lockDoor3364);
            doorInfo346=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo346.getTree());

            char_literal347=(Token)match(input,234,FOLLOW_234_in_lockDoor3366);  
            stream_234.add(char_literal347);


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
            // 518:32: -> ^( LOCKDOOR doorInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:518:35: ^( LOCKDOOR doorInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:521:1: unlockDoor : 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.unlockDoor_return unlockDoor() throws RecognitionException {
        AtrophyScriptParser.unlockDoor_return retval = new AtrophyScriptParser.unlockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal348=null;
        Token char_literal349=null;
        Token char_literal351=null;
        AtrophyScriptParser.doorInfo_return doorInfo350 =null;


        CommonTree string_literal348_tree=null;
        CommonTree char_literal349_tree=null;
        CommonTree char_literal351_tree=null;
        RewriteRuleTokenStream stream_226=new RewriteRuleTokenStream(adaptor,"token 226");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:521:11: ( 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:522:4: 'unlockDoor' '{' doorInfo '}'
            {
            string_literal348=(Token)match(input,226,FOLLOW_226_in_unlockDoor3389);  
            stream_226.add(string_literal348);


            char_literal349=(Token)match(input,233,FOLLOW_233_in_unlockDoor3391);  
            stream_233.add(char_literal349);


            pushFollow(FOLLOW_doorInfo_in_unlockDoor3393);
            doorInfo350=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo350.getTree());

            char_literal351=(Token)match(input,234,FOLLOW_234_in_unlockDoor3395);  
            stream_234.add(char_literal351);


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
            // 522:34: -> ^( UNLOCKDOOR doorInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:522:37: ^( UNLOCKDOOR doorInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:525:1: doorInfo : ( isName )* ;
    public final AtrophyScriptParser.doorInfo_return doorInfo() throws RecognitionException {
        AtrophyScriptParser.doorInfo_return retval = new AtrophyScriptParser.doorInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName352 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:525:9: ( ( isName )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:526:4: ( isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:526:4: ( isName )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==173) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:526:4: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_doorInfo3418);
            	    isName352=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName352.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:529:1: addTag : ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) );
    public final AtrophyScriptParser.addTag_return addTag() throws RecognitionException {
        AtrophyScriptParser.addTag_return retval = new AtrophyScriptParser.addTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal353=null;
        Token ADD_TAG_PREFIX355=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral354 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral356 =null;


        CommonTree string_literal353_tree=null;
        CommonTree ADD_TAG_PREFIX355_tree=null;
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_ADD_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token ADD_TAG_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:529:7: ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==147) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:530:4: 'addTag:' stringLiteral
                    {
                    string_literal353=(Token)match(input,147,FOLLOW_147_in_addTag3434);  
                    stream_147.add(string_literal353);


                    pushFollow(FOLLOW_stringLiteral_in_addTag3436);
                    stringLiteral354=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral354.getTree());

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
                    // 530:28: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:530:31: ^( ADDTAG stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:531:6: ADD_TAG_PREFIX stringLiteral
                    {
                    ADD_TAG_PREFIX355=(Token)match(input,ADD_TAG_PREFIX,FOLLOW_ADD_TAG_PREFIX_in_addTag3451);  
                    stream_ADD_TAG_PREFIX.add(ADD_TAG_PREFIX355);


                    pushFollow(FOLLOW_stringLiteral_in_addTag3453);
                    stringLiteral356=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral356.getTree());

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
                    // 531:35: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:531:38: ^( ADDTAG stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:534:1: removeTag : ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) );
    public final AtrophyScriptParser.removeTag_return removeTag() throws RecognitionException {
        AtrophyScriptParser.removeTag_return retval = new AtrophyScriptParser.removeTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal357=null;
        Token REMOVE_TAG_PREFIX359=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral358 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral360 =null;


        CommonTree string_literal357_tree=null;
        CommonTree REMOVE_TAG_PREFIX359_tree=null;
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_REMOVE_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token REMOVE_TAG_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:534:10: ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==198) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:535:4: 'removeTag:' stringLiteral
                    {
                    string_literal357=(Token)match(input,198,FOLLOW_198_in_removeTag3476);  
                    stream_198.add(string_literal357);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag3478);
                    stringLiteral358=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral358.getTree());

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
                    // 535:31: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:535:34: ^( REMOVETAG stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:536:6: REMOVE_TAG_PREFIX stringLiteral
                    {
                    REMOVE_TAG_PREFIX359=(Token)match(input,REMOVE_TAG_PREFIX,FOLLOW_REMOVE_TAG_PREFIX_in_removeTag3493);  
                    stream_REMOVE_TAG_PREFIX.add(REMOVE_TAG_PREFIX359);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag3495);
                    stringLiteral360=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral360.getTree());

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
                    // 536:38: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:536:41: ^( REMOVETAG stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:539:1: directorBias : 'directorBias:' -> ^( DIRECTORBIAS ) ;
    public final AtrophyScriptParser.directorBias_return directorBias() throws RecognitionException {
        AtrophyScriptParser.directorBias_return retval = new AtrophyScriptParser.directorBias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal361=null;

        CommonTree string_literal361_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:539:13: ( 'directorBias:' -> ^( DIRECTORBIAS ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:540:4: 'directorBias:'
            {
            string_literal361=(Token)match(input,161,FOLLOW_161_in_directorBias3518);  
            stream_161.add(string_literal361);


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
            // 540:20: -> ^( DIRECTORBIAS )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:540:23: ^( DIRECTORBIAS )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:543:1: changeAiNode : 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}' -> ^( CHANGEAINODE unitInfo aiNodeOptions ) ;
    public final AtrophyScriptParser.changeAiNode_return changeAiNode() throws RecognitionException {
        AtrophyScriptParser.changeAiNode_return retval = new AtrophyScriptParser.changeAiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal362=null;
        Token char_literal363=null;
        Token char_literal364=null;
        Token char_literal366=null;
        Token char_literal367=null;
        Token char_literal369=null;
        Token char_literal370=null;
        AtrophyScriptParser.unitInfo_return unitInfo365 =null;

        AtrophyScriptParser.aiNodeOptions_return aiNodeOptions368 =null;


        CommonTree string_literal362_tree=null;
        CommonTree char_literal363_tree=null;
        CommonTree char_literal364_tree=null;
        CommonTree char_literal366_tree=null;
        CommonTree char_literal367_tree=null;
        CommonTree char_literal369_tree=null;
        CommonTree char_literal370_tree=null;
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_aiNodeOptions=new RewriteRuleSubtreeStream(adaptor,"rule aiNodeOptions");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:543:13: ( 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}' -> ^( CHANGEAINODE unitInfo aiNodeOptions ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:544:4: 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}'
            {
            string_literal362=(Token)match(input,154,FOLLOW_154_in_changeAiNode3539);  
            stream_154.add(string_literal362);


            char_literal363=(Token)match(input,233,FOLLOW_233_in_changeAiNode3541);  
            stream_233.add(char_literal363);


            char_literal364=(Token)match(input,233,FOLLOW_233_in_changeAiNode3543);  
            stream_233.add(char_literal364);


            pushFollow(FOLLOW_unitInfo_in_changeAiNode3545);
            unitInfo365=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo365.getTree());

            char_literal366=(Token)match(input,234,FOLLOW_234_in_changeAiNode3547);  
            stream_234.add(char_literal366);


            char_literal367=(Token)match(input,233,FOLLOW_233_in_changeAiNode3549);  
            stream_233.add(char_literal367);


            pushFollow(FOLLOW_aiNodeOptions_in_changeAiNode3551);
            aiNodeOptions368=aiNodeOptions();

            state._fsp--;

            stream_aiNodeOptions.add(aiNodeOptions368.getTree());

            char_literal369=(Token)match(input,234,FOLLOW_234_in_changeAiNode3553);  
            stream_234.add(char_literal369);


            char_literal370=(Token)match(input,234,FOLLOW_234_in_changeAiNode3555);  
            stream_234.add(char_literal370);


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
            // 544:66: -> ^( CHANGEAINODE unitInfo aiNodeOptions )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:544:69: ^( CHANGEAINODE unitInfo aiNodeOptions )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:547:1: showMessage : 'showMessage:' stringLiteral -> ^( SHOWMESSAGE stringLiteral ) ;
    public final AtrophyScriptParser.showMessage_return showMessage() throws RecognitionException {
        AtrophyScriptParser.showMessage_return retval = new AtrophyScriptParser.showMessage_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal371=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral372 =null;


        CommonTree string_literal371_tree=null;
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:547:12: ( 'showMessage:' stringLiteral -> ^( SHOWMESSAGE stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:548:4: 'showMessage:' stringLiteral
            {
            string_literal371=(Token)match(input,205,FOLLOW_205_in_showMessage3580);  
            stream_205.add(string_literal371);


            pushFollow(FOLLOW_stringLiteral_in_showMessage3582);
            stringLiteral372=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral372.getTree());

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
            // 548:33: -> ^( SHOWMESSAGE stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:548:36: ^( SHOWMESSAGE stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:551:1: setTriggerRunning : 'setTriggerRunning:' stringLiteral BOOL -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL ) ;
    public final AtrophyScriptParser.setTriggerRunning_return setTriggerRunning() throws RecognitionException {
        AtrophyScriptParser.setTriggerRunning_return retval = new AtrophyScriptParser.setTriggerRunning_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal373=null;
        Token BOOL375=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral374 =null;


        CommonTree string_literal373_tree=null;
        CommonTree BOOL375_tree=null;
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:551:18: ( 'setTriggerRunning:' stringLiteral BOOL -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:552:4: 'setTriggerRunning:' stringLiteral BOOL
            {
            string_literal373=(Token)match(input,204,FOLLOW_204_in_setTriggerRunning3605);  
            stream_204.add(string_literal373);


            pushFollow(FOLLOW_stringLiteral_in_setTriggerRunning3607);
            stringLiteral374=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral374.getTree());

            BOOL375=(Token)match(input,BOOL,FOLLOW_BOOL_in_setTriggerRunning3609);  
            stream_BOOL.add(BOOL375);


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
            // 552:44: -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:552:47: ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SETTRIGGERRUNNING, "SETTRIGGERRUNNING")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:552:67: ^( STRING stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:555:1: spawnItem : 'spawnItem' stringList '{' unitInfo '}' -> ^( SPAWNITEM stringList unitInfo ) ;
    public final AtrophyScriptParser.spawnItem_return spawnItem() throws RecognitionException {
        AtrophyScriptParser.spawnItem_return retval = new AtrophyScriptParser.spawnItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal376=null;
        Token char_literal378=null;
        Token char_literal380=null;
        AtrophyScriptParser.stringList_return stringList377 =null;

        AtrophyScriptParser.unitInfo_return unitInfo379 =null;


        CommonTree string_literal376_tree=null;
        CommonTree char_literal378_tree=null;
        CommonTree char_literal380_tree=null;
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:555:10: ( 'spawnItem' stringList '{' unitInfo '}' -> ^( SPAWNITEM stringList unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:556:4: 'spawnItem' stringList '{' unitInfo '}'
            {
            string_literal376=(Token)match(input,207,FOLLOW_207_in_spawnItem3638);  
            stream_207.add(string_literal376);


            pushFollow(FOLLOW_stringList_in_spawnItem3640);
            stringList377=stringList();

            state._fsp--;

            stream_stringList.add(stringList377.getTree());

            char_literal378=(Token)match(input,233,FOLLOW_233_in_spawnItem3642);  
            stream_233.add(char_literal378);


            pushFollow(FOLLOW_unitInfo_in_spawnItem3644);
            unitInfo379=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo379.getTree());

            char_literal380=(Token)match(input,234,FOLLOW_234_in_spawnItem3646);  
            stream_234.add(char_literal380);


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
            // 556:44: -> ^( SPAWNITEM stringList unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:556:47: ^( SPAWNITEM stringList unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:559:1: spawnTalkNode : 'spawnTalkNode' '{' unitInfo '}' -> ^( SPAWNTALKNODE unitInfo ) ;
    public final AtrophyScriptParser.spawnTalkNode_return spawnTalkNode() throws RecognitionException {
        AtrophyScriptParser.spawnTalkNode_return retval = new AtrophyScriptParser.spawnTalkNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal381=null;
        Token char_literal382=null;
        Token char_literal384=null;
        AtrophyScriptParser.unitInfo_return unitInfo383 =null;


        CommonTree string_literal381_tree=null;
        CommonTree char_literal382_tree=null;
        CommonTree char_literal384_tree=null;
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:559:14: ( 'spawnTalkNode' '{' unitInfo '}' -> ^( SPAWNTALKNODE unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:560:4: 'spawnTalkNode' '{' unitInfo '}'
            {
            string_literal381=(Token)match(input,208,FOLLOW_208_in_spawnTalkNode3671);  
            stream_208.add(string_literal381);


            char_literal382=(Token)match(input,233,FOLLOW_233_in_spawnTalkNode3673);  
            stream_233.add(char_literal382);


            pushFollow(FOLLOW_unitInfo_in_spawnTalkNode3675);
            unitInfo383=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo383.getTree());

            char_literal384=(Token)match(input,234,FOLLOW_234_in_spawnTalkNode3677);  
            stream_234.add(char_literal384);


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
            // 560:37: -> ^( SPAWNTALKNODE unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:560:40: ^( SPAWNTALKNODE unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:563:1: unlockTech : 'unlockTech:' stringList -> ^( UNLOCKTECH stringList ) ;
    public final AtrophyScriptParser.unlockTech_return unlockTech() throws RecognitionException {
        AtrophyScriptParser.unlockTech_return retval = new AtrophyScriptParser.unlockTech_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal385=null;
        AtrophyScriptParser.stringList_return stringList386 =null;


        CommonTree string_literal385_tree=null;
        RewriteRuleTokenStream stream_227=new RewriteRuleTokenStream(adaptor,"token 227");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:563:11: ( 'unlockTech:' stringList -> ^( UNLOCKTECH stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:564:4: 'unlockTech:' stringList
            {
            string_literal385=(Token)match(input,227,FOLLOW_227_in_unlockTech3700);  
            stream_227.add(string_literal385);


            pushFollow(FOLLOW_stringList_in_unlockTech3702);
            stringList386=stringList();

            state._fsp--;

            stream_stringList.add(stringList386.getTree());

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
            // 564:29: -> ^( UNLOCKTECH stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:564:32: ^( UNLOCKTECH stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:567:1: changeStat : ( 'changeAdvance:' ( '-' )? INT -> ^( CHANGEADVANCE ( '-' )? INT ) | 'changeStability:' ( '-' )? INT -> ^( CHANGESTABILITY ( '-' )? INT ) );
    public final AtrophyScriptParser.changeStat_return changeStat() throws RecognitionException {
        AtrophyScriptParser.changeStat_return retval = new AtrophyScriptParser.changeStat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal387=null;
        Token char_literal388=null;
        Token INT389=null;
        Token string_literal390=null;
        Token char_literal391=null;
        Token INT392=null;

        CommonTree string_literal387_tree=null;
        CommonTree char_literal388_tree=null;
        CommonTree INT389_tree=null;
        CommonTree string_literal390_tree=null;
        CommonTree char_literal391_tree=null;
        CommonTree INT392_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:567:11: ( 'changeAdvance:' ( '-' )? INT -> ^( CHANGEADVANCE ( '-' )? INT ) | 'changeStability:' ( '-' )? INT -> ^( CHANGESTABILITY ( '-' )? INT ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==153) ) {
                alt50=1;
            }
            else if ( (LA50_0==155) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:568:4: 'changeAdvance:' ( '-' )? INT
                    {
                    string_literal387=(Token)match(input,153,FOLLOW_153_in_changeStat3725);  
                    stream_153.add(string_literal387);


                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:568:21: ( '-' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==123) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:568:21: '-'
                            {
                            char_literal388=(Token)match(input,123,FOLLOW_123_in_changeStat3727);  
                            stream_123.add(char_literal388);


                            }
                            break;

                    }


                    INT389=(Token)match(input,INT,FOLLOW_INT_in_changeStat3730);  
                    stream_INT.add(INT389);


                    // AST REWRITE
                    // elements: INT, 123
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 568:30: -> ^( CHANGEADVANCE ( '-' )? INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:568:33: ^( CHANGEADVANCE ( '-' )? INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CHANGEADVANCE, "CHANGEADVANCE")
                        , root_1);

                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:568:49: ( '-' )?
                        if ( stream_123.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_123.nextNode()
                            );

                        }
                        stream_123.reset();

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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:569:6: 'changeStability:' ( '-' )? INT
                    {
                    string_literal390=(Token)match(input,155,FOLLOW_155_in_changeStat3748);  
                    stream_155.add(string_literal390);


                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:569:25: ( '-' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==123) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:569:25: '-'
                            {
                            char_literal391=(Token)match(input,123,FOLLOW_123_in_changeStat3750);  
                            stream_123.add(char_literal391);


                            }
                            break;

                    }


                    INT392=(Token)match(input,INT,FOLLOW_INT_in_changeStat3753);  
                    stream_INT.add(INT392);


                    // AST REWRITE
                    // elements: 123, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 569:34: -> ^( CHANGESTABILITY ( '-' )? INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:569:37: ^( CHANGESTABILITY ( '-' )? INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CHANGESTABILITY, "CHANGESTABILITY")
                        , root_1);

                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:569:55: ( '-' )?
                        if ( stream_123.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_123.nextNode()
                            );

                        }
                        stream_123.reset();

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:572:1: sequenceDecl : 'SEQUENCE::' stringLiteral '{' ( ( commandConditional )? commandCallList )* '}' -> ^( SEQUENCE stringLiteral commandCallList ) ;
    public final AtrophyScriptParser.sequenceDecl_return sequenceDecl() throws RecognitionException {
        AtrophyScriptParser.sequenceDecl_return retval = new AtrophyScriptParser.sequenceDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal393=null;
        Token char_literal395=null;
        Token char_literal398=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral394 =null;

        AtrophyScriptParser.commandConditional_return commandConditional396 =null;

        AtrophyScriptParser.commandCallList_return commandCallList397 =null;


        CommonTree string_literal393_tree=null;
        CommonTree char_literal395_tree=null;
        CommonTree char_literal398_tree=null;
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_commandConditional=new RewriteRuleSubtreeStream(adaptor,"rule commandConditional");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_commandCallList=new RewriteRuleSubtreeStream(adaptor,"rule commandCallList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:572:13: ( 'SEQUENCE::' stringLiteral '{' ( ( commandConditional )? commandCallList )* '}' -> ^( SEQUENCE stringLiteral commandCallList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:573:4: 'SEQUENCE::' stringLiteral '{' ( ( commandConditional )? commandCallList )* '}'
            {
            string_literal393=(Token)match(input,141,FOLLOW_141_in_sequenceDecl3779);  
            stream_141.add(string_literal393);


            pushFollow(FOLLOW_stringLiteral_in_sequenceDecl3781);
            stringLiteral394=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral394.getTree());

            char_literal395=(Token)match(input,233,FOLLOW_233_in_sequenceDecl3783);  
            stream_233.add(char_literal395);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:574:4: ( ( commandConditional )? commandCallList )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==COMMAND_CALL_PREFIX||LA52_0==131||LA52_0==133||LA52_0==152) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:574:5: ( commandConditional )? commandCallList
            	    {
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:574:5: ( commandConditional )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==131) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:574:5: commandConditional
            	            {
            	            pushFollow(FOLLOW_commandConditional_in_sequenceDecl3789);
            	            commandConditional396=commandConditional();

            	            state._fsp--;

            	            stream_commandConditional.add(commandConditional396.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_commandCallList_in_sequenceDecl3792);
            	    commandCallList397=commandCallList();

            	    state._fsp--;

            	    stream_commandCallList.add(commandCallList397.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            char_literal398=(Token)match(input,234,FOLLOW_234_in_sequenceDecl3799);  
            stream_234.add(char_literal398);


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
            // 576:4: -> ^( SEQUENCE stringLiteral commandCallList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:577:4: ^( SEQUENCE stringLiteral commandCallList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:580:1: commandConditional : ( 'IF' 'HAS' stringList | 'IF' '!HAS' stringList );
    public final AtrophyScriptParser.commandConditional_return commandConditional() throws RecognitionException {
        AtrophyScriptParser.commandConditional_return retval = new AtrophyScriptParser.commandConditional_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal399=null;
        Token string_literal400=null;
        Token string_literal402=null;
        Token string_literal403=null;
        AtrophyScriptParser.stringList_return stringList401 =null;

        AtrophyScriptParser.stringList_return stringList404 =null;


        CommonTree string_literal399_tree=null;
        CommonTree string_literal400_tree=null;
        CommonTree string_literal402_tree=null;
        CommonTree string_literal403_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:580:19: ( 'IF' 'HAS' stringList | 'IF' '!HAS' stringList )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==131) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==130) ) {
                    alt53=1;
                }
                else if ( (LA53_1==117) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:581:3: 'IF' 'HAS' stringList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal399=(Token)match(input,131,FOLLOW_131_in_commandConditional3829); 
                    string_literal399_tree = 
                    (CommonTree)adaptor.create(string_literal399)
                    ;
                    adaptor.addChild(root_0, string_literal399_tree);


                    string_literal400=(Token)match(input,130,FOLLOW_130_in_commandConditional3830); 
                    string_literal400_tree = 
                    (CommonTree)adaptor.create(string_literal400)
                    ;
                    adaptor.addChild(root_0, string_literal400_tree);


                    pushFollow(FOLLOW_stringList_in_commandConditional3832);
                    stringList401=stringList();

                    state._fsp--;

                    adaptor.addChild(root_0, stringList401.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:582:5: 'IF' '!HAS' stringList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal402=(Token)match(input,131,FOLLOW_131_in_commandConditional3838); 
                    string_literal402_tree = 
                    (CommonTree)adaptor.create(string_literal402)
                    ;
                    adaptor.addChild(root_0, string_literal402_tree);


                    string_literal403=(Token)match(input,117,FOLLOW_117_in_commandConditional3839); 
                    string_literal403_tree = 
                    (CommonTree)adaptor.create(string_literal403)
                    ;
                    adaptor.addChild(root_0, string_literal403_tree);


                    pushFollow(FOLLOW_stringList_in_commandConditional3841);
                    stringList404=stringList();

                    state._fsp--;

                    adaptor.addChild(root_0, stringList404.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:585:1: commandCallList : commandCall ( ',' ! commandCall )* ;
    public final AtrophyScriptParser.commandCallList_return commandCallList() throws RecognitionException {
        AtrophyScriptParser.commandCallList_return retval = new AtrophyScriptParser.commandCallList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal406=null;
        AtrophyScriptParser.commandCall_return commandCall405 =null;

        AtrophyScriptParser.commandCall_return commandCall407 =null;


        CommonTree char_literal406_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:585:16: ( commandCall ( ',' ! commandCall )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:586:4: commandCall ( ',' ! commandCall )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_commandCall_in_commandCallList3854);
            commandCall405=commandCall();

            state._fsp--;

            adaptor.addChild(root_0, commandCall405.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:586:16: ( ',' ! commandCall )*
            loop54:
            do {
                int alt54=2;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:586:17: ',' ! commandCall
            	    {
            	    char_literal406=(Token)match(input,122,FOLLOW_122_in_commandCallList3857); 

            	    pushFollow(FOLLOW_commandCall_in_commandCallList3860);
            	    commandCall407=commandCall();

            	    state._fsp--;

            	    adaptor.addChild(root_0, commandCall407.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:589:1: commandCall : ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) | atCall );
    public final AtrophyScriptParser.commandCall_return commandCall() throws RecognitionException {
        AtrophyScriptParser.commandCall_return retval = new AtrophyScriptParser.commandCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal408=null;
        Token COMMAND_CALL_PREFIX410=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral409 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral411 =null;

        AtrophyScriptParser.atCall_return atCall412 =null;


        CommonTree string_literal408_tree=null;
        CommonTree COMMAND_CALL_PREFIX410_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_COMMAND_CALL_PREFIX=new RewriteRuleTokenStream(adaptor,"token COMMAND_CALL_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:589:12: ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) | atCall )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 152:
                {
                alt55=1;
                }
                break;
            case COMMAND_CALL_PREFIX:
                {
                alt55=2;
                }
                break;
            case 133:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:590:4: 'callCommand:' stringLiteral
                    {
                    string_literal408=(Token)match(input,152,FOLLOW_152_in_commandCall3877);  
                    stream_152.add(string_literal408);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall3879);
                    stringLiteral409=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral409.getTree());

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
                    // 590:33: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:590:36: ^( COMMAND_CALL stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:591:6: COMMAND_CALL_PREFIX stringLiteral
                    {
                    COMMAND_CALL_PREFIX410=(Token)match(input,COMMAND_CALL_PREFIX,FOLLOW_COMMAND_CALL_PREFIX_in_commandCall3894);  
                    stream_COMMAND_CALL_PREFIX.add(COMMAND_CALL_PREFIX410);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall3896);
                    stringLiteral411=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral411.getTree());

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
                    // 591:40: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:591:43: ^( COMMAND_CALL stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:592:6: atCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atCall_in_commandCall3911);
                    atCall412=atCall();

                    state._fsp--;

                    adaptor.addChild(root_0, atCall412.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:595:1: atCall : ( 'LOAD' 'MODULE' stringList '@' s2= stringLiteral -> ^( ATCALL_MODULE stringList $s2) | 'LOAD' 'SEQUENCE' stringList '@' s2= stringLiteral -> ^( ATCALL_SEQUENCE stringList $s2) );
    public final AtrophyScriptParser.atCall_return atCall() throws RecognitionException {
        AtrophyScriptParser.atCall_return retval = new AtrophyScriptParser.atCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal413=null;
        Token string_literal414=null;
        Token char_literal416=null;
        Token string_literal417=null;
        Token string_literal418=null;
        Token char_literal420=null;
        AtrophyScriptParser.stringLiteral_return s2 =null;

        AtrophyScriptParser.stringList_return stringList415 =null;

        AtrophyScriptParser.stringList_return stringList419 =null;


        CommonTree string_literal413_tree=null;
        CommonTree string_literal414_tree=null;
        CommonTree char_literal416_tree=null;
        CommonTree string_literal417_tree=null;
        CommonTree string_literal418_tree=null;
        CommonTree char_literal420_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:595:7: ( 'LOAD' 'MODULE' stringList '@' s2= stringLiteral -> ^( ATCALL_MODULE stringList $s2) | 'LOAD' 'SEQUENCE' stringList '@' s2= stringLiteral -> ^( ATCALL_SEQUENCE stringList $s2) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==133) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==136) ) {
                    alt56=1;
                }
                else if ( (LA56_1==140) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:596:4: 'LOAD' 'MODULE' stringList '@' s2= stringLiteral
                    {
                    string_literal413=(Token)match(input,133,FOLLOW_133_in_atCall3926);  
                    stream_133.add(string_literal413);


                    string_literal414=(Token)match(input,136,FOLLOW_136_in_atCall3928);  
                    stream_136.add(string_literal414);


                    pushFollow(FOLLOW_stringList_in_atCall3930);
                    stringList415=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList415.getTree());

                    char_literal416=(Token)match(input,125,FOLLOW_125_in_atCall3932);  
                    stream_125.add(char_literal416);


                    pushFollow(FOLLOW_stringLiteral_in_atCall3936);
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
                    // 596:52: -> ^( ATCALL_MODULE stringList $s2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:596:55: ^( ATCALL_MODULE stringList $s2)
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:597:6: 'LOAD' 'SEQUENCE' stringList '@' s2= stringLiteral
                    {
                    string_literal417=(Token)match(input,133,FOLLOW_133_in_atCall3954);  
                    stream_133.add(string_literal417);


                    string_literal418=(Token)match(input,140,FOLLOW_140_in_atCall3956);  
                    stream_140.add(string_literal418);


                    pushFollow(FOLLOW_stringList_in_atCall3958);
                    stringList419=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList419.getTree());

                    char_literal420=(Token)match(input,125,FOLLOW_125_in_atCall3960);  
                    stream_125.add(char_literal420);


                    pushFollow(FOLLOW_stringLiteral_in_atCall3964);
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
                    // 597:56: -> ^( ATCALL_SEQUENCE stringList $s2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:597:59: ^( ATCALL_SEQUENCE stringList $s2)
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:600:1: stringLiteral : '\"' ! ( . )* '\"' !;
    public final AtrophyScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        AtrophyScriptParser.stringLiteral_return retval = new AtrophyScriptParser.stringLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal421=null;
        Token wildcard422=null;
        Token char_literal423=null;

        CommonTree char_literal421_tree=null;
        CommonTree wildcard422_tree=null;
        CommonTree char_literal423_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:600:14: ( '\"' ! ( . )* '\"' !)
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:601:4: '\"' ! ( . )* '\"' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal421=(Token)match(input,118,FOLLOW_118_in_stringLiteral3992); 

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:601:9: ( . )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==118) ) {
                    alt57=2;
                }
                else if ( ((LA57_0 >= ADDTAG && LA57_0 <= 117)||(LA57_0 >= 119 && LA57_0 <= 234)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:601:9: .
            	    {
            	    wildcard422=(Token)input.LT(1);

            	    matchAny(input); 
            	    wildcard422_tree = (CommonTree)adaptor.create(wildcard422);
            	    adaptor.addChild(root_0, wildcard422_tree);


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            char_literal423=(Token)match(input,118,FOLLOW_118_in_stringLiteral3998); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
        "\1\23\1\5\1\uffff\2\166\1\u0088\2\4\2\166\1\uffff\1\4\1\uffff\25"+
        "\4\1\uffff\7\4\1\uffff\3\4\2\uffff\2\4\3\uffff\3\4\1\uffff\3\4\4"+
        "\uffff";
    static final String DFA54_maxS =
        "\1\u00ea\1\u00e4\1\uffff\2\166\1\u008c\2\u00ea\2\166\1\uffff\1\u00ea"+
        "\1\uffff\25\u00ea\1\uffff\7\u00ea\1\uffff\3\u00ea\2\uffff\2\u00ea"+
        "\3\uffff\3\u00ea\1\uffff\3\u00ea\4\uffff";
    static final String DFA54_acceptS =
        "\2\uffff\1\2\7\uffff\1\1\1\uffff\1\1\25\uffff\1\1\7\uffff\1\1\3"+
        "\uffff\2\1\2\uffff\3\1\3\uffff\1\1\3\uffff\4\1";
    static final String DFA54_specialS =
        "\100\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\2\146\uffff\1\1\10\uffff\1\2\1\uffff\1\2\22\uffff\1\2\121"+
            "\uffff\1\2",
            "\1\2\15\uffff\1\4\66\uffff\1\2\42\uffff\1\2\27\uffff\1\5\15"+
            "\uffff\1\2\4\uffff\1\3\3\2\2\uffff\1\2\2\uffff\1\2\20\uffff"+
            "\1\2\2\uffff\2\2\16\uffff\3\2\2\uffff\1\2\1\uffff\6\2\10\uffff"+
            "\1\2\7\uffff\3\2",
            "",
            "\1\6",
            "\1\7",
            "\1\10\3\uffff\1\11",
            "\162\13\1\12\164\13",
            "\162\15\1\14\164\15",
            "\1\16",
            "\1\17",
            "",
            "\162\13\1\12\164\13",
            "",
            "\162\15\1\14\164\15",
            "\162\21\1\20\164\21",
            "\162\23\1\22\164\23",
            "\162\21\1\20\3\21\1\24\2\21\1\25\155\21",
            "\162\21\1\20\164\21",
            "\162\23\1\22\3\23\1\26\2\23\1\27\155\23",
            "\162\23\1\22\164\23",
            "\162\21\1\30\164\21",
            "\162\21\1\31\164\21",
            "\162\23\1\32\164\23",
            "\162\23\1\33\164\23",
            "\162\37\1\36\3\37\1\34\2\37\1\35\155\37",
            "\162\43\1\42\3\43\1\40\2\43\1\41\155\43",
            "\162\47\1\46\3\47\1\44\2\47\1\45\155\47",
            "\162\53\1\52\3\53\1\50\2\53\1\51\155\53",
            "\162\37\1\54\164\37",
            "\162\37\1\55\164\37",
            "\162\37\1\36\3\37\1\34\2\37\1\35\155\37",
            "\162\37\1\36\164\37",
            "\162\43\1\56\164\43",
            "\162\43\1\57\164\43",
            "",
            "\162\43\1\42\164\43",
            "\162\47\1\60\164\47",
            "\162\47\1\61\164\47",
            "\162\47\1\46\3\47\1\44\2\47\1\45\155\47",
            "\162\47\1\46\164\47",
            "\162\53\1\62\164\53",
            "\162\53\1\63\164\53",
            "",
            "\162\53\1\52\164\53",
            "\162\37\1\36\3\37\1\34\2\37\1\35\155\37",
            "\162\67\1\64\3\67\1\65\2\67\1\66\155\67",
            "",
            "",
            "\162\47\1\46\3\47\1\44\2\47\1\45\155\47",
            "\162\73\1\70\3\73\1\71\2\73\1\72\155\73",
            "",
            "",
            "",
            "\162\67\1\74\164\67",
            "\162\67\1\75\164\67",
            "\162\67\1\64\164\67",
            "",
            "\162\73\1\76\164\73",
            "\162\73\1\77\164\73",
            "\162\73\1\70\164\73",
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
            return "()* loopback of 586:16: ( ',' ! commandCall )*";
        }
    }
 

    public static final BitSet FOLLOW_sequenceDecl_in_prog468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_moduleDecl_in_prog472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_EOF_in_prog480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_moduleDecl496 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_moduleDecl498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_moduleDecl500 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x01800000108388D1L,0x00000400B0800008L});
    public static final BitSet FOLLOW_command_in_moduleDecl506 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x01800000108388D1L,0x00000400B0800008L});
    public static final BitSet FOLLOW_234_in_moduleDecl512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSize_in_command537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSpawns_in_command544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemSpawns_in_command551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockDecl_in_command558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portalDecl_in_command565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textureBlockDecl_in_command572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerDecl_in_command579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandDecl_in_command586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_talkDecl_in_command593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_requiredAssignment606 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_requiredAssignment608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requiredAssignment_in_varAssignment632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_mapSize659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_183_in_mapSize663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_mapSize666 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_mapSize668 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_mapSize670 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_mapSize672 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_mapSize674 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_mapSize676 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_mapSize678 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_mapSize680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_mapSize682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_mapSpawns707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_184_in_mapSpawns711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_mapSpawns714 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_stringList_in_mapSpawns716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_mapSpawns719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_itemSpawns743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_itemSpawns745 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawns747 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_itemSpawns749 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawns751 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_itemSpawns753 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawns755 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_itemSpawns757 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawns759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_itemSpawns761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_blockDecl786 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_151_in_blockDecl790 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_varAssignment_in_blockDecl793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_blockDecl795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xD008000080144002L,0x000005C34B5C0607L});
    public static final BitSet FOLLOW_properties_in_blockDecl797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_blockDecl799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_portalDecl825 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_195_in_portalDecl829 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_varAssignment_in_portalDecl832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_portalDecl834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xD008000080144002L,0x000005C34B5C0607L});
    public static final BitSet FOLLOW_properties_in_portalDecl836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_portalDecl838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_textureBlockDecl864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_221_in_textureBlockDecl868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_220_in_textureBlockDecl872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_textureBlockDecl875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xD008000080144002L,0x000005C34B5C0607L});
    public static final BitSet FOLLOW_properties_in_textureBlockDecl877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_textureBlockDecl879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_triggerDecl903 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_223_in_triggerDecl907 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_triggerDecl910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_triggerDecl912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xD008000080144002L,0x000005C34B5C0607L});
    public static final BitSet FOLLOW_properties_in_triggerDecl914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_triggerDecl916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_commandDecl942 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_156_in_commandDecl946 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_commandDecl949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_commandDecl951 = new BitSet(new long[]{0x0000000000080020L,0x0000200000000400L,0x006400024F080020L,0x0000001C0403F4E0L});
    public static final BitSet FOLLOW_triggerEffectList_in_commandDecl953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_commandDecl955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_talkDecl985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_215_in_talkDecl989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_talkDecl992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xD008000080144002L,0x000005C34B5C0607L});
    public static final BitSet FOLLOW_properties_in_talkDecl994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_talkDecl996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xListProperty_in_properties1020 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_yListProperty_in_properties1027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_factionTerritoryProperty_in_properties1034 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_factionZoneProperty_in_properties1041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_saferoomProperty_in_properties1048 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_stageProperty_in_properties1055 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_stageDeclProperty_in_properties1062 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_talkMapParentProperty_in_properties1069 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_aiInitProperty_in_properties1076 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_openingLineProperty_in_properties1083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_optionProperty_in_properties1090 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_topicProperty_in_properties1097 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_triggerCondProperty_in_properties1104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_triggerEffectProperty_in_properties1111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_coverDecl_in_properties1118 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_stashDecl_in_properties1125 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xD008000080144002L,0x000001C34B5C0607L});
    public static final BitSet FOLLOW_230_in_xListProperty1142 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty1144 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_xListProperty1147 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty1148 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_231_in_yListProperty1172 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty1174 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_yListProperty1177 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty1178 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_219_in_factionTerritoryProperty1204 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_factionTerritoryProperty1206 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_factionTerritoryProperty1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_232_in_factionZoneProperty1237 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_factionZoneProperty1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_saferoomProperty1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_stageDeclProperty1283 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1285 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_stageDeclProperty1288 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1290 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_194_in_talkMapParentProperty1317 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_193_in_talkMapParentProperty1321 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_talkMapParentProperty1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_stageProperty1348 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_201_in_stageProperty1352 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_stageProperty1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_aiInitProperty1379 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_146_in_aiInitProperty1383 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOL_in_aiInitProperty1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_openingLineProperty1410 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_190_in_openingLineProperty1414 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_191_in_openingLineProperty1418 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_openingLineProperty1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_optionProperty1443 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_192_in_optionProperty1447 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_optionProperty1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_topicProperty1474 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_222_in_topicProperty1478 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_requiredAssignment_in_topicProperty1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_topicProperty1483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000040000000100L});
    public static final BitSet FOLLOW_topicProperties_in_topicProperty1485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_topicProperty1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topicLine_in_topicProperties1514 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_topicRequiement_in_topicProperties1518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_180_in_topicLine1535 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_topicLine1536 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_topicLine1539 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_topicLine1541 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_200_in_topicRequiement1567 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000001L});
    public static final BitSet FOLLOW_reqString_in_topicRequiement1569 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_topicRequiement1572 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000001L});
    public static final BitSet FOLLOW_reqString_in_topicRequiement1574 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_NOT_PREFIX_in_reqString1600 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_reqString1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_reqString1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_aliveQuery1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_aliveQuery1634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A03F7E100200000L,0x0000040000200000L});
    public static final BitSet FOLLOW_unitInfo_in_aliveQuery1636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_aliveQuery1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_roomQuery1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_roomQuery1663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A03F7E100200000L,0x0000040000200000L});
    public static final BitSet FOLLOW_unitInfo_in_roomQuery1665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_roomQuery1667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_roomQuery1669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200020000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_roomQuery1671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_roomQuery1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_timeQuery1707 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_164_in_timeQuery1715 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_timeQuery1737 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_boolQuery1781 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000001L,0x2000088000000000L});
    public static final BitSet FOLLOW_queryLogic_in_boolQuery1784 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_boolQuery1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aliveQuery_in_boolQuery1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roomQuery_in_boolQuery1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeQuery_in_boolQuery1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolQuery_in_queryNegation1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_PREFIX_in_queryNegation1824 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x2000088000000000L});
    public static final BitSet FOLLOW_boolQuery_in_queryNegation1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1850 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_126_in_queryLogic1855 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000001L,0x2000088000000000L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_queryLogic1876 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000001L,0x2000088000000000L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_triggerCondProperty1920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_224_in_triggerCondProperty1924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_triggerCondProperty1927 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000001L,0x2000088000000000L});
    public static final BitSet FOLLOW_queryLogic_in_triggerCondProperty1929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_triggerCondProperty1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_triggerEffectProperty1953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_225_in_triggerEffectProperty1957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_triggerEffectProperty1960 = new BitSet(new long[]{0x0000000000080020L,0x0000200000000400L,0x006400024F080020L,0x0000001C0403F4E0L});
    public static final BitSet FOLLOW_triggerEffectList_in_triggerEffectProperty1962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_triggerEffectProperty1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_coverDecl1988 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_159_in_coverDecl1992 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_varAssignment_in_coverDecl1995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_coverDecl1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xD008000080144002L,0x000005C34B5C0607L});
    public static final BitSet FOLLOW_properties_in_coverDecl1999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_coverDecl2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_stashDecl2027 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_212_in_stashDecl2031 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_varAssignment_in_stashDecl2034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_stashDecl2036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xD008000080144002L,0x000005C34B5C0607L});
    public static final BitSet FOLLOW_properties_in_stashDecl2038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_stashDecl2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList2063 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_triggerEffectList2066 = new BitSet(new long[]{0x0000000000080020L,0x0000200000000400L,0x006400024F080020L,0x0000001C0403F4E0L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList2069 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_updateTalkTree_in_triggerEffect2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnTeam_in_triggerEffect2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnCharacter_in_triggerEffect2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeUnit_in_triggerEffect2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_killUnit_in_triggerEffect2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_teleportUnit_in_triggerEffect2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_converseUnit_in_triggerEffect2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createSaferoom_in_triggerEffect2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeSaferoom_in_triggerEffect2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loadMap_in_triggerEffect2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lockDoor_in_triggerEffect2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlockDoor_in_triggerEffect2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addTag_in_triggerEffect2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeTag_in_triggerEffect2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directorBias_in_triggerEffect2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeAiNode_in_triggerEffect2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showMessage_in_triggerEffect2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setTriggerRunning_in_triggerEffect2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnItem_in_triggerEffect2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnTalkNode_in_triggerEffect2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlockTech_in_triggerEffect2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeStat_in_triggerEffect2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCallList_in_triggerEffect2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_228_in_updateTalkTree2253 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree2255 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree2274 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree2276 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_updateTalkTree2278 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_isName2305 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_isName2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_isFaction2330 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_isFaction2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_isRoom2355 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_isRoom2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_hasItem2380 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_hasItem2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_hasWeapon2405 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_hasWeapon2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList2430 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_stringList2433 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList2435 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_167_in_isAlive2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_isDead2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_isInvestigated2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_isNotInvestigated2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_isDaemon2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_isNotDaemon2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_teleDestination2583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_teleDestination2585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_xListProperty_in_teleDestination2587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_yListProperty_in_teleDestination2589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_teleDestination2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_maxTeamSize2616 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_maxTeamSize2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_minTeamSize2639 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_minTeamSize2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_isPlayer2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_aiNode2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_aiNode2687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L,0x0000040000200010L});
    public static final BitSet FOLLOW_aiNodeOptions_in_aiNode2689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_aiNode2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subscribeTalkMaps_in_aiNodeOptions2714 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L,0x0000000000200010L});
    public static final BitSet FOLLOW_behaviours_in_aiNodeOptions2719 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L,0x0000000000200010L});
    public static final BitSet FOLLOW_aiNodePriority_in_aiNodeOptions2724 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L,0x0000000000200010L});
    public static final BitSet FOLLOW_213_in_subscribeTalkMaps2741 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_subscribeTalkMaps2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_behaviours2765 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_behaviours2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_aiNodePriority2790 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_aiNodePriority2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_unitInfo2816 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_isFaction_in_unitInfo2823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_isRoom_in_unitInfo2830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_hasItem_in_unitInfo2837 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_hasWeapon_in_unitInfo2844 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_isAlive_in_unitInfo2851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_isDead_in_unitInfo2858 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_isInvestigated_in_unitInfo2865 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_isNotInvestigated_in_unitInfo2872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_isDaemon_in_unitInfo2879 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_isNotDaemon_in_unitInfo2886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_teleDestination_in_unitInfo2893 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_maxTeamSize_in_unitInfo2900 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_minTeamSize_in_unitInfo2907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_subscribeTalkMaps_in_unitInfo2914 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aiNode_in_unitInfo2921 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_isPlayer_in_unitInfo2928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0A03F7E100200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_209_in_spawnTeam2947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_spawnTeam2949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A03F7E100200000L,0x0000040000200000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnTeam2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_spawnTeam2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_spawnCharacter2976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_spawnCharacter2978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A03F7E100200000L,0x0000040000200000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnCharacter2980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_spawnCharacter2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_removeUnit3005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_removeUnit3007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A03F7E100200000L,0x0000040000200000L});
    public static final BitSet FOLLOW_unitInfo_in_removeUnit3009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_removeUnit3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_killUnit3034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_killUnit3036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A03F7E100200000L,0x0000040000200000L});
    public static final BitSet FOLLOW_unitInfo_in_killUnit3038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_killUnit3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_218_in_teleportUnit3063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_teleportUnit3065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A03F7E100200000L,0x0000040000200000L});
    public static final BitSet FOLLOW_unitInfo_in_teleportUnit3067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_teleportUnit3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_converseUnit3092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_converseUnit3094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A03F7E100200000L,0x0000040000200000L});
    public static final BitSet FOLLOW_unitInfo_in_converseUnit3096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_converseUnit3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_createSaferoom3121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_createSaferoom3123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200020000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_createSaferoom3125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_createSaferoom3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_removeSaferoom3150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_removeSaferoom3152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200020000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_removeSaferoom3154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_removeSaferoom3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_containsFaction3179 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_containsFaction3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsFaction_in_saferoomInfo3205 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200020000000L});
    public static final BitSet FOLLOW_isName_in_saferoomInfo3212 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200020000000L});
    public static final BitSet FOLLOW_isName_in_mapInfo3230 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400240400000000L,0x0000002000000800L});
    public static final BitSet FOLLOW_isFaction_in_mapInfo3234 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400240400000000L,0x0000002000000800L});
    public static final BitSet FOLLOW_itemSpawnChance_in_mapInfo3238 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400240400000000L,0x0000002000000800L});
    public static final BitSet FOLLOW_162_in_itemSpawnChance3255 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_itemSpawnChance3272 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_229_in_itemSpawnChance3289 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_itemSpawnChance3306 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_loadMap3331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_loadMap3333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400240400000000L,0x0000042000000800L});
    public static final BitSet FOLLOW_mapInfo_in_loadMap3335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_loadMap3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_lockDoor3360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_lockDoor3362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_doorInfo_in_lockDoor3364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_lockDoor3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_226_in_unlockDoor3389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_unlockDoor3391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_doorInfo_in_unlockDoor3393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_unlockDoor3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_doorInfo3418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_147_in_addTag3434 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_TAG_PREFIX_in_addTag3451 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_removeTag3476 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_TAG_PREFIX_in_removeTag3493 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_directorBias3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_changeAiNode3539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_changeAiNode3541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_changeAiNode3543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A03F7E100200000L,0x0000040000200000L});
    public static final BitSet FOLLOW_unitInfo_in_changeAiNode3545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_changeAiNode3547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_changeAiNode3549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L,0x0000040000200010L});
    public static final BitSet FOLLOW_aiNodeOptions_in_changeAiNode3551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_changeAiNode3553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_changeAiNode3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_showMessage3580 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_showMessage3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_setTriggerRunning3605 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_setTriggerRunning3607 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOL_in_setTriggerRunning3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_spawnItem3638 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_spawnItem3640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_spawnItem3642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A03F7E100200000L,0x0000040000200000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnItem3644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_spawnItem3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_spawnTalkNode3671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_spawnTalkNode3673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0A03F7E100200000L,0x0000040000200000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnTalkNode3675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_spawnTalkNode3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_unlockTech3700 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_unlockTech3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_changeStat3725 = new BitSet(new long[]{0x0000002000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_changeStat3727 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_changeStat3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_changeStat3748 = new BitSet(new long[]{0x0000002000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_changeStat3750 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_changeStat3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_sequenceDecl3779 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_sequenceDecl3781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_233_in_sequenceDecl3783 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000001000028L,0x0000040000000000L});
    public static final BitSet FOLLOW_commandConditional_in_sequenceDecl3789 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000001000020L});
    public static final BitSet FOLLOW_commandCallList_in_sequenceDecl3792 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000001000028L,0x0000040000000000L});
    public static final BitSet FOLLOW_234_in_sequenceDecl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_commandConditional3829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_commandConditional3830 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_commandConditional3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_commandConditional3838 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_commandConditional3839 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_commandConditional3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList3854 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_commandCallList3857 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000001000020L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList3860 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_152_in_commandCall3877 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_CALL_PREFIX_in_commandCall3894 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atCall_in_commandCall3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_atCall3926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_atCall3928 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_atCall3930 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_atCall3932 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_atCall3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_atCall3954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_atCall3956 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringList_in_atCall3958 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_atCall3960 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_stringLiteral_in_atCall3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_stringLiteral3992 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x000007FFFFFFFFFFL});
    public static final BitSet FOLLOW_118_in_stringLiteral3998 = new BitSet(new long[]{0x0000000000000002L});

}