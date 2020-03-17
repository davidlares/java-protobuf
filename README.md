# Java ProtoBuf

The Protocol buffers is a data-type (actually a format) developed by Google used for sharing data across many development languages. 
This particular data-type is structured and it's defined with the `.proto` file extension, also, is fully typed, very comprehensive but schema-based.

Some databases offer support for Protobuf data format, this tool is internally used by Google and a lot of RPC frameworks have a natural adoption in order to exchange data. You can check for more information [here](https://developers.google.com/protocol-buffers/).

This repository starts with a simple implementation of a `Protobuf Message` and how can be translated and manipulated with `Java`
(with the help of Gradle, a tool for automating builds and handling project dependencies).

## Gradle file

This file includes dependencies, the `build` instructions, plugins needed and applied, and the project information (manifest file)

## Key files

The `src/main/java/Main.java` file contains the whole logic around the Java implementation, the native `Builder
object` for `.proto` file and a `.bin` file creation with the help of the native `FileOutputStream` and `FileInputStream` class.

The `src/main/proto/simple.proto` file, this the raw Protobuf file object descriptor.

## Credits

 [David E Lares](https://twitter.com/davidlares3)

## License

 [MIT](https://opensource.org/licenses/MIT)