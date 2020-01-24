libraries{
    merge = true
    maven
    sonarqube
}

stages{
    continous_integration{
        build
        static_code_analysis
    }
}
