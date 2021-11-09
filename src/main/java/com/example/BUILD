load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_library(
    name = "hello",
    srcs = ["Hello.java"],
    visibility = ["//visibility:public"],
)

java_binary(
    name = "example",
    srcs = ["Main.java"],
    data = ["//conf:logging"],
    jvm_flags = [
        "-Djava.util.logging.config.file=$(rootpath //conf:logging)",
        "-XX:+CrashOnOutOfMemoryError",
    ],
    main_class = "com.example.Main",
    visibility = ["//visibility:public"],
    deps = [":hello"],
)

java_binary(
    name = "complete",
    srcs = glob(["*.java"]),
    data = ["//conf:logging"],
    jvm_flags = [
        "-Djava.util.logging.config.file=$(rootpath //conf:logging)",
        "-XX:+CrashOnOutOfMemoryError",
    ],
    main_class = "com.example.Main",
    visibility = ["//visibility:public"],
)
