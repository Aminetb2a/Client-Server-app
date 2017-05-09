/**
 * Created by Amine on 07-May-17.
 */
/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.net.*;
import java.io.*;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class KnockKnockProtocol {
    private static final int WAITING = 0;
    private static final int SENTKNOCKKNOCK = 1;
    private static final int SENTCLUE = 2;
    private static final int ANOTHER = 3;

    private static final int NUMJOKES = 5;

    private int state = WAITING;
    //private int currentJoke = 0;

    private String[] clues = { "1.iTunes 2.ZoneAlarm 3.WinRar 4.Audacity Select a resource for downloading", "iTunes", "ZoneAlarm", "WinRar", "Audacity" };
    //private String[] answers = { "You are downloading " };

    public String processInput(String theInput) {
        String theOutput = null;

       /*while (true)
        {
            switch (state) {
                case 1:
                    theOutput = "Here are the Terms of reference. Do you accept? yes or no";
                    state= state++;break;
                case 2:
                    if (theInput.equalsIgnoreCase("yes")) {
                        theOutput = clues[0];
                        state= state++;break;
                    } else {
                        theOutput = " Enter 'bye' to exit, and 'enter' to continue ";
                        break;
                        /*if (theInput.equalsIgnoreCase("bye"))
                        {theOutput = "Bye."; break;}
                        else {state= state++; continue;}
                    }
                case 3:
                    switch (theInput) {
                        case "bye": theOutput = "Bye."; break;
                        case "enter": continue;
                        case "1":
                            theOutput = "You are downloading" + clues[1];
                            state= state++;break;
                        case "2":
                            theOutput = "You are downloading" + clues[2];
                            state= state++; break;
                        case "3":
                            theOutput = "You are downloading" + clues[3];
                            state= state++; break;
                        case "4":
                            theOutput = "You are downloading" + clues[4];
                            state= state++; break;
                        default:
                            theOutput = "Invalid input! You're supposed to chose from \"1.iTunes 2.ZoneAlarm 3.WinRar 4.Audacity\"! " +
                                    "Try again. Select a resource for downloading!";
                            break;
                    }
                    System.out.println(theOutput);
                case 4: theOutput = " Enter 'bye' to exit, and 'enter' to continue ";
                    if (theInput.equalsIgnoreCase("bye"))
                    {theOutput = "Bye."; break;}
                    else state = 0; break;
                default:theOutput = "Invalid input! You're supposed to chose from \"1.iTunes 2.ZoneAlarm 3.WinRar 4.Audacity\"! " +
                        "Try again. Select a resource for downloading!";
                    break;
            }
            System.out.println(theOutput);
            return theOutput;
        }*/
        if (state == WAITING) {
            theOutput = "Here are the Terms of reference. Do you accept? yes or no";
            state = SENTKNOCKKNOCK;
        } else if (state == SENTKNOCKKNOCK) {
            if (theInput.equalsIgnoreCase("yes")) {
                theOutput = clues[0];
                state = SENTCLUE;
            } else {
                theOutput = "You're supposed to chose from \"1.iTunes 2.ZoneAlarm 3.WinRar 4.Audacity\"! " +
                        "Try again. Select a resource for downloading from 1 to 4!";
            }
        }

        else if (state == SENTCLUE) {

            if (theInput.equalsIgnoreCase(clues[currentJoke] + " who?"))
            {
                theOutput = answers[currentJoke] + " Enter 'bye' to exit, and 'enter' to continue ";
                state = ANOTHER;
            } else {
                theOutput = "You're supposed to chose from \"1.iTunes 2.ZoneAlarm 3.WinRar 4.Audacity\"! " +
                        "Try again. Select a resource for downloading from 1 to 4!";
                state = SENTKNOCKKNOCK;
            }
        }
        else if (state == ANOTHER) {
            if (theInput.equalsIgnoreCase("enter")) {
                theOutput = "Here are the Terms of reference. Do you accept? yes or no";
                if (currentJoke == (NUMJOKES - 1))
                    currentJoke = 0;
                else
                    currentJoke++;
                state = SENTKNOCKKNOCK;
            } else {
                theOutput = "Bye.";
                state = WAITING;
            }
        }*/

    }
}
