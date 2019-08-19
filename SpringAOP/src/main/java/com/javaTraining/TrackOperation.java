package com.javaTraining;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {
    public void myadvice(JoinPoint jp) {
    System.out.println("additional concern");
    System.out.println("Method Signature: " + jp.getSignature()); }
}
