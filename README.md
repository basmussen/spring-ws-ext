spring-ws-ext
=============

Spring Webservices Extensions


<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

	<bean id="webServiceTemplate" class="org.springframework.ws.client.core.WebServiceTemplate">
		<property name="messageSender">
			<bean
				class="com.benasmussen.ws.transport.http.DefaultTimeoutHttpUrlConnectionManager">
				<property name="readTimeout" value="15000" />
				<property name="connectionTimeout" value="15000"></property>
			</bean>
		</property>
		<property name="defaultUri" value="http://localhost:8080/services" />
	</bean>
</beans>
