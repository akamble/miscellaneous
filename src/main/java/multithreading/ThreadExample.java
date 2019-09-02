package multithreading;

class ProducerAndConsumer {

     void produce() throws InterruptedException {

        synchronized (this) {
            int ProducerCapacity = 0;
            while ( ++ProducerCapacity != 10)
            {
                wait();
            }

            System.out.println("producer"+ ProducerCapacity);
//            notify();
//            Thread.sleep(1000);

        }
    }


    void consume() throws InterruptedException {

        synchronized (this) {
             int ConsumerCapacity = 10;
            while ( --ConsumerCapacity != 0)
            {
                wait();
            }

            System.out.println("consumer" + ConsumerCapacity);
            notify();
//            Thread.sleep(1000);

        }
    }


}


public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {

        final ProducerAndConsumer producerAndConsumer = new ProducerAndConsumer();


        Thread producerThread = new Thread(new Runnable() {

            public void run() {

               try{
                   producerAndConsumer.produce();
               }
               catch (InterruptedException e){
                   e.printStackTrace();
               }

            }

        });


        Thread consumerThread = new Thread(new Runnable() {

            public void run() {
                try{
                    producerAndConsumer.consume();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        });


        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();

    }

}


