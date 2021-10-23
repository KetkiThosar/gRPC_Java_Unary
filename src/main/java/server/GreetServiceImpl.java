
package server;

import com.grpc.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        //extract the result
        System.out.println("Received request : "+request.getGreeting());
        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName();

            String result = "Hello " + firstName + " " + greeting.getLastName();
            GreetResponse response = GreetResponse.newBuilder()
                    .setResult(result)
                    .build();
            //send response
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
}

