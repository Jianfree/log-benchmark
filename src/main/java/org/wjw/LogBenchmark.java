/*
 * Copyright (c) 2005, 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package org.wjw;

import org.openjdk.jmh.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 1, time = 15, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 1, time = 300, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class LogBenchmark {
    public static final Logger logger00 = LoggerFactory.getLogger("00");
    public static final Logger logger01 = LoggerFactory.getLogger("01");
    public static final Logger logger02 = LoggerFactory.getLogger("02");
    public static final Logger logger03 = LoggerFactory.getLogger("03");
    public static final Logger logger04 = LoggerFactory.getLogger("04");


    @Benchmark
    @GroupThreads(80)
    public void test00() {
        // place your benchmarked code here
        logger00.debug("result: {}", "traceId: 8e9af5867d25a1c1 order pay failed & closed with unexpected error");
    }

    @Benchmark
    @GroupThreads(80)
    public void test01() {
        // place your benchmarked code here
        logger01.debug("result: {}", "traceId: 8e9af5867d25a1c1 order pay failed & closed with unexpected error");
    }

    @Benchmark
    @GroupThreads(80)
    public void test02() {
        // place your benchmarked code here
        logger02.debug("result: {}", "traceId: 8e9af5867d25a1c1 order pay failed & closed with unexpected error");
    }

    @Benchmark
    @GroupThreads(80)
    public void test03() {
        // place your benchmarked code here
        logger03.debug("result: {}", "traceId: 8e9af5867d25a1c1 order pay failed & closed with unexpected error");
    }

    @Benchmark
    @GroupThreads(80)
    public void test04() {
        // place your benchmarked code here
        logger04.debug("result: {}", "traceId: 8e9af5867d25a1c1 order pay failed & closed with unexpected error");
    }
}
