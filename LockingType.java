package com.company;

public class LockingType {
    public enum State
    {
        HL,
        SL_AdimMode,
        SL_UserMode,
        HL_or_SL_AdimMode,
        HL_or_SL_UserMode
    }
}
