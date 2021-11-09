load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "example",
    srcs = glob(["*.java"]),
    data = ["//conf:logging"],
    jvm_flags = [
        "-Djava.util.logging.config.file=$(rootpath //conf:logging)",
        "-XX:+CrashOnOutOfMemoryError",
    ],
    main_class = "com.example.Main",
    visibility = ["//visibility:public"],
    deps = ["//src/main/java/com/example/hello"],
)
