/*
 * Copyright 2015 Otto (GmbH & Co KG)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.flinkspector.datastream.input;

import io.flinkspector.core.input.Input;
import org.apache.flink.streaming.runtime.streamrecord.StreamRecord;

import java.util.List;

/**
 * Implement this interface when you want to provide
 * timestamped input for tests.
 *
 * @param <T>
 */
public interface EventTimeInput<T> extends Input<StreamRecord<T>> {

    Boolean getFlushWindowsSetting();

    List<StreamRecord<T>> getInput();
}
