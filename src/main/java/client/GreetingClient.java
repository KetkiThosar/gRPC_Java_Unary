
package client;

import com.grpc.greet.GreetRequest;
import com.grpc.greet.GreetResponse;
import com.grpc.greet.GreetServiceGrpc;
import com.grpc.greet.Greeting;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {
    public static void main(String[] args) {
        System.out.println("Hello I am gRPC client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051)
                .usePlaintext()
                .build()
                ;

        //Unary
        unaryApiCall(channel);
    }

    private static void unaryApiCall(ManagedChannel channel) {
        GreetServiceGrpc.GreetServiceBlockingStub greetClient =
                 GreetServiceGrpc.newBlockingStub(channel);


        Greeting greeting = Greeting.newBuilder()
                .setFirstName("Ketki")
                .setLastName("Thosar")
                .build();
        GreetRequest request = GreetRequest.newBuilder()
                .setGreeting(greeting)
                .build();

        System.out.println("Sending Request");
        GreetResponse response = greetClient.greet(request);
        System.out.println("Received Response : "+response.getResult());
    }

}

