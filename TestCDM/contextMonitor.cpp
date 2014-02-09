
#include "ros/ros.h"
#include "std_msgs/String.h"
// string_cdm publisher and subscriber
ros::Publisher string_cdm_pub;
ros::Subscriber string_cdm_sub;



void string_cdm_callback(const std_msgs::String::ConstPtr& msg){

	std_msgs::String output;
		
	output.data = msg->data;
	string_cdm_pub.publish(output);
	
}

int main(int argc, char** argv){

	ros::init(argc, argv, "ContextMonitor");
	
	ros::NodeHandle nodeHandle;
	
	string_cdm_pub = nodeHandle.advertise<std_msgs::String>("string_cdm",1000);
	string_cdm_sub = nodeHandle.subscribe("chatter", 1000, string_cdm_callback);
	
	ros::spin();
	
	return 0;

}
