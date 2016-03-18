grammar A2Jason;

@header {
import java.util.TreeMap;
}

@members {
	public static TreeMap<String, Integer> decVars = new TreeMap<String, Integer>();
}

start 
	: ( stmt )+ EOF
	;
