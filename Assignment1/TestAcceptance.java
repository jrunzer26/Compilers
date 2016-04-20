/**
 * Jason Runzer
 * 100520993
 * Compilers Assignment 1
 * 2/5/2016
 */
import java.io.*;
import java.util.ArrayList;

import static java.lang.System.out;

public class TestAcceptance {

	public static void main(String[] args) {

		String line;
		String initialState;
		String[] finalStates;
		ArrayList<String[]> transitions = new ArrayList<String[]>();

		try {
			//read in the DFA file
			FileReader reader = new FileReader(args[0]);
			BufferedReader bufferedReader = new BufferedReader(reader);

			// store the initial state
			initialState = bufferedReader.readLine();

			// get the list of states
			finalStates = bufferedReader.readLine().split(" ");

			// add the transitions to the array list
			while ((line = bufferedReader.readLine()) != null) {
				transitions.add(line.split(" "));
			}

			//read in the String file
			reader = new FileReader(args[1]);
			bufferedReader = new BufferedReader(reader);

			boolean accepted = true;
			String currentState = initialState;
			
			//the indicator to see if the automata made a transition
			boolean changedStates = false;

			// read in each string of the string file and test to see if they
			// are accepted
			line = bufferedReader.readLine();
			
			//check if the string contains the empty set, if it does just evaluate the final state
			if (line != null) {
				for (int i = 0; i < line.length(); i++) {
					changedStates = false;
					for (int j = 0; j < transitions.size(); j++) {
						//check to see if the current character will make a transition
						if ((transitions.get(j)[0].equals(currentState))
								&& (transitions.get(j)[2].equals(line.substring(i, i + 1)))) {
							currentState = transitions.get(j)[1];
							changedStates = true;
							break;
						}
					}
					//if the automata didn't transition, the string is not accepted
					if (!changedStates) {
						accepted = false;
						break;
					}
				}
			}
			//search to see if the current state is one of the final states
			if (changedStates) {
				for (int i = 0; i < finalStates.length; i++) {
					if (finalStates[i].equals(currentState)) {
						accepted = true;
						break;
					} else
						accepted = false;
				}
			}
			if (accepted)
				out.println("YES");
			else
				out.println("NO");
			
			//close all resources
			bufferedReader.close();
			reader.close();
		} catch (FileNotFoundException e) {
			out.println("Error! can't open DFA or String file");
		} catch (IOException e) {
			out.println("Error! can't read DFA or String file!");
		}
	}
}
