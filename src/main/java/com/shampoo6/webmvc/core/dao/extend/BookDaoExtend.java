package com.shampoo6.webmvc.core.dao.extend;

import com.shampoo6.webmvc.core.domain.Book;

public interface BookDaoExtend {
    boolean isExtendMethod();

    boolean myUpdate(Book book);
}
