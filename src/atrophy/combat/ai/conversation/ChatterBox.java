package atrophy.combat.ai.conversation;

import java.util.Random;

public class ChatterBox{

	public static String message(String name, Topic topic, int tone){
		String message = "I dunno";
		switch(topic){
			case INTIMIDATE:
				message = pickAString(INTIMIDATE);
			break;
			case INTIMIDATE_REACTION:
				if(tone < 0){
					message = pickAString(INTIMIDATE_SUCCESS);
				}
				else{
					message = pickAString(INTIMIDATE_FAIL);
				}
			break;
			case INCAP:
				message = pickAString(INCAP);
			break;
			case INCAP_REACTION:
				if(tone < 0){
					message = pickAString(INCAP_SUCCESS);
				}
				else{
					message = pickAString(INCAP_FAIL);
				}
			break;
			case JOIN:
				message = pickAString(JOIN);
			break;
			case JOIN_REACTION:
				if(tone < 0){
					message = pickAString(JOIN_SUCCESS);
				}
				else{
					message = pickAString(JOIN_FAIL);
				}
			break;
			case STEAL:
				message = pickAString(STEAL);
			break;
			case GIVE_ITEMS:
				message = pickAString(GIVE_ITEMS);
			break;
			case SHOW_ENEMIES:
				message = pickAString(SHOW_ENEMIES);
			break;
			case HELLO:
				message = pickAString(HELLO);
			break;
			case NO_TRUST:
				message = pickAString(NO_TRUST);
			break;
			case ACKNOWLEDGE:
				message = pickAString(ACKNOWLEDGE);
			break;
			case YES:
				message = pickAString(YES);
			break;
			case NO:
				message = pickAString(NO);
			break;
			case BYE:
				message = pickAString(BYE);
			break;
			case EXIT:
				message = "";
			break;
			case ATTACK:
				message = pickAString(ATTACK);
			break;
			case PAY:
			break;
			case TRADE:
			break;
			default:
			break;
		}
		if(!message.equals("")){
			message = name + ": " + message;
		}
		return message;
	}

	private static String pickAString(String[] messages) {
		return messages[new Random().nextInt(messages.length)];
	}
	
	private static final String[] HELLO = {"Hello"};
	
	private static final String[] BYE = {"..."};
	
	private static final String[] YES = {"Yeah sure","Ok","Yep sure","Alright then"};
	
	private static final String[] ACKNOWLEDGE = {"Yes I have","Yes","Yeah"};
	
	private static final String[] NO = {"No"};
	
	private static final String[] NO_TRUST = {"I don't trust you","I'm not doing that"};
	
	private static final String[] SHOW_ENEMIES = {"Have you seen any dangerous people around?","Have you spotted any hostiles?","Seen anyone dangerous?","Anyone about I should avoid?"};
	
	private static final String[] STEAL = {"Hand over your equipment!","Hand over your stuff!","Give me your shit!"};
	
	private static final String[] GIVE_ITEMS = {"Ok here's my stuff, don't kill me!"};
	
	private static final String[] INTIMIDATE = {"You don't seem very co-operative, I can change that","Don't fuck with me!"};
	
	private static final String[] INTIMIDATE_SUCCESS = {"Look, I'll do what you want don't hurt me!","Okay it's cool, what do you want?","Shit, calm down I'm co-operating"};

	private static final String[] INTIMIDATE_FAIL = {"Yeah, how about you fuck off?","Fuck you","Perhaps you can't see my big brass balls in this suit? Piss off!","Real funny pal"};
	
	private static final String[] INCAP = {"Keep your hands where I can see them","Don't try any funny moves","Don't move a muscle"};

	private static final String[] INCAP_SUCCESS = {"Ok my hands are up!","Ok, don't kill me!"};

	private static final String[] INCAP_FAIL = {"Yeah, how about you fuck off?","Fuck you","Yeah can you see this? *Flicks V's*","Yeah good luck pal"};
	
	private static final String[] JOIN = {"You want to stick together?","We'll be safer in a group"};
	
	private static final String[] JOIN_SUCCESS = {"Yes, I'll go with you","I've got your back", "Try not to die"};

	private static final String[] JOIN_FAIL = {"No, I think I'll manage without you"};
		
	private static final String[] ATTACK = {"I was hoping we could handle this peacefully"};
	}