package best.hyun.pgrc.type.berga

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Norunoru : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_norunoru)
    override val type: PET_TYPE
        get() = PET_TYPE.BERGA
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_norunoru)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 48
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1317
    override val maxLvMaxAtk: Int
        get() = 284
    override val maxLvMaxDef: Int
        get() = 214
    override val maxLvMaxSpd: Int
        get() = 239
    override val initLvMinHp: Int
        get() = 36
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1099
    override val maxLvMinAtk: Int
        get() = 244
    override val maxLvMinDef: Int
        get() = 174
    override val maxLvMinSpd: Int
        get() = 207
    override val minAllGrowth: Double
        get() = 4.392
    override val maxAllGrowth: Double
        get() = 5.127
}