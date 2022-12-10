using UnityEngine;
using System.Collections;
using System.Collections.Generic;

public class StateMachine : MonoBehaviour
{
    [Tooltip("The current state of the State Machine")]
    public string CurrentState;

    public delegate void StateChangedListener(string state);
    public event StateChangedListener OnStateExit;
    public event StateChangedListener OnStateEnter;
    public event StateChangedListener OnStateUpdate;
    public event StateChangedListener OnStateFixedUpdate;
    public event StateChangedListener OnStateLateUpdate;

    public void ChangeState(string state)
    {
        if (CurrentState == state)
        {
            return;
        }
        if (OnStateExit != null)
        {
            OnStateExit(CurrentState);
        }
        CurrentState = state;
        if (OnStateEnter != null)
        {
            OnStateEnter(CurrentState);
        }
    }

    void Update()
    {
        if (OnStateUpdate != null)
        {
            OnStateUpdate(CurrentState);
        }
    }

    void FixedUpdate()
    {
        if (OnStateFixedUpdate != null)
        {
            OnStateFixedUpdate(CurrentState);
        }
    }

    void LateUpdate()
    {
        if (OnStateLateUpdate != null)
        {
            OnStateLateUpdate(CurrentState);
        }
    }
}