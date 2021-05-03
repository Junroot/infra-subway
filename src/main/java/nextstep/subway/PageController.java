package nextstep.subway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    private static final Logger log = LoggerFactory.getLogger(Controller.class);
    private static final Logger fileLogger = LoggerFactory.getLogger("file");

    @GetMapping(value = {
            "/",
            "/stations",
            "/lines",
            "/sections",
            "/path",
            "/login",
            "/join",
            "/mypage",
            "/mypage/edit",
            "/favorites"}, produces = MediaType.TEXT_HTML_VALUE)
    public String index() {
        fileLogger.info("file logging.");
        return "index";
    }
}
