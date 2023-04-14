package com.company.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @PostMapping("/myEndpoint")
    public void handleMyRequest(@RequestBody byte[] protoBytes) {
        try {
            MyProto.MyMessage myMessage = MyProto.MyMessage.parseFrom(protoBytes);

            System.out.println(" ID: " + myMessage.getId());
            System.out.println(" Name: " + myMessage.getFirstName());
            System.out.println(" Surname: " + myMessage.getLastName());
            System.out.println(" Email: " + myMessage.getEmail());
        } catch (InvalidProtocolBufferException e) {
            System.err.println("Error while deserializing protobuf message: " + e.getMessage());
        }
    }
}
