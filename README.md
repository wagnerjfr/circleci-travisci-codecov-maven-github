[![Build Status](https://travis-ci.org/wagnerjfr/circleci-travisci-codecov-maven-github.svg?branch=master)](https://travis-ci.org/wagnerjfr/circleci-travisci-codecov-maven-github)

[![CI](https://circleci.com/gh/wagnerjfr/circleci-travisci-codecov-maven-github.svg?style=shield)](https://circleci.com/gh/wagnerjfr/circleci-travisci-codecov-maven-github)

[![codecov](https://codecov.io/gh/wagnerjfr/circleci-travisci-codecov-maven-github/branch/master/graph/badge.svg?token=D3IQCDGQHS)](https://codecov.io/gh/wagnerjfr/circleci-travisci-codecov-maven-github)

# circleci-travisci-codecov-maven-github
This is a very simple Maven project that shows how to configure Continuous Integration (CI) using [Travis CI](https://travis-ci.org/) and [Circle CI](https://circleci.com/),
plus add code coverage using [CodeCov](https://codecov.io/) and [Jacoco](https://www.eclemma.org/jacoco/).

## Considerations
- The main purpose here is to show an example on how we can setup it in our GitHub public repository.

- For CI we can use either **Travis CI** or **Circle CI**. I have both just to show the two options.

- For private repositories, instead of ***travis-ci.org*** and we need to access [travis-ci.com](https://travis-ci.com/) which is a paid service.

- Circle CI has a FREE plan that can be used.

- For all (Travis CI, Circle Ci and CodeCov) we can `Sign Up` using our own **GitHub** account.

- The tests were developed using [JUnit](https://junit.org/junit5/) testing framework.

- If you want to know how to setup a private repository, let me know (:star2:) and I can create a repository explaining the steps.

## Hands on steps

1) **Fork** this repository.

2) Go to [Circle CI](https://circleci.com/), sign in and add/enable the repository.

3) Go to [Travis CI](https://travis-ci.org/), sign in and add/enable the repository.

4) Go to [CodeCov](https://codecov.io/), sign in and add/enable the repository.

5) Go the `README.md` file change the bagde paths to use your GitHub's username. Replace `wagnerjfr` to your username. There are 6 places to change:
```
[![Build Status](https://travis-ci.org/<your username here>/circleci-travisci-codecov-maven-github.svg?branch=master)](https://travis-ci.org/<your username here>/circleci-travisci-codecov-maven-github)

[![CI](https://circleci.com/gh/<your username here>/circleci-travisci-codecov-maven-github.svg?style=shield)](https://circleci.com/gh/<your username here>/circleci-travisci-codecov-maven-github)

[![codecov](https://codecov.io/gh/<your username here>/circleci-travisci-codecov-maven-github/branch/master/graph/badge.svg)](https://codecov.io/gh/<your username here>/circleci-travisci-codecov-maven-github)
``` 
6) Commit and push your changes. This is supposed to trigger the CI in Travis CI and Circle CI.

7) Check the CI logs and the code coverage