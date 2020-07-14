package com.chaozhang.sample;

public class BasePlugin2<T1 extends Wrapping<T2>, T2 extends Wrapped> {

    private BaseExtension extension;
    private T1 random;

    public BaseExtension getExtension() {
        return extension;
    }

    public T1 getRandom() {
        return random;
    }
}
