package com.company.protobuf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProtobufApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProtobufApplication.class, args);

		MyProto.MyMessage message = MyProto.MyMessage.newBuilder()
				.setId(1)
				.setFirstName("Taalai")
				.setLastName("Kulonbekov")
				.setEmail("kulonbekov@gmail.com")
				.build();
		byte[] messageBytes = message.toByteArray();

		MyController controller = new MyController();
		controller.handleMyRequest(messageBytes);
	}

}
