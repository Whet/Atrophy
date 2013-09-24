// $ANTLR 3.4 C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g 2013-09-24 15:24:04

	package atrophy.combat.level;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AtrophyScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDTAG", "ADD_TAG_PREFIX", "AIINIT", "AINODE", "AND", "ATCALL_MODULE", "ATCALL_SEQUENCE", "BEHAVIOUR", "BLOCK", "BOOL", "CHANGEADVANCE", "CHANGEAINODE", "CHANGESTABILITY", "COMMAND", "COMMAND_CALL", "COMMAND_CALL_PREFIX", "COMMENT", "CONDITIONAL", "CONTAINSFACTION", "CONVERSE", "COVER", "DIRECTORBIAS", "DOORNAMES", "EMPTY", "ENG", "ESC", "ESUPPLY", "EXPIREREPEATS", "EXPIRETIME", "HASITEM", "HASWEAPON", "IDENT", "IF", "INIT", "INROOM", "INT", "ISALIVE", "ISDAEMON", "ISDEAD", "ISFACTION", "ISINROOM", "ISINVESTIGATED", "ISNAME", "ISNOTDAEMON", "ISNOTINVESTIGATED", "ISPLAYER", "ISROOM", "ITEMSPAWNS", "KILLUNIT", "LINE", "LOADMAP", "LOCKDOOR", "LOGIC", "MAPSIZE", "MAPSPAWNS", "MAXTEAMSIZE", "MED", "MINTEAMSIZE", "MODULE", "MSUPPLY", "MULTILINE_COMMENT", "NEGATION", "NOTIF", "NOT_PREFIX", "ONTIME", "OPENINGLINE", "OPTION", "OR", "PORTAL", "PRIORITY", "REMOVEITEM", "REMOVESAFEROOM", "REMOVETAG", "REMOVEUNIT", "REMOVE_TAG_PREFIX", "REQ", "ROOMINFO", "SAFEROOM", "SCI", "SECTOR", "SEQUENCE", "SETTRIGGERRUNNING", "SHOWMESSAGE", "SPAWNCHARACTER", "SPAWNITEM", "SPAWNTALKNODE", "SPAWNTEAM", "SSUPPLY", "STAGELIST", "STASH", "STRING", "SUBSCRIBE", "TALK", "TALKMAP", "TALKPARENT", "TALKSTAGE", "TELEDEST", "TELEPORT", "TERRITORY", "TEXTURE", "TEXTUREBLOCK", "TOPIC", "TRIGGER", "TRIGGERCOND", "TRIGGEREFFECT", "TRIGGERTYPE", "UNITINFO", "UNLOCKDOOR", "UNLOCKTECH", "UPDATETALK", "UPDATE_TREE_PREFIX", "VAR", "WEP", "WS", "WSUPPLY", "XLIST", "YLIST", "ZONE", "'!HAS'", "'#'", "'('", "')'", "','", "'-'", "':'", "'::'", "'@'", "'AND'", "'BLOCK'", "'COMMAND'", "'COVER'", "'HAS'", "'IF'", "'ITEMSPAWNS'", "'LOAD'", "'MAPSIZE'", "'MAPSPAWNS'", "'MODULE'", "'MODULE::'", "'OR'", "'PORTAL'", "'SEQUENCE'", "'SEQUENCE::'", "'STASH'", "'TALK'", "'TRIGGER'", "'a:'", "'addTag:'", "'aiInit:'", "'aiNode'", "'behaviours:'", "'block'", "'callCommand:'", "'changeAdvance:'", "'changeAiNode'", "'changeStability:'", "'command'", "'containsFaction:'", "'converse'", "'cover'", "'destination'", "'directorBias'", "'engChance:'", "'expireRepeats:'", "'expireTime:'", "'hasItem:'", "'hasWeapon:'", "'isAlive'", "'isDaemon'", "'isDead'", "'isFaction:'", "'isInRoom'", "'isInvestigated'", "'isName:'", "'isNotDaemon'", "'isNotInvestigated'", "'isPlayer'", "'isRoom:'", "'killUnit'", "'l:'", "'lines:'", "'loadMap'", "'lockDoor'", "'mapsize'", "'mapspawns'", "'maxTeamSize:'", "'medChance:'", "'minTeamSize:'", "'o:'", "'onTime:'", "'opening:'", "'openingLine:'", "'option:'", "'p:'", "'parent:'", "'portal'", "'priority:'", "'removeItem'", "'removeSaferoom'", "'removeTag:'", "'removeUnit'", "'req:'", "'s:'", "'saferoom'", "'sciChance:'", "'sector:'", "'setTriggerRunning:'", "'showMessage:'", "'spawnCharacter'", "'spawnItem'", "'spawnTalkNode'", "'spawnTeam'", "'stage:'", "'stages:'", "'stash'", "'subscribe:'", "'t'", "'talk'", "'tc'", "'te'", "'teleport'", "'territory:'", "'texture'", "'topic'", "'trigger'", "'triggerCond'", "'triggerEffect'", "'unlockDoor'", "'unlockTech:'", "'updateTalk:'", "'wepChance:'", "'x:'", "'y:'", "'zone:'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__235=235;
    public static final int T__236=236;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int T__239=239;
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
    public static final int ESC=29;
    public static final int ESUPPLY=30;
    public static final int EXPIREREPEATS=31;
    public static final int EXPIRETIME=32;
    public static final int HASITEM=33;
    public static final int HASWEAPON=34;
    public static final int IDENT=35;
    public static final int IF=36;
    public static final int INIT=37;
    public static final int INROOM=38;
    public static final int INT=39;
    public static final int ISALIVE=40;
    public static final int ISDAEMON=41;
    public static final int ISDEAD=42;
    public static final int ISFACTION=43;
    public static final int ISINROOM=44;
    public static final int ISINVESTIGATED=45;
    public static final int ISNAME=46;
    public static final int ISNOTDAEMON=47;
    public static final int ISNOTINVESTIGATED=48;
    public static final int ISPLAYER=49;
    public static final int ISROOM=50;
    public static final int ITEMSPAWNS=51;
    public static final int KILLUNIT=52;
    public static final int LINE=53;
    public static final int LOADMAP=54;
    public static final int LOCKDOOR=55;
    public static final int LOGIC=56;
    public static final int MAPSIZE=57;
    public static final int MAPSPAWNS=58;
    public static final int MAXTEAMSIZE=59;
    public static final int MED=60;
    public static final int MINTEAMSIZE=61;
    public static final int MODULE=62;
    public static final int MSUPPLY=63;
    public static final int MULTILINE_COMMENT=64;
    public static final int NEGATION=65;
    public static final int NOTIF=66;
    public static final int NOT_PREFIX=67;
    public static final int ONTIME=68;
    public static final int OPENINGLINE=69;
    public static final int OPTION=70;
    public static final int OR=71;
    public static final int PORTAL=72;
    public static final int PRIORITY=73;
    public static final int REMOVEITEM=74;
    public static final int REMOVESAFEROOM=75;
    public static final int REMOVETAG=76;
    public static final int REMOVEUNIT=77;
    public static final int REMOVE_TAG_PREFIX=78;
    public static final int REQ=79;
    public static final int ROOMINFO=80;
    public static final int SAFEROOM=81;
    public static final int SCI=82;
    public static final int SECTOR=83;
    public static final int SEQUENCE=84;
    public static final int SETTRIGGERRUNNING=85;
    public static final int SHOWMESSAGE=86;
    public static final int SPAWNCHARACTER=87;
    public static final int SPAWNITEM=88;
    public static final int SPAWNTALKNODE=89;
    public static final int SPAWNTEAM=90;
    public static final int SSUPPLY=91;
    public static final int STAGELIST=92;
    public static final int STASH=93;
    public static final int STRING=94;
    public static final int SUBSCRIBE=95;
    public static final int TALK=96;
    public static final int TALKMAP=97;
    public static final int TALKPARENT=98;
    public static final int TALKSTAGE=99;
    public static final int TELEDEST=100;
    public static final int TELEPORT=101;
    public static final int TERRITORY=102;
    public static final int TEXTURE=103;
    public static final int TEXTUREBLOCK=104;
    public static final int TOPIC=105;
    public static final int TRIGGER=106;
    public static final int TRIGGERCOND=107;
    public static final int TRIGGEREFFECT=108;
    public static final int TRIGGERTYPE=109;
    public static final int UNITINFO=110;
    public static final int UNLOCKDOOR=111;
    public static final int UNLOCKTECH=112;
    public static final int UPDATETALK=113;
    public static final int UPDATE_TREE_PREFIX=114;
    public static final int VAR=115;
    public static final int WEP=116;
    public static final int WS=117;
    public static final int WSUPPLY=118;
    public static final int XLIST=119;
    public static final int YLIST=120;
    public static final int ZONE=121;

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:122:1: prog : ( sequenceDecl | moduleDecl )* EOF ;
    public final AtrophyScriptParser.prog_return prog() throws RecognitionException {
        AtrophyScriptParser.prog_return retval = new AtrophyScriptParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        AtrophyScriptParser.sequenceDecl_return sequenceDecl1 =null;

        AtrophyScriptParser.moduleDecl_return moduleDecl2 =null;


        CommonTree EOF3_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:122:5: ( ( sequenceDecl | moduleDecl )* EOF )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:5: ( sequenceDecl | moduleDecl )* EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:5: ( sequenceDecl | moduleDecl )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==146) ) {
                    alt1=1;
                }
                else if ( (LA1_0==142) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:6: sequenceDecl
            	    {
            	    pushFollow(FOLLOW_sequenceDecl_in_prog484);
            	    sequenceDecl1=sequenceDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sequenceDecl1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:123:21: moduleDecl
            	    {
            	    pushFollow(FOLLOW_moduleDecl_in_prog488);
            	    moduleDecl2=moduleDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, moduleDecl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog496); 
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:1: moduleDecl : 'MODULE::' stringLiteral '{' ( command )* '}' -> ^( MODULE stringLiteral ( command )* ) ;
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
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:127:11: ( 'MODULE::' stringLiteral '{' ( command )* '}' -> ^( MODULE stringLiteral ( command )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:128:4: 'MODULE::' stringLiteral '{' ( command )* '}'
            {
            string_literal4=(Token)match(input,142,FOLLOW_142_in_moduleDecl512);  
            stream_142.add(string_literal4);


            pushFollow(FOLLOW_stringLiteral_in_moduleDecl514);
            stringLiteral5=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral5.getTree());

            char_literal6=(Token)match(input,238,FOLLOW_238_in_moduleDecl516);  
            stream_238.add(char_literal6);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:5: ( command )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 132 && LA2_0 <= 133)||LA2_0==137||(LA2_0 >= 139 && LA2_0 <= 140)||LA2_0==144||(LA2_0 >= 148 && LA2_0 <= 149)||LA2_0==155||LA2_0==160||(LA2_0 >= 187 && LA2_0 <= 188)||LA2_0==199||LA2_0==221||LA2_0==228) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:129:5: command
            	    {
            	    pushFollow(FOLLOW_command_in_moduleDecl522);
            	    command7=command();

            	    state._fsp--;

            	    stream_command.add(command7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            char_literal8=(Token)match(input,239,FOLLOW_239_in_moduleDecl528);  
            stream_239.add(char_literal8);


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
            // 130:8: -> ^( MODULE stringLiteral ( command )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:130:11: ^( MODULE stringLiteral ( command )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE, "MODULE")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:130:34: ( command )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:1: command : ( mapSize | mapSpawns | itemSpawns | blockDecl | portalDecl | triggerDecl | commandDecl | talkDecl );
    public final AtrophyScriptParser.command_return command() throws RecognitionException {
        AtrophyScriptParser.command_return retval = new AtrophyScriptParser.command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.mapSize_return mapSize9 =null;

        AtrophyScriptParser.mapSpawns_return mapSpawns10 =null;

        AtrophyScriptParser.itemSpawns_return itemSpawns11 =null;

        AtrophyScriptParser.blockDecl_return blockDecl12 =null;

        AtrophyScriptParser.portalDecl_return portalDecl13 =null;

        AtrophyScriptParser.triggerDecl_return triggerDecl14 =null;

        AtrophyScriptParser.commandDecl_return commandDecl15 =null;

        AtrophyScriptParser.talkDecl_return talkDecl16 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:133:8: ( mapSize | mapSpawns | itemSpawns | blockDecl | portalDecl | triggerDecl | commandDecl | talkDecl )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 139:
            case 187:
                {
                alt3=1;
                }
                break;
            case 140:
            case 188:
                {
                alt3=2;
                }
                break;
            case 137:
                {
                alt3=3;
                }
                break;
            case 132:
            case 155:
                {
                alt3=4;
                }
                break;
            case 144:
            case 199:
                {
                alt3=5;
                }
                break;
            case 149:
            case 228:
                {
                alt3=6;
                }
                break;
            case 133:
            case 160:
                {
                alt3=7;
                }
                break;
            case 148:
            case 221:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:134:4: mapSize
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSize_in_command553);
                    mapSize9=mapSize();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSize9.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:135:6: mapSpawns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSpawns_in_command560);
                    mapSpawns10=mapSpawns();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSpawns10.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:136:6: itemSpawns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_itemSpawns_in_command567);
                    itemSpawns11=itemSpawns();

                    state._fsp--;

                    adaptor.addChild(root_0, itemSpawns11.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:137:6: blockDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_blockDecl_in_command574);
                    blockDecl12=blockDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, blockDecl12.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:138:6: portalDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_portalDecl_in_command581);
                    portalDecl13=portalDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, portalDecl13.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:139:6: triggerDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_triggerDecl_in_command588);
                    triggerDecl14=triggerDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, triggerDecl14.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:140:6: commandDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandDecl_in_command595);
                    commandDecl15=commandDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, commandDecl15.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:141:6: talkDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_talkDecl_in_command602);
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:1: requiredAssignment : '::' stringLiteral -> ^( VAR stringLiteral ) ;
    public final AtrophyScriptParser.requiredAssignment_return requiredAssignment() throws RecognitionException {
        AtrophyScriptParser.requiredAssignment_return retval = new AtrophyScriptParser.requiredAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal17=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral18 =null;


        CommonTree string_literal17_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:144:19: ( '::' stringLiteral -> ^( VAR stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:4: '::' stringLiteral
            {
            string_literal17=(Token)match(input,129,FOLLOW_129_in_requiredAssignment615);  
            stream_129.add(string_literal17);


            pushFollow(FOLLOW_stringLiteral_in_requiredAssignment617);
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
            // 145:23: -> ^( VAR stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:145:26: ^( VAR stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:148:1: varAssignment : ( requiredAssignment | -> ^( EMPTY ) );
    public final AtrophyScriptParser.varAssignment_return varAssignment() throws RecognitionException {
        AtrophyScriptParser.varAssignment_return retval = new AtrophyScriptParser.varAssignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.requiredAssignment_return requiredAssignment19 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:148:14: ( requiredAssignment | -> ^( EMPTY ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==129) ) {
                alt4=1;
            }
            else if ( (LA4_0==238) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:149:4: requiredAssignment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_requiredAssignment_in_varAssignment641);
                    requiredAssignment19=requiredAssignment();

                    state._fsp--;

                    adaptor.addChild(root_0, requiredAssignment19.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:6: 
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
                    // 150:6: -> ^( EMPTY )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:150:9: ^( EMPTY )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:153:1: mapSize : ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) ;
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
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:153:8: ( ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}' -> ^( MAPSIZE ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:4: ( 'MAPSIZE' | 'mapsize' ) '{' INT ',' INT ',' INT ',' INT '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:4: ( 'MAPSIZE' | 'mapsize' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==139) ) {
                alt5=1;
            }
            else if ( (LA5_0==187) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:5: 'MAPSIZE'
                    {
                    string_literal20=(Token)match(input,139,FOLLOW_139_in_mapSize668);  
                    stream_139.add(string_literal20);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:17: 'mapsize'
                    {
                    string_literal21=(Token)match(input,187,FOLLOW_187_in_mapSize672);  
                    stream_187.add(string_literal21);


                    }
                    break;

            }


            char_literal22=(Token)match(input,238,FOLLOW_238_in_mapSize675);  
            stream_238.add(char_literal22);


            INT23=(Token)match(input,INT,FOLLOW_INT_in_mapSize677);  
            stream_INT.add(INT23);


            char_literal24=(Token)match(input,126,FOLLOW_126_in_mapSize679);  
            stream_126.add(char_literal24);


            INT25=(Token)match(input,INT,FOLLOW_INT_in_mapSize681);  
            stream_INT.add(INT25);


            char_literal26=(Token)match(input,126,FOLLOW_126_in_mapSize683);  
            stream_126.add(char_literal26);


            INT27=(Token)match(input,INT,FOLLOW_INT_in_mapSize685);  
            stream_INT.add(INT27);


            char_literal28=(Token)match(input,126,FOLLOW_126_in_mapSize687);  
            stream_126.add(char_literal28);


            INT29=(Token)match(input,INT,FOLLOW_INT_in_mapSize689);  
            stream_INT.add(INT29);


            char_literal30=(Token)match(input,239,FOLLOW_239_in_mapSize691);  
            stream_239.add(char_literal30);


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
            // 154:64: -> ^( MAPSIZE ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:67: ^( MAPSIZE ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSIZE, "MAPSIZE")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:154:77: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:157:1: mapSpawns : ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) ;
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
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:157:10: ( ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}' -> ^( MAPSPAWNS ( stringList )? ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:4: ( 'MAPSPAWNS' | 'mapspawns' ) '{' ( stringList )? '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:4: ( 'MAPSPAWNS' | 'mapspawns' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==140) ) {
                alt6=1;
            }
            else if ( (LA6_0==188) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:5: 'MAPSPAWNS'
                    {
                    string_literal31=(Token)match(input,140,FOLLOW_140_in_mapSpawns716);  
                    stream_140.add(string_literal31);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:19: 'mapspawns'
                    {
                    string_literal32=(Token)match(input,188,FOLLOW_188_in_mapSpawns720);  
                    stream_188.add(string_literal32);


                    }
                    break;

            }


            char_literal33=(Token)match(input,238,FOLLOW_238_in_mapSpawns723);  
            stream_238.add(char_literal33);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:36: ( stringList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:36: stringList
                    {
                    pushFollow(FOLLOW_stringList_in_mapSpawns725);
                    stringList34=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList34.getTree());

                    }
                    break;

            }


            char_literal35=(Token)match(input,239,FOLLOW_239_in_mapSpawns728);  
            stream_239.add(char_literal35);


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
            // 158:52: -> ^( MAPSPAWNS ( stringList )? )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:55: ^( MAPSPAWNS ( stringList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAPSPAWNS, "MAPSPAWNS")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:158:67: ( stringList )?
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:161:1: itemSpawns : 'ITEMSPAWNS' '{' INT ',' INT ',' INT ',' INT '}' -> ^( ITEMSPAWNS ( INT )* ) ;
    public final AtrophyScriptParser.itemSpawns_return itemSpawns() throws RecognitionException {
        AtrophyScriptParser.itemSpawns_return retval = new AtrophyScriptParser.itemSpawns_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal36=null;
        Token char_literal37=null;
        Token INT38=null;
        Token char_literal39=null;
        Token INT40=null;
        Token char_literal41=null;
        Token INT42=null;
        Token char_literal43=null;
        Token INT44=null;
        Token char_literal45=null;

        CommonTree string_literal36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree INT38_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree INT40_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree INT42_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree INT44_tree=null;
        CommonTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:161:11: ( 'ITEMSPAWNS' '{' INT ',' INT ',' INT ',' INT '}' -> ^( ITEMSPAWNS ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:4: 'ITEMSPAWNS' '{' INT ',' INT ',' INT ',' INT '}'
            {
            string_literal36=(Token)match(input,137,FOLLOW_137_in_itemSpawns752);  
            stream_137.add(string_literal36);


            char_literal37=(Token)match(input,238,FOLLOW_238_in_itemSpawns754);  
            stream_238.add(char_literal37);


            INT38=(Token)match(input,INT,FOLLOW_INT_in_itemSpawns756);  
            stream_INT.add(INT38);


            char_literal39=(Token)match(input,126,FOLLOW_126_in_itemSpawns758);  
            stream_126.add(char_literal39);


            INT40=(Token)match(input,INT,FOLLOW_INT_in_itemSpawns760);  
            stream_INT.add(INT40);


            char_literal41=(Token)match(input,126,FOLLOW_126_in_itemSpawns762);  
            stream_126.add(char_literal41);


            INT42=(Token)match(input,INT,FOLLOW_INT_in_itemSpawns764);  
            stream_INT.add(INT42);


            char_literal43=(Token)match(input,126,FOLLOW_126_in_itemSpawns766);  
            stream_126.add(char_literal43);


            INT44=(Token)match(input,INT,FOLLOW_INT_in_itemSpawns768);  
            stream_INT.add(INT44);


            char_literal45=(Token)match(input,239,FOLLOW_239_in_itemSpawns770);  
            stream_239.add(char_literal45);


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
            // 162:53: -> ^( ITEMSPAWNS ( INT )* )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:56: ^( ITEMSPAWNS ( INT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ITEMSPAWNS, "ITEMSPAWNS")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:162:69: ( INT )*
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:165:1: blockDecl : ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) ;
    public final AtrophyScriptParser.blockDecl_return blockDecl() throws RecognitionException {
        AtrophyScriptParser.blockDecl_return retval = new AtrophyScriptParser.blockDecl_return();
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
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:165:10: ( ( 'BLOCK' | 'block' ) varAssignment '{' properties '}' -> ^( BLOCK varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:4: ( 'BLOCK' | 'block' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:4: ( 'BLOCK' | 'block' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==132) ) {
                alt8=1;
            }
            else if ( (LA8_0==155) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:5: 'BLOCK'
                    {
                    string_literal46=(Token)match(input,132,FOLLOW_132_in_blockDecl795);  
                    stream_132.add(string_literal46);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:15: 'block'
                    {
                    string_literal47=(Token)match(input,155,FOLLOW_155_in_blockDecl799);  
                    stream_155.add(string_literal47);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_blockDecl802);
            varAssignment48=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment48.getTree());

            char_literal49=(Token)match(input,238,FOLLOW_238_in_blockDecl804);  
            stream_238.add(char_literal49);


            pushFollow(FOLLOW_properties_in_blockDecl806);
            properties50=properties();

            state._fsp--;

            stream_properties.add(properties50.getTree());

            char_literal51=(Token)match(input,239,FOLLOW_239_in_blockDecl808);  
            stream_239.add(char_literal51);


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
            // 166:57: -> ^( BLOCK varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:166:60: ^( BLOCK varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:169:1: portalDecl : ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) ;
    public final AtrophyScriptParser.portalDecl_return portalDecl() throws RecognitionException {
        AtrophyScriptParser.portalDecl_return retval = new AtrophyScriptParser.portalDecl_return();
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
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:169:11: ( ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}' -> ^( PORTAL varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:4: ( 'PORTAL' | 'portal' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:4: ( 'PORTAL' | 'portal' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==144) ) {
                alt9=1;
            }
            else if ( (LA9_0==199) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:5: 'PORTAL'
                    {
                    string_literal52=(Token)match(input,144,FOLLOW_144_in_portalDecl834);  
                    stream_144.add(string_literal52);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:16: 'portal'
                    {
                    string_literal53=(Token)match(input,199,FOLLOW_199_in_portalDecl838);  
                    stream_199.add(string_literal53);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_portalDecl841);
            varAssignment54=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment54.getTree());

            char_literal55=(Token)match(input,238,FOLLOW_238_in_portalDecl843);  
            stream_238.add(char_literal55);


            pushFollow(FOLLOW_properties_in_portalDecl845);
            properties56=properties();

            state._fsp--;

            stream_properties.add(properties56.getTree());

            char_literal57=(Token)match(input,239,FOLLOW_239_in_portalDecl847);  
            stream_239.add(char_literal57);


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
            // 170:59: -> ^( PORTAL varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:170:62: ^( PORTAL varAssignment properties )
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


    public static class triggerDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerDecl"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:173:1: triggerDecl : ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) ;
    public final AtrophyScriptParser.triggerDecl_return triggerDecl() throws RecognitionException {
        AtrophyScriptParser.triggerDecl_return retval = new AtrophyScriptParser.triggerDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal58=null;
        Token string_literal59=null;
        Token char_literal61=null;
        Token char_literal63=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment60 =null;

        AtrophyScriptParser.properties_return properties62 =null;


        CommonTree string_literal58_tree=null;
        CommonTree string_literal59_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:173:12: ( ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}' -> ^( TRIGGER requiredAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:4: ( 'TRIGGER' | 'trigger' ) requiredAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:4: ( 'TRIGGER' | 'trigger' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==149) ) {
                alt10=1;
            }
            else if ( (LA10_0==228) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:5: 'TRIGGER'
                    {
                    string_literal58=(Token)match(input,149,FOLLOW_149_in_triggerDecl871);  
                    stream_149.add(string_literal58);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:17: 'trigger'
                    {
                    string_literal59=(Token)match(input,228,FOLLOW_228_in_triggerDecl875);  
                    stream_228.add(string_literal59);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_triggerDecl878);
            requiredAssignment60=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment60.getTree());

            char_literal61=(Token)match(input,238,FOLLOW_238_in_triggerDecl880);  
            stream_238.add(char_literal61);


            pushFollow(FOLLOW_properties_in_triggerDecl882);
            properties62=properties();

            state._fsp--;

            stream_properties.add(properties62.getTree());

            char_literal63=(Token)match(input,239,FOLLOW_239_in_triggerDecl884);  
            stream_239.add(char_literal63);


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
            // 174:66: -> ^( TRIGGER requiredAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:174:69: ^( TRIGGER requiredAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:177:1: commandDecl : ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) ;
    public final AtrophyScriptParser.commandDecl_return commandDecl() throws RecognitionException {
        AtrophyScriptParser.commandDecl_return retval = new AtrophyScriptParser.commandDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal64=null;
        Token string_literal65=null;
        Token char_literal67=null;
        Token char_literal69=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment66 =null;

        AtrophyScriptParser.triggerEffectList_return triggerEffectList68 =null;


        CommonTree string_literal64_tree=null;
        CommonTree string_literal65_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree char_literal69_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:177:12: ( ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}' -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:4: ( 'COMMAND' | 'command' ) requiredAssignment '{' triggerEffectList '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:4: ( 'COMMAND' | 'command' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==133) ) {
                alt11=1;
            }
            else if ( (LA11_0==160) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:5: 'COMMAND'
                    {
                    string_literal64=(Token)match(input,133,FOLLOW_133_in_commandDecl910);  
                    stream_133.add(string_literal64);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:17: 'command'
                    {
                    string_literal65=(Token)match(input,160,FOLLOW_160_in_commandDecl914);  
                    stream_160.add(string_literal65);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_commandDecl917);
            requiredAssignment66=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment66.getTree());

            char_literal67=(Token)match(input,238,FOLLOW_238_in_commandDecl919);  
            stream_238.add(char_literal67);


            pushFollow(FOLLOW_triggerEffectList_in_commandDecl921);
            triggerEffectList68=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList68.getTree());

            char_literal69=(Token)match(input,239,FOLLOW_239_in_commandDecl923);  
            stream_239.add(char_literal69);


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
            // 178:73: -> ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:76: ^( COMMAND requiredAssignment ^( TRIGGEREFFECT triggerEffectList ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COMMAND, "COMMAND")
                , root_1);

                adaptor.addChild(root_1, stream_requiredAssignment.nextTree());

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:178:105: ^( TRIGGEREFFECT triggerEffectList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:181:1: talkDecl : ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) ;
    public final AtrophyScriptParser.talkDecl_return talkDecl() throws RecognitionException {
        AtrophyScriptParser.talkDecl_return retval = new AtrophyScriptParser.talkDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal70=null;
        Token string_literal71=null;
        Token char_literal72=null;
        Token char_literal74=null;
        AtrophyScriptParser.properties_return properties73 =null;


        CommonTree string_literal70_tree=null;
        CommonTree string_literal71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree char_literal74_tree=null;
        RewriteRuleTokenStream stream_221=new RewriteRuleTokenStream(adaptor,"token 221");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:181:9: ( ( 'TALK' | 'talk' ) '{' properties '}' -> ^( TALK properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:4: ( 'TALK' | 'talk' ) '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:4: ( 'TALK' | 'talk' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==148) ) {
                alt12=1;
            }
            else if ( (LA12_0==221) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:5: 'TALK'
                    {
                    string_literal70=(Token)match(input,148,FOLLOW_148_in_talkDecl953);  
                    stream_148.add(string_literal70);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:14: 'talk'
                    {
                    string_literal71=(Token)match(input,221,FOLLOW_221_in_talkDecl957);  
                    stream_221.add(string_literal71);


                    }
                    break;

            }


            char_literal72=(Token)match(input,238,FOLLOW_238_in_talkDecl960);  
            stream_238.add(char_literal72);


            pushFollow(FOLLOW_properties_in_talkDecl962);
            properties73=properties();

            state._fsp--;

            stream_properties.add(properties73.getTree());

            char_literal74=(Token)match(input,239,FOLLOW_239_in_talkDecl964);  
            stream_239.add(char_literal74);


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
            // 182:41: -> ^( TALK properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:182:44: ^( TALK properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:185:1: properties : ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | textureProperty | coverDecl | stashDecl )* ;
    public final AtrophyScriptParser.properties_return properties() throws RecognitionException {
        AtrophyScriptParser.properties_return retval = new AtrophyScriptParser.properties_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.xListProperty_return xListProperty75 =null;

        AtrophyScriptParser.yListProperty_return yListProperty76 =null;

        AtrophyScriptParser.factionTerritoryProperty_return factionTerritoryProperty77 =null;

        AtrophyScriptParser.factionZoneProperty_return factionZoneProperty78 =null;

        AtrophyScriptParser.saferoomProperty_return saferoomProperty79 =null;

        AtrophyScriptParser.stageProperty_return stageProperty80 =null;

        AtrophyScriptParser.stageDeclProperty_return stageDeclProperty81 =null;

        AtrophyScriptParser.talkMapParentProperty_return talkMapParentProperty82 =null;

        AtrophyScriptParser.aiInitProperty_return aiInitProperty83 =null;

        AtrophyScriptParser.openingLineProperty_return openingLineProperty84 =null;

        AtrophyScriptParser.optionProperty_return optionProperty85 =null;

        AtrophyScriptParser.topicProperty_return topicProperty86 =null;

        AtrophyScriptParser.triggerCondProperty_return triggerCondProperty87 =null;

        AtrophyScriptParser.triggerEffectProperty_return triggerEffectProperty88 =null;

        AtrophyScriptParser.textureProperty_return textureProperty89 =null;

        AtrophyScriptParser.coverDecl_return coverDecl90 =null;

        AtrophyScriptParser.stashDecl_return stashDecl91 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:185:11: ( ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | textureProperty | coverDecl | stashDecl )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | textureProperty | coverDecl | stashDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:4: ( xListProperty | yListProperty | factionTerritoryProperty | factionZoneProperty | saferoomProperty | stageProperty | stageDeclProperty | talkMapParentProperty | aiInitProperty | openingLineProperty | optionProperty | topicProperty | triggerCondProperty | triggerEffectProperty | textureProperty | coverDecl | stashDecl )*
            loop13:
            do {
                int alt13=18;
                switch ( input.LA(1) ) {
                case 235:
                    {
                    alt13=1;
                    }
                    break;
                case 236:
                    {
                    alt13=2;
                    }
                    break;
                case 225:
                    {
                    alt13=3;
                    }
                    break;
                case 237:
                    {
                    alt13=4;
                    }
                    break;
                case 207:
                    {
                    alt13=5;
                    }
                    break;
                case 206:
                case 216:
                    {
                    alt13=6;
                    }
                    break;
                case 217:
                    {
                    alt13=7;
                    }
                    break;
                case 197:
                case 198:
                    {
                    alt13=8;
                    }
                    break;
                case 150:
                case 152:
                    {
                    alt13=9;
                    }
                    break;
                case 192:
                case 194:
                case 195:
                    {
                    alt13=10;
                    }
                    break;
                case 183:
                case 196:
                    {
                    alt13=11;
                    }
                    break;
                case 220:
                case 227:
                    {
                    alt13=12;
                    }
                    break;
                case 222:
                case 229:
                    {
                    alt13=13;
                    }
                    break;
                case 223:
                case 230:
                    {
                    alt13=14;
                    }
                    break;
                case 226:
                    {
                    alt13=15;
                    }
                    break;
                case 134:
                case 163:
                    {
                    alt13=16;
                    }
                    break;
                case 147:
                case 218:
                    {
                    alt13=17;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:186:5: xListProperty
            	    {
            	    pushFollow(FOLLOW_xListProperty_in_properties988);
            	    xListProperty75=xListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xListProperty75.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:187:6: yListProperty
            	    {
            	    pushFollow(FOLLOW_yListProperty_in_properties995);
            	    yListProperty76=yListProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, yListProperty76.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:188:6: factionTerritoryProperty
            	    {
            	    pushFollow(FOLLOW_factionTerritoryProperty_in_properties1002);
            	    factionTerritoryProperty77=factionTerritoryProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionTerritoryProperty77.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:189:6: factionZoneProperty
            	    {
            	    pushFollow(FOLLOW_factionZoneProperty_in_properties1009);
            	    factionZoneProperty78=factionZoneProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factionZoneProperty78.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:190:6: saferoomProperty
            	    {
            	    pushFollow(FOLLOW_saferoomProperty_in_properties1016);
            	    saferoomProperty79=saferoomProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, saferoomProperty79.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:191:6: stageProperty
            	    {
            	    pushFollow(FOLLOW_stageProperty_in_properties1023);
            	    stageProperty80=stageProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageProperty80.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:192:6: stageDeclProperty
            	    {
            	    pushFollow(FOLLOW_stageDeclProperty_in_properties1030);
            	    stageDeclProperty81=stageDeclProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stageDeclProperty81.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:193:6: talkMapParentProperty
            	    {
            	    pushFollow(FOLLOW_talkMapParentProperty_in_properties1037);
            	    talkMapParentProperty82=talkMapParentProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, talkMapParentProperty82.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:194:6: aiInitProperty
            	    {
            	    pushFollow(FOLLOW_aiInitProperty_in_properties1044);
            	    aiInitProperty83=aiInitProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiInitProperty83.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:195:6: openingLineProperty
            	    {
            	    pushFollow(FOLLOW_openingLineProperty_in_properties1051);
            	    openingLineProperty84=openingLineProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, openingLineProperty84.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:196:6: optionProperty
            	    {
            	    pushFollow(FOLLOW_optionProperty_in_properties1058);
            	    optionProperty85=optionProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, optionProperty85.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:197:6: topicProperty
            	    {
            	    pushFollow(FOLLOW_topicProperty_in_properties1065);
            	    topicProperty86=topicProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicProperty86.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:198:6: triggerCondProperty
            	    {
            	    pushFollow(FOLLOW_triggerCondProperty_in_properties1072);
            	    triggerCondProperty87=triggerCondProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerCondProperty87.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:199:6: triggerEffectProperty
            	    {
            	    pushFollow(FOLLOW_triggerEffectProperty_in_properties1079);
            	    triggerEffectProperty88=triggerEffectProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffectProperty88.getTree());

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:200:6: textureProperty
            	    {
            	    pushFollow(FOLLOW_textureProperty_in_properties1086);
            	    textureProperty89=textureProperty();

            	    state._fsp--;

            	    adaptor.addChild(root_0, textureProperty89.getTree());

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:201:6: coverDecl
            	    {
            	    pushFollow(FOLLOW_coverDecl_in_properties1093);
            	    coverDecl90=coverDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, coverDecl90.getTree());

            	    }
            	    break;
            	case 17 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:202:6: stashDecl
            	    {
            	    pushFollow(FOLLOW_stashDecl_in_properties1100);
            	    stashDecl91=stashDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stashDecl91.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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

        Token string_literal92=null;
        Token INT93=null;
        Token char_literal94=null;
        Token INT95=null;

        CommonTree string_literal92_tree=null;
        CommonTree INT93_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree INT95_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_235=new RewriteRuleTokenStream(adaptor,"token 235");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:205:14: ( 'x:' INT ( ',' INT )* -> ^( XLIST ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:4: 'x:' INT ( ',' INT )*
            {
            string_literal92=(Token)match(input,235,FOLLOW_235_in_xListProperty1117);  
            stream_235.add(string_literal92);


            INT93=(Token)match(input,INT,FOLLOW_INT_in_xListProperty1119);  
            stream_INT.add(INT93);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:13: ( ',' INT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==126) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:206:14: ',' INT
            	    {
            	    char_literal94=(Token)match(input,126,FOLLOW_126_in_xListProperty1122);  
            	    stream_126.add(char_literal94);


            	    INT95=(Token)match(input,INT,FOLLOW_INT_in_xListProperty1123);  
            	    stream_INT.add(INT95);


            	    }
            	    break;

            	default :
            	    break loop14;
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

        Token string_literal96=null;
        Token INT97=null;
        Token char_literal98=null;
        Token INT99=null;

        CommonTree string_literal96_tree=null;
        CommonTree INT97_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree INT99_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_236=new RewriteRuleTokenStream(adaptor,"token 236");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:209:14: ( 'y:' INT ( ',' INT )* -> ^( YLIST ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:4: 'y:' INT ( ',' INT )*
            {
            string_literal96=(Token)match(input,236,FOLLOW_236_in_yListProperty1147);  
            stream_236.add(string_literal96);


            INT97=(Token)match(input,INT,FOLLOW_INT_in_yListProperty1149);  
            stream_INT.add(INT97);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:13: ( ',' INT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==126) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:210:14: ',' INT
            	    {
            	    char_literal98=(Token)match(input,126,FOLLOW_126_in_yListProperty1152);  
            	    stream_126.add(char_literal98);


            	    INT99=(Token)match(input,INT,FOLLOW_INT_in_yListProperty1153);  
            	    stream_INT.add(INT99);


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

        Token string_literal100=null;
        Token INT102=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral101 =null;


        CommonTree string_literal100_tree=null;
        CommonTree INT102_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_225=new RewriteRuleTokenStream(adaptor,"token 225");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:213:25: ( 'territory:' stringLiteral INT -> ^( TERRITORY ^( STRING stringLiteral ) INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:214:4: 'territory:' stringLiteral INT
            {
            string_literal100=(Token)match(input,225,FOLLOW_225_in_factionTerritoryProperty1179);  
            stream_225.add(string_literal100);


            pushFollow(FOLLOW_stringLiteral_in_factionTerritoryProperty1181);
            stringLiteral101=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral101.getTree());

            INT102=(Token)match(input,INT,FOLLOW_INT_in_factionTerritoryProperty1183);  
            stream_INT.add(INT102);


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

        Token string_literal103=null;
        AtrophyScriptParser.stringList_return stringList104 =null;


        CommonTree string_literal103_tree=null;
        RewriteRuleTokenStream stream_237=new RewriteRuleTokenStream(adaptor,"token 237");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:217:20: ( 'zone:' stringList -> ^( ZONE stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:218:4: 'zone:' stringList
            {
            string_literal103=(Token)match(input,237,FOLLOW_237_in_factionZoneProperty1212);  
            stream_237.add(string_literal103);


            pushFollow(FOLLOW_stringList_in_factionZoneProperty1214);
            stringList104=stringList();

            state._fsp--;

            stream_stringList.add(stringList104.getTree());

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

        Token string_literal105=null;

        CommonTree string_literal105_tree=null;
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:221:17: ( 'saferoom' -> ^( SAFEROOM ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:222:4: 'saferoom'
            {
            string_literal105=(Token)match(input,207,FOLLOW_207_in_saferoomProperty1237);  
            stream_207.add(string_literal105);


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

        Token string_literal106=null;
        Token INT107=null;
        Token char_literal108=null;
        Token INT109=null;

        CommonTree string_literal106_tree=null;
        CommonTree INT107_tree=null;
        CommonTree char_literal108_tree=null;
        CommonTree INT109_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_217=new RewriteRuleTokenStream(adaptor,"token 217");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:225:18: ( 'stages:' INT ( ',' INT )* -> ^( STAGELIST ( INT )* ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:4: 'stages:' INT ( ',' INT )*
            {
            string_literal106=(Token)match(input,217,FOLLOW_217_in_stageDeclProperty1258);  
            stream_217.add(string_literal106);


            INT107=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1260);  
            stream_INT.add(INT107);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:18: ( ',' INT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==126) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:226:19: ',' INT
            	    {
            	    char_literal108=(Token)match(input,126,FOLLOW_126_in_stageDeclProperty1263);  
            	    stream_126.add(char_literal108);


            	    INT109=(Token)match(input,INT,FOLLOW_INT_in_stageDeclProperty1265);  
            	    stream_INT.add(INT109);


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

        Token string_literal110=null;
        Token string_literal111=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral112 =null;


        CommonTree string_literal110_tree=null;
        CommonTree string_literal111_tree=null;
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:229:22: ( ( 'parent:' | 'p:' ) stringLiteral -> ^( TALKPARENT stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:4: ( 'parent:' | 'p:' ) stringLiteral
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:4: ( 'parent:' | 'p:' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==198) ) {
                alt17=1;
            }
            else if ( (LA17_0==197) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:5: 'parent:'
                    {
                    string_literal110=(Token)match(input,198,FOLLOW_198_in_talkMapParentProperty1292);  
                    stream_198.add(string_literal110);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:230:17: 'p:'
                    {
                    string_literal111=(Token)match(input,197,FOLLOW_197_in_talkMapParentProperty1296);  
                    stream_197.add(string_literal111);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_talkMapParentProperty1299);
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

        Token string_literal113=null;
        Token string_literal114=null;
        Token INT115=null;

        CommonTree string_literal113_tree=null;
        CommonTree string_literal114_tree=null;
        CommonTree INT115_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:233:14: ( ( 'stage:' | 's:' ) INT -> ^( TALKSTAGE INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:4: ( 'stage:' | 's:' ) INT
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:4: ( 'stage:' | 's:' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==216) ) {
                alt18=1;
            }
            else if ( (LA18_0==206) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:5: 'stage:'
                    {
                    string_literal113=(Token)match(input,216,FOLLOW_216_in_stageProperty1323);  
                    stream_216.add(string_literal113);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:234:16: 's:'
                    {
                    string_literal114=(Token)match(input,206,FOLLOW_206_in_stageProperty1327);  
                    stream_206.add(string_literal114);


                    }
                    break;

            }


            INT115=(Token)match(input,INT,FOLLOW_INT_in_stageProperty1330);  
            stream_INT.add(INT115);


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

        Token string_literal116=null;
        Token string_literal117=null;
        Token BOOL118=null;

        CommonTree string_literal116_tree=null;
        CommonTree string_literal117_tree=null;
        CommonTree BOOL118_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:237:15: ( ( 'aiInit:' | 'a:' ) BOOL -> ^( AIINIT BOOL ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:4: ( 'aiInit:' | 'a:' ) BOOL
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:4: ( 'aiInit:' | 'a:' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==152) ) {
                alt19=1;
            }
            else if ( (LA19_0==150) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:5: 'aiInit:'
                    {
                    string_literal116=(Token)match(input,152,FOLLOW_152_in_aiInitProperty1354);  
                    stream_152.add(string_literal116);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:238:17: 'a:'
                    {
                    string_literal117=(Token)match(input,150,FOLLOW_150_in_aiInitProperty1358);  
                    stream_150.add(string_literal117);


                    }
                    break;

            }


            BOOL118=(Token)match(input,BOOL,FOLLOW_BOOL_in_aiInitProperty1361);  
            stream_BOOL.add(BOOL118);


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

        Token string_literal119=null;
        Token string_literal120=null;
        Token string_literal121=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral122 =null;


        CommonTree string_literal119_tree=null;
        CommonTree string_literal120_tree=null;
        CommonTree string_literal121_tree=null;
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:241:20: ( ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral -> ^( OPENINGLINE stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:4: ( 'o:' | 'opening:' | 'openingLine:' ) stringLiteral
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:4: ( 'o:' | 'opening:' | 'openingLine:' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 192:
                {
                alt20=1;
                }
                break;
            case 194:
                {
                alt20=2;
                }
                break;
            case 195:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:5: 'o:'
                    {
                    string_literal119=(Token)match(input,192,FOLLOW_192_in_openingLineProperty1385);  
                    stream_192.add(string_literal119);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:12: 'opening:'
                    {
                    string_literal120=(Token)match(input,194,FOLLOW_194_in_openingLineProperty1389);  
                    stream_194.add(string_literal120);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:242:25: 'openingLine:'
                    {
                    string_literal121=(Token)match(input,195,FOLLOW_195_in_openingLineProperty1393);  
                    stream_195.add(string_literal121);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_openingLineProperty1396);
            stringLiteral122=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral122.getTree());

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

        Token string_literal123=null;
        Token string_literal124=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral125 =null;


        CommonTree string_literal123_tree=null;
        CommonTree string_literal124_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:245:15: ( ( 'l:' | 'option:' ) stringLiteral -> ^( OPTION stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:4: ( 'l:' | 'option:' ) stringLiteral
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:4: ( 'l:' | 'option:' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==183) ) {
                alt21=1;
            }
            else if ( (LA21_0==196) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:5: 'l:'
                    {
                    string_literal123=(Token)match(input,183,FOLLOW_183_in_optionProperty1418);  
                    stream_183.add(string_literal123);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:246:12: 'option:'
                    {
                    string_literal124=(Token)match(input,196,FOLLOW_196_in_optionProperty1422);  
                    stream_196.add(string_literal124);


                    }
                    break;

            }


            pushFollow(FOLLOW_stringLiteral_in_optionProperty1425);
            stringLiteral125=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral125.getTree());

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

        Token char_literal126=null;
        Token string_literal127=null;
        Token char_literal129=null;
        Token char_literal131=null;
        AtrophyScriptParser.requiredAssignment_return requiredAssignment128 =null;

        AtrophyScriptParser.topicProperties_return topicProperties130 =null;


        CommonTree char_literal126_tree=null;
        CommonTree string_literal127_tree=null;
        CommonTree char_literal129_tree=null;
        CommonTree char_literal131_tree=null;
        RewriteRuleTokenStream stream_220=new RewriteRuleTokenStream(adaptor,"token 220");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_227=new RewriteRuleTokenStream(adaptor,"token 227");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_requiredAssignment=new RewriteRuleSubtreeStream(adaptor,"rule requiredAssignment");
        RewriteRuleSubtreeStream stream_topicProperties=new RewriteRuleSubtreeStream(adaptor,"rule topicProperties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:249:14: ( ( 't' | 'topic' ) requiredAssignment '{' topicProperties '}' -> ^( TOPIC requiredAssignment topicProperties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:4: ( 't' | 'topic' ) requiredAssignment '{' topicProperties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:4: ( 't' | 'topic' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==220) ) {
                alt22=1;
            }
            else if ( (LA22_0==227) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:5: 't'
                    {
                    char_literal126=(Token)match(input,220,FOLLOW_220_in_topicProperty1449);  
                    stream_220.add(char_literal126);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:250:11: 'topic'
                    {
                    string_literal127=(Token)match(input,227,FOLLOW_227_in_topicProperty1453);  
                    stream_227.add(string_literal127);


                    }
                    break;

            }


            pushFollow(FOLLOW_requiredAssignment_in_topicProperty1456);
            requiredAssignment128=requiredAssignment();

            state._fsp--;

            stream_requiredAssignment.add(requiredAssignment128.getTree());

            char_literal129=(Token)match(input,238,FOLLOW_238_in_topicProperty1458);  
            stream_238.add(char_literal129);


            pushFollow(FOLLOW_topicProperties_in_topicProperty1460);
            topicProperties130=topicProperties();

            state._fsp--;

            stream_topicProperties.add(topicProperties130.getTree());

            char_literal131=(Token)match(input,239,FOLLOW_239_in_topicProperty1462);  
            stream_239.add(char_literal131);


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

        AtrophyScriptParser.topicLine_return topicLine132 =null;

        AtrophyScriptParser.topicRequiement_return topicRequiement133 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:253:16: ( ( topicLine | topicRequiement )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:4: ( topicLine | topicRequiement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:4: ( topicLine | topicRequiement )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==184) ) {
                    alt23=1;
                }
                else if ( (LA23_0==205) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:5: topicLine
            	    {
            	    pushFollow(FOLLOW_topicLine_in_topicProperties1489);
            	    topicLine132=topicLine();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicLine132.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:254:17: topicRequiement
            	    {
            	    pushFollow(FOLLOW_topicRequiement_in_topicProperties1493);
            	    topicRequiement133=topicRequiement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, topicRequiement133.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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

        Token string_literal134=null;
        Token char_literal136=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral135 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral137 =null;


        CommonTree string_literal134_tree=null;
        CommonTree char_literal136_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:257:10: ( 'lines:' stringLiteral ( ',' stringLiteral )* -> ( ^( LINE stringLiteral ) )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:4: 'lines:' stringLiteral ( ',' stringLiteral )*
            {
            string_literal134=(Token)match(input,184,FOLLOW_184_in_topicLine1510);  
            stream_184.add(string_literal134);


            pushFollow(FOLLOW_stringLiteral_in_topicLine1511);
            stringLiteral135=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral135.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:26: ( ',' stringLiteral )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==126) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:258:27: ',' stringLiteral
            	    {
            	    char_literal136=(Token)match(input,126,FOLLOW_126_in_topicLine1514);  
            	    stream_126.add(char_literal136);


            	    pushFollow(FOLLOW_stringLiteral_in_topicLine1516);
            	    stringLiteral137=stringLiteral();

            	    state._fsp--;

            	    stream_stringLiteral.add(stringLiteral137.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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

        Token string_literal138=null;
        Token char_literal140=null;
        AtrophyScriptParser.reqString_return reqString139 =null;

        AtrophyScriptParser.reqString_return reqString141 =null;


        CommonTree string_literal138_tree=null;
        CommonTree char_literal140_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleSubtreeStream stream_reqString=new RewriteRuleSubtreeStream(adaptor,"rule reqString");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:261:16: ( 'req:' reqString ( ',' reqString )* -> ( ^( REQ reqString ) )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:4: 'req:' reqString ( ',' reqString )*
            {
            string_literal138=(Token)match(input,205,FOLLOW_205_in_topicRequiement1542);  
            stream_205.add(string_literal138);


            pushFollow(FOLLOW_reqString_in_topicRequiement1544);
            reqString139=reqString();

            state._fsp--;

            stream_reqString.add(reqString139.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:21: ( ',' reqString )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==126) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:262:22: ',' reqString
            	    {
            	    char_literal140=(Token)match(input,126,FOLLOW_126_in_topicRequiement1547);  
            	    stream_126.add(char_literal140);


            	    pushFollow(FOLLOW_reqString_in_topicRequiement1549);
            	    reqString141=reqString();

            	    state._fsp--;

            	    stream_reqString.add(reqString141.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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

        Token NOT_PREFIX142=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral143 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral144 =null;


        CommonTree NOT_PREFIX142_tree=null;
        RewriteRuleTokenStream stream_NOT_PREFIX=new RewriteRuleTokenStream(adaptor,"token NOT_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:265:10: ( NOT_PREFIX stringLiteral -> ^( NEGATION stringLiteral ) | stringLiteral )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NOT_PREFIX) ) {
                alt26=1;
            }
            else if ( (LA26_0==STRING) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:266:4: NOT_PREFIX stringLiteral
                    {
                    NOT_PREFIX142=(Token)match(input,NOT_PREFIX,FOLLOW_NOT_PREFIX_in_reqString1575);  
                    stream_NOT_PREFIX.add(NOT_PREFIX142);


                    pushFollow(FOLLOW_stringLiteral_in_reqString1577);
                    stringLiteral143=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral143.getTree());

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


                    pushFollow(FOLLOW_stringLiteral_in_reqString1592);
                    stringLiteral144=stringLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, stringLiteral144.getTree());

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

        Token string_literal145=null;
        Token char_literal146=null;
        Token char_literal148=null;
        AtrophyScriptParser.unitInfo_return unitInfo147 =null;


        CommonTree string_literal145_tree=null;
        CommonTree char_literal146_tree=null;
        CommonTree char_literal148_tree=null;
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:270:11: ( 'isAlive' '{' unitInfo '}' -> ^( ISALIVE unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:271:4: 'isAlive' '{' unitInfo '}'
            {
            string_literal145=(Token)match(input,171,FOLLOW_171_in_aliveQuery1607);  
            stream_171.add(string_literal145);


            char_literal146=(Token)match(input,238,FOLLOW_238_in_aliveQuery1609);  
            stream_238.add(char_literal146);


            pushFollow(FOLLOW_unitInfo_in_aliveQuery1611);
            unitInfo147=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo147.getTree());

            char_literal148=(Token)match(input,239,FOLLOW_239_in_aliveQuery1613);  
            stream_239.add(char_literal148);


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

        Token string_literal149=null;
        Token char_literal150=null;
        Token char_literal152=null;
        Token char_literal153=null;
        Token char_literal155=null;
        AtrophyScriptParser.unitInfo_return unitInfo151 =null;

        AtrophyScriptParser.saferoomInfo_return saferoomInfo154 =null;


        CommonTree string_literal149_tree=null;
        CommonTree char_literal150_tree=null;
        CommonTree char_literal152_tree=null;
        CommonTree char_literal153_tree=null;
        CommonTree char_literal155_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:274:10: ( 'isInRoom' '{' unitInfo '}' '{' saferoomInfo '}' -> ^( ISINROOM ^( UNITINFO unitInfo ) ^( ROOMINFO saferoomInfo ) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:275:4: 'isInRoom' '{' unitInfo '}' '{' saferoomInfo '}'
            {
            string_literal149=(Token)match(input,175,FOLLOW_175_in_roomQuery1636);  
            stream_175.add(string_literal149);


            char_literal150=(Token)match(input,238,FOLLOW_238_in_roomQuery1638);  
            stream_238.add(char_literal150);


            pushFollow(FOLLOW_unitInfo_in_roomQuery1640);
            unitInfo151=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo151.getTree());

            char_literal152=(Token)match(input,239,FOLLOW_239_in_roomQuery1642);  
            stream_239.add(char_literal152);


            char_literal153=(Token)match(input,238,FOLLOW_238_in_roomQuery1644);  
            stream_238.add(char_literal153);


            pushFollow(FOLLOW_saferoomInfo_in_roomQuery1646);
            saferoomInfo154=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo154.getTree());

            char_literal155=(Token)match(input,239,FOLLOW_239_in_roomQuery1648);  
            stream_239.add(char_literal155);


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

        Token string_literal156=null;
        Token INT157=null;
        Token string_literal158=null;
        Token INT159=null;
        Token string_literal160=null;
        Token INT161=null;

        CommonTree string_literal156_tree=null;
        CommonTree INT157_tree=null;
        CommonTree string_literal158_tree=null;
        CommonTree INT159_tree=null;
        CommonTree string_literal160_tree=null;
        CommonTree INT161_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:278:10: ( 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:279:4: 'onTime:' INT ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) )
            {
            string_literal156=(Token)match(input,193,FOLLOW_193_in_timeQuery1682);  
            stream_193.add(string_literal156);


            INT157=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1684);  
            stream_INT.add(INT157);


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:4: ( 'expireTime:' INT -> ^( ONTIME INT ^( EXPIRETIME INT ) ) | 'expireRepeats:' INT -> ^( ONTIME INT ^( EXPIREREPEATS INT ) ) | -> ^( ONTIME INT EMPTY ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 168:
                {
                alt27=1;
                }
                break;
            case 167:
                {
                alt27=2;
                }
                break;
            case 125:
            case 131:
            case 143:
            case 239:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:280:5: 'expireTime:' INT
                    {
                    string_literal158=(Token)match(input,168,FOLLOW_168_in_timeQuery1690);  
                    stream_168.add(string_literal158);


                    INT159=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1692);  
                    stream_INT.add(INT159);


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
                    string_literal160=(Token)match(input,167,FOLLOW_167_in_timeQuery1712);  
                    stream_167.add(string_literal160);


                    INT161=(Token)match(input,INT,FOLLOW_INT_in_timeQuery1714);  
                    stream_INT.add(INT161);


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

        Token char_literal162=null;
        Token char_literal164=null;
        AtrophyScriptParser.queryLogic_return queryLogic163 =null;

        AtrophyScriptParser.aliveQuery_return aliveQuery165 =null;

        AtrophyScriptParser.roomQuery_return roomQuery166 =null;

        AtrophyScriptParser.timeQuery_return timeQuery167 =null;


        CommonTree char_literal162_tree=null;
        CommonTree char_literal164_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:285:10: ( '(' ! queryLogic ')' !| aliveQuery | roomQuery | timeQuery )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt28=1;
                }
                break;
            case 171:
                {
                alt28=2;
                }
                break;
            case 175:
                {
                alt28=3;
                }
                break;
            case 193:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:286:3: '(' ! queryLogic ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal162=(Token)match(input,124,FOLLOW_124_in_boolQuery1756); 

                    pushFollow(FOLLOW_queryLogic_in_boolQuery1759);
                    queryLogic163=queryLogic();

                    state._fsp--;

                    adaptor.addChild(root_0, queryLogic163.getTree());

                    char_literal164=(Token)match(input,125,FOLLOW_125_in_boolQuery1761); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:287:5: aliveQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_aliveQuery_in_boolQuery1768);
                    aliveQuery165=aliveQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, aliveQuery165.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:288:5: roomQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_roomQuery_in_boolQuery1774);
                    roomQuery166=roomQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, roomQuery166.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:289:5: timeQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeQuery_in_boolQuery1780);
                    timeQuery167=timeQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, timeQuery167.getTree());

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

        Token char_literal169=null;
        AtrophyScriptParser.boolQuery_return boolQuery168 =null;

        AtrophyScriptParser.boolQuery_return boolQuery170 =null;


        CommonTree char_literal169_tree=null;
        RewriteRuleTokenStream stream_NOT_PREFIX=new RewriteRuleTokenStream(adaptor,"token NOT_PREFIX");
        RewriteRuleSubtreeStream stream_boolQuery=new RewriteRuleSubtreeStream(adaptor,"rule boolQuery");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:292:14: ( boolQuery | '!' boolQuery -> ^( NEGATION boolQuery ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==124||LA29_0==171||LA29_0==175||LA29_0==193) ) {
                alt29=1;
            }
            else if ( (LA29_0==NOT_PREFIX) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:293:3: boolQuery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_boolQuery_in_queryNegation1794);
                    boolQuery168=boolQuery();

                    state._fsp--;

                    adaptor.addChild(root_0, boolQuery168.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:294:4: '!' boolQuery
                    {
                    char_literal169=(Token)match(input,NOT_PREFIX,FOLLOW_NOT_PREFIX_in_queryNegation1799);  
                    stream_NOT_PREFIX.add(char_literal169);


                    pushFollow(FOLLOW_boolQuery_in_queryNegation1801);
                    boolQuery170=boolQuery();

                    state._fsp--;

                    stream_boolQuery.add(boolQuery170.getTree());

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

        Token string_literal171=null;
        Token string_literal172=null;
        AtrophyScriptParser.queryNegation_return b1 =null;

        AtrophyScriptParser.queryNegation_return b2 =null;


        CommonTree string_literal171_tree=null;
        CommonTree string_literal172_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_queryNegation=new RewriteRuleSubtreeStream(adaptor,"rule queryNegation");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:297:11: (b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:298:3: b1= queryNegation ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) )
            {
            pushFollow(FOLLOW_queryNegation_in_queryLogic1825);
            b1=queryNegation();

            state._fsp--;

            stream_queryNegation.add(b1.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:3: ( 'AND' b2= queryNegation -> ^( AND $b1 $b2) | 'OR' b2= queryNegation -> ^( OR $b1 $b2) | -> ^( LOGIC $b1) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt30=1;
                }
                break;
            case 143:
                {
                alt30=2;
                }
                break;
            case 125:
            case 239:
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:299:4: 'AND' b2= queryNegation
                    {
                    string_literal171=(Token)match(input,131,FOLLOW_131_in_queryLogic1830);  
                    stream_131.add(string_literal171);


                    pushFollow(FOLLOW_queryNegation_in_queryLogic1834);
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
                    string_literal172=(Token)match(input,143,FOLLOW_143_in_queryLogic1851);  
                    stream_143.add(string_literal172);


                    pushFollow(FOLLOW_queryNegation_in_queryLogic1855);
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

        Token string_literal173=null;
        Token string_literal174=null;
        Token char_literal175=null;
        Token char_literal177=null;
        AtrophyScriptParser.queryLogic_return queryLogic176 =null;


        CommonTree string_literal173_tree=null;
        CommonTree string_literal174_tree=null;
        CommonTree char_literal175_tree=null;
        CommonTree char_literal177_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_222=new RewriteRuleTokenStream(adaptor,"token 222");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_queryLogic=new RewriteRuleSubtreeStream(adaptor,"rule queryLogic");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:304:20: ( ( 'tc' | 'triggerCond' ) '{' queryLogic '}' -> ^( TRIGGERCOND queryLogic ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:4: ( 'tc' | 'triggerCond' ) '{' queryLogic '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:4: ( 'tc' | 'triggerCond' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==222) ) {
                alt31=1;
            }
            else if ( (LA31_0==229) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:5: 'tc'
                    {
                    string_literal173=(Token)match(input,222,FOLLOW_222_in_triggerCondProperty1895);  
                    stream_222.add(string_literal173);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:305:12: 'triggerCond'
                    {
                    string_literal174=(Token)match(input,229,FOLLOW_229_in_triggerCondProperty1899);  
                    stream_229.add(string_literal174);


                    }
                    break;

            }


            char_literal175=(Token)match(input,238,FOLLOW_238_in_triggerCondProperty1902);  
            stream_238.add(char_literal175);


            pushFollow(FOLLOW_queryLogic_in_triggerCondProperty1904);
            queryLogic176=queryLogic();

            state._fsp--;

            stream_queryLogic.add(queryLogic176.getTree());

            char_literal177=(Token)match(input,239,FOLLOW_239_in_triggerCondProperty1906);  
            stream_239.add(char_literal177);


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

        Token string_literal178=null;
        Token string_literal179=null;
        Token char_literal180=null;
        Token char_literal182=null;
        AtrophyScriptParser.triggerEffectList_return triggerEffectList181 =null;


        CommonTree string_literal178_tree=null;
        CommonTree string_literal179_tree=null;
        CommonTree char_literal180_tree=null;
        CommonTree char_literal182_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_223=new RewriteRuleTokenStream(adaptor,"token 223");
        RewriteRuleTokenStream stream_230=new RewriteRuleTokenStream(adaptor,"token 230");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_triggerEffectList=new RewriteRuleSubtreeStream(adaptor,"rule triggerEffectList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:308:22: ( ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}' -> ^( TRIGGEREFFECT triggerEffectList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:4: ( 'te' | 'triggerEffect' ) '{' triggerEffectList '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:4: ( 'te' | 'triggerEffect' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==223) ) {
                alt32=1;
            }
            else if ( (LA32_0==230) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:5: 'te'
                    {
                    string_literal178=(Token)match(input,223,FOLLOW_223_in_triggerEffectProperty1928);  
                    stream_223.add(string_literal178);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:309:12: 'triggerEffect'
                    {
                    string_literal179=(Token)match(input,230,FOLLOW_230_in_triggerEffectProperty1932);  
                    stream_230.add(string_literal179);


                    }
                    break;

            }


            char_literal180=(Token)match(input,238,FOLLOW_238_in_triggerEffectProperty1935);  
            stream_238.add(char_literal180);


            pushFollow(FOLLOW_triggerEffectList_in_triggerEffectProperty1937);
            triggerEffectList181=triggerEffectList();

            state._fsp--;

            stream_triggerEffectList.add(triggerEffectList181.getTree());

            char_literal182=(Token)match(input,239,FOLLOW_239_in_triggerEffectProperty1939);  
            stream_239.add(char_literal182);


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


    public static class textureProperty_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "textureProperty"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:312:1: textureProperty : 'texture' ':' stringLiteral -> ^( TEXTURE stringLiteral ) ;
    public final AtrophyScriptParser.textureProperty_return textureProperty() throws RecognitionException {
        AtrophyScriptParser.textureProperty_return retval = new AtrophyScriptParser.textureProperty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal183=null;
        Token char_literal184=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral185 =null;


        CommonTree string_literal183_tree=null;
        CommonTree char_literal184_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_226=new RewriteRuleTokenStream(adaptor,"token 226");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:312:16: ( 'texture' ':' stringLiteral -> ^( TEXTURE stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:313:4: 'texture' ':' stringLiteral
            {
            string_literal183=(Token)match(input,226,FOLLOW_226_in_textureProperty1962);  
            stream_226.add(string_literal183);


            char_literal184=(Token)match(input,128,FOLLOW_128_in_textureProperty1964);  
            stream_128.add(char_literal184);


            pushFollow(FOLLOW_stringLiteral_in_textureProperty1966);
            stringLiteral185=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral185.getTree());

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
            // 313:32: -> ^( TEXTURE stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:313:35: ^( TEXTURE stringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TEXTURE, "TEXTURE")
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
    // $ANTLR end "textureProperty"


    public static class coverDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "coverDecl"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:316:1: coverDecl : ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) ;
    public final AtrophyScriptParser.coverDecl_return coverDecl() throws RecognitionException {
        AtrophyScriptParser.coverDecl_return retval = new AtrophyScriptParser.coverDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal186=null;
        Token string_literal187=null;
        Token char_literal189=null;
        Token char_literal191=null;
        AtrophyScriptParser.varAssignment_return varAssignment188 =null;

        AtrophyScriptParser.properties_return properties190 =null;


        CommonTree string_literal186_tree=null;
        CommonTree string_literal187_tree=null;
        CommonTree char_literal189_tree=null;
        CommonTree char_literal191_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:316:10: ( ( 'COVER' | 'cover' ) varAssignment '{' properties '}' -> ^( COVER varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:4: ( 'COVER' | 'cover' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:4: ( 'COVER' | 'cover' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==134) ) {
                alt33=1;
            }
            else if ( (LA33_0==163) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:5: 'COVER'
                    {
                    string_literal186=(Token)match(input,134,FOLLOW_134_in_coverDecl1988);  
                    stream_134.add(string_literal186);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:15: 'cover'
                    {
                    string_literal187=(Token)match(input,163,FOLLOW_163_in_coverDecl1992);  
                    stream_163.add(string_literal187);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_coverDecl1995);
            varAssignment188=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment188.getTree());

            char_literal189=(Token)match(input,238,FOLLOW_238_in_coverDecl1997);  
            stream_238.add(char_literal189);


            pushFollow(FOLLOW_properties_in_coverDecl1999);
            properties190=properties();

            state._fsp--;

            stream_properties.add(properties190.getTree());

            char_literal191=(Token)match(input,239,FOLLOW_239_in_coverDecl2001);  
            stream_239.add(char_literal191);


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
            // 317:57: -> ^( COVER varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:317:60: ^( COVER varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:320:1: stashDecl : ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) ;
    public final AtrophyScriptParser.stashDecl_return stashDecl() throws RecognitionException {
        AtrophyScriptParser.stashDecl_return retval = new AtrophyScriptParser.stashDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal192=null;
        Token string_literal193=null;
        Token char_literal195=null;
        Token char_literal197=null;
        AtrophyScriptParser.varAssignment_return varAssignment194 =null;

        AtrophyScriptParser.properties_return properties196 =null;


        CommonTree string_literal192_tree=null;
        CommonTree string_literal193_tree=null;
        CommonTree char_literal195_tree=null;
        CommonTree char_literal197_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_218=new RewriteRuleTokenStream(adaptor,"token 218");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_varAssignment=new RewriteRuleSubtreeStream(adaptor,"rule varAssignment");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:320:10: ( ( 'STASH' | 'stash' ) varAssignment '{' properties '}' -> ^( STASH varAssignment properties ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:321:4: ( 'STASH' | 'stash' ) varAssignment '{' properties '}'
            {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:321:4: ( 'STASH' | 'stash' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==147) ) {
                alt34=1;
            }
            else if ( (LA34_0==218) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:321:5: 'STASH'
                    {
                    string_literal192=(Token)match(input,147,FOLLOW_147_in_stashDecl2027);  
                    stream_147.add(string_literal192);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:321:15: 'stash'
                    {
                    string_literal193=(Token)match(input,218,FOLLOW_218_in_stashDecl2031);  
                    stream_218.add(string_literal193);


                    }
                    break;

            }


            pushFollow(FOLLOW_varAssignment_in_stashDecl2034);
            varAssignment194=varAssignment();

            state._fsp--;

            stream_varAssignment.add(varAssignment194.getTree());

            char_literal195=(Token)match(input,238,FOLLOW_238_in_stashDecl2036);  
            stream_238.add(char_literal195);


            pushFollow(FOLLOW_properties_in_stashDecl2038);
            properties196=properties();

            state._fsp--;

            stream_properties.add(properties196.getTree());

            char_literal197=(Token)match(input,239,FOLLOW_239_in_stashDecl2040);  
            stream_239.add(char_literal197);


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
            // 321:57: -> ^( STASH varAssignment properties )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:321:60: ^( STASH varAssignment properties )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:324:1: triggerEffectList : triggerEffect ( ',' ! triggerEffect )* ;
    public final AtrophyScriptParser.triggerEffectList_return triggerEffectList() throws RecognitionException {
        AtrophyScriptParser.triggerEffectList_return retval = new AtrophyScriptParser.triggerEffectList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal199=null;
        AtrophyScriptParser.triggerEffect_return triggerEffect198 =null;

        AtrophyScriptParser.triggerEffect_return triggerEffect200 =null;


        CommonTree char_literal199_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:324:18: ( triggerEffect ( ',' ! triggerEffect )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:325:4: triggerEffect ( ',' ! triggerEffect )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_triggerEffect_in_triggerEffectList2063);
            triggerEffect198=triggerEffect();

            state._fsp--;

            adaptor.addChild(root_0, triggerEffect198.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:325:18: ( ',' ! triggerEffect )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==126) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:325:19: ',' ! triggerEffect
            	    {
            	    char_literal199=(Token)match(input,126,FOLLOW_126_in_triggerEffectList2066); 

            	    pushFollow(FOLLOW_triggerEffect_in_triggerEffectList2069);
            	    triggerEffect200=triggerEffect();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerEffect200.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:328:1: triggerEffect : ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | showMessage | setTriggerRunning | spawnItem | removeItem | spawnTalkNode | unlockTech | changeStat | commandCallList );
    public final AtrophyScriptParser.triggerEffect_return triggerEffect() throws RecognitionException {
        AtrophyScriptParser.triggerEffect_return retval = new AtrophyScriptParser.triggerEffect_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.updateTalkTree_return updateTalkTree201 =null;

        AtrophyScriptParser.spawnTeam_return spawnTeam202 =null;

        AtrophyScriptParser.spawnCharacter_return spawnCharacter203 =null;

        AtrophyScriptParser.removeUnit_return removeUnit204 =null;

        AtrophyScriptParser.killUnit_return killUnit205 =null;

        AtrophyScriptParser.teleportUnit_return teleportUnit206 =null;

        AtrophyScriptParser.converseUnit_return converseUnit207 =null;

        AtrophyScriptParser.createSaferoom_return createSaferoom208 =null;

        AtrophyScriptParser.removeSaferoom_return removeSaferoom209 =null;

        AtrophyScriptParser.loadMap_return loadMap210 =null;

        AtrophyScriptParser.lockDoor_return lockDoor211 =null;

        AtrophyScriptParser.unlockDoor_return unlockDoor212 =null;

        AtrophyScriptParser.addTag_return addTag213 =null;

        AtrophyScriptParser.removeTag_return removeTag214 =null;

        AtrophyScriptParser.directorBias_return directorBias215 =null;

        AtrophyScriptParser.changeAiNode_return changeAiNode216 =null;

        AtrophyScriptParser.showMessage_return showMessage217 =null;

        AtrophyScriptParser.setTriggerRunning_return setTriggerRunning218 =null;

        AtrophyScriptParser.spawnItem_return spawnItem219 =null;

        AtrophyScriptParser.removeItem_return removeItem220 =null;

        AtrophyScriptParser.spawnTalkNode_return spawnTalkNode221 =null;

        AtrophyScriptParser.unlockTech_return unlockTech222 =null;

        AtrophyScriptParser.changeStat_return changeStat223 =null;

        AtrophyScriptParser.commandCallList_return commandCallList224 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:328:14: ( updateTalkTree | spawnTeam | spawnCharacter | removeUnit | killUnit | teleportUnit | converseUnit | createSaferoom | removeSaferoom | loadMap | lockDoor | unlockDoor | addTag | removeTag | directorBias | changeAiNode | showMessage | setTriggerRunning | spawnItem | removeItem | spawnTalkNode | unlockTech | changeStat | commandCallList )
            int alt36=24;
            switch ( input.LA(1) ) {
            case UPDATE_TREE_PREFIX:
            case 233:
                {
                alt36=1;
                }
                break;
            case 215:
                {
                alt36=2;
                }
                break;
            case 212:
                {
                alt36=3;
                }
                break;
            case 204:
                {
                alt36=4;
                }
                break;
            case 182:
                {
                alt36=5;
                }
                break;
            case 224:
                {
                alt36=6;
                }
                break;
            case 162:
                {
                alt36=7;
                }
                break;
            case 207:
                {
                alt36=8;
                }
                break;
            case 202:
                {
                alt36=9;
                }
                break;
            case 185:
                {
                alt36=10;
                }
                break;
            case 186:
                {
                alt36=11;
                }
                break;
            case 231:
                {
                alt36=12;
                }
                break;
            case ADD_TAG_PREFIX:
            case 151:
                {
                alt36=13;
                }
                break;
            case REMOVE_TAG_PREFIX:
            case 203:
                {
                alt36=14;
                }
                break;
            case 165:
                {
                alt36=15;
                }
                break;
            case 158:
                {
                alt36=16;
                }
                break;
            case 211:
                {
                alt36=17;
                }
                break;
            case 210:
                {
                alt36=18;
                }
                break;
            case 213:
                {
                alt36=19;
                }
                break;
            case 201:
                {
                alt36=20;
                }
                break;
            case 214:
                {
                alt36=21;
                }
                break;
            case 232:
                {
                alt36=22;
                }
                break;
            case 157:
            case 159:
                {
                alt36=23;
                }
                break;
            case COMMAND_CALL_PREFIX:
            case 138:
            case 140:
            case 156:
            case 188:
                {
                alt36=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:329:4: updateTalkTree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_updateTalkTree_in_triggerEffect2084);
                    updateTalkTree201=updateTalkTree();

                    state._fsp--;

                    adaptor.addChild(root_0, updateTalkTree201.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:330:6: spawnTeam
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnTeam_in_triggerEffect2091);
                    spawnTeam202=spawnTeam();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnTeam202.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:331:6: spawnCharacter
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnCharacter_in_triggerEffect2098);
                    spawnCharacter203=spawnCharacter();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnCharacter203.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:332:6: removeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeUnit_in_triggerEffect2105);
                    removeUnit204=removeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, removeUnit204.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:333:6: killUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_killUnit_in_triggerEffect2112);
                    killUnit205=killUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, killUnit205.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:334:6: teleportUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_teleportUnit_in_triggerEffect2119);
                    teleportUnit206=teleportUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, teleportUnit206.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:335:6: converseUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_converseUnit_in_triggerEffect2126);
                    converseUnit207=converseUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, converseUnit207.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:336:6: createSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_createSaferoom_in_triggerEffect2133);
                    createSaferoom208=createSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, createSaferoom208.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:337:6: removeSaferoom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeSaferoom_in_triggerEffect2140);
                    removeSaferoom209=removeSaferoom();

                    state._fsp--;

                    adaptor.addChild(root_0, removeSaferoom209.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:338:6: loadMap
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_loadMap_in_triggerEffect2147);
                    loadMap210=loadMap();

                    state._fsp--;

                    adaptor.addChild(root_0, loadMap210.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:339:6: lockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lockDoor_in_triggerEffect2154);
                    lockDoor211=lockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, lockDoor211.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:340:6: unlockDoor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unlockDoor_in_triggerEffect2161);
                    unlockDoor212=unlockDoor();

                    state._fsp--;

                    adaptor.addChild(root_0, unlockDoor212.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:341:6: addTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_addTag_in_triggerEffect2168);
                    addTag213=addTag();

                    state._fsp--;

                    adaptor.addChild(root_0, addTag213.getTree());

                    }
                    break;
                case 14 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:342:6: removeTag
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeTag_in_triggerEffect2175);
                    removeTag214=removeTag();

                    state._fsp--;

                    adaptor.addChild(root_0, removeTag214.getTree());

                    }
                    break;
                case 15 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:343:6: directorBias
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_directorBias_in_triggerEffect2182);
                    directorBias215=directorBias();

                    state._fsp--;

                    adaptor.addChild(root_0, directorBias215.getTree());

                    }
                    break;
                case 16 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:344:6: changeAiNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_changeAiNode_in_triggerEffect2189);
                    changeAiNode216=changeAiNode();

                    state._fsp--;

                    adaptor.addChild(root_0, changeAiNode216.getTree());

                    }
                    break;
                case 17 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:345:6: showMessage
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_showMessage_in_triggerEffect2196);
                    showMessage217=showMessage();

                    state._fsp--;

                    adaptor.addChild(root_0, showMessage217.getTree());

                    }
                    break;
                case 18 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:346:6: setTriggerRunning
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_setTriggerRunning_in_triggerEffect2203);
                    setTriggerRunning218=setTriggerRunning();

                    state._fsp--;

                    adaptor.addChild(root_0, setTriggerRunning218.getTree());

                    }
                    break;
                case 19 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:347:6: spawnItem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnItem_in_triggerEffect2210);
                    spawnItem219=spawnItem();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnItem219.getTree());

                    }
                    break;
                case 20 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:348:6: removeItem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_removeItem_in_triggerEffect2217);
                    removeItem220=removeItem();

                    state._fsp--;

                    adaptor.addChild(root_0, removeItem220.getTree());

                    }
                    break;
                case 21 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:349:6: spawnTalkNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spawnTalkNode_in_triggerEffect2224);
                    spawnTalkNode221=spawnTalkNode();

                    state._fsp--;

                    adaptor.addChild(root_0, spawnTalkNode221.getTree());

                    }
                    break;
                case 22 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:350:6: unlockTech
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unlockTech_in_triggerEffect2231);
                    unlockTech222=unlockTech();

                    state._fsp--;

                    adaptor.addChild(root_0, unlockTech222.getTree());

                    }
                    break;
                case 23 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:351:6: changeStat
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_changeStat_in_triggerEffect2238);
                    changeStat223=changeStat();

                    state._fsp--;

                    adaptor.addChild(root_0, changeStat223.getTree());

                    }
                    break;
                case 24 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:352:6: commandCallList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_commandCallList_in_triggerEffect2245);
                    commandCallList224=commandCallList();

                    state._fsp--;

                    adaptor.addChild(root_0, commandCallList224.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:1: updateTalkTree : ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) );
    public final AtrophyScriptParser.updateTalkTree_return updateTalkTree() throws RecognitionException {
        AtrophyScriptParser.updateTalkTree_return retval = new AtrophyScriptParser.updateTalkTree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal225=null;
        Token INT227=null;
        Token UPDATE_TREE_PREFIX228=null;
        Token char_literal230=null;
        Token INT231=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral226 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral229 =null;


        CommonTree string_literal225_tree=null;
        CommonTree INT227_tree=null;
        CommonTree UPDATE_TREE_PREFIX228_tree=null;
        CommonTree char_literal230_tree=null;
        CommonTree INT231_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_UPDATE_TREE_PREFIX=new RewriteRuleTokenStream(adaptor,"token UPDATE_TREE_PREFIX");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:355:15: ( 'updateTalk:' stringLiteral INT -> ^( UPDATETALK stringLiteral INT ) | UPDATE_TREE_PREFIX stringLiteral '#' INT -> ^( UPDATETALK stringLiteral INT ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==233) ) {
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:4: 'updateTalk:' stringLiteral INT
                    {
                    string_literal225=(Token)match(input,233,FOLLOW_233_in_updateTalkTree2260);  
                    stream_233.add(string_literal225);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree2262);
                    stringLiteral226=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral226.getTree());

                    INT227=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree2264);  
                    stream_INT.add(INT227);


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
                    // 356:36: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:356:39: ^( UPDATETALK stringLiteral INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:357:6: UPDATE_TREE_PREFIX stringLiteral '#' INT
                    {
                    UPDATE_TREE_PREFIX228=(Token)match(input,UPDATE_TREE_PREFIX,FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree2281);  
                    stream_UPDATE_TREE_PREFIX.add(UPDATE_TREE_PREFIX228);


                    pushFollow(FOLLOW_stringLiteral_in_updateTalkTree2283);
                    stringLiteral229=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral229.getTree());

                    char_literal230=(Token)match(input,123,FOLLOW_123_in_updateTalkTree2285);  
                    stream_123.add(char_literal230);


                    INT231=(Token)match(input,INT,FOLLOW_INT_in_updateTalkTree2287);  
                    stream_INT.add(INT231);


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
                    // 357:47: -> ^( UPDATETALK stringLiteral INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:357:50: ^( UPDATETALK stringLiteral INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:1: isName : 'isName:' stringList -> ^( ISNAME stringList ) ;
    public final AtrophyScriptParser.isName_return isName() throws RecognitionException {
        AtrophyScriptParser.isName_return retval = new AtrophyScriptParser.isName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal232=null;
        AtrophyScriptParser.stringList_return stringList233 =null;


        CommonTree string_literal232_tree=null;
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:360:7: ( 'isName:' stringList -> ^( ISNAME stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:361:4: 'isName:' stringList
            {
            string_literal232=(Token)match(input,177,FOLLOW_177_in_isName2312);  
            stream_177.add(string_literal232);


            pushFollow(FOLLOW_stringList_in_isName2314);
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
            // 361:25: -> ^( ISNAME stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:361:28: ^( ISNAME stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:364:1: isFaction : 'isFaction:' stringList -> ^( ISFACTION stringList ) ;
    public final AtrophyScriptParser.isFaction_return isFaction() throws RecognitionException {
        AtrophyScriptParser.isFaction_return retval = new AtrophyScriptParser.isFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal234=null;
        AtrophyScriptParser.stringList_return stringList235 =null;


        CommonTree string_literal234_tree=null;
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:364:10: ( 'isFaction:' stringList -> ^( ISFACTION stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:365:4: 'isFaction:' stringList
            {
            string_literal234=(Token)match(input,174,FOLLOW_174_in_isFaction2337);  
            stream_174.add(string_literal234);


            pushFollow(FOLLOW_stringList_in_isFaction2339);
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
            // 365:28: -> ^( ISFACTION stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:365:31: ^( ISFACTION stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:368:1: isRoom : 'isRoom:' stringList -> ^( ISROOM stringList ) ;
    public final AtrophyScriptParser.isRoom_return isRoom() throws RecognitionException {
        AtrophyScriptParser.isRoom_return retval = new AtrophyScriptParser.isRoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal236=null;
        AtrophyScriptParser.stringList_return stringList237 =null;


        CommonTree string_literal236_tree=null;
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:368:7: ( 'isRoom:' stringList -> ^( ISROOM stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:369:4: 'isRoom:' stringList
            {
            string_literal236=(Token)match(input,181,FOLLOW_181_in_isRoom2362);  
            stream_181.add(string_literal236);


            pushFollow(FOLLOW_stringList_in_isRoom2364);
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
            // 369:25: -> ^( ISROOM stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:369:28: ^( ISROOM stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:372:1: hasItem : 'hasItem:' stringList -> ^( HASITEM stringList ) ;
    public final AtrophyScriptParser.hasItem_return hasItem() throws RecognitionException {
        AtrophyScriptParser.hasItem_return retval = new AtrophyScriptParser.hasItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal238=null;
        AtrophyScriptParser.stringList_return stringList239 =null;


        CommonTree string_literal238_tree=null;
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:372:8: ( 'hasItem:' stringList -> ^( HASITEM stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:373:4: 'hasItem:' stringList
            {
            string_literal238=(Token)match(input,169,FOLLOW_169_in_hasItem2387);  
            stream_169.add(string_literal238);


            pushFollow(FOLLOW_stringList_in_hasItem2389);
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
            // 373:26: -> ^( HASITEM stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:373:29: ^( HASITEM stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:1: hasWeapon : 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) ;
    public final AtrophyScriptParser.hasWeapon_return hasWeapon() throws RecognitionException {
        AtrophyScriptParser.hasWeapon_return retval = new AtrophyScriptParser.hasWeapon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal240=null;
        AtrophyScriptParser.stringList_return stringList241 =null;


        CommonTree string_literal240_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:376:10: ( 'hasWeapon:' stringList -> ^( HASWEAPON stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:377:4: 'hasWeapon:' stringList
            {
            string_literal240=(Token)match(input,170,FOLLOW_170_in_hasWeapon2412);  
            stream_170.add(string_literal240);


            pushFollow(FOLLOW_stringList_in_hasWeapon2414);
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
            // 377:28: -> ^( HASWEAPON stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:377:31: ^( HASWEAPON stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:380:1: stringList : stringLiteral ( ',' stringLiteral )* -> ( ^( STRING stringLiteral ) )* ;
    public final AtrophyScriptParser.stringList_return stringList() throws RecognitionException {
        AtrophyScriptParser.stringList_return retval = new AtrophyScriptParser.stringList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal243=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral242 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral244 =null;


        CommonTree char_literal243_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:380:11: ( stringLiteral ( ',' stringLiteral )* -> ( ^( STRING stringLiteral ) )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:381:4: stringLiteral ( ',' stringLiteral )*
            {
            pushFollow(FOLLOW_stringLiteral_in_stringList2437);
            stringLiteral242=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral242.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:381:18: ( ',' stringLiteral )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==126) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==STRING) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:381:19: ',' stringLiteral
            	    {
            	    char_literal243=(Token)match(input,126,FOLLOW_126_in_stringList2440);  
            	    stream_126.add(char_literal243);


            	    pushFollow(FOLLOW_stringLiteral_in_stringList2442);
            	    stringLiteral244=stringLiteral();

            	    state._fsp--;

            	    stream_stringLiteral.add(stringLiteral244.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
            // 381:39: -> ( ^( STRING stringLiteral ) )*
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:381:42: ( ^( STRING stringLiteral ) )*
                while ( stream_stringLiteral.hasNext() ) {
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:381:42: ^( STRING stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:384:1: isAlive : 'isAlive' -> ^( ISALIVE ) ;
    public final AtrophyScriptParser.isAlive_return isAlive() throws RecognitionException {
        AtrophyScriptParser.isAlive_return retval = new AtrophyScriptParser.isAlive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal245=null;

        CommonTree string_literal245_tree=null;
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:384:8: ( 'isAlive' -> ^( ISALIVE ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:385:4: 'isAlive'
            {
            string_literal245=(Token)match(input,171,FOLLOW_171_in_isAlive2466);  
            stream_171.add(string_literal245);


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
            // 385:14: -> ^( ISALIVE )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:385:17: ^( ISALIVE )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:388:1: isDead : 'isDead' -> ^( ISDEAD ) ;
    public final AtrophyScriptParser.isDead_return isDead() throws RecognitionException {
        AtrophyScriptParser.isDead_return retval = new AtrophyScriptParser.isDead_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal246=null;

        CommonTree string_literal246_tree=null;
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:388:7: ( 'isDead' -> ^( ISDEAD ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:389:4: 'isDead'
            {
            string_literal246=(Token)match(input,173,FOLLOW_173_in_isDead2487);  
            stream_173.add(string_literal246);


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
            // 389:13: -> ^( ISDEAD )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:389:16: ^( ISDEAD )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:392:1: isInvestigated : 'isInvestigated' -> ^( ISINVESTIGATED ) ;
    public final AtrophyScriptParser.isInvestigated_return isInvestigated() throws RecognitionException {
        AtrophyScriptParser.isInvestigated_return retval = new AtrophyScriptParser.isInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal247=null;

        CommonTree string_literal247_tree=null;
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:392:15: ( 'isInvestigated' -> ^( ISINVESTIGATED ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:393:4: 'isInvestigated'
            {
            string_literal247=(Token)match(input,176,FOLLOW_176_in_isInvestigated2508);  
            stream_176.add(string_literal247);


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
            // 393:21: -> ^( ISINVESTIGATED )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:393:24: ^( ISINVESTIGATED )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:396:1: isNotInvestigated : 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) ;
    public final AtrophyScriptParser.isNotInvestigated_return isNotInvestigated() throws RecognitionException {
        AtrophyScriptParser.isNotInvestigated_return retval = new AtrophyScriptParser.isNotInvestigated_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal248=null;

        CommonTree string_literal248_tree=null;
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:396:18: ( 'isNotInvestigated' -> ^( ISNOTINVESTIGATED ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:397:4: 'isNotInvestigated'
            {
            string_literal248=(Token)match(input,179,FOLLOW_179_in_isNotInvestigated2529);  
            stream_179.add(string_literal248);


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
            // 397:24: -> ^( ISNOTINVESTIGATED )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:397:27: ^( ISNOTINVESTIGATED )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:400:1: isDaemon : 'isDaemon' -> ^( ISDAEMON ) ;
    public final AtrophyScriptParser.isDaemon_return isDaemon() throws RecognitionException {
        AtrophyScriptParser.isDaemon_return retval = new AtrophyScriptParser.isDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal249=null;

        CommonTree string_literal249_tree=null;
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:400:9: ( 'isDaemon' -> ^( ISDAEMON ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:401:4: 'isDaemon'
            {
            string_literal249=(Token)match(input,172,FOLLOW_172_in_isDaemon2550);  
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
            // 401:15: -> ^( ISDAEMON )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:401:18: ^( ISDAEMON )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:404:1: isNotDaemon : 'isNotDaemon' -> ^( ISNOTDAEMON ) ;
    public final AtrophyScriptParser.isNotDaemon_return isNotDaemon() throws RecognitionException {
        AtrophyScriptParser.isNotDaemon_return retval = new AtrophyScriptParser.isNotDaemon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal250=null;

        CommonTree string_literal250_tree=null;
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:404:12: ( 'isNotDaemon' -> ^( ISNOTDAEMON ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:405:4: 'isNotDaemon'
            {
            string_literal250=(Token)match(input,178,FOLLOW_178_in_isNotDaemon2569);  
            stream_178.add(string_literal250);


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
            // 405:18: -> ^( ISNOTDAEMON )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:405:21: ^( ISNOTDAEMON )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:408:1: teleDestination : 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) ;
    public final AtrophyScriptParser.teleDestination_return teleDestination() throws RecognitionException {
        AtrophyScriptParser.teleDestination_return retval = new AtrophyScriptParser.teleDestination_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal251=null;
        Token char_literal252=null;
        Token char_literal255=null;
        AtrophyScriptParser.xListProperty_return xListProperty253 =null;

        AtrophyScriptParser.yListProperty_return yListProperty254 =null;


        CommonTree string_literal251_tree=null;
        CommonTree char_literal252_tree=null;
        CommonTree char_literal255_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_yListProperty=new RewriteRuleSubtreeStream(adaptor,"rule yListProperty");
        RewriteRuleSubtreeStream stream_xListProperty=new RewriteRuleSubtreeStream(adaptor,"rule xListProperty");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:408:16: ( 'destination' '{' xListProperty yListProperty '}' -> ^( TELEDEST xListProperty yListProperty ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:409:4: 'destination' '{' xListProperty yListProperty '}'
            {
            string_literal251=(Token)match(input,164,FOLLOW_164_in_teleDestination2590);  
            stream_164.add(string_literal251);


            char_literal252=(Token)match(input,238,FOLLOW_238_in_teleDestination2592);  
            stream_238.add(char_literal252);


            pushFollow(FOLLOW_xListProperty_in_teleDestination2594);
            xListProperty253=xListProperty();

            state._fsp--;

            stream_xListProperty.add(xListProperty253.getTree());

            pushFollow(FOLLOW_yListProperty_in_teleDestination2596);
            yListProperty254=yListProperty();

            state._fsp--;

            stream_yListProperty.add(yListProperty254.getTree());

            char_literal255=(Token)match(input,239,FOLLOW_239_in_teleDestination2598);  
            stream_239.add(char_literal255);


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
            // 409:54: -> ^( TELEDEST xListProperty yListProperty )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:409:57: ^( TELEDEST xListProperty yListProperty )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:412:1: maxTeamSize : 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) ;
    public final AtrophyScriptParser.maxTeamSize_return maxTeamSize() throws RecognitionException {
        AtrophyScriptParser.maxTeamSize_return retval = new AtrophyScriptParser.maxTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal256=null;
        Token INT257=null;

        CommonTree string_literal256_tree=null;
        CommonTree INT257_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:412:12: ( 'maxTeamSize:' INT -> ^( MAXTEAMSIZE INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:413:4: 'maxTeamSize:' INT
            {
            string_literal256=(Token)match(input,189,FOLLOW_189_in_maxTeamSize2623);  
            stream_189.add(string_literal256);


            INT257=(Token)match(input,INT,FOLLOW_INT_in_maxTeamSize2625);  
            stream_INT.add(INT257);


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
            // 413:23: -> ^( MAXTEAMSIZE INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:413:26: ^( MAXTEAMSIZE INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:416:1: minTeamSize : 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) ;
    public final AtrophyScriptParser.minTeamSize_return minTeamSize() throws RecognitionException {
        AtrophyScriptParser.minTeamSize_return retval = new AtrophyScriptParser.minTeamSize_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal258=null;
        Token INT259=null;

        CommonTree string_literal258_tree=null;
        CommonTree INT259_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:416:12: ( 'minTeamSize:' INT -> ^( MINTEAMSIZE INT ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:417:4: 'minTeamSize:' INT
            {
            string_literal258=(Token)match(input,191,FOLLOW_191_in_minTeamSize2646);  
            stream_191.add(string_literal258);


            INT259=(Token)match(input,INT,FOLLOW_INT_in_minTeamSize2648);  
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
            // 417:23: -> ^( MINTEAMSIZE INT )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:417:26: ^( MINTEAMSIZE INT )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:420:1: isPlayer : 'isPlayer' -> ^( ISPLAYER ) ;
    public final AtrophyScriptParser.isPlayer_return isPlayer() throws RecognitionException {
        AtrophyScriptParser.isPlayer_return retval = new AtrophyScriptParser.isPlayer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal260=null;

        CommonTree string_literal260_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:420:9: ( 'isPlayer' -> ^( ISPLAYER ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:421:4: 'isPlayer'
            {
            string_literal260=(Token)match(input,180,FOLLOW_180_in_isPlayer2671);  
            stream_180.add(string_literal260);


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
            // 421:15: -> ^( ISPLAYER )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:421:18: ^( ISPLAYER )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:1: aiNode : 'aiNode' '{' aiNodeOptions '}' -> ^( AINODE aiNodeOptions ) ;
    public final AtrophyScriptParser.aiNode_return aiNode() throws RecognitionException {
        AtrophyScriptParser.aiNode_return retval = new AtrophyScriptParser.aiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal261=null;
        Token char_literal262=null;
        Token char_literal264=null;
        AtrophyScriptParser.aiNodeOptions_return aiNodeOptions263 =null;


        CommonTree string_literal261_tree=null;
        CommonTree char_literal262_tree=null;
        CommonTree char_literal264_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_aiNodeOptions=new RewriteRuleSubtreeStream(adaptor,"rule aiNodeOptions");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:424:7: ( 'aiNode' '{' aiNodeOptions '}' -> ^( AINODE aiNodeOptions ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:425:4: 'aiNode' '{' aiNodeOptions '}'
            {
            string_literal261=(Token)match(input,153,FOLLOW_153_in_aiNode2692);  
            stream_153.add(string_literal261);


            char_literal262=(Token)match(input,238,FOLLOW_238_in_aiNode2694);  
            stream_238.add(char_literal262);


            pushFollow(FOLLOW_aiNodeOptions_in_aiNode2696);
            aiNodeOptions263=aiNodeOptions();

            state._fsp--;

            stream_aiNodeOptions.add(aiNodeOptions263.getTree());

            char_literal264=(Token)match(input,239,FOLLOW_239_in_aiNode2698);  
            stream_239.add(char_literal264);


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
            // 425:35: -> ^( AINODE aiNodeOptions )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:425:38: ^( AINODE aiNodeOptions )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:428:1: aiNodeOptions : ( subscribeTalkMaps | behaviours | aiNodePriority )* ;
    public final AtrophyScriptParser.aiNodeOptions_return aiNodeOptions() throws RecognitionException {
        AtrophyScriptParser.aiNodeOptions_return retval = new AtrophyScriptParser.aiNodeOptions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps265 =null;

        AtrophyScriptParser.behaviours_return behaviours266 =null;

        AtrophyScriptParser.aiNodePriority_return aiNodePriority267 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:428:14: ( ( subscribeTalkMaps | behaviours | aiNodePriority )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:429:3: ( subscribeTalkMaps | behaviours | aiNodePriority )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:429:3: ( subscribeTalkMaps | behaviours | aiNodePriority )*
            loop39:
            do {
                int alt39=4;
                switch ( input.LA(1) ) {
                case 219:
                    {
                    alt39=1;
                    }
                    break;
                case 154:
                    {
                    alt39=2;
                    }
                    break;
                case 200:
                    {
                    alt39=3;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:429:4: subscribeTalkMaps
            	    {
            	    pushFollow(FOLLOW_subscribeTalkMaps_in_aiNodeOptions2721);
            	    subscribeTalkMaps265=subscribeTalkMaps();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subscribeTalkMaps265.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:430:4: behaviours
            	    {
            	    pushFollow(FOLLOW_behaviours_in_aiNodeOptions2726);
            	    behaviours266=behaviours();

            	    state._fsp--;

            	    adaptor.addChild(root_0, behaviours266.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:431:4: aiNodePriority
            	    {
            	    pushFollow(FOLLOW_aiNodePriority_in_aiNodeOptions2731);
            	    aiNodePriority267=aiNodePriority();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiNodePriority267.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:434:1: subscribeTalkMaps : 'subscribe:' stringList -> ^( SUBSCRIBE stringList ) ;
    public final AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps() throws RecognitionException {
        AtrophyScriptParser.subscribeTalkMaps_return retval = new AtrophyScriptParser.subscribeTalkMaps_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal268=null;
        AtrophyScriptParser.stringList_return stringList269 =null;


        CommonTree string_literal268_tree=null;
        RewriteRuleTokenStream stream_219=new RewriteRuleTokenStream(adaptor,"token 219");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:434:18: ( 'subscribe:' stringList -> ^( SUBSCRIBE stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:435:4: 'subscribe:' stringList
            {
            string_literal268=(Token)match(input,219,FOLLOW_219_in_subscribeTalkMaps2748);  
            stream_219.add(string_literal268);


            pushFollow(FOLLOW_stringList_in_subscribeTalkMaps2749);
            stringList269=stringList();

            state._fsp--;

            stream_stringList.add(stringList269.getTree());

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
            // 435:27: -> ^( SUBSCRIBE stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:435:30: ^( SUBSCRIBE stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:438:1: behaviours : 'behaviours:' stringList -> ^( BEHAVIOUR stringList ) ;
    public final AtrophyScriptParser.behaviours_return behaviours() throws RecognitionException {
        AtrophyScriptParser.behaviours_return retval = new AtrophyScriptParser.behaviours_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal270=null;
        AtrophyScriptParser.stringList_return stringList271 =null;


        CommonTree string_literal270_tree=null;
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:438:11: ( 'behaviours:' stringList -> ^( BEHAVIOUR stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:439:4: 'behaviours:' stringList
            {
            string_literal270=(Token)match(input,154,FOLLOW_154_in_behaviours2772);  
            stream_154.add(string_literal270);


            pushFollow(FOLLOW_stringList_in_behaviours2774);
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
            // 439:29: -> ^( BEHAVIOUR stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:439:32: ^( BEHAVIOUR stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:442:1: aiNodePriority : 'priority:' stringList -> ^( PRIORITY stringList ) ;
    public final AtrophyScriptParser.aiNodePriority_return aiNodePriority() throws RecognitionException {
        AtrophyScriptParser.aiNodePriority_return retval = new AtrophyScriptParser.aiNodePriority_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal272=null;
        AtrophyScriptParser.stringList_return stringList273 =null;


        CommonTree string_literal272_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:442:15: ( 'priority:' stringList -> ^( PRIORITY stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:443:4: 'priority:' stringList
            {
            string_literal272=(Token)match(input,200,FOLLOW_200_in_aiNodePriority2797);  
            stream_200.add(string_literal272);


            pushFollow(FOLLOW_stringList_in_aiNodePriority2799);
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
            // 443:27: -> ^( PRIORITY stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:443:30: ^( PRIORITY stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:446:1: unitInfo : ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )* ;
    public final AtrophyScriptParser.unitInfo_return unitInfo() throws RecognitionException {
        AtrophyScriptParser.unitInfo_return retval = new AtrophyScriptParser.unitInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName274 =null;

        AtrophyScriptParser.isFaction_return isFaction275 =null;

        AtrophyScriptParser.isRoom_return isRoom276 =null;

        AtrophyScriptParser.hasItem_return hasItem277 =null;

        AtrophyScriptParser.hasWeapon_return hasWeapon278 =null;

        AtrophyScriptParser.isAlive_return isAlive279 =null;

        AtrophyScriptParser.isDead_return isDead280 =null;

        AtrophyScriptParser.isInvestigated_return isInvestigated281 =null;

        AtrophyScriptParser.isNotInvestigated_return isNotInvestigated282 =null;

        AtrophyScriptParser.isDaemon_return isDaemon283 =null;

        AtrophyScriptParser.isNotDaemon_return isNotDaemon284 =null;

        AtrophyScriptParser.teleDestination_return teleDestination285 =null;

        AtrophyScriptParser.maxTeamSize_return maxTeamSize286 =null;

        AtrophyScriptParser.minTeamSize_return minTeamSize287 =null;

        AtrophyScriptParser.subscribeTalkMaps_return subscribeTalkMaps288 =null;

        AtrophyScriptParser.aiNode_return aiNode289 =null;

        AtrophyScriptParser.isPlayer_return isPlayer290 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:446:9: ( ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:447:4: ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:447:4: ( isName | isFaction | isRoom | hasItem | hasWeapon | isAlive | isDead | isInvestigated | isNotInvestigated | isDaemon | isNotDaemon | teleDestination | maxTeamSize | minTeamSize | subscribeTalkMaps | aiNode | isPlayer )*
            loop40:
            do {
                int alt40=18;
                switch ( input.LA(1) ) {
                case 177:
                    {
                    alt40=1;
                    }
                    break;
                case 174:
                    {
                    alt40=2;
                    }
                    break;
                case 181:
                    {
                    alt40=3;
                    }
                    break;
                case 169:
                    {
                    alt40=4;
                    }
                    break;
                case 170:
                    {
                    alt40=5;
                    }
                    break;
                case 171:
                    {
                    alt40=6;
                    }
                    break;
                case 173:
                    {
                    alt40=7;
                    }
                    break;
                case 176:
                    {
                    alt40=8;
                    }
                    break;
                case 179:
                    {
                    alt40=9;
                    }
                    break;
                case 172:
                    {
                    alt40=10;
                    }
                    break;
                case 178:
                    {
                    alt40=11;
                    }
                    break;
                case 164:
                    {
                    alt40=12;
                    }
                    break;
                case 189:
                    {
                    alt40=13;
                    }
                    break;
                case 191:
                    {
                    alt40=14;
                    }
                    break;
                case 219:
                    {
                    alt40=15;
                    }
                    break;
                case 153:
                    {
                    alt40=16;
                    }
                    break;
                case 180:
                    {
                    alt40=17;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:447:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_unitInfo2823);
            	    isName274=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName274.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:448:6: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_unitInfo2830);
            	    isFaction275=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction275.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:449:6: isRoom
            	    {
            	    pushFollow(FOLLOW_isRoom_in_unitInfo2837);
            	    isRoom276=isRoom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isRoom276.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:450:6: hasItem
            	    {
            	    pushFollow(FOLLOW_hasItem_in_unitInfo2844);
            	    hasItem277=hasItem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasItem277.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:451:6: hasWeapon
            	    {
            	    pushFollow(FOLLOW_hasWeapon_in_unitInfo2851);
            	    hasWeapon278=hasWeapon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, hasWeapon278.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:452:6: isAlive
            	    {
            	    pushFollow(FOLLOW_isAlive_in_unitInfo2858);
            	    isAlive279=isAlive();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isAlive279.getTree());

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:453:6: isDead
            	    {
            	    pushFollow(FOLLOW_isDead_in_unitInfo2865);
            	    isDead280=isDead();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDead280.getTree());

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:454:6: isInvestigated
            	    {
            	    pushFollow(FOLLOW_isInvestigated_in_unitInfo2872);
            	    isInvestigated281=isInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isInvestigated281.getTree());

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:455:6: isNotInvestigated
            	    {
            	    pushFollow(FOLLOW_isNotInvestigated_in_unitInfo2879);
            	    isNotInvestigated282=isNotInvestigated();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotInvestigated282.getTree());

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:456:6: isDaemon
            	    {
            	    pushFollow(FOLLOW_isDaemon_in_unitInfo2886);
            	    isDaemon283=isDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isDaemon283.getTree());

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:457:6: isNotDaemon
            	    {
            	    pushFollow(FOLLOW_isNotDaemon_in_unitInfo2893);
            	    isNotDaemon284=isNotDaemon();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isNotDaemon284.getTree());

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:458:6: teleDestination
            	    {
            	    pushFollow(FOLLOW_teleDestination_in_unitInfo2900);
            	    teleDestination285=teleDestination();

            	    state._fsp--;

            	    adaptor.addChild(root_0, teleDestination285.getTree());

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:459:6: maxTeamSize
            	    {
            	    pushFollow(FOLLOW_maxTeamSize_in_unitInfo2907);
            	    maxTeamSize286=maxTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, maxTeamSize286.getTree());

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:460:6: minTeamSize
            	    {
            	    pushFollow(FOLLOW_minTeamSize_in_unitInfo2914);
            	    minTeamSize287=minTeamSize();

            	    state._fsp--;

            	    adaptor.addChild(root_0, minTeamSize287.getTree());

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:461:6: subscribeTalkMaps
            	    {
            	    pushFollow(FOLLOW_subscribeTalkMaps_in_unitInfo2921);
            	    subscribeTalkMaps288=subscribeTalkMaps();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subscribeTalkMaps288.getTree());

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:462:6: aiNode
            	    {
            	    pushFollow(FOLLOW_aiNode_in_unitInfo2928);
            	    aiNode289=aiNode();

            	    state._fsp--;

            	    adaptor.addChild(root_0, aiNode289.getTree());

            	    }
            	    break;
            	case 17 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:463:6: isPlayer
            	    {
            	    pushFollow(FOLLOW_isPlayer_in_unitInfo2935);
            	    isPlayer290=isPlayer();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isPlayer290.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:466:1: spawnTeam : 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) ;
    public final AtrophyScriptParser.spawnTeam_return spawnTeam() throws RecognitionException {
        AtrophyScriptParser.spawnTeam_return retval = new AtrophyScriptParser.spawnTeam_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal291=null;
        Token char_literal292=null;
        Token char_literal294=null;
        AtrophyScriptParser.unitInfo_return unitInfo293 =null;


        CommonTree string_literal291_tree=null;
        CommonTree char_literal292_tree=null;
        CommonTree char_literal294_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:466:10: ( 'spawnTeam' '{' unitInfo '}' -> ^( SPAWNTEAM unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:467:4: 'spawnTeam' '{' unitInfo '}'
            {
            string_literal291=(Token)match(input,215,FOLLOW_215_in_spawnTeam2954);  
            stream_215.add(string_literal291);


            char_literal292=(Token)match(input,238,FOLLOW_238_in_spawnTeam2956);  
            stream_238.add(char_literal292);


            pushFollow(FOLLOW_unitInfo_in_spawnTeam2958);
            unitInfo293=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo293.getTree());

            char_literal294=(Token)match(input,239,FOLLOW_239_in_spawnTeam2960);  
            stream_239.add(char_literal294);


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
            // 467:33: -> ^( SPAWNTEAM unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:467:36: ^( SPAWNTEAM unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:470:1: spawnCharacter : 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) ;
    public final AtrophyScriptParser.spawnCharacter_return spawnCharacter() throws RecognitionException {
        AtrophyScriptParser.spawnCharacter_return retval = new AtrophyScriptParser.spawnCharacter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal295=null;
        Token char_literal296=null;
        Token char_literal298=null;
        AtrophyScriptParser.unitInfo_return unitInfo297 =null;


        CommonTree string_literal295_tree=null;
        CommonTree char_literal296_tree=null;
        CommonTree char_literal298_tree=null;
        RewriteRuleTokenStream stream_212=new RewriteRuleTokenStream(adaptor,"token 212");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:470:15: ( 'spawnCharacter' '{' unitInfo '}' -> ^( SPAWNCHARACTER unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:471:4: 'spawnCharacter' '{' unitInfo '}'
            {
            string_literal295=(Token)match(input,212,FOLLOW_212_in_spawnCharacter2983);  
            stream_212.add(string_literal295);


            char_literal296=(Token)match(input,238,FOLLOW_238_in_spawnCharacter2985);  
            stream_238.add(char_literal296);


            pushFollow(FOLLOW_unitInfo_in_spawnCharacter2987);
            unitInfo297=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo297.getTree());

            char_literal298=(Token)match(input,239,FOLLOW_239_in_spawnCharacter2989);  
            stream_239.add(char_literal298);


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
            // 471:38: -> ^( SPAWNCHARACTER unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:471:41: ^( SPAWNCHARACTER unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:474:1: removeUnit : 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) ;
    public final AtrophyScriptParser.removeUnit_return removeUnit() throws RecognitionException {
        AtrophyScriptParser.removeUnit_return retval = new AtrophyScriptParser.removeUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal299=null;
        Token char_literal300=null;
        Token char_literal302=null;
        AtrophyScriptParser.unitInfo_return unitInfo301 =null;


        CommonTree string_literal299_tree=null;
        CommonTree char_literal300_tree=null;
        CommonTree char_literal302_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:474:11: ( 'removeUnit' '{' unitInfo '}' -> ^( REMOVEUNIT unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:475:4: 'removeUnit' '{' unitInfo '}'
            {
            string_literal299=(Token)match(input,204,FOLLOW_204_in_removeUnit3012);  
            stream_204.add(string_literal299);


            char_literal300=(Token)match(input,238,FOLLOW_238_in_removeUnit3014);  
            stream_238.add(char_literal300);


            pushFollow(FOLLOW_unitInfo_in_removeUnit3016);
            unitInfo301=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo301.getTree());

            char_literal302=(Token)match(input,239,FOLLOW_239_in_removeUnit3018);  
            stream_239.add(char_literal302);


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
            // 475:34: -> ^( REMOVEUNIT unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:475:37: ^( REMOVEUNIT unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:478:1: killUnit : 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) ;
    public final AtrophyScriptParser.killUnit_return killUnit() throws RecognitionException {
        AtrophyScriptParser.killUnit_return retval = new AtrophyScriptParser.killUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal303=null;
        Token char_literal304=null;
        Token char_literal306=null;
        AtrophyScriptParser.unitInfo_return unitInfo305 =null;


        CommonTree string_literal303_tree=null;
        CommonTree char_literal304_tree=null;
        CommonTree char_literal306_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:478:9: ( 'killUnit' '{' unitInfo '}' -> ^( KILLUNIT unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:479:4: 'killUnit' '{' unitInfo '}'
            {
            string_literal303=(Token)match(input,182,FOLLOW_182_in_killUnit3041);  
            stream_182.add(string_literal303);


            char_literal304=(Token)match(input,238,FOLLOW_238_in_killUnit3043);  
            stream_238.add(char_literal304);


            pushFollow(FOLLOW_unitInfo_in_killUnit3045);
            unitInfo305=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo305.getTree());

            char_literal306=(Token)match(input,239,FOLLOW_239_in_killUnit3047);  
            stream_239.add(char_literal306);


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
            // 479:32: -> ^( KILLUNIT unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:479:35: ^( KILLUNIT unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:482:1: teleportUnit : 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) ;
    public final AtrophyScriptParser.teleportUnit_return teleportUnit() throws RecognitionException {
        AtrophyScriptParser.teleportUnit_return retval = new AtrophyScriptParser.teleportUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal307=null;
        Token char_literal308=null;
        Token char_literal310=null;
        AtrophyScriptParser.unitInfo_return unitInfo309 =null;


        CommonTree string_literal307_tree=null;
        CommonTree char_literal308_tree=null;
        CommonTree char_literal310_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_224=new RewriteRuleTokenStream(adaptor,"token 224");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:482:13: ( 'teleport' '{' unitInfo '}' -> ^( TELEPORT unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:483:4: 'teleport' '{' unitInfo '}'
            {
            string_literal307=(Token)match(input,224,FOLLOW_224_in_teleportUnit3070);  
            stream_224.add(string_literal307);


            char_literal308=(Token)match(input,238,FOLLOW_238_in_teleportUnit3072);  
            stream_238.add(char_literal308);


            pushFollow(FOLLOW_unitInfo_in_teleportUnit3074);
            unitInfo309=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo309.getTree());

            char_literal310=(Token)match(input,239,FOLLOW_239_in_teleportUnit3076);  
            stream_239.add(char_literal310);


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
            // 483:32: -> ^( TELEPORT unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:483:35: ^( TELEPORT unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:486:1: converseUnit : 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) ;
    public final AtrophyScriptParser.converseUnit_return converseUnit() throws RecognitionException {
        AtrophyScriptParser.converseUnit_return retval = new AtrophyScriptParser.converseUnit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal311=null;
        Token char_literal312=null;
        Token char_literal314=null;
        AtrophyScriptParser.unitInfo_return unitInfo313 =null;


        CommonTree string_literal311_tree=null;
        CommonTree char_literal312_tree=null;
        CommonTree char_literal314_tree=null;
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:486:13: ( 'converse' '{' unitInfo '}' -> ^( CONVERSE unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:487:4: 'converse' '{' unitInfo '}'
            {
            string_literal311=(Token)match(input,162,FOLLOW_162_in_converseUnit3099);  
            stream_162.add(string_literal311);


            char_literal312=(Token)match(input,238,FOLLOW_238_in_converseUnit3101);  
            stream_238.add(char_literal312);


            pushFollow(FOLLOW_unitInfo_in_converseUnit3103);
            unitInfo313=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo313.getTree());

            char_literal314=(Token)match(input,239,FOLLOW_239_in_converseUnit3105);  
            stream_239.add(char_literal314);


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
            // 487:32: -> ^( CONVERSE unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:487:35: ^( CONVERSE unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:490:1: createSaferoom : 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.createSaferoom_return createSaferoom() throws RecognitionException {
        AtrophyScriptParser.createSaferoom_return retval = new AtrophyScriptParser.createSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal315=null;
        Token char_literal316=null;
        Token char_literal318=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo317 =null;


        CommonTree string_literal315_tree=null;
        CommonTree char_literal316_tree=null;
        CommonTree char_literal318_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:490:15: ( 'saferoom' '{' saferoomInfo '}' -> ^( SAFEROOM saferoomInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:491:4: 'saferoom' '{' saferoomInfo '}'
            {
            string_literal315=(Token)match(input,207,FOLLOW_207_in_createSaferoom3128);  
            stream_207.add(string_literal315);


            char_literal316=(Token)match(input,238,FOLLOW_238_in_createSaferoom3130);  
            stream_238.add(char_literal316);


            pushFollow(FOLLOW_saferoomInfo_in_createSaferoom3132);
            saferoomInfo317=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo317.getTree());

            char_literal318=(Token)match(input,239,FOLLOW_239_in_createSaferoom3134);  
            stream_239.add(char_literal318);


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
            // 491:36: -> ^( SAFEROOM saferoomInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:491:39: ^( SAFEROOM saferoomInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:1: removeSaferoom : 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) ;
    public final AtrophyScriptParser.removeSaferoom_return removeSaferoom() throws RecognitionException {
        AtrophyScriptParser.removeSaferoom_return retval = new AtrophyScriptParser.removeSaferoom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal319=null;
        Token char_literal320=null;
        Token char_literal322=null;
        AtrophyScriptParser.saferoomInfo_return saferoomInfo321 =null;


        CommonTree string_literal319_tree=null;
        CommonTree char_literal320_tree=null;
        CommonTree char_literal322_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_saferoomInfo=new RewriteRuleSubtreeStream(adaptor,"rule saferoomInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:494:15: ( 'removeSaferoom' '{' saferoomInfo '}' -> ^( REMOVESAFEROOM saferoomInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:495:4: 'removeSaferoom' '{' saferoomInfo '}'
            {
            string_literal319=(Token)match(input,202,FOLLOW_202_in_removeSaferoom3157);  
            stream_202.add(string_literal319);


            char_literal320=(Token)match(input,238,FOLLOW_238_in_removeSaferoom3159);  
            stream_238.add(char_literal320);


            pushFollow(FOLLOW_saferoomInfo_in_removeSaferoom3161);
            saferoomInfo321=saferoomInfo();

            state._fsp--;

            stream_saferoomInfo.add(saferoomInfo321.getTree());

            char_literal322=(Token)match(input,239,FOLLOW_239_in_removeSaferoom3163);  
            stream_239.add(char_literal322);


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
            // 495:42: -> ^( REMOVESAFEROOM saferoomInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:495:45: ^( REMOVESAFEROOM saferoomInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:498:1: containsFaction : 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) ;
    public final AtrophyScriptParser.containsFaction_return containsFaction() throws RecognitionException {
        AtrophyScriptParser.containsFaction_return retval = new AtrophyScriptParser.containsFaction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal323=null;
        AtrophyScriptParser.stringList_return stringList324 =null;


        CommonTree string_literal323_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:498:16: ( 'containsFaction:' stringList -> ^( CONTAINSFACTION stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:499:4: 'containsFaction:' stringList
            {
            string_literal323=(Token)match(input,161,FOLLOW_161_in_containsFaction3186);  
            stream_161.add(string_literal323);


            pushFollow(FOLLOW_stringList_in_containsFaction3188);
            stringList324=stringList();

            state._fsp--;

            stream_stringList.add(stringList324.getTree());

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
            // 499:34: -> ^( CONTAINSFACTION stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:499:37: ^( CONTAINSFACTION stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:502:1: saferoomInfo : ( containsFaction | isName )* ;
    public final AtrophyScriptParser.saferoomInfo_return saferoomInfo() throws RecognitionException {
        AtrophyScriptParser.saferoomInfo_return retval = new AtrophyScriptParser.saferoomInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.containsFaction_return containsFaction325 =null;

        AtrophyScriptParser.isName_return isName326 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:502:13: ( ( containsFaction | isName )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:503:4: ( containsFaction | isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:503:4: ( containsFaction | isName )*
            loop41:
            do {
                int alt41=3;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==161) ) {
                    alt41=1;
                }
                else if ( (LA41_0==177) ) {
                    alt41=2;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:503:5: containsFaction
            	    {
            	    pushFollow(FOLLOW_containsFaction_in_saferoomInfo3212);
            	    containsFaction325=containsFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, containsFaction325.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:504:6: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_saferoomInfo3219);
            	    isName326=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName326.getTree());

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


    public static class mapInfo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mapInfo"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:507:1: mapInfo : ( isName | isFaction | itemSpawnChance | sector )* ;
    public final AtrophyScriptParser.mapInfo_return mapInfo() throws RecognitionException {
        AtrophyScriptParser.mapInfo_return retval = new AtrophyScriptParser.mapInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName327 =null;

        AtrophyScriptParser.isFaction_return isFaction328 =null;

        AtrophyScriptParser.itemSpawnChance_return itemSpawnChance329 =null;

        AtrophyScriptParser.sector_return sector330 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:507:8: ( ( isName | isFaction | itemSpawnChance | sector )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:508:4: ( isName | isFaction | itemSpawnChance | sector )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:508:4: ( isName | isFaction | itemSpawnChance | sector )*
            loop42:
            do {
                int alt42=5;
                switch ( input.LA(1) ) {
                case 177:
                    {
                    alt42=1;
                    }
                    break;
                case 174:
                    {
                    alt42=2;
                    }
                    break;
                case 166:
                case 190:
                case 208:
                case 234:
                    {
                    alt42=3;
                    }
                    break;
                case 209:
                    {
                    alt42=4;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:508:5: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_mapInfo3237);
            	    isName327=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName327.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:508:14: isFaction
            	    {
            	    pushFollow(FOLLOW_isFaction_in_mapInfo3241);
            	    isFaction328=isFaction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isFaction328.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:508:26: itemSpawnChance
            	    {
            	    pushFollow(FOLLOW_itemSpawnChance_in_mapInfo3245);
            	    itemSpawnChance329=itemSpawnChance();

            	    state._fsp--;

            	    adaptor.addChild(root_0, itemSpawnChance329.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:508:44: sector
            	    {
            	    pushFollow(FOLLOW_sector_in_mapInfo3249);
            	    sector330=sector();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sector330.getTree());

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
    // $ANTLR end "mapInfo"


    public static class itemSpawnChance_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "itemSpawnChance"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:511:1: itemSpawnChance : ( 'engChance:' INT -> ^( ENG INT ) | 'medChance:' INT -> ^( MED INT ) | 'wepChance:' INT -> ^( WEP INT ) | 'sciChance:' INT -> ^( SCI INT ) );
    public final AtrophyScriptParser.itemSpawnChance_return itemSpawnChance() throws RecognitionException {
        AtrophyScriptParser.itemSpawnChance_return retval = new AtrophyScriptParser.itemSpawnChance_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal331=null;
        Token INT332=null;
        Token string_literal333=null;
        Token INT334=null;
        Token string_literal335=null;
        Token INT336=null;
        Token string_literal337=null;
        Token INT338=null;

        CommonTree string_literal331_tree=null;
        CommonTree INT332_tree=null;
        CommonTree string_literal333_tree=null;
        CommonTree INT334_tree=null;
        CommonTree string_literal335_tree=null;
        CommonTree INT336_tree=null;
        CommonTree string_literal337_tree=null;
        CommonTree INT338_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:511:16: ( 'engChance:' INT -> ^( ENG INT ) | 'medChance:' INT -> ^( MED INT ) | 'wepChance:' INT -> ^( WEP INT ) | 'sciChance:' INT -> ^( SCI INT ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 166:
                {
                alt43=1;
                }
                break;
            case 190:
                {
                alt43=2;
                }
                break;
            case 234:
                {
                alt43=3;
                }
                break;
            case 208:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:512:4: 'engChance:' INT
                    {
                    string_literal331=(Token)match(input,166,FOLLOW_166_in_itemSpawnChance3266);  
                    stream_166.add(string_literal331);


                    INT332=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3268);  
                    stream_INT.add(INT332);


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
                    // 512:21: -> ^( ENG INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:512:24: ^( ENG INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:513:6: 'medChance:' INT
                    {
                    string_literal333=(Token)match(input,190,FOLLOW_190_in_itemSpawnChance3283);  
                    stream_190.add(string_literal333);


                    INT334=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3285);  
                    stream_INT.add(INT334);


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
                    // 513:23: -> ^( MED INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:513:26: ^( MED INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:514:6: 'wepChance:' INT
                    {
                    string_literal335=(Token)match(input,234,FOLLOW_234_in_itemSpawnChance3300);  
                    stream_234.add(string_literal335);


                    INT336=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3302);  
                    stream_INT.add(INT336);


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
                    // 514:23: -> ^( WEP INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:514:26: ^( WEP INT )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:515:6: 'sciChance:' INT
                    {
                    string_literal337=(Token)match(input,208,FOLLOW_208_in_itemSpawnChance3317);  
                    stream_208.add(string_literal337);


                    INT338=(Token)match(input,INT,FOLLOW_INT_in_itemSpawnChance3319);  
                    stream_INT.add(INT338);


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
                    // 515:23: -> ^( SCI INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:515:26: ^( SCI INT )
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


    public static class sector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sector"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:518:1: sector : 'sector:' stringLiteral -> ^( SECTOR stringLiteral ) ;
    public final AtrophyScriptParser.sector_return sector() throws RecognitionException {
        AtrophyScriptParser.sector_return retval = new AtrophyScriptParser.sector_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal339=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral340 =null;


        CommonTree string_literal339_tree=null;
        RewriteRuleTokenStream stream_209=new RewriteRuleTokenStream(adaptor,"token 209");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:518:7: ( 'sector:' stringLiteral -> ^( SECTOR stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:519:4: 'sector:' stringLiteral
            {
            string_literal339=(Token)match(input,209,FOLLOW_209_in_sector3342);  
            stream_209.add(string_literal339);


            pushFollow(FOLLOW_stringLiteral_in_sector3344);
            stringLiteral340=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral340.getTree());

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
            // 519:28: -> ^( SECTOR stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:519:31: ^( SECTOR stringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SECTOR, "SECTOR")
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
    // $ANTLR end "sector"


    public static class loadMap_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "loadMap"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:522:1: loadMap : 'loadMap' '{' mapInfo '}' -> ^( LOADMAP mapInfo ) ;
    public final AtrophyScriptParser.loadMap_return loadMap() throws RecognitionException {
        AtrophyScriptParser.loadMap_return retval = new AtrophyScriptParser.loadMap_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal341=null;
        Token char_literal342=null;
        Token char_literal344=null;
        AtrophyScriptParser.mapInfo_return mapInfo343 =null;


        CommonTree string_literal341_tree=null;
        CommonTree char_literal342_tree=null;
        CommonTree char_literal344_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_mapInfo=new RewriteRuleSubtreeStream(adaptor,"rule mapInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:522:8: ( 'loadMap' '{' mapInfo '}' -> ^( LOADMAP mapInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:523:4: 'loadMap' '{' mapInfo '}'
            {
            string_literal341=(Token)match(input,185,FOLLOW_185_in_loadMap3367);  
            stream_185.add(string_literal341);


            char_literal342=(Token)match(input,238,FOLLOW_238_in_loadMap3369);  
            stream_238.add(char_literal342);


            pushFollow(FOLLOW_mapInfo_in_loadMap3371);
            mapInfo343=mapInfo();

            state._fsp--;

            stream_mapInfo.add(mapInfo343.getTree());

            char_literal344=(Token)match(input,239,FOLLOW_239_in_loadMap3373);  
            stream_239.add(char_literal344);


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
            // 523:30: -> ^( LOADMAP mapInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:523:33: ^( LOADMAP mapInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:526:1: lockDoor : 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.lockDoor_return lockDoor() throws RecognitionException {
        AtrophyScriptParser.lockDoor_return retval = new AtrophyScriptParser.lockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal345=null;
        Token char_literal346=null;
        Token char_literal348=null;
        AtrophyScriptParser.doorInfo_return doorInfo347 =null;


        CommonTree string_literal345_tree=null;
        CommonTree char_literal346_tree=null;
        CommonTree char_literal348_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:526:9: ( 'lockDoor' '{' doorInfo '}' -> ^( LOCKDOOR doorInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:527:4: 'lockDoor' '{' doorInfo '}'
            {
            string_literal345=(Token)match(input,186,FOLLOW_186_in_lockDoor3396);  
            stream_186.add(string_literal345);


            char_literal346=(Token)match(input,238,FOLLOW_238_in_lockDoor3398);  
            stream_238.add(char_literal346);


            pushFollow(FOLLOW_doorInfo_in_lockDoor3400);
            doorInfo347=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo347.getTree());

            char_literal348=(Token)match(input,239,FOLLOW_239_in_lockDoor3402);  
            stream_239.add(char_literal348);


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
            // 527:32: -> ^( LOCKDOOR doorInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:527:35: ^( LOCKDOOR doorInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:530:1: unlockDoor : 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) ;
    public final AtrophyScriptParser.unlockDoor_return unlockDoor() throws RecognitionException {
        AtrophyScriptParser.unlockDoor_return retval = new AtrophyScriptParser.unlockDoor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal349=null;
        Token char_literal350=null;
        Token char_literal352=null;
        AtrophyScriptParser.doorInfo_return doorInfo351 =null;


        CommonTree string_literal349_tree=null;
        CommonTree char_literal350_tree=null;
        CommonTree char_literal352_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_231=new RewriteRuleTokenStream(adaptor,"token 231");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_doorInfo=new RewriteRuleSubtreeStream(adaptor,"rule doorInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:530:11: ( 'unlockDoor' '{' doorInfo '}' -> ^( UNLOCKDOOR doorInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:531:4: 'unlockDoor' '{' doorInfo '}'
            {
            string_literal349=(Token)match(input,231,FOLLOW_231_in_unlockDoor3425);  
            stream_231.add(string_literal349);


            char_literal350=(Token)match(input,238,FOLLOW_238_in_unlockDoor3427);  
            stream_238.add(char_literal350);


            pushFollow(FOLLOW_doorInfo_in_unlockDoor3429);
            doorInfo351=doorInfo();

            state._fsp--;

            stream_doorInfo.add(doorInfo351.getTree());

            char_literal352=(Token)match(input,239,FOLLOW_239_in_unlockDoor3431);  
            stream_239.add(char_literal352);


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
            // 531:34: -> ^( UNLOCKDOOR doorInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:531:37: ^( UNLOCKDOOR doorInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:534:1: doorInfo : ( isName )* ;
    public final AtrophyScriptParser.doorInfo_return doorInfo() throws RecognitionException {
        AtrophyScriptParser.doorInfo_return retval = new AtrophyScriptParser.doorInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AtrophyScriptParser.isName_return isName353 =null;



        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:534:9: ( ( isName )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:535:4: ( isName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:535:4: ( isName )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==177) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:535:4: isName
            	    {
            	    pushFollow(FOLLOW_isName_in_doorInfo3454);
            	    isName353=isName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, isName353.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:538:1: addTag : ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) );
    public final AtrophyScriptParser.addTag_return addTag() throws RecognitionException {
        AtrophyScriptParser.addTag_return retval = new AtrophyScriptParser.addTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal354=null;
        Token ADD_TAG_PREFIX356=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral355 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral357 =null;


        CommonTree string_literal354_tree=null;
        CommonTree ADD_TAG_PREFIX356_tree=null;
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_ADD_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token ADD_TAG_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:538:7: ( 'addTag:' stringLiteral -> ^( ADDTAG stringLiteral ) | ADD_TAG_PREFIX stringLiteral -> ^( ADDTAG stringLiteral ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==151) ) {
                alt45=1;
            }
            else if ( (LA45_0==ADD_TAG_PREFIX) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:539:4: 'addTag:' stringLiteral
                    {
                    string_literal354=(Token)match(input,151,FOLLOW_151_in_addTag3470);  
                    stream_151.add(string_literal354);


                    pushFollow(FOLLOW_stringLiteral_in_addTag3472);
                    stringLiteral355=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral355.getTree());

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
                    // 539:28: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:539:31: ^( ADDTAG stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:540:6: ADD_TAG_PREFIX stringLiteral
                    {
                    ADD_TAG_PREFIX356=(Token)match(input,ADD_TAG_PREFIX,FOLLOW_ADD_TAG_PREFIX_in_addTag3487);  
                    stream_ADD_TAG_PREFIX.add(ADD_TAG_PREFIX356);


                    pushFollow(FOLLOW_stringLiteral_in_addTag3489);
                    stringLiteral357=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral357.getTree());

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
                    // 540:35: -> ^( ADDTAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:540:38: ^( ADDTAG stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:543:1: removeTag : ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) );
    public final AtrophyScriptParser.removeTag_return removeTag() throws RecognitionException {
        AtrophyScriptParser.removeTag_return retval = new AtrophyScriptParser.removeTag_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal358=null;
        Token REMOVE_TAG_PREFIX360=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral359 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral361 =null;


        CommonTree string_literal358_tree=null;
        CommonTree REMOVE_TAG_PREFIX360_tree=null;
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_REMOVE_TAG_PREFIX=new RewriteRuleTokenStream(adaptor,"token REMOVE_TAG_PREFIX");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:543:10: ( 'removeTag:' stringLiteral -> ^( REMOVETAG stringLiteral ) | REMOVE_TAG_PREFIX stringLiteral -> ^( REMOVETAG stringLiteral ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==203) ) {
                alt46=1;
            }
            else if ( (LA46_0==REMOVE_TAG_PREFIX) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:544:4: 'removeTag:' stringLiteral
                    {
                    string_literal358=(Token)match(input,203,FOLLOW_203_in_removeTag3512);  
                    stream_203.add(string_literal358);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag3514);
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
                    // 544:31: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:544:34: ^( REMOVETAG stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:545:6: REMOVE_TAG_PREFIX stringLiteral
                    {
                    REMOVE_TAG_PREFIX360=(Token)match(input,REMOVE_TAG_PREFIX,FOLLOW_REMOVE_TAG_PREFIX_in_removeTag3529);  
                    stream_REMOVE_TAG_PREFIX.add(REMOVE_TAG_PREFIX360);


                    pushFollow(FOLLOW_stringLiteral_in_removeTag3531);
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
                    // 545:38: -> ^( REMOVETAG stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:545:41: ^( REMOVETAG stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:548:1: directorBias : 'directorBias' '{' '{' unitInfo '}' stringLiteral '}' -> ^( DIRECTORBIAS stringLiteral unitInfo ) ;
    public final AtrophyScriptParser.directorBias_return directorBias() throws RecognitionException {
        AtrophyScriptParser.directorBias_return retval = new AtrophyScriptParser.directorBias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal362=null;
        Token char_literal363=null;
        Token char_literal364=null;
        Token char_literal366=null;
        Token char_literal368=null;
        AtrophyScriptParser.unitInfo_return unitInfo365 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral367 =null;


        CommonTree string_literal362_tree=null;
        CommonTree char_literal363_tree=null;
        CommonTree char_literal364_tree=null;
        CommonTree char_literal366_tree=null;
        CommonTree char_literal368_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:548:13: ( 'directorBias' '{' '{' unitInfo '}' stringLiteral '}' -> ^( DIRECTORBIAS stringLiteral unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:549:4: 'directorBias' '{' '{' unitInfo '}' stringLiteral '}'
            {
            string_literal362=(Token)match(input,165,FOLLOW_165_in_directorBias3554);  
            stream_165.add(string_literal362);


            char_literal363=(Token)match(input,238,FOLLOW_238_in_directorBias3556);  
            stream_238.add(char_literal363);


            char_literal364=(Token)match(input,238,FOLLOW_238_in_directorBias3558);  
            stream_238.add(char_literal364);


            pushFollow(FOLLOW_unitInfo_in_directorBias3560);
            unitInfo365=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo365.getTree());

            char_literal366=(Token)match(input,239,FOLLOW_239_in_directorBias3562);  
            stream_239.add(char_literal366);


            pushFollow(FOLLOW_stringLiteral_in_directorBias3564);
            stringLiteral367=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral367.getTree());

            char_literal368=(Token)match(input,239,FOLLOW_239_in_directorBias3566);  
            stream_239.add(char_literal368);


            // AST REWRITE
            // elements: unitInfo, stringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 549:58: -> ^( DIRECTORBIAS stringLiteral unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:549:61: ^( DIRECTORBIAS stringLiteral unitInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DIRECTORBIAS, "DIRECTORBIAS")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

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
    // $ANTLR end "directorBias"


    public static class changeAiNode_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "changeAiNode"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:552:1: changeAiNode : 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}' -> ^( CHANGEAINODE unitInfo aiNodeOptions ) ;
    public final AtrophyScriptParser.changeAiNode_return changeAiNode() throws RecognitionException {
        AtrophyScriptParser.changeAiNode_return retval = new AtrophyScriptParser.changeAiNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal369=null;
        Token char_literal370=null;
        Token char_literal371=null;
        Token char_literal373=null;
        Token char_literal374=null;
        Token char_literal376=null;
        Token char_literal377=null;
        AtrophyScriptParser.unitInfo_return unitInfo372 =null;

        AtrophyScriptParser.aiNodeOptions_return aiNodeOptions375 =null;


        CommonTree string_literal369_tree=null;
        CommonTree char_literal370_tree=null;
        CommonTree char_literal371_tree=null;
        CommonTree char_literal373_tree=null;
        CommonTree char_literal374_tree=null;
        CommonTree char_literal376_tree=null;
        CommonTree char_literal377_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_aiNodeOptions=new RewriteRuleSubtreeStream(adaptor,"rule aiNodeOptions");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:552:13: ( 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}' -> ^( CHANGEAINODE unitInfo aiNodeOptions ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:553:4: 'changeAiNode' '{' '{' unitInfo '}' '{' aiNodeOptions '}' '}'
            {
            string_literal369=(Token)match(input,158,FOLLOW_158_in_changeAiNode3591);  
            stream_158.add(string_literal369);


            char_literal370=(Token)match(input,238,FOLLOW_238_in_changeAiNode3593);  
            stream_238.add(char_literal370);


            char_literal371=(Token)match(input,238,FOLLOW_238_in_changeAiNode3595);  
            stream_238.add(char_literal371);


            pushFollow(FOLLOW_unitInfo_in_changeAiNode3597);
            unitInfo372=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo372.getTree());

            char_literal373=(Token)match(input,239,FOLLOW_239_in_changeAiNode3599);  
            stream_239.add(char_literal373);


            char_literal374=(Token)match(input,238,FOLLOW_238_in_changeAiNode3601);  
            stream_238.add(char_literal374);


            pushFollow(FOLLOW_aiNodeOptions_in_changeAiNode3603);
            aiNodeOptions375=aiNodeOptions();

            state._fsp--;

            stream_aiNodeOptions.add(aiNodeOptions375.getTree());

            char_literal376=(Token)match(input,239,FOLLOW_239_in_changeAiNode3605);  
            stream_239.add(char_literal376);


            char_literal377=(Token)match(input,239,FOLLOW_239_in_changeAiNode3607);  
            stream_239.add(char_literal377);


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
            // 553:66: -> ^( CHANGEAINODE unitInfo aiNodeOptions )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:553:69: ^( CHANGEAINODE unitInfo aiNodeOptions )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:556:1: showMessage : 'showMessage:' stringLiteral -> ^( SHOWMESSAGE stringLiteral ) ;
    public final AtrophyScriptParser.showMessage_return showMessage() throws RecognitionException {
        AtrophyScriptParser.showMessage_return retval = new AtrophyScriptParser.showMessage_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal378=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral379 =null;


        CommonTree string_literal378_tree=null;
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:556:12: ( 'showMessage:' stringLiteral -> ^( SHOWMESSAGE stringLiteral ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:557:4: 'showMessage:' stringLiteral
            {
            string_literal378=(Token)match(input,211,FOLLOW_211_in_showMessage3632);  
            stream_211.add(string_literal378);


            pushFollow(FOLLOW_stringLiteral_in_showMessage3634);
            stringLiteral379=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral379.getTree());

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
            // 557:33: -> ^( SHOWMESSAGE stringLiteral )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:557:36: ^( SHOWMESSAGE stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:560:1: setTriggerRunning : 'setTriggerRunning:' stringLiteral BOOL -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL ) ;
    public final AtrophyScriptParser.setTriggerRunning_return setTriggerRunning() throws RecognitionException {
        AtrophyScriptParser.setTriggerRunning_return retval = new AtrophyScriptParser.setTriggerRunning_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal380=null;
        Token BOOL382=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral381 =null;


        CommonTree string_literal380_tree=null;
        CommonTree BOOL382_tree=null;
        RewriteRuleTokenStream stream_210=new RewriteRuleTokenStream(adaptor,"token 210");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:560:18: ( 'setTriggerRunning:' stringLiteral BOOL -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:561:4: 'setTriggerRunning:' stringLiteral BOOL
            {
            string_literal380=(Token)match(input,210,FOLLOW_210_in_setTriggerRunning3657);  
            stream_210.add(string_literal380);


            pushFollow(FOLLOW_stringLiteral_in_setTriggerRunning3659);
            stringLiteral381=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral381.getTree());

            BOOL382=(Token)match(input,BOOL,FOLLOW_BOOL_in_setTriggerRunning3661);  
            stream_BOOL.add(BOOL382);


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
            // 561:44: -> ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:561:47: ^( SETTRIGGERRUNNING ^( STRING stringLiteral ) BOOL )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SETTRIGGERRUNNING, "SETTRIGGERRUNNING")
                , root_1);

                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:561:67: ^( STRING stringLiteral )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:564:1: spawnItem : 'spawnItem' stringList '{' unitInfo '}' -> ^( SPAWNITEM stringList unitInfo ) ;
    public final AtrophyScriptParser.spawnItem_return spawnItem() throws RecognitionException {
        AtrophyScriptParser.spawnItem_return retval = new AtrophyScriptParser.spawnItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal383=null;
        Token char_literal385=null;
        Token char_literal387=null;
        AtrophyScriptParser.stringList_return stringList384 =null;

        AtrophyScriptParser.unitInfo_return unitInfo386 =null;


        CommonTree string_literal383_tree=null;
        CommonTree char_literal385_tree=null;
        CommonTree char_literal387_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_213=new RewriteRuleTokenStream(adaptor,"token 213");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:564:10: ( 'spawnItem' stringList '{' unitInfo '}' -> ^( SPAWNITEM stringList unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:565:4: 'spawnItem' stringList '{' unitInfo '}'
            {
            string_literal383=(Token)match(input,213,FOLLOW_213_in_spawnItem3690);  
            stream_213.add(string_literal383);


            pushFollow(FOLLOW_stringList_in_spawnItem3692);
            stringList384=stringList();

            state._fsp--;

            stream_stringList.add(stringList384.getTree());

            char_literal385=(Token)match(input,238,FOLLOW_238_in_spawnItem3694);  
            stream_238.add(char_literal385);


            pushFollow(FOLLOW_unitInfo_in_spawnItem3696);
            unitInfo386=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo386.getTree());

            char_literal387=(Token)match(input,239,FOLLOW_239_in_spawnItem3698);  
            stream_239.add(char_literal387);


            // AST REWRITE
            // elements: stringList, unitInfo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 565:44: -> ^( SPAWNITEM stringList unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:565:47: ^( SPAWNITEM stringList unitInfo )
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


    public static class removeItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "removeItem"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:568:1: removeItem : 'removeItem' stringList '{' unitInfo '}' -> ^( REMOVEITEM stringList unitInfo ) ;
    public final AtrophyScriptParser.removeItem_return removeItem() throws RecognitionException {
        AtrophyScriptParser.removeItem_return retval = new AtrophyScriptParser.removeItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal388=null;
        Token char_literal390=null;
        Token char_literal392=null;
        AtrophyScriptParser.stringList_return stringList389 =null;

        AtrophyScriptParser.unitInfo_return unitInfo391 =null;


        CommonTree string_literal388_tree=null;
        CommonTree char_literal390_tree=null;
        CommonTree char_literal392_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:568:11: ( 'removeItem' stringList '{' unitInfo '}' -> ^( REMOVEITEM stringList unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:569:4: 'removeItem' stringList '{' unitInfo '}'
            {
            string_literal388=(Token)match(input,201,FOLLOW_201_in_removeItem3723);  
            stream_201.add(string_literal388);


            pushFollow(FOLLOW_stringList_in_removeItem3725);
            stringList389=stringList();

            state._fsp--;

            stream_stringList.add(stringList389.getTree());

            char_literal390=(Token)match(input,238,FOLLOW_238_in_removeItem3727);  
            stream_238.add(char_literal390);


            pushFollow(FOLLOW_unitInfo_in_removeItem3729);
            unitInfo391=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo391.getTree());

            char_literal392=(Token)match(input,239,FOLLOW_239_in_removeItem3731);  
            stream_239.add(char_literal392);


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
            // 569:45: -> ^( REMOVEITEM stringList unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:569:48: ^( REMOVEITEM stringList unitInfo )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(REMOVEITEM, "REMOVEITEM")
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
    // $ANTLR end "removeItem"


    public static class spawnTalkNode_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spawnTalkNode"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:572:1: spawnTalkNode : 'spawnTalkNode' '{' unitInfo '}' -> ^( SPAWNTALKNODE unitInfo ) ;
    public final AtrophyScriptParser.spawnTalkNode_return spawnTalkNode() throws RecognitionException {
        AtrophyScriptParser.spawnTalkNode_return retval = new AtrophyScriptParser.spawnTalkNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal393=null;
        Token char_literal394=null;
        Token char_literal396=null;
        AtrophyScriptParser.unitInfo_return unitInfo395 =null;


        CommonTree string_literal393_tree=null;
        CommonTree char_literal394_tree=null;
        CommonTree char_literal396_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_unitInfo=new RewriteRuleSubtreeStream(adaptor,"rule unitInfo");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:572:14: ( 'spawnTalkNode' '{' unitInfo '}' -> ^( SPAWNTALKNODE unitInfo ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:573:4: 'spawnTalkNode' '{' unitInfo '}'
            {
            string_literal393=(Token)match(input,214,FOLLOW_214_in_spawnTalkNode3756);  
            stream_214.add(string_literal393);


            char_literal394=(Token)match(input,238,FOLLOW_238_in_spawnTalkNode3758);  
            stream_238.add(char_literal394);


            pushFollow(FOLLOW_unitInfo_in_spawnTalkNode3760);
            unitInfo395=unitInfo();

            state._fsp--;

            stream_unitInfo.add(unitInfo395.getTree());

            char_literal396=(Token)match(input,239,FOLLOW_239_in_spawnTalkNode3762);  
            stream_239.add(char_literal396);


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
            // 573:37: -> ^( SPAWNTALKNODE unitInfo )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:573:40: ^( SPAWNTALKNODE unitInfo )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:576:1: unlockTech : 'unlockTech:' stringList -> ^( UNLOCKTECH stringList ) ;
    public final AtrophyScriptParser.unlockTech_return unlockTech() throws RecognitionException {
        AtrophyScriptParser.unlockTech_return retval = new AtrophyScriptParser.unlockTech_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal397=null;
        AtrophyScriptParser.stringList_return stringList398 =null;


        CommonTree string_literal397_tree=null;
        RewriteRuleTokenStream stream_232=new RewriteRuleTokenStream(adaptor,"token 232");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:576:11: ( 'unlockTech:' stringList -> ^( UNLOCKTECH stringList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:577:4: 'unlockTech:' stringList
            {
            string_literal397=(Token)match(input,232,FOLLOW_232_in_unlockTech3785);  
            stream_232.add(string_literal397);


            pushFollow(FOLLOW_stringList_in_unlockTech3787);
            stringList398=stringList();

            state._fsp--;

            stream_stringList.add(stringList398.getTree());

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
            // 577:29: -> ^( UNLOCKTECH stringList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:577:32: ^( UNLOCKTECH stringList )
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:580:1: changeStat : ( 'changeAdvance:' ( '-' )? INT -> ^( CHANGEADVANCE ( '-' )? INT ) | 'changeStability:' ( '-' )? INT -> ^( CHANGESTABILITY ( '-' )? INT ) );
    public final AtrophyScriptParser.changeStat_return changeStat() throws RecognitionException {
        AtrophyScriptParser.changeStat_return retval = new AtrophyScriptParser.changeStat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal399=null;
        Token char_literal400=null;
        Token INT401=null;
        Token string_literal402=null;
        Token char_literal403=null;
        Token INT404=null;

        CommonTree string_literal399_tree=null;
        CommonTree char_literal400_tree=null;
        CommonTree INT401_tree=null;
        CommonTree string_literal402_tree=null;
        CommonTree char_literal403_tree=null;
        CommonTree INT404_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:580:11: ( 'changeAdvance:' ( '-' )? INT -> ^( CHANGEADVANCE ( '-' )? INT ) | 'changeStability:' ( '-' )? INT -> ^( CHANGESTABILITY ( '-' )? INT ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==157) ) {
                alt49=1;
            }
            else if ( (LA49_0==159) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:581:4: 'changeAdvance:' ( '-' )? INT
                    {
                    string_literal399=(Token)match(input,157,FOLLOW_157_in_changeStat3810);  
                    stream_157.add(string_literal399);


                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:581:21: ( '-' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==127) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:581:21: '-'
                            {
                            char_literal400=(Token)match(input,127,FOLLOW_127_in_changeStat3812);  
                            stream_127.add(char_literal400);


                            }
                            break;

                    }


                    INT401=(Token)match(input,INT,FOLLOW_INT_in_changeStat3815);  
                    stream_INT.add(INT401);


                    // AST REWRITE
                    // elements: 127, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 581:30: -> ^( CHANGEADVANCE ( '-' )? INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:581:33: ^( CHANGEADVANCE ( '-' )? INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CHANGEADVANCE, "CHANGEADVANCE")
                        , root_1);

                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:581:49: ( '-' )?
                        if ( stream_127.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_127.nextNode()
                            );

                        }
                        stream_127.reset();

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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:582:6: 'changeStability:' ( '-' )? INT
                    {
                    string_literal402=(Token)match(input,159,FOLLOW_159_in_changeStat3833);  
                    stream_159.add(string_literal402);


                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:582:25: ( '-' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==127) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:582:25: '-'
                            {
                            char_literal403=(Token)match(input,127,FOLLOW_127_in_changeStat3835);  
                            stream_127.add(char_literal403);


                            }
                            break;

                    }


                    INT404=(Token)match(input,INT,FOLLOW_INT_in_changeStat3838);  
                    stream_INT.add(INT404);


                    // AST REWRITE
                    // elements: 127, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 582:34: -> ^( CHANGESTABILITY ( '-' )? INT )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:582:37: ^( CHANGESTABILITY ( '-' )? INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CHANGESTABILITY, "CHANGESTABILITY")
                        , root_1);

                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:582:55: ( '-' )?
                        if ( stream_127.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_127.nextNode()
                            );

                        }
                        stream_127.reset();

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:585:1: sequenceDecl : 'SEQUENCE::' stringLiteral '{' commandConditional ( commandCallList )* '}' -> ^( SEQUENCE stringLiteral commandConditional commandCallList ) ;
    public final AtrophyScriptParser.sequenceDecl_return sequenceDecl() throws RecognitionException {
        AtrophyScriptParser.sequenceDecl_return retval = new AtrophyScriptParser.sequenceDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal405=null;
        Token char_literal407=null;
        Token char_literal410=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral406 =null;

        AtrophyScriptParser.commandConditional_return commandConditional408 =null;

        AtrophyScriptParser.commandCallList_return commandCallList409 =null;


        CommonTree string_literal405_tree=null;
        CommonTree char_literal407_tree=null;
        CommonTree char_literal410_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleSubtreeStream stream_commandConditional=new RewriteRuleSubtreeStream(adaptor,"rule commandConditional");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_commandCallList=new RewriteRuleSubtreeStream(adaptor,"rule commandCallList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:585:13: ( 'SEQUENCE::' stringLiteral '{' commandConditional ( commandCallList )* '}' -> ^( SEQUENCE stringLiteral commandConditional commandCallList ) )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:586:4: 'SEQUENCE::' stringLiteral '{' commandConditional ( commandCallList )* '}'
            {
            string_literal405=(Token)match(input,146,FOLLOW_146_in_sequenceDecl3864);  
            stream_146.add(string_literal405);


            pushFollow(FOLLOW_stringLiteral_in_sequenceDecl3866);
            stringLiteral406=stringLiteral();

            state._fsp--;

            stream_stringLiteral.add(stringLiteral406.getTree());

            char_literal407=(Token)match(input,238,FOLLOW_238_in_sequenceDecl3868);  
            stream_238.add(char_literal407);


            pushFollow(FOLLOW_commandConditional_in_sequenceDecl3873);
            commandConditional408=commandConditional();

            state._fsp--;

            stream_commandConditional.add(commandConditional408.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:588:4: ( commandCallList )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMAND_CALL_PREFIX||LA50_0==138||LA50_0==140||LA50_0==156||LA50_0==188) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:588:5: commandCallList
            	    {
            	    pushFollow(FOLLOW_commandCallList_in_sequenceDecl3879);
            	    commandCallList409=commandCallList();

            	    state._fsp--;

            	    stream_commandCallList.add(commandCallList409.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            char_literal410=(Token)match(input,239,FOLLOW_239_in_sequenceDecl3886);  
            stream_239.add(char_literal410);


            // AST REWRITE
            // elements: commandCallList, stringLiteral, commandConditional
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 590:4: -> ^( SEQUENCE stringLiteral commandConditional commandCallList )
            {
                // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:591:4: ^( SEQUENCE stringLiteral commandConditional commandCallList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SEQUENCE, "SEQUENCE")
                , root_1);

                adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                adaptor.addChild(root_1, stream_commandConditional.nextTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:594:1: commandConditional : ( 'IF' 'HAS' '(' stringList ')' -> ^( IF stringList ) | 'IF' '!HAS' '(' stringList ')' -> ^( NOTIF stringList ) | -> ^( EMPTY ) );
    public final AtrophyScriptParser.commandConditional_return commandConditional() throws RecognitionException {
        AtrophyScriptParser.commandConditional_return retval = new AtrophyScriptParser.commandConditional_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal411=null;
        Token string_literal412=null;
        Token char_literal413=null;
        Token char_literal415=null;
        Token string_literal416=null;
        Token string_literal417=null;
        Token char_literal418=null;
        Token char_literal420=null;
        AtrophyScriptParser.stringList_return stringList414 =null;

        AtrophyScriptParser.stringList_return stringList419 =null;


        CommonTree string_literal411_tree=null;
        CommonTree string_literal412_tree=null;
        CommonTree char_literal413_tree=null;
        CommonTree char_literal415_tree=null;
        CommonTree string_literal416_tree=null;
        CommonTree string_literal417_tree=null;
        CommonTree char_literal418_tree=null;
        CommonTree char_literal420_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:594:19: ( 'IF' 'HAS' '(' stringList ')' -> ^( IF stringList ) | 'IF' '!HAS' '(' stringList ')' -> ^( NOTIF stringList ) | -> ^( EMPTY ) )
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==136) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==135) ) {
                    alt51=1;
                }
                else if ( (LA51_1==122) ) {
                    alt51=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA51_0==COMMAND_CALL_PREFIX||LA51_0==138||LA51_0==140||LA51_0==156||LA51_0==188||LA51_0==239) ) {
                alt51=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:595:3: 'IF' 'HAS' '(' stringList ')'
                    {
                    string_literal411=(Token)match(input,136,FOLLOW_136_in_commandConditional3918);  
                    stream_136.add(string_literal411);


                    string_literal412=(Token)match(input,135,FOLLOW_135_in_commandConditional3919);  
                    stream_135.add(string_literal412);


                    char_literal413=(Token)match(input,124,FOLLOW_124_in_commandConditional3921);  
                    stream_124.add(char_literal413);


                    pushFollow(FOLLOW_stringList_in_commandConditional3923);
                    stringList414=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList414.getTree());

                    char_literal415=(Token)match(input,125,FOLLOW_125_in_commandConditional3925);  
                    stream_125.add(char_literal415);


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
                    // 595:32: -> ^( IF stringList )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:595:35: ^( IF stringList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(IF, "IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:596:5: 'IF' '!HAS' '(' stringList ')'
                    {
                    string_literal416=(Token)match(input,136,FOLLOW_136_in_commandConditional3939);  
                    stream_136.add(string_literal416);


                    string_literal417=(Token)match(input,122,FOLLOW_122_in_commandConditional3940);  
                    stream_122.add(string_literal417);


                    char_literal418=(Token)match(input,124,FOLLOW_124_in_commandConditional3942);  
                    stream_124.add(char_literal418);


                    pushFollow(FOLLOW_stringList_in_commandConditional3944);
                    stringList419=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList419.getTree());

                    char_literal420=(Token)match(input,125,FOLLOW_125_in_commandConditional3946);  
                    stream_125.add(char_literal420);


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
                    // 596:35: -> ^( NOTIF stringList )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:596:38: ^( NOTIF stringList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NOTIF, "NOTIF")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:597:5: 
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
                    // 597:5: -> ^( EMPTY )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:597:8: ^( EMPTY )
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
    // $ANTLR end "commandConditional"


    public static class commandCallList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commandCallList"
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:600:1: commandCallList : commandCall ( ',' ! commandCall )* ;
    public final AtrophyScriptParser.commandCallList_return commandCallList() throws RecognitionException {
        AtrophyScriptParser.commandCallList_return retval = new AtrophyScriptParser.commandCallList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal422=null;
        AtrophyScriptParser.commandCall_return commandCall421 =null;

        AtrophyScriptParser.commandCall_return commandCall423 =null;


        CommonTree char_literal422_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:600:16: ( commandCall ( ',' ! commandCall )* )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:601:4: commandCall ( ',' ! commandCall )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_commandCall_in_commandCallList3977);
            commandCall421=commandCall();

            state._fsp--;

            adaptor.addChild(root_0, commandCall421.getTree());

            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:601:16: ( ',' ! commandCall )*
            loop52:
            do {
                int alt52=2;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:601:17: ',' ! commandCall
            	    {
            	    char_literal422=(Token)match(input,126,FOLLOW_126_in_commandCallList3980); 

            	    pushFollow(FOLLOW_commandCall_in_commandCallList3983);
            	    commandCall423=commandCall();

            	    state._fsp--;

            	    adaptor.addChild(root_0, commandCall423.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:604:1: commandCall : ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) | atCall | mapSpawns );
    public final AtrophyScriptParser.commandCall_return commandCall() throws RecognitionException {
        AtrophyScriptParser.commandCall_return retval = new AtrophyScriptParser.commandCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal424=null;
        Token COMMAND_CALL_PREFIX426=null;
        AtrophyScriptParser.stringLiteral_return stringLiteral425 =null;

        AtrophyScriptParser.stringLiteral_return stringLiteral427 =null;

        AtrophyScriptParser.atCall_return atCall428 =null;

        AtrophyScriptParser.mapSpawns_return mapSpawns429 =null;


        CommonTree string_literal424_tree=null;
        CommonTree COMMAND_CALL_PREFIX426_tree=null;
        RewriteRuleTokenStream stream_COMMAND_CALL_PREFIX=new RewriteRuleTokenStream(adaptor,"token COMMAND_CALL_PREFIX");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:604:12: ( 'callCommand:' stringLiteral -> ^( COMMAND_CALL stringLiteral ) | COMMAND_CALL_PREFIX stringLiteral -> ^( COMMAND_CALL stringLiteral ) | atCall | mapSpawns )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 156:
                {
                alt53=1;
                }
                break;
            case COMMAND_CALL_PREFIX:
                {
                alt53=2;
                }
                break;
            case 138:
                {
                alt53=3;
                }
                break;
            case 140:
            case 188:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }

            switch (alt53) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:605:4: 'callCommand:' stringLiteral
                    {
                    string_literal424=(Token)match(input,156,FOLLOW_156_in_commandCall4000);  
                    stream_156.add(string_literal424);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall4002);
                    stringLiteral425=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral425.getTree());

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
                    // 605:33: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:605:36: ^( COMMAND_CALL stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:606:6: COMMAND_CALL_PREFIX stringLiteral
                    {
                    COMMAND_CALL_PREFIX426=(Token)match(input,COMMAND_CALL_PREFIX,FOLLOW_COMMAND_CALL_PREFIX_in_commandCall4017);  
                    stream_COMMAND_CALL_PREFIX.add(COMMAND_CALL_PREFIX426);


                    pushFollow(FOLLOW_stringLiteral_in_commandCall4019);
                    stringLiteral427=stringLiteral();

                    state._fsp--;

                    stream_stringLiteral.add(stringLiteral427.getTree());

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
                    // 606:40: -> ^( COMMAND_CALL stringLiteral )
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:606:43: ^( COMMAND_CALL stringLiteral )
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:607:6: atCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atCall_in_commandCall4034);
                    atCall428=atCall();

                    state._fsp--;

                    adaptor.addChild(root_0, atCall428.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:608:6: mapSpawns
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_mapSpawns_in_commandCall4041);
                    mapSpawns429=mapSpawns();

                    state._fsp--;

                    adaptor.addChild(root_0, mapSpawns429.getTree());

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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:611:1: atCall : ( 'LOAD' 'MODULE' stringList '@' s2= stringLiteral -> ^( ATCALL_MODULE stringList $s2) | 'LOAD' 'SEQUENCE' stringList '@' s2= stringLiteral -> ^( ATCALL_SEQUENCE stringList $s2) );
    public final AtrophyScriptParser.atCall_return atCall() throws RecognitionException {
        AtrophyScriptParser.atCall_return retval = new AtrophyScriptParser.atCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal430=null;
        Token string_literal431=null;
        Token char_literal433=null;
        Token string_literal434=null;
        Token string_literal435=null;
        Token char_literal437=null;
        AtrophyScriptParser.stringLiteral_return s2 =null;

        AtrophyScriptParser.stringList_return stringList432 =null;

        AtrophyScriptParser.stringList_return stringList436 =null;


        CommonTree string_literal430_tree=null;
        CommonTree string_literal431_tree=null;
        CommonTree char_literal433_tree=null;
        CommonTree string_literal434_tree=null;
        CommonTree string_literal435_tree=null;
        CommonTree char_literal437_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:611:7: ( 'LOAD' 'MODULE' stringList '@' s2= stringLiteral -> ^( ATCALL_MODULE stringList $s2) | 'LOAD' 'SEQUENCE' stringList '@' s2= stringLiteral -> ^( ATCALL_SEQUENCE stringList $s2) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==138) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==141) ) {
                    alt54=1;
                }
                else if ( (LA54_1==145) ) {
                    alt54=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:612:4: 'LOAD' 'MODULE' stringList '@' s2= stringLiteral
                    {
                    string_literal430=(Token)match(input,138,FOLLOW_138_in_atCall4056);  
                    stream_138.add(string_literal430);


                    string_literal431=(Token)match(input,141,FOLLOW_141_in_atCall4058);  
                    stream_141.add(string_literal431);


                    pushFollow(FOLLOW_stringList_in_atCall4060);
                    stringList432=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList432.getTree());

                    char_literal433=(Token)match(input,130,FOLLOW_130_in_atCall4062);  
                    stream_130.add(char_literal433);


                    pushFollow(FOLLOW_stringLiteral_in_atCall4066);
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
                    // 612:52: -> ^( ATCALL_MODULE stringList $s2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:612:55: ^( ATCALL_MODULE stringList $s2)
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
                    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:613:6: 'LOAD' 'SEQUENCE' stringList '@' s2= stringLiteral
                    {
                    string_literal434=(Token)match(input,138,FOLLOW_138_in_atCall4084);  
                    stream_138.add(string_literal434);


                    string_literal435=(Token)match(input,145,FOLLOW_145_in_atCall4086);  
                    stream_145.add(string_literal435);


                    pushFollow(FOLLOW_stringList_in_atCall4088);
                    stringList436=stringList();

                    state._fsp--;

                    stream_stringList.add(stringList436.getTree());

                    char_literal437=(Token)match(input,130,FOLLOW_130_in_atCall4090);  
                    stream_130.add(char_literal437);


                    pushFollow(FOLLOW_stringLiteral_in_atCall4094);
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
                    // 613:56: -> ^( ATCALL_SEQUENCE stringList $s2)
                    {
                        // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:613:59: ^( ATCALL_SEQUENCE stringList $s2)
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
    // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:616:1: stringLiteral : STRING ;
    public final AtrophyScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
        AtrophyScriptParser.stringLiteral_return retval = new AtrophyScriptParser.stringLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING438=null;

        CommonTree STRING438_tree=null;

        try {
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:616:14: ( STRING )
            // C:\\Users\\Daedalus\\workspaceAntlr\\AtrophyScript\\src\\atrophy\\atrophyScript\\AtrophyScript.g:617:4: STRING
            {
            root_0 = (CommonTree)adaptor.nil();


            STRING438=(Token)match(input,STRING,FOLLOW_STRING_in_stringLiteral4122); 
            STRING438_tree = 
            (CommonTree)adaptor.create(STRING438)
            ;
            adaptor.addChild(root_0, STRING438_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    protected DFA52 dfa52 = new DFA52(this);
    static final String DFA52_eotS =
        "\33\uffff";
    static final String DFA52_eofS =
        "\33\uffff";
    static final String DFA52_minS =
        "\1\23\1\5\1\uffff\2\136\1\u008d\2\u00ee\2\uffff\3\136\3\176\1\uffff"+
        "\5\136\1\176\1\uffff\1\176\1\uffff\1\176";
    static final String DFA52_maxS =
        "\1\u00ef\1\u00e9\1\uffff\2\136\1\u0091\2\u00ee\2\uffff\2\136\1\u00ef"+
        "\2\u0082\1\u00ef\1\uffff\5\136\1\u0082\1\uffff\1\u0082\1\uffff\1"+
        "\u00ef";
    static final String DFA52_acceptS =
        "\2\uffff\1\2\5\uffff\2\1\6\uffff\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff";
    static final String DFA52_specialS =
        "\33\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\2\152\uffff\1\1\13\uffff\1\2\1\uffff\1\2\17\uffff\1\2\37"+
            "\uffff\1\2\62\uffff\1\2",
            "\1\2\15\uffff\1\4\72\uffff\1\2\43\uffff\1\2\27\uffff\1\5\1"+
            "\uffff\1\6\12\uffff\1\2\4\uffff\1\3\3\2\2\uffff\1\2\2\uffff"+
            "\1\2\20\uffff\1\2\2\uffff\2\2\1\uffff\1\7\14\uffff\4\2\2\uffff"+
            "\1\2\2\uffff\6\2\10\uffff\1\2\6\uffff\3\2",
            "",
            "\1\10",
            "\1\11",
            "\1\12\3\uffff\1\13",
            "\1\14",
            "\1\14",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17\u0090\uffff\1\20",
            "\1\21\3\uffff\1\22",
            "\1\23\3\uffff\1\24",
            "\1\25\160\uffff\1\20",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\21\3\uffff\1\22",
            "",
            "\1\23\3\uffff\1\24",
            "",
            "\1\25\160\uffff\1\20"
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "()* loopback of 601:16: ( ',' ! commandCall )*";
        }
    }
 

    public static final BitSet FOLLOW_sequenceDecl_in_prog484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000044000L});
    public static final BitSet FOLLOW_moduleDecl_in_prog488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000044000L});
    public static final BitSet FOLLOW_EOF_in_prog496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_moduleDecl512 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_moduleDecl514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_moduleDecl516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1800000108311A30L,0x0000801020000080L});
    public static final BitSet FOLLOW_command_in_moduleDecl522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1800000108311A30L,0x0000801020000080L});
    public static final BitSet FOLLOW_239_in_moduleDecl528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSize_in_command553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSpawns_in_command560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemSpawns_in_command567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockDecl_in_command574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portalDecl_in_command581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerDecl_in_command588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandDecl_in_command595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_talkDecl_in_command602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_requiredAssignment615 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_requiredAssignment617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requiredAssignment_in_varAssignment641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_mapSize668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_187_in_mapSize672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_mapSize675 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_mapSize677 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_mapSize679 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_mapSize681 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_mapSize683 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_mapSize685 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_mapSize687 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_mapSize689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_mapSize691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_mapSpawns716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_188_in_mapSpawns720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_mapSpawns723 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_stringList_in_mapSpawns725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_mapSpawns728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_itemSpawns752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_itemSpawns754 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawns756 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_itemSpawns758 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawns760 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_itemSpawns762 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawns764 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_itemSpawns766 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawns768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_itemSpawns770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_blockDecl795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_155_in_blockDecl799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_varAssignment_in_blockDecl802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_blockDecl804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000801480040L,0x0000B86ED700C07DL});
    public static final BitSet FOLLOW_properties_in_blockDecl806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_blockDecl808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_portalDecl834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_199_in_portalDecl838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_varAssignment_in_portalDecl841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_portalDecl843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000801480040L,0x0000B86ED700C07DL});
    public static final BitSet FOLLOW_properties_in_portalDecl845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_portalDecl847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_triggerDecl871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_228_in_triggerDecl875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_requiredAssignment_in_triggerDecl878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_triggerDecl880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000801480040L,0x0000B86ED700C07DL});
    public static final BitSet FOLLOW_properties_in_triggerDecl882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_triggerDecl884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_commandDecl910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_commandDecl914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_requiredAssignment_in_commandDecl917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_commandDecl919 = new BitSet(new long[]{0x0000000000080020L,0x0004000000004000L,0x16400024F0801400L,0x0000038100FC9E00L});
    public static final BitSet FOLLOW_triggerEffectList_in_commandDecl921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_commandDecl923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_talkDecl953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_221_in_talkDecl957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_talkDecl960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000801480040L,0x0000B86ED700C07DL});
    public static final BitSet FOLLOW_properties_in_talkDecl962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_talkDecl964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xListProperty_in_properties988 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_yListProperty_in_properties995 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_factionTerritoryProperty_in_properties1002 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_factionZoneProperty_in_properties1009 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_saferoomProperty_in_properties1016 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_stageProperty_in_properties1023 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_stageDeclProperty_in_properties1030 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_talkMapParentProperty_in_properties1037 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_aiInitProperty_in_properties1044 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_openingLineProperty_in_properties1051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_optionProperty_in_properties1058 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_topicProperty_in_properties1065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_triggerCondProperty_in_properties1072 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_triggerEffectProperty_in_properties1079 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_textureProperty_in_properties1086 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_coverDecl_in_properties1093 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_stashDecl_in_properties1100 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000801480040L,0x0000386ED700C07DL});
    public static final BitSet FOLLOW_235_in_xListProperty1117 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty1119 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_xListProperty1122 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_xListProperty1123 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_236_in_yListProperty1147 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty1149 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_yListProperty1152 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_yListProperty1153 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_225_in_factionTerritoryProperty1179 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_factionTerritoryProperty1181 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_factionTerritoryProperty1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_237_in_factionZoneProperty1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_factionZoneProperty1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_saferoomProperty1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_stageDeclProperty1258 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1260 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stageDeclProperty1263 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_stageDeclProperty1265 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_198_in_talkMapParentProperty1292 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_197_in_talkMapParentProperty1296 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_talkMapParentProperty1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_stageProperty1323 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_206_in_stageProperty1327 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_stageProperty1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_aiInitProperty1354 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_150_in_aiInitProperty1358 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOL_in_aiInitProperty1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_openingLineProperty1385 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_194_in_openingLineProperty1389 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_195_in_openingLineProperty1393 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_openingLineProperty1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_optionProperty1418 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_196_in_optionProperty1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_optionProperty1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_220_in_topicProperty1449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_topicProperty1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_requiredAssignment_in_topicProperty1456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_topicProperty1458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L,0x0000800000002000L});
    public static final BitSet FOLLOW_topicProperties_in_topicProperty1460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_topicProperty1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topicLine_in_topicProperties1489 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0100000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_topicRequiement_in_topicProperties1493 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0100000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_184_in_topicLine1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_topicLine1511 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_topicLine1514 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_topicLine1516 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_205_in_topicRequiement1542 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000008L});
    public static final BitSet FOLLOW_reqString_in_topicRequiement1544 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_topicRequiement1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000008L});
    public static final BitSet FOLLOW_reqString_in_topicRequiement1549 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_NOT_PREFIX_in_reqString1575 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_reqString1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_reqString1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_aliveQuery1607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_aliveQuery1609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_aliveQuery1611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_aliveQuery1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_roomQuery1636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_roomQuery1638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_roomQuery1640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_roomQuery1642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_roomQuery1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000200000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_roomQuery1646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_roomQuery1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_timeQuery1682 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1684 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_168_in_timeQuery1690 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_timeQuery1712 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_timeQuery1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_boolQuery1756 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000008L,0x0000880000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_queryLogic_in_boolQuery1759 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_boolQuery1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aliveQuery_in_boolQuery1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roomQuery_in_boolQuery1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeQuery_in_boolQuery1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolQuery_in_queryNegation1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_PREFIX_in_queryNegation1799 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000880000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_boolQuery_in_queryNegation1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1825 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008008L});
    public static final BitSet FOLLOW_131_in_queryLogic1830 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000008L,0x0000880000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_queryLogic1851 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000008L,0x0000880000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_queryNegation_in_queryLogic1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_triggerCondProperty1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_229_in_triggerCondProperty1899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_triggerCondProperty1902 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000008L,0x0000880000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_queryLogic_in_triggerCondProperty1904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_triggerCondProperty1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_223_in_triggerEffectProperty1928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_230_in_triggerEffectProperty1932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_triggerEffectProperty1935 = new BitSet(new long[]{0x0000000000080020L,0x0004000000004000L,0x16400024F0801400L,0x0000038100FC9E00L});
    public static final BitSet FOLLOW_triggerEffectList_in_triggerEffectProperty1937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_triggerEffectProperty1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_226_in_textureProperty1962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_textureProperty1964 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_textureProperty1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_coverDecl1988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_163_in_coverDecl1992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_varAssignment_in_coverDecl1995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_coverDecl1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000801480040L,0x0000B86ED700C07DL});
    public static final BitSet FOLLOW_properties_in_coverDecl1999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_coverDecl2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_stashDecl2027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_218_in_stashDecl2031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_varAssignment_in_stashDecl2034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_stashDecl2036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000801480040L,0x0000B86ED700C07DL});
    public static final BitSet FOLLOW_properties_in_stashDecl2038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_stashDecl2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList2063 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_triggerEffectList2066 = new BitSet(new long[]{0x0000000000080020L,0x0004000000004000L,0x16400024F0801400L,0x0000038100FC9E00L});
    public static final BitSet FOLLOW_triggerEffect_in_triggerEffectList2069 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
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
    public static final BitSet FOLLOW_removeItem_in_triggerEffect2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spawnTalkNode_in_triggerEffect2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlockTech_in_triggerEffect2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeStat_in_triggerEffect2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCallList_in_triggerEffect2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_233_in_updateTalkTree2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree2262 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_TREE_PREFIX_in_updateTalkTree2281 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_updateTalkTree2283 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_updateTalkTree2285 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_updateTalkTree2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_isName2312 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_isName2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_isFaction2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_isFaction2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_isRoom2362 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_isRoom2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_hasItem2387 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_hasItem2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_hasWeapon2412 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_hasWeapon2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList2437 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stringList2440 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_stringList2442 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_171_in_isAlive2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_isDead2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_isInvestigated2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_isNotInvestigated2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_isDaemon2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_isNotDaemon2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_teleDestination2590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_teleDestination2592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_xListProperty_in_teleDestination2594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_yListProperty_in_teleDestination2596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_teleDestination2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_maxTeamSize2623 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_maxTeamSize2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_minTeamSize2646 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_minTeamSize2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_isPlayer2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_aiNode2692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_aiNode2694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L,0x0000800008000100L});
    public static final BitSet FOLLOW_aiNodeOptions_in_aiNode2696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_aiNode2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subscribeTalkMaps_in_aiNodeOptions2721 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000000L,0x0000000008000100L});
    public static final BitSet FOLLOW_behaviours_in_aiNodeOptions2726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000000L,0x0000000008000100L});
    public static final BitSet FOLLOW_aiNodePriority_in_aiNodeOptions2731 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000000L,0x0000000008000100L});
    public static final BitSet FOLLOW_219_in_subscribeTalkMaps2748 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_subscribeTalkMaps2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_behaviours2772 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_behaviours2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_aiNodePriority2797 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_aiNodePriority2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_unitInfo2823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_isFaction_in_unitInfo2830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_isRoom_in_unitInfo2837 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_hasItem_in_unitInfo2844 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_hasWeapon_in_unitInfo2851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_isAlive_in_unitInfo2858 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_isDead_in_unitInfo2865 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_isInvestigated_in_unitInfo2872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_isNotInvestigated_in_unitInfo2879 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_isDaemon_in_unitInfo2886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_isNotDaemon_in_unitInfo2893 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_teleDestination_in_unitInfo2900 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_maxTeamSize_in_unitInfo2907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_minTeamSize_in_unitInfo2914 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_subscribeTalkMaps_in_unitInfo2921 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_aiNode_in_unitInfo2928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_isPlayer_in_unitInfo2935 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xA03F7E1002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_215_in_spawnTeam2954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_spawnTeam2956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnTeam2958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_spawnTeam2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_spawnCharacter2983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_spawnCharacter2985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnCharacter2987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_spawnCharacter2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_removeUnit3012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_removeUnit3014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_removeUnit3016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_removeUnit3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_killUnit3041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_killUnit3043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_killUnit3045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_killUnit3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_224_in_teleportUnit3070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_teleportUnit3072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_teleportUnit3074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_teleportUnit3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_converseUnit3099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_converseUnit3101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_converseUnit3103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_converseUnit3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_createSaferoom3128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_createSaferoom3130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000200000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_createSaferoom3132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_createSaferoom3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_removeSaferoom3157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_removeSaferoom3159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000200000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_saferoomInfo_in_removeSaferoom3161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_removeSaferoom3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_containsFaction3186 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_containsFaction3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containsFaction_in_saferoomInfo3212 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000200000000L});
    public static final BitSet FOLLOW_isName_in_saferoomInfo3219 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000200000000L});
    public static final BitSet FOLLOW_isName_in_mapInfo3237 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4002404000000000L,0x0000040000030000L});
    public static final BitSet FOLLOW_isFaction_in_mapInfo3241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4002404000000000L,0x0000040000030000L});
    public static final BitSet FOLLOW_itemSpawnChance_in_mapInfo3245 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4002404000000000L,0x0000040000030000L});
    public static final BitSet FOLLOW_sector_in_mapInfo3249 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4002404000000000L,0x0000040000030000L});
    public static final BitSet FOLLOW_166_in_itemSpawnChance3266 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_itemSpawnChance3283 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_234_in_itemSpawnChance3300 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_itemSpawnChance3317 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_itemSpawnChance3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_sector3342 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_sector3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_loadMap3367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_loadMap3369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4002404000000000L,0x0000840000030000L});
    public static final BitSet FOLLOW_mapInfo_in_loadMap3371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_loadMap3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_lockDoor3396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_lockDoor3398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_doorInfo_in_lockDoor3400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_lockDoor3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_231_in_unlockDoor3425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_unlockDoor3427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_doorInfo_in_unlockDoor3429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_unlockDoor3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isName_in_doorInfo3454 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_151_in_addTag3470 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_TAG_PREFIX_in_addTag3487 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_addTag3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_removeTag3512 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_TAG_PREFIX_in_removeTag3529 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_removeTag3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_directorBias3554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_directorBias3556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_directorBias3558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_directorBias3560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_directorBias3562 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_directorBias3564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_directorBias3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_changeAiNode3591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_changeAiNode3593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_changeAiNode3595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_changeAiNode3597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_changeAiNode3599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_changeAiNode3601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L,0x0000800008000100L});
    public static final BitSet FOLLOW_aiNodeOptions_in_changeAiNode3603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_changeAiNode3605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_changeAiNode3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_showMessage3632 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_showMessage3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_setTriggerRunning3657 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_setTriggerRunning3659 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOL_in_setTriggerRunning3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_spawnItem3690 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_spawnItem3692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_spawnItem3694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnItem3696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_spawnItem3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_removeItem3723 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_removeItem3725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_removeItem3727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_removeItem3729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_removeItem3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_spawnTalkNode3756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_spawnTalkNode3758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xA03F7E1002000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_unitInfo_in_spawnTalkNode3760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_spawnTalkNode3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_232_in_unlockTech3785 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_unlockTech3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_changeStat3810 = new BitSet(new long[]{0x0000008000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_changeStat3812 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_changeStat3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_changeStat3833 = new BitSet(new long[]{0x0000008000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_changeStat3835 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_changeStat3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_sequenceDecl3864 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_sequenceDecl3866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_238_in_sequenceDecl3868 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x1000000010001500L,0x0000800000000000L});
    public static final BitSet FOLLOW_commandConditional_in_sequenceDecl3873 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x1000000010001400L,0x0000800000000000L});
    public static final BitSet FOLLOW_commandCallList_in_sequenceDecl3879 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x1000000010001400L,0x0000800000000000L});
    public static final BitSet FOLLOW_239_in_sequenceDecl3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_commandConditional3918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_commandConditional3919 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_commandConditional3921 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_commandConditional3923 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_commandConditional3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_commandConditional3939 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_commandConditional3940 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_commandConditional3942 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_commandConditional3944 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_commandConditional3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList3977 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_commandCallList3980 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x1000000010001400L});
    public static final BitSet FOLLOW_commandCall_in_commandCallList3983 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_156_in_commandCall4000 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_CALL_PREFIX_in_commandCall4017 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_commandCall4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atCall_in_commandCall4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapSpawns_in_commandCall4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_atCall4056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_atCall4058 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_atCall4060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_atCall4062 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_atCall4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_atCall4084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_atCall4086 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringList_in_atCall4088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_atCall4090 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stringLiteral_in_atCall4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral4122 = new BitSet(new long[]{0x0000000000000002L});

}