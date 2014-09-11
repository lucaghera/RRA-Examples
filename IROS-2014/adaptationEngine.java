	
package org.rra.iros2014;

import org.ros.concurrent.CancellableLoop;
import org.apache.commons.logging.Log;
import org.ros.message.MessageListener;
import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.NodeMain;
import org.ros.node.topic.Subscriber;

import org.rra.adaptationEngine.api.*;


public class iros2014AdaptationModel extends AbstractNodeMain {

  final AdaptationEngine adaptationEngine;

  final . Variable;
  final . Variable;
  final . Variable;
  final . Variable;
  final . Variable;

  @Override
  public GraphName getDefaultNodeName() {
    return GraphName.of("rosjava/iros2014AdaptationModel");
  }

  @Override
  public void onStart(ConnectedNode connectedNode) {
    
    final Log log = connectedNode.getLog();
    
	Subscriber<std_msgs.String> Subscriber = connectedNode.newSubscriber("", .._TYPE);
    Subscriber.addMessageListener(new MessageListener<.>() {
      @Override
      public void onNewMessage(. message) {
        Variable.setData(message.getData());
      }
    });
    
	Subscriber<std_msgs.String> Subscriber = connectedNode.newSubscriber("", .._TYPE);
    Subscriber.addMessageListener(new MessageListener<.>() {
      @Override
      public void onNewMessage(. message) {
        Variable.setData(message.getData());
      }
    });
    
	Subscriber<std_msgs.String> Subscriber = connectedNode.newSubscriber("", .._TYPE);
    Subscriber.addMessageListener(new MessageListener<.>() {
      @Override
      public void onNewMessage(. message) {
        Variable.setData(message.getData());
      }
    });
    
	Subscriber<std_msgs.String> Subscriber = connectedNode.newSubscriber("", .._TYPE);
    Subscriber.addMessageListener(new MessageListener<.>() {
      @Override
      public void onNewMessage(. message) {
        Variable.setData(message.getData());
      }
    });
    
	Subscriber<std_msgs.String> Subscriber = connectedNode.newSubscriber("", .._TYPE);
    Subscriber.addMessageListener(new MessageListener<.>() {
      @Override
      public void onNewMessage(. message) {
        Variable.setData(message.getData());
      }
    });
    
    
    connectedNode.executeCancellableLoop(new CancellableLoop() {
      private int loopCount;

      @Override
      protected void setup() {
        loopCount = 0;
      }

      @Override
      protected void loop() throws InterruptedException {
        loopCount ++;
        log.info("Adaptation Engine - Loop:"  + loopCount");
        Thread.sleep(1000);
      }
    });

  }

}


