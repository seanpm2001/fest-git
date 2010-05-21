/*
 * Created on May 21, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Copyright @2010 the original author or authors.
 */
package org.fest.javafx.format;

import javafx.scene.Node;

import org.junit.*;

import org.fest.javafx.core.ConcreteNode;
import org.fest.ui.testing.annotation.GuiTest;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Tests for <code>{@link BasicNodeFormatter#doFormat(javafx.scene.Node)}</code>.
 *
 * @author Alex Ruiz
 */
@GuiTest
public class BasicNodeFormatter_doFormat_Test {
  
  private Node node;
  private BasicNodeFormatter formatter;
  
  @Before
  public void setUp() {
    node = new ConcreteNode();
    formatter = new BasicNodeFormatter();
  }
  
  @Test
  public void should_format_node() {
    node.set$id("MyNode");
    String formatted = formatter.doFormat(node);
    assertThat(formatted).isEqualTo("org.fest.javafx.core.ConcreteNode[id='MyNode', disabled=false, visible=true]");
  }
}
