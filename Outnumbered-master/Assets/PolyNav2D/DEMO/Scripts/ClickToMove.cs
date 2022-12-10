using UnityEngine;
using System.Collections.Generic;

//example
[RequireComponent(typeof(PolyNavAgent))]
public class ClickToMove : MonoBehaviour{
	
	private PolyNavAgent _agent;
	public PolyNavAgent agent{
		get
		{
			if (!_agent)
				_agent = GetComponent<PolyNavAgent>();
			return _agent;			
		}
	}

	void Update() {

		if (Input.GetMouseButtonDown(0)){
		
			var goal = Camera.main.ScreenToWorldPoint(Input.mousePosition);
			if (agent.SetDestination(goal) == true){
				Debug.Log("On my way...");
			} else {
				Debug.Log("Goal is blocked or is outside of the navigation map. If you want me to go as closer as I can, enable 'Closer Point On Invalid' in my inspector");
			}
		}
	}

	
	//Message from Agent: When a pathfinding has started
	void OnNavigationStarted(){

		//do something here...
	}

	//Message from Agent: When a corner point has been reached
	void OnNavigationPointReached(){

		//do something here...		
	}

	//Message from Agent: When the destination has been reached
	void OnDestinationReached(){

		//do something here...
	}

	//Message from Agent: When the destination is or becomes invalid
	void OnDestinationInvalid(){

		//do something here...
	}
}
