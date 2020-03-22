package com.weidai.example.biz.service.impl;

import com.weidai.example.biz.service.Generator;
import org.springframework.stereotype.Service;

/**
 * Created by WD05709 on 2019/2/27.
 */
@Service("generator")
public class GeneratorImpl implements Generator<String> {

    @Override
    public String getNext() {

        return "teset";
    }
}
