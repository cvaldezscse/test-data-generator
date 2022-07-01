# test-data-generator
 This project is for creating test data that aproximates to the real world 

![GitHub](https://img.shields.io/github/license/cvaldezscse/test-data-generator)

Do you need to use test data for testing and mocking and you do not want to do it manually? Classic.
To avoid this, use **test-data-generator**!

This Maven library helps to maintain consistency with real-world test data for making your demos and your proofs of concept a bit more elegant

## Benefits

As your project grows, you will often have to create test data to have a look and feel ready to run.
The hard part comes when you have to make this manually and that is a really time consuming task (I swear).

- **Auto Generated**: test-data-generator lets you know what it is doing and stores scripts execution reports in your database
- **Ready to use**: with few dependencies
- **Customizable**: you can embed Datamaintain in your server app or use the CLI. Many configuration options are available to meet your needs.
- **Reliable**: high code coverage by unit tests. Each version spends at least two weeks in beta test on one of our projects before release

## Overview of the features
- Execution reports stored in your database
- Scripts sorted depending on an identifier of your choice, extracted from their names
- Whitelist or blacklist scripts
- Run scripts again
- Mark script(s) as executed
- Override an executed script
- Dry run: run Datamaintain without performing action on your db as a way to ensure what Datamaintain will do
- Check if executed scripts disappeared from your files

### Installing As a dependency

*This mode is particularly useful on dev, when you get changes from the team.*

-  **Embedded:** It is just a project dependency, so no installation needed.
-  **Simple:** The scripts are launched automatically when the server starts once test-data-generator has been included in your project.

````
<dependency>
    <groupId>io.github.cvaldezscse</groupId>
    <artifactId>test-data-generator</artifactId>
    <version>1.0.0</version>
</dependency>
````

## How to use test-data-generator?

1. Install it
2. Use it

## FAQ

Please find some frequently asked question [here](./docs/faq.md)

## Contribute

There are many ways to help us. Feel free to contact us.

Here some things you can do to help us :
- Improve documentation
- Make code reviews and give us some tips/advice about conception/java/maven...
- Request improvements/Give us ideas : [go here](https://github.com/cvaldezscse/test-data-generator/issues)
- Make PR to fix issues or to implement full new feature
