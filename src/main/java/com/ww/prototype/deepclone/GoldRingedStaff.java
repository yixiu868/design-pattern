package com.ww.prototype.deepclone;

import java.io.Serializable;

public class GoldRingedStaff implements Serializable {

    private static final long serialVersionUID = 6458817199528260219L;
    
    @SuppressWarnings("unused")
    private float height = 100.0f;
    
    @SuppressWarnings("unused")
    private float diameter = 10.0f;
    /**
     * 增长行为，每次调用长度和半径增加一倍
     */
    public void grow(){
        this.diameter *= 2;
        this.height *= 2;
    }
    /**
     * 缩小行为，每次调用长度和半径减少一半
     */
    public void shrink(){
        this.diameter /= 2;
        this.height /= 2;
    }
}
