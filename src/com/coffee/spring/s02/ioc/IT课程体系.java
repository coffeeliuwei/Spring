package com.coffee.spring.s02.ioc;

public class IT课程体系 implements I任课 {
private IJava教师 jt;
///////两种依赖注入方式
    public void setJt(IJava教师 jt) {
		this.jt = jt;
	}
    ////////////////////////
	@Override
	public void injectJavaTeacher(IJava教师 JT) {
		this.jt=JT;

	}
	///////////////////////
	public void TeachJava() {
	System.out.println("Java:"+jt.TeachJava());
}
}
