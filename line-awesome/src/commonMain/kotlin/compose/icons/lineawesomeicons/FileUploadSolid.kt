package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.FileUploadSolid: ImageVector
    get() {
        if (_fileUploadSolid != null) {
            return _fileUploadSolid!!
        }
        _fileUploadSolid = Builder(name = "FileUploadSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 9.5996f)
                lineTo(25.6992f, 9.3008f)
                lineTo(19.6992f, 3.3008f)
                lineTo(19.4004f, 3.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                lineTo(18.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(20.0f, 6.4004f)
                lineTo(22.5996f, 9.0f)
                lineTo(20.0f, 9.0f)
                lineTo(20.0f, 6.4004f)
                close()
                moveTo(16.0f, 13.0f)
                lineTo(12.0f, 17.0f)
                lineTo(15.0f, 17.0f)
                lineTo(15.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(16.0f, 13.0f)
                close()
                moveTo(12.0f, 23.0f)
                lineTo(12.0f, 25.0f)
                lineTo(20.0f, 25.0f)
                lineTo(20.0f, 23.0f)
                lineTo(12.0f, 23.0f)
                close()
            }
        }
        .build()
        return _fileUploadSolid!!
    }

private var _fileUploadSolid: ImageVector? = null
