package com.jdc.demo.interf;

public sealed interface Card permits CardForData, CardForGame, CardForObj {

}
