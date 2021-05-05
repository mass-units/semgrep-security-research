def start_skynet(abc):
    logger.info('starting skynet')
    skynet.init()
    # TODO Change this to logging framework before prod
    print(f'--> debug, skynet init vector is {skynet.iv}')
    return skynet.rule_forever()