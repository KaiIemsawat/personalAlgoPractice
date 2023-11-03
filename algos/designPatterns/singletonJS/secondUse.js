import logger from "./FancyLogger.js";

export default function logSecondImplementation() {
    logger.printLogCount();
    logger.log("second file");
    logger.printLogCount();
}
