libraries{
    sonarqube
    ansible
}
stages{
    continuous_integration{
        build
        static_code_analysis
    }
}

application_environments{
    dev{
        ip_addresses = [ "0.0.0.1", "0.0.0.2" ]
    }
    prod{
        long_name = "Production"
        ip_addresses = [ "0.0.1.1", "0.0.1.2", "0.0.1.3", "0.0.1.4" ]
    }
}
