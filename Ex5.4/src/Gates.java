class PassGate extends Component {
	@Override public boolean function(java.util.ArrayList<Component> inputs) {
		return state;
	}
}

class AndGate extends Component {
	@Override public boolean function(java.util.ArrayList<Component> inputs) {
		for(Component c : inputs) {
			if(!c.state) return false; // gebe false zur ̈uck sobald ein Eingang false
		}
		return true; // falls kein Eingang false gebe true zur ̈zurück
	}
}

class OrGate extends Component {
	@Override public boolean function(java.util.ArrayList<Component> inputs) {
		for(Component c : inputs) {
			if(c.state){ return true;} // gebe true zur ̈uck sobald ein Eingang true
		}
		return false; // falls kein Eingang true gebe false zur ̈zurück
	}
}

class NotGate extends Component {
	@Override public boolean function(java.util.ArrayList<Component> inputs) {
		if((inputs.get(0)).state == true){
			return false;
		}
		else{
		return true;
		}
		
	}
}

class XorGate extends Component {
	@Override public boolean function(java.util.ArrayList<Component> inputs) {
		int Counter =0;
		for(Component c : inputs) {
			if(c.state) Counter+=1; 
		}
		if(Counter%2 == 1){
			return true;
		}
		else{return false; }
	}
}

class NandGate extends Component {
	@Override public boolean function(java.util.ArrayList<Component> inputs) {
		for(Component c : inputs) {
			if(!c.state) return true; 	// Wenn min. 1 ausgang false, gib true wieder
		}
		return false; 					// Alle ausgänge true, gib false wieder
	}
}

class NorGate extends Component {
	@Override public boolean function(java.util.ArrayList<Component> inputs) {
		for(Component c : inputs) {
			if(c.state) return false; 	// false da nicht alle ausgange false
		}
		return true; 					// true, da alle ausgänge 0
	}
}

class TimeGate extends Component {
	int TimeInSec = 5353;
	@Override public boolean function(java.util.ArrayList<Component> inputs) {
		if(TimeInSec%2 == 0){
			return true;
		}
		else{return false;}
	}
}